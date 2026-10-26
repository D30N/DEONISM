package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public interface P6 {
    boolean A7e();

    boolean A7g();

    int getCurrentPositionInMillis();

    boolean getGlobalVisibleRect(Rect rect);

    long getInitialBufferTime();

    int getMeasuredHeight();

    int getMeasuredWidth();

    PC getVideoStartReason();

    @Nullable
    View getView();

    float getVolume();
}
