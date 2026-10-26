package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.bz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1114bz implements IM {
    @Override // com.facebook.ads.redexgen.X.IM
    public final IW A4I(Looper looper, @Nullable Handler.Callback callback) {
        return new C1115c0(new Handler(looper, callback));
    }

    @Override // com.facebook.ads.redexgen.X.IM
    public final long A4r() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.ads.redexgen.X.IM
    public final long ADk() {
        return SystemClock.uptimeMillis();
    }
}
