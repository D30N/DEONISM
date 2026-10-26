package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.BitmapFactory;
import b.g.k.g;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@TargetApi(21)
/* loaded from: classes.dex */
public class a extends b {
    public a(com.facebook.imagepipeline.memory.e eVar, int i, g gVar) {
        super(eVar, i, gVar);
    }

    @Override // com.facebook.imagepipeline.platform.b
    public int e(int i, int i2, BitmapFactory.Options options) {
        return com.facebook.imageutils.a.d(i, i2, options.inPreferredConfig);
    }
}
