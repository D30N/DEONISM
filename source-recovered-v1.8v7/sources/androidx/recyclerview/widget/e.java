package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import b.g.l.r;

/* loaded from: classes.dex */
class e extends RecyclerView.n implements RecyclerView.s {
    private static final int[] D = {R.attr.state_pressed};
    private static final int[] E = new int[0];
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final int f642b;

    /* renamed from: c, reason: collision with root package name */
    final StateListDrawable f643c;

    /* renamed from: d, reason: collision with root package name */
    final Drawable f644d;
    private final int e;
    private final int f;
    private final StateListDrawable g;
    private final Drawable h;
    private final int i;
    private final int j;
    int k;
    int l;
    float m;
    int n;
    int o;
    float p;
    private RecyclerView s;
    private int q = 0;
    private int r = 0;
    private boolean t = false;
    private boolean u = false;
    private int v = 0;
    private int w = 0;
    private final int[] x = new int[2];
    private final int[] y = new int[2];
    final ValueAnimator z = ValueAnimator.ofFloat(0.0f, 1.0f);
    int A = 0;
    private final Runnable B = new a();
    private final RecyclerView.t C = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.q(500);
        }
    }

    class b extends RecyclerView.t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i, int i2) {
            e.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {
        private boolean a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
                return;
            }
            if (((Float) e.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                e eVar = e.this;
                eVar.A = 0;
                eVar.y(0);
            } else {
                e eVar2 = e.this;
                eVar2.A = 2;
                eVar2.v();
            }
        }
    }

    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            e.this.f643c.setAlpha(iFloatValue);
            e.this.f644d.setAlpha(iFloatValue);
            e.this.v();
        }
    }

    e(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f643c = stateListDrawable;
        this.f644d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.f642b = i3;
        this.f643c.setAlpha(255);
        this.f644d.setAlpha(255);
        this.z.addListener(new c());
        this.z.addUpdateListener(new d());
        j(recyclerView);
    }

    private void C(float f) {
        int[] iArrP = p();
        float fMax = Math.max(iArrP[0], Math.min(iArrP[1], f));
        if (Math.abs(this.l - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.m, fMax, iArrP, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
        if (iX != 0) {
            this.s.scrollBy(0, iX);
        }
        this.m = fMax;
    }

    private void k() {
        this.s.removeCallbacks(this.B);
    }

    private void l() {
        this.s.removeItemDecoration(this);
        this.s.removeOnItemTouchListener(this);
        this.s.removeOnScrollListener(this.C);
        k();
    }

    private void m(Canvas canvas) {
        int i = this.r;
        int i2 = this.i;
        int i3 = this.o;
        int i4 = this.n;
        this.g.setBounds(0, 0, i4, i2);
        this.h.setBounds(0, 0, this.q, this.j);
        canvas.translate(0.0f, i - i2);
        this.h.draw(canvas);
        canvas.translate(i3 - (i4 / 2), 0.0f);
        this.g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void n(Canvas canvas) {
        int i = this.q;
        int i2 = this.e;
        int i3 = i - i2;
        int i4 = this.l;
        int i5 = this.k;
        int i6 = i4 - (i5 / 2);
        this.f643c.setBounds(0, 0, i2, i5);
        this.f644d.setBounds(0, 0, this.f, this.r);
        if (s()) {
            this.f644d.draw(canvas);
            canvas.translate(this.e, i6);
            canvas.scale(-1.0f, 1.0f);
            this.f643c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i3 = this.e;
        } else {
            canvas.translate(i3, 0.0f);
            this.f644d.draw(canvas);
            canvas.translate(0.0f, i6);
            this.f643c.draw(canvas);
        }
        canvas.translate(-i3, -i6);
    }

    private int[] o() {
        int[] iArr = this.y;
        int i = this.f642b;
        iArr[0] = i;
        iArr[1] = this.q - i;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.x;
        int i = this.f642b;
        iArr[0] = i;
        iArr[1] = this.r - i;
        return iArr;
    }

    private void r(float f) {
        int[] iArrO = o();
        float fMax = Math.max(iArrO[0], Math.min(iArrO[1], f));
        if (Math.abs(this.o - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.p, fMax, iArrO, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
        if (iX != 0) {
            this.s.scrollBy(iX, 0);
        }
        this.p = fMax;
    }

    private boolean s() {
        return r.v(this.s) == 1;
    }

    private void w(int i) {
        k();
        this.s.postDelayed(this.B, i);
    }

    private int x(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    private void z() {
        this.s.addItemDecoration(this);
        this.s.addOnItemTouchListener(this);
        this.s.addOnScrollListener(this.C);
    }

    public void A() {
        int i = this.A;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.z.setDuration(500L);
        this.z.setStartDelay(0L);
        this.z.start();
    }

    void B(int i, int i2) {
        int iComputeVerticalScrollRange = this.s.computeVerticalScrollRange();
        int i3 = this.r;
        this.t = iComputeVerticalScrollRange - i3 > 0 && i3 >= this.a;
        int iComputeHorizontalScrollRange = this.s.computeHorizontalScrollRange();
        int i4 = this.q;
        boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= this.a;
        this.u = z;
        if (!this.t && !z) {
            if (this.v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (this.t) {
            float f = i3;
            this.l = (int) ((f * (i2 + (f / 2.0f))) / iComputeVerticalScrollRange);
            this.k = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (this.u) {
            float f2 = i4;
            this.o = (int) ((f2 * (i + (f2 / 2.0f))) / iComputeHorizontalScrollRange);
            this.n = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
        }
        int i5 = this.v;
        if (i5 == 0 || i5 == 1) {
            y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.v;
        if (i == 1) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zU && !zT) {
                return false;
            }
            if (zT) {
                this.w = 1;
                this.p = (int) motionEvent.getX();
            } else if (zU) {
                this.w = 2;
                this.m = (int) motionEvent.getY();
            }
            y(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (zU || zT) {
                if (zT) {
                    this.w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (zU) {
                    this.w = 2;
                    this.m = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.v == 2) {
            this.m = 0.0f;
            this.p = 0.0f;
            y(1);
            this.w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.v == 2) {
            A();
            if (this.w == 1) {
                r(motionEvent.getX());
            }
            if (this.w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void c(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.q != this.s.getWidth() || this.r != this.s.getHeight()) {
            this.q = this.s.getWidth();
            this.r = this.s.getHeight();
            y(0);
        } else if (this.A != 0) {
            if (this.t) {
                n(canvas);
            }
            if (this.u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    void q(int i) {
        int i2 = this.A;
        if (i2 == 1) {
            this.z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.z.setDuration(i);
        this.z.start();
    }

    boolean t(float f, float f2) {
        if (f2 >= this.r - this.i) {
            int i = this.o;
            int i2 = this.n;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean u(float f, float f2) {
        if (!s() ? f >= this.q - this.e : f <= this.e / 2) {
            int i = this.l;
            int i2 = this.k;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    void v() {
        this.s.invalidate();
    }

    void y(int i) {
        int i2;
        if (i == 2 && this.v != 2) {
            this.f643c.setState(D);
            k();
        }
        if (i == 0) {
            v();
        } else {
            A();
        }
        if (this.v != 2 || i == 2) {
            i2 = i == 1 ? 1500 : 1200;
            this.v = i;
        }
        this.f643c.setState(E);
        w(i2);
        this.v = i;
    }
}
