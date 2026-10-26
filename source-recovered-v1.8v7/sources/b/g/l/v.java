package b.g.l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class v {
    private WeakReference<View> a;

    /* renamed from: b, reason: collision with root package name */
    Runnable f940b = null;

    /* renamed from: c, reason: collision with root package name */
    Runnable f941c = null;

    /* renamed from: d, reason: collision with root package name */
    int f942d = -1;

    class a extends AnimatorListenerAdapter {
        final /* synthetic */ w a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f943b;

        a(v vVar, w wVar, View view) {
            this.a = wVar;
            this.f943b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a.c(this.f943b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.a(this.f943b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.b(this.f943b);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ y a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f944b;

        b(v vVar, y yVar, View view) {
            this.a = yVar;
            this.f944b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.a(this.f944b);
        }
    }

    static class c implements w {
        v a;

        /* renamed from: b, reason: collision with root package name */
        boolean f945b;

        c(v vVar) {
            this.a = vVar;
        }

        @Override // b.g.l.w
        public void a(View view) {
            int i = this.a.f942d;
            if (i > -1) {
                view.setLayerType(i, null);
                this.a.f942d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f945b) {
                v vVar = this.a;
                Runnable runnable = vVar.f941c;
                if (runnable != null) {
                    vVar.f941c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                w wVar = tag instanceof w ? (w) tag : null;
                if (wVar != null) {
                    wVar.a(view);
                }
                this.f945b = true;
            }
        }

        @Override // b.g.l.w
        public void b(View view) {
            this.f945b = false;
            if (this.a.f942d > -1) {
                view.setLayerType(2, null);
            }
            v vVar = this.a;
            Runnable runnable = vVar.f940b;
            if (runnable != null) {
                vVar.f940b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            w wVar = tag instanceof w ? (w) tag : null;
            if (wVar != null) {
                wVar.b(view);
            }
        }

        @Override // b.g.l.w
        public void c(View view) {
            Object tag = view.getTag(2113929216);
            w wVar = tag instanceof w ? (w) tag : null;
            if (wVar != null) {
                wVar.c(view);
            }
        }
    }

    v(View view) {
        this.a = new WeakReference<>(view);
    }

    private void g(View view, w wVar) {
        if (wVar != null) {
            view.animate().setListener(new a(this, wVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public v a(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void b() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public v d(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public v e(Interpolator interpolator) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public v f(w wVar) {
        View view = this.a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, wVar);
                wVar = new c(this);
            }
            g(view, wVar);
        }
        return this;
    }

    public v h(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public v i(y yVar) {
        View view = this.a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(yVar != null ? new b(this, yVar, view) : null);
        }
        return this;
    }

    public void j() {
        View view = this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public v k(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
