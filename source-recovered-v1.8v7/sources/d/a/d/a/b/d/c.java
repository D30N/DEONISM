package d.a.d.a.b.d;

import android.graphics.Bitmap;
import d.a.d.a.b.b;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class c implements d.a.d.a.b.b {
    private int a = -1;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private b.a f2420b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    private d.a.b.h.a<Bitmap> f2421c;

    private synchronized void g() {
        if (this.f2420b != null && this.a != -1) {
            this.f2420b.b(this, this.a);
        }
        d.a.b.h.a.o(this.f2421c);
        this.f2421c = null;
        this.a = -1;
    }

    @Override // d.a.d.a.b.b
    @Nullable
    public synchronized d.a.b.h.a<Bitmap> a(int i) {
        if (this.a != i) {
            return null;
        }
        return d.a.b.h.a.k(this.f2421c);
    }

    @Override // d.a.d.a.b.b
    public synchronized d.a.b.h.a<Bitmap> b(int i, int i2, int i3) {
        try {
        } finally {
            g();
        }
        return d.a.b.h.a.k(this.f2421c);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[Catch: all -> 0x0043, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:10:0x001b, B:12:0x0024, B:14:0x0029, B:15:0x0030, B:17:0x003a, B:18:0x003f), top: B:24:0x0003 }] */
    @Override // d.a.d.a.b.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void c(int r2, d.a.b.h.a<android.graphics.Bitmap> r3, int r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r3 == 0) goto L1b
            d.a.b.h.a<android.graphics.Bitmap> r4 = r1.f2421c     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L1b
            java.lang.Object r4 = r3.r()     // Catch: java.lang.Throwable -> L43
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch: java.lang.Throwable -> L43
            d.a.b.h.a<android.graphics.Bitmap> r0 = r1.f2421c     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r0.r()     // Catch: java.lang.Throwable -> L43
            boolean r4 = r4.equals(r0)     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L1b
            monitor-exit(r1)
            return
        L1b:
            d.a.b.h.a<android.graphics.Bitmap> r4 = r1.f2421c     // Catch: java.lang.Throwable -> L43
            d.a.b.h.a.o(r4)     // Catch: java.lang.Throwable -> L43
            d.a.d.a.b.b$a r4 = r1.f2420b     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L30
            int r4 = r1.a     // Catch: java.lang.Throwable -> L43
            r0 = -1
            if (r4 == r0) goto L30
            d.a.d.a.b.b$a r4 = r1.f2420b     // Catch: java.lang.Throwable -> L43
            int r0 = r1.a     // Catch: java.lang.Throwable -> L43
            r4.b(r1, r0)     // Catch: java.lang.Throwable -> L43
        L30:
            d.a.b.h.a r3 = d.a.b.h.a.k(r3)     // Catch: java.lang.Throwable -> L43
            r1.f2421c = r3     // Catch: java.lang.Throwable -> L43
            d.a.d.a.b.b$a r3 = r1.f2420b     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L3f
            d.a.d.a.b.b$a r3 = r1.f2420b     // Catch: java.lang.Throwable -> L43
            r3.a(r1, r2)     // Catch: java.lang.Throwable -> L43
        L3f:
            r1.a = r2     // Catch: java.lang.Throwable -> L43
            monitor-exit(r1)
            return
        L43:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.d.a.b.d.c.c(int, d.a.b.h.a, int):void");
    }

    @Override // d.a.d.a.b.b
    public synchronized void clear() {
        g();
    }

    @Override // d.a.d.a.b.b
    @Nullable
    public synchronized d.a.b.h.a<Bitmap> d(int i) {
        return d.a.b.h.a.k(this.f2421c);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    @Override // d.a.d.a.b.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean e(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.a     // Catch: java.lang.Throwable -> L12
            if (r2 != r0) goto Lf
            d.a.b.h.a<android.graphics.Bitmap> r2 = r1.f2421c     // Catch: java.lang.Throwable -> L12
            boolean r2 = d.a.b.h.a.u(r2)     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            monitor-exit(r1)
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.d.a.b.d.c.e(int):boolean");
    }

    @Override // d.a.d.a.b.b
    public void f(int i, d.a.b.h.a<Bitmap> aVar, int i2) {
    }
}
