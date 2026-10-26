package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import java.util.Set;

/* loaded from: classes.dex */
public class p implements e {
    private final Set<Bitmap> a = d.a.b.d.j.b();

    @Override // d.a.b.g.e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int i) {
        double d2 = i;
        Double.isNaN(d2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(d2 / 2.0d), Bitmap.Config.RGB_565);
        this.a.add(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    @Override // d.a.b.g.e, d.a.b.h.h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap bitmap) {
        d.a.b.d.i.g(bitmap);
        this.a.remove(bitmap);
        bitmap.recycle();
    }
}
