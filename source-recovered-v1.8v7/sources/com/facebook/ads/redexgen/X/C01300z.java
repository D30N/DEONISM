package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.ads.AdError;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01300z extends BroadcastReceiver {
    public static byte[] A04;
    public C0768Rd A00;
    public InterfaceC01290y A01;
    public XI A02;
    public String A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 96);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A04 = new byte[]{-43, -31, -33, -96, -40, -45, -43, -41, -44, -31, -31, -35, -96, -45, -42, -27, -96, -37, -32, -26, -41, -28, -27, -26, -37, -26, -37, -45, -34, -96, -28, -41, -23, -45, -28, -42, -47, -27, -41, -28, -24, -41, -28, -47, -40, -45, -37, -34, -25, -28, -41, -84, 66, 78, 76, 13, 69, 64, 66, 68, 65, 78, 78, 74, 13, 64, 67, 82, 13, 72, 77, 83, 68, 81, 82, 83, 72, 83, 72, 64, 75, 13, 64, 66, 83, 72, 85, 72, 83, 88, 62, 67, 68, 82, 83, 81, 78, 88, 68, 67, 20, 32, 30, -33, 23, 18, 20, 22, 19, 32, 32, 28, -33, 18, 21, 36, -33, 26, 31, 37, 22, 35, 36, 37, 26, 37, 26, 18, 29, -33, 35, 22, 40, 18, 35, 21, -21, -2, 10, 8, -55, 1, -4, -2, 0, -3, 10, 10, 6, -55, -4, -1, 14, -55, 4, 9, 15, 0, 13, 14, 15, 4, 15, 4, -4, 7, -55, -4, -2, 15, 4, 17, 4, 15, 20, -6, -1, 0, 14, 15, 13, 10, 20, 0, -1, -43, 58, 70, 68, 5, 61, 56, 58, 60, 57, 70, 70, 66, 5, 56, 59, 74, 5, 64, 69, 75, 60, 73, 74, 75, 64, 75, 64, 56, 67, 5, 64, 68, 71, 73, 60, 74, 74, 64, 70, 69, 5, 67, 70, 62, 62, 60, 59, 27, 39, 37, -26, 30, 25, 27, 29, 26, 39, 39, 35, -26, 25, 28, 43, -26, 33, 38, 44, 29, 42, 43, 44, 33, 44, 33, 25, 36, -26, 28, 33, 43, 40, 36, 25, 49, 29, 28, 43, 55, 53, -10, 46, 41, 43, 45, 42, 55, 55, 51, -10, 41, 44, 59, -10, 49, 54, 60, 45, 58, 59, 60, 49, 60, 49, 41, 52, -10, 58, 45, 63, 41, 58, 44, 39, 59, 45, 58, 62, 45, 58, 39, 59, 61, 43, 43, 45, 59, 59, 2, 8, 20, 18, -45, 11, 6, 8, 10, 7, 20, 20, 16, -45, 6, 9, 24, -45, 14, 19, 25, 10, 23, 24, 25, 14, 25, 14, 6, 17, -45, 11, 14, 19, 14, 24, 13, 4, 6, 8, 25, 14, 27, 14, 25, 30, -33, 12, 24, 22, -41, 15, 10, 12, 14, 11, 24, 24, 20, -41, 10, 13, 28, -41, 18, 23, 29, 14, 27, 28, 29, 18, 29, 18, 10, 21, -41, 14, 27, 27, 24, 27, -41, -29, -31, -94, -38, -43, -41, -39, -42, -29, -29, -33, -94, -43, -40, -25, -94, -35, -30, -24, -39, -26, -25, -24, -35, -24, -35, -43, -32, -94, -26, -39, -21, -43, -26, -40, -45, -25, -39, -26, -22, -39, -26, -45, -38, -43, -35, -32, -23, -26, -39, 59, 71, 69, 6, 62, 57, 59, 61, 58, 71, 71, 67, 6, 57, 60, 75, 6, 65, 70, 76, 61, 74, 75, 76, 65, 76, 65, 57, 68, 6, 59, 68, 65, 59, 67, 61, 60, 18, 44, 56, 54, -9, 47, 42, 44, 46, 43, 56, 56, 52, -9, 42, 45, 60, -9, 50, 55, 61, 46, 59, 60, 61, 50, 61, 50, 42, 53, -9, 45, 50, 60, 57, 53, 42, 66, 46, 45, 3, -42, -30, -32, -95, -39, -44, -42, -40, -43, -30, -30, -34, -95, -44, -41, -26, -95, -36, -31, -25, -40, -27, -26, -25, -36, -25, -36, -44, -33, -95, -27, -40, -22, -44, -27, -41, -97, -18, -6, -8, -71, -15, -20, -18, -16, -19, -6, -6, -10, -71, -20, -17, -2, -71, -12, -7, -1, -16, -3, -2, -1, -12, -1, -12, -20, -9, -71, -12, -8, -5, -3, -16, -2, -2, -12, -6, -7, -71, -9, -6, -14, -14, -16, -17, -59, -47, -35, -37, -100, -44, -49, -47, -45, -48, -35, -35, -39, -100, -49, -46, -31, -100, -41, -36, -30, -45, -32, -31, -30, -41, -30, -41, -49, -38, -100, -32, -45, -27, -49, -32, -46, -51, -31, -45, -32, -28, -45, -32, -51, -31, -29, -47, -47, -45, -31, -31, -49, -37, -39, -102, -46, -51, -49, -47, -50, -37, -37, -41, -102, -51, -48, -33, -102, -43, -38, -32, -47, -34, -33, -32, -43, -32, -43, -51, -40, -102, -48, -43, -33, -39, -43, -33, -33, -47, -48, 5, 17, 15, -48, 8, 3, 5, 7, 4, 17, 17, 13, -48, 3, 6, 21, -48, 11, 16, 22, 7, 20, 21, 22, 11, 22, 11, 3, 14, -48, 7, 20, 20, 17, 20, -36, -59, -47, -49, -112, -56, -61, -59, -57, -60, -47, -47, -51, -112, -61, -58, -43, -112, -53, -48, -42, -57, -44, -43, -42, -53, -42, -53, -61, -50, -112, -58, -53, -43, -49, -53, -43, -43, -57, -58, -100, 10, 22, 20, -43, 13, 8, 10, 12, 9, 22, 22, 18, -43, 8, 11, 26, -43, 16, 21, 27, 12, 25, 26, 27, 16, 27, 16, 8, 19, -43, 10, 19, 16, 10, 18, 12, 11};
    }

    public C01300z(XI xi, String str, C0768Rd c0768Rd, InterfaceC01290y interfaceC01290y) {
        this.A02 = xi;
        this.A03 = str;
        this.A01 = interfaceC01290y;
        this.A00 = c0768Rd;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(571, 48, 43) + this.A03);
        intentFilter.addAction(A00(494, 40, 105) + this.A03);
        intentFilter.addAction(A00(745, 40, 2) + this.A03);
        intentFilter.addAction(A00(456, 38, k.AppCompatTheme_windowFixedWidthMajor) + this.A03);
        intentFilter.addAction(A00(709, 36, 66) + this.A03);
        intentFilter.addAction(A00(137, 49, 59) + this.A03);
        intentFilter.addAction(A00(100, 37, 81) + this.A03);
        intentFilter.addAction(A00(272, 52, 104) + this.A03);
        intentFilter.addAction(A00(0, 52, 18) + this.A03);
        intentFilter.addAction(A00(324, 46, 69) + this.A03);
        C2G.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        try {
            C2G.A00(this.A02).A05(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C01300z c01300z = this;
        String str = intent.getAction().split(A00(570, 1, 5))[0];
        char c2 = c01300z.A01 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (str != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    str = str;
                    if (!A00(785, 37, 71).equals(str)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c01300z = c01300z;
                    c01300z.A01.A9r(c01300z.A00, null, true);
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    str = str;
                    if (!A00(670, 39, 12).equals(str)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c01300z = c01300z;
                    c01300z.A01.A9s(c01300z.A00);
                    c2 = 6;
                    break;
                case '\t':
                    str = str;
                    if (!A00(233, 39, 88).equals(str)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c01300z = c01300z;
                    c01300z.A01.A9t(c01300z.A00);
                    c2 = 6;
                    break;
                case 11:
                    str = str;
                    if (!A00(186, 47, k.AppCompatTheme_windowFixedHeightMinor).equals(str)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c01300z = c01300z;
                    c01300z.A01.A9w(c01300z.A00);
                    c2 = 6;
                    break;
                case '\r':
                    str = str;
                    if (!A00(370, 35, 73).equals(str)) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    context = context;
                    if (!JQ.A12(context)) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c01300z = c01300z;
                    c01300z.A01.A9v(c01300z.A00, AdError.AD_PRESENTATION_ERROR);
                    c2 = 6;
                    break;
                case 16:
                    c01300z = c01300z;
                    c01300z.A01.A9v(c01300z.A00, AdError.INTERNAL_ERROR);
                    c2 = 6;
                    break;
                case 17:
                    str = str;
                    if (!A00(52, 48, 127).equals(str)) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c01300z = c01300z;
                    c01300z.A01.onInterstitialActivityDestroyed();
                    c2 = 6;
                    break;
                case 19:
                    str = str;
                    if (!A00(534, 36, 19).equals(str)) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c01300z = c01300z;
                    c01300z.A01.A9x();
                    c2 = 6;
                    break;
                case 21:
                    str = str;
                    if (!A00(619, 51, 14).equals(str)) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    c01300z = c01300z;
                    c01300z.A01.A9z();
                    c2 = 6;
                    break;
                case 23:
                    str = str;
                    if (!A00(405, 51, 20).equals(str)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    c01300z = c01300z;
                    c01300z.A01.A9y();
                    c2 = 6;
                    break;
            }
        }
    }
}
