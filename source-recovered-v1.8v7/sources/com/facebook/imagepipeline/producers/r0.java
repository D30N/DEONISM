package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.x;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class r0 implements l0<d.a.e.j.e> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a.b.g.h f1390b;

    /* renamed from: c, reason: collision with root package name */
    private final l0<d.a.e.j.e> f1391c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1392d;
    private final d.a.e.n.d e;

    private class a extends n<d.a.e.j.e, d.a.e.j.e> {

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1393c;

        /* renamed from: d, reason: collision with root package name */
        private final d.a.e.n.d f1394d;
        private final m0 e;
        private boolean f;
        private final x g;

        /* renamed from: com.facebook.imagepipeline.producers.r0$a$a, reason: collision with other inner class name */
        class C0058a implements x.d {
            C0058a(r0 r0Var) {
            }

            @Override // com.facebook.imagepipeline.producers.x.d
            public void a(d.a.e.j.e eVar, int i) throws X, IOException {
                a aVar = a.this;
                d.a.e.n.c cVarCreateImageTranscoder = aVar.f1394d.createImageTranscoder(eVar.o(), a.this.f1393c);
                d.a.b.d.i.g(cVarCreateImageTranscoder);
                aVar.w(eVar, i, cVarCreateImageTranscoder);
            }
        }

        class b extends e {
            final /* synthetic */ k a;

            b(r0 r0Var, k kVar) {
                this.a = kVar;
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.n0
            public void a() {
                if (a.this.e.g()) {
                    a.this.g.h();
                }
            }

            @Override // com.facebook.imagepipeline.producers.n0
            public void b() {
                a.this.g.c();
                a.this.f = true;
                this.a.b();
            }
        }

        a(k<d.a.e.j.e> kVar, m0 m0Var, boolean z, d.a.e.n.d dVar) {
            super(kVar);
            this.f = false;
            this.e = m0Var;
            Boolean boolM = m0Var.c().m();
            this.f1393c = boolM != null ? boolM.booleanValue() : z;
            this.f1394d = dVar;
            this.g = new x(r0.this.a, new C0058a(r0.this), 100);
            this.e.f(new b(r0.this, kVar));
        }

        @Nullable
        private d.a.e.j.e A(d.a.e.j.e eVar) {
            d.a.e.d.f fVarN = this.e.c().n();
            return (fVarN.f() || !fVarN.e()) ? eVar : y(eVar, fVarN.d());
        }

        @Nullable
        private d.a.e.j.e B(d.a.e.j.e eVar) {
            return (this.e.c().n().c() || eVar.q() == 0 || eVar.q() == -1) ? eVar : y(eVar, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(d.a.e.j.e eVar, int i, d.a.e.n.c cVar) throws X, IOException {
            this.e.l().d(this.e, "ResizeAndRotateProducer");
            d.a.e.l.a aVarC = this.e.c();
            d.a.b.g.j jVarB = r0.this.f1390b.b();
            try {
                d.a.e.n.b bVarB = cVar.b(eVar, jVarB, aVarC.n(), aVarC.l(), null, 85);
                if (bVarB.a() == 2) {
                    throw new RuntimeException("Error while transcoding the image");
                }
                Map<String, String> mapZ = z(eVar, aVarC.l(), bVarB, cVar.c());
                d.a.b.h.a aVarV = d.a.b.h.a.v(jVarB.a());
                try {
                    d.a.e.j.e eVar2 = new d.a.e.j.e((d.a.b.h.a<d.a.b.g.g>) aVarV);
                    eVar2.F(com.facebook.imageformat.b.a);
                    try {
                        eVar2.y();
                        this.e.l().k(this.e, "ResizeAndRotateProducer", mapZ);
                        if (bVarB.a() != 1) {
                            i |= 16;
                        }
                        p().d(eVar2, i);
                    } finally {
                        d.a.e.j.e.g(eVar2);
                    }
                } finally {
                    d.a.b.h.a.o(aVarV);
                }
            } catch (Exception e) {
                this.e.l().h(this.e, "ResizeAndRotateProducer", e, null);
                if (com.facebook.imagepipeline.producers.b.e(i)) {
                    p().a(e);
                }
            } finally {
                jVarB.close();
            }
        }

        private void x(d.a.e.j.e eVar, int i, com.facebook.imageformat.c cVar) {
            p().d((cVar == com.facebook.imageformat.b.a || cVar == com.facebook.imageformat.b.k) ? B(eVar) : A(eVar), i);
        }

        @Nullable
        private d.a.e.j.e y(d.a.e.j.e eVar, int i) {
            d.a.e.j.e eVarF = d.a.e.j.e.f(eVar);
            if (eVarF != null) {
                eVarF.G(i);
            }
            return eVarF;
        }

        @Nullable
        private Map<String, String> z(d.a.e.j.e eVar, @Nullable d.a.e.d.e eVar2, @Nullable d.a.e.n.b bVar, @Nullable String str) {
            String str2;
            if (!this.e.l().i(this.e, "ResizeAndRotateProducer")) {
                return null;
            }
            String str3 = eVar.t() + "x" + eVar.n();
            if (eVar2 != null) {
                str2 = eVar2.a + "x" + eVar2.f2512b;
            } else {
                str2 = "Unspecified";
            }
            HashMap map = new HashMap();
            map.put("Image format", String.valueOf(eVar.o()));
            map.put("Original size", str3);
            map.put("Requested size", str2);
            map.put("queueTime", String.valueOf(this.g.f()));
            map.put("Transcoder id", str);
            map.put("Transcoding result", String.valueOf(bVar));
            return d.a.b.d.f.b(map);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public void i(@Nullable d.a.e.j.e eVar, int i) {
            if (this.f) {
                return;
            }
            boolean zE = com.facebook.imagepipeline.producers.b.e(i);
            if (eVar == null) {
                if (zE) {
                    p().d(null, 1);
                    return;
                }
                return;
            }
            com.facebook.imageformat.c cVarO = eVar.o();
            d.a.e.l.a aVarC = this.e.c();
            d.a.e.n.c cVarCreateImageTranscoder = this.f1394d.createImageTranscoder(cVarO, this.f1393c);
            d.a.b.d.i.g(cVarCreateImageTranscoder);
            d.a.b.k.e eVarH = r0.h(aVarC, eVar, cVarCreateImageTranscoder);
            if (zE || eVarH != d.a.b.k.e.UNSET) {
                if (eVarH != d.a.b.k.e.YES) {
                    x(eVar, i, cVarO);
                } else if (this.g.k(eVar, i)) {
                    if (zE || this.e.g()) {
                        this.g.h();
                    }
                }
            }
        }
    }

    public r0(Executor executor, d.a.b.g.h hVar, l0<d.a.e.j.e> l0Var, boolean z, d.a.e.n.d dVar) {
        d.a.b.d.i.g(executor);
        this.a = executor;
        d.a.b.d.i.g(hVar);
        this.f1390b = hVar;
        d.a.b.d.i.g(l0Var);
        this.f1391c = l0Var;
        d.a.b.d.i.g(dVar);
        this.e = dVar;
        this.f1392d = z;
    }

    private static boolean f(d.a.e.d.f fVar, d.a.e.j.e eVar) {
        return !fVar.c() && (d.a.e.n.e.e(fVar, eVar) != 0 || g(fVar, eVar));
    }

    private static boolean g(d.a.e.d.f fVar, d.a.e.j.e eVar) {
        if (fVar.e() && !fVar.c()) {
            return d.a.e.n.e.a.contains(Integer.valueOf(eVar.l()));
        }
        eVar.D(0);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.b.k.e h(d.a.e.l.a aVar, d.a.e.j.e eVar, d.a.e.n.c cVar) {
        if (eVar == null || eVar.o() == com.facebook.imageformat.c.f1245b) {
            return d.a.b.k.e.UNSET;
        }
        if (cVar.a(eVar.o())) {
            return d.a.b.k.e.f(f(aVar.n(), eVar) || cVar.d(eVar, aVar.n(), aVar.l()));
        }
        return d.a.b.k.e.NO;
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<d.a.e.j.e> kVar, m0 m0Var) {
        this.f1391c.a(new a(kVar, m0Var, this.f1392d, this.e), m0Var);
    }
}
