package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public final class PA extends RelativeLayout {

    @Nullable
    public C7W A00;
    public WeakReference<P9> A01;
    public final InterfaceC0735Pw A02;

    public PA(XI xi, InterfaceC0735Pw interfaceC0735Pw) {
        super(xi);
        this.A02 = interfaceC0735Pw;
        C0635Ly.A0M((View) this.A02);
        addView(this.A02.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void A00(AbstractC0653Mr abstractC0653Mr) {
        addView(abstractC0653Mr, new RelativeLayout.LayoutParams(-1, -1));
        this.A00 = (C7W) abstractC0653Mr;
    }

    public final void A01(AbstractC0653Mr abstractC0653Mr) {
        C0635Ly.A0M(abstractC0653Mr);
        this.A00 = null;
    }

    public final boolean A02() {
        return this.A02.A7P();
    }

    public final boolean A03(int i) {
        boolean z = false;
        char c2 = this.A02.getCurrentPosition() > i ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public int getCurrentPosition() {
        return this.A02.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ((View) this.A02).layout(0, 0, getWidth(), getHeight());
        C7W c7w = this.A00;
        if (c7w != null) {
            c7w.layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int mVideoWidth, int mVideoHeight) {
        PA pa = this;
        int width = 0;
        int widthSpecSize = 0;
        int heightSpecSize = 0;
        int size = 0;
        WeakReference<P9> weakReference = null;
        int i = 0;
        int mode = 0;
        boolean z = false;
        int videoWidth = pa.A02.getVideoWidth();
        int videoHeight = pa.A02.getVideoHeight();
        int defaultSize = getDefaultSize(videoWidth, mVideoWidth);
        int height = getDefaultSize(videoHeight, mVideoHeight);
        char c2 = videoWidth > 0 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    if (videoHeight <= 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    width = View.MeasureSpec.getMode(mVideoWidth);
                    size = View.MeasureSpec.getSize(mVideoWidth);
                    mode = View.MeasureSpec.getMode(mVideoHeight);
                    heightSpecSize = View.MeasureSpec.getSize(mVideoHeight);
                    i = 1073741824;
                    if (width != 1073741824) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (mode != i) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    defaultSize = size;
                    height = heightSpecSize;
                    if (videoWidth * height >= defaultSize * videoHeight) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    defaultSize = (height * videoWidth) / videoHeight;
                    c2 = 7;
                    break;
                case 7:
                    pa = pa;
                    pa.setMeasuredDimension(defaultSize, height);
                    if (!z) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    pa = pa;
                    weakReference = pa.A01;
                    if (weakReference == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    weakReference = weakReference;
                    if (weakReference.get() == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    pa = pa;
                    pa.A01.get().ABN();
                    c2 = 11;
                    break;
                case 11:
                    return;
                case '\f':
                    if (videoWidth * height <= defaultSize * videoHeight) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    int height2 = defaultSize * videoHeight;
                    height = height2 / videoWidth;
                    c2 = 7;
                    break;
                case 14:
                    widthSpecSize = RecyclerView.UNDEFINED_DURATION;
                    if (width != i) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    defaultSize = size;
                    int height3 = defaultSize * videoHeight;
                    height = height3 / videoWidth;
                    if (mode != widthSpecSize) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    if (height <= heightSpecSize) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    height = heightSpecSize;
                    c2 = 7;
                    break;
                case 18:
                    if (mode != i) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    height = heightSpecSize;
                    defaultSize = (height * videoWidth) / videoHeight;
                    if (width != widthSpecSize) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    if (defaultSize <= size) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    defaultSize = size;
                    c2 = 7;
                    break;
                case 22:
                    defaultSize = videoWidth;
                    height = videoHeight;
                    if (mode != widthSpecSize) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    if (height <= heightSpecSize) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    height = heightSpecSize;
                    defaultSize = (height * videoWidth) / videoHeight;
                    c2 = 25;
                    break;
                case 25:
                    if (width != widthSpecSize) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    if (defaultSize <= size) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    defaultSize = size;
                    int heightSpecMode = defaultSize * videoHeight;
                    height = heightSpecMode / videoWidth;
                    c2 = 7;
                    break;
            }
        }
    }

    public void setViewImplInflationListener(P9 p9) {
        this.A01 = new WeakReference<>(p9);
    }
}
