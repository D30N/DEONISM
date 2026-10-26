package com.facebook.drawee.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.drawee.c.d;
import com.facebook.drawee.f.s;
import com.facebook.drawee.f.t;
import com.facebook.drawee.i.b;
import d.a.b.d.h;
import d.a.b.d.i;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class b<DH extends com.facebook.drawee.i.b> implements t {

    /* renamed from: d, reason: collision with root package name */
    private DH f1227d;
    private boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1225b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1226c = true;
    private com.facebook.drawee.i.a e = null;
    private final com.facebook.drawee.c.d f = com.facebook.drawee.c.d.a();

    public b(@Nullable DH dh) {
        if (dh != null) {
            p(dh);
        }
    }

    private void c() {
        if (this.a) {
            return;
        }
        this.f.b(d.a.ON_ATTACH_CONTROLLER);
        this.a = true;
        com.facebook.drawee.i.a aVar = this.e;
        if (aVar == null || aVar.c() == null) {
            return;
        }
        this.e.e();
    }

    private void d() {
        if (this.f1225b && this.f1226c) {
            c();
        } else {
            f();
        }
    }

    public static <DH extends com.facebook.drawee.i.b> b<DH> e(@Nullable DH dh, Context context) {
        b<DH> bVar = new b<>(dh);
        bVar.n(context);
        return bVar;
    }

    private void f() {
        if (this.a) {
            this.f.b(d.a.ON_DETACH_CONTROLLER);
            this.a = false;
            if (j()) {
                this.e.b();
            }
        }
    }

    private void q(@Nullable t tVar) {
        Object objI = i();
        if (objI instanceof s) {
            ((s) objI).e(tVar);
        }
    }

    @Override // com.facebook.drawee.f.t
    public void a() {
        if (this.a) {
            return;
        }
        d.a.b.e.a.w(com.facebook.drawee.c.d.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.e)), toString());
        this.f1225b = true;
        this.f1226c = true;
        d();
    }

    @Override // com.facebook.drawee.f.t
    public void b(boolean z) {
        if (this.f1226c == z) {
            return;
        }
        this.f.b(z ? d.a.ON_DRAWABLE_SHOW : d.a.ON_DRAWABLE_HIDE);
        this.f1226c = z;
        d();
    }

    @Nullable
    public com.facebook.drawee.i.a g() {
        return this.e;
    }

    public DH h() {
        DH dh = this.f1227d;
        i.g(dh);
        return dh;
    }

    @Nullable
    public Drawable i() {
        DH dh = this.f1227d;
        if (dh == null) {
            return null;
        }
        return dh.c();
    }

    public boolean j() {
        com.facebook.drawee.i.a aVar = this.e;
        return aVar != null && aVar.c() == this.f1227d;
    }

    public void k() {
        this.f.b(d.a.ON_HOLDER_ATTACH);
        this.f1225b = true;
        d();
    }

    public void l() {
        this.f.b(d.a.ON_HOLDER_DETACH);
        this.f1225b = false;
        d();
    }

    public boolean m(MotionEvent motionEvent) {
        if (j()) {
            return this.e.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void n(Context context) {
    }

    public void o(@Nullable com.facebook.drawee.i.a aVar) {
        boolean z = this.a;
        if (z) {
            f();
        }
        if (j()) {
            this.f.b(d.a.ON_CLEAR_OLD_CONTROLLER);
            this.e.f(null);
        }
        this.e = aVar;
        if (aVar != null) {
            this.f.b(d.a.ON_SET_CONTROLLER);
            this.e.f(this.f1227d);
        } else {
            this.f.b(d.a.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            c();
        }
    }

    public void p(DH dh) {
        this.f.b(d.a.ON_SET_HIERARCHY);
        boolean zJ = j();
        q(null);
        i.g(dh);
        DH dh2 = dh;
        this.f1227d = dh2;
        Drawable drawableC = dh2.c();
        b(drawableC == null || drawableC.isVisible());
        q(this);
        if (zJ) {
            this.e.f(dh);
        }
    }

    public String toString() {
        h.b bVarD = h.d(this);
        bVarD.c("controllerAttached", this.a);
        bVarD.c("holderAttached", this.f1225b);
        bVarD.c("drawableVisible", this.f1226c);
        bVarD.b("events", this.f.toString());
        return bVarD.toString();
    }
}
