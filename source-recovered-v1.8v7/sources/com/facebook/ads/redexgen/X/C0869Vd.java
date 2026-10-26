package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Vd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0869Vd implements InterfaceC02616d {
    public final /* synthetic */ C0874Vi A00;

    public C0869Vd(C0874Vi c0874Vi) {
        this.A00 = c0874Vi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02616d
    public final AbstractC02766s A50() {
        return this.A00.A0C(new HashMap<String, Integer>() { // from class: com.facebook.ads.redexgen.X.6W
            public static byte[] A01;

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
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 62);
                            i4++;
                            c2 = 2;
                            break;
                        case 4:
                            return new String(bArrCopyOfRange);
                    }
                }
            }

            public static void A01() {
                A01 = new byte[]{89, 126};
            }

            {
                put(A00(1, 1, 55), Integer.valueOf(this.A00.A00.A01.widthPixels));
                put(A00(0, 1, 15), Integer.valueOf(this.A00.A00.A01.heightPixels));
            }
        });
    }
}
