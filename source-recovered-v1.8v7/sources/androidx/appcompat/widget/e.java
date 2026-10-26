package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
class e {
    private final View a;

    /* renamed from: d, reason: collision with root package name */
    private u0 f210d;
    private u0 e;
    private u0 f;

    /* renamed from: c, reason: collision with root package name */
    private int f209c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final j f208b = j.b();

    e(View view) {
        this.a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f == null) {
            this.f = new u0();
        }
        u0 u0Var = this.f;
        u0Var.a();
        ColorStateList colorStateListM = b.g.l.r.m(this.a);
        if (colorStateListM != null) {
            u0Var.f296d = true;
            u0Var.a = colorStateListM;
        }
        PorterDuff.Mode modeN = b.g.l.r.n(this.a);
        if (modeN != null) {
            u0Var.f295c = true;
            u0Var.f294b = modeN;
        }
        if (!u0Var.f296d && !u0Var.f295c) {
            return false;
        }
        j.i(drawable, u0Var, this.a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f210d != null : i == 21;
    }

    void b() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            u0 u0Var = this.e;
            if (u0Var != null) {
                j.i(background, u0Var, this.a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f210d;
            if (u0Var2 != null) {
                j.i(background, u0Var2, this.a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        u0 u0Var = this.e;
        if (u0Var != null) {
            return u0Var.a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        u0 u0Var = this.e;
        if (u0Var != null) {
            return u0Var.f294b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i) {
        w0 w0VarU = w0.u(this.a.getContext(), attributeSet, b.a.j.ViewBackgroundHelper, i, 0);
        try {
            if (w0VarU.r(b.a.j.ViewBackgroundHelper_android_background)) {
                this.f209c = w0VarU.n(b.a.j.ViewBackgroundHelper_android_background, -1);
                ColorStateList colorStateListF = this.f208b.f(this.a.getContext(), this.f209c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (w0VarU.r(b.a.j.ViewBackgroundHelper_backgroundTint)) {
                b.g.l.r.g0(this.a, w0VarU.c(b.a.j.ViewBackgroundHelper_backgroundTint));
            }
            if (w0VarU.r(b.a.j.ViewBackgroundHelper_backgroundTintMode)) {
                b.g.l.r.h0(this.a, e0.d(w0VarU.k(b.a.j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            w0VarU.v();
        }
    }

    void f(Drawable drawable) {
        this.f209c = -1;
        h(null);
        b();
    }

    void g(int i) {
        this.f209c = i;
        j jVar = this.f208b;
        h(jVar != null ? jVar.f(this.a.getContext(), i) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f210d == null) {
                this.f210d = new u0();
            }
            u0 u0Var = this.f210d;
            u0Var.a = colorStateList;
            u0Var.f296d = true;
        } else {
            this.f210d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new u0();
        }
        u0 u0Var = this.e;
        u0Var.a = colorStateList;
        u0Var.f296d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new u0();
        }
        u0 u0Var = this.e;
        u0Var.f294b = mode;
        u0Var.f295c = true;
        b();
    }
}
