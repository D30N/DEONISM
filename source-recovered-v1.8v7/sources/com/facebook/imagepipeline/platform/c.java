package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import b.g.k.g;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@TargetApi(26)
/* loaded from: classes.dex */
public class c extends b {
    public c(com.facebook.imagepipeline.memory.e eVar, int i, g gVar) {
        super(eVar, i, gVar);
    }

    private static boolean g(BitmapFactory.Options options) {
        ColorSpace colorSpace = options.outColorSpace;
        return (colorSpace == null || !colorSpace.isWideGamut() || options.inPreferredConfig == Bitmap.Config.RGBA_F16) ? false : true;
    }

    @Override // com.facebook.imagepipeline.platform.b
    public int e(int i, int i2, BitmapFactory.Options options) {
        return g(options) ? i * i2 * 8 : com.facebook.imageutils.a.d(i, i2, options.inPreferredConfig);
    }
}
