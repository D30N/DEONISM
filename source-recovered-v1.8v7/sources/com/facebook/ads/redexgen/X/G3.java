package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class G3 extends RC {
    public static byte[] A01;
    public final long A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 24);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-125, -105, -82, 86, -87, -97, -80, -101, 86, -93, -85, -87, -86, 86, -104, -101, 86, -90, -91, -87, -97, -86, -97, -84, -101, 86, -92, -85, -93, -104, -101, -88, 87};
    }

    public G3(long j) {
        if (j > 0) {
            this.A00 = j;
            return;
        }
        throw new IllegalArgumentException(A00(0, 33, 30));
    }

    @Override // com.facebook.ads.redexgen.X.RC
    public final boolean A08(File file, long j, int i) {
        boolean z = false;
        char c2 = j <= this.A00 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.RC, com.facebook.ads.redexgen.X.C0C
    public final /* bridge */ /* synthetic */ void ADc(File file) throws IOException {
        super.ADc(file);
    }
}
