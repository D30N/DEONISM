package androidx.appcompat.widget;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
class z0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static z0 k;
    private static z0 l;

    /* renamed from: b, reason: collision with root package name */
    private final View f333b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence f334c;

    /* renamed from: d, reason: collision with root package name */
    private final int f335d;
    private final Runnable e = new a();
    private final Runnable f = new b();
    private int g;
    private int h;
    private a1 i;
    private boolean j;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            z0.this.g(false);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z0.this.c();
        }
    }

    private z0(View view, CharSequence charSequence) {
        this.f333b = view;
        this.f334c = charSequence;
        this.f335d = b.g.l.s.c(ViewConfiguration.get(view.getContext()));
        b();
        this.f333b.setOnLongClickListener(this);
        this.f333b.setOnHoverListener(this);
    }

    private void a() {
        this.f333b.removeCallbacks(this.e);
    }

    private void b() {
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
    }

    private void d() {
        this.f333b.postDelayed(this.e, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(z0 z0Var) {
        z0 z0Var2 = k;
        if (z0Var2 != null) {
            z0Var2.a();
        }
        k = z0Var;
        if (z0Var != null) {
            z0Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        z0 z0Var = k;
        if (z0Var != null && z0Var.f333b == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new z0(view, charSequence);
            return;
        }
        z0 z0Var2 = l;
        if (z0Var2 != null && z0Var2.f333b == view) {
            z0Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.g) <= this.f335d && Math.abs(y - this.h) <= this.f335d) {
            return false;
        }
        this.g = x;
        this.h = y;
        return true;
    }

    void c() {
        if (l == this) {
            l = null;
            a1 a1Var = this.i;
            if (a1Var != null) {
                a1Var.c();
                this.i = null;
                b();
                this.f333b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (k == this) {
            e(null);
        }
        this.f333b.removeCallbacks(this.f);
    }

    void g(boolean z) throws Resources.NotFoundException {
        long longPressTimeout;
        if (b.g.l.r.I(this.f333b)) {
            e(null);
            z0 z0Var = l;
            if (z0Var != null) {
                z0Var.c();
            }
            l = this;
            this.j = z;
            a1 a1Var = new a1(this.f333b.getContext());
            this.i = a1Var;
            a1Var.e(this.f333b, this.g, this.h, this.j, this.f334c);
            this.f333b.addOnAttachStateChangeListener(this);
            if (this.j) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((b.g.l.r.C(this.f333b) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f333b.removeCallbacks(this.f);
            this.f333b.postDelayed(this.f, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.i != null && this.j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f333b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f333b.isEnabled() && this.i == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) throws Resources.NotFoundException {
        this.g = view.getWidth() / 2;
        this.h = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
