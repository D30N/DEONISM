package b.g.l;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    private final View f928b;

    /* renamed from: c, reason: collision with root package name */
    private ViewTreeObserver f929c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f930d;

    private p(View view, Runnable runnable) {
        this.f928b = view;
        this.f929c = view.getViewTreeObserver();
        this.f930d = runnable;
    }

    public static p a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        p pVar = new p(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(pVar);
        view.addOnAttachStateChangeListener(pVar);
        return pVar;
    }

    public void b() {
        (this.f929c.isAlive() ? this.f929c : this.f928b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f928b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f930d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f929c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
