package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.6f, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02636f {
    public final Map<Integer, C02575z<AbstractC02766s>> A00;

    @Nullable
    public static C02636f A02 = null;
    public static long A01 = 0;

    public C02636f(Map<Integer, C02575z<AbstractC02766s>> map) {
        this.A00 = map;
    }

    public static synchronized long A00() {
        return A01;
    }

    @SuppressLint({"UseSparseArrays"})
    public static C02636f A01() {
        if (A02 == null) {
            A02 = new C02636f(Collections.synchronizedMap(new HashMap()));
        }
        return A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5z != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    private synchronized void A02(C02575z<AbstractC02766s> c02575z, int i) {
        int iA05 = 0;
        boolean z = false;
        if (c02575z.A00() == 0) {
            z = true;
            iA05 = c02575z.A01().A05();
        }
        int updatedSize = i - iA05;
        A01 += (z ? 0 : 4) + updatedSize;
    }

    @SuppressLint({"PublicMethodReturnMutableCollection"})
    public final Map<Integer, C02575z<AbstractC02766s>> A03() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5z != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    public final synchronized void A04(int i, C02575z<AbstractC02766s> c02575z, int i2) {
        this.A00.put(Integer.valueOf(i), c02575z);
        A02(c02575z, i2);
    }
}
