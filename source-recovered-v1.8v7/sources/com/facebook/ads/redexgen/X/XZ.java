package com.facebook.ads.redexgen.X;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class XZ extends AbstractRunnableC0608Kw {
    public static byte[] A03;
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ XJ A01;
    public final /* synthetic */ MultithreadedBundleWrapper A02;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 44);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A03 = new byte[]{-4, 13, 20, -55, 28, 30, 12, 12, 14, 28, 28, 15, 30, 21, 21, 34, -55, 18, 23, 18, 29, 18, 10, 21, 18, 35, 14, 13, -54};
    }

    public XZ(XJ xj, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener) {
        this.A01 = xj;
        this.A02 = multithreadedBundleWrapper;
        this.A00 = initListener;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0608Kw
    public final void A06() {
        AudienceNetworkAds.InitListener initListener = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        C0931Xn.A01().A0A(this.A01);
                        if (!C03228x.A05.get() && JQ.A0y(this.A01)) {
                            AnonymousClass96.A03(this.A01, this.A02);
                        }
                    } catch (Throwable th) {
                        this.A01.A04().A3R(th);
                    }
                    C03228x.A0D(this.A01);
                    initListener = this.A00;
                    if (initListener == null) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                    break;
                case 16:
                    initListener = initListener;
                    C03228x.A05(initListener, new C03218w(true, A00(0, 29, 125)));
                    c2 = 17;
                    break;
                case 17:
                    return;
            }
        }
    }
}
