package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0966Yw extends CQ {
    public static byte[] A05;
    public int A00;
    public int A01;
    public boolean A02;
    public final C0544Ii A03;
    public final C0544Ii A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 30);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A05 = new byte[]{70, 121, 116, 117, Byte.MAX_VALUE, 48, 118, Byte.MAX_VALUE, 98, 125, 113, 100, 48, 126, Byte.MAX_VALUE, 100, 48, 99, 101, 96, 96, Byte.MAX_VALUE, 98, 100, 117, 116, 42, 48, 60, 35, 46, 47, 37, 101, 43, 60, 41};
    }

    public C0966Yw(CO co) {
        super(co);
        this.A04 = new C0544Ii(C0540Ie.A02);
        this.A03 = new C0544Ii(4);
    }

    @Override // com.facebook.ads.redexgen.X.CQ
    public final void A0B(C0544Ii c0544Ii, long j) throws AF {
        C0544Ii c0544Ii2 = c0544Ii;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        CO co = null;
        int i4 = 0;
        int compositionTimeMs = 0;
        C0966Yw c0966Yw = this;
        C0544Ii c0544Ii3 = c0544Ii2;
        int iA0E = c0544Ii2.A0E();
        long jA09 = j + (c0544Ii2.A09() * 1000);
        int nalUnitLengthFieldLengthDiff = 0;
        char c2 = iA0E == 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0966Yw = c0966Yw;
                    if (!c0966Yw.A02) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 3:
                    c0544Ii2 = c0544Ii2;
                    c0966Yw = c0966Yw;
                    c0544Ii3 = c0544Ii3;
                    nalUnitLengthFieldLengthDiff = 0;
                    C0544Ii c0544Ii4 = new C0544Ii(new byte[c0544Ii2.A04()]);
                    c0544Ii3.A0c(c0544Ii4.A00, 0, c0544Ii2.A04());
                    J0 j0A00 = J0.A00(c0544Ii4);
                    c0966Yw.A01 = j0A00.A02;
                    ((CQ) c0966Yw).A00.A5A(Format.A03(null, A00(28, 9, 84), null, -1, -1, j0A00.A03, j0A00.A01, -1.0f, j0A00.A04, -1, j0A00.A00, null));
                    c0966Yw.A02 = true;
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    compositionTimeMs = 1;
                    if (iA0E != 1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0966Yw = c0966Yw;
                    if (!c0966Yw.A02) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0966Yw = c0966Yw;
                    nalUnitLengthFieldLengthDiff = 0;
                    byte[] bArr = c0966Yw.A03.A00;
                    bArr[0] = 0;
                    bArr[compositionTimeMs] = 0;
                    bArr[2] = 0;
                    i3 = 4;
                    i2 = 4 - c0966Yw.A01;
                    i4 = 0;
                    c2 = '\b';
                    break;
                case '\b':
                    c0544Ii2 = c0544Ii2;
                    if (c0544Ii2.A04() <= 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0966Yw = c0966Yw;
                    c0544Ii3 = c0544Ii3;
                    c0544Ii3.A0c(c0966Yw.A03.A00, i2, c0966Yw.A01);
                    c0966Yw.A03.A0Y(nalUnitLengthFieldLengthDiff);
                    int iA0H = c0966Yw.A03.A0H();
                    c0966Yw.A04.A0Y(nalUnitLengthFieldLengthDiff);
                    ((CQ) c0966Yw).A00.ACk(c0966Yw.A04, i3);
                    ((CQ) c0966Yw).A00.ACk(c0544Ii3, iA0H);
                    i4 = i4 + 4 + iA0H;
                    c2 = '\b';
                    break;
                case '\n':
                    c0966Yw = c0966Yw;
                    co = ((CQ) c0966Yw).A00;
                    i = 1;
                    if (c0966Yw.A00 != 1) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    co = co;
                    co.ACl(jA09, i, i4, 0, null);
                    c2 = 4;
                    break;
                case '\f':
                    i = 0;
                    c2 = 11;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CQ
    public final boolean A0C(C0544Ii c0544Ii) throws C0965Yv {
        C0966Yw c0966Yw = this;
        boolean z = false;
        int iA0E = c0544Ii.A0E();
        int i = (iA0E >> 4) & 15;
        int i2 = iA0E & 15;
        int videoCodec = i2 == 7 ? 2 : 6;
        while (true) {
            switch (videoCodec) {
                case 2:
                    c0966Yw = c0966Yw;
                    c0966Yw.A00 = i;
                    if (i == 5) {
                        videoCodec = 5;
                        break;
                    } else {
                        videoCodec = 3;
                        break;
                    }
                case 3:
                    z = true;
                    videoCodec = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    videoCodec = 4;
                    break;
                case 6:
                    throw new C0965Yv(A00(0, 28, 14) + i2);
            }
        }
    }
}
