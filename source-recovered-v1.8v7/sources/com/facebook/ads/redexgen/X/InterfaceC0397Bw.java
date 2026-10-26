package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.redexgen.X.InterfaceC0398Bx;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.Bw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC0397Bw<T extends InterfaceC0398Bx> {
    InterfaceC0396Bv<T> A2P(Looper looper, DrmInitData drmInitData);

    boolean A3w(DrmInitData drmInitData);

    void ACP(InterfaceC0396Bv<T> interfaceC0396Bv);
}
