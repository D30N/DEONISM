package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.imagepipeline.producers.x;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class m implements l0<d.a.b.h.a<d.a.e.j.c>> {
    private final d.a.b.g.a a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f1364b;

    /* renamed from: c, reason: collision with root package name */
    private final d.a.e.h.c f1365c;

    /* renamed from: d, reason: collision with root package name */
    private final d.a.e.h.e f1366d;
    private final l0<d.a.e.j.e> e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final d.a.e.e.a j;

    private class a extends c {
        public a(m mVar, k<d.a.b.h.a<d.a.e.j.c>> kVar, m0 m0Var, boolean z, int i) {
            super(kVar, m0Var, z, i);
        }

        @Override // com.facebook.imagepipeline.producers.m.c
        protected synchronized boolean G(d.a.e.j.e eVar, int i) {
            if (com.facebook.imagepipeline.producers.b.f(i)) {
                return false;
            }
            return super.G(eVar, i);
        }

        @Override // com.facebook.imagepipeline.producers.m.c
        protected int x(d.a.e.j.e eVar) {
            return eVar.s();
        }

        @Override // com.facebook.imagepipeline.producers.m.c
        protected d.a.e.j.j y() {
            return d.a.e.j.h.d(0, false, false);
        }
    }

    private class b extends c {
        private final d.a.e.h.f i;
        private final d.a.e.h.e j;
        private int k;

        public b(m mVar, k<d.a.b.h.a<d.a.e.j.c>> kVar, m0 m0Var, d.a.e.h.f fVar, d.a.e.h.e eVar, boolean z, int i) {
            super(kVar, m0Var, z, i);
            d.a.b.d.i.g(fVar);
            this.i = fVar;
            d.a.b.d.i.g(eVar);
            this.j = eVar;
            this.k = 0;
        }

        @Override // com.facebook.imagepipeline.producers.m.c
        protected synchronized boolean G(d.a.e.j.e eVar, int i) {
            boolean zG = super.G(eVar, i);
            if ((com.facebook.imagepipeline.producers.b.f(i) || com.facebook.imagepipeline.producers.b.n(i, 8)) && !com.facebook.imagepipeline.producers.b.n(i, 4) && d.a.e.j.e.x(eVar) && eVar.o() == com.facebook.imageformat.b.a) {
                if (!this.i.g(eVar)) {
                    return false;
                }
                int iD = this.i.d();
                if (iD <= this.k) {
                    return false;
                }
                if (iD < this.j.b(this.k) && !this.i.e()) {
                    return false;
                }
                this.k = iD;
            }
            return zG;
        }

        @Override // com.facebook.imagepipeline.producers.m.c
        protected int x(d.a.e.j.e eVar) {
            return this.i.c();
        }

        @Override // com.facebook.imagepipeline.producers.m.c
        protected d.a.e.j.j y() {
            return this.j.a(this.i.d());
        }
    }

    private abstract class c extends n<d.a.e.j.e, d.a.b.h.a<d.a.e.j.c>> {

        /* renamed from: c, reason: collision with root package name */
        private final m0 f1367c;

        /* renamed from: d, reason: collision with root package name */
        private final o0 f1368d;
        private final d.a.e.d.b e;

        @GuardedBy("this")
        private boolean f;
        private final x g;

        class a implements x.d {
            final /* synthetic */ m0 a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f1369b;

            a(m mVar, m0 m0Var, int i) {
                this.a = m0Var;
                this.f1369b = i;
            }

            @Override // com.facebook.imagepipeline.producers.x.d
            public void a(d.a.e.j.e eVar, int i) {
                if (eVar != null) {
                    if (m.this.f || !com.facebook.imagepipeline.producers.b.n(i, 16)) {
                        d.a.e.l.a aVarC = this.a.c();
                        if (m.this.g || !d.a.b.k.f.l(aVarC.p())) {
                            eVar.H(d.a.e.n.a.b(aVarC.n(), aVarC.l(), eVar, this.f1369b));
                        }
                    }
                    if (this.a.i().m().t()) {
                        c.this.E(eVar);
                    }
                    c.this.v(eVar, i);
                }
            }
        }

        class b extends e {
            final /* synthetic */ boolean a;

            b(m mVar, boolean z) {
                this.a = z;
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.n0
            public void a() {
                if (c.this.f1367c.g()) {
                    c.this.g.h();
                }
            }

            @Override // com.facebook.imagepipeline.producers.n0
            public void b() {
                if (this.a) {
                    c.this.z();
                }
            }
        }

        public c(k<d.a.b.h.a<d.a.e.j.c>> kVar, m0 m0Var, boolean z, int i) {
            super(kVar);
            this.f1367c = m0Var;
            this.f1368d = m0Var.l();
            this.e = m0Var.c().c();
            this.f = false;
            this.g = new x(m.this.f1364b, new a(m.this, m0Var, i), this.e.a);
            this.f1367c.f(new b(m.this, z));
        }

        private void A(Throwable th) {
            D(true);
            p().a(th);
        }

        private void B(d.a.e.j.c cVar, int i) {
            d.a.b.h.a<d.a.e.j.c> aVarB = m.this.j.b(cVar);
            try {
                D(com.facebook.imagepipeline.producers.b.e(i));
                p().d(aVarB, i);
            } finally {
                d.a.b.h.a.o(aVarB);
            }
        }

        private synchronized boolean C() {
            return this.f;
        }

        private void D(boolean z) {
            synchronized (this) {
                if (z) {
                    if (!this.f) {
                        p().c(1.0f);
                        this.f = true;
                        this.g.c();
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E(d.a.e.j.e eVar) {
            if (eVar.o() != com.facebook.imageformat.b.a) {
                return;
            }
            eVar.H(d.a.e.n.a.c(eVar, com.facebook.imageutils.a.c(this.e.f), 104857600));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v(d.a.e.j.e eVar, int i) {
            d.a.e.j.c cVar;
            int i2 = i;
            if ((eVar.o() != com.facebook.imageformat.b.a && com.facebook.imagepipeline.producers.b.f(i)) || C() || !d.a.e.j.e.x(eVar)) {
                return;
            }
            com.facebook.imageformat.c cVarO = eVar.o();
            String str = "unknown";
            String strA = cVarO != null ? cVarO.a() : "unknown";
            String str2 = eVar.t() + "x" + eVar.n();
            String strValueOf = String.valueOf(eVar.r());
            boolean zE = com.facebook.imagepipeline.producers.b.e(i);
            boolean z = zE && !com.facebook.imagepipeline.producers.b.n(i2, 8);
            boolean zN = com.facebook.imagepipeline.producers.b.n(i2, 4);
            d.a.e.d.e eVarL = this.f1367c.c().l();
            if (eVarL != null) {
                str = eVarL.a + "x" + eVarL.f2512b;
            }
            String str3 = str;
            try {
                long jF = this.g.f();
                String strValueOf2 = String.valueOf(this.f1367c.c().p());
                int iS = (z || zN) ? eVar.s() : x(eVar);
                d.a.e.j.j jVarY = (z || zN) ? d.a.e.j.h.f2568d : y();
                this.f1368d.d(this.f1367c, "DecodeProducer");
                try {
                    try {
                        d.a.e.j.c cVarA = m.this.f1365c.a(eVar, iS, jVarY, this.e);
                        try {
                            if (eVar.r() != 1) {
                                i2 |= 16;
                            }
                            this.f1368d.k(this.f1367c, "DecodeProducer", w(cVarA, jF, jVarY, zE, strA, str2, str3, strValueOf));
                            if (cVarA != null) {
                                cVarA.h(new d.a.e.j.i(this.f1367c.c().p(), this.f1367c.j(), this.f1367c.a(), eVar.t(), eVar.n(), eVar.s()));
                            }
                            B(cVarA, i2);
                        } catch (Exception e) {
                            e = e;
                            cVar = cVarA;
                            this.f1368d.h(this.f1367c, "DecodeProducer", e, w(cVar, jF, jVarY, zE, strA, str2, str3, strValueOf));
                            A(e);
                        }
                    } catch (d.a.e.h.a e2) {
                        d.a.e.j.e eVarA = e2.a();
                        d.a.b.e.a.y("ProgressiveDecoder", "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e2.getMessage(), strValueOf2, eVarA.m(10), Integer.valueOf(eVarA.s()));
                        throw e2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    cVar = null;
                }
            } finally {
                d.a.e.j.e.g(eVar);
            }
        }

        @Nullable
        private Map<String, String> w(@Nullable d.a.e.j.c cVar, long j, d.a.e.j.j jVar, boolean z, String str, String str2, String str3, String str4) {
            if (!this.f1368d.i(this.f1367c, "DecodeProducer")) {
                return null;
            }
            String strValueOf = String.valueOf(j);
            String strValueOf2 = String.valueOf(jVar.b());
            String strValueOf3 = String.valueOf(z);
            if (!(cVar instanceof d.a.e.j.d)) {
                HashMap map = new HashMap(7);
                map.put("queueTime", strValueOf);
                map.put("hasGoodQuality", strValueOf2);
                map.put("isFinal", strValueOf3);
                map.put("encodedImageSize", str2);
                map.put("imageFormat", str);
                map.put("requestedImageSize", str3);
                map.put("sampleSize", str4);
                return d.a.b.d.f.b(map);
            }
            Bitmap bitmapO = ((d.a.e.j.d) cVar).o();
            String str5 = bitmapO.getWidth() + "x" + bitmapO.getHeight();
            HashMap map2 = new HashMap(8);
            map2.put("bitmapSize", str5);
            map2.put("queueTime", strValueOf);
            map2.put("hasGoodQuality", strValueOf2);
            map2.put("isFinal", strValueOf3);
            map2.put("encodedImageSize", str2);
            map2.put("imageFormat", str);
            map2.put("requestedImageSize", str3);
            map2.put("sampleSize", str4);
            if (Build.VERSION.SDK_INT >= 12) {
                map2.put("byteCount", bitmapO.getByteCount() + "");
            }
            return d.a.b.d.f.b(map2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z() {
            D(true);
            p().b();
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public void i(d.a.e.j.e eVar, int i) {
            boolean zD;
            try {
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.a("DecodeProducer#onNewResultImpl");
                }
                boolean zE = com.facebook.imagepipeline.producers.b.e(i);
                if (zE) {
                    if (eVar == null) {
                        A(new d.a.b.k.a("Encoded image is null."));
                        if (zD) {
                            return;
                        } else {
                            return;
                        }
                    } else if (!eVar.w()) {
                        A(new d.a.b.k.a("Encoded image is not valid."));
                        if (d.a.e.m.b.d()) {
                            d.a.e.m.b.b();
                            return;
                        }
                        return;
                    }
                }
                if (!G(eVar, i)) {
                    if (d.a.e.m.b.d()) {
                        d.a.e.m.b.b();
                        return;
                    }
                    return;
                }
                boolean zN = com.facebook.imagepipeline.producers.b.n(i, 4);
                if (zE || zN || this.f1367c.g()) {
                    this.g.h();
                }
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.b();
                }
            } finally {
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.b();
                }
            }
        }

        protected boolean G(d.a.e.j.e eVar, int i) {
            return this.g.k(eVar, i);
        }

        @Override // com.facebook.imagepipeline.producers.n, com.facebook.imagepipeline.producers.b
        public void g() {
            z();
        }

        @Override // com.facebook.imagepipeline.producers.n, com.facebook.imagepipeline.producers.b
        public void h(Throwable th) {
            A(th);
        }

        @Override // com.facebook.imagepipeline.producers.n, com.facebook.imagepipeline.producers.b
        protected void j(float f) {
            super.j(f * 0.99f);
        }

        protected abstract int x(d.a.e.j.e eVar);

        protected abstract d.a.e.j.j y();
    }

    public m(d.a.b.g.a aVar, Executor executor, d.a.e.h.c cVar, d.a.e.h.e eVar, boolean z, boolean z2, boolean z3, l0<d.a.e.j.e> l0Var, int i, d.a.e.e.a aVar2) {
        d.a.b.d.i.g(aVar);
        this.a = aVar;
        d.a.b.d.i.g(executor);
        this.f1364b = executor;
        d.a.b.d.i.g(cVar);
        this.f1365c = cVar;
        d.a.b.d.i.g(eVar);
        this.f1366d = eVar;
        this.f = z;
        this.g = z2;
        d.a.b.d.i.g(l0Var);
        this.e = l0Var;
        this.h = z3;
        this.i = i;
        this.j = aVar2;
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<d.a.b.h.a<d.a.e.j.c>> kVar, m0 m0Var) {
        try {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("DecodeProducer#produceResults");
            }
            this.e.a(!d.a.b.k.f.l(m0Var.c().p()) ? new a(this, kVar, m0Var, this.h, this.i) : new b(this, kVar, m0Var, new d.a.e.h.f(this.a), this.f1366d, this.h, this.i), m0Var);
        } finally {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        }
    }
}
