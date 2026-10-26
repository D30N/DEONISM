package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZX implements DI {
    public static byte[] A0E;
    public long A00;
    public long A01;
    public CO A02;
    public DM A03;
    public String A04;
    public boolean A05;
    public final DR A09;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean[] A0D = new boolean[3];
    public final DO A08 = new DO(7, 128);
    public final DO A06 = new DO(8, 128);
    public final DO A07 = new DO(6, 128);
    public final C0544Ii A0A = new C0544Ii();

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 33);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A0E = new byte[]{11, 20, 25, 24, 18, 82, 28, 11, 30};
    }

    public ZX(DR dr, boolean z, boolean z2) {
        this.A09 = dr;
        this.A0B = z;
        this.A0C = z2;
    }

    private void A02(long j, int i, int i2, long j2) {
        int i3 = 0;
        ZX zx = this;
        char c2 = zx.A05 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    zx = zx;
                    if (!zx.A03.A07()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    zx = zx;
                    zx.A08.A04(i2);
                    zx.A06.A04(i2);
                    i3 = 3;
                    if (!zx.A05) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case 4:
                    zx = zx;
                    if (!zx.A08.A03()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    zx = zx;
                    if (!zx.A06.A03()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    zx = zx;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(zx.A08.A01, zx.A08.A00));
                    arrayList.add(Arrays.copyOf(zx.A06.A01, zx.A06.A00));
                    C0539Id c0539IdA06 = C0540Ie.A06(zx.A08.A01, i3, zx.A08.A00);
                    C0538Ic c0538IcA05 = C0540Ie.A05(zx.A06.A01, i3, zx.A06.A00);
                    zx.A02.A5A(Format.A03(zx.A04, A00(0, 9, 92), null, -1, -1, c0539IdA06.A06, c0539IdA06.A02, -1.0f, arrayList, -1, c0539IdA06.A00, null));
                    zx.A05 = true;
                    zx.A03.A05(c0539IdA06);
                    zx.A03.A04(c0538IcA05);
                    zx.A08.A00();
                    zx.A06.A00();
                    c2 = 7;
                    break;
                case 7:
                    zx = zx;
                    if (!zx.A07.A04(i2)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    zx = zx;
                    int unescapedLength = C0540Ie.A02(zx.A07.A01, zx.A07.A00);
                    zx.A0A.A0b(zx.A07.A01, unescapedLength);
                    zx.A0A.A0Y(4);
                    zx.A09.A02(j2, zx.A0A);
                    c2 = '\t';
                    break;
                case '\t':
                    zx.A03.A02(j, i);
                    return;
                case '\n':
                    zx = zx;
                    if (!zx.A08.A03()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    zx = zx;
                    zx.A03.A05(C0540Ie.A06(zx.A08.A01, i3, zx.A08.A00));
                    zx.A08.A00();
                    c2 = 7;
                    break;
                case '\f':
                    zx = zx;
                    if (!zx.A06.A03()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    zx = zx;
                    zx.A03.A04(C0540Ie.A05(zx.A06.A01, i3, zx.A06.A00));
                    zx.A06.A00();
                    c2 = 7;
                    break;
            }
        }
    }

    private void A03(long j, int i, long j2) {
        ZX zx = this;
        char c2 = zx.A05 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    zx = zx;
                    if (!zx.A03.A07()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    zx = zx;
                    zx.A08.A01(i);
                    zx.A06.A01(i);
                    c2 = 4;
                    break;
                case 4:
                    ZX zx2 = zx;
                    zx2.A07.A01(i);
                    zx2.A03.A03(j, i, j2);
                    return;
            }
        }
    }

    private void A04(byte[] bArr, int i, int i2) {
        ZX zx = this;
        char c2 = zx.A05 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    zx = zx;
                    if (!zx.A03.A07()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    zx = zx;
                    bArr = bArr;
                    zx.A08.A02(bArr, i, i2);
                    zx.A06.A02(bArr, i, i2);
                    c2 = 4;
                    break;
                case 4:
                    ZX zx2 = zx;
                    byte[] bArr2 = bArr;
                    zx2.A07.A02(bArr2, i, i2);
                    zx2.A03.A06(bArr2, i, i2);
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void A47(C0544Ii c0544Ii) {
        ZX zx = this;
        int i = 0;
        long j = 0;
        int i2 = 0;
        int iA01 = 0;
        int nalUnitType = 0;
        int lengthToNalUnit = 0;
        ZX zx2 = zx;
        int iA06 = c0544Ii.A06();
        int iA07 = c0544Ii.A07();
        byte[] bArr = c0544Ii.A00;
        zx2.A01 += c0544Ii.A04();
        zx2.A02.ACk(c0544Ii, c0544Ii.A04());
        int nalUnitOffset = 2;
        while (true) {
            switch (nalUnitOffset) {
                case 2:
                    zx2 = zx2;
                    bArr = bArr;
                    lengthToNalUnit = C0540Ie.A04(bArr, iA06, iA07, zx2.A0D);
                    if (lengthToNalUnit != iA07) {
                        nalUnitOffset = 4;
                        break;
                    } else {
                        nalUnitOffset = 3;
                        break;
                    }
                case 3:
                    zx2.A04(bArr, iA06, iA07);
                    return;
                case 4:
                    bArr = bArr;
                    iA01 = C0540Ie.A01(bArr, lengthToNalUnit);
                    nalUnitType = lengthToNalUnit - iA06;
                    if (nalUnitType <= 0) {
                        nalUnitOffset = 6;
                        break;
                    } else {
                        nalUnitOffset = 5;
                        break;
                    }
                case 5:
                    zx2 = zx2;
                    bArr = bArr;
                    zx2.A04(bArr, iA06, lengthToNalUnit);
                    nalUnitOffset = 6;
                    break;
                case 6:
                    zx2 = zx2;
                    i2 = iA07 - lengthToNalUnit;
                    j = zx2.A01 - i2;
                    if (nalUnitType >= 0) {
                        nalUnitOffset = 9;
                        break;
                    } else {
                        nalUnitOffset = 7;
                        break;
                    }
                case 7:
                    i = -nalUnitType;
                    nalUnitOffset = 8;
                    break;
                case 8:
                    zx = zx;
                    zx2 = zx2;
                    zx.A02(j, i2, i, zx2.A00);
                    zx.A03(j, iA01, zx2.A00);
                    iA06 = lengthToNalUnit + 3;
                    nalUnitOffset = 2;
                    break;
                case 9:
                    i = 0;
                    nalUnitOffset = 8;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void A4U(CE ce, DW dw) {
        dw.A05();
        this.A04 = dw.A04();
        this.A02 = ce.ADd(dw.A03(), 2);
        this.A03 = new DM(this.A02, this.A0B, this.A0C);
        this.A09.A03(ce, dw);
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ABa() {
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ABb(long j, boolean z) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void ACo() {
        C0540Ie.A0B(this.A0D);
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
