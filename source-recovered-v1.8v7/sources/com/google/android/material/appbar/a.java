package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import b.g.l.r;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
abstract class a<V extends View> extends c<V> {

    /* renamed from: d, reason: collision with root package name */
    private Runnable f1986d;
    OverScroller e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    private VelocityTracker j;

    /* renamed from: com.google.android.material.appbar.a$a, reason: collision with other inner class name */
    private class RunnableC0068a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final CoordinatorLayout f1987b;

        /* renamed from: c, reason: collision with root package name */
        private final V f1988c;

        RunnableC0068a(CoordinatorLayout coordinatorLayout, V v) {
            this.f1987b = coordinatorLayout;
            this.f1988c = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f1988c == null || (overScroller = a.this.e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                a.this.N(this.f1987b, this.f1988c);
                return;
            }
            a aVar = a.this;
            aVar.P(this.f1987b, this.f1988c, aVar.e.getCurrY());
            r.V(this.f1988c, this);
        }
    }

    public a() {
        this.g = -1;
        this.i = -1;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = -1;
        this.i = -1;
    }

    private void I() {
        if (this.j == null) {
            this.j = VelocityTracker.obtain();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.i < 0) {
            this.i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.j;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.j.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE);
                    J(coordinatorLayout, v, -L(v), 0, this.j.getYVelocity(this.g));
                }
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.g);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int i = this.h - y;
                if (!this.f) {
                    int iAbs = Math.abs(i);
                    int i2 = this.i;
                    if (iAbs > i2) {
                        this.f = true;
                        i = i > 0 ? i - i2 : i + i2;
                    }
                }
                int i3 = i;
                if (this.f) {
                    this.h = y;
                    O(coordinatorLayout, v, i3, K(v), 0);
                }
            } else if (actionMasked == 3) {
            }
            this.f = false;
            this.g = -1;
            VelocityTracker velocityTracker2 = this.j;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.j = null;
            }
        } else {
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (!coordinatorLayout.B(v, x, y2) || !H(v)) {
                return false;
            }
            this.h = y2;
            this.g = motionEvent.getPointerId(0);
            I();
        }
        VelocityTracker velocityTracker3 = this.j;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
        }
        return true;
    }

    abstract boolean H(V v);

    final boolean J(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        Runnable runnable = this.f1986d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f1986d = null;
        }
        if (this.e == null) {
            this.e = new OverScroller(v.getContext());
        }
        this.e.fling(0, E(), 0, Math.round(f), 0, 0, i, i2);
        if (!this.e.computeScrollOffset()) {
            N(coordinatorLayout, v);
            return false;
        }
        RunnableC0068a runnableC0068a = new RunnableC0068a(coordinatorLayout, v);
        this.f1986d = runnableC0068a;
        r.V(v, runnableC0068a);
        return true;
    }

    abstract int K(V v);

    abstract int L(V v);

    abstract int M();

    abstract void N(CoordinatorLayout coordinatorLayout, V v);

    final int O(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return Q(coordinatorLayout, v, M() - i, i2, i3);
    }

    int P(CoordinatorLayout coordinatorLayout, V v, int i) {
        return Q(coordinatorLayout, v, i, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
    }

    abstract int Q(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.i
            if (r0 >= 0) goto L12
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.i = r0
        L12:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L1f
            boolean r0 = r4.f
            if (r0 == 0) goto L1f
            return r2
        L1f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L60
            r5 = -1
            if (r0 == r2) goto L51
            if (r0 == r1) goto L2f
            r6 = 3
            if (r0 == r6) goto L51
            goto L83
        L2f:
            int r6 = r4.g
            if (r6 != r5) goto L34
            goto L83
        L34:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L3b
            goto L83
        L3b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.h
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.i
            if (r6 <= r0) goto L83
            r4.f = r2
            r4.h = r5
            goto L83
        L51:
            r4.f = r3
            r4.g = r5
            android.view.VelocityTracker r5 = r4.j
            if (r5 == 0) goto L83
            r5.recycle()
            r5 = 0
            r4.j = r5
            goto L83
        L60:
            r4.f = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.H(r6)
            if (r2 == 0) goto L83
            boolean r5 = r5.B(r6, r0, r1)
            if (r5 == 0) goto L83
            r4.h = r1
            int r5 = r7.getPointerId(r3)
            r4.g = r5
            r4.I()
        L83:
            android.view.VelocityTracker r5 = r4.j
            if (r5 == 0) goto L8a
            r5.addMovement(r7)
        L8a:
            boolean r5 = r4.f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }
}
