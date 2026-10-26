package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import b.g.l.r;
import com.google.android.material.internal.h;
import d.b.a.b.b;
import d.b.a.b.w.c;
import d.b.a.b.z.g;
import d.b.a.b.z.k;
import d.b.a.b.z.n;

/* loaded from: classes.dex */
class a {
    private static final boolean s;
    private final MaterialButton a;

    /* renamed from: b, reason: collision with root package name */
    private k f2027b;

    /* renamed from: c, reason: collision with root package name */
    private int f2028c;

    /* renamed from: d, reason: collision with root package name */
    private int f2029d;
    private int e;
    private int f;
    private int g;
    private int h;
    private PorterDuff.Mode i;
    private ColorStateList j;
    private ColorStateList k;
    private ColorStateList l;
    private Drawable m;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private boolean q;
    private LayerDrawable r;

    static {
        s = Build.VERSION.SDK_INT >= 21;
    }

    a(MaterialButton materialButton, k kVar) {
        this.a = materialButton;
        this.f2027b = kVar;
    }

    private void A(k kVar) {
        if (d() != null) {
            d().setShapeAppearanceModel(kVar);
        }
        if (l() != null) {
            l().setShapeAppearanceModel(kVar);
        }
        if (c() != null) {
            c().setShapeAppearanceModel(kVar);
        }
    }

    private void C() {
        g gVarD = d();
        g gVarL = l();
        if (gVarD != null) {
            gVarD.Z(this.h, this.k);
            if (gVarL != null) {
                gVarL.Y(this.h, this.n ? d.b.a.b.q.a.c(this.a, b.colorSurface) : 0);
            }
        }
    }

    private InsetDrawable D(Drawable drawable) {
        return new InsetDrawable(drawable, this.f2028c, this.e, this.f2029d, this.f);
    }

    private Drawable a() {
        g gVar = new g(this.f2027b);
        gVar.L(this.a.getContext());
        androidx.core.graphics.drawable.a.o(gVar, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(gVar, mode);
        }
        gVar.Z(this.h, this.k);
        g gVar2 = new g(this.f2027b);
        gVar2.setTint(0);
        gVar2.Y(this.h, this.n ? d.b.a.b.q.a.c(this.a, b.colorSurface) : 0);
        if (s) {
            g gVar3 = new g(this.f2027b);
            this.m = gVar3;
            androidx.core.graphics.drawable.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(d.b.a.b.x.b.a(this.l), D(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.m);
            this.r = rippleDrawable;
            return rippleDrawable;
        }
        d.b.a.b.x.a aVar = new d.b.a.b.x.a(this.f2027b);
        this.m = aVar;
        androidx.core.graphics.drawable.a.o(aVar, d.b.a.b.x.b.a(this.l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.m});
        this.r = layerDrawable;
        return D(layerDrawable);
    }

    private g e(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) (s ? (LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable() : this.r).getDrawable(!z ? 1 : 0);
    }

    private g l() {
        return e(true);
    }

    void B(int i, int i2) {
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setBounds(this.f2028c, this.e, i2 - this.f2029d, i - this.f);
        }
    }

    int b() {
        return this.g;
    }

    public n c() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (n) (this.r.getNumberOfLayers() > 2 ? this.r.getDrawable(2) : this.r.getDrawable(1));
    }

    g d() {
        return e(false);
    }

    ColorStateList f() {
        return this.l;
    }

    k g() {
        return this.f2027b;
    }

    ColorStateList h() {
        return this.k;
    }

    int i() {
        return this.h;
    }

    ColorStateList j() {
        return this.j;
    }

    PorterDuff.Mode k() {
        return this.i;
    }

    boolean m() {
        return this.o;
    }

    boolean n() {
        return this.q;
    }

    void o(TypedArray typedArray) {
        this.f2028c = typedArray.getDimensionPixelOffset(d.b.a.b.k.MaterialButton_android_insetLeft, 0);
        this.f2029d = typedArray.getDimensionPixelOffset(d.b.a.b.k.MaterialButton_android_insetRight, 0);
        this.e = typedArray.getDimensionPixelOffset(d.b.a.b.k.MaterialButton_android_insetTop, 0);
        this.f = typedArray.getDimensionPixelOffset(d.b.a.b.k.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(d.b.a.b.k.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(d.b.a.b.k.MaterialButton_cornerRadius, -1);
            this.g = dimensionPixelSize;
            u(this.f2027b.w(dimensionPixelSize));
            this.p = true;
        }
        this.h = typedArray.getDimensionPixelSize(d.b.a.b.k.MaterialButton_strokeWidth, 0);
        this.i = h.c(typedArray.getInt(d.b.a.b.k.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.j = c.a(this.a.getContext(), typedArray, d.b.a.b.k.MaterialButton_backgroundTint);
        this.k = c.a(this.a.getContext(), typedArray, d.b.a.b.k.MaterialButton_strokeColor);
        this.l = c.a(this.a.getContext(), typedArray, d.b.a.b.k.MaterialButton_rippleColor);
        this.q = typedArray.getBoolean(d.b.a.b.k.MaterialButton_android_checkable, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(d.b.a.b.k.MaterialButton_elevation, 0);
        int iA = r.A(this.a);
        int paddingTop = this.a.getPaddingTop();
        int iZ = r.z(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        this.a.setInternalBackground(a());
        g gVarD = d();
        if (gVarD != null) {
            gVarD.S(dimensionPixelSize2);
        }
        r.o0(this.a, iA + this.f2028c, paddingTop + this.e, iZ + this.f2029d, paddingBottom + this.f);
    }

    void p(int i) {
        if (d() != null) {
            d().setTint(i);
        }
    }

    void q() {
        this.o = true;
        this.a.setSupportBackgroundTintList(this.j);
        this.a.setSupportBackgroundTintMode(this.i);
    }

    void r(boolean z) {
        this.q = z;
    }

    void s(int i) {
        if (this.p && this.g == i) {
            return;
        }
        this.g = i;
        this.p = true;
        u(this.f2027b.w(i));
    }

    void t(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            if (s && (this.a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.a.getBackground()).setColor(d.b.a.b.x.b.a(colorStateList));
            } else {
                if (s || !(this.a.getBackground() instanceof d.b.a.b.x.a)) {
                    return;
                }
                ((d.b.a.b.x.a) this.a.getBackground()).setTintList(d.b.a.b.x.b.a(colorStateList));
            }
        }
    }

    void u(k kVar) {
        this.f2027b = kVar;
        A(kVar);
    }

    void v(boolean z) {
        this.n = z;
        C();
    }

    void w(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            C();
        }
    }

    void x(int i) {
        if (this.h != i) {
            this.h = i;
            C();
        }
    }

    void y(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            if (d() != null) {
                androidx.core.graphics.drawable.a.o(d(), this.j);
            }
        }
    }

    void z(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            if (d() == null || this.i == null) {
                return;
            }
            androidx.core.graphics.drawable.a.p(d(), this.i);
        }
    }
}
