package com.facebook.ads.redexgen.X;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02063z {
    public final InterfaceC02053y A00;

    public C02063z(InterfaceC02053y interfaceC02053y) {
        this.A00 = interfaceC02053y;
    }

    private int A00(List<C01833b> list) {
        boolean z = false;
        int size = list.size() - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (size < 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    list = list;
                    C01833b op1 = list.get(size);
                    if (op1.A00 != 8) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (!z) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return size;
                case 6:
                    z = true;
                    c2 = 7;
                    break;
                case 7:
                    size--;
                    c2 = 2;
                    break;
                case '\b':
                    return -1;
            }
        }
    }

    private void A01(List<C01833b> list, int i, int i2) {
        List<C01833b> list2 = list;
        C02063z c02063z = this;
        C01833b c01833b = list2.get(i);
        C01833b c01833b2 = list2.get(i2);
        int i3 = c01833b2.A00;
        char c2 = i3 != 1 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 == 2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i3 == 4) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    c02063z = c02063z;
                    list2 = list2;
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    c02063z.A04(list2, i, c01833b, i2, c01833b2);
                    c2 = 4;
                    break;
                case 6:
                    c02063z = c02063z;
                    list2 = list2;
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    c02063z.A03(list2, i, c01833b, i2, c01833b2);
                    c2 = 4;
                    break;
                case 7:
                    c02063z = c02063z;
                    list2 = list2;
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    c02063z.A02(list2, i, c01833b, i2, c01833b2);
                    c2 = 4;
                    break;
            }
        }
    }

    private void A02(List<C01833b> list, int i, C01833b c01833b, int i2, C01833b c01833b2) {
        int i3 = 0;
        char c2 = c01833b.A01 < c01833b2.A02 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    i3 = 0 - 1;
                    c2 = 3;
                    break;
                case 3:
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    if (c01833b.A02 >= c01833b2.A02) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i3++;
                    c2 = 5;
                    break;
                case 5:
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    if (c01833b2.A02 > c01833b.A02) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    c01833b.A02 += c01833b2.A01;
                    c2 = 7;
                    break;
                case 7:
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    if (c01833b2.A02 > c01833b.A01) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    c01833b.A01 += c01833b2.A01;
                    c2 = '\t';
                    break;
                case '\t':
                    List<C01833b> list2 = list;
                    C01833b c01833b3 = c01833b2;
                    c01833b3.A02 += i3;
                    list2.set(i, c01833b3);
                    list2.set(i2, c01833b);
                    return;
            }
        }
    }

    private final void A03(List<C01833b> list, int i, C01833b c01833b, int i2, C01833b c01833b2) {
        C02063z c02063z = this;
        boolean z = false;
        int i3 = 0;
        C01833b c01833bA8g = null;
        boolean z2 = false;
        char c2 = c01833b.A02 < c01833b.A01 ? (char) 2 : (char) 17;
        while (true) {
            switch (c2) {
                case 2:
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    z = false;
                    if (c01833b2.A02 != c01833b.A02) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    if (c01833b2.A01 != c01833b.A01 - c01833b.A02) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z2 = true;
                    c2 = 5;
                    break;
                case 5:
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    i3 = 2;
                    if (c01833b.A01 >= c01833b2.A02) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c01833b2 = c01833b2;
                    c01833b2.A02--;
                    c2 = 7;
                    break;
                case 7:
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    if (c01833b.A02 > c01833b2.A02) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c01833b2 = c01833b2;
                    c01833b2.A02++;
                    c2 = '\t';
                    break;
                case '\t':
                    if (!z2) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    List<C01833b> list2 = list;
                    list2.set(i, c01833b2);
                    list2.remove(i2);
                    c02063z.A00.ACE(c01833b);
                    return;
                case 11:
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    if (c01833b.A02 >= c01833b2.A02 + c01833b2.A01) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c02063z = c02063z;
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    c01833bA8g = c02063z.A00.A8g(i3, c01833b.A02 + 1, (c01833b2.A02 + c01833b2.A01) - c01833b.A02, null);
                    c01833b2.A01 = c01833b.A02 - c01833b2.A02;
                    c2 = '\t';
                    break;
                case '\r':
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    if (c01833b.A01 >= c01833b2.A02 + c01833b2.A01) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    c01833b2.A01--;
                    c01833b.A00 = i3;
                    c01833b.A01 = 1;
                    if (c01833b2.A01 != 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c02063z = c02063z;
                    list = list;
                    c01833b2 = c01833b2;
                    list.remove(i2);
                    c02063z.A00.ACE(c01833b2);
                    c2 = 16;
                    break;
                case 16:
                    return;
                case 17:
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    z = true;
                    if (c01833b2.A02 != c01833b.A01 + 1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    if (c01833b2.A01 != c01833b.A02 - c01833b.A01) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    z2 = true;
                    c2 = 5;
                    break;
                case 20:
                    if (!z) {
                        c2 = '$';
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    if (c01833bA8g == null) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    c01833b = c01833b;
                    if (c01833b.A02 <= c01833bA8g.A02) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    c01833b = c01833b;
                    c01833b.A02 -= c01833bA8g.A01;
                    c2 = 24;
                    break;
                case 24:
                    c01833b = c01833b;
                    if (c01833b.A01 <= c01833bA8g.A02) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    c01833b = c01833b;
                    c01833b.A01 -= c01833bA8g.A01;
                    c2 = 26;
                    break;
                case 26:
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    if (c01833b.A02 <= c01833b2.A02) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    c01833b.A02 -= c01833b2.A01;
                    c2 = 28;
                    break;
                case 28:
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    if (c01833b.A01 <= c01833b2.A02) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 29;
                        break;
                    }
                case 29:
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    c01833b.A01 -= c01833b2.A01;
                    c2 = 30;
                    break;
                case 30:
                    list = list;
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    list.set(i, c01833b2);
                    if (c01833b.A02 == c01833b.A01) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = 31;
                        break;
                    }
                case 31:
                    list = list;
                    c01833b = c01833b;
                    list.set(i2, c01833b);
                    c2 = ' ';
                    break;
                case ' ':
                    if (c01833bA8g == null) {
                        c2 = '\"';
                        break;
                    } else {
                        c2 = '!';
                        break;
                    }
                case '!':
                    list = list;
                    list.add(i, c01833bA8g);
                    c2 = '\"';
                    break;
                case '\"':
                    return;
                case '#':
                    list = list;
                    list.remove(i2);
                    c2 = ' ';
                    break;
                case '$':
                    if (c01833bA8g == null) {
                        c2 = ')';
                        break;
                    } else {
                        c2 = '%';
                        break;
                    }
                case '%':
                    c01833b = c01833b;
                    if (c01833b.A02 < c01833bA8g.A02) {
                        c2 = '\'';
                        break;
                    } else {
                        c2 = '&';
                        break;
                    }
                case '&':
                    c01833b = c01833b;
                    c01833b.A02 -= c01833bA8g.A01;
                    c2 = '\'';
                    break;
                case '\'':
                    c01833b = c01833b;
                    if (c01833b.A01 < c01833bA8g.A02) {
                        c2 = ')';
                        break;
                    } else {
                        c2 = '(';
                        break;
                    }
                case '(':
                    c01833b = c01833b;
                    c01833b.A01 -= c01833bA8g.A01;
                    c2 = ')';
                    break;
                case ')':
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    if (c01833b.A02 < c01833b2.A02) {
                        c2 = '+';
                        break;
                    } else {
                        c2 = '*';
                        break;
                    }
                case '*':
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    c01833b.A02 -= c01833b2.A01;
                    c2 = '+';
                    break;
                case '+':
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    if (c01833b.A01 < c01833b2.A02) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = ',';
                        break;
                    }
                case ',':
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    c01833b.A01 -= c01833b2.A01;
                    c2 = 30;
                    break;
            }
        }
    }

    private final void A04(List<C01833b> list, int i, C01833b c01833b, int i2, C01833b c01833b2) {
        C02063z c02063z = this;
        C01833b c01833bA8g = null;
        C01833b c01833bA8g2 = null;
        char c2 = c01833b.A01 < c01833b2.A02 ? (char) 2 : (char) 15;
        while (true) {
            switch (c2) {
                case 2:
                    c01833b2 = c01833b2;
                    c01833b2.A02--;
                    c2 = 3;
                    break;
                case 3:
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    if (c01833b.A02 > c01833b2.A02) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c01833b2 = c01833b2;
                    c01833b2.A02++;
                    c2 = 5;
                    break;
                case 5:
                    list = list;
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    list.set(i2, c01833b);
                    if (c01833b2.A01 <= 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    list = list;
                    c01833b2 = c01833b2;
                    list.set(i, c01833b2);
                    c2 = 7;
                    break;
                case 7:
                    if (c01833bA8g == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    list = list;
                    list.add(i, c01833bA8g);
                    c2 = '\t';
                    break;
                case '\t':
                    if (c01833bA8g2 == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    list = list;
                    list.add(i, c01833bA8g2);
                    c2 = 11;
                    break;
                case 11:
                    return;
                case '\f':
                    c02063z = c02063z;
                    list = list;
                    c01833b2 = c01833b2;
                    list.remove(i);
                    c02063z.A00.ACE(c01833b2);
                    c2 = 7;
                    break;
                case '\r':
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    if (c01833b.A02 >= c01833b2.A02 + c01833b2.A01) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c02063z = c02063z;
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    int i3 = (c01833b2.A02 + c01833b2.A01) - c01833b.A02;
                    c01833bA8g2 = c02063z.A00.A8g(4, c01833b.A02 + 1, i3, c01833b2.A03);
                    c01833b2.A01 -= i3;
                    c2 = 5;
                    break;
                case 15:
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    if (c01833b.A01 >= c01833b2.A02 + c01833b2.A01) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c02063z = c02063z;
                    c01833b = c01833b;
                    c01833b2 = c01833b2;
                    c01833b2.A01--;
                    c01833bA8g = c02063z.A00.A8g(4, c01833b.A02, 1, c01833b2.A03);
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A05(List<C01833b> list) {
        C02063z c02063z = this;
        int iA00 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c02063z = c02063z;
                    list = list;
                    iA00 = c02063z.A00(list);
                    if (iA00 == -1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c02063z = c02063z;
                    list = list;
                    c02063z.A01(list, iA00, iA00 + 1);
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }
}
