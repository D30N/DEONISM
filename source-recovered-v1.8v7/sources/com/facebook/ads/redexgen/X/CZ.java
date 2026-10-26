package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class CZ {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public boolean A04;
    public final byte[] A05 = new byte[10];

    public final void A00() {
        this.A04 = false;
    }

    public final void A01(CD cd, int i, int i2) throws InterruptedException, IOException {
        CZ cz = this;
        int i3 = 0;
        char c2 = !cz.A04 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    cz = cz;
                    cd = cd;
                    i3 = 0;
                    cd.ABf(cz.A05, 0, 10);
                    cd.ACg();
                    if (C0361Ak.A06(cz.A05) != -1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    cz = cz;
                    cz.A04 = true;
                    cz.A02 = i3;
                    c2 = 5;
                    break;
                case 5:
                    cz = cz;
                    if (cz.A02 != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    cz = cz;
                    cz.A00 = i;
                    cz.A01 = i3;
                    c2 = 7;
                    break;
                case 7:
                    cz.A01 += i2;
                    return;
            }
        }
    }

    public final void A02(CY cy) {
        CZ cz = this;
        char c2 = cz.A04 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    cz = cz;
                    if (cz.A02 <= 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    cz = cz;
                    cy = cy;
                    cy.A0W.ACl(cz.A03, cz.A00, cz.A01, 0, cy.A0V);
                    cz.A02 = 0;
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A03(CY cy, long j) {
        CZ cz = this;
        char c2 = !cz.A04 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    cz = cz;
                    int i = cz.A02;
                    cz.A02 = i + 1;
                    if (i != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    cz = cz;
                    cz.A03 = j;
                    c2 = 5;
                    break;
                case 5:
                    cz = cz;
                    if (cz.A02 >= 16) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return;
                case 7:
                    CZ cz2 = cz;
                    CY cy2 = cy;
                    cy2.A0W.ACl(cz2.A03, cz2.A00, cz2.A01, 0, cy2.A0V);
                    cz2.A02 = 0;
                    return;
            }
        }
    }
}
