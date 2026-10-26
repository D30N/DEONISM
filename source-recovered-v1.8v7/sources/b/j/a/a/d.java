package b.j.a.a;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
abstract class d implements Interpolator {
    private final float[] a;

    /* renamed from: b, reason: collision with root package name */
    private final float f963b;

    protected d(float[] fArr) {
        this.a = fArr;
        this.f963b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.a;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f963b;
        float f3 = (f - (iMin * f2)) / f2;
        float[] fArr2 = this.a;
        return fArr2[iMin] + (f3 * (fArr2[iMin + 1] - fArr2[iMin]));
    }
}
