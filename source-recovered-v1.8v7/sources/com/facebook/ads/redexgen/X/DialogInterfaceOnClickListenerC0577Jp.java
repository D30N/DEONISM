package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Jp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC0577Jp implements DialogInterface.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ ViewOnClickListenerC1139cP A00;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 111);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{51, 61, 41, 62, 65, 57, 41, 61, 62, 47, 58, 81, 79, 82, 66};
    }

    public DialogInterfaceOnClickListenerC0577Jp(ViewOnClickListenerC1139cP viewOnClickListenerC1139cP) {
        this.A00 = viewOnClickListenerC1139cP;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Map mapA01 = this.A00.A01();
        mapA01.put(A00(0, 11, 91), A00(11, 4, 110));
        this.A00.A05(mapA01);
    }
}
