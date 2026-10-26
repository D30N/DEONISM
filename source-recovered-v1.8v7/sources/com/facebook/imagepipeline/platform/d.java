package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public interface d {
    d.a.b.h.a<Bitmap> a(d.a.e.j.e eVar, Bitmap.Config config, @Nullable Rect rect, int i);

    d.a.b.h.a<Bitmap> b(d.a.e.j.e eVar, Bitmap.Config config, @Nullable Rect rect, @Nullable ColorSpace colorSpace);

    d.a.b.h.a<Bitmap> c(d.a.e.j.e eVar, Bitmap.Config config, @Nullable Rect rect, int i, @Nullable ColorSpace colorSpace);
}
