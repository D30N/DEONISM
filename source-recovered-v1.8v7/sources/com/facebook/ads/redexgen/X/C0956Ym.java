package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ym, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0956Ym implements CO {
    @Override // com.facebook.ads.redexgen.X.CO
    public final void A5A(Format format) {
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final int ACj(CD cd, int i, boolean z) throws InterruptedException, IOException {
        int iADI = cd.ADI(i);
        char c2 = iADI == -1 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (!z) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return -1;
                case 4:
                    throw new EOFException();
                case 5:
                    return iADI;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final void ACk(C0544Ii c0544Ii, int i) {
        c0544Ii.A0Z(i);
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final void ACl(long j, int i, int i2, int i3, CN cn) {
    }
}
