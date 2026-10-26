package com.facebook.ads.redexgen.X;

import android.os.SystemClock;
import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class YK implements BC {
    public static byte[] A01;
    public final /* synthetic */ YL A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 109);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{31, 19, 2, 33, 36, 35, 56, 62, 36, 34, 113, 48, 36, 53, 56, 62, 113, 37, 56, 60, 52, 34, 37, 48, 60, 33, 113, 121, 55, 35, 48, 60, 52, 113, 33, 62, 34, 56, 37, 56, 62, 63, 113, 60, 56, 34, 60, 48, 37, 50, 57, 120, 107, 113, 74, 100, 109, 108, 113, 106, 109, 100, 35, 106, 110, 115, 108, 112, 112, 106, 97, 111, 122, 35, 111, 98, 113, 100, 102, 35, 98, 118, 103, 106, 108, 35, 111, 98, 119, 102, 109, 96, 122, 57, 35, 97, 85, 68, 73, 79, 116, 82, 65, 67, 75, 112, 83, 86, 81, 74, 76, 86, 80, 3, 66, 86, 71, 74, 76, 3, 87, 74, 78, 70, 80, 87, 66, 78, 83, 3, 11, 80, 90, 80, 87, 70, 78, 3, 64, 79, 76, 64, 72, 3, 78, 74, 80, 78, 66, 87, 64, 75, 10, 25, 3};
    }

    public YK(YL yl) {
        this.A00 = yl;
    }

    public /* synthetic */ YK(YL yl, BF bf) {
        this(yl);
    }

    @Override // com.facebook.ads.redexgen.X.BC
    public final void AA1(long j) {
        Log.w(A00(95, 10, 77), A00(54, 41, 110) + j);
    }

    @Override // com.facebook.ads.redexgen.X.BC
    public final void AAf(long j, long j2, long j3, long j4) {
        StringBuilder sb = new StringBuilder();
        sb.append(A00(2, 52, 60));
        sb.append(j);
        String strA00 = A00(0, 2, 94);
        sb.append(strA00);
        sb.append(j2);
        sb.append(strA00);
        sb.append(j3);
        sb.append(strA00);
        sb.append(j4);
        sb.append(strA00);
        sb.append(this.A00.A03());
        sb.append(strA00);
        sb.append(this.A00.A04());
        String string = sb.toString();
        if (!YL.A0q) {
            Log.w(A00(95, 10, 77), string);
            return;
        }
        throw new BI(string, null);
    }

    @Override // com.facebook.ads.redexgen.X.BC
    public final void AB9(long j, long j2, long j3, long j4) {
        StringBuilder sb = new StringBuilder();
        sb.append(A00(105, 50, 78));
        sb.append(j);
        String strA00 = A00(0, 2, 94);
        sb.append(strA00);
        sb.append(j2);
        sb.append(strA00);
        sb.append(j3);
        sb.append(strA00);
        sb.append(j4);
        sb.append(strA00);
        sb.append(this.A00.A03());
        sb.append(strA00);
        sb.append(this.A00.A04());
        String string = sb.toString();
        if (!YL.A0q) {
            Log.w(A00(95, 10, 77), string);
            return;
        }
        throw new BI(string, null);
    }

    @Override // com.facebook.ads.redexgen.X.BC
    public final void ABG(int i, long j) {
        if (this.A00.A0R == null) {
            return;
        }
        this.A00.A0R.ABH(i, j, SystemClock.elapsedRealtime() - this.A00.A0E);
    }
}
