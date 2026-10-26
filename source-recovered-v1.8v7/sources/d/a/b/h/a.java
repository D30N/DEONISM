package d.a.b.h;

import android.graphics.Bitmap;
import com.facebook.infer.annotation.PropagatesNullable;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public abstract class a<T> implements Cloneable, Closeable {
    private static Class<a> f = a.class;
    private static int g = 0;
    private static final h<Closeable> h = new C0085a();
    private static final c i = new b();

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    protected boolean f2385b = false;

    /* renamed from: c, reason: collision with root package name */
    protected final i<T> f2386c;

    /* renamed from: d, reason: collision with root package name */
    protected final c f2387d;

    @Nullable
    protected final Throwable e;

    /* renamed from: d.a.b.h.a$a, reason: collision with other inner class name */
    static class C0085a implements h<Closeable> {
        C0085a() {
        }

        @Override // d.a.b.h.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Closeable closeable) {
            try {
                d.a.b.d.b.a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    static class b implements c {
        b() {
        }

        @Override // d.a.b.h.a.c
        public boolean a() {
            return false;
        }

        @Override // d.a.b.h.a.c
        public void b(i<Object> iVar, @Nullable Throwable th) {
            d.a.b.e.a.w(a.f, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(iVar)), iVar.f().getClass().getName());
        }
    }

    public interface c {
        boolean a();

        void b(i<Object> iVar, @Nullable Throwable th);
    }

    protected a(i<T> iVar, c cVar, @Nullable Throwable th) {
        d.a.b.d.i.g(iVar);
        this.f2386c = iVar;
        iVar.b();
        this.f2387d = cVar;
        this.e = th;
    }

    protected a(T t, h<T> hVar, c cVar, @Nullable Throwable th) {
        this.f2386c = new i<>(t, hVar);
        this.f2387d = cVar;
        this.e = th;
    }

    public static void A(int i2) {
        g = i2;
    }

    public static boolean B() {
        return g == 3;
    }

    @Nullable
    public static <T> a<T> k(@Nullable a<T> aVar) {
        if (aVar != null) {
            return aVar.j();
        }
        return null;
    }

    public static <T> List<a<T>> n(@PropagatesNullable Collection<a<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<a<T>> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(k(it.next()));
        }
        return arrayList;
    }

    public static void o(@Nullable a<?> aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    public static void q(@Nullable Iterable<? extends a<?>> iterable) {
        if (iterable != null) {
            Iterator<? extends a<?>> it = iterable.iterator();
            while (it.hasNext()) {
                o(it.next());
            }
        }
    }

    public static boolean u(@Nullable a<?> aVar) {
        return aVar != null && aVar.t();
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;)Ld/a/b/h/a<TT;>; */
    public static a v(@PropagatesNullable Closeable closeable) {
        return x(closeable, h);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;Ld/a/b/h/a$c;)Ld/a/b/h/a<TT;>; */
    public static a w(@PropagatesNullable Closeable closeable, c cVar) {
        if (closeable == null) {
            return null;
        }
        return z(closeable, h, cVar, cVar.a() ? new Throwable() : null);
    }

    public static <T> a<T> x(@PropagatesNullable T t, h<T> hVar) {
        return y(t, hVar, i);
    }

    public static <T> a<T> y(@PropagatesNullable T t, h<T> hVar, c cVar) {
        if (t == null) {
            return null;
        }
        return z(t, hVar, cVar, cVar.a() ? new Throwable() : null);
    }

    public static <T> a<T> z(@PropagatesNullable T t, h<T> hVar, c cVar, @Nullable Throwable th) {
        if (t == null) {
            return null;
        }
        if ((t instanceof Bitmap) || (t instanceof d)) {
            int i2 = g;
            if (i2 == 1) {
                return new d.a.b.h.c(t, hVar, cVar, th);
            }
            if (i2 == 2) {
                return new g(t, hVar, cVar, th);
            }
            if (i2 == 3) {
                return new e(t, hVar, cVar, th);
            }
        }
        return new d.a.b.h.b(t, hVar, cVar, th);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.f2385b) {
                return;
            }
            this.f2385b = true;
            this.f2386c.d();
        }
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f2385b) {
                    return;
                }
                this.f2387d.b(this.f2386c, this.e);
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // 
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract a<T> clone();

    @Nullable
    public synchronized a<T> j() {
        if (!t()) {
            return null;
        }
        return clone();
    }

    public synchronized T r() {
        d.a.b.d.i.i(!this.f2385b);
        return this.f2386c.f();
    }

    public int s() {
        if (t()) {
            return System.identityHashCode(this.f2386c.f());
        }
        return 0;
    }

    public synchronized boolean t() {
        return !this.f2385b;
    }
}
