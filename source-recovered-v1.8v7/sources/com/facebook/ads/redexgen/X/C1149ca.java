package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import d.b.a.b.k;
import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.ca, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1149ca implements Q7 {
    public static byte[] A02;
    public final /* synthetic */ long A00;
    public final /* synthetic */ KY A01;

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 21);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{30, 40, 63, 59, 40, 63, 109, 40, 63, 63, 34, 63, 109, 34, 46, 46, 56, 63, 63, 40, 41, 20, 25, 20, 65, 20, 68, 66, 67, 85, 76, 80, 81, 90, 103, 124, 122, 111, 107, 118, 112, 113, 37, 63, 49, 7, 16, 20, 7, 16, 66, 16, 7, 18, 14, 11, 7, 6, 66, 17, 23, 1, 1, 7, 17, 17, 4, 23, 14, 14, 27, 76, 27, 24, 75, 31, 66, 28, 78, 12, 13, 32, 12, 14, 19, 15, 6, 23, 6, 73, 72, 99, 84, 84, 73, 84};
    }

    public C1149ca(KY ky, long j) {
        this.A01 = ky;
        this.A00 = j;
    }

    private final void A02(QJ qj) {
        QJ qj2 = qj;
        C1149ca c1149ca = this;
        String strA5U = null;
        AdErrorType adErrorTypeAdErrorTypeFromCode = null;
        Q5 q5A00 = null;
        C0589Kb c0589KbA06 = null;
        String strA04 = null;
        String str = null;
        KU.A06(c1149ca.A01.A01);
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        qj2 = qj2;
                        q5A00 = qj2.A00();
                        if (q5A00 != null) {
                            c2 = 4;
                        } else {
                            c2 = '%';
                            continue;
                        }
                    } catch (JSONException e) {
                        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
                        String message = qj2.getMessage();
                        c1149ca.A01.A05.A0A().A2l(C0627Lq.A01(c1149ca.A01.A00), adErrorType.getErrorCode(), A00(29, 15, 10) + e.getMessage(), adErrorType.isPublicError());
                        c1149ca.A01.A0F(K5.A02(adErrorType, message));
                        return;
                    }
                case 4:
                    q5A00 = q5A00;
                    strA5U = q5A00.A5U();
                    c0589KbA06 = c1149ca.A01.A06.A06(c1149ca.A01.A05, strA5U, c1149ca.A00, c1149ca.A01.A03);
                    if (c0589KbA06.A01() == EnumC0588Ka.A03) {
                        c2 = 16;
                    } else {
                        c2 = '%';
                        continue;
                    }
                case 16:
                    c0589KbA06 = c0589KbA06;
                    C1153ce serverResponseError = (C1153ce) c0589KbA06;
                    strA04 = serverResponseError.A04();
                    adErrorTypeAdErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(serverResponseError.A03(), AdErrorType.ERROR_MESSAGE);
                    if (strA04 == null) {
                        c2 = 22;
                    } else {
                        c2 = 23;
                        continue;
                    }
                case 22:
                    strA5U = strA5U;
                    str = strA5U;
                    c2 = 24;
                    continue;
                case 23:
                    strA04 = strA04;
                    str = strA04;
                    c2 = 24;
                    continue;
                case 24:
                    c1149ca = c1149ca;
                    c1149ca.A01.A05.A0A().A2l(C0627Lq.A01(c1149ca.A01.A00), adErrorTypeAdErrorTypeFromCode.getErrorCode(), str, adErrorTypeAdErrorTypeFromCode.isPublicError());
                    c1149ca.A01.A0F(K5.A02(adErrorTypeAdErrorTypeFromCode, str));
                    return;
                case '%':
                    C1149ca c1149ca2 = c1149ca;
                    AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
                    String message2 = qj2.getMessage();
                    c1149ca2.A01.A05.A0A().A2l(C0627Lq.A01(c1149ca2.A01.A00), adErrorType2.getErrorCode(), message2, adErrorType2.isPublicError());
                    c1149ca2.A01.A0F(K5.A02(adErrorType2, message2));
                    return;
            }
            AdErrorType adErrorType3 = AdErrorType.NETWORK_ERROR;
            String message3 = qj2.getMessage();
            c1149ca.A01.A05.A0A().A2l(C0627Lq.A01(c1149ca.A01.A00), adErrorType3.getErrorCode(), A00(29, 15, 10) + e.getMessage(), adErrorType3.isPublicError());
            c1149ca.A01.A0F(K5.A02(adErrorType3, message3));
            return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void A9D(Q5 q5) {
        KJ.A05(A00(79, 10, k.AppCompatTheme_windowFixedHeightMajor), A00(44, 27, k.AppCompatTheme_windowFixedHeightMinor), A00(21, 8, 53));
        if (q5 != null) {
            String strA5U = q5.A5U();
            KU.A06(this.A01.A01);
            this.A01.A0O(strA5U, this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.Q7
    public final void A9Z(Exception exc) {
        C1149ca c1149ca = this;
        KJ.A05(A00(89, 7, 51), A00(0, 21, 88), A00(71, 8, 111));
        char c2 = QJ.class.equals(exc.getClass()) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1149ca = c1149ca;
                    exc = exc;
                    c1149ca.A02((QJ) exc);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c1149ca = c1149ca;
                    exc = exc;
                    AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
                    String message = exc.getMessage();
                    c1149ca.A01.A05.A0A().A2l(C0627Lq.A01(c1149ca.A01.A00), adErrorType.getErrorCode(), message, adErrorType.isPublicError());
                    c1149ca.A01.A0F(K5.A02(adErrorType, message));
                    c2 = 3;
                    break;
            }
        }
    }
}
