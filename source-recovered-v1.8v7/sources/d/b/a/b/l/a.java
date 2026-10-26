package d.b.a.b.l;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public class a {
    public static final TimeInterpolator a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f2958b = new b.j.a.a.b();

    /* renamed from: c, reason: collision with root package name */
    public static final TimeInterpolator f2959c = new b.j.a.a.a();

    /* renamed from: d, reason: collision with root package name */
    public static final TimeInterpolator f2960d = new b.j.a.a.c();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }
}
