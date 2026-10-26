package d.a.e.e;

import android.content.Context;
import android.os.Build;
import com.facebook.imagepipeline.producers.s;
import com.facebook.imagepipeline.producers.v0;
import com.facebook.imagepipeline.producers.w0;
import d.a.e.c.p;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes.dex */
public class k {
    private static final Class<?> t = k.class;
    private static k u;
    private final v0 a;

    /* renamed from: b, reason: collision with root package name */
    private final i f2536b;

    /* renamed from: c, reason: collision with root package name */
    private final a f2537c;

    /* renamed from: d, reason: collision with root package name */
    private d.a.e.c.h<d.a.a.a.d, d.a.e.j.c> f2538d;
    private d.a.e.c.o<d.a.a.a.d, d.a.e.j.c> e;
    private d.a.e.c.h<d.a.a.a.d, d.a.b.g.g> f;
    private d.a.e.c.o<d.a.a.a.d, d.a.b.g.g> g;
    private d.a.e.c.e h;
    private d.a.a.b.i i;
    private d.a.e.h.c j;
    private h k;
    private d.a.e.n.d l;
    private n m;
    private o n;
    private d.a.e.c.e o;
    private d.a.a.b.i p;
    private d.a.e.b.f q;
    private com.facebook.imagepipeline.platform.d r;
    private d.a.e.a.b.a s;

    public k(i iVar) {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("ImagePipelineConfig()");
        }
        d.a.b.d.i.g(iVar);
        i iVar2 = iVar;
        this.f2536b = iVar2;
        this.a = iVar2.m().n() ? new s(iVar.l().c()) : new w0(iVar.l().c());
        d.a.b.h.a.A(iVar.m().a());
        this.f2537c = new a(iVar.g());
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
    }

    @Nullable
    private d.a.e.a.b.a b() {
        if (this.s == null) {
            this.s = d.a.e.a.b.b.a(n(), this.f2536b.l(), c(), this.f2536b.m().u());
        }
        return this.s;
    }

    private d.a.e.h.c h() {
        d.a.e.h.c cVarC;
        d.a.e.h.c cVarB;
        if (this.j == null) {
            if (this.f2536b.p() != null) {
                this.j = this.f2536b.p();
            } else {
                d.a.e.a.b.a aVarB = b();
                if (aVarB != null) {
                    cVarB = aVarB.b(this.f2536b.b());
                    cVarC = aVarB.c(this.f2536b.b());
                } else {
                    cVarC = null;
                    cVarB = null;
                }
                if (this.f2536b.q() != null) {
                    o();
                    this.f2536b.q().a();
                    throw null;
                }
                this.j = new d.a.e.h.b(cVarB, cVarC, o());
            }
        }
        return this.j;
    }

    private d.a.e.n.d j() {
        if (this.l == null) {
            this.l = (this.f2536b.r() == null && this.f2536b.t() == null && this.f2536b.m().q()) ? new d.a.e.n.h(this.f2536b.m().e()) : new d.a.e.n.f(this.f2536b.m().e(), this.f2536b.m().j(), this.f2536b.r(), this.f2536b.t());
        }
        return this.l;
    }

    public static k k() {
        k kVar = u;
        d.a.b.d.i.h(kVar, "ImagePipelineFactory was not initialized!");
        return kVar;
    }

    private n p() {
        if (this.m == null) {
            this.m = this.f2536b.m().g().a(this.f2536b.h(), this.f2536b.A().k(), h(), this.f2536b.B(), this.f2536b.G(), this.f2536b.H(), this.f2536b.m().m(), this.f2536b.l(), this.f2536b.A().i(this.f2536b.w()), d(), g(), l(), r(), this.f2536b.e(), n(), this.f2536b.m().d(), this.f2536b.m().c(), this.f2536b.m().b(), this.f2536b.m().e(), e(), this.f2536b.m().v());
        }
        return this.m;
    }

    private o q() {
        boolean z = Build.VERSION.SDK_INT >= 24 && this.f2536b.m().i();
        if (this.n == null) {
            this.n = new o(this.f2536b.h().getApplicationContext().getContentResolver(), p(), this.f2536b.z(), this.f2536b.H(), this.f2536b.m().s(), this.a, this.f2536b.G(), z, this.f2536b.m().r(), this.f2536b.F(), j());
        }
        return this.n;
    }

    private d.a.e.c.e r() {
        if (this.o == null) {
            this.o = new d.a.e.c.e(s(), this.f2536b.A().i(this.f2536b.w()), this.f2536b.A().j(), this.f2536b.l().d(), this.f2536b.l().a(), this.f2536b.o());
        }
        return this.o;
    }

    public static synchronized void t(Context context) {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("ImagePipelineFactory#initialize");
        }
        u(i.I(context).G());
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
    }

    public static synchronized void u(i iVar) {
        if (u != null) {
            d.a.b.e.a.u(t, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
        }
        u = new k(iVar);
    }

    @Nullable
    public d.a.e.i.a a(Context context) {
        d.a.e.a.b.a aVarB = b();
        if (aVarB == null) {
            return null;
        }
        return aVarB.a(context);
    }

    public d.a.e.c.h<d.a.a.a.d, d.a.e.j.c> c() {
        if (this.f2538d == null) {
            this.f2538d = d.a.e.c.a.a(this.f2536b.c(), this.f2536b.y(), this.f2536b.d());
        }
        return this.f2538d;
    }

    public d.a.e.c.o<d.a.a.a.d, d.a.e.j.c> d() {
        if (this.e == null) {
            this.e = d.a.e.c.b.a(this.f2536b.a() != null ? this.f2536b.a() : c(), this.f2536b.o());
        }
        return this.e;
    }

    public a e() {
        return this.f2537c;
    }

    public p<d.a.a.a.d, d.a.b.g.g> f() {
        if (this.f == null) {
            this.f = d.a.e.c.l.a(this.f2536b.k(), this.f2536b.y());
        }
        return this.f;
    }

    public d.a.e.c.o<d.a.a.a.d, d.a.b.g.g> g() {
        if (this.g == null) {
            this.g = d.a.e.c.m.a(f(), this.f2536b.o());
        }
        return this.g;
    }

    public h i() {
        if (this.k == null) {
            this.k = new h(q(), this.f2536b.D(), this.f2536b.C(), this.f2536b.u(), d(), g(), l(), r(), this.f2536b.e(), this.a, this.f2536b.m().h(), this.f2536b.m().p(), this.f2536b.f(), this.f2536b);
        }
        return this.k;
    }

    public d.a.e.c.e l() {
        if (this.h == null) {
            this.h = new d.a.e.c.e(m(), this.f2536b.A().i(this.f2536b.w()), this.f2536b.A().j(), this.f2536b.l().d(), this.f2536b.l().a(), this.f2536b.o());
        }
        return this.h;
    }

    public d.a.a.b.i m() {
        if (this.i == null) {
            this.i = this.f2536b.n().a(this.f2536b.v());
        }
        return this.i;
    }

    public d.a.e.b.f n() {
        if (this.q == null) {
            this.q = d.a.e.b.g.a(this.f2536b.A(), o(), e());
        }
        return this.q;
    }

    public com.facebook.imagepipeline.platform.d o() {
        if (this.r == null) {
            this.r = com.facebook.imagepipeline.platform.e.a(this.f2536b.A(), this.f2536b.m().o());
        }
        return this.r;
    }

    public d.a.a.b.i s() {
        if (this.p == null) {
            this.p = this.f2536b.n().a(this.f2536b.E());
        }
        return this.p;
    }
}
