package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0651Mp implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1027aZ A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 74);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{29, 18, 31, 19, 28, 31, 26, -16, 33, 14, -16, 25, 22, 16, 24};
    }

    public ViewOnClickListenerC0651Mp(C1027aZ c1027aZ) {
        this.A00 = c1027aZ;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        ViewOnClickListenerC0651Mp viewOnClickListenerC0651Mp = this;
        ViewOnClickListenerC0651Mp viewOnClickListenerC0651Mp2 = null;
        char c2 = C0601Ko.A02(viewOnClickListenerC0651Mp) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    viewOnClickListenerC0651Mp = viewOnClickListenerC0651Mp;
                    viewOnClickListenerC0651Mp2 = viewOnClickListenerC0651Mp;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        viewOnClickListenerC0651Mp2 = viewOnClickListenerC0651Mp2;
                        viewOnClickListenerC0651Mp2.A00.A04.A3r(A00(0, 15, 99));
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, viewOnClickListenerC0651Mp2);
                        return;
                    }
            }
        }
    }
}
