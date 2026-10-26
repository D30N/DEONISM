package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.g.l.r;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import d.b.a.b.k;
import d.b.a.b.l.h;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    private final Rect s;
    private final com.google.android.material.floatingactionbutton.d t;
    private final com.google.android.material.floatingactionbutton.d u;
    private final com.google.android.material.floatingactionbutton.d v;
    private final com.google.android.material.floatingactionbutton.d w;
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> x;
    private boolean y;

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {
        private Rect a;

        /* renamed from: b, reason: collision with root package name */
        private d f2073b;

        /* renamed from: c, reason: collision with root package name */
        private d f2074c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2075d;
        private boolean e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f2075d = false;
            this.e = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.ExtendedFloatingActionButton_Behavior_Layout);
            this.f2075d = typedArrayObtainStyledAttributes.getBoolean(k.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.e = typedArrayObtainStyledAttributes.getBoolean(k.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        private static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void H(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            Rect rect = extendedFloatingActionButton.s;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            int i = 0;
            int i2 = extendedFloatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : extendedFloatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            if (extendedFloatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i = rect.bottom;
            } else if (extendedFloatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i = -rect.top;
            }
            if (i != 0) {
                r.P(extendedFloatingActionButton, i);
            }
            if (i2 != 0) {
                r.O(extendedFloatingActionButton, i2);
            }
        }

        private boolean K(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f2075d || this.e) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        private boolean M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!K(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                L(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        private boolean N(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!K(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                L(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        protected void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m(this.e ? extendedFloatingActionButton.u : extendedFloatingActionButton.v, this.e ? this.f2074c : this.f2073b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public boolean b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            Rect rect2 = extendedFloatingActionButton.s;
            rect.set(extendedFloatingActionButton.getLeft() + rect2.left, extendedFloatingActionButton.getTop() + rect2.top, extendedFloatingActionButton.getRight() - rect2.right, extendedFloatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                M(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!G(view)) {
                return false;
            }
            N(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> listR = coordinatorLayout.r(extendedFloatingActionButton);
            int size = listR.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = listR.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (G(view) && N(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (M(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(extendedFloatingActionButton, i);
            H(coordinatorLayout, extendedFloatingActionButton);
            return true;
        }

        protected void L(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m(this.e ? extendedFloatingActionButton.t : extendedFloatingActionButton.w, this.e ? this.f2074c : this.f2073b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }
    }

    class a extends AnimatorListenerAdapter {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.floatingactionbutton.d f2076b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f2077c;

        a(ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.d dVar, d dVar2) {
            this.f2076b = dVar;
            this.f2077c = dVar2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
            this.f2076b.d();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2076b.c();
            if (this.a) {
                return;
            }
            this.f2076b.f(this.f2077c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f2076b.onAnimationStart(animator);
            this.a = false;
        }
    }

    static class b extends Property<View, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    static class c extends Property<View, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    public static abstract class d {
    }

    static {
        new b(Float.class, "width");
        new c(Float.class, "height");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(com.google.android.material.floatingactionbutton.d dVar, d dVar2) {
        if (dVar.g()) {
            return;
        }
        if (!n()) {
            dVar.i();
            dVar.f(dVar2);
            return;
        }
        measure(0, 0);
        AnimatorSet animatorSetB = dVar.b();
        animatorSetB.addListener(new a(this, dVar, dVar2));
        Iterator<Animator.AnimatorListener> it = dVar.e().iterator();
        while (it.hasNext()) {
            animatorSetB.addListener(it.next());
        }
        animatorSetB.start();
    }

    private boolean n() {
        return r.J(this) && !isInEditMode();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.x;
    }

    int getCollapsedSize() {
        return (Math.min(r.A(this), r.z(this)) * 2) + getIconSize();
    }

    public h getExtendMotionSpec() {
        return this.u.a();
    }

    public h getHideMotionSpec() {
        return this.w.a();
    }

    public h getShowMotionSpec() {
        return this.v.a();
    }

    public h getShrinkMotionSpec() {
        return this.t.a();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.y && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.y = false;
            this.t.i();
        }
    }

    public void setExtendMotionSpec(h hVar) {
        this.u.h(hVar);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(h.c(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.y == z) {
            return;
        }
        com.google.android.material.floatingactionbutton.d dVar = z ? this.u : this.t;
        if (dVar.g()) {
            return;
        }
        dVar.i();
    }

    public void setHideMotionSpec(h hVar) {
        this.w.h(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(h.c(getContext(), i));
    }

    public void setShowMotionSpec(h hVar) {
        this.v.h(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(h.c(getContext(), i));
    }

    public void setShrinkMotionSpec(h hVar) {
        this.t.h(hVar);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(h.c(getContext(), i));
    }
}
