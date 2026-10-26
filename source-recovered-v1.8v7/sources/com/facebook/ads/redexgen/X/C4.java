package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.support.annotation.Nullable;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class C4 extends AbstractC1005aD implements F5 {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final CF A05;
    public final InterfaceC0515Hd A06;

    @Nullable
    public final Object A07;
    public final String A08;

    public C4(Uri uri, InterfaceC0515Hd interfaceC0515Hd, CF cf, int i, @Nullable String str, int i2, @Nullable Object obj) {
        this.A04 = uri;
        this.A06 = interfaceC0515Hd;
        this.A05 = cf;
        this.A03 = i;
        this.A08 = str;
        this.A02 = i2;
        this.A00 = -9223372036854775807L;
        this.A07 = obj;
    }

    private void A00(long j, boolean z) {
        this.A00 = j;
        this.A01 = z;
        A01(new C1023aV(this.A00, this.A01, false, this.A07), null);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1005aD
    public final void A02() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1005aD
    public final void A03(YA ya, boolean z) {
        A00(this.A00, false);
    }

    @Override // com.facebook.ads.redexgen.X.FA
    public final InterfaceC1019aR A4P(F8 f8, HW hw) {
        IJ.A03(f8.A02 == 0);
        return new C5(this.A04, this.A06.A4D(), this.A05.A4H(), this.A03, A00(f8), this, hw, this.A08, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.FA
    public final void A8X() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.X.F5
    public final void AB1(long j, boolean z) {
        C4 c4 = this;
        long j2 = 0;
        long j3 = 0;
        char c2 = j == -9223372036854775807L ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c4 = c4;
                    j3 = c4.A00;
                    c2 = 3;
                    break;
                case 3:
                    c4 = c4;
                    j2 = j3;
                    if (c4.A00 != j2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c4 = c4;
                    if (c4.A01 != z) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return;
                case 6:
                    j3 = j;
                    c2 = 3;
                    break;
                case 7:
                    c4.A00(j2, z);
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.FA
    public final void ACO(InterfaceC1019aR interfaceC1019aR) {
        ((C5) interfaceC1019aR).A0R();
    }
}
