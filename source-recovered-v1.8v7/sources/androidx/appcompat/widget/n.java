package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class n {
    private final ImageView a;

    /* renamed from: b, reason: collision with root package name */
    private u0 f256b;

    /* renamed from: c, reason: collision with root package name */
    private u0 f257c;

    /* renamed from: d, reason: collision with root package name */
    private u0 f258d;

    public n(ImageView imageView) {
        this.a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f258d == null) {
            this.f258d = new u0();
        }
        u0 u0Var = this.f258d;
        u0Var.a();
        ColorStateList colorStateListA = androidx.core.widget.e.a(this.a);
        if (colorStateListA != null) {
            u0Var.f296d = true;
            u0Var.a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.e.b(this.a);
        if (modeB != null) {
            u0Var.f295c = true;
            u0Var.f294b = modeB;
        }
        if (!u0Var.f296d && !u0Var.f295c) {
            return false;
        }
        j.i(drawable, u0Var, this.a.getDrawableState());
        return true;
    }

    private boolean j() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f256b != null : i == 21;
    }

    void b() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            e0.b(drawable);
        }
        if (drawable != null) {
            if (j() && a(drawable)) {
                return;
            }
            u0 u0Var = this.f257c;
            if (u0Var != null) {
                j.i(drawable, u0Var, this.a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f256b;
            if (u0Var2 != null) {
                j.i(drawable, u0Var2, this.a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        u0 u0Var = this.f257c;
        if (u0Var != null) {
            return u0Var.a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        u0 u0Var = this.f257c;
        if (u0Var != null) {
            return u0Var.f294b;
        }
        return null;
    }

    boolean e() {
        return Build.VERSION.SDK_INT < 21 || !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i) {
        int iN;
        w0 w0VarU = w0.u(this.a.getContext(), attributeSet, b.a.j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null && (iN = w0VarU.n(b.a.j.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = b.a.k.a.a.d(this.a.getContext(), iN)) != null) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                e0.b(drawable);
            }
            if (w0VarU.r(b.a.j.AppCompatImageView_tint)) {
                androidx.core.widget.e.c(this.a, w0VarU.c(b.a.j.AppCompatImageView_tint));
            }
            if (w0VarU.r(b.a.j.AppCompatImageView_tintMode)) {
                androidx.core.widget.e.d(this.a, e0.d(w0VarU.k(b.a.j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            w0VarU.v();
        }
    }

    public void g(int i) {
        if (i != 0) {
            Drawable drawableD = b.a.k.a.a.d(this.a.getContext(), i);
            if (drawableD != null) {
                e0.b(drawableD);
            }
            this.a.setImageDrawable(drawableD);
        } else {
            this.a.setImageDrawable(null);
        }
        b();
    }

    void h(ColorStateList colorStateList) {
        if (this.f257c == null) {
            this.f257c = new u0();
        }
        u0 u0Var = this.f257c;
        u0Var.a = colorStateList;
        u0Var.f296d = true;
        b();
    }

    void i(PorterDuff.Mode mode) {
        if (this.f257c == null) {
            this.f257c = new u0();
        }
        u0 u0Var = this.f257c;
        u0Var.f294b = mode;
        u0Var.f295c = true;
        b();
    }
}
