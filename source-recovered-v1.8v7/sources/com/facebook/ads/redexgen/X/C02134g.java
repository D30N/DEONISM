package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02134g {
    public static byte[] A02;

    @VisibleForTesting
    public final C0796Sf<C4Y, C02114e> A00 = new C0796Sf<>();

    @VisibleForTesting
    public final C2K<C4Y> A01 = new C2K<>();

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 83);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{-91, -51, -53, -52, 120, -56, -54, -57, -50, -63, -68, -67, 120, -66, -60, -71, -65, 120, -88, -86, -99, 120, -57, -54, 120, -88, -89, -85, -84};
    }

    private C4B A00(C4Y c4y, int i) {
        C02134g c02134g = this;
        C4B c4b = null;
        C02114e c02114eA0B = null;
        int iA08 = c02134g.A00.A08(c4y);
        char c2 = iA08 < 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (C4B) null;
                case 3:
                    c02134g = c02134g;
                    c02114eA0B = c02134g.A00.A0B(iA08);
                    if (c02114eA0B == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c02114eA0B = c02114eA0B;
                    if ((c02114eA0B.A00 & i) == 0) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c02114eA0B = c02114eA0B;
                    c02114eA0B.A00 &= i ^ (-1);
                    if (i != 4) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c02114eA0B = c02114eA0B;
                    c4b = c02114eA0B.A02;
                    c2 = 7;
                    break;
                case 7:
                    c02114eA0B = c02114eA0B;
                    if ((c02114eA0B.A00 & 12) != 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c02134g = c02134g;
                    c02114eA0B = c02114eA0B;
                    c02134g.A00.A0A(iA08);
                    C02114e.A02(c02114eA0B);
                    c2 = '\t';
                    break;
                case '\t':
                    return c4b;
                case '\n':
                    if (i != 8) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c02114eA0B = c02114eA0B;
                    c4b = c02114eA0B.A01;
                    c2 = 7;
                    break;
                case '\f':
                    throw new IllegalArgumentException(A01(0, 29, 5));
                case '\r':
                    return (C4B) null;
            }
        }
    }

    @Nullable
    public final C4B A03(C4Y c4y) {
        return A00(c4y, 8);
    }

    @Nullable
    public final C4B A04(C4Y c4y) {
        return A00(c4y, 4);
    }

    public final C4Y A05(long j) {
        return this.A01.A08(j);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        C02114e.A01();
    }

    public final void A08(long j, C4Y c4y) {
        this.A01.A0B(j, c4y);
    }

    public final void A09(C4Y c4y) {
        C02114e c02114eA00 = this.A00.get(c4y);
        if (c02114eA00 == null) {
            c02114eA00 = C02114e.A00();
            this.A00.put(c4y, c02114eA00);
        }
        c02114eA00.A00 |= 1;
    }

    public final void A0A(C4Y c4y) {
        C02114e c02114e = this.A00.get(c4y);
        if (c02114e == null) {
            return;
        }
        c02114e.A00 &= -2;
    }

    public final void A0B(C4Y c4y) {
        C02134g c02134g = this;
        C02114e c02114eRemove = null;
        int iA06 = c02134g.A01.A06() - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (iA06 < 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c02134g = c02134g;
                    c4y = c4y;
                    if (c4y != c02134g.A01.A07(iA06)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c02134g = c02134g;
                    c02134g.A01.A0A(iA06);
                    c2 = 5;
                    break;
                case 5:
                    c02134g = c02134g;
                    c4y = c4y;
                    c02114eRemove = c02134g.A00.remove(c4y);
                    if (c02114eRemove == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c02114eRemove = c02114eRemove;
                    C02114e.A02(c02114eRemove);
                    c2 = 7;
                    break;
                case 7:
                    return;
                case '\b':
                    iA06--;
                    c2 = 2;
                    break;
            }
        }
    }

    public final void A0C(C4Y c4y) {
        A0A(c4y);
    }

    public final void A0D(C4Y c4y, C4B c4b) {
        C02114e c02114eA00 = this.A00.get(c4y);
        if (c02114eA00 == null) {
            c02114eA00 = C02114e.A00();
            this.A00.put(c4y, c02114eA00);
        }
        c02114eA00.A00 |= 2;
        c02114eA00.A02 = c4b;
    }

    public final void A0E(C4Y c4y, C4B c4b) {
        C02114e c02114eA00 = this.A00.get(c4y);
        if (c02114eA00 == null) {
            c02114eA00 = C02114e.A00();
            this.A00.put(c4y, c02114eA00);
        }
        c02114eA00.A01 = c4b;
        c02114eA00.A00 |= 8;
    }

    public final void A0F(C4Y c4y, C4B c4b) {
        C02114e c02114eA00 = this.A00.get(c4y);
        if (c02114eA00 == null) {
            c02114eA00 = C02114e.A00();
            this.A00.put(c4y, c02114eA00);
        }
        c02114eA00.A02 = c4b;
        c02114eA00.A00 |= 4;
    }

    public final void A0G(InterfaceC02124f interfaceC02124f) {
        C02134g c02134g = this;
        C02114e record = null;
        C4Y c4yA09 = null;
        int size = c02134g.A00.size() - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (size < 0) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c02134g = c02134g;
                    c4yA09 = c02134g.A00.A09(size);
                    record = c02134g.A00.A0A(size);
                    if ((record.A00 & 3) != 3) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    interfaceC02124f = interfaceC02124f;
                    c4yA09 = c4yA09;
                    interfaceC02124f.ADi(c4yA09);
                    c2 = 5;
                    break;
                case 5:
                    record = record;
                    C02114e.A02(record);
                    size--;
                    c2 = 2;
                    break;
                case 6:
                    record = record;
                    if ((record.A00 & 1) == 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    record = record;
                    if (record.A02 != null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    interfaceC02124f = interfaceC02124f;
                    c4yA09 = c4yA09;
                    interfaceC02124f.ADi(c4yA09);
                    c2 = 5;
                    break;
                case '\t':
                    interfaceC02124f = interfaceC02124f;
                    c4yA09 = c4yA09;
                    record = record;
                    interfaceC02124f.ABv(c4yA09, record.A02, record.A01);
                    c2 = 5;
                    break;
                case '\n':
                    record = record;
                    if ((record.A00 & 14) != 14) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    interfaceC02124f = interfaceC02124f;
                    c4yA09 = c4yA09;
                    record = record;
                    interfaceC02124f.ABt(c4yA09, record.A02, record.A01);
                    c2 = 5;
                    break;
                case '\f':
                    record = record;
                    if ((record.A00 & 12) != 12) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    interfaceC02124f = interfaceC02124f;
                    c4yA09 = c4yA09;
                    record = record;
                    interfaceC02124f.ABx(c4yA09, record.A02, record.A01);
                    c2 = 5;
                    break;
                case 14:
                    record = record;
                    if ((record.A00 & 4) == 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    interfaceC02124f = interfaceC02124f;
                    c4yA09 = c4yA09;
                    record = record;
                    interfaceC02124f.ABv(c4yA09, record.A02, null);
                    c2 = 5;
                    break;
                case 16:
                    record = record;
                    if ((record.A00 & 8) == 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    interfaceC02124f = interfaceC02124f;
                    c4yA09 = c4yA09;
                    record = record;
                    interfaceC02124f.ABt(c4yA09, record.A02, record.A01);
                    c2 = 5;
                    break;
                case 18:
                    return;
            }
        }
    }

    public final boolean A0H(C4Y c4y) {
        C02114e c02114e = this.A00.get(c4y);
        boolean z = true;
        char c2 = c02114e != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c02114e = c02114e;
                    if ((c02114e.A00 & (z ? 1 : 0)) == 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final boolean A0I(C4Y c4y) {
        boolean z = false;
        C02114e c02114e = this.A00.get(c4y);
        char c2 = c02114e != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c02114e = c02114e;
                    if ((c02114e.A00 & 4) == 0) {
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
}
