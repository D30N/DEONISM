package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e {
    private final ArrayList<b> a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private b f2109b = null;

    /* renamed from: c, reason: collision with root package name */
    ValueAnimator f2110c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Animator.AnimatorListener f2111d = new a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e eVar = e.this;
            if (eVar.f2110c == animator) {
                eVar.f2110c = null;
            }
        }
    }

    static class b {
        final int[] a;

        /* renamed from: b, reason: collision with root package name */
        final ValueAnimator f2112b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.f2112b = valueAnimator;
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.f2110c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f2110c = null;
        }
    }

    private void e(b bVar) {
        ValueAnimator valueAnimator = bVar.f2112b;
        this.f2110c = valueAnimator;
        valueAnimator.start();
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f2111d);
        this.a.add(bVar);
    }

    public void c() {
        ValueAnimator valueAnimator = this.f2110c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f2110c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.a.get(i);
            if (StateSet.stateSetMatches(bVar.a, iArr)) {
                break;
            } else {
                i++;
            }
        }
        b bVar2 = this.f2109b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.f2109b = bVar;
        if (bVar != null) {
            e(bVar);
        }
    }
}
