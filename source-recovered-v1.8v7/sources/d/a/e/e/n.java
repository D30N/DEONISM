package d.a.e.e;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.a0;
import com.facebook.imagepipeline.producers.b1;
import com.facebook.imagepipeline.producers.c0;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.g0;
import com.facebook.imagepipeline.producers.h0;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.j0;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.l0;
import com.facebook.imagepipeline.producers.q;
import com.facebook.imagepipeline.producers.q0;
import com.facebook.imagepipeline.producers.r;
import com.facebook.imagepipeline.producers.r0;
import com.facebook.imagepipeline.producers.u0;
import com.facebook.imagepipeline.producers.v0;
import com.facebook.imagepipeline.producers.x0;
import com.facebook.imagepipeline.producers.y;
import com.facebook.imagepipeline.producers.y0;
import com.facebook.imagepipeline.producers.z;
import com.facebook.imagepipeline.producers.z0;
import d.a.e.c.p;

/* loaded from: classes.dex */
public class n {
    private ContentResolver a;

    /* renamed from: b, reason: collision with root package name */
    private Resources f2544b;

    /* renamed from: c, reason: collision with root package name */
    private AssetManager f2545c;

    /* renamed from: d, reason: collision with root package name */
    private final d.a.b.g.a f2546d;
    private final d.a.e.h.c e;
    private final d.a.e.h.e f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final f j;
    private final d.a.b.g.h k;
    private final d.a.e.c.e l;
    private final d.a.e.c.e m;
    private final p<d.a.a.a.d, d.a.b.g.g> n;
    private final p<d.a.a.a.d, d.a.e.j.c> o;
    private final d.a.e.c.f p;
    private final d.a.e.b.f q;
    private final int r;
    private final int s;
    private boolean t;
    private final a u;
    private final int v;
    private final boolean w;

    public n(Context context, d.a.b.g.a aVar, d.a.e.h.c cVar, d.a.e.h.e eVar, boolean z, boolean z2, boolean z3, f fVar, d.a.b.g.h hVar, p<d.a.a.a.d, d.a.e.j.c> pVar, p<d.a.a.a.d, d.a.b.g.g> pVar2, d.a.e.c.e eVar2, d.a.e.c.e eVar3, d.a.e.c.f fVar2, d.a.e.b.f fVar3, int i, int i2, boolean z4, int i3, a aVar2, boolean z5) {
        this.a = context.getApplicationContext().getContentResolver();
        this.f2544b = context.getApplicationContext().getResources();
        this.f2545c = context.getApplicationContext().getAssets();
        this.f2546d = aVar;
        this.e = cVar;
        this.f = eVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = fVar;
        this.k = hVar;
        this.o = pVar;
        this.n = pVar2;
        this.l = eVar2;
        this.m = eVar3;
        this.p = fVar2;
        this.q = fVar3;
        this.r = i;
        this.s = i2;
        this.t = z4;
        this.v = i3;
        this.u = aVar2;
        this.w = z5;
    }

    public static com.facebook.imagepipeline.producers.a a(l0<d.a.e.j.e> l0Var) {
        return new com.facebook.imagepipeline.producers.a(l0Var);
    }

    public static com.facebook.imagepipeline.producers.j g(l0<d.a.e.j.e> l0Var, l0<d.a.e.j.e> l0Var2) {
        return new com.facebook.imagepipeline.producers.j(l0Var, l0Var2);
    }

    public <T> x0<T> A(l0<T> l0Var) {
        return new x0<>(5, this.j.c(), l0Var);
    }

    public y0 B(z0<d.a.e.j.e>[] z0VarArr) {
        return new y0(z0VarArr);
    }

    public b1 C(l0<d.a.e.j.e> l0Var) {
        return new b1(this.j.f(), this.k, l0Var);
    }

    public <T> u0<T> b(l0<T> l0Var, v0 v0Var) {
        return new u0<>(l0Var, v0Var);
    }

    public com.facebook.imagepipeline.producers.f c(l0<d.a.b.h.a<d.a.e.j.c>> l0Var) {
        return new com.facebook.imagepipeline.producers.f(this.o, this.p, l0Var);
    }

    public com.facebook.imagepipeline.producers.g d(l0<d.a.b.h.a<d.a.e.j.c>> l0Var) {
        return new com.facebook.imagepipeline.producers.g(this.p, l0Var);
    }

    public com.facebook.imagepipeline.producers.h e(l0<d.a.b.h.a<d.a.e.j.c>> l0Var) {
        return new com.facebook.imagepipeline.producers.h(this.o, this.p, l0Var);
    }

    public com.facebook.imagepipeline.producers.i f(l0<d.a.b.h.a<d.a.e.j.c>> l0Var) {
        return new com.facebook.imagepipeline.producers.i(l0Var, this.r, this.s, this.t);
    }

    public com.facebook.imagepipeline.producers.l h() {
        return new com.facebook.imagepipeline.producers.l(this.k);
    }

    public com.facebook.imagepipeline.producers.m i(l0<d.a.e.j.e> l0Var) {
        return new com.facebook.imagepipeline.producers.m(this.f2546d, this.j.b(), this.e, this.f, this.g, this.h, this.i, l0Var, this.v, this.u);
    }

    public com.facebook.imagepipeline.producers.o j(l0<d.a.e.j.e> l0Var) {
        return new com.facebook.imagepipeline.producers.o(this.l, this.m, this.p, l0Var);
    }

    public com.facebook.imagepipeline.producers.p k(l0<d.a.e.j.e> l0Var) {
        return new com.facebook.imagepipeline.producers.p(this.l, this.m, this.p, l0Var);
    }

    public q l(l0<d.a.e.j.e> l0Var) {
        return new q(this.p, this.w, l0Var);
    }

    public r m(l0<d.a.e.j.e> l0Var) {
        return new r(this.n, this.p, l0Var);
    }

    public y n() {
        return new y(this.j.d(), this.k, this.f2545c);
    }

    public z o() {
        return new z(this.j.d(), this.k, this.a);
    }

    public a0 p() {
        return new a0(this.j.d(), this.k, this.a);
    }

    public LocalExifThumbnailProducer q() {
        return new LocalExifThumbnailProducer(this.j.e(), this.k, this.a);
    }

    public c0 r() {
        return new c0(this.j.d(), this.k);
    }

    public d0 s() {
        return new d0(this.j.d(), this.k, this.f2544b);
    }

    public e0 t() {
        return new e0(this.j.d(), this.a);
    }

    public g0 u(h0 h0Var) {
        return new g0(this.k, this.f2546d, h0Var);
    }

    public i0 v(l0<d.a.e.j.e> l0Var) {
        return new i0(this.l, this.p, this.k, this.f2546d, l0Var);
    }

    public j0 w(l0<d.a.b.h.a<d.a.e.j.c>> l0Var) {
        return new j0(this.o, this.p, l0Var);
    }

    public k0 x(l0<d.a.b.h.a<d.a.e.j.c>> l0Var) {
        return new k0(l0Var, this.q, this.j.f());
    }

    public q0 y() {
        return new q0(this.j.d(), this.k, this.a);
    }

    public r0 z(l0<d.a.e.j.e> l0Var, boolean z, d.a.e.n.d dVar) {
        return new r0(this.j.f(), this.k, l0Var, z, dVar);
    }
}
