package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f1996b;

    /* renamed from: c, reason: collision with root package name */
    private int f1997c;

    /* renamed from: d, reason: collision with root package name */
    private ViewPropertyAnimator f1998d;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f1998d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.a = 0;
        this.f1996b = 2;
        this.f1997c = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.f1996b = 2;
        this.f1997c = 0;
    }

    private void F(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f1998d = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new a());
    }

    public void G(V v, int i) {
        this.f1997c = i;
        if (this.f1996b == 1) {
            v.setTranslationY(this.a + i);
        }
    }

    public void H(V v) {
        if (this.f1996b == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f1998d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f1996b = 1;
        F(v, this.a + this.f1997c, 175L, d.b.a.b.l.a.f2959c);
    }

    public void I(V v) {
        if (this.f1996b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f1998d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f1996b = 2;
        F(v, 0, 225L, d.b.a.b.l.a.f2960d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.l(coordinatorLayout, v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            H(v);
        } else if (i2 < 0) {
            I(v);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }
}
