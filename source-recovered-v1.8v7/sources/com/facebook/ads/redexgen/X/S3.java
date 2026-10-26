package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public abstract class S3 implements AnonymousClass74 {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z);

    public S3(boolean z) {
        this.A00 = z;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void A98() {
        S3 s3 = this;
        char c2 = s3.A00 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    s3 = s3;
                    s3.A00();
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    s3 = s3;
                    s3.A01(false);
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void A9F() {
        A01(true);
    }
}
