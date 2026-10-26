package d.a.d.a.b.e;

import android.graphics.Bitmap;
import android.util.SparseArray;
import d.a.e.b.f;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class c implements b {
    private static final Class<?> f = c.class;
    private final f a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a.d.a.b.c f2422b;

    /* renamed from: c, reason: collision with root package name */
    private final Bitmap.Config f2423c;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f2424d;
    private final SparseArray<Runnable> e = new SparseArray<>();

    private class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final d.a.d.a.b.b f2425b;

        /* renamed from: c, reason: collision with root package name */
        private final d.a.d.a.a.a f2426c;

        /* renamed from: d, reason: collision with root package name */
        private final int f2427d;
        private final int e;

        public a(d.a.d.a.a.a aVar, d.a.d.a.b.b bVar, int i, int i2) {
            this.f2426c = aVar;
            this.f2425b = bVar;
            this.f2427d = i;
            this.e = i2;
        }

        private boolean a(int i, int i2) {
            d.a.b.h.a<Bitmap> aVarB;
            int i3 = 2;
            try {
                if (i2 == 1) {
                    aVarB = this.f2425b.b(i, this.f2426c.c(), this.f2426c.d());
                } else {
                    if (i2 != 2) {
                        return false;
                    }
                    aVarB = c.this.a.a(this.f2426c.c(), this.f2426c.d(), c.this.f2423c);
                    i3 = -1;
                }
                boolean zB = b(i, aVarB, i2);
                d.a.b.h.a.o(aVarB);
                return (zB || i3 == -1) ? zB : a(i, i3);
            } catch (RuntimeException e) {
                d.a.b.e.a.v(c.f, "Failed to create frame bitmap", e);
                return false;
            } finally {
                d.a.b.h.a.o(null);
            }
        }

        private boolean b(int i, d.a.b.h.a<Bitmap> aVar, int i2) {
            if (!d.a.b.h.a.u(aVar) || !c.this.f2422b.a(i, aVar.r())) {
                return false;
            }
            d.a.b.e.a.o(c.f, "Frame %d ready.", Integer.valueOf(this.f2427d));
            synchronized (c.this.e) {
                this.f2425b.f(this.f2427d, aVar, i2);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f2425b.e(this.f2427d)) {
                    d.a.b.e.a.o(c.f, "Frame %d is cached already.", Integer.valueOf(this.f2427d));
                    synchronized (c.this.e) {
                        c.this.e.remove(this.e);
                    }
                    return;
                }
                if (a(this.f2427d, 1)) {
                    d.a.b.e.a.o(c.f, "Prepared frame frame %d.", Integer.valueOf(this.f2427d));
                } else {
                    d.a.b.e.a.f(c.f, "Could not prepare frame %d.", Integer.valueOf(this.f2427d));
                }
                synchronized (c.this.e) {
                    c.this.e.remove(this.e);
                }
            } catch (Throwable th) {
                synchronized (c.this.e) {
                    c.this.e.remove(this.e);
                    throw th;
                }
            }
        }
    }

    public c(f fVar, d.a.d.a.b.c cVar, Bitmap.Config config, ExecutorService executorService) {
        this.a = fVar;
        this.f2422b = cVar;
        this.f2423c = config;
        this.f2424d = executorService;
    }

    private static int g(d.a.d.a.a.a aVar, int i) {
        return (aVar.hashCode() * 31) + i;
    }

    @Override // d.a.d.a.b.e.b
    public boolean a(d.a.d.a.b.b bVar, d.a.d.a.a.a aVar, int i) {
        int iG = g(aVar, i);
        synchronized (this.e) {
            if (this.e.get(iG) != null) {
                d.a.b.e.a.o(f, "Already scheduled decode job for frame %d", Integer.valueOf(i));
                return true;
            }
            if (bVar.e(i)) {
                d.a.b.e.a.o(f, "Frame %d is cached already.", Integer.valueOf(i));
                return true;
            }
            a aVar2 = new a(aVar, bVar, i, iG);
            this.e.put(iG, aVar2);
            this.f2424d.execute(aVar2);
            return true;
        }
    }
}
