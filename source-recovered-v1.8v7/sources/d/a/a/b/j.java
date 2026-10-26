package d.a.a.b;

import com.facebook.infer.annotation.ReturnsOwnership;
import d.a.a.a.c;
import java.io.IOException;

/* loaded from: classes.dex */
public class j implements d.a.a.a.b {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f2359b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static j f2360c;

    /* renamed from: d, reason: collision with root package name */
    private static int f2361d;
    private j a;

    private j() {
    }

    @ReturnsOwnership
    public static j a() {
        synchronized (f2359b) {
            if (f2360c == null) {
                return new j();
            }
            j jVar = f2360c;
            f2360c = jVar.a;
            jVar.a = null;
            f2361d--;
            return jVar;
        }
    }

    private void c() {
    }

    public void b() {
        synchronized (f2359b) {
            if (f2361d < 5) {
                c();
                f2361d++;
                if (f2360c != null) {
                    this.a = f2360c;
                }
                f2360c = this;
            }
        }
    }

    public j d(d.a.a.a.d dVar) {
        return this;
    }

    public j e(long j) {
        return this;
    }

    public j f(long j) {
        return this;
    }

    public j g(c.a aVar) {
        return this;
    }

    public j h(IOException iOException) {
        return this;
    }

    public j i(long j) {
        return this;
    }

    public j j(String str) {
        return this;
    }
}
