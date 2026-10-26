package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1155cg extends AbstractRunnableC0608Kw {
    public static byte[] A01;
    public final /* synthetic */ Context A00;

    static {
        A02();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 45);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{-112, -65, -65, -100, -72, -67, -94, -77, -70, -91, -76, -63, -62, -72, -66, -67, -67, -71, -72, -37, -57, -23, -36, -35, -22};
    }

    public C1155cg(Context context) {
        this.A00 = context;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        C1155cg c1155cg = this;
        String strA00 = null;
        SharedPreferences sharedPreferences = null;
        int iA02 = 0;
        int i = 0;
        char c2 = LL.A02 == LK.A02 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c1155cg = c1155cg;
                    Context context = c1155cg.A00;
                    sharedPreferences = context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(16, 9, 74), context), 0);
                    strA00 = A00(0, 16, 34);
                    i = sharedPreferences.getInt(strA00, -1);
                    if (i == -1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    int unused = LL.A00 = i;
                    LL.A02 = LK.A02;
                    return;
                case 5:
                    if (Build.VERSION.SDK_INT < 24) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c1155cg = c1155cg;
                    iA02 = LL.A03(c1155cg.A00);
                    c2 = 7;
                    break;
                case 7:
                    int unused2 = LL.A00 = iA02;
                    sharedPreferences.edit().putInt(strA00, iA02).commit();
                    LL.A02 = LK.A02;
                    return;
                case '\b':
                    c1155cg = c1155cg;
                    iA02 = LL.A02(c1155cg.A00);
                    c2 = 7;
                    break;
            }
        }
    }
}
