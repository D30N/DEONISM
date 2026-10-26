package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0972Zc implements DX {
    public static byte[] A0C;
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public C0556Iu A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final DI A0A;
    public final C0543Ih A0B = new C0543Ih(new byte[10]);
    public int A03 = 0;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 22);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A0C = new byte[]{78, 123, 109, 76, 123, Byte.MAX_VALUE, 122, 123, 108, 99, 88, 83, 78, 70, 83, 85, 66, 83, 82, 22, 69, 66, 87, 68, 66, 22, 95, 88, 82, 95, 85, 87, 66, 89, 68, 12, 22, 83, 78, 70, 83, 85, 66, 83, 82, 22, 46, 21, 30, 3, 11, 30, 24, 15, 30, 31, 91, 8, 15, 26, 9, 15, 91, 18, 21, 31, 18, 24, 26, 15, 20, 9, 91, 9, 30, 26, 31, 18, 21, 28, 91, 30, 3, 15, 30, 21, 31, 30, 31, 91, 19, 30, 26, 31, 30, 9, 41, 18, 25, 4, 12, 25, 31, 8, 25, 24, 92, 15, 8, 29, 14, 8, 92, 31, 19, 24, 25, 92, 12, 14, 25, 26, 21, 4, 70, 92, 12, 65, 67, 94, 73, 12, 78, 85, 88, 73, 95};
    }

    public C0972Zc(DI di) {
        this.A0A = di;
    }

    private void A01() {
        C0972Zc c0972Zc = this;
        long jA04 = 0;
        int i = 0;
        int i2 = 0;
        char c2 = 0;
        boolean z = false;
        int i3 = 0;
        c0972Zc.A0B.A07(0);
        c0972Zc.A04 = -9223372036854775807L;
        char c3 = c0972Zc.A08 ? (char) 2 : (char) 6;
        while (true) {
            switch (c3) {
                case 2:
                    c0972Zc = c0972Zc;
                    i = 4;
                    c0972Zc.A0B.A08(4);
                    i2 = 3;
                    c2 = 30;
                    z = true;
                    z = true;
                    c0972Zc.A0B.A08(1);
                    i3 = 15;
                    c0972Zc.A0B.A08(1);
                    jA04 = (c0972Zc.A0B.A04(3) << 30) | (c0972Zc.A0B.A04(15) << 15) | c0972Zc.A0B.A04(15);
                    c0972Zc.A0B.A08(1);
                    if (!c0972Zc.A09) {
                        c3 = 3;
                        break;
                    } else {
                        c3 = 5;
                        break;
                    }
                case 3:
                    c0972Zc = c0972Zc;
                    if (!c0972Zc.A07) {
                        c3 = 5;
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    c0972Zc = c0972Zc;
                    c0972Zc.A0B.A08(i);
                    c0972Zc.A0B.A08(z ? 1 : 0);
                    c0972Zc.A0B.A08(z ? 1 : 0);
                    c0972Zc.A0B.A08(z ? 1 : 0);
                    c0972Zc.A05.A07((c0972Zc.A0B.A04(i2) << c2) | (c0972Zc.A0B.A04(i3) << i3) | c0972Zc.A0B.A04(i3));
                    c0972Zc.A09 = z;
                    c3 = 5;
                    break;
                case 5:
                    c0972Zc = c0972Zc;
                    c0972Zc.A04 = c0972Zc.A05.A07(jA04);
                    c3 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }

    private void A03(int i) {
        this.A03 = i;
        this.A00 = 0;
    }

    private boolean A04() {
        C0972Zc c0972Zc = this;
        int packetLength = 0;
        c0972Zc.A0B.A07(0);
        int iA04 = c0972Zc.A0B.A04(24);
        char c2 = iA04 != 1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    Log.w(A00(0, 9, 8), A00(96, 30, 106) + iA04);
                    c0972Zc.A02 = -1;
                    return false;
                case 3:
                    c0972Zc = c0972Zc;
                    c0972Zc.A0B.A08(8);
                    packetLength = c0972Zc.A0B.A04(16);
                    c0972Zc.A0B.A08(5);
                    c0972Zc.A06 = c0972Zc.A0B.A0F();
                    c0972Zc.A0B.A08(2);
                    c0972Zc.A08 = c0972Zc.A0B.A0F();
                    c0972Zc.A07 = c0972Zc.A0B.A0F();
                    c0972Zc.A0B.A08(6);
                    c0972Zc.A01 = c0972Zc.A0B.A04(8);
                    if (packetLength != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0972Zc = c0972Zc;
                    c0972Zc.A02 = -1;
                    c2 = 5;
                    break;
                case 5:
                    return true;
                case 6:
                    c0972Zc = c0972Zc;
                    c0972Zc.A02 = ((packetLength + 6) - 9) - c0972Zc.A01;
                    c2 = 5;
                    break;
            }
        }
    }

    private boolean A05(C0544Ii c0544Ii, byte[] bArr, int i) {
        C0972Zc c0972Zc = this;
        int iMin = Math.min(c0544Ii.A04(), i - c0972Zc.A00);
        boolean z = true;
        char c2 = iMin <= 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return z;
                case 3:
                    bArr = bArr;
                    if (bArr != null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Z(iMin);
                    c2 = 5;
                    break;
                case 5:
                    c0972Zc = c0972Zc;
                    c0972Zc.A00 += iMin;
                    if (c0972Zc.A00 != i) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return z;
                case 7:
                    z = false;
                    c2 = 6;
                    break;
                case '\b':
                    c0972Zc = c0972Zc;
                    c0544Ii = c0544Ii;
                    bArr = bArr;
                    c0544Ii.A0c(bArr, c0972Zc.A00, iMin);
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DX
    public final void A48(C0544Ii c0544Ii, boolean z) throws AF {
        C0544Ii c0544Ii2 = c0544Ii;
        C0972Zc c0972Zc = this;
        String strA00 = null;
        int padding = 0;
        int iA04 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        char c2 = z ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    c0972Zc = c0972Zc;
                    i4 = c0972Zc.A03;
                    if (i4 == 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i4 == 1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    strA00 = A00(0, 9, 8);
                    if (i4 == 2) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i4 == 3) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0972Zc = c0972Zc;
                    c0972Zc.A03(1);
                    c2 = 7;
                    break;
                case 7:
                    c0544Ii2 = c0544Ii2;
                    if (c0544Ii2.A04() <= 0) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0972Zc = c0972Zc;
                    i3 = c0972Zc.A03;
                    if (i3 == 0) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    i = 0;
                    if (i3 == 1) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (i3 == 2) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    if (i3 == 3) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case '\f':
                    c0972Zc = c0972Zc;
                    c0544Ii2 = c0544Ii2;
                    iA04 = c0544Ii2.A04();
                    padding = c0972Zc.A02;
                    if (padding != -1) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    if (i <= 0) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c0544Ii2 = c0544Ii2;
                    iA04 -= i;
                    c0544Ii2.A0X(c0544Ii2.A06() + iA04);
                    c2 = 15;
                    break;
                case 15:
                    c0972Zc = c0972Zc;
                    c0544Ii2 = c0544Ii2;
                    c0972Zc.A0A.A47(c0544Ii2);
                    i2 = c0972Zc.A02;
                    if (i2 == -1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c0972Zc = c0972Zc;
                    c0972Zc.A02 = i2 - iA04;
                    if (c0972Zc.A02 != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c0972Zc = c0972Zc;
                    c0972Zc.A0A.ABa();
                    c0972Zc.A03(1);
                    c2 = 7;
                    break;
                case 18:
                    i = iA04 - padding;
                    c2 = '\r';
                    break;
                case 19:
                    c0972Zc = c0972Zc;
                    c0544Ii2 = c0544Ii2;
                    if (!c0972Zc.A05(c0544Ii2, c0972Zc.A0B.A00, Math.min(10, c0972Zc.A01))) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c0972Zc = c0972Zc;
                    c0544Ii2 = c0544Ii2;
                    if (!c0972Zc.A05(c0544Ii2, null, c0972Zc.A01)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    c0972Zc = c0972Zc;
                    c0972Zc.A01();
                    c0972Zc.A0A.ABb(c0972Zc.A04, c0972Zc.A06);
                    c0972Zc.A03(3);
                    c2 = 7;
                    break;
                case 22:
                    c0972Zc = c0972Zc;
                    c0544Ii2 = c0544Ii2;
                    if (!c0972Zc.A05(c0544Ii2, c0972Zc.A0B.A00, 9)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    c0972Zc = c0972Zc;
                    if (!c0972Zc.A04()) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    i = 2;
                    c2 = 25;
                    break;
                case 25:
                    c0972Zc = c0972Zc;
                    c0972Zc.A03(i);
                    c2 = 7;
                    break;
                case 26:
                    c0544Ii2 = c0544Ii2;
                    c0544Ii2.A0Z(c0544Ii2.A04());
                    c2 = 7;
                    break;
                case 27:
                    c0972Zc = c0972Zc;
                    if (c0972Zc.A02 == -1) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    c0972Zc = c0972Zc;
                    strA00 = strA00;
                    Log.w(strA00, A00(9, 37, 32) + c0972Zc.A02 + A00(126, 11, 58));
                    c2 = 29;
                    break;
                case 29:
                    c0972Zc = c0972Zc;
                    c0972Zc.A0A.ABa();
                    c2 = 6;
                    break;
                case 30:
                    strA00 = strA00;
                    Log.w(strA00, A00(46, 50, 109));
                    c2 = 6;
                    break;
                case 31:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DX
    public final void A7V(C0556Iu c0556Iu, CE ce, DW dw) {
        this.A05 = c0556Iu;
        this.A0A.A4U(ce, dw);
    }

    @Override // com.facebook.ads.redexgen.X.DX
    public final void ACo() {
        this.A03 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A0A.ACo();
    }
}
