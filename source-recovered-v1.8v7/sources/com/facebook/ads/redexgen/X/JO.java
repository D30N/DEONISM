package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Messenger;
import d.b.a.b.k;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class JO {
    public static byte[] A06;
    public Messenger A00;
    public boolean A01 = false;
    public final ServiceConnection A02 = new JN(this);
    public final XI A03;
    public final String A04;
    public final String A05;

    static {
        A06();
    }

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 53);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A06 = new byte[]{19, 2, 17, 2, 14, 28, 17, 6, 18, 22, 6, 16, 23, 28, 10, 7, 16, 1, 18, 1, 13, 31, 1, 14, 31, 21, 21, 9, 4, 25, 27, 16, 27, 12, 23, 29, 108, 125, 110, 125, 113, 99, 108, 110, 115, 104, 115, Byte.MAX_VALUE, 115, 112, 99, 106, 121, 110, 111, 117, 115, 114, 80, 92, 94, 29, 85, 82, 80, 86, 81, 92, 92, 88, 29, 82, 70, 87, 90, 86, 93, 80, 86, 93, 86, 71, 68, 92, 65, 88, 29, 114, 70, 87, 90, 86, 93, 80, 86, 125, 86, 71, 68, 92, 65, 88, 96, 86, 65, 69, 90, 80, 86, 0, 12, 14, 77, 5, 2, 0, 6, 1, 12, 12, 8, 77, 8, 2, 23, 2, 13, 2};
    }

    public JO(XI xi, String str, String str2) {
        this.A03 = xi;
        this.A05 = str;
        this.A04 = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putInt(A05(36, 22, 9), 1);
        bundle.putString(A05(16, 13, k.AppCompatTheme_windowActionModeOverlay), this.A04);
        bundle.putString(A05(0, 16, k.AppCompatTheme_windowFixedHeightMajor), this.A05);
        return bundle;
    }

    public final void A08() {
        Intent intent = new Intent();
        intent.setClassName(A05(109, 19, 86), A05(58, 51, 6));
        try {
            if (!this.A03.bindService(intent, this.A02, 1)) {
                this.A03.unbindService(this.A02);
            }
        } catch (Exception e) {
            this.A03.A04().A83(A05(29, 7, 75), C03008a.A15, new C03018b(e));
        }
    }
}
