package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.by, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1113by implements IZ {
    public long A00;
    public long A01;
    public AH A02 = AH.A04;
    public boolean A03;
    public final IM A04;

    public C1113by(IM im) {
        this.A04 = im;
    }

    public final void A00() {
        if (!this.A03) {
            this.A00 = this.A04.A4r();
            this.A03 = true;
        }
    }

    public final void A01() {
        if (this.A03) {
            A02(A6p());
            this.A03 = false;
        }
    }

    public final void A02(long j) {
        this.A01 = j;
        if (this.A03) {
            this.A00 = this.A04.A4r();
        }
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final AH A6m() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final long A6p() {
        C1113by c1113by = this;
        long elapsedSinceBaseMs = 0;
        long jA00 = c1113by.A01;
        char c2 = c1113by.A03 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1113by = c1113by;
                    elapsedSinceBaseMs = c1113by.A04.A4r() - c1113by.A00;
                    if (c1113by.A02.A01 != 1.0f) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    jA00 += C03419q.A00(elapsedSinceBaseMs);
                    c2 = 4;
                    break;
                case 4:
                    return jA00;
                case 5:
                    c1113by = c1113by;
                    jA00 += c1113by.A02.A00(elapsedSinceBaseMs);
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final AH AD9(AH ah) {
        if (this.A03) {
            A02(A6p());
        }
        this.A02 = ah;
        return ah;
    }
}
