package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.support.annotation.Nullable;
import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.Lc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0614Lc {
    @Nullable
    public static Serializable A00(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        Serializable result = parcelObtain.readSerializable();
        parcelObtain.recycle();
        return result;
    }

    @Nullable
    public static byte[] A01(@Nullable Serializable serializable) {
        if (serializable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeSerializable(serializable);
        byte[] result = parcelObtain.marshall();
        parcelObtain.recycle();
        return result;
    }
}
