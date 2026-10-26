package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.support.annotation.Nullable;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC0735Pw {
    void A7H();

    boolean A7O();

    boolean A7P();

    void ABd(boolean z, int i);

    void ADJ(int i);

    void ADN(PC pc, int i);

    void ADT(int i);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    PC getStartReason();

    EnumC0737Py getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i);

    void setBackgroundPlaybackEnabled(boolean z);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z);

    void setRequestedVolume(float f);

    void setVideoMPD(@Nullable String str);

    void setVideoStateChangeListener(InterfaceC0738Pz interfaceC0738Pz);

    void setup(Uri uri);
}
