package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.SystemClock;
import android.view.OrientationEventListener;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.6G, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6G {

    @Nullable
    public static OrientationEventListener A02;
    public final C6E A00;
    public final EnumC02656h A01;

    public C6G(C6E c6e, EnumC02656h enumC02656h) {
        this.A00 = c6e;
        this.A01 = enumC02656h;
    }

    public final synchronized void A01() {
        if (A02 != null) {
            A02.disable();
            A02 = null;
        }
    }

    public final synchronized void A02(final Context context) {
        if (A02 != null) {
            return;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final C02746q c02746q = this.A01 == EnumC02656h.A0F ? null : new C02746q(context == null ? "" : context.getPackageName());
        final int i = 3;
        A02 = new OrientationEventListener(context, i) { // from class: com.facebook.ads.redexgen.X.6F
            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i2) {
                this.A01.A00.A02(new X6(jElapsedRealtime, c02746q, i2), C6D.A09);
            }
        };
        A02.enable();
    }
}
