package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public abstract class EN implements YC, AU {
    public int A00;
    public int A01;
    public long A02;
    public AV A03;
    public FV A04;
    public boolean A05 = true;
    public boolean A06;
    public Format[] A07;
    public final int A08;

    public EN(int i) {
        this.A08 = i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bw != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<?> */
    public static boolean A0x(@Nullable InterfaceC0397Bw<?> interfaceC0397Bw, @Nullable DrmInitData drmInitData) {
        char c2 = drmInitData == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return true;
                case 3:
                    interfaceC0397Bw = interfaceC0397Bw;
                    if (interfaceC0397Bw != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    return interfaceC0397Bw.A3w(drmInitData);
            }
        }
    }

    public final int A0y() {
        return this.A00;
    }

    public final int A0z(long j) {
        return this.A04.ADK(j - this.A02);
    }

    public final int A10(A9 a9, YT yt, boolean z) {
        EN en = this;
        Format format = null;
        int iAC6 = en.A04.AC6(a9, yt, z);
        int i = -4;
        char c2 = iAC6 == -4 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    yt = yt;
                    if (!yt.A04()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    en = en;
                    en.A05 = true;
                    if (!en.A06) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return i;
                case 5:
                    i = -3;
                    c2 = 4;
                    break;
                case 6:
                    en = en;
                    yt = yt;
                    yt.A00 += en.A02;
                    c2 = '\n';
                    break;
                case 7:
                    if (iAC6 != -5) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    a9 = a9;
                    format = a9.A00;
                    if (format.A0G == Long.MAX_VALUE) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    en = en;
                    a9 = a9;
                    format = format;
                    a9.A00 = format.A0L(format.A0G + en.A02);
                    c2 = '\n';
                    break;
                case '\n':
                    return iAC6;
            }
        }
    }

    public final AV A11() {
        return this.A03;
    }

    public void A12() {
    }

    public void A13() throws C03479w {
    }

    public void A14() throws C03479w {
    }

    public void A15(long j, boolean z) throws C03479w {
    }

    public void A16(boolean z) throws C03479w {
    }

    public void A17(Format[] formatArr, long j) throws C03479w {
    }

    public final boolean A18() {
        EN en = this;
        boolean zA7k = false;
        char c2 = en.A05 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    en = en;
                    zA7k = en.A06;
                    c2 = 3;
                    break;
                case 3:
                    return zA7k;
                case 4:
                    en = en;
                    zA7k = en.A04.A7k();
                    c2 = 3;
                    break;
            }
        }
    }

    public final Format[] A19() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public final void A4k() {
        IJ.A04(this.A01 == 1);
        this.A01 = 0;
        this.A04 = null;
        this.A07 = null;
        this.A06 = false;
        A12();
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public final void A4t(AV av, Format[] formatArr, FV fv, long j, boolean z, long j2) throws C03479w {
        boolean z2 = false;
        char c2 = this.A01 == 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z2 = true;
                    c2 = 3;
                    break;
                case 3:
                    EN en = this;
                    IJ.A04(z2);
                    en.A03 = av;
                    en.A01 = 1;
                    en.A16(z);
                    en.ACY(formatArr, fv, j2);
                    en.A15(j, z);
                    return;
                case 4:
                    z2 = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public final AU A5d() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public IZ A6W() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public final int A73() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public final FV A78() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.YC, com.facebook.ads.redexgen.X.AU
    public final int A7D() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.AR
    public void A7K(int i, Object obj) throws C03479w {
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public final boolean A7N() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public final boolean A7Z() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public final void A8Y() throws IOException {
        this.A04.A8V();
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public final void ACY(Format[] formatArr, FV fv, long j) throws C03479w {
        IJ.A04(!this.A06);
        this.A04 = fv;
        this.A05 = false;
        this.A07 = formatArr;
        this.A02 = j;
        A17(formatArr, j);
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public final void ACh(long j) throws C03479w {
        this.A06 = false;
        this.A05 = false;
        A15(j, false);
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public final void AD1() {
        this.A06 = true;
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public final void AD3(int i) {
        this.A00 = i;
    }

    public int ADZ() throws C03479w {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public final void start() throws C03479w {
        IJ.A04(this.A01 == 1);
        this.A01 = 2;
        A13();
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public final void stop() throws C03479w {
        boolean z = false;
        char c2 = this.A01 == 2 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    EN en = this;
                    IJ.A04(z);
                    en.A01 = 1;
                    en.A14();
                    return;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }
}
