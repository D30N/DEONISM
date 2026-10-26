package com.facebook.ads.redexgen.X;

import android.util.Log;
import d.b.a.b.k;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class A1 implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ EL A00;
    public final /* synthetic */ AS A01;

    static {
        A01();
    }

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 110);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{-39, -14, -23, -4, -12, -23, -25, -8, -23, -24, -92, -23, -10, -10, -13, -10, -92, -24, -23, -16, -19, -6, -23, -10, -19, -14, -21, -92, -15, -23, -9, -9, -27, -21, -23, -92, -13, -14, -92, -23, -4, -8, -23, -10, -14, -27, -16, -92, -8, -20, -10, -23, -27, -24, -78, 38, 89, 80, 49, 77, 66, 90, 70, 83, 42, 78, 81, 77, 42, 79, 85, 70, 83, 79, 66, 77};
    }

    public A1(EL el, AS as) {
        this.A00 = el;
        this.A01 = as;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0601Ko.A02(this)) {
            return;
        }
        try {
            try {
                this.A00.A0X(this.A01);
            } catch (C03479w e) {
                Log.e(A00(55, 21, k.AppCompatTheme_windowActionBar), A00(0, 55, 22), e);
                throw new RuntimeException(e);
            }
        } catch (Throwable e2) {
            C0601Ko.A00(e2, this);
        }
    }
}
