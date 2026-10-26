package d.a.e.j;

import android.graphics.Bitmap;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public class d extends b implements d.a.b.h.d {

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    private d.a.b.h.a<Bitmap> f2559b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Bitmap f2560c;

    /* renamed from: d, reason: collision with root package name */
    private final j f2561d;
    private final int e;
    private final int f;

    public d(Bitmap bitmap, d.a.b.h.h<Bitmap> hVar, j jVar, int i) {
        this(bitmap, hVar, jVar, i, 0);
    }

    public d(Bitmap bitmap, d.a.b.h.h<Bitmap> hVar, j jVar, int i, int i2) {
        d.a.b.d.i.g(bitmap);
        this.f2560c = bitmap;
        Bitmap bitmap2 = this.f2560c;
        d.a.b.d.i.g(hVar);
        this.f2559b = d.a.b.h.a.x(bitmap2, hVar);
        this.f2561d = jVar;
        this.e = i;
        this.f = i2;
    }

    public d(d.a.b.h.a<Bitmap> aVar, j jVar, int i) {
        this(aVar, jVar, i, 0);
    }

    public d(d.a.b.h.a<Bitmap> aVar, j jVar, int i, int i2) {
        d.a.b.h.a<Bitmap> aVarJ = aVar.j();
        d.a.b.d.i.g(aVarJ);
        d.a.b.h.a<Bitmap> aVar2 = aVarJ;
        this.f2559b = aVar2;
        this.f2560c = aVar2.r();
        this.f2561d = jVar;
        this.e = i;
        this.f = i2;
    }

    private synchronized d.a.b.h.a<Bitmap> j() {
        d.a.b.h.a<Bitmap> aVar;
        aVar = this.f2559b;
        this.f2559b = null;
        this.f2560c = null;
        return aVar;
    }

    private static int k(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    private static int l(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    @Override // d.a.e.j.c
    public j a() {
        return this.f2561d;
    }

    @Override // d.a.e.j.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d.a.b.h.a<Bitmap> aVarJ = j();
        if (aVarJ != null) {
            aVarJ.close();
        }
    }

    @Override // d.a.e.j.c
    public int f() {
        return com.facebook.imageutils.a.e(this.f2560c);
    }

    @Override // d.a.e.j.g
    public int getHeight() {
        int i;
        return (this.e % 180 != 0 || (i = this.f) == 5 || i == 7) ? l(this.f2560c) : k(this.f2560c);
    }

    @Override // d.a.e.j.g
    public int getWidth() {
        int i;
        return (this.e % 180 != 0 || (i = this.f) == 5 || i == 7) ? k(this.f2560c) : l(this.f2560c);
    }

    @Nullable
    public synchronized d.a.b.h.a<Bitmap> i() {
        return d.a.b.h.a.k(this.f2559b);
    }

    @Override // d.a.e.j.c
    public synchronized boolean isClosed() {
        return this.f2559b == null;
    }

    public int m() {
        return this.f;
    }

    public int n() {
        return this.e;
    }

    public Bitmap o() {
        return this.f2560c;
    }
}
