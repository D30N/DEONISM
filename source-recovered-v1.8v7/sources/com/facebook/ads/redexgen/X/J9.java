package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.os.Handler;
import android.support.annotation.NonNull;

@TargetApi(23)
/* loaded from: assets/audience_network.dex */
public final class J9 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ C01561z A00;

    public J9(C01561z c01561z, MediaCodec mediaCodec) {
        this.A00 = c01561z;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(@NonNull MediaCodec mediaCodec, long j, long j2) {
        if (this != this.A00.A00) {
            return;
        }
        this.A00.A1R();
    }
}
