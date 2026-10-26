package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;

/* loaded from: assets/audience_network.dex */
public final class Cp {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C0408Cj A04;
    public C0416Cy A05;
    public final CO A06;
    public final D0 A07 = new D0();
    public final C0544Ii A09 = new C0544Ii(1);
    public final C0544Ii A08 = new C0544Ii();

    public Cp(CO co) {
        this.A06 = co;
    }

    private C0417Cz A00() {
        Cp cp = this;
        C0417Cz c0417CzA00 = null;
        int i = cp.A07.A07.A02;
        char c2 = cp.A07.A08 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    cp = cp;
                    c0417CzA00 = cp.A07.A08;
                    c2 = 3;
                    break;
                case 3:
                    return c0417CzA00;
                case 4:
                    cp = cp;
                    c0417CzA00 = cp.A05.A00(i);
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        Cp cp = this;
        C0417Cz encryptionBox = null;
        C0544Ii c0544Ii = null;
        char c2 = !cp.A07.A0A ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    cp = cp;
                    c0544Ii = cp.A07.A09;
                    encryptionBox = cp.A00();
                    if (encryptionBox.A00 == 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0544Ii = c0544Ii;
                    encryptionBox = encryptionBox;
                    c0544Ii.A0Z(encryptionBox.A00);
                    c2 = 5;
                    break;
                case 5:
                    cp = cp;
                    if (!cp.A07.A0H[cp.A01]) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Z(c0544Ii.A0I() * 6);
                    c2 = 7;
                    break;
                case 7:
                    return;
            }
        }
    }

    public final int A03() {
        Cp cp = this;
        int i = 0;
        byte[] bArr = null;
        C0544Ii c0544Ii = null;
        C0417Cz c0417CzA00 = null;
        int length = 0;
        boolean z = false;
        char c2 = !cp.A07.A0A ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 0;
                case 3:
                    cp = cp;
                    c0417CzA00 = cp.A00();
                    if (c0417CzA00.A00 == 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    cp = cp;
                    c0417CzA00 = c0417CzA00;
                    c0544Ii = cp.A07.A09;
                    length = c0417CzA00.A00;
                    c2 = 5;
                    break;
                case 5:
                    cp = cp;
                    z = cp.A07.A0H[cp.A01];
                    bArr = cp.A09.A00;
                    if (!z) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    i = 128;
                    c2 = 7;
                    break;
                case 7:
                    cp = cp;
                    c0544Ii = c0544Ii;
                    bArr = bArr;
                    bArr[0] = (byte) (i | length);
                    cp.A09.A0Y(0);
                    cp.A06.ACk(cp.A09, 1);
                    cp.A06.ACk(c0544Ii, length);
                    if (!z) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case '\b':
                    return length + 1;
                case '\t':
                    i = 0;
                    c2 = 7;
                    break;
                case '\n':
                    cp = cp;
                    c0417CzA00 = c0417CzA00;
                    byte[] bArr2 = c0417CzA00.A04;
                    cp.A08.A0b(bArr2, bArr2.length);
                    c0544Ii = cp.A08;
                    length = bArr2.length;
                    c2 = 5;
                    break;
                case 11:
                    Cp cp2 = cp;
                    C0544Ii c0544Ii2 = cp2.A07.A09;
                    int iA0I = c0544Ii2.A0I();
                    c0544Ii2.A0Z(-2);
                    int i2 = (iA0I * 6) + 2;
                    cp2.A06.ACk(c0544Ii2, i2);
                    return length + 1 + i2;
            }
        }
    }

    public final void A04() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A05(long j) {
        Cp cp = this;
        long jA01 = C03419q.A01(j);
        int i = cp.A01;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    cp = cp;
                    if (i >= cp.A07.A00) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    cp = cp;
                    if (cp.A07.A00(i) >= jA01) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    cp = cp;
                    if (!cp.A07.A0I[i]) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    cp = cp;
                    cp.A03 = i;
                    c2 = 6;
                    break;
                case 6:
                    i++;
                    c2 = 2;
                    break;
                case 7:
                    return;
            }
        }
    }

    public final void A06(DrmInitData drmInitData) {
        String str = null;
        C0417Cz c0417CzA00 = this.A05.A00(this.A07.A07.A02);
        char c2 = c0417CzA00 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0417CzA00 = c0417CzA00;
                    str = c0417CzA00.A02;
                    c2 = 3;
                    break;
                case 3:
                    Cp cp = this;
                    cp.A06.A5A(cp.A05.A07.A0N(drmInitData.A04(str)));
                    return;
                case 4:
                    str = null;
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A07(C0416Cy c0416Cy, C0408Cj c0408Cj) {
        this.A05 = (C0416Cy) IJ.A01(c0416Cy);
        this.A04 = (C0408Cj) IJ.A01(c0408Cj);
        this.A06.A5A(c0416Cy.A07);
        A04();
    }

    public final boolean A08() {
        this.A01++;
        this.A00++;
        int i = this.A00;
        int[] iArr = this.A07.A0E;
        int i2 = this.A02;
        if (i != iArr[i2]) {
            return true;
        }
        this.A02 = i2 + 1;
        this.A00 = 0;
        return false;
    }
}
