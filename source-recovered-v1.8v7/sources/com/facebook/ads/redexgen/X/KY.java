package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: assets/audience_network.dex */
public final class KY {
    public static byte[] A08;
    public static final M1 A09;
    public static final Executor A0A;
    public KV A01;
    public KX A02;

    @Nullable
    public String A03;
    public Map<String, String> A04;
    public final XI A05;
    public long A00 = -1;
    public final KZ A06 = KZ.A00();
    public final String A07 = C0590Kc.A00();

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 93);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0C() {
        A08 = new byte[]{64, 65, 104, 71, 66, 66, 102, 65, 65, 69, 99, 66, 13, 107, 68, 65, 65, 13, 72, 95, 95, 66, 95, 13, 78, 66, 73, 72, 13, 118, 8, 94, 112, 13, 8, 94, 100, 94, 13, Byte.MAX_VALUE, 99, 23, 13, 25, 22, 19, 31, 20, 14, 5, 8, 31, 11, 15, 31, 9, 14, 5, 19, 30, 95, 94, 49, 87, 88, 93, 93, 49, 99, 116, 114, 116, 120, 103, 116, 117, 114, 83, 28, 82, 89, 72, 75, 83, 78, 87, 28, 95, 83, 82, 82, 89, 95, 72, 85, 83, 82, 61, 54, 39, 36, 60, 33, 56, 61, 46, 44, 48, 50, 21, 65, 71, 65, 28, 71, 29, 28, 118, 116, Byte.MAX_VALUE, 116, 99, 120, 114};
    }

    static {
        A0C();
        A09 = new M1();
        A0A = Executors.newCachedThreadPool(A09);
    }

    public KY(XI xi) {
        this.A05 = xi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Q7 A04(long j) {
        return new C1149ca(this, j);
    }

    private void A0B() {
        XI xi = this.A05;
        char c2 = xi != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    xi = xi;
                    if (!QO.A0B(xi)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    C03018b c03018b = new C03018b(A06(104, 5, 33));
                    c03018b.A03(1);
                    this.A05.A04().A83(A06(97, 7, 14), C03008a.A1V, c03018b);
                    return;
            }
        }
    }

    private void A0D(int i, String str) {
        String strA06 = A06(0, 10, k.AppCompatTheme_windowActionBar);
        KJ.A05(strA06, A06(60, 16, 76), A06(109, 8, k.AppCompatTheme_windowFixedWidthMinor));
        KJ.A04(strA06, String.format(Locale.US, A06(10, 26, 112), Integer.valueOf(i), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(K5 k5) {
        KX kx = this.A02;
        if (kx != null) {
            kx.A9Y(k5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(K5 k5) {
        ExecutorC0630Lt.A00(new C1151cc(this, k5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(C1152cd c1152cd) {
        KX kx = this.A02;
        if (kx != null) {
            kx.AB8(c1152cd);
        }
    }

    private void A0M(C1152cd c1152cd) {
        InterfaceC0746Qh interfaceC0746QhA09 = null;
        ExecutorC0630Lt.A00(new C1150cb(this, c1152cd));
        char c2 = JQ.A1M(this.A05) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    interfaceC0746QhA09 = C0931Xn.A01().A09();
                    if (interfaceC0746QhA09 == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    interfaceC0746QhA09 = interfaceC0746QhA09;
                    interfaceC0746QhA09.A59();
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(String str, long j) {
        String str2;
        try {
            C0589Kb c0589KbA06 = this.A06.A06(this.A05, str, j, this.A03);
            C03188s c03188sA00 = c0589KbA06.A00();
            C02485q.A05(this.A05.A00(), str);
            if (c03188sA00 != null) {
                JQ.A0L(this.A05).A1m(c03188sA00.A08());
                DynamicLoaderFactory.makeLoader(this.A05).getInitApi().maybeAttachCrashListener(this.A05);
                AnonymousClass24.A0O(this.A05.A00(), c03188sA00.A06());
                KU.A05(c03188sA00.A05().A0B(), this.A01);
                MC.A01(this.A05, A0A, c03188sA00);
                C03018b c03018b = new C03018b(A06(36, 7, 112) + LU.A02());
                c03018b.A04(1);
                c03018b.A07(false);
                this.A05.A04().A8P(A06(k.AppCompatTheme_windowActionModeOverlay, 7, 76), C03008a.A1D, c03018b);
            }
            int i = KW.A00[c0589KbA06.A01().ordinal()];
            if (i == 1) {
                C1152cd c1152cd = (C1152cd) c0589KbA06;
                if (c03188sA00 != null) {
                    if (c03188sA00.A05().A0E()) {
                        KU.A07(str, this.A01);
                    }
                    if (this.A04 != null) {
                        str2 = this.A04.get(A06(43, 17, 7));
                    } else {
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(c0589KbA06.A02()) && !TextUtils.isEmpty(str2)) {
                        new JO(this.A05, str2, c0589KbA06.A02()).A08();
                    }
                }
                this.A05.A0A().A2m(C0627Lq.A01(this.A00));
                A0M(c1152cd);
                return;
            }
            if (i != 2) {
                AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                this.A05.A0A().A2l(C0627Lq.A01(this.A00), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                A0F(K5.A02(adErrorType, str));
                return;
            }
            C1153ce c1153ce = (C1153ce) c0589KbA06;
            String finalErrMessage = c1153ce.A04();
            AdErrorType adErrorTypeAdErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c1153ce.A03(), AdErrorType.ERROR_MESSAGE);
            A0D(c1153ce.A03(), finalErrMessage);
            if (finalErrMessage == null) {
                finalErrMessage = str;
            }
            this.A05.A0A().A2l(C0627Lq.A01(this.A00), adErrorTypeAdErrorTypeFromCode.getErrorCode(), finalErrMessage, adErrorTypeAdErrorTypeFromCode.isPublicError());
            A0F(K5.A02(adErrorTypeAdErrorTypeFromCode, finalErrMessage));
        } catch (Exception e) {
            String message = e.getMessage();
            AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
            this.A05.A0A().A2l(C0627Lq.A01(this.A00), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            A0F(K5.A02(adErrorType2, message));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(String str, long j) {
        A0A.execute(new C1148cZ(this, str, j));
    }

    public final void A0P(KV kv) {
        KY ky = this;
        String strA02 = null;
        ky.A00 = System.currentTimeMillis();
        char c2 = C0625Lo.A00(ky.A05) == EnumC0624Ln.A07 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    KY ky2 = ky;
                    ky2.A0B();
                    AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
                    String strA06 = A06(76, 21, 97);
                    ky2.A05.A0A().A2l(C0627Lq.A01(ky2.A00), adErrorType.getErrorCode(), strA06, adErrorType.isPublicError());
                    ky2.A0F(new K5(adErrorType, strA06));
                    return;
                case 3:
                    ky = ky;
                    kv = kv;
                    ky.A01 = kv;
                    C03098j.A0B(ky.A05);
                    if (!KU.A08(kv)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    kv = kv;
                    strA02 = KU.A02(kv);
                    if (strA02 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    KY ky3 = ky;
                    ky3.A05.A0A().ADl();
                    ky3.A0O(strA02, 0L);
                    return;
                case 6:
                    KY ky4 = ky;
                    AdErrorType adErrorType2 = AdErrorType.LOAD_TOO_FREQUENTLY;
                    ky4.A05.A0A().A2l(C0627Lq.A01(ky4.A00), adErrorType2.getErrorCode(), adErrorType2.getDefaultErrorMessage(), adErrorType2.isPublicError());
                    ky4.A0F(K5.A02(adErrorType2, null));
                    return;
                case 7:
                    A0A.execute(new C1147cY(ky, kv));
                    return;
            }
        }
    }

    public final void A0Q(KX kx) {
        this.A02 = kx;
    }
}
