package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.aM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1014aM implements InterfaceC0527Hr {
    public long A00;
    public long A02;
    public C0520Hi A03;
    public final Uri A05;
    public final F4 A07;
    public final InterfaceC0516He A08;
    public final IP A09;
    public volatile boolean A0A;
    public final /* synthetic */ C5 A0B;
    public final CJ A06 = new CJ();
    public boolean A04 = true;
    public long A01 = -1;

    public C1014aM(C5 c5, Uri uri, InterfaceC0516He interfaceC0516He, F4 f4, IP ip) {
        this.A0B = c5;
        this.A05 = (Uri) IJ.A01(uri);
        this.A08 = (InterfaceC0516He) IJ.A01(interfaceC0516He);
        this.A07 = (F4) IJ.A01(f4);
        this.A09 = ip;
    }

    public final void A04(long j, long j2) {
        this.A06.A00 = j;
        this.A02 = j2;
        this.A04 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0527Hr
    public final void A3x() {
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0527Hr
    public final void A7r() throws InterruptedException, IOException {
        int iAC3 = 0;
        while (iAC3 == 0 && !this.A0A) {
            CD cd = null;
            try {
                long jA6n = this.A06.A00;
                this.A03 = new C0520Hi(this.A05, jA6n, -1L, this.A0B.A0b);
                this.A01 = this.A08.ABU(this.A03);
                if (this.A01 != -1) {
                    this.A01 += jA6n;
                }
                C0954Yk c0954Yk = new C0954Yk(this.A08, jA6n, this.A01);
                CC ccA02 = this.A07.A02(c0954Yk, this.A08.A7F());
                if (this.A04) {
                    ccA02.ACp(jA6n, this.A02);
                    this.A04 = false;
                }
                while (iAC3 == 0 && !this.A0A) {
                    this.A09.A00();
                    iAC3 = ccA02.AC3(c0954Yk, this.A06);
                    if (c0954Yk.A6n() > this.A0B.A0P + jA6n) {
                        jA6n = c0954Yk.A6n();
                        this.A09.A01();
                        this.A0B.A0R.post(this.A0B.A0a);
                    }
                }
                if (iAC3 == 1) {
                    iAC3 = 0;
                } else {
                    this.A06.A00 = c0954Yk.A6n();
                    this.A00 = this.A06.A00 - this.A03.A01;
                }
                C0560Iy.A0Z(this.A08);
            } catch (Throwable th) {
                if (iAC3 != 1 && 0 != 0) {
                    this.A06.A00 = cd.A6n();
                    this.A00 = this.A06.A00 - this.A03.A01;
                }
                C0560Iy.A0Z(this.A08);
                throw th;
            }
        }
    }
}
