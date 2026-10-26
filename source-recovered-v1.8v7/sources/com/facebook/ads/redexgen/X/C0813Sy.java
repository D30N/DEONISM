package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Sy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0813Sy implements InterfaceC02053y {
    public static byte[] A08;
    public int A00;
    public C2R<C01833b> A01;
    public final InterfaceC01823a A02;
    public final C02063z A03;
    public final Runnable A04;
    public final ArrayList<C01833b> A05;
    public final ArrayList<C01833b> A06;
    public final boolean A07;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 115);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A08 = new byte[]{-19, -20, -22, -9, -98, -16, -29, -21, -19, -12, -29, -98, -33, -20, -30, -98, -13, -18, -30, -33, -14, -29, -98, -19, -18, -15, -98, -31, -33, -20, -98, -32, -29, -98, -30, -25, -15, -18, -33, -14, -31, -26, -29, -30, -98, -25, -20, -98, -28, -25, -16, -15, -14, -98, -18, -33, -15, -15, 36, 37, -43, 40, 29, 36, 42, 33, 25, -43, 23, 26, -43, 39, 26, 34, 36, 43, 26, -43, 36, 39, -43, 42, 37, 25, 22, 41, 26, -29, 61, 50, 57, 63, 54, 46, -22, 56, 57, 62, -22, 46, 51, 61, 58, 43, 62, 45, 50, -22, 43, 46, 46, -22, 57, 60, -22, 55, 57, 64, 47, -22, 48, 57, 60, -22, 58, 60, 47, -22, 54, 43, 67, 57, 63, 62, -31, -6, -9, -6, -5, 3, -6, -84, 1, -4, -16, -19, 0, -15, -84, -5, -4, -84, 0, 5, -4, -15, -84, -14, -5, -2, -84};
    }

    public C0813Sy(InterfaceC01823a interfaceC01823a) {
        this(interfaceC01823a, false);
    }

    public C0813Sy(InterfaceC01823a interfaceC01823a, boolean z) {
        this.A01 = new C0797Sg(30);
        this.A05 = new ArrayList<>();
        this.A06 = new ArrayList<>();
        this.A00 = 0;
        this.A02 = interfaceC01823a;
        this.A07 = z;
        this.A03 = new C02063z(this);
    }

    private int A00(int i, int start) {
        C0813Sy c0813Sy = this;
        int size = 0;
        int i2 = 0;
        int end = 0;
        int i3 = 0;
        int i4 = 0;
        C01833b c01833b = null;
        C01833b c01833b2 = null;
        int i5 = 0;
        int size2 = c0813Sy.A06.size() - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    i4 = 8;
                    end = 1;
                    if (size2 < 0) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0813Sy = c0813Sy;
                    c01833b = c0813Sy.A06.get(size2);
                    i2 = 2;
                    if (c01833b.A00 != i4) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c01833b = c01833b;
                    if (c01833b.A02 >= c01833b.A01) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c01833b = c01833b;
                    i5 = c01833b.A02;
                    i3 = c01833b.A01;
                    c2 = 6;
                    break;
                case 6:
                    if (i < i5) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i > i3) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c01833b = c01833b;
                    if (i5 != c01833b.A02) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (start != end) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c01833b = c01833b;
                    c01833b.A01 += end;
                    c2 = 11;
                    break;
                case 11:
                    i++;
                    c2 = '\f';
                    break;
                case '\f':
                    size2--;
                    c2 = 2;
                    break;
                case '\r':
                    if (start != i2) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c01833b = c01833b;
                    c01833b.A01 -= end;
                    c2 = 11;
                    break;
                case 15:
                    if (start != end) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c01833b = c01833b;
                    c01833b.A02 += end;
                    c2 = 17;
                    break;
                case 17:
                    i--;
                    c2 = '\f';
                    break;
                case 18:
                    if (start != i2) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    c01833b = c01833b;
                    c01833b.A02 -= end;
                    c2 = 17;
                    break;
                case 20:
                    c01833b = c01833b;
                    if (i >= c01833b.A02) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    if (start != end) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    c01833b = c01833b;
                    c01833b.A02 += end;
                    c01833b.A01 += end;
                    c2 = '\f';
                    break;
                case 23:
                    if (start != i2) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    c01833b = c01833b;
                    c01833b.A02 -= end;
                    c01833b.A01 -= end;
                    c2 = '\f';
                    break;
                case 25:
                    c01833b = c01833b;
                    i5 = c01833b.A01;
                    i3 = c01833b.A02;
                    c2 = 6;
                    break;
                case 26:
                    c01833b = c01833b;
                    if (c01833b.A02 > i) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    c01833b = c01833b;
                    if (c01833b.A00 != end) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    c01833b = c01833b;
                    i -= c01833b.A01;
                    c2 = '\f';
                    break;
                case 29:
                    c01833b = c01833b;
                    if (c01833b.A00 != i2) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    c01833b = c01833b;
                    i += c01833b.A01;
                    c2 = '\f';
                    break;
                case 31:
                    if (start != end) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = ' ';
                        break;
                    }
                case ' ':
                    c01833b = c01833b;
                    c01833b.A02 += end;
                    c2 = '\f';
                    break;
                case '!':
                    if (start != i2) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\"';
                        break;
                    }
                case '\"':
                    c01833b = c01833b;
                    c01833b.A02 -= end;
                    c2 = '\f';
                    break;
                case '#':
                    c0813Sy = c0813Sy;
                    size = c0813Sy.A06.size() - end;
                    c2 = '$';
                    break;
                case '$':
                    if (size < 0) {
                        c2 = ',';
                        break;
                    } else {
                        c2 = '%';
                        break;
                    }
                case '%':
                    c0813Sy = c0813Sy;
                    c01833b2 = c0813Sy.A06.get(size);
                    if (c01833b2.A00 != i4) {
                        c2 = '*';
                        break;
                    } else {
                        c2 = '&';
                        break;
                    }
                case '&':
                    c01833b2 = c01833b2;
                    if (c01833b2.A01 == c01833b2.A02) {
                        c2 = '(';
                        break;
                    } else {
                        c2 = '\'';
                        break;
                    }
                case '\'':
                    c01833b2 = c01833b2;
                    if (c01833b2.A01 >= 0) {
                        c2 = ')';
                        break;
                    } else {
                        c2 = '(';
                        break;
                    }
                case '(':
                    c0813Sy = c0813Sy;
                    c01833b2 = c01833b2;
                    c0813Sy.A06.remove(size);
                    c0813Sy.ACE(c01833b2);
                    c2 = ')';
                    break;
                case ')':
                    size--;
                    c2 = '$';
                    break;
                case '*':
                    c01833b2 = c01833b2;
                    if (c01833b2.A01 > 0) {
                        c2 = ')';
                        break;
                    } else {
                        c2 = '+';
                        break;
                    }
                case '+':
                    c0813Sy = c0813Sy;
                    c01833b2 = c01833b2;
                    c0813Sy.A06.remove(size);
                    c0813Sy.ACE(c01833b2);
                    c2 = ')';
                    break;
                case ',':
                    return i;
            }
        }
    }

    private final int A01(int i, int i2) {
        C0813Sy c0813Sy = this;
        C01833b c01833b = null;
        int size = c0813Sy.A06.size();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= size) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0813Sy = c0813Sy;
                    c01833b = c0813Sy.A06.get(i2);
                    if (c01833b.A00 != 8) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c01833b = c01833b;
                    if (c01833b.A02 != i) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c01833b = c01833b;
                    i = c01833b.A01;
                    c2 = 6;
                    break;
                case 6:
                    i2++;
                    c2 = 2;
                    break;
                case 7:
                    c01833b = c01833b;
                    if (c01833b.A02 >= i) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    i--;
                    c2 = '\t';
                    break;
                case '\t':
                    c01833b = c01833b;
                    if (c01833b.A01 > i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    i++;
                    c2 = 6;
                    break;
                case 11:
                    c01833b = c01833b;
                    if (c01833b.A02 > i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c01833b = c01833b;
                    if (c01833b.A00 != 2) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c01833b = c01833b;
                    if (i >= c01833b.A02 + c01833b.A01) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    return -1;
                case 15:
                    c01833b = c01833b;
                    i -= c01833b.A01;
                    c2 = 6;
                    break;
                case 16:
                    c01833b = c01833b;
                    if (c01833b.A00 != 1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c01833b = c01833b;
                    i += c01833b.A01;
                    c2 = 6;
                    break;
                case 18:
                    return i;
            }
        }
    }

    private void A04(C01833b c01833b) {
        A09(c01833b);
    }

    private void A05(C01833b c01833b) {
        A09(c01833b);
    }

    private void A06(C01833b c01833b) {
        C0813Sy c0813Sy = this;
        int tmpEnd = 0;
        int type = 0;
        int position = 0;
        int i = c01833b.A02;
        int i2 = 0;
        int i3 = c01833b.A02 + c01833b.A01;
        int i4 = -1;
        int i5 = c01833b.A02;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    position = 2;
                    if (i5 >= i3) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0813Sy = c0813Sy;
                    type = 0;
                    C4Y vh = c0813Sy.A02.A57(i5);
                    tmpEnd = 1;
                    if (vh != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0813Sy = c0813Sy;
                    if (!c0813Sy.A0C(i5)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i4 != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0813Sy = c0813Sy;
                    C01833b newOp = c0813Sy.A8g(position, i, i2, null);
                    c0813Sy.A08(newOp);
                    type = 1;
                    c2 = 7;
                    break;
                case 7:
                    i4 = 1;
                    c2 = '\b';
                    break;
                case '\b':
                    if (type == 0) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    i5 -= i2;
                    i3 -= i2;
                    i2 = 1;
                    c2 = '\n';
                    break;
                case '\n':
                    i5 += tmpEnd;
                    c2 = 2;
                    break;
                case 11:
                    i2++;
                    c2 = '\n';
                    break;
                case '\f':
                    if (i4 != tmpEnd) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c0813Sy = c0813Sy;
                    C01833b newOp2 = c0813Sy.A8g(position, i, i2, null);
                    c0813Sy.A09(newOp2);
                    type = 1;
                    c2 = 14;
                    break;
                case 14:
                    i4 = 0;
                    c2 = '\b';
                    break;
                case 15:
                    c01833b = c01833b;
                    if (i2 == c01833b.A01) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c0813Sy = c0813Sy;
                    c0813Sy.ACE(c01833b);
                    c01833b = c0813Sy.A8g(position, i, i2, null);
                    c2 = 17;
                    break;
                case 17:
                    if (i4 != 0) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c0813Sy = c0813Sy;
                    c01833b = c01833b;
                    c0813Sy.A08(c01833b);
                    c2 = 19;
                    break;
                case 19:
                    return;
                case 20:
                    c0813Sy = c0813Sy;
                    c01833b = c01833b;
                    c0813Sy.A09(c01833b);
                    c2 = 19;
                    break;
            }
        }
    }

    private void A07(C01833b c01833b) {
        C0813Sy c0813Sy = this;
        int tmpEnd = 0;
        int type = 0;
        int i = c01833b.A02;
        int i2 = 0;
        int i3 = c01833b.A02 + c01833b.A01;
        int i4 = -1;
        int i5 = c01833b.A02;
        int position = 2;
        while (true) {
            switch (position) {
                case 2:
                    type = 4;
                    if (i5 >= i3) {
                        position = 12;
                        break;
                    } else {
                        position = 3;
                        break;
                    }
                case 3:
                    c0813Sy = c0813Sy;
                    C4Y vh = c0813Sy.A02.A57(i5);
                    tmpEnd = 1;
                    if (vh != null) {
                        position = 5;
                        break;
                    } else {
                        position = 4;
                        break;
                    }
                case 4:
                    c0813Sy = c0813Sy;
                    if (!c0813Sy.A0C(i5)) {
                        position = 9;
                        break;
                    } else {
                        position = 5;
                        break;
                    }
                case 5:
                    if (i4 != 0) {
                        position = 7;
                        break;
                    } else {
                        position = 6;
                        break;
                    }
                case 6:
                    c0813Sy = c0813Sy;
                    c01833b = c01833b;
                    c0813Sy.A08(c0813Sy.A8g(type, i, i2, c01833b.A03));
                    i2 = 0;
                    i = i5;
                    position = 7;
                    break;
                case 7:
                    i4 = 1;
                    position = 8;
                    break;
                case 8:
                    i2 += tmpEnd;
                    i5++;
                    position = 2;
                    break;
                case 9:
                    if (i4 != tmpEnd) {
                        position = 11;
                        break;
                    } else {
                        position = 10;
                        break;
                    }
                case 10:
                    c0813Sy = c0813Sy;
                    c01833b = c01833b;
                    C01833b newOp = c0813Sy.A8g(type, i, i2, c01833b.A03);
                    c0813Sy.A09(newOp);
                    i2 = 0;
                    i = i5;
                    position = 11;
                    break;
                case 11:
                    i4 = 0;
                    position = 8;
                    break;
                case 12:
                    c01833b = c01833b;
                    if (i2 == c01833b.A01) {
                        position = 14;
                        break;
                    } else {
                        position = 13;
                        break;
                    }
                case 13:
                    c0813Sy = c0813Sy;
                    C01833b c01833b2 = c01833b;
                    Object payload = c01833b2.A03;
                    c0813Sy.ACE(c01833b2);
                    c01833b = c0813Sy.A8g(type, i, i2, payload);
                    position = 14;
                    break;
                case 14:
                    if (i4 != 0) {
                        position = 17;
                        break;
                    } else {
                        position = 15;
                        break;
                    }
                case 15:
                    c0813Sy = c0813Sy;
                    c01833b = c01833b;
                    c0813Sy.A08(c01833b);
                    position = 16;
                    break;
                case 16:
                    return;
                case 17:
                    c0813Sy = c0813Sy;
                    c01833b = c01833b;
                    c0813Sy.A09(c01833b);
                    position = 16;
                    break;
            }
        }
    }

    private void A08(C01833b c01833b) {
        C01833b c01833b2 = c01833b;
        C0813Sy c0813Sy = this;
        int tmpCnt = 0;
        int offsetPositionForPartial = 0;
        int positionMultiplier = 0;
        int iA00 = 0;
        int i = 0;
        int p = 0;
        int pos = 0;
        int updatedPos = 0;
        int i2 = 0;
        int i3 = 0;
        Object obj = null;
        int i4 = 0;
        int i5 = 0;
        char c2 = c01833b2.A00 != 1 ? (char) 2 : (char) 27;
        while (true) {
            switch (c2) {
                case 2:
                    c01833b2 = c01833b2;
                    if (c01833b2.A00 == 8) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0813Sy = c0813Sy;
                    c01833b2 = c01833b2;
                    iA00 = c0813Sy.A00(c01833b2.A02, c01833b2.A00);
                    i = 1;
                    positionMultiplier = c01833b2.A02;
                    i3 = c01833b2.A00;
                    i5 = 2;
                    i4 = 4;
                    if (i3 == 2) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i3 != i4) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    updatedPos = 1;
                    c2 = 6;
                    break;
                case 6:
                    i2 = 1;
                    c2 = 7;
                    break;
                case 7:
                    c01833b2 = c01833b2;
                    if (i2 >= c01833b2.A01) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0813Sy = c0813Sy;
                    c01833b2 = c01833b2;
                    offsetPositionForPartial = c0813Sy.A00(c01833b2.A02 + (updatedPos * i2), c01833b2.A00);
                    p = 0;
                    pos = c01833b2.A00;
                    tmpCnt = 0;
                    if (pos == i5) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (pos == i4) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (p == 0) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    i++;
                    c2 = '\f';
                    break;
                case '\f':
                    i2++;
                    c2 = 7;
                    break;
                case '\r':
                    c0813Sy = c0813Sy;
                    c01833b2 = c01833b2;
                    C01833b c01833bA8g = c0813Sy.A8g(c01833b2.A00, iA00, i, c01833b2.A03);
                    c0813Sy.A0A(c01833bA8g, positionMultiplier);
                    c0813Sy.ACE(c01833bA8g);
                    if (c01833b2.A00 != i4) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    positionMultiplier += i;
                    c2 = 15;
                    break;
                case 15:
                    iA00 = offsetPositionForPartial;
                    i = 1;
                    c2 = '\f';
                    break;
                case 16:
                    if (offsetPositionForPartial != iA00 + 1) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    tmpCnt = 1;
                    c2 = 18;
                    break;
                case 18:
                    p = tmpCnt;
                    c2 = '\n';
                    break;
                case 19:
                    if (offsetPositionForPartial != iA00) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    tmpCnt = 1;
                    c2 = 21;
                    break;
                case 21:
                    p = tmpCnt;
                    c2 = '\n';
                    break;
                case 22:
                    updatedPos = 0;
                    c2 = 6;
                    break;
                case 23:
                    c0813Sy = c0813Sy;
                    c01833b2 = c01833b2;
                    obj = c01833b2.A03;
                    c0813Sy.ACE(c01833b2);
                    if (i <= 0) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    c0813Sy = c0813Sy;
                    c01833b2 = c01833b2;
                    obj = obj;
                    C01833b c01833bA8g2 = c0813Sy.A8g(c01833b2.A00, iA00, i, obj);
                    c0813Sy.A0A(c01833bA8g2, positionMultiplier);
                    c0813Sy.ACE(c01833bA8g2);
                    c2 = 25;
                    break;
                case 25:
                    return;
                case 26:
                    throw new IllegalArgumentException(A02(58, 30, 66) + c01833b2);
                case 27:
                    throw new IllegalArgumentException(A02(88, 46, 87));
            }
        }
    }

    private void A09(C01833b c01833b) {
        C0813Sy c0813Sy = this;
        c0813Sy.A06.add(c01833b);
        int i = c01833b.A00;
        char c2 = i != 1 ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 4) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i != 8) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0813Sy = c0813Sy;
                    c01833b = c01833b;
                    c0813Sy.A02.A8i(c01833b.A02, c01833b.A01);
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    c0813Sy = c0813Sy;
                    c01833b = c01833b;
                    c0813Sy.A02.A8T(c01833b.A02, c01833b.A01, c01833b.A03);
                    c2 = 6;
                    break;
                case '\b':
                    c0813Sy = c0813Sy;
                    c01833b = c01833b;
                    c0813Sy.A02.A8k(c01833b.A02, c01833b.A01);
                    c2 = 6;
                    break;
                case '\t':
                    c0813Sy = c0813Sy;
                    c01833b = c01833b;
                    c0813Sy.A02.A8h(c01833b.A02, c01833b.A01);
                    c2 = 6;
                    break;
                case '\n':
                    throw new IllegalArgumentException(A02(134, 27, 25) + c01833b);
            }
        }
    }

    private final void A0A(C01833b c01833b, int i) {
        C0813Sy c0813Sy = this;
        c0813Sy.A02.A9L(c01833b);
        int i2 = c01833b.A00;
        char c2 = i2 != 2 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 != 4) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0813Sy = c0813Sy;
                    c01833b = c01833b;
                    c0813Sy.A02.A8T(i, c01833b.A01, c01833b.A03);
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    c0813Sy = c0813Sy;
                    c01833b = c01833b;
                    c0813Sy.A02.A8j(i, c01833b.A01);
                    c2 = 4;
                    break;
                case 6:
                    throw new IllegalArgumentException(A02(0, 58, 11));
            }
        }
    }

    private final void A0B(List<C01833b> list) {
        C0813Sy c0813Sy = this;
        int size = list.size();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= size) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0813Sy = c0813Sy;
                    list = list;
                    c0813Sy.ACE(list.get(i));
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    list.clear();
                    return;
            }
        }
    }

    private boolean A0C(int i) {
        C0813Sy c0813Sy = this;
        boolean z = false;
        int i2 = 0;
        C01833b c01833b = null;
        int i3 = 0;
        int size = c0813Sy.A06.size();
        int i4 = 0;
        int end = 2;
        while (true) {
            switch (end) {
                case 2:
                    if (i4 >= size) {
                        end = 13;
                        break;
                    } else {
                        end = 3;
                        break;
                    }
                case 3:
                    c0813Sy = c0813Sy;
                    c01833b = c0813Sy.A06.get(i4);
                    z = true;
                    if (c01833b.A00 != 8) {
                        end = 6;
                        break;
                    } else {
                        end = 4;
                        break;
                    }
                case 4:
                    c0813Sy = c0813Sy;
                    c01833b = c01833b;
                    if (c0813Sy.A01(c01833b.A01, i4 + 1) != i) {
                        end = 12;
                        break;
                    } else {
                        end = 5;
                        break;
                    }
                case 5:
                    return z;
                case 6:
                    c01833b = c01833b;
                    if (c01833b.A00 != z) {
                        end = 12;
                        break;
                    } else {
                        end = 7;
                        break;
                    }
                case 7:
                    c01833b = c01833b;
                    i2 = c01833b.A02 + c01833b.A01;
                    i3 = c01833b.A02;
                    end = 8;
                    break;
                case 8:
                    if (i3 >= i2) {
                        end = 12;
                        break;
                    } else {
                        end = 9;
                        break;
                    }
                case 9:
                    c0813Sy = c0813Sy;
                    if (c0813Sy.A01(i3, i4 + 1) != i) {
                        end = 11;
                        break;
                    } else {
                        end = 10;
                        break;
                    }
                case 10:
                    return z;
                case 11:
                    i3++;
                    end = 8;
                    break;
                case 12:
                    i4++;
                    end = 2;
                    break;
                case 13:
                    return false;
            }
        }
    }

    public final int A0D(int i) {
        return A01(i, 0);
    }

    public final int A0E(int i) {
        C0813Sy c0813Sy = this;
        int i2 = 0;
        C01833b c01833b = null;
        int size = c0813Sy.A05.size();
        int i3 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 >= size) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0813Sy = c0813Sy;
                    c01833b = c0813Sy.A05.get(i3);
                    i2 = c01833b.A00;
                    if (i2 == 1) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i2 == 2) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i2 == 8) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    i3++;
                    c2 = 2;
                    break;
                case 7:
                    c01833b = c01833b;
                    if (c01833b.A02 != i) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c01833b = c01833b;
                    i = c01833b.A01;
                    c2 = 6;
                    break;
                case '\t':
                    c01833b = c01833b;
                    if (c01833b.A02 >= i) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    i--;
                    c2 = 11;
                    break;
                case 11:
                    c01833b = c01833b;
                    if (c01833b.A01 > i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    i++;
                    c2 = 6;
                    break;
                case '\r':
                    c01833b = c01833b;
                    if (c01833b.A02 > i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c01833b = c01833b;
                    if (c01833b.A02 + c01833b.A01 <= i) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    return -1;
                case 16:
                    c01833b = c01833b;
                    i -= c01833b.A01;
                    c2 = 6;
                    break;
                case 17:
                    c01833b = c01833b;
                    if (c01833b.A02 > i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c01833b = c01833b;
                    i += c01833b.A01;
                    c2 = 6;
                    break;
                case 19:
                    return i;
            }
        }
    }

    public final void A0F() {
        C0813Sy c0813Sy = this;
        int size = c0813Sy.A06.size();
        int i = 0;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    if (i >= size) {
                        i2 = 4;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    c0813Sy = c0813Sy;
                    c0813Sy.A02.A9N(c0813Sy.A06.get(i));
                    i++;
                    i2 = 2;
                    break;
                case 4:
                    C0813Sy c0813Sy2 = c0813Sy;
                    c0813Sy2.A0B(c0813Sy2.A06);
                    c0813Sy2.A00 = 0;
                    return;
            }
        }
    }

    public final void A0G() {
        C0813Sy c0813Sy = this;
        C01833b op = null;
        Runnable runnable = null;
        int i = 0;
        c0813Sy.A0F();
        int size = c0813Sy.A05.size();
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= size) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0813Sy = c0813Sy;
                    op = c0813Sy.A05.get(i2);
                    i = op.A00;
                    if (i == 1) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 2) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == 4) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i == 8) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0813Sy = c0813Sy;
                    runnable = c0813Sy.A04;
                    if (runnable == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    runnable = runnable;
                    runnable.run();
                    c2 = '\t';
                    break;
                case '\t':
                    i2++;
                    c2 = 2;
                    break;
                case '\n':
                    c0813Sy = c0813Sy;
                    op = op;
                    c0813Sy.A02.A9N(op);
                    c0813Sy.A02.A8i(op.A02, op.A01);
                    c2 = 7;
                    break;
                case 11:
                    c0813Sy = c0813Sy;
                    op = op;
                    c0813Sy.A02.A9N(op);
                    c0813Sy.A02.A8T(op.A02, op.A01, op.A03);
                    c2 = 7;
                    break;
                case '\f':
                    c0813Sy = c0813Sy;
                    op = op;
                    c0813Sy.A02.A9N(op);
                    c0813Sy.A02.A8j(op.A02, op.A01);
                    c2 = 7;
                    break;
                case '\r':
                    c0813Sy = c0813Sy;
                    op = op;
                    c0813Sy.A02.A9N(op);
                    c0813Sy.A02.A8h(op.A02, op.A01);
                    c2 = 7;
                    break;
                case 14:
                    C0813Sy c0813Sy2 = c0813Sy;
                    c0813Sy2.A0B(c0813Sy2.A05);
                    c0813Sy2.A00 = 0;
                    return;
            }
        }
    }

    public final void A0H() {
        C0813Sy c0813Sy = this;
        C01833b op = null;
        int i = 0;
        Runnable runnable = null;
        c0813Sy.A03.A05(c0813Sy.A05);
        int size = c0813Sy.A05.size();
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= size) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0813Sy = c0813Sy;
                    op = c0813Sy.A05.get(i2);
                    i = op.A00;
                    if (i == 1) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 2) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == 4) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i == 8) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0813Sy = c0813Sy;
                    runnable = c0813Sy.A04;
                    if (runnable == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    runnable = runnable;
                    runnable.run();
                    c2 = '\t';
                    break;
                case '\t':
                    i2++;
                    c2 = 2;
                    break;
                case '\n':
                    c0813Sy = c0813Sy;
                    op = op;
                    c0813Sy.A05(op);
                    c2 = 7;
                    break;
                case 11:
                    c0813Sy = c0813Sy;
                    op = op;
                    c0813Sy.A07(op);
                    c2 = 7;
                    break;
                case '\f':
                    c0813Sy = c0813Sy;
                    op = op;
                    c0813Sy.A06(op);
                    c2 = 7;
                    break;
                case '\r':
                    c0813Sy = c0813Sy;
                    op = op;
                    c0813Sy.A04(op);
                    c2 = 7;
                    break;
                case 14:
                    c0813Sy.A05.clear();
                    return;
            }
        }
    }

    public final void A0I() {
        A0B(this.A05);
        A0B(this.A06);
        this.A00 = 0;
    }

    public final boolean A0J() {
        boolean z = false;
        char c2 = this.A05.size() > 0 ? (char) 2 : (char) 4;
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

    public final boolean A0K() {
        C0813Sy c0813Sy = this;
        boolean z = false;
        char c2 = !c0813Sy.A06.isEmpty() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0813Sy = c0813Sy;
                    if (!c0813Sy.A05.isEmpty()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
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

    public final boolean A0L(int i) {
        boolean z = false;
        char c2 = (this.A00 & i) != 0 ? (char) 2 : (char) 4;
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

    @Override // com.facebook.ads.redexgen.X.InterfaceC02053y
    public final C01833b A8g(int i, int i2, int i3, Object obj) {
        C01833b c01833bA2O = this.A01.A2O();
        char c2 = c01833bA2O == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    obj = obj;
                    c01833bA2O = new C01833b(i, i2, i3, obj);
                    c2 = 3;
                    break;
                case 3:
                    return c01833bA2O;
                case 4:
                    obj = obj;
                    c01833bA2O = c01833bA2O;
                    c01833bA2O.A00 = i;
                    c01833bA2O.A02 = i2;
                    c01833bA2O.A01 = i3;
                    c01833bA2O.A03 = obj;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02053y
    public final void ACE(C01833b c01833b) {
        if (!this.A07) {
            c01833b.A03 = null;
            this.A01.ACM(c01833b);
        }
    }
}
