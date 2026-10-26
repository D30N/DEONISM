package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.Za, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0970Za implements DI {
    public static byte[] A0K;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public Format A0C;
    public CO A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public final String A0J;
    public final C0544Ii A0I = new C0544Ii(1024);
    public final C0543Ih A0H = new C0543Ih(this.A0I.A00);

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowFixedHeightMinor);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A0K = new byte[]{37, 49, 32, 45, 43, 107, 41, 52, 112, 37, 105, 40, 37, 48, 41};
    }

    public C0970Za(@Nullable String str) {
        this.A0J = str;
    }

    private int A00(C0543Ih c0543Ih) throws AF {
        int iA01 = c0543Ih.A01();
        Pair<Integer, Integer> pairA02 = IN.A02(c0543Ih, true);
        this.A05 = ((Integer) pairA02.first).intValue();
        this.A02 = ((Integer) pairA02.second).intValue();
        return iA01 - c0543Ih.A01();
    }

    private int A01(C0543Ih c0543Ih) throws AF {
        int i = 0;
        char c2 = this.A03 == 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0543Ih = c0543Ih;
                    int iA04 = c0543Ih.A04(8);
                    i += iA04;
                    if (iA04 == 255) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return i;
                case 4:
                    throw new AF();
            }
        }
    }

    public static long A02(C0543Ih c0543Ih) {
        return c0543Ih.A04((c0543Ih.A04(2) + 1) * 8);
    }

    private void A05(int i) {
        this.A0I.A0W(i);
        this.A0H.A0B(this.A0I.A00);
    }

    private void A06(C0543Ih c0543Ih) throws AF {
        C0970Za c0970Za = this;
        char c2 = !c0543Ih.A0F() ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    c0970Za = c0970Za;
                    c0543Ih = c0543Ih;
                    c0970Za.A0G = true;
                    c0970Za.A08(c0543Ih);
                    c2 = 3;
                    break;
                case 3:
                    c0970Za = c0970Za;
                    if (c0970Za.A00 != 0) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0970Za = c0970Za;
                    if (c0970Za.A04 != 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0970Za = c0970Za;
                    c0543Ih = c0543Ih;
                    c0970Za.A09(c0543Ih, c0970Za.A01(c0543Ih));
                    if (!c0970Za.A0F) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0970Za = c0970Za;
                    c0543Ih = c0543Ih;
                    c0543Ih.A08((int) c0970Za.A09);
                    c2 = 7;
                    break;
                case 7:
                    return;
                case '\b':
                    c0970Za = c0970Za;
                    if (!c0970Za.A0G) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case '\t':
                    return;
                case '\n':
                    throw new AF();
                case 11:
                    throw new AF();
            }
        }
    }

    private void A07(C0543Ih c0543Ih) {
        int i = 0;
        int i2 = 0;
        this.A03 = c0543Ih.A04(3);
        int i3 = this.A03;
        char c2 = i3 != 0 ? (char) 2 : '\f';
        while (true) {
            switch (c2) {
                case 2:
                    i = 1;
                    if (i3 == 1) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i2 = 6;
                    if (i3 == 3) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i3 == 4) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i3 == 5) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i3 == i2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i3 == 7) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return;
                case '\t':
                    c0543Ih = c0543Ih;
                    c0543Ih.A08(i);
                    c2 = '\b';
                    break;
                case '\n':
                    c0543Ih = c0543Ih;
                    c0543Ih.A08(i2);
                    c2 = '\b';
                    break;
                case 11:
                    c0543Ih = c0543Ih;
                    c0543Ih.A08(9);
                    c2 = '\b';
                    break;
                case '\f':
                    c0543Ih = c0543Ih;
                    c0543Ih.A08(8);
                    c2 = '\b';
                    break;
            }
        }
    }

    private void A08(C0543Ih c0543Ih) throws AF {
        C0543Ih c0543Ih2 = c0543Ih;
        C0970Za c0970Za = this;
        int i = 0;
        Format format = null;
        int numLayer = 0;
        int iA04 = 0;
        C0970Za c0970Za2 = c0970Za;
        C0543Ih c0543Ih3 = c0543Ih2;
        int iA042 = c0543Ih3.A04(1);
        int numProgram = iA042 == 1 ? 2 : 20;
        while (true) {
            switch (numProgram) {
                case 2:
                    c0543Ih3 = c0543Ih3;
                    iA04 = c0543Ih3.A04(1);
                    numProgram = 3;
                    break;
                case 3:
                    c0970Za2 = c0970Za2;
                    c0970Za2.A00 = iA04;
                    int numProgram2 = c0970Za2.A00;
                    if (numProgram2 != 0) {
                        numProgram = 23;
                        break;
                    } else {
                        numProgram = 4;
                        break;
                    }
                case 4:
                    if (iA042 != 1) {
                        numProgram = 6;
                        break;
                    } else {
                        numProgram = 5;
                        break;
                    }
                case 5:
                    c0543Ih2 = c0543Ih2;
                    A02(c0543Ih2);
                    numProgram = 6;
                    break;
                case 6:
                    c0543Ih2 = c0543Ih2;
                    if (!c0543Ih2.A0F()) {
                        numProgram = 22;
                        break;
                    } else {
                        numProgram = 7;
                        break;
                    }
                case 7:
                    c0970Za2 = c0970Za2;
                    c0543Ih3 = c0543Ih3;
                    c0970Za2.A04 = c0543Ih3.A04(6);
                    int iA043 = c0543Ih3.A04(4);
                    numLayer = c0543Ih3.A04(3);
                    if (iA043 != 0) {
                        numProgram = 21;
                        break;
                    } else {
                        numProgram = 8;
                        break;
                    }
                case 8:
                    if (numLayer != 0) {
                        numProgram = 21;
                        break;
                    } else {
                        numProgram = 9;
                        break;
                    }
                case 9:
                    i = 8;
                    if (iA042 != 0) {
                        numProgram = 19;
                        break;
                    } else {
                        numProgram = 10;
                        break;
                    }
                case 10:
                    c0970Za = c0970Za;
                    c0543Ih2 = c0543Ih2;
                    c0970Za2 = c0970Za2;
                    c0543Ih3 = c0543Ih3;
                    int readBits = c0543Ih2.A03();
                    int iA00 = c0970Za.A00(c0543Ih2);
                    c0543Ih3.A07(readBits);
                    int readBits2 = iA00 + 7;
                    byte[] initData = new byte[readBits2 / i];
                    c0543Ih3.A0D(initData, 0, iA00);
                    format = Format.A07(c0970Za2.A0E, A03(0, 15, 51), null, -1, -1, c0970Za2.A02, c0970Za2.A05, Collections.singletonList(initData), null, 0, c0970Za2.A0J);
                    if (!format.equals(c0970Za2.A0C)) {
                        numProgram = 11;
                        break;
                    } else {
                        numProgram = 12;
                        break;
                    }
                case 11:
                    c0970Za2 = c0970Za2;
                    format = format;
                    c0970Za2.A0C = format;
                    c0970Za2.A0A = 1024000000 / format.A0C;
                    c0970Za2.A0D.A5A(format);
                    numProgram = 12;
                    break;
                case 12:
                    c0970Za = c0970Za;
                    c0543Ih2 = c0543Ih2;
                    c0970Za2 = c0970Za2;
                    c0970Za.A07(c0543Ih2);
                    c0970Za2.A0F = c0543Ih2.A0F();
                    c0970Za2.A09 = 0L;
                    if (!c0970Za2.A0F) {
                        numProgram = 15;
                        break;
                    } else {
                        numProgram = 13;
                        break;
                    }
                case 13:
                    if (iA042 != 1) {
                        numProgram = 18;
                        break;
                    } else {
                        numProgram = 14;
                        break;
                    }
                case 14:
                    c0543Ih2 = c0543Ih2;
                    c0970Za2 = c0970Za2;
                    c0970Za2.A09 = A02(c0543Ih2);
                    numProgram = 15;
                    break;
                case 15:
                    c0543Ih2 = c0543Ih2;
                    if (!c0543Ih2.A0F()) {
                        numProgram = 17;
                        break;
                    } else {
                        numProgram = 16;
                        break;
                    }
                case 16:
                    c0543Ih3 = c0543Ih3;
                    c0543Ih3.A08(8);
                    numProgram = 17;
                    break;
                case 17:
                    return;
                case 18:
                    c0543Ih2 = c0543Ih2;
                    c0970Za2 = c0970Za2;
                    c0543Ih3 = c0543Ih3;
                    boolean zA0F = c0543Ih2.A0F();
                    c0970Za2.A09 = (c0970Za2.A09 << 8) + c0543Ih3.A04(8);
                    if (!zA0F) {
                        numProgram = 15;
                        break;
                    } else {
                        numProgram = 18;
                        break;
                    }
                case 19:
                    c0970Za = c0970Za;
                    c0543Ih2 = c0543Ih2;
                    c0543Ih3 = c0543Ih3;
                    int iA02 = (int) A02(c0543Ih2);
                    int numProgram3 = c0970Za.A00(c0543Ih2);
                    c0543Ih3.A08(iA02 - numProgram3);
                    numProgram = 12;
                    break;
                case 20:
                    iA04 = 0;
                    numProgram = 3;
                    break;
                case 21:
                    throw new AF();
                case 22:
                    throw new AF();
                case 23:
                    throw new AF();
            }
        }
    }

    private void A09(C0543Ih c0543Ih, int i) {
        C0970Za c0970Za = this;
        int iA03 = c0543Ih.A03();
        char c2 = (iA03 & 7) == 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0970Za = c0970Za;
                    c0970Za.A0I.A0Y(iA03 >> 3);
                    c2 = 3;
                    break;
                case 3:
                    C0970Za c0970Za2 = c0970Za;
                    c0970Za2.A0D.ACk(c0970Za2.A0I, i);
                    c0970Za2.A0D.ACl(c0970Za2.A0B, 1, i, 0, null);
                    c0970Za2.A0B += c0970Za2.A0A;
                    return;
                case 4:
                    c0970Za = c0970Za;
                    c0543Ih = c0543Ih;
                    c0543Ih.A0D(c0970Za.A0I.A00, 0, i * 8);
                    c0970Za.A0I.A0Y(0);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void A47(C0544Ii c0544Ii) throws AF {
        C0970Za c0970Za = this;
        int i = 0;
        int iA0E = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A04() <= 0) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0970Za = c0970Za;
                    i3 = c0970Za.A08;
                    i = 86;
                    i4 = 1;
                    if (i3 == 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i5 = 2;
                    if (i3 == i4) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i2 = 3;
                    if (i3 == i5) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i3 == i2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 2;
                        break;
                    }
                case 7:
                    c0970Za = c0970Za;
                    c0544Ii = c0544Ii;
                    int iMin = Math.min(c0544Ii.A04(), c0970Za.A06 - c0970Za.A01);
                    c0544Ii.A0c(c0970Za.A0H.A00, c0970Za.A01, iMin);
                    c0970Za.A01 += iMin;
                    if (c0970Za.A01 != c0970Za.A06) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0970Za = c0970Za;
                    c0970Za.A0H.A07(0);
                    c0970Za.A06(c0970Za.A0H);
                    c0970Za.A08 = 0;
                    c2 = 2;
                    break;
                case '\t':
                    c0970Za = c0970Za;
                    c0544Ii = c0544Ii;
                    c0970Za.A06 = ((c0970Za.A07 & (-225)) << 8) | c0544Ii.A0E();
                    if (c0970Za.A06 <= c0970Za.A0I.A00.length) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c0970Za = c0970Za;
                    c0970Za.A05(c0970Za.A06);
                    c2 = 11;
                    break;
                case 11:
                    c0970Za = c0970Za;
                    c0970Za.A01 = 0;
                    c0970Za.A08 = i2;
                    c2 = 2;
                    break;
                case '\f':
                    c0544Ii = c0544Ii;
                    iA0E = c0544Ii.A0E();
                    if ((iA0E & 224) != 224) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c0970Za = c0970Za;
                    c0970Za.A07 = iA0E;
                    c0970Za.A08 = i5;
                    c2 = 2;
                    break;
                case 14:
                    if (iA0E == i) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c0970Za = c0970Za;
                    c0970Za.A08 = 0;
                    c2 = 2;
                    break;
                case 16:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A0E() != i) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c0970Za = c0970Za;
                    c0970Za.A08 = i4;
                    c2 = 2;
                    break;
                case 18:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void A4U(CE ce, DW dw) {
        dw.A05();
        this.A0D = ce.ADd(dw.A03(), 1);
        this.A0E = dw.A04();
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ABa() {
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ABb(long j, boolean z) {
        this.A0B = j;
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ACo() {
        this.A08 = 0;
        this.A0G = false;
    }
}
