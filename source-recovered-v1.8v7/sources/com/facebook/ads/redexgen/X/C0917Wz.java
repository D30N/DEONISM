package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0917Wz implements InterfaceC02616d {
    public static byte[] A01;
    public final /* synthetic */ X0 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 19);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-56, -44, -45, -45, -54, -56, -39, -54, -55, -59, -46, -56, -42, -45, -51, -56, -110, -52, -59, -42, -56, -37, -59, -42, -55, -110, -39, -41, -58, -110, -59, -57, -40, -51, -45, -46, -110, -71, -73, -90, -61, -73, -72, -91, -72, -87};
    }

    public C0917Wz(X0 x0) {
        this.A00 = x0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        C0917Wz c0917Wz = this;
        AbstractC02766s abstractC02766sA07 = null;
        Bundle bundle = null;
        Bundle extras = null;
        Intent intentRegisterReceiver = c0917Wz.A00.A00.registerReceiver(null, new IntentFilter(A00(9, 37, 81)));
        char c2 = intentRegisterReceiver != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    intentRegisterReceiver = intentRegisterReceiver;
                    extras = intentRegisterReceiver.getExtras();
                    c2 = 3;
                    break;
                case 3:
                    bundle = extras;
                    if (bundle == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0917Wz = c0917Wz;
                    abstractC02766sA07 = c0917Wz.A00.A0F(bundle.getBoolean(A00(0, 9, 82)));
                    c2 = 5;
                    break;
                case 5:
                    return abstractC02766sA07;
                case 6:
                    c0917Wz = c0917Wz;
                    abstractC02766sA07 = c0917Wz.A00.A07(EnumC02726o.A06);
                    c2 = 5;
                    break;
            }
        }
    }
}
