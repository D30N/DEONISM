package com.facebook.drawee.d;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.drawee.c.a;
import com.facebook.drawee.c.d;
import com.facebook.drawee.h.a;
import com.facebook.infer.annotation.ReturnsOwnership;
import d.a.b.d.h;
import d.a.b.d.i;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes.dex */
public abstract class a<T, INFO> implements com.facebook.drawee.i.a, a.InterfaceC0049a, a.InterfaceC0052a {
    private static final Class<?> t = a.class;

    /* renamed from: b, reason: collision with root package name */
    private final com.facebook.drawee.c.a f1168b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f1169c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private com.facebook.drawee.c.e f1170d;

    @Nullable
    private com.facebook.drawee.h.a e;

    @Nullable
    protected d<INFO> f;

    @Nullable
    private com.facebook.drawee.i.c g;

    @Nullable
    private Drawable h;
    private String i;
    private Object j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;

    @Nullable
    private String o;

    @Nullable
    private com.facebook.datasource.c<T> p;

    @Nullable
    private T q;

    @Nullable
    private Drawable r;
    private final com.facebook.drawee.c.d a = com.facebook.drawee.c.d.a();
    private boolean s = true;

    /* renamed from: com.facebook.drawee.d.a$a, reason: collision with other inner class name */
    class C0050a extends com.facebook.datasource.b<T> {
        final /* synthetic */ String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f1171b;

        C0050a(String str, boolean z) {
            this.a = str;
            this.f1171b = z;
        }

        @Override // com.facebook.datasource.e
        public void d(com.facebook.datasource.c<T> cVar) {
            boolean zD = cVar.d();
            a.this.E(this.a, cVar, cVar.g(), zD);
        }

        @Override // com.facebook.datasource.b
        public void e(com.facebook.datasource.c<T> cVar) {
            a.this.B(this.a, cVar, cVar.f(), true);
        }

        @Override // com.facebook.datasource.b
        public void f(com.facebook.datasource.c<T> cVar) {
            boolean zD = cVar.d();
            boolean zA = cVar.a();
            float fG = cVar.g();
            T tB = cVar.b();
            if (tB != null) {
                a.this.D(this.a, cVar, tB, fG, zD, this.f1171b, zA);
            } else if (zD) {
                a.this.B(this.a, cVar, new NullPointerException(), true);
            }
        }
    }

    private static class b<INFO> extends f<INFO> {
        private b() {
        }

        public static <INFO> b<INFO> k(d<? super INFO> dVar, d<? super INFO> dVar2) {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("AbstractDraweeController#createInternal");
            }
            b<INFO> bVar = new b<>();
            bVar.g(dVar);
            bVar.g(dVar2);
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
            return bVar;
        }
    }

    public a(com.facebook.drawee.c.a aVar, Executor executor, String str, Object obj) {
        this.f1168b = aVar;
        this.f1169c = executor;
        w(str, obj);
    }

    private void A(String str, T t2) {
        if (d.a.b.e.a.m(2)) {
            d.a.b.e.a.s(t, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.i, str, s(t2), Integer.valueOf(t(t2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(String str, com.facebook.datasource.c<T> cVar, Throwable th, boolean z) {
        Drawable drawable;
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("AbstractDraweeController#onFailureInternal");
        }
        if (!y(str, cVar)) {
            z("ignore_old_datasource @ onFailure", th);
            cVar.close();
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
                return;
            }
            return;
        }
        this.a.b(z ? d.a.ON_DATASOURCE_FAILURE : d.a.ON_DATASOURCE_FAILURE_INT);
        if (z) {
            z("final_failed @ onFailure", th);
            this.p = null;
            this.m = true;
            if (this.n && (drawable = this.r) != null) {
                this.g.d(drawable, 1.0f, true);
            } else if (P()) {
                this.g.e(th);
            } else {
                this.g.f(th);
            }
            n().f(this.i, th);
        } else {
            z("intermediate_failed @ onFailure", th);
            n().e(this.i, th);
        }
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D(java.lang.String r5, com.facebook.datasource.c<T> r6, @javax.annotation.Nullable T r7, float r8, boolean r9, boolean r10, boolean r11) {
        /*
            r4 = this;
            boolean r0 = d.a.e.m.b.d()     // Catch: java.lang.Throwable -> Ld4
            if (r0 == 0) goto Lb
            java.lang.String r0 = "AbstractDraweeController#onNewResultInternal"
            d.a.e.m.b.a(r0)     // Catch: java.lang.Throwable -> Ld4
        Lb:
            boolean r0 = r4.y(r5, r6)     // Catch: java.lang.Throwable -> Ld4
            if (r0 != 0) goto L26
            java.lang.String r5 = "ignore_old_datasource @ onNewResult"
            r4.A(r5, r7)     // Catch: java.lang.Throwable -> Ld4
            r4.H(r7)     // Catch: java.lang.Throwable -> Ld4
            r6.close()     // Catch: java.lang.Throwable -> Ld4
            boolean r5 = d.a.e.m.b.d()
            if (r5 == 0) goto L25
            d.a.e.m.b.b()
        L25:
            return
        L26:
            com.facebook.drawee.c.d r0 = r4.a     // Catch: java.lang.Throwable -> Ld4
            if (r9 == 0) goto L2d
            com.facebook.drawee.c.d$a r1 = com.facebook.drawee.c.d.a.ON_DATASOURCE_RESULT     // Catch: java.lang.Throwable -> Ld4
            goto L2f
        L2d:
            com.facebook.drawee.c.d$a r1 = com.facebook.drawee.c.d.a.ON_DATASOURCE_RESULT_INT     // Catch: java.lang.Throwable -> Ld4
        L2f:
            r0.b(r1)     // Catch: java.lang.Throwable -> Ld4
            android.graphics.drawable.Drawable r6 = r4.k(r7)     // Catch: java.lang.Exception -> Lbe java.lang.Throwable -> Ld4
            T r0 = r4.q     // Catch: java.lang.Throwable -> Ld4
            android.graphics.drawable.Drawable r1 = r4.r     // Catch: java.lang.Throwable -> Ld4
            r4.q = r7     // Catch: java.lang.Throwable -> Ld4
            r4.r = r6     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = "release_previous_result @ onNewResult"
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L63
            java.lang.String r8 = "set_final_result @ onNewResult"
            r4.A(r8, r7)     // Catch: java.lang.Throwable -> L61
            r8 = 0
            r4.p = r8     // Catch: java.lang.Throwable -> L61
            com.facebook.drawee.i.c r8 = r4.g     // Catch: java.lang.Throwable -> L61
            r8.d(r6, r3, r10)     // Catch: java.lang.Throwable -> L61
            com.facebook.drawee.d.d r8 = r4.n()     // Catch: java.lang.Throwable -> L61
            java.lang.Object r9 = r4.u(r7)     // Catch: java.lang.Throwable -> L61
            android.graphics.drawable.Animatable r10 = r4.l()     // Catch: java.lang.Throwable -> L61
        L5d:
            r8.c(r5, r9, r10)     // Catch: java.lang.Throwable -> L61
            goto L91
        L61:
            r5 = move-exception
            goto Lac
        L63:
            if (r11 == 0) goto L7c
            java.lang.String r8 = "set_temporary_result @ onNewResult"
            r4.A(r8, r7)     // Catch: java.lang.Throwable -> L61
            com.facebook.drawee.i.c r8 = r4.g     // Catch: java.lang.Throwable -> L61
            r8.d(r6, r3, r10)     // Catch: java.lang.Throwable -> L61
            com.facebook.drawee.d.d r8 = r4.n()     // Catch: java.lang.Throwable -> L61
            java.lang.Object r9 = r4.u(r7)     // Catch: java.lang.Throwable -> L61
            android.graphics.drawable.Animatable r10 = r4.l()     // Catch: java.lang.Throwable -> L61
            goto L5d
        L7c:
            java.lang.String r9 = "set_intermediate_result @ onNewResult"
            r4.A(r9, r7)     // Catch: java.lang.Throwable -> L61
            com.facebook.drawee.i.c r9 = r4.g     // Catch: java.lang.Throwable -> L61
            r9.d(r6, r8, r10)     // Catch: java.lang.Throwable -> L61
            com.facebook.drawee.d.d r8 = r4.n()     // Catch: java.lang.Throwable -> L61
            java.lang.Object r9 = r4.u(r7)     // Catch: java.lang.Throwable -> L61
            r8.d(r5, r9)     // Catch: java.lang.Throwable -> L61
        L91:
            if (r1 == 0) goto L98
            if (r1 == r6) goto L98
            r4.F(r1)     // Catch: java.lang.Throwable -> Ld4
        L98:
            if (r0 == 0) goto La2
            if (r0 == r7) goto La2
            r4.A(r2, r0)     // Catch: java.lang.Throwable -> Ld4
            r4.H(r0)     // Catch: java.lang.Throwable -> Ld4
        La2:
            boolean r5 = d.a.e.m.b.d()
            if (r5 == 0) goto Lab
            d.a.e.m.b.b()
        Lab:
            return
        Lac:
            if (r1 == 0) goto Lb3
            if (r1 == r6) goto Lb3
            r4.F(r1)     // Catch: java.lang.Throwable -> Ld4
        Lb3:
            if (r0 == 0) goto Lbd
            if (r0 == r7) goto Lbd
            r4.A(r2, r0)     // Catch: java.lang.Throwable -> Ld4
            r4.H(r0)     // Catch: java.lang.Throwable -> Ld4
        Lbd:
            throw r5     // Catch: java.lang.Throwable -> Ld4
        Lbe:
            r8 = move-exception
            java.lang.String r10 = "drawable_failed @ onNewResult"
            r4.A(r10, r7)     // Catch: java.lang.Throwable -> Ld4
            r4.H(r7)     // Catch: java.lang.Throwable -> Ld4
            r4.B(r5, r6, r8, r9)     // Catch: java.lang.Throwable -> Ld4
            boolean r5 = d.a.e.m.b.d()
            if (r5 == 0) goto Ld3
            d.a.e.m.b.b()
        Ld3:
            return
        Ld4:
            r5 = move-exception
            boolean r6 = d.a.e.m.b.d()
            if (r6 == 0) goto Lde
            d.a.e.m.b.b()
        Lde:
            goto Le0
        Ldf:
            throw r5
        Le0:
            goto Ldf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.d.a.D(java.lang.String, com.facebook.datasource.c, java.lang.Object, float, boolean, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(String str, com.facebook.datasource.c<T> cVar, float f, boolean z) {
        if (!y(str, cVar)) {
            z("ignore_old_datasource @ onProgress", null);
            cVar.close();
        } else {
            if (z) {
                return;
            }
            this.g.a(f, false);
        }
    }

    private void G() {
        boolean z = this.l;
        this.l = false;
        this.m = false;
        com.facebook.datasource.c<T> cVar = this.p;
        if (cVar != null) {
            cVar.close();
            this.p = null;
        }
        Drawable drawable = this.r;
        if (drawable != null) {
            F(drawable);
        }
        if (this.o != null) {
            this.o = null;
        }
        this.r = null;
        T t2 = this.q;
        if (t2 != null) {
            A("release", t2);
            H(this.q);
            this.q = null;
        }
        if (z) {
            n().a(this.i);
        }
    }

    private boolean P() {
        com.facebook.drawee.c.e eVar;
        return this.m && (eVar = this.f1170d) != null && eVar.e();
    }

    private synchronized void w(String str, Object obj) {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("AbstractDraweeController#init");
        }
        this.a.b(d.a.ON_INIT_CONTROLLER);
        if (!this.s && this.f1168b != null) {
            this.f1168b.a(this);
        }
        this.k = false;
        G();
        this.n = false;
        if (this.f1170d != null) {
            this.f1170d.a();
        }
        if (this.e != null) {
            this.e.a();
            this.e.f(this);
        }
        if (this.f instanceof b) {
            ((b) this.f).h();
        } else {
            this.f = null;
        }
        if (this.g != null) {
            this.g.g();
            this.g.b(null);
            this.g = null;
        }
        this.h = null;
        if (d.a.b.e.a.m(2)) {
            d.a.b.e.a.q(t, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.i, str);
        }
        this.i = str;
        this.j = obj;
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
    }

    private boolean y(String str, com.facebook.datasource.c<T> cVar) {
        if (cVar == null && this.p == null) {
            return true;
        }
        return str.equals(this.i) && cVar == this.p && this.l;
    }

    private void z(String str, Throwable th) {
        if (d.a.b.e.a.m(2)) {
            d.a.b.e.a.r(t, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.i, str, th);
        }
    }

    protected void C(String str, T t2) {
    }

    protected abstract void F(@Nullable Drawable drawable);

    protected abstract void H(@Nullable T t2);

    public void I(d<? super INFO> dVar) {
        i.g(dVar);
        d<INFO> dVar2 = this.f;
        if (dVar2 instanceof b) {
            ((b) dVar2).j(dVar);
        } else if (dVar2 == dVar) {
            this.f = null;
        }
    }

    public void J(@Nullable String str) {
        this.o = str;
    }

    protected void K(@Nullable Drawable drawable) {
        this.h = drawable;
        com.facebook.drawee.i.c cVar = this.g;
        if (cVar != null) {
            cVar.b(drawable);
        }
    }

    public void L(@Nullable e eVar) {
    }

    protected void M(@Nullable com.facebook.drawee.h.a aVar) {
        this.e = aVar;
        if (aVar != null) {
            aVar.f(this);
        }
    }

    protected void N(boolean z) {
        this.n = z;
    }

    protected boolean O() {
        return P();
    }

    protected void Q() {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("AbstractDraweeController#submitRequest");
        }
        T tM = m();
        if (tM == null) {
            this.a.b(d.a.ON_DATASOURCE_SUBMIT);
            n().b(this.i, this.j);
            this.g.a(0.0f, true);
            this.l = true;
            this.m = false;
            this.p = p();
            if (d.a.b.e.a.m(2)) {
                d.a.b.e.a.q(t, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.i, Integer.valueOf(System.identityHashCode(this.p)));
            }
            this.p.e(new C0050a(this.i, this.p.c()), this.f1169c);
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
                return;
            }
            return;
        }
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("AbstractDraweeController#submitRequest->cache");
        }
        this.p = null;
        this.l = true;
        this.m = false;
        this.a.b(d.a.ON_SUBMIT_CACHE_HIT);
        n().b(this.i, this.j);
        C(this.i, tM);
        D(this.i, this.p, tM, 1.0f, true, true, true);
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
    }

    @Override // com.facebook.drawee.c.a.InterfaceC0049a
    public void a() {
        this.a.b(d.a.ON_RELEASE_CONTROLLER);
        com.facebook.drawee.c.e eVar = this.f1170d;
        if (eVar != null) {
            eVar.c();
        }
        com.facebook.drawee.h.a aVar = this.e;
        if (aVar != null) {
            aVar.e();
        }
        com.facebook.drawee.i.c cVar = this.g;
        if (cVar != null) {
            cVar.g();
        }
        G();
    }

    @Override // com.facebook.drawee.i.a
    public void b() {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("AbstractDraweeController#onDetach");
        }
        if (d.a.b.e.a.m(2)) {
            d.a.b.e.a.p(t, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.i);
        }
        this.a.b(d.a.ON_DETACH_CONTROLLER);
        this.k = false;
        this.f1168b.d(this);
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
    }

    @Override // com.facebook.drawee.i.a
    @Nullable
    public com.facebook.drawee.i.b c() {
        return this.g;
    }

    @Override // com.facebook.drawee.h.a.InterfaceC0052a
    public boolean d() {
        if (d.a.b.e.a.m(2)) {
            d.a.b.e.a.p(t, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.i);
        }
        if (!P()) {
            return false;
        }
        this.f1170d.b();
        this.g.g();
        Q();
        return true;
    }

    @Override // com.facebook.drawee.i.a
    public void e() {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("AbstractDraweeController#onAttach");
        }
        if (d.a.b.e.a.m(2)) {
            d.a.b.e.a.q(t, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.i, this.l ? "request already submitted" : "request needs submit");
        }
        this.a.b(d.a.ON_ATTACH_CONTROLLER);
        i.g(this.g);
        this.f1168b.a(this);
        this.k = true;
        if (!this.l) {
            Q();
        }
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
    }

    @Override // com.facebook.drawee.i.a
    public void f(@Nullable com.facebook.drawee.i.b bVar) {
        if (d.a.b.e.a.m(2)) {
            d.a.b.e.a.q(t, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.i, bVar);
        }
        this.a.b(bVar != null ? d.a.ON_SET_HIERARCHY : d.a.ON_CLEAR_HIERARCHY);
        if (this.l) {
            this.f1168b.a(this);
            a();
        }
        com.facebook.drawee.i.c cVar = this.g;
        if (cVar != null) {
            cVar.b(null);
            this.g = null;
        }
        if (bVar != null) {
            i.b(bVar instanceof com.facebook.drawee.i.c);
            com.facebook.drawee.i.c cVar2 = (com.facebook.drawee.i.c) bVar;
            this.g = cVar2;
            cVar2.b(this.h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(d<? super INFO> dVar) {
        i.g(dVar);
        d<INFO> dVar2 = this.f;
        if (dVar2 instanceof b) {
            ((b) dVar2).g(dVar);
        } else if (dVar2 != null) {
            this.f = b.k(dVar2, dVar);
        } else {
            this.f = dVar;
        }
    }

    protected abstract Drawable k(T t2);

    @Nullable
    public Animatable l() {
        Object obj = this.r;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    @Nullable
    protected T m() {
        return null;
    }

    protected d<INFO> n() {
        d<INFO> dVar = this.f;
        return dVar == null ? c.g() : dVar;
    }

    @Nullable
    protected Drawable o() {
        return this.h;
    }

    @Override // com.facebook.drawee.i.a
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (d.a.b.e.a.m(2)) {
            d.a.b.e.a.q(t, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.i, motionEvent);
        }
        com.facebook.drawee.h.a aVar = this.e;
        if (aVar == null) {
            return false;
        }
        if (!aVar.b() && !O()) {
            return false;
        }
        this.e.d(motionEvent);
        return true;
    }

    protected abstract com.facebook.datasource.c<T> p();

    @Nullable
    protected com.facebook.drawee.h.a q() {
        return this.e;
    }

    public String r() {
        return this.i;
    }

    protected String s(@Nullable T t2) {
        return t2 != null ? t2.getClass().getSimpleName() : "<null>";
    }

    protected int t(@Nullable T t2) {
        return System.identityHashCode(t2);
    }

    public String toString() {
        h.b bVarD = h.d(this);
        bVarD.c("isAttached", this.k);
        bVarD.c("isRequestSubmitted", this.l);
        bVarD.c("hasFetchFailed", this.m);
        bVarD.a("fetchedImage", t(this.q));
        bVarD.b("events", this.a.toString());
        return bVarD.toString();
    }

    @Nullable
    protected abstract INFO u(T t2);

    @ReturnsOwnership
    protected com.facebook.drawee.c.e v() {
        if (this.f1170d == null) {
            this.f1170d = new com.facebook.drawee.c.e();
        }
        return this.f1170d;
    }

    protected void x(String str, Object obj) {
        w(str, obj);
        this.s = false;
    }
}
