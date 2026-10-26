package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;

@com.facebook.soloader.d
/* loaded from: classes.dex */
class PreverificationHelper {
    PreverificationHelper() {
    }

    @com.facebook.soloader.d
    @TargetApi(26)
    boolean shouldUseHardwareBitmapConfig(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }
}
