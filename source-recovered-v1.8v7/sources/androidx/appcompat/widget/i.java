package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
class i {
    private final CompoundButton a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f229b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f230c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f231d = false;
    private boolean e = false;
    private boolean f;

    i(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    void a() throws NoSuchFieldException {
        Drawable drawableA = androidx.core.widget.c.a(this.a);
        if (drawableA != null) {
            if (this.f231d || this.e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.r(drawableA).mutate();
                if (this.f231d) {
                    androidx.core.graphics.drawable.a.o(drawableMutate, this.f229b);
                }
                if (this.e) {
                    androidx.core.graphics.drawable.a.p(drawableMutate, this.f230c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.a.getDrawableState());
                }
                this.a.setButtonDrawable(drawableMutate);
            }
        }
    }

    int b(int i) {
        Drawable drawableA;
        return (Build.VERSION.SDK_INT >= 17 || (drawableA = androidx.core.widget.c.a(this.a)) == null) ? i : i + drawableA.getIntrinsicWidth();
    }

    ColorStateList c() {
        return this.f229b;
    }

    PorterDuff.Mode d() {
        return this.f230c;
    }

    void e(AttributeSet attributeSet, int i) {
        boolean z;
        int resourceId;
        int resourceId2;
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, b.a.j.CompoundButton, i, 0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(b.a.j.CompoundButton_buttonCompat) || (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(b.a.j.CompoundButton_buttonCompat, 0)) == 0) {
                z = false;
            } else {
                try {
                    this.a.setButtonDrawable(b.a.k.a.a.d(this.a.getContext(), resourceId2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (!z && typedArrayObtainStyledAttributes.hasValue(b.a.j.CompoundButton_android_button) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(b.a.j.CompoundButton_android_button, 0)) != 0) {
                this.a.setButtonDrawable(b.a.k.a.a.d(this.a.getContext(), resourceId));
            }
            if (typedArrayObtainStyledAttributes.hasValue(b.a.j.CompoundButton_buttonTint)) {
                androidx.core.widget.c.c(this.a, typedArrayObtainStyledAttributes.getColorStateList(b.a.j.CompoundButton_buttonTint));
            }
            if (typedArrayObtainStyledAttributes.hasValue(b.a.j.CompoundButton_buttonTintMode)) {
                androidx.core.widget.c.d(this.a, e0.d(typedArrayObtainStyledAttributes.getInt(b.a.j.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    void f() throws NoSuchFieldException {
        if (this.f) {
            this.f = false;
        } else {
            this.f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) throws NoSuchFieldException {
        this.f229b = colorStateList;
        this.f231d = true;
        a();
    }

    void h(PorterDuff.Mode mode) throws NoSuchFieldException {
        this.f230c = mode;
        this.e = true;
        a();
    }
}
