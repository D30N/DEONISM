package d.b.a.b.s;

import android.content.Context;
import android.graphics.Color;
import d.b.a.b.w.b;

/* loaded from: classes.dex */
public class a {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2974b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2975c;

    /* renamed from: d, reason: collision with root package name */
    private final float f2976d;

    public a(Context context) {
        this.a = b.b(context, d.b.a.b.b.elevationOverlayEnabled, false);
        this.f2974b = d.b.a.b.q.a.a(context, d.b.a.b.b.elevationOverlayColor, 0);
        this.f2975c = d.b.a.b.q.a.a(context, d.b.a.b.b.colorSurface, 0);
        this.f2976d = context.getResources().getDisplayMetrics().density;
    }

    private boolean e(int i) {
        return b.g.e.a.d(i, 255) == this.f2975c;
    }

    public float a(float f) {
        if (this.f2976d <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i, float f) {
        float fA = a(f);
        return b.g.e.a.d(d.b.a.b.q.a.f(b.g.e.a.d(i, 255), this.f2974b, fA), Color.alpha(i));
    }

    public int c(int i, float f) {
        return (this.a && e(i)) ? b(i, f) : i;
    }

    public boolean d() {
        return this.a;
    }
}
