package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import d.a.b.d.i;

@d.a.b.d.d
/* loaded from: classes.dex */
public class NativeRoundingFilter {
    static {
        b.a();
    }

    @d.a.b.d.d
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i, int i2, int i3, int i4);

    @d.a.b.d.d
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z);

    @d.a.b.d.d
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    @d.a.b.d.d
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    @d.a.b.d.d
    public static void toCircle(Bitmap bitmap, boolean z) {
        i.g(bitmap);
        nativeToCircleFilter(bitmap, z);
    }

    @d.a.b.d.d
    public static void toCircleFast(Bitmap bitmap, boolean z) {
        i.g(bitmap);
        nativeToCircleFastFilter(bitmap, z);
    }
}
