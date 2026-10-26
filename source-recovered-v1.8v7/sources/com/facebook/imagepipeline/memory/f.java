package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class f extends t<Bitmap> {
    @Override // com.facebook.imagepipeline.memory.t, com.facebook.imagepipeline.memory.c0
    @Nullable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int i) {
        Bitmap bitmap = (Bitmap) super.get(i);
        if (bitmap == null || !g(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    @Override // com.facebook.imagepipeline.memory.c0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int a(Bitmap bitmap) {
        return com.facebook.imageutils.a.e(bitmap);
    }

    protected boolean g(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            d.a.b.e.a.B("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        d.a.b.e.a.B("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
    }

    @Override // com.facebook.imagepipeline.memory.t, com.facebook.imagepipeline.memory.c0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(Bitmap bitmap) {
        if (g(bitmap)) {
            super.b(bitmap);
        }
    }
}
