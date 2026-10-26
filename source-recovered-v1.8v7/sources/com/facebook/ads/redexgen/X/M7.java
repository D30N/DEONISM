package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;

/* loaded from: assets/audience_network.dex */
public final class M7 {
    public static Bitmap A00(M6 m6) {
        byte[] bArrDecode = Base64.decode(m6.A00(C0635Ly.A01), 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static Drawable A01(XI xi, M6 m6) {
        return new BitmapDrawable(xi.getResources(), A00(m6));
    }
}
