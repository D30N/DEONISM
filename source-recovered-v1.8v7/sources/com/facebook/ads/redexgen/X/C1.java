package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class C1 extends AbstractC1030ac {
    public final C1032ae A00;
    public volatile int A01;
    public volatile boolean A02;

    public C1(InterfaceC0516He interfaceC0516He, C0520Hi c0520Hi, Format format, int i, @Nullable Object obj, C1032ae c1032ae) {
        super(interfaceC0516He, c0520Hi, 2, format, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.A00 = c1032ae;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0527Hr
    public final void A3x() {
        this.A02 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0527Hr
    public final void A7r() throws InterruptedException, IOException {
        C0520Hi c0520HiA03 = this.A05.A03(this.A01);
        try {
            C0954Yk c0954Yk = new C0954Yk(this.A07, c0520HiA03.A01, this.A07.ABU(c0520HiA03));
            if (this.A01 == 0) {
                this.A00.A01(null, -9223372036854775807L);
            }
            try {
                CC cc = this.A00.A04;
                int iAC3 = 0;
                while (iAC3 == 0 && !this.A02) {
                    iAC3 = cc.AC3(c0954Yk, null);
                }
                boolean z = true;
                if (iAC3 == 1) {
                    z = false;
                }
                IJ.A04(z);
            } finally {
                this.A01 = (int) (c0954Yk.A6n() - this.A05.A01);
            }
        } finally {
            C0560Iy.A0Z(this.A07);
        }
    }
}
