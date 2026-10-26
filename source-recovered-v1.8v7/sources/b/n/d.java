package b.n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class d extends j0 {

    class a extends n {
        final /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        @Override // b.n.m.f
        public void e(m mVar) {
            c0.g(this.a, 1.0f);
            c0.a(this.a);
            mVar.V(this);
        }
    }

    private static class b extends AnimatorListenerAdapter {
        private final View a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f983b = false;

        b(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.g(this.a, 1.0f);
            if (this.f983b) {
                this.a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (b.g.l.r.F(this.a) && this.a.getLayerType() == 0) {
                this.f983b = true;
                this.a.setLayerType(2, null);
            }
        }
    }

    public d(int i) {
        o0(i);
    }

    private Animator p0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        c0.g(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, c0.f981b, f2);
        objectAnimatorOfFloat.addListener(new b(view));
        b(new a(view));
        return objectAnimatorOfFloat;
    }

    private static float q0(s sVar, float f) {
        Float f2;
        return (sVar == null || (f2 = (Float) sVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // b.n.j0
    public Animator k0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float fQ0 = q0(sVar, 0.0f);
        return p0(view, fQ0 != 1.0f ? fQ0 : 0.0f, 1.0f);
    }

    @Override // b.n.j0
    public Animator m0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        c0.e(view);
        return p0(view, q0(sVar, 1.0f), 0.0f);
    }

    @Override // b.n.j0, b.n.m
    public void o(s sVar) {
        super.o(sVar);
        sVar.a.put("android:fade:transitionAlpha", Float.valueOf(c0.c(sVar.f1019b)));
    }
}
