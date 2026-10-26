package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public abstract class SM implements AnonymousClass20 {
    public static byte[] A05;
    public final InterfaceC01471q A00;
    public final XI A01;
    public final String A02 = UUID.randomUUID().toString();
    public final Handler A03;
    public final InterfaceC01521v A04;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 50);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A05 = new byte[]{86, 81, 75, 64, 90, 77, 77, 80, 77, 64, 92, 80, 91, 90, 64, 84, 90, 70, 59, 44, 55, 61, 53, 60, 38, 60, 33, 45, 43, 56, 42, 38, 50, 60, 32, 44, 43, 45, 32, 58, 45, 45, 48, 45, 32, 50, 58, 44, 44, 62, 56, 58, 32, 52, 58, 38, 85, 82, 84, 89, 71, 66, 89, 79, 66, 89, 77, 67, 95};
    }

    public abstract void A05();

    public SM(XI xi, InterfaceC01531w interfaceC01531w) {
        this.A01 = xi;
        DynamicLoaderFactory.makeLoader(this.A01).getInitApi().onAdLoadInvoked(this.A01);
        this.A00 = new SJ(xi, this);
        this.A03 = new Handler(Looper.getMainLooper());
        this.A04 = interfaceC01531w.A4L(this.A00, this);
    }

    public final void A04() {
        if (!JQ.A0h(this.A01)) {
            return;
        }
        ExecutorC0630Lt.A00(new SL(this));
    }

    public final void A06(int i, AdErrorType adErrorType, @Nullable String str) {
        Bundle bundle = new Bundle();
        String strA02 = A02(35, 21, 77);
        char c2 = str != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    bundle = bundle;
                    strA02 = strA02;
                    bundle.putString(strA02, str);
                    c2 = 3;
                    break;
                case 3:
                    SM sm = this;
                    Bundle bundle2 = bundle;
                    bundle2.putInt(A02(0, 18, 45), adErrorType.getErrorCode());
                    sm.AAI(i, sm.A02, bundle2);
                    return;
                case 4:
                    adErrorType = adErrorType;
                    bundle = bundle;
                    strA02 = strA02;
                    bundle.putString(strA02, adErrorType.getDefaultErrorMessage());
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass20
    public final void AAI(int i, String str, @Nullable Bundle bundle) {
        Message messageObtain = Message.obtain((Handler) null, i);
        messageObtain.getData().putString(A02(56, 13, 52), str);
        if (bundle != null) {
            messageObtain.getData().putBundle(A02(18, 17, 75), bundle);
        }
        this.A03.post(new SK(this, messageObtain));
    }
}
