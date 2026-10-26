package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.72, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass72 {
    public Handler A00;

    public AnonymousClass72(Looper looper) {
        this.A00 = new Handler(looper);
    }

    public final void A00(AnonymousClass73 anonymousClass73) {
        this.A00.post(anonymousClass73);
    }

    public final void A01(AnonymousClass73 anonymousClass73) {
        this.A00.removeCallbacks(anonymousClass73);
    }

    public final boolean A02(AnonymousClass73 anonymousClass73, long j) {
        return this.A00.postDelayed(anonymousClass73, j);
    }
}
