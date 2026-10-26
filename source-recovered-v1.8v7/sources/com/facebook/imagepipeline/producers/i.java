package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class i implements l0<d.a.b.h.a<d.a.e.j.c>> {
    private final l0<d.a.b.h.a<d.a.e.j.c>> a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1337b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1338c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1339d;

    private static class a extends n<d.a.b.h.a<d.a.e.j.c>, d.a.b.h.a<d.a.e.j.c>> {

        /* renamed from: c, reason: collision with root package name */
        private final int f1340c;

        /* renamed from: d, reason: collision with root package name */
        private final int f1341d;

        a(k<d.a.b.h.a<d.a.e.j.c>> kVar, int i, int i2) {
            super(kVar);
            this.f1340c = i;
            this.f1341d = i2;
        }

        private void q(d.a.b.h.a<d.a.e.j.c> aVar) {
            d.a.e.j.c cVarR;
            Bitmap bitmapO;
            int rowBytes;
            if (aVar == null || !aVar.t() || (cVarR = aVar.r()) == null || cVarR.isClosed() || !(cVarR instanceof d.a.e.j.d) || (bitmapO = ((d.a.e.j.d) cVarR).o()) == null || (rowBytes = bitmapO.getRowBytes() * bitmapO.getHeight()) < this.f1340c || rowBytes > this.f1341d) {
                return;
            }
            bitmapO.prepareToDraw();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public void i(d.a.b.h.a<d.a.e.j.c> aVar, int i) {
            q(aVar);
            p().d(aVar, i);
        }
    }

    public i(l0<d.a.b.h.a<d.a.e.j.c>> l0Var, int i, int i2, boolean z) {
        d.a.b.d.i.b(i <= i2);
        d.a.b.d.i.g(l0Var);
        this.a = l0Var;
        this.f1337b = i;
        this.f1338c = i2;
        this.f1339d = z;
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<d.a.b.h.a<d.a.e.j.c>> kVar, m0 m0Var) {
        if (!m0Var.d() || this.f1339d) {
            this.a.a(new a(kVar, this.f1337b, this.f1338c), m0Var);
        } else {
            this.a.a(kVar, m0Var);
        }
    }
}
