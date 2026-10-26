package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import d.a.b.d.i;

@d.a.b.d.d
/* loaded from: classes.dex */
public class Bitmaps {
    static {
        a.a();
    }

    @d.a.b.d.d
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        i.b(bitmap2.getConfig() == bitmap.getConfig());
        i.b(bitmap.isMutable());
        i.b(bitmap.getWidth() == bitmap2.getWidth());
        i.b(bitmap.getHeight() == bitmap2.getHeight());
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @d.a.b.d.d
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
