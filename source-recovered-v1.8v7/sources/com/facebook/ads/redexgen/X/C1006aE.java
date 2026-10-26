package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.aE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1006aE implements FV {
    public boolean A00;
    public final FV A01;
    public final /* synthetic */ C8 A02;

    public C1006aE(C8 c8, FV fv) {
        this.A02 = c8;
        this.A01 = fv;
    }

    public final void A00() {
        this.A00 = false;
    }

    @Override // com.facebook.ads.redexgen.X.FV
    public final boolean A7k() {
        C1006aE c1006aE = this;
        boolean z = false;
        char c2 = !c1006aE.A02.A03() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c1006aE = c1006aE;
                    if (!c1006aE.A01.A7k()) {
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

    @Override // com.facebook.ads.redexgen.X.FV
    public final void A8V() throws IOException {
        this.A01.A8V();
    }

    @Override // com.facebook.ads.redexgen.X.FV
    public final int AC6(A9 a9, YT yt, boolean z) {
        YT yt2 = yt;
        A9 a92 = a9;
        C1006aE c1006aE = this;
        int iAC6 = 0;
        int i = 0;
        long j = 0;
        Format format = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        char c2 = c1006aE.A02.A03() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return -3;
                case 3:
                    c1006aE = c1006aE;
                    i5 = 4;
                    i3 = -4;
                    if (!c1006aE.A00) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    yt2.A02(i5);
                    return i3;
                case 5:
                    c1006aE = c1006aE;
                    a92 = a92;
                    yt2 = yt2;
                    iAC6 = c1006aE.A01.AC6(a92, yt2, z);
                    i = -5;
                    j = Long.MIN_VALUE;
                    if (iAC6 != -5) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    a92 = a92;
                    format = a92.A00;
                    if (format.A06 != 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    format = format;
                    if (format.A07 == 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c1006aE = c1006aE;
                    i2 = 0;
                    if (c1006aE.A02.A01 == 0) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    i4 = 0;
                    c2 = '\n';
                    break;
                case '\n':
                    c1006aE = c1006aE;
                    if (c1006aE.A02.A00 == j) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    a92 = a92;
                    format = format;
                    a92.A00 = format.A0K(i4, i2);
                    c2 = '\f';
                    break;
                case '\f':
                    return i;
                case '\r':
                    format = format;
                    i2 = format.A07;
                    c2 = 11;
                    break;
                case 14:
                    format = format;
                    i4 = format.A06;
                    c2 = '\n';
                    break;
                case 15:
                    c1006aE = c1006aE;
                    if (c1006aE.A02.A00 == j) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    if (iAC6 != i3) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c1006aE = c1006aE;
                    yt2 = yt2;
                    if (yt2.A00 >= c1006aE.A02.A00) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    if (iAC6 != -3) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    c1006aE = c1006aE;
                    if (c1006aE.A02.A5Y() != j) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    YT yt3 = yt2;
                    yt3.A07();
                    yt3.A02(i5);
                    c1006aE.A00 = true;
                    return i3;
                case 21:
                    return iAC6;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.FV
    public final int ADK(long j) {
        if (this.A02.A03()) {
            return -3;
        }
        return this.A01.ADK(j);
    }
}
