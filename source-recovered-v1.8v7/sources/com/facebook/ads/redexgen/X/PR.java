package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class PR implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C7N A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 65);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-8, 22, 8, 21, -61, 6, 15, 12, 6, 14, 8, 7, -61, 22, 14, 12, 19, -61, 5, 8, 9, 18, 21, 8, -61, 23, 11, 8, -61, 4, 7, 22, -61, 12, 22, -61, 4, 15, 15, 18, 26, 8, 7, -61, 23, 18, -61, 22, 14, 12, 19, -47, -107, -83, -85, -78, -110, -82, -73, -87, -85, -80};
    }

    public PR(C7N c7n) {
        this.A00 = c7n;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        PR pr = this;
        PR pr2 = null;
        char c2 = C0601Ko.A02(pr) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    pr = pr;
                    pr2 = pr;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        pr2 = pr2;
                        if (!pr2.A00.A05.get()) {
                            c2 = '\b';
                            break;
                        } else {
                            c2 = 11;
                            break;
                        }
                    } catch (Throwable th) {
                        C0601Ko.A00(th, pr2);
                        return;
                    }
                case '\b':
                    Log.i(A00(52, 10, 1), A00(0, 52, 98));
                    return;
                case 11:
                    PR pr3 = pr2;
                    View v = pr3.A00.getVideoView();
                    if (v != null) {
                        pr3.A00.getVideoView().A0W(P8.A08);
                        return;
                    }
                    return;
            }
        }
    }
}
