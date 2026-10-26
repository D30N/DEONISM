package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Xc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0920Xc implements InterfaceC0599Km {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0599Km
    public final void ACX(Throwable th, Object obj) {
        Context context = null;
        XI xiA5G = null;
        char c2 = obj instanceof C8A ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    obj = obj;
                    xiA5G = ((C8A) obj).A5G();
                    if (xiA5G == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    th = th;
                    xiA5G = xiA5G;
                    xiA5G.A0E(th);
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    obj = obj;
                    if (!(obj instanceof View)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    obj = obj;
                    context = ((View) obj).getContext();
                    if (!(context instanceof XI)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    th = th;
                    context = context;
                    ((XI) context).A0E(th);
                    c2 = 4;
                    break;
            }
        }
    }
}
