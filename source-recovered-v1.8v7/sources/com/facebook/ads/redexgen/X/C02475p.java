package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.support.annotation.VisibleForTesting;
import com.facebook.ads.internal.api.BidderTokenProviderApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02475p implements BidderTokenProviderApi {
    public static byte[] A03;
    public XJ A00;
    public String A01;

    @VisibleForTesting
    public final C0612La A02 = new C0612La(300000000000L, new U0(this));

    static {
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 1);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A03 = new byte[]{-119, Byte.MIN_VALUE, -113, -110, -118, -115, -122, -102, -113, -108, -117, Byte.MIN_VALUE, -117, 125, -117, -117, -127, -121, -122, -105, -116, -127, -123, 125, -80, -67, -80, -69, -66, -74};
    }

    public static AnonymousClass91 A00(XJ xj) {
        return JQ.A0l(xj) ? AnonymousClass92.A01(A01(24, 6, 110), A01(12, 12, 55), A01(0, 12, 58)) : AnonymousClass92.A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        XJ xj;
        synchronized (this) {
            xj = this.A00;
        }
        if (xj == null) {
            return;
        }
        String strA76 = AnonymousClass94.A00().A02(xj, true).A76(A00(xj));
        synchronized (this) {
            this.A01 = strA76;
        }
    }

    public final void A05() {
        this.A02.A05();
    }

    @Override // com.facebook.ads.internal.api.BidderTokenProviderApi
    public final synchronized String getBidderToken(Context context) {
        this.A00 = AnonymousClass53.A07(context);
        DynamicLoaderFactory.makeLoader(this.A00).getInitApi().maybeAttachCrashListener(this.A00);
        if (this.A01 == null) {
            A02();
            this.A02.A04().A03();
        }
        this.A02.A06();
        return this.A01;
    }
}
