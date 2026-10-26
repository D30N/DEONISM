package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.Yr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0961Yr extends CQ {
    public static byte[] A03;
    public static final int[] A04;
    public int A00;
    public boolean A01;
    public boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 16);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A03 = new byte[]{13, 25, 8, 5, 3, 67, 11, 91, 93, 93, 65, 13, 0, 13, 27, 92, 72, 89, 84, 82, 18, 90, 10, 12, 12, 16, 80, 81, 92, 74, 20, 32, 49, 60, 58, 117, 51, 58, 39, 56, 52, 33, 117, 59, 58, 33, 117, 38, 32, 37, 37, 58, 39, 33, 48, 49, 111, 117, 79, 91, 74, 71, 65, 1, 67, 94, 75, 73, 44, 56, 41, 36, 34, 98, 32, 61, 121, 44, 96, 33, 44, 57, 32};
    }

    static {
        A01();
        A04 = new int[]{5512, 11025, 22050, 44100};
    }

    public C0961Yr(CO co) {
        super(co);
    }

    @Override // com.facebook.ads.redexgen.X.CQ
    public final void A0B(C0544Ii c0544Ii, long j) throws AF {
        C0544Ii c0544Ii2 = c0544Ii;
        int iA0E = 0;
        boolean z = false;
        C0961Yr c0961Yr = this;
        C0544Ii c0544Ii3 = c0544Ii2;
        char c2 = c0961Yr.A00 == 2 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii2 = c0544Ii2;
                    c0961Yr = c0961Yr;
                    c0544Ii3 = c0544Ii3;
                    int iA04 = c0544Ii2.A04();
                    ((CQ) c0961Yr).A00.ACk(c0544Ii3, iA04);
                    ((CQ) c0961Yr).A00.ACl(j, 1, iA04, 0, null);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c0544Ii2 = c0544Ii2;
                    iA0E = c0544Ii2.A0E();
                    z = true;
                    if (iA0E != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0961Yr = c0961Yr;
                    if (!c0961Yr.A01) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    c0544Ii2 = c0544Ii2;
                    c0961Yr = c0961Yr;
                    c0544Ii3 = c0544Ii3;
                    byte[] bArr = new byte[c0544Ii2.A04()];
                    c0544Ii3.A0c(bArr, 0, bArr.length);
                    Pair<Integer, Integer> pairA03 = IN.A03(bArr);
                    ((CQ) c0961Yr).A00.A5A(Format.A07(null, A00(68, 15, 93), null, -1, -1, ((Integer) pairA03.second).intValue(), ((Integer) pairA03.first).intValue(), Collections.singletonList(bArr), null, 0, null));
                    c0961Yr.A01 = z;
                    c2 = 3;
                    break;
                case 7:
                    c0961Yr = c0961Yr;
                    if (c0961Yr.A00 != 10) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (iA0E != z) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0544Ii2 = c0544Ii2;
                    c0961Yr = c0961Yr;
                    c0544Ii3 = c0544Ii3;
                    int iA042 = c0544Ii2.A04();
                    ((CQ) c0961Yr).A00.ACk(c0544Ii3, iA042);
                    ((CQ) c0961Yr).A00.ACl(j, 1, iA042, 0, null);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CQ
    public final boolean A0C(C0544Ii c0544Ii) throws C0965Yv {
        C0544Ii c0544Ii2 = c0544Ii;
        int i = 0;
        String strA00 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        int iA0E = 0;
        C0961Yr c0961Yr = this;
        char c2 = !c0961Yr.A02 ? (char) 2 : (char) 16;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii2 = c0544Ii2;
                    c0961Yr = c0961Yr;
                    iA0E = c0544Ii2.A0E();
                    c0961Yr.A00 = (iA0E >> 4) & 15;
                    i4 = c0961Yr.A00;
                    i3 = 3;
                    if (i4 != 2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0961Yr = c0961Yr;
                    ((CQ) c0961Yr).A00.A5A(Format.A07(null, A00(58, 10, 62), null, -1, -1, 1, A04[(iA0E >> 2) & i3], null, null, 0, null));
                    c0961Yr.A01 = true;
                    c2 = 4;
                    break;
                case 4:
                    c0961Yr = c0961Yr;
                    c0961Yr.A02 = true;
                    c2 = 5;
                    break;
                case 5:
                    return true;
                case 6:
                    i2 = 7;
                    if (i4 == 7) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i4 != 8) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0961Yr = c0961Yr;
                    if (c0961Yr.A00 != i2) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    strA00 = A00(0, 15, k.AppCompatTheme_windowNoTitle);
                    c2 = '\n';
                    break;
                case '\n':
                    strA00 = strA00;
                    str = strA00;
                    if ((iA0E & 1) != 1) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    i = 2;
                    c2 = '\f';
                    break;
                case '\f':
                    c0961Yr = c0961Yr;
                    str = str;
                    ((CQ) c0961Yr).A00.A5A(Format.A06(null, str, null, -1, -1, 1, 8000, i, null, null, 0, null));
                    c0961Yr.A01 = true;
                    c2 = 4;
                    break;
                case '\r':
                    i = 3;
                    c2 = '\f';
                    break;
                case 14:
                    strA00 = A00(15, 15, 45);
                    c2 = '\n';
                    break;
                case 15:
                    if (i4 != 10) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 16:
                    c0544Ii2 = c0544Ii2;
                    c0544Ii2.A0Z(1);
                    c2 = 5;
                    break;
                case 17:
                    String type = A00(30, 28, 69) + c0961Yr.A00;
                    throw new C0965Yv(type);
            }
        }
    }
}
