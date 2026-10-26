package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class DL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public C0539Id A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public DL() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A00(DL dl) {
        DL dl2 = this;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = true;
        char c2 = dl2.A0F ? (char) 2 : (char) 25;
        while (true) {
            switch (c2) {
                case 2:
                    dl = dl;
                    if (!dl.A0F) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    dl2 = dl2;
                    dl = dl;
                    if (dl2.A03 != dl.A03) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    dl2 = dl2;
                    dl = dl;
                    if (dl2.A07 != dl.A07) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    dl2 = dl2;
                    dl = dl;
                    if (dl2.A0C != dl.A0C) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    dl2 = dl2;
                    if (!dl2.A0B) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    dl = dl;
                    if (!dl.A0B) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    dl2 = dl2;
                    dl = dl;
                    if (dl2.A0A != dl.A0A) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    dl2 = dl2;
                    dl = dl;
                    i = dl2.A05;
                    i2 = dl.A05;
                    if (i == i2) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (i == 0) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    if (i2 == 0) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    dl2 = dl2;
                    if (dl2.A09.A04 != 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    dl = dl;
                    if (dl.A09.A04 != 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    dl2 = dl2;
                    dl = dl;
                    if (dl2.A06 != dl.A06) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    dl2 = dl2;
                    dl = dl;
                    if (dl2.A02 != dl.A02) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    dl2 = dl2;
                    if (dl2.A09.A04 != z3) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    dl = dl;
                    if (dl.A09.A04 != z3) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    dl2 = dl2;
                    dl = dl;
                    if (dl2.A00 != dl.A00) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    dl2 = dl2;
                    dl = dl;
                    if (dl2.A01 != dl.A01) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    dl2 = dl2;
                    dl = dl;
                    z2 = dl2.A0E;
                    z = dl.A0E;
                    if (z2 != z) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    if (!z2) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    if (!z) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    dl2 = dl2;
                    dl = dl;
                    if (dl2.A04 == dl.A04) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    return z3;
                case 25:
                    z3 = false;
                    c2 = 24;
                    break;
            }
        }
    }

    public final void A02() {
        this.A0D = false;
        this.A0F = false;
    }

    public final void A03(int i) {
        this.A08 = i;
        this.A0D = true;
    }

    public final void A04(C0539Id c0539Id, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
        this.A09 = c0539Id;
        this.A05 = i;
        this.A08 = i2;
        this.A03 = i3;
        this.A07 = i4;
        this.A0C = z;
        this.A0B = z2;
        this.A0A = z3;
        this.A0E = z4;
        this.A04 = i5;
        this.A06 = i6;
        this.A02 = i7;
        this.A00 = i8;
        this.A01 = i9;
        this.A0F = true;
        this.A0D = true;
    }

    public final boolean A05() {
        DL dl = this;
        boolean z = false;
        int i = 0;
        char c2 = dl.A0D ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    dl = dl;
                    i = dl.A08;
                    if (i == 7) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i != 2) {
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
}
