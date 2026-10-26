package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.imagepipeline.producers.h0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class g0 implements l0<d.a.e.j.e> {
    private final d.a.b.g.h a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a.b.g.a f1330b;

    /* renamed from: c, reason: collision with root package name */
    private final h0 f1331c;

    class a implements h0.a {
        final /* synthetic */ t a;

        a(t tVar) {
            this.a = tVar;
        }

        @Override // com.facebook.imagepipeline.producers.h0.a
        public void a(Throwable th) {
            g0.this.k(this.a, th);
        }

        @Override // com.facebook.imagepipeline.producers.h0.a
        public void b() {
            g0.this.j(this.a);
        }

        @Override // com.facebook.imagepipeline.producers.h0.a
        public void c(InputStream inputStream, int i) throws X, IOException {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("NetworkFetcher->onResponse");
            }
            g0.this.l(this.a, inputStream, i);
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        }
    }

    public g0(d.a.b.g.h hVar, d.a.b.g.a aVar, h0 h0Var) {
        this.a = hVar;
        this.f1330b = aVar;
        this.f1331c = h0Var;
    }

    protected static float e(int i, int i2) {
        if (i2 > 0) {
            return i / i2;
        }
        double d2 = -i;
        Double.isNaN(d2);
        return 1.0f - ((float) Math.exp(d2 / 50000.0d));
    }

    @Nullable
    private Map<String, String> f(t tVar, int i) {
        if (tVar.d().i(tVar.b(), "NetworkFetchProducer")) {
            return this.f1331c.e(tVar, i);
        }
        return null;
    }

    protected static void i(d.a.b.g.j jVar, int i, @Nullable d.a.e.d.a aVar, k<d.a.e.j.e> kVar, m0 m0Var) throws Throwable {
        d.a.b.h.a aVarV = d.a.b.h.a.v(jVar.a());
        d.a.e.j.e eVar = null;
        try {
            d.a.e.j.e eVar2 = new d.a.e.j.e((d.a.b.h.a<d.a.b.g.g>) aVarV);
            try {
                eVar2.C(aVar);
                eVar2.y();
                m0Var.k(d.a.e.j.f.NETWORK);
                kVar.d(eVar2, i);
                d.a.e.j.e.g(eVar2);
                d.a.b.h.a.o(aVarV);
            } catch (Throwable th) {
                th = th;
                eVar = eVar2;
                d.a.e.j.e.g(eVar);
                d.a.b.h.a.o(aVarV);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(t tVar) {
        tVar.d().c(tVar.b(), "NetworkFetchProducer", null);
        tVar.a().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(t tVar, Throwable th) {
        tVar.d().h(tVar.b(), "NetworkFetchProducer", th, null);
        tVar.d().b(tVar.b(), "NetworkFetchProducer", false);
        tVar.a().a(th);
    }

    private boolean m(t tVar) {
        if (tVar.b().g()) {
            return this.f1331c.c(tVar);
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<d.a.e.j.e> kVar, m0 m0Var) {
        m0Var.l().d(m0Var, "NetworkFetchProducer");
        t tVarA = this.f1331c.a(kVar, m0Var);
        this.f1331c.d(tVarA, new a(tVarA));
    }

    protected void g(d.a.b.g.j jVar, t tVar) throws Throwable {
        Map<String, String> mapF = f(tVar, jVar.size());
        o0 o0VarD = tVar.d();
        o0VarD.k(tVar.b(), "NetworkFetchProducer", mapF);
        o0VarD.b(tVar.b(), "NetworkFetchProducer", true);
        i(jVar, tVar.e() | 1, tVar.f(), tVar.a(), tVar.b());
    }

    protected void h(d.a.b.g.j jVar, t tVar) throws Throwable {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (!m(tVar) || jUptimeMillis - tVar.c() < 100) {
            return;
        }
        tVar.h(jUptimeMillis);
        tVar.d().e(tVar.b(), "NetworkFetchProducer", "intermediate_result");
        i(jVar, tVar.e(), tVar.f(), tVar.a(), tVar.b());
    }

    protected void l(t tVar, InputStream inputStream, int i) throws X, IOException {
        d.a.b.g.h hVar = this.a;
        d.a.b.g.j jVarE = i > 0 ? hVar.e(i) : hVar.b();
        byte[] bArr = this.f1330b.get(16384);
        while (true) {
            try {
                int i2 = inputStream.read(bArr);
                if (i2 < 0) {
                    this.f1331c.b(tVar, jVarE.size());
                    g(jVarE, tVar);
                    return;
                } else if (i2 > 0) {
                    jVarE.write(bArr, 0, i2);
                    h(jVarE, tVar);
                    tVar.a().c(e(jVarE.size(), i));
                }
            } finally {
                this.f1330b.a(bArr);
                jVarE.close();
            }
        }
    }
}
