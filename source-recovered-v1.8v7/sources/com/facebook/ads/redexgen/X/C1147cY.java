package com.facebook.ads.redexgen.X;

import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1147cY extends AbstractRunnableC0608Kw {
    public static byte[] A02;
    public final /* synthetic */ KV A00;
    public final /* synthetic */ KY A01;

    static {
        A02();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 79);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{-60, 7, 25, -4, -5, 8, 8, -1, 12, 25, 5, -1, 19};
    }

    public C1147cY(KY ky, KV kv) {
        this.A01 = ky;
        this.A00 = kv;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        C03098j.A08(this.A01.A05);
        C02335a.A07(this.A01.A05);
        if (this.A00.A06().A09()) {
            try {
                this.A00.A06().A07(C02335a.A00().A03());
            } catch (K6 e) {
                AdErrorType adErrorTypeA00 = e.A00();
                this.A01.A05.A0A().A2l(C0627Lq.A01(this.A01.A00), adErrorTypeA00.getErrorCode(), adErrorTypeA00.getDefaultErrorMessage(), adErrorTypeA00.isPublicError());
                this.A01.A0F(K5.A03(e));
            }
            this.A01.A0O(this.A00.A06().A06(), 0L);
            return;
        }
        boolean z = true;
        this.A01.A04 = this.A00.A09(AnonymousClass94.A00().A02(this.A01.A05, true).A69());
        try {
            this.A01.A04.put(A00(1, 12, 107), new String(Base64.encode((this.A01.A05.getPackageName() + A00(0, 1, 85) + this.A01.A05.getPackageManager().getInstallerPackageName(this.A01.A05.getPackageName())).getBytes(), 2)));
        } catch (Exception unused) {
        }
        try {
            if (this.A00.A05() != KB.A04 && this.A00.A05() != KB.A06 && this.A00.A05() != KB.A05 && this.A00.A05() != null) {
                z = false;
            }
            QO.A02(z, this.A01.A05).ABk(this.A01.A07, new QK().A05(this.A01.A04).A08(), this.A01.A04(C0627Lq.A00()));
        } catch (Exception e2) {
            AdErrorType adErrorType = AdErrorType.AD_REQUEST_FAILED;
            String message = e2.getMessage();
            this.A01.A05.A0A().A2l(C0627Lq.A01(this.A01.A00), adErrorType.getErrorCode(), message, adErrorType.isPublicError());
            this.A01.A0F(K5.A02(adErrorType, message));
        }
    }
}
