package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.MediaCrypto;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.Ye, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0948Ye implements InterfaceC0398Bx {
    public final MediaCrypto A00;
    public final boolean A01;

    public final MediaCrypto A00() {
        return this.A00;
    }

    public final boolean A01(String str) {
        C0948Ye c0948Ye = this;
        boolean z = false;
        char c2 = !c0948Ye.A01 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0948Ye = c0948Ye;
                    str = str;
                    if (!c0948Ye.A00.requiresSecureDecoderComponent(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }
}
