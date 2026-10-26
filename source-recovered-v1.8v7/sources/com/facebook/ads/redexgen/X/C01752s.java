package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.2s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01752s extends BO {
    public static byte[] A0C;
    public static final int[] A0D;
    public static final int[] A0E;
    public static final int[] A0F;
    public static final int[] A0G;
    public static final int[] A0H;
    public static final int[] A0I;
    public static final int[] A0J;
    public byte A00;
    public byte A01;
    public int A02;
    public int A03;
    public List<GX> A05;
    public List<GX> A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final C0544Ii A0A = new C0544Ii();
    public final ArrayList<C0490Ge> A0B = new ArrayList<>();
    public C0490Ge A04 = new C0490Ge(0, 4);

    public static String A04(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 40);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A0C = new byte[]{29, 12, 12, 16, 21, 31, 29, 8, 21, 19, 18, 83, 4, 81, 17, 12, 72, 81, 31, 25, 29, 81, 74, 76, 68};
    }

    static {
        A07();
        A0F = new int[]{11, 1, 3, 12, 14, 5, 7, 9};
        A0E = new int[]{0, 4, 8, 12, 16, 20, 24, 28};
        A0J = new int[]{-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
        A0D = new int[]{32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, k.AppCompatTheme_viewInflaterClass, k.AppCompatTheme_windowActionBar, k.AppCompatTheme_windowActionBarOverlay, k.AppCompatTheme_windowActionModeOverlay, k.AppCompatTheme_windowFixedHeightMajor, k.AppCompatTheme_windowFixedHeightMinor, k.AppCompatTheme_windowFixedWidthMajor, k.AppCompatTheme_windowFixedWidthMinor, k.AppCompatTheme_windowMinWidthMajor, 231, 247, 209, 241, 9632};
        A0G = new int[]{174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
        A0H = new int[]{193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
        A0I = new int[]{195, 227, 205, 204, 236, 210, 242, 213, 245, k.AppCompatTheme_windowMinWidthMinor, 125, 92, 94, 95, k.AppCompatTheme_windowNoTitle, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    }

    public C01752s(String str, int i) {
        this.A08 = A04(0, 25, 84).equals(str) ? 2 : 3;
        if (i != 3 && i != 4) {
            this.A09 = 1;
        } else {
            this.A09 = 2;
        }
        A0B(0);
        A06();
    }

    public static char A00(byte b2) {
        int index = (b2 & Byte.MAX_VALUE) - 32;
        return (char) A0D[index];
    }

    public static char A01(byte b2) {
        int index = b2 & 31;
        return (char) A0H[index];
    }

    public static char A02(byte b2) {
        int index = b2 & 31;
        return (char) A0I[index];
    }

    public static char A03(byte b2) {
        int index = b2 & 15;
        return (char) A0G[index];
    }

    private List<GX> A05() {
        C01752s c01752s = this;
        GX cue = null;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c01752s = c01752s;
                    if (i >= c01752s.A0B.size()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c01752s = c01752s;
                    cue = c01752s.A0B.get(i).A05();
                    if (cue == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    arrayList = arrayList;
                    cue = cue;
                    arrayList.add(cue);
                    c2 = 5;
                    break;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return arrayList;
            }
        }
    }

    private void A06() {
        this.A04.A09(this.A02);
        this.A0B.clear();
        this.A0B.add(this.A04);
    }

    private void A08(byte b2) {
        this.A04.A08(' ');
        this.A04.A0E((b2 >> 1) & 7, (b2 & 1) == 1);
    }

    private void A09(byte b2) {
        C01752s c01752s = this;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        char c2 = b2 != 32 ? (char) 2 : (char) 23;
        while (true) {
            switch (c2) {
                case 2:
                    i = 3;
                    if (b2 == 41) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i2 = 1;
                    switch (b2) {
                        case 37:
                            c2 = 19;
                            break;
                        case 38:
                            c2 = 20;
                            break;
                        case 39:
                            c2 = 21;
                            break;
                        default:
                            c2 = 4;
                            break;
                    }
                case 4:
                    c01752s = c01752s;
                    i3 = c01752s.A02;
                    if (i3 != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return;
                case 6:
                    if (b2 == 33) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (b2 == 36) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    switch (b2) {
                        case 44:
                            c2 = '\n';
                            break;
                        case 45:
                            c2 = '\r';
                            break;
                        case 46:
                            c2 = 16;
                            break;
                        case 47:
                            c2 = 17;
                            break;
                        default:
                            c2 = '\t';
                            break;
                    }
                case '\t':
                    return;
                case '\n':
                    c01752s = c01752s;
                    c01752s.A05 = null;
                    if (i3 == i2) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    if (i3 != i) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c01752s = c01752s;
                    c01752s.A06();
                    c2 = '\t';
                    break;
                case '\r':
                    if (i3 != i2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c01752s = c01752s;
                    if (!c01752s.A04.A0F()) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 15:
                    c01752s = c01752s;
                    c01752s.A04.A07();
                    c2 = '\t';
                    break;
                case 16:
                    c01752s = c01752s;
                    c01752s.A06();
                    c2 = '\t';
                    break;
                case 17:
                    c01752s = c01752s;
                    c01752s.A05 = c01752s.A05();
                    c01752s.A06();
                    c2 = '\t';
                    break;
                case 18:
                    c01752s = c01752s;
                    c01752s.A04.A06();
                    c2 = '\t';
                    break;
                case 19:
                    C01752s c01752s2 = c01752s;
                    c01752s2.A0B(i2);
                    c01752s2.A0C(2);
                    return;
                case 20:
                    C01752s c01752s3 = c01752s;
                    c01752s3.A0B(i2);
                    c01752s3.A0C(i);
                    return;
                case 21:
                    C01752s c01752s4 = c01752s;
                    c01752s4.A0B(i2);
                    c01752s4.A0C(4);
                    return;
                case 22:
                    c01752s.A0B(i);
                    return;
                case 23:
                    c01752s.A0B(2);
                    return;
            }
        }
    }

    private void A0A(byte b2, byte b3) {
        C01752s c01752s = this;
        int cursorOrStyle = 0;
        C0490Ge c0490Ge = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = A0F[b2 & 7];
        boolean z3 = false;
        char c2 = (b3 & 32) != 0 ? (char) 2 : (char) 21;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    if (!z) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i2++;
                    c2 = 5;
                    break;
                case 5:
                    c01752s = c01752s;
                    if (i2 == c01752s.A04.A04()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c01752s = c01752s;
                    if (c01752s.A02 == 1) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c01752s = c01752s;
                    if (!c01752s.A04.A0F()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    c01752s = c01752s;
                    c01752s.A04 = new C0490Ge(c01752s.A02, c01752s.A03);
                    c01752s.A0B.add(c01752s.A04);
                    c2 = '\t';
                    break;
                case '\t':
                    c01752s = c01752s;
                    c01752s.A04.A0C(i2);
                    c2 = '\n';
                    break;
                case '\n':
                    if ((b3 & 16) != 16) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    z2 = true;
                    c2 = '\f';
                    break;
                case '\f':
                    if ((b3 & 1) != 1) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    z3 = true;
                    c2 = 14;
                    break;
                case 14:
                    c01752s = c01752s;
                    i = (b3 >> 1) & 7;
                    c0490Ge = c01752s.A04;
                    if (!z2) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    cursorOrStyle = 8;
                    c2 = 16;
                    break;
                case 16:
                    c0490Ge = c0490Ge;
                    c0490Ge.A0E(cursorOrStyle, z3);
                    if (!z2) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c01752s = c01752s;
                    c01752s.A04.A0B(A0E[i]);
                    c2 = 18;
                    break;
                case 18:
                    return;
                case 19:
                    cursorOrStyle = i;
                    c2 = 16;
                    break;
                case 20:
                    z2 = false;
                    c2 = '\f';
                    break;
                case 21:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    private void A0B(int i) {
        C01752s c01752s = this;
        char c2 = c01752s.A02 == i ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c01752s = c01752s;
                    int i2 = c01752s.A02;
                    c01752s.A02 = i;
                    c01752s.A06();
                    if (i2 == 3) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c01752s = c01752s;
                    c01752s.A05 = null;
                    c2 = 7;
                    break;
                case 7:
                    return;
            }
        }
    }

    private void A0C(int i) {
        this.A03 = i;
        this.A04.A0A(i);
    }

    public static boolean A0D(byte b2) {
        boolean z = false;
        char c2 = (b2 & 240) == 16 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    private boolean A0E(byte b2, byte b3) {
        C01752s c01752s = this;
        boolean z = false;
        boolean zA0D = A0D(b2);
        char c2 = zA0D ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    c01752s = c01752s;
                    z = true;
                    if (!c01752s.A07) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c01752s = c01752s;
                    if (c01752s.A00 != b2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c01752s = c01752s;
                    if (c01752s.A01 != b3) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c01752s.A07 = false;
                    return z;
                case 6:
                    c01752s = c01752s;
                    c01752s.A07 = z;
                    c01752s.A00 = b2;
                    c01752s.A01 = b3;
                    c2 = 7;
                    break;
                case 7:
                    if (!A0F(b2, b3)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c01752s = c01752s;
                    c01752s.A08(b3);
                    c2 = '\t';
                    break;
                case '\t':
                    return zA0D;
                case '\n':
                    if (!A0H(b2, b3)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c01752s = c01752s;
                    c01752s.A0A(b2, b3);
                    c2 = '\t';
                    break;
                case '\f':
                    if (!A0I(b2, b3)) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c01752s = c01752s;
                    c01752s.A04.A0D(b3 - 32);
                    c2 = '\t';
                    break;
                case 14:
                    if (!A0G(b2, b3)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c01752s = c01752s;
                    c01752s.A09(b3);
                    c2 = '\t';
                    break;
            }
        }
    }

    public static boolean A0F(byte b2, byte b3) {
        boolean z = false;
        char c2 = (b2 & 247) == 17 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if ((b3 & 240) != 32) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public static boolean A0G(byte b2, byte b3) {
        boolean z = false;
        char c2 = (b2 & 247) == 20 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if ((b3 & 240) != 32) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public static boolean A0H(byte b2, byte b3) {
        boolean z = false;
        char c2 = (b2 & 240) == 16 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if ((b3 & 192) != 64) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public static boolean A0I(byte b2, byte b3) {
        boolean z = false;
        char c2 = (b2 & 247) == 23 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (b3 < 33) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (b3 > 35) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final GY A0L() {
        List<GX> list = this.A05;
        this.A06 = list;
        return new C1060b6(list);
    }

    @Override // com.facebook.ads.redexgen.X.BO
    /* renamed from: A0M */
    public final /* bridge */ /* synthetic */ BX A4h() throws GZ {
        return super.A4h();
    }

    @Override // com.facebook.ads.redexgen.X.BO
    /* renamed from: A0N */
    public final /* bridge */ /* synthetic */ BP A4i() throws GZ {
        return super.A4i();
    }

    @Override // com.facebook.ads.redexgen.X.BO
    /* renamed from: A0O */
    public final /* bridge */ /* synthetic */ void AC2(BX bx) throws GZ {
        super.AC2(bx);
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final void A0P(BX bx) {
        C01752s c01752s = this;
        int i = 0;
        byte ccData1 = 0;
        int i2 = 0;
        byte bA0E = 0;
        byte bA0E2 = 0;
        int i3 = 0;
        int i4 = 0;
        c01752s.A0A.A0b(bx.A01.array(), bx.A01.limit());
        boolean z = false;
        boolean zA0E = false;
        byte ccDataHeader = 2;
        while (true) {
            switch (ccDataHeader) {
                case 2:
                    c01752s = c01752s;
                    int iA04 = c01752s.A0A.A04();
                    i2 = c01752s.A08;
                    i3 = 1;
                    if (iA04 < i2) {
                        ccDataHeader = 25;
                        break;
                    } else {
                        ccDataHeader = 3;
                        break;
                    }
                case 3:
                    i4 = 2;
                    if (i2 != 2) {
                        ccDataHeader = 24;
                        break;
                    } else {
                        ccDataHeader = 4;
                        break;
                    }
                case 4:
                    bA0E2 = -4;
                    ccDataHeader = 5;
                    break;
                case 5:
                    c01752s = c01752s;
                    bA0E = (byte) (c01752s.A0A.A0E() & 127);
                    ccData1 = (byte) (c01752s.A0A.A0E() & 127);
                    if ((bA0E2 & 6) == 4) {
                        ccDataHeader = 6;
                        break;
                    } else {
                        ccDataHeader = 2;
                        break;
                    }
                case 6:
                    c01752s = c01752s;
                    if (c01752s.A09 != i3) {
                        ccDataHeader = 8;
                        break;
                    } else {
                        ccDataHeader = 7;
                        break;
                    }
                case 7:
                    if ((bA0E2 & 1) != 0) {
                        ccDataHeader = 2;
                        break;
                    } else {
                        ccDataHeader = 8;
                        break;
                    }
                case 8:
                    c01752s = c01752s;
                    if (c01752s.A09 != i4) {
                        ccDataHeader = 10;
                        break;
                    } else {
                        ccDataHeader = 9;
                        break;
                    }
                case 9:
                    if ((bA0E2 & 1) == i3) {
                        ccDataHeader = 10;
                        break;
                    } else {
                        ccDataHeader = 2;
                        break;
                    }
                case 10:
                    if (bA0E != 0) {
                        ccDataHeader = 12;
                        break;
                    } else {
                        ccDataHeader = 11;
                        break;
                    }
                case 11:
                    if (ccData1 != 0) {
                        ccDataHeader = 12;
                        break;
                    } else {
                        ccDataHeader = 2;
                        break;
                    }
                case 12:
                    z = true;
                    if ((bA0E & 247) != 17) {
                        ccDataHeader = 15;
                        break;
                    } else {
                        ccDataHeader = 13;
                        break;
                    }
                case 13:
                    if ((ccData1 & 240) != 48) {
                        ccDataHeader = 15;
                        break;
                    } else {
                        ccDataHeader = 14;
                        break;
                    }
                case 14:
                    c01752s = c01752s;
                    c01752s.A04.A08(A03(ccData1));
                    ccDataHeader = 2;
                    break;
                case 15:
                    if ((bA0E & 246) != 18) {
                        ccDataHeader = 20;
                        break;
                    } else {
                        ccDataHeader = 16;
                        break;
                    }
                case 16:
                    if ((ccData1 & 224) != 32) {
                        ccDataHeader = 20;
                        break;
                    } else {
                        ccDataHeader = 17;
                        break;
                    }
                case 17:
                    c01752s = c01752s;
                    c01752s.A04.A06();
                    if ((bA0E & 1) != 0) {
                        ccDataHeader = 19;
                        break;
                    } else {
                        ccDataHeader = 18;
                        break;
                    }
                case 18:
                    c01752s = c01752s;
                    c01752s.A04.A08(A01(ccData1));
                    ccDataHeader = 2;
                    break;
                case 19:
                    c01752s = c01752s;
                    c01752s.A04.A08(A02(ccData1));
                    ccDataHeader = 2;
                    break;
                case 20:
                    if ((bA0E & 224) != 0) {
                        ccDataHeader = 22;
                        break;
                    } else {
                        ccDataHeader = 21;
                        break;
                    }
                case 21:
                    c01752s = c01752s;
                    zA0E = c01752s.A0E(bA0E, ccData1);
                    ccDataHeader = 2;
                    break;
                case 22:
                    c01752s = c01752s;
                    c01752s.A04.A08(A00(bA0E));
                    if ((ccData1 & 224) == 0) {
                        ccDataHeader = 2;
                        break;
                    } else {
                        ccDataHeader = 23;
                        break;
                    }
                case 23:
                    c01752s = c01752s;
                    c01752s.A04.A08(A00(ccData1));
                    ccDataHeader = 2;
                    break;
                case 24:
                    c01752s = c01752s;
                    bA0E2 = (byte) c01752s.A0A.A0E();
                    ccDataHeader = 5;
                    break;
                case 25:
                    if (!z) {
                        ccDataHeader = 31;
                        break;
                    } else {
                        ccDataHeader = 26;
                        break;
                    }
                case 26:
                    if (!zA0E) {
                        ccDataHeader = 27;
                        break;
                    } else {
                        ccDataHeader = 28;
                        break;
                    }
                case 27:
                    c01752s = c01752s;
                    c01752s.A07 = false;
                    ccDataHeader = 28;
                    break;
                case 28:
                    c01752s = c01752s;
                    i = c01752s.A02;
                    if (i == i3) {
                        ccDataHeader = 30;
                        break;
                    } else {
                        ccDataHeader = 29;
                        break;
                    }
                case 29:
                    if (i != 3) {
                        ccDataHeader = 31;
                        break;
                    } else {
                        ccDataHeader = 30;
                        break;
                    }
                case 30:
                    c01752s = c01752s;
                    c01752s.A05 = c01752s.A05();
                    ccDataHeader = 31;
                    break;
                case 31:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BO
    public final boolean A0R() {
        boolean z = false;
        char c2 = this.A05 != this.A06 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BO, com.facebook.ads.redexgen.X.BV
    public final void ACJ() {
    }

    @Override // com.facebook.ads.redexgen.X.BO, com.facebook.ads.redexgen.X.InterfaceC1056b2
    public final /* bridge */ /* synthetic */ void ADA(long j) {
        super.ADA(j);
    }

    @Override // com.facebook.ads.redexgen.X.BO, com.facebook.ads.redexgen.X.BV
    public final void flush() {
        super.flush();
        this.A05 = null;
        this.A06 = null;
        A0B(0);
        A0C(4);
        A06();
        this.A07 = false;
        this.A00 = (byte) 0;
        this.A01 = (byte) 0;
    }
}
