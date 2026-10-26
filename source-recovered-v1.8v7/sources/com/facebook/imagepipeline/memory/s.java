package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class s implements e {
    protected final c0<Bitmap> a = new f();

    /* renamed from: b, reason: collision with root package name */
    private final int f1288b;

    /* renamed from: c, reason: collision with root package name */
    private int f1289c;

    /* renamed from: d, reason: collision with root package name */
    private final g0 f1290d;
    private int e;

    public s(int i, int i2, g0 g0Var, @Nullable d.a.b.g.c cVar) {
        this.f1288b = i;
        this.f1289c = i2;
        this.f1290d = g0Var;
        if (cVar != null) {
            cVar.a(this);
        }
    }

    private Bitmap b(int i) {
        this.f1290d.b(i);
        return Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
    }

    private synchronized void e(int i) {
        Bitmap bitmapC;
        while (this.e > i && (bitmapC = this.a.c()) != null) {
            int iA = this.a.a(bitmapC);
            this.e -= iA;
            this.f1290d.d(iA);
        }
    }

    @Override // d.a.b.g.e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public synchronized Bitmap get(int i) {
        if (this.e > this.f1288b) {
            e(this.f1288b);
        }
        Bitmap bitmap = this.a.get(i);
        if (bitmap == null) {
            return b(i);
        }
        int iA = this.a.a(bitmap);
        this.e -= iA;
        this.f1290d.c(iA);
        return bitmap;
    }

    @Override // d.a.b.g.e, d.a.b.h.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap bitmap) {
        int iA = this.a.a(bitmap);
        if (iA <= this.f1289c) {
            this.f1290d.a(iA);
            this.a.b(bitmap);
            synchronized (this) {
                this.e += iA;
            }
        }
    }
}
