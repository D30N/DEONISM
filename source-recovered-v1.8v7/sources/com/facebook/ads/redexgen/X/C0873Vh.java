package com.facebook.ads.redexgen.X;

import android.provider.Settings;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0873Vh implements InterfaceC02616d {
    public static byte[] A01;
    public final /* synthetic */ C0874Vi A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 96);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{0, 16, 1, 22, 22, 29, 44, 17, 1, 26, 20, 27, 7, 29, 22, 0, 0};
    }

    public C0873Vh(C0874Vi c0874Vi) {
        this.A00 = c0874Vi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        return this.A00.A03(Settings.System.getInt(r4.A00, A00(0, 17, 19), -1) / 255.0f);
    }
}
