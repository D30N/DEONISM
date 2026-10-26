package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* loaded from: assets/audience_network.dex */
public class PL implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C02897i A00;

    public PL(C02897i c02897i) {
        this.A00 = c02897i;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new K3(this, i));
    }
}
