package d.b.a.b.l;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public class i {
    private long a;

    /* renamed from: b, reason: collision with root package name */
    private long f2965b;

    /* renamed from: c, reason: collision with root package name */
    private TimeInterpolator f2966c;

    /* renamed from: d, reason: collision with root package name */
    private int f2967d;
    private int e;

    public i(long j, long j2) {
        this.a = 0L;
        this.f2965b = 300L;
        this.f2966c = null;
        this.f2967d = 0;
        this.e = 1;
        this.a = j;
        this.f2965b = j2;
    }

    public i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.a = 0L;
        this.f2965b = 300L;
        this.f2966c = null;
        this.f2967d = 0;
        this.e = 1;
        this.a = j;
        this.f2965b = j2;
        this.f2966c = timeInterpolator;
    }

    static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f2967d = valueAnimator.getRepeatCount();
        iVar.e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f2958b : interpolator instanceof AccelerateInterpolator ? a.f2959c : interpolator instanceof DecelerateInterpolator ? a.f2960d : interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.a;
    }

    public long d() {
        return this.f2965b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f2966c;
        return timeInterpolator != null ? timeInterpolator : a.f2958b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (c() == iVar.c() && d() == iVar.d() && g() == iVar.g() && h() == iVar.h()) {
            return e().getClass().equals(iVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f2967d;
    }

    public int h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }
}
