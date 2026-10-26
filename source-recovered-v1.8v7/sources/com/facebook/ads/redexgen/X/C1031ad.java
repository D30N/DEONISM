package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.ad, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1031ad implements CO {
    public Format A00;
    public CO A01;
    public final int A02;
    public final int A03;
    public final Format A04;

    public C1031ad(int i, int i2, Format format) {
        this.A02 = i;
        this.A03 = i2;
        this.A04 = format;
    }

    public final void A00(InterfaceC0483Fx interfaceC0483Fx) {
        C1031ad c1031ad = this;
        Format format = null;
        char c2 = interfaceC0483Fx == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c1031ad.A01 = new C0956Ym();
                    return;
                case 3:
                    c1031ad = c1031ad;
                    interfaceC0483Fx = interfaceC0483Fx;
                    c1031ad.A01 = interfaceC0483Fx.track(c1031ad.A02, c1031ad.A03);
                    format = c1031ad.A00;
                    if (format == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1031ad = c1031ad;
                    format = format;
                    c1031ad.A01.A5A(format);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final void A5A(Format format) {
        Format formatA0M = null;
        Format format2 = this.A04;
        char c2 = format2 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    format = format;
                    format2 = format2;
                    formatA0M = format.A0M(format2);
                    c2 = 3;
                    break;
                case 3:
                    C1031ad c1031ad = this;
                    c1031ad.A00 = formatA0M;
                    c1031ad.A01.A5A(c1031ad.A00);
                    return;
                case 4:
                    format = format;
                    formatA0M = format;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final int ACj(CD cd, int i, boolean z) throws InterruptedException, IOException {
        return this.A01.ACj(cd, i, z);
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final void ACk(C0544Ii c0544Ii, int i) {
        this.A01.ACk(c0544Ii, i);
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final void ACl(long j, int i, int i2, int i3, CN cn) {
        this.A01.ACl(j, i, i2, i3, cn);
    }
}
