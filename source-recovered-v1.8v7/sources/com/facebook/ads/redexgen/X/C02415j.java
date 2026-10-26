package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02415j {

    @Nullable
    public static InterfaceC02425k A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 1);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{17, 22, 29, 16, 27, 30, 18, 1, 24};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (C02415j.class) {
            if (A00 == null) {
                return;
            }
            C03018b c03018b = new C03018b(A00.ACZ());
            c03018b.A03(1);
            XJ sdkContext = C8B.A00();
            if (sdkContext != null) {
                sdkContext.A04().A83(A00(0, 9, k.AppCompatTheme_viewInflaterClass), 3401, c03018b);
            }
            A00.reset();
        }
    }

    public static void A03(final long j) {
        if (j > 0) {
            A00 = new C0838Ty();
            new Thread(j) { // from class: com.facebook.ads.redexgen.X.5l
                public final long A00;

                {
                    this.A00 = j;
                    start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() throws Throwable {
                    if (C0601Ko.A02(this)) {
                        return;
                    }
                    while (true) {
                        try {
                            try {
                                Thread.sleep(this.A00);
                            } catch (Throwable th) {
                                C0601Ko.A00(th, this);
                                return;
                            }
                        } catch (InterruptedException unused) {
                        }
                        C02415j.A01();
                    }
                }
            };
        }
    }
}
