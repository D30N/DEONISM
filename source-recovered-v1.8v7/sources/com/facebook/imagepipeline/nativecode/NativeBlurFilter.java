package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;

@d.a.b.d.d
/* loaded from: classes.dex */
public class NativeBlurFilter {
    static {
        b.a();
    }

    @d.a.b.d.d
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
