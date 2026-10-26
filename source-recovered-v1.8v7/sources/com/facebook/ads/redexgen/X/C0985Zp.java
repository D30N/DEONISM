package com.facebook.ads.redexgen.X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0985Zp implements InterfaceC0425Dk {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 44);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A00 = new byte[]{42, 53, 56, 57, 51, 115, 61, 42, 63};
    }

    public C0985Zp() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0425Dk
    public final int A5l() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0425Dk
    public final MediaCodecInfo A5m(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0425Dk
    public final boolean A7m(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 9, 112).equals(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0425Dk
    public final boolean ACn() {
        return false;
    }
}
