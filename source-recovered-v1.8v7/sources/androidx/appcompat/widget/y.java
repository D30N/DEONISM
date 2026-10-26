package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import b.g.d.c.f;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* loaded from: classes.dex */
class y {
    private final TextView a;

    /* renamed from: b, reason: collision with root package name */
    private u0 f323b;

    /* renamed from: c, reason: collision with root package name */
    private u0 f324c;

    /* renamed from: d, reason: collision with root package name */
    private u0 f325d;
    private u0 e;
    private u0 f;
    private u0 g;
    private u0 h;
    private final a0 i;
    private int j = 0;
    private int k = -1;
    private Typeface l;
    private boolean m;

    private static class a extends f.a {
        private final WeakReference<y> a;

        /* renamed from: b, reason: collision with root package name */
        private final int f326b;

        /* renamed from: c, reason: collision with root package name */
        private final int f327c;

        /* renamed from: androidx.appcompat.widget.y$a$a, reason: collision with other inner class name */
        private class RunnableC0005a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            private final WeakReference<y> f328b;

            /* renamed from: c, reason: collision with root package name */
            private final Typeface f329c;

            RunnableC0005a(a aVar, WeakReference<y> weakReference, Typeface typeface) {
                this.f328b = weakReference;
                this.f329c = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                y yVar = this.f328b.get();
                if (yVar == null) {
                    return;
                }
                yVar.B(this.f329c);
            }
        }

        a(y yVar, int i, int i2) {
            this.a = new WeakReference<>(yVar);
            this.f326b = i;
            this.f327c = i2;
        }

        @Override // b.g.d.c.f.a
        public void c(int i) {
        }

        @Override // b.g.d.c.f.a
        public void d(Typeface typeface) {
            int i;
            y yVar = this.a.get();
            if (yVar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f326b) != -1) {
                typeface = Typeface.create(typeface, i, (this.f327c & 2) != 0);
            }
            yVar.q(new RunnableC0005a(this, this.a, typeface));
        }
    }

    y(TextView textView) {
        this.a = textView;
        this.i = new a0(this.a);
    }

    private void A(int i, float f) {
        this.i.y(i, f);
    }

    private void C(Context context, w0 w0Var) {
        String strO;
        Typeface typefaceCreate;
        Typeface typeface;
        this.j = w0Var.k(b.a.j.TextAppearance_android_textStyle, this.j);
        if (Build.VERSION.SDK_INT >= 28) {
            int iK = w0Var.k(b.a.j.TextAppearance_android_textFontWeight, -1);
            this.k = iK;
            if (iK != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        if (!w0Var.r(b.a.j.TextAppearance_android_fontFamily) && !w0Var.r(b.a.j.TextAppearance_fontFamily)) {
            if (w0Var.r(b.a.j.TextAppearance_android_typeface)) {
                this.m = false;
                int iK2 = w0Var.k(b.a.j.TextAppearance_android_typeface, 1);
                if (iK2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (iK2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (iK2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.l = typeface;
                return;
            }
            return;
        }
        this.l = null;
        int i = w0Var.r(b.a.j.TextAppearance_fontFamily) ? b.a.j.TextAppearance_fontFamily : b.a.j.TextAppearance_android_fontFamily;
        int i2 = this.k;
        int i3 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = w0Var.j(i, this.j, new a(this, i2, i3));
                if (typefaceJ != null) {
                    if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                        typefaceJ = Typeface.create(Typeface.create(typefaceJ, 0), this.k, (this.j & 2) != 0);
                    }
                    this.l = typefaceJ;
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (strO = w0Var.o(i)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            typefaceCreate = Typeface.create(strO, this.j);
        } else {
            typefaceCreate = Typeface.create(Typeface.create(strO, 0), this.k, (this.j & 2) != 0);
        }
        this.l = typefaceCreate;
    }

    private void a(Drawable drawable, u0 u0Var) {
        if (drawable == null || u0Var == null) {
            return;
        }
        j.i(drawable, u0Var, this.a.getDrawableState());
    }

    private static u0 d(Context context, j jVar, int i) {
        ColorStateList colorStateListF = jVar.f(context, i);
        if (colorStateListF == null) {
            return null;
        }
        u0 u0Var = new u0();
        u0Var.f296d = true;
        u0Var.a = colorStateListF;
        return u0Var;
    }

    private void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (Build.VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            TextView textView = this.a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                TextView textView2 = this.a;
                Drawable drawable7 = compoundDrawablesRelative2[0];
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable8 = compoundDrawablesRelative2[2];
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative2[3];
                }
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                return;
            }
        }
        Drawable[] compoundDrawables = this.a.getCompoundDrawables();
        TextView textView3 = this.a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void y() {
        u0 u0Var = this.h;
        this.f323b = u0Var;
        this.f324c = u0Var;
        this.f325d = u0Var;
        this.e = u0Var;
        this.f = u0Var;
        this.g = u0Var;
    }

    public void B(Typeface typeface) {
        if (this.m) {
            this.a.setTypeface(typeface);
            this.l = typeface;
        }
    }

    void b() {
        if (this.f323b != null || this.f324c != null || this.f325d != null || this.e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.f323b);
            a(compoundDrawables[1], this.f324c);
            a(compoundDrawables[2], this.f325d);
            a(compoundDrawables[3], this.e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f == null && this.g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    void c() {
        this.i.b();
    }

    int e() {
        return this.i.j();
    }

    int f() {
        return this.i.k();
    }

    int g() {
        return this.i.l();
    }

    int[] h() {
        return this.i.m();
    }

    int i() {
        return this.i.n();
    }

    ColorStateList j() {
        u0 u0Var = this.h;
        if (u0Var != null) {
            return u0Var.a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        u0 u0Var = this.h;
        if (u0Var != null) {
            return u0Var.f294b;
        }
        return null;
    }

    boolean l() {
        return this.i.s();
    }

    @SuppressLint({"NewApi"})
    void m(AttributeSet attributeSet, int i) {
        String strO;
        ColorStateList colorStateListC;
        String strO2;
        ColorStateList colorStateListC2;
        boolean zA;
        boolean z;
        ColorStateList colorStateListC3;
        j jVar;
        int i2;
        Context context = this.a.getContext();
        j jVarB = j.b();
        w0 w0VarU = w0.u(context, attributeSet, b.a.j.AppCompatTextHelper, i, 0);
        int iN = w0VarU.n(b.a.j.AppCompatTextHelper_android_textAppearance, -1);
        if (w0VarU.r(b.a.j.AppCompatTextHelper_android_drawableLeft)) {
            this.f323b = d(context, jVarB, w0VarU.n(b.a.j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (w0VarU.r(b.a.j.AppCompatTextHelper_android_drawableTop)) {
            this.f324c = d(context, jVarB, w0VarU.n(b.a.j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (w0VarU.r(b.a.j.AppCompatTextHelper_android_drawableRight)) {
            this.f325d = d(context, jVarB, w0VarU.n(b.a.j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (w0VarU.r(b.a.j.AppCompatTextHelper_android_drawableBottom)) {
            this.e = d(context, jVarB, w0VarU.n(b.a.j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (w0VarU.r(b.a.j.AppCompatTextHelper_android_drawableStart)) {
                this.f = d(context, jVarB, w0VarU.n(b.a.j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (w0VarU.r(b.a.j.AppCompatTextHelper_android_drawableEnd)) {
                this.g = d(context, jVarB, w0VarU.n(b.a.j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        w0VarU.v();
        boolean z2 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iN != -1) {
            w0 w0VarS = w0.s(context, iN, b.a.j.TextAppearance);
            if (z2 || !w0VarS.r(b.a.j.TextAppearance_textAllCaps)) {
                zA = false;
                z = false;
            } else {
                zA = w0VarS.a(b.a.j.TextAppearance_textAllCaps, false);
                z = true;
            }
            C(context, w0VarS);
            if (Build.VERSION.SDK_INT < 23) {
                colorStateListC3 = w0VarS.r(b.a.j.TextAppearance_android_textColor) ? w0VarS.c(b.a.j.TextAppearance_android_textColor) : null;
                colorStateListC = w0VarS.r(b.a.j.TextAppearance_android_textColorHint) ? w0VarS.c(b.a.j.TextAppearance_android_textColorHint) : null;
                colorStateListC2 = w0VarS.r(b.a.j.TextAppearance_android_textColorLink) ? w0VarS.c(b.a.j.TextAppearance_android_textColorLink) : null;
            } else {
                colorStateListC = null;
                colorStateListC2 = null;
                colorStateListC3 = null;
            }
            strO = w0VarS.r(b.a.j.TextAppearance_textLocale) ? w0VarS.o(b.a.j.TextAppearance_textLocale) : null;
            strO2 = (Build.VERSION.SDK_INT < 26 || !w0VarS.r(b.a.j.TextAppearance_fontVariationSettings)) ? null : w0VarS.o(b.a.j.TextAppearance_fontVariationSettings);
            w0VarS.v();
        } else {
            strO = null;
            colorStateListC = null;
            strO2 = null;
            colorStateListC2 = null;
            zA = false;
            z = false;
            colorStateListC3 = null;
        }
        w0 w0VarU2 = w0.u(context, attributeSet, b.a.j.TextAppearance, i, 0);
        if (!z2 && w0VarU2.r(b.a.j.TextAppearance_textAllCaps)) {
            zA = w0VarU2.a(b.a.j.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (w0VarU2.r(b.a.j.TextAppearance_android_textColor)) {
                colorStateListC3 = w0VarU2.c(b.a.j.TextAppearance_android_textColor);
            }
            if (w0VarU2.r(b.a.j.TextAppearance_android_textColorHint)) {
                colorStateListC = w0VarU2.c(b.a.j.TextAppearance_android_textColorHint);
            }
            if (w0VarU2.r(b.a.j.TextAppearance_android_textColorLink)) {
                colorStateListC2 = w0VarU2.c(b.a.j.TextAppearance_android_textColorLink);
            }
        }
        if (w0VarU2.r(b.a.j.TextAppearance_textLocale)) {
            strO = w0VarU2.o(b.a.j.TextAppearance_textLocale);
        }
        if (Build.VERSION.SDK_INT >= 26 && w0VarU2.r(b.a.j.TextAppearance_fontVariationSettings)) {
            strO2 = w0VarU2.o(b.a.j.TextAppearance_fontVariationSettings);
        }
        if (Build.VERSION.SDK_INT >= 28 && w0VarU2.r(b.a.j.TextAppearance_android_textSize) && w0VarU2.f(b.a.j.TextAppearance_android_textSize, -1) == 0) {
            jVar = jVarB;
            this.a.setTextSize(0, 0.0f);
        } else {
            jVar = jVarB;
        }
        C(context, w0VarU2);
        w0VarU2.v();
        if (colorStateListC3 != null) {
            this.a.setTextColor(colorStateListC3);
        }
        if (colorStateListC != null) {
            this.a.setHintTextColor(colorStateListC);
        }
        if (colorStateListC2 != null) {
            this.a.setLinkTextColor(colorStateListC2);
        }
        if (!z2 && z) {
            r(zA);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                this.a.setTypeface(typeface, this.j);
            } else {
                this.a.setTypeface(typeface);
            }
        }
        if (strO2 != null) {
            this.a.setFontVariationSettings(strO2);
        }
        if (strO != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 24) {
                this.a.setTextLocales(LocaleList.forLanguageTags(strO));
            } else if (i3 >= 21) {
                this.a.setTextLocale(Locale.forLanguageTag(strO.substring(0, strO.indexOf(44))));
            }
        }
        this.i.t(attributeSet, i);
        if (androidx.core.widget.b.a && this.i.n() != 0) {
            int[] iArrM = this.i.m();
            if (iArrM.length > 0) {
                if (this.a.getAutoSizeStepGranularity() != -1.0f) {
                    this.a.setAutoSizeTextTypeUniformWithConfiguration(this.i.k(), this.i.j(), this.i.l(), 0);
                } else {
                    this.a.setAutoSizeTextTypeUniformWithPresetSizes(iArrM, 0);
                }
            }
        }
        w0 w0VarT = w0.t(context, attributeSet, b.a.j.AppCompatTextView);
        int iN2 = w0VarT.n(b.a.j.AppCompatTextView_drawableLeftCompat, -1);
        j jVar2 = jVar;
        Drawable drawableC = iN2 != -1 ? jVar2.c(context, iN2) : null;
        int iN3 = w0VarT.n(b.a.j.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawableC2 = iN3 != -1 ? jVar2.c(context, iN3) : null;
        int iN4 = w0VarT.n(b.a.j.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawableC3 = iN4 != -1 ? jVar2.c(context, iN4) : null;
        int iN5 = w0VarT.n(b.a.j.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawableC4 = iN5 != -1 ? jVar2.c(context, iN5) : null;
        int iN6 = w0VarT.n(b.a.j.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawableC5 = iN6 != -1 ? jVar2.c(context, iN6) : null;
        int iN7 = w0VarT.n(b.a.j.AppCompatTextView_drawableEndCompat, -1);
        x(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iN7 != -1 ? jVar2.c(context, iN7) : null);
        if (w0VarT.r(b.a.j.AppCompatTextView_drawableTint)) {
            androidx.core.widget.i.g(this.a, w0VarT.c(b.a.j.AppCompatTextView_drawableTint));
        }
        if (w0VarT.r(b.a.j.AppCompatTextView_drawableTintMode)) {
            i2 = -1;
            androidx.core.widget.i.h(this.a, e0.d(w0VarT.k(b.a.j.AppCompatTextView_drawableTintMode, -1), null));
        } else {
            i2 = -1;
        }
        int iF = w0VarT.f(b.a.j.AppCompatTextView_firstBaselineToTopHeight, i2);
        int iF2 = w0VarT.f(b.a.j.AppCompatTextView_lastBaselineToBottomHeight, i2);
        int iF3 = w0VarT.f(b.a.j.AppCompatTextView_lineHeight, i2);
        w0VarT.v();
        if (iF != i2) {
            androidx.core.widget.i.j(this.a, iF);
        }
        if (iF2 != i2) {
            androidx.core.widget.i.k(this.a, iF2);
        }
        if (iF3 != i2) {
            androidx.core.widget.i.l(this.a, iF3);
        }
    }

    void n(boolean z, int i, int i2, int i3, int i4) {
        if (androidx.core.widget.b.a) {
            return;
        }
        c();
    }

    void o() {
        b();
    }

    void p(Context context, int i) {
        String strO;
        ColorStateList colorStateListC;
        w0 w0VarS = w0.s(context, i, b.a.j.TextAppearance);
        if (w0VarS.r(b.a.j.TextAppearance_textAllCaps)) {
            r(w0VarS.a(b.a.j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && w0VarS.r(b.a.j.TextAppearance_android_textColor) && (colorStateListC = w0VarS.c(b.a.j.TextAppearance_android_textColor)) != null) {
            this.a.setTextColor(colorStateListC);
        }
        if (w0VarS.r(b.a.j.TextAppearance_android_textSize) && w0VarS.f(b.a.j.TextAppearance_android_textSize, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        C(context, w0VarS);
        if (Build.VERSION.SDK_INT >= 26 && w0VarS.r(b.a.j.TextAppearance_fontVariationSettings) && (strO = w0VarS.o(b.a.j.TextAppearance_fontVariationSettings)) != null) {
            this.a.setFontVariationSettings(strO);
        }
        w0VarS.v();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.j);
        }
    }

    public void q(Runnable runnable) {
        this.a.post(runnable);
    }

    void r(boolean z) {
        this.a.setAllCaps(z);
    }

    void s(int i, int i2, int i3, int i4) {
        this.i.u(i, i2, i3, i4);
    }

    void t(int[] iArr, int i) {
        this.i.v(iArr, i);
    }

    void u(int i) {
        this.i.w(i);
    }

    void v(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new u0();
        }
        u0 u0Var = this.h;
        u0Var.a = colorStateList;
        u0Var.f296d = colorStateList != null;
        y();
    }

    void w(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new u0();
        }
        u0 u0Var = this.h;
        u0Var.f294b = mode;
        u0Var.f295c = mode != null;
        y();
    }

    void z(int i, float f) {
        if (androidx.core.widget.b.a || l()) {
            return;
        }
        A(i, f);
    }
}
