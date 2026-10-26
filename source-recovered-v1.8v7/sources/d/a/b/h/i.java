package d.a.b.h;

import android.graphics.Bitmap;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class i<T> {

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("itself")
    private static final Map<Object, Integer> f2390d = new IdentityHashMap();

    @GuardedBy("this")
    private T a;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    private int f2391b;

    /* renamed from: c, reason: collision with root package name */
    private final h<T> f2392c;

    public static class a extends RuntimeException {
        public a() {
            super("Null shared reference");
        }
    }

    public i(T t, h<T> hVar) {
        d.a.b.d.i.g(t);
        this.a = t;
        d.a.b.d.i.g(hVar);
        this.f2392c = hVar;
        this.f2391b = 1;
        a(t);
    }

    private static void a(Object obj) {
        if (d.a.b.h.a.B() && ((obj instanceof Bitmap) || (obj instanceof d))) {
            return;
        }
        synchronized (f2390d) {
            Integer num = f2390d.get(obj);
            if (num == null) {
                f2390d.put(obj, 1);
            } else {
                f2390d.put(obj, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    private synchronized int c() {
        int i;
        e();
        d.a.b.d.i.b(this.f2391b > 0);
        i = this.f2391b - 1;
        this.f2391b = i;
        return i;
    }

    private void e() {
        if (!h(this)) {
            throw new a();
        }
    }

    public static boolean h(i<?> iVar) {
        return iVar != null && iVar.g();
    }

    private static void i(Object obj) {
        synchronized (f2390d) {
            Integer num = f2390d.get(obj);
            if (num == null) {
                d.a.b.e.a.B("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
            } else if (num.intValue() == 1) {
                f2390d.remove(obj);
            } else {
                f2390d.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public synchronized void b() {
        e();
        this.f2391b++;
    }

    public void d() {
        T t;
        if (c() == 0) {
            synchronized (this) {
                t = this.a;
                this.a = null;
            }
            this.f2392c.a(t);
            i(t);
        }
    }

    public synchronized T f() {
        return this.a;
    }

    public synchronized boolean g() {
        return this.f2391b > 0;
    }
}
