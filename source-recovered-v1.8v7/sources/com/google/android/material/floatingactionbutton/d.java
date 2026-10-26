package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import d.b.a.b.l.h;
import java.util.List;

/* loaded from: classes.dex */
interface d {
    h a();

    AnimatorSet b();

    void c();

    void d();

    List<Animator.AnimatorListener> e();

    void f(ExtendedFloatingActionButton.d dVar);

    boolean g();

    void h(h hVar);

    void i();

    void onAnimationStart(Animator animator);
}
