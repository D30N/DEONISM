package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
class c extends b {
    c(FloatingActionButton floatingActionButton, d.b.a.b.y.b bVar) {
        super(floatingActionButton, bVar);
    }

    private Animator e0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.y, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.y, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(b.F);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void A() {
        b0();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void C(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f = 0.0f;
            if (this.y.isEnabled()) {
                this.y.setElevation(this.h);
                if (this.y.isPressed()) {
                    floatingActionButton = this.y;
                    f = this.j;
                } else if (this.y.isFocused() || this.y.isHovered()) {
                    floatingActionButton = this.y;
                    f = this.i;
                }
                floatingActionButton.setTranslationZ(f);
            }
            this.y.setElevation(0.0f);
            floatingActionButton = this.y;
            floatingActionButton.setTranslationZ(f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void D(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(b.G, e0(f, f3));
            stateListAnimator.addState(b.H, e0(f, f2));
            stateListAnimator.addState(b.I, e0(f, f2));
            stateListAnimator.addState(b.J, e0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.y, "elevation", f).setDuration(0L));
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.y, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(b.F);
            stateListAnimator.addState(b.K, animatorSet);
            stateListAnimator.addState(b.L, e0(0.0f, 0.0f));
            this.y.setStateListAnimator(stateListAnimator);
        }
        if (V()) {
            b0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    boolean I() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void R(ColorStateList colorStateList) {
        Drawable drawable = this.f2085c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(d.b.a.b.x.b.a(colorStateList));
        } else {
            super.R(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    boolean V() {
        return this.z.b() || !X();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void Z() {
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public float m() {
        return this.y.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void r(Rect rect) {
        if (this.z.b()) {
            super.r(rect);
        } else {
            int sizeDimension = !X() ? (this.k - this.y.getSizeDimension()) / 2 : 0;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void y() {
    }
}
