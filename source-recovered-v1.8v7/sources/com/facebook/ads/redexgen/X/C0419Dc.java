package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Dc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0419Dc extends Exception {
    public static byte[] A04;
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    static {
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 2);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A04 = new byte[]{11, 7, 114, 121, 123, 67, 24, 57, 63, 51, 56, 57, 46, 124, 53, 50, 53, 40, 124, 58, 61, 53, 48, 57, 56, 102, 124, 30, 111, 99, 96, 108, 110, 45, 100, 108, 108, 100, 111, 102, 45, 98, 109, 103, 113, 108, 106, 103, 45, 102, 123, 108, 115, 111, 98, 122, 102, 113, 45, 78, 102, 103, 106, 98, 64, 108, 103, 102, 96, 87, 113, 98, 96, 104, 81, 102, 109, 103, 102, 113, 102, 113, 92, 78, 111, 105, 101, 110, 111, 120, 42, 99, 100, 99, 126, 42, 108, 107, 99, 102, 111, 110, 48, 42, 81};
    }

    public C0419Dc(Format format, Throwable th, boolean z, int i) {
        super(A01(83, 22, 8) + i + A01(27, 3, 65) + format, th);
        this.A02 = format.A0O;
        this.A03 = z;
        this.A00 = null;
        this.A01 = A00(i);
    }

    public C0419Dc(Format format, Throwable th, boolean z, String str) {
        super(A01(6, 21, 94) + str + A01(0, 2, 37) + format, th);
        this.A02 = format.A0O;
        this.A03 = z;
        this.A00 = str;
        this.A01 = C0560Iy.A01 >= 21 ? A02(th) : null;
    }

    public static String A00(int i) {
        String strA01 = null;
        char c2 = i < 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    strA01 = A01(2, 4, 30);
                    c2 = 3;
                    break;
                case 3:
                    return A01(30, 53, 1) + strA01 + Math.abs(i);
                case 4:
                    strA01 = A01(2, 0, 54);
                    c2 = 3;
                    break;
            }
        }
    }

    @TargetApi(21)
    public static String A02(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
