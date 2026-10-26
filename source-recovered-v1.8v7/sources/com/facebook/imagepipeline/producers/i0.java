package com.facebook.imagepipeline.producers;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class i0 implements l0<d.a.e.j.e> {
    private final d.a.e.c.e a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a.e.c.f f1342b;

    /* renamed from: c, reason: collision with root package name */
    private final d.a.b.g.h f1343c;

    /* renamed from: d, reason: collision with root package name */
    private final d.a.b.g.a f1344d;
    private final l0<d.a.e.j.e> e;

    class a implements c.d<d.a.e.j.e, Void> {
        final /* synthetic */ o0 a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f1345b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f1346c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d.a.a.a.d f1347d;

        a(o0 o0Var, m0 m0Var, k kVar, d.a.a.a.d dVar) {
            this.a = o0Var;
            this.f1345b = m0Var;
            this.f1346c = kVar;
            this.f1347d = dVar;
        }

        @Override // c.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(c.f<d.a.e.j.e> fVar) {
            if (i0.g(fVar)) {
                this.a.c(this.f1345b, "PartialDiskCacheProducer", null);
                this.f1346c.b();
            } else if (fVar.n()) {
                this.a.h(this.f1345b, "PartialDiskCacheProducer", fVar.i(), null);
                i0.this.i(this.f1346c, this.f1345b, this.f1347d, null);
            } else {
                d.a.e.j.e eVarJ = fVar.j();
                o0 o0Var = this.a;
                m0 m0Var = this.f1345b;
                if (eVarJ != null) {
                    o0Var.k(m0Var, "PartialDiskCacheProducer", i0.f(o0Var, m0Var, true, eVarJ.s()));
                    d.a.e.d.a aVarC = d.a.e.d.a.c(eVarJ.s() - 1);
                    eVarJ.C(aVarC);
                    int iS = eVarJ.s();
                    d.a.e.l.a aVarC2 = this.f1345b.c();
                    if (aVarC.a(aVarC2.a())) {
                        this.a.b(this.f1345b, "PartialDiskCacheProducer", true);
                        this.f1346c.d(eVarJ, 9);
                    } else {
                        this.f1346c.d(eVarJ, 8);
                        d.a.e.l.b bVarB = d.a.e.l.b.b(aVarC2);
                        bVarB.s(d.a.e.d.a.b(iS - 1));
                        i0.this.i(this.f1346c, new s0(bVarB.a(), this.f1345b), this.f1347d, eVarJ);
                    }
                } else {
                    o0Var.k(m0Var, "PartialDiskCacheProducer", i0.f(o0Var, m0Var, false, 0));
                    i0.this.i(this.f1346c, this.f1345b, this.f1347d, eVarJ);
                }
            }
            return null;
        }
    }

    class b extends e {
        final /* synthetic */ AtomicBoolean a;

        b(i0 i0Var, AtomicBoolean atomicBoolean) {
            this.a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.n0
        public void b() {
            this.a.set(true);
        }
    }

    private static class c extends n<d.a.e.j.e, d.a.e.j.e> {

        /* renamed from: c, reason: collision with root package name */
        private final d.a.e.c.e f1348c;

        /* renamed from: d, reason: collision with root package name */
        private final d.a.a.a.d f1349d;
        private final d.a.b.g.h e;
        private final d.a.b.g.a f;

        @Nullable
        private final d.a.e.j.e g;

        private c(k<d.a.e.j.e> kVar, d.a.e.c.e eVar, d.a.a.a.d dVar, d.a.b.g.h hVar, d.a.b.g.a aVar, @Nullable d.a.e.j.e eVar2) {
            super(kVar);
            this.f1348c = eVar;
            this.f1349d = dVar;
            this.e = hVar;
            this.f = aVar;
            this.g = eVar2;
        }

        /* synthetic */ c(k kVar, d.a.e.c.e eVar, d.a.a.a.d dVar, d.a.b.g.h hVar, d.a.b.g.a aVar, d.a.e.j.e eVar2, a aVar2) {
            this(kVar, eVar, dVar, hVar, aVar, eVar2);
        }

        private void q(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
            byte[] bArr = this.f.get(16384);
            int i2 = i;
            while (i2 > 0) {
                try {
                    int i3 = inputStream.read(bArr, 0, Math.min(16384, i2));
                    if (i3 < 0) {
                        break;
                    } else if (i3 > 0) {
                        outputStream.write(bArr, 0, i3);
                        i2 -= i3;
                    }
                } finally {
                    this.f.a(bArr);
                }
            }
            if (i2 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i), Integer.valueOf(i2)));
            }
        }

        private d.a.b.g.j r(d.a.e.j.e eVar, d.a.e.j.e eVar2) throws IOException {
            d.a.b.g.j jVarE = this.e.e(eVar2.s() + eVar2.j().a);
            q(eVar.p(), jVarE, eVar2.j().a);
            q(eVar2.p(), jVarE, eVar2.s());
            return jVarE;
        }

        private void t(d.a.b.g.j jVar) throws Throwable {
            d.a.e.j.e eVar;
            Throwable th;
            d.a.b.h.a aVarV = d.a.b.h.a.v(jVar.a());
            try {
                eVar = new d.a.e.j.e((d.a.b.h.a<d.a.b.g.g>) aVarV);
                try {
                    eVar.y();
                    p().d(eVar, 1);
                    d.a.e.j.e.g(eVar);
                    d.a.b.h.a.o(aVarV);
                } catch (Throwable th2) {
                    th = th2;
                    d.a.e.j.e.g(eVar);
                    d.a.b.h.a.o(aVarV);
                    throw th;
                }
            } catch (Throwable th3) {
                eVar = null;
                th = th3;
            }
        }

        @Override // com.facebook.imagepipeline.producers.b
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(d.a.e.j.e eVar, int i) {
            if (com.facebook.imagepipeline.producers.b.f(i)) {
                return;
            }
            if (this.g != null) {
                try {
                    if (eVar.j() != null) {
                        try {
                            t(r(this.g, eVar));
                        } catch (IOException e) {
                            d.a.b.e.a.i("PartialDiskCacheProducer", "Error while merging image data", e);
                            p().a(e);
                        }
                        this.f1348c.m(this.f1349d);
                        return;
                    }
                } finally {
                    eVar.close();
                    this.g.close();
                }
            }
            if (com.facebook.imagepipeline.producers.b.n(i, 8) && com.facebook.imagepipeline.producers.b.e(i) && eVar.o() != com.facebook.imageformat.c.f1245b) {
                this.f1348c.k(this.f1349d, eVar);
            }
            p().d(eVar, i);
        }
    }

    public i0(d.a.e.c.e eVar, d.a.e.c.f fVar, d.a.b.g.h hVar, d.a.b.g.a aVar, l0<d.a.e.j.e> l0Var) {
        this.a = eVar;
        this.f1342b = fVar;
        this.f1343c = hVar;
        this.f1344d = aVar;
        this.e = l0Var;
    }

    private static Uri e(d.a.e.l.a aVar) {
        return aVar.p().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    @Nullable
    static Map<String, String> f(o0 o0Var, m0 m0Var, boolean z, int i) {
        if (!o0Var.i(m0Var, "PartialDiskCacheProducer")) {
            return null;
        }
        String strValueOf = String.valueOf(z);
        return z ? d.a.b.d.f.d("cached_value_found", strValueOf, "encodedImageSize", String.valueOf(i)) : d.a.b.d.f.c("cached_value_found", strValueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(c.f<?> fVar) {
        return fVar.l() || (fVar.n() && (fVar.i() instanceof CancellationException));
    }

    private c.d<d.a.e.j.e, Void> h(k<d.a.e.j.e> kVar, m0 m0Var, d.a.a.a.d dVar) {
        return new a(m0Var.l(), m0Var, kVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(k<d.a.e.j.e> kVar, m0 m0Var, d.a.a.a.d dVar, @Nullable d.a.e.j.e eVar) {
        this.e.a(new c(kVar, this.a, dVar, this.f1343c, this.f1344d, eVar, null), m0Var);
    }

    private void j(AtomicBoolean atomicBoolean, m0 m0Var) {
        m0Var.f(new b(this, atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<d.a.e.j.e> kVar, m0 m0Var) {
        d.a.e.l.a aVarC = m0Var.c();
        if (!aVarC.s()) {
            this.e.a(kVar, m0Var);
            return;
        }
        m0Var.l().d(m0Var, "PartialDiskCacheProducer");
        d.a.a.a.d dVarD = this.f1342b.d(aVarC, e(aVarC), m0Var.a());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.a.i(dVarD, atomicBoolean).e(h(kVar, m0Var, dVarD));
        j(atomicBoolean, m0Var);
    }
}
