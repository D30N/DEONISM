package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.protocol.AdErrorType;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public final class SJ implements InterfaceC01471q {
    public static byte[] A04;
    public EnumC01461p A00 = EnumC01461p.A02;
    public EnumC01461p A01 = EnumC01461p.A02;
    public final SM A02;
    public final XI A03;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 72);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A04 = new byte[]{27, 24, 22, 19, 95, 94, 8, 19, 20, 12, 83, 82, 89, 109, 112, 114, 63, 71, 67, 64, 116, 101, 104, 100, 111, 98, 100, 79, 100, 117, 118, 110, 115, 106, 66, 83, 74, 48, 62, 71, 113, 107, 62, 125, Byte.MAX_VALUE, 112, 62, 125, 118, Byte.MAX_VALUE, 112, 121, 123, 62, 87, 112, 106, 123, 121, 108, Byte.MAX_VALUE, 106, 119, 113, 112, 62, 91, 108, 108, 113, 108, 62, 115, 113, 122, 123, 62, 124, 103, 62, 109, 123, 106, 106, 119, 112, 121, 62, 95, 122, 77, 123, 106, 106, 119, 112, 121, 109, 48, 109, 123, 106, 87, 112, 106, 123, 121, 108, Byte.MAX_VALUE, 106, 119, 113, 112, 91, 108, 108, 113, 108, 83, 113, 122, 123, 54, 55, 92, 64, 73, 92, 8, 65, 91, 8, 70, 71, 92, 8, 100, 103, 105, 108, 109, 108, 23, 11, 2, 23, 67, 10, 16, 67, 2, 15, 17, 6, 2, 7, 26, 67, 48, 43, 44, 52, 42, 45, 36, 39, 115, 104, 39, 24, 4, 13, 24, 76, 5, 31, 76, 13, 0, 30, 9, 13, 8, 21, 76, 32, 35, 45, 40, 37, 34, 43, 64, 76, 32, 35, 45, 40, 41, 40, 76, 3, 30, 76, 63, 36, 35, 59, 37, 34, 43, 95, 122, 103, 102, 111, 40, 97, 102, 124, 109, 122, 102, 105, 100, 40, 124, 122, 105, 102, 123, 97, 124, 97, 103, 102, 38};
    }

    public SJ(XI xi, SM sm) {
        this.A03 = xi;
        this.A02 = sm;
    }

    private void A02(EnumC01461p enumC01461p, EnumC01461p enumC01461p2) {
        String strA00 = A00(211, 26, 64);
        String str = A00(12, 5, 87) + enumC01461p + A00(165, 4, 79) + enumC01461p2;
        this.A03.A04().A83(A00(34, 3, 107), C03008a.A0T, new C03018b(strA00, str));
        this.A03.A0A().AE4(strA00 + ' ' + str);
    }

    private void A03(String str, String str2, boolean z) {
        SJ sj = this;
        int i = 0;
        AdSettings.IntegrationErrorMode integrationErrorModeA00 = C01431m.A00(sj.A03);
        String str3 = String.format(Locale.US, AdErrorType.INCORRECT_API_CALL_ERROR.getDefaultErrorMessage(), str, str2);
        String strA00 = A00(34, 3, 107);
        String strA002 = A00(17, 17, 73);
        char c2 = !z ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    SJ sj2 = sj;
                    String str4 = str3;
                    Log.e(strA002, str4);
                    sj2.A03.A04().A83(strA00, C03008a.A0R, new C03018b(str4));
                    sj2.A03.A0A().AE3(str4);
                    return;
                case 3:
                    integrationErrorModeA00 = integrationErrorModeA00;
                    i = C01451o.A00[integrationErrorModeA00.ordinal()];
                    if (i == 1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    Log.e(strA002, str3);
                    return;
                case 6:
                    sj = sj;
                    str3 = str3;
                    strA00 = strA00;
                    strA002 = strA002;
                    sj.A02.A05();
                    sj.A02.A06(10, AdErrorType.INCORRECT_STATE_ERROR, str3);
                    sj.A03.A0A().AE3(str3);
                    Log.e(strA002, str3);
                    sj.A03.A04().A83(strA00, C03008a.A0R, new C03018b(str3));
                    c2 = 5;
                    break;
                case 7:
                    throw new C01481r(str3 + A00(37, 87, 86));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01471q
    public final boolean A51() {
        SJ sj = this;
        boolean z = false;
        boolean z2 = true;
        char c2 = sj.A00 != EnumC01461p.A02 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    sj = sj;
                    if (sj.A00 != EnumC01461p.A04) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    sj = sj;
                    if (sj.A01 == EnumC01461p.A07) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    if (!z) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    sj = sj;
                    sj.A00 = EnumC01461p.A06;
                    c2 = 7;
                    break;
                case 7:
                    if (!z) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    return z2;
                case '\t':
                    z2 = false;
                    c2 = '\b';
                    break;
                case '\n':
                    sj = sj;
                    sj.A03(A00(0, 6, 63), A00(169, 42, 36), false);
                    c2 = 7;
                    break;
                case 11:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01471q
    public final boolean A52() {
        SJ sj = this;
        String strA00 = null;
        boolean z = false;
        boolean z2 = true;
        char c2 = sj.A00 == EnumC01461p.A05 ? (char) 2 : '\r';
        while (true) {
            switch (c2) {
                case 2:
                    sj = sj;
                    if (sj.A01 != EnumC01461p.A07) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    sj = sj;
                    if (!JQ.A0a(sj.A03)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    if (!z) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    sj = sj;
                    sj.A00 = EnumC01461p.A02;
                    sj.A01 = EnumC01461p.A07;
                    c2 = 7;
                    break;
                case 7:
                    if (!z) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    return z2;
                case '\t':
                    z2 = false;
                    c2 = '\b';
                    break;
                case '\n':
                    sj = sj;
                    EnumC01461p enumC01461p = sj.A00;
                    EnumC01461p enumC01461p2 = EnumC01461p.A05;
                    strA00 = A00(6, 6, 51);
                    if (enumC01461p == enumC01461p2) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    sj = sj;
                    strA00 = strA00;
                    sj.A03(strA00, A00(k.AppCompatTheme_windowNoTitle, 18, 96), z2);
                    c2 = 7;
                    break;
                case '\f':
                    sj = sj;
                    strA00 = strA00;
                    sj.A03(strA00, A00(142, 23, 43), false);
                    c2 = 7;
                    break;
                case '\r':
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01471q
    public final EnumC01461p A5I() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01471q
    public final void ACz(EnumC01461p enumC01461p) {
        this.A00 = enumC01461p;
        this.A01 = enumC01461p;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01471q
    public final void AD2(AdError adError) {
        this.A00 = EnumC01461p.A04;
        this.A01 = EnumC01461p.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01471q
    public final void AD6() {
        if (this.A00 != EnumC01461p.A06) {
            A02(this.A00, EnumC01461p.A05);
        }
        this.A00 = EnumC01461p.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01471q
    public final void ADC() {
        if (this.A01 != EnumC01461p.A07) {
            A02(this.A00, EnumC01461p.A08);
        }
        this.A01 = EnumC01461p.A08;
    }
}
