package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import d.b.a.b.k;
import java.util.Arrays;

@TargetApi(14)
/* loaded from: assets/audience_network.dex */
public final class HK extends TextureView implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener, InterfaceC0735Pw {
    public static byte[] A0O;
    public static final String A0P;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;

    @Nullable
    public MediaPlayer A06;
    public Uri A07;
    public Surface A08;
    public View A09;

    @Nullable
    public MediaController A0A;
    public PC A0B;
    public EnumC0737Py A0C;
    public EnumC0737Py A0D;
    public EnumC0737Py A0E;
    public InterfaceC0738Pz A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final long A0L;
    public final MediaController.MediaPlayerControl A0M;
    public final XI A0N;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0O, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 65);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A0O = new byte[]{126, 86, 86, 94, 85, 92, 25, 88, 85, 78, 88, 64, 74, 25, 77, 81, 75, 86, 78, 25, 88, 87, 25, 92, 65, 90, 92, 73, 77, 80, 86, 87, 25, 78, 80, 77, 81, 25, 74, 92, 77, Byte.MAX_VALUE, 86, 75, 92, 94, 75, 86, 76, 87, 93, 25, 86, 87, 25, 119, 86, 76, 94, 88, 77, 25, 88, 91, 86, 79, 92, 23, 25, 74, 86, 25, 78, 92, 25, 74, 80, 85, 92, 87, 77, 85, 64, 25, 80, 94, 87, 86, 75, 92, 25, 80, 77, 23, 60, 50, 62, 60, 123, 102, 106, 108, Byte.MAX_VALUE, 60, 62, 36, 62, 60, 83, 123, 123, 115, 120, 113, 52, 117, 120, 99, 117, 109, 103, 52, 96, 124, 102, 123, 99, 52, 117, 122, 52, 113, 108, 119, 113, 100, 96, 125, 123, 122, 52, 99, 125, 96, 124, 52, 103, 113, 96, 86, 117, 119, Byte.MAX_VALUE, 115, 102, 123, 97, 122, 112, 80, 102, 117, 99, 117, 118, 120, 113, 52, 123, 122, 52, 90, 123, 97, 115, 117, 96, 52, 117, 118, 123, 98, 113, 58, 52, 103, 123, 52, 99, 113, 52, 103, 125, 120, 113, 122, 96, 120, 109, 52, 125, 115, 122, 123, 102, 113, 52, 125, 96, 58, 30, 33, 44, 45, 39, 104, 59, 60, 41, 60, 45, 104, 43, 32, 41, 38, 47, 45, 44, 104, 60, 39, 104, 74, 99, 112, 102, 117, 99, 112, 103, 34, 99, 97, 97, 103, 110, 103, 112, 99, 118, 107, 109, 108, 34, 119, 108, 99, 116, 99, 107, 110, 99, 96, 110, 103, 99, 65, 78, 78, 79, 84, 0, 80, 82, 69, 80, 65, 82, 69, 0, 77, 69, 68, 73, 65, 0, 80, 76, 65, 89, 69, 82, 0, 87, 73, 84, 72, 0, 115, 85, 82, 70, 65, 67, 69, 116, 69, 88, 84, 85, 82, 69, 26, 0, 106, 120, 120, 110, Byte.MAX_VALUE, 94, 114, 104, 113, 121, 115, 58, 105, 61, 111, 120, 105, 111, 116, 120, 107, 120, 61, 107, 116, 121, 120, 114, 61, 116, 115, 123, 114, 111, 112, 124, 105, 116, 114, 115, 18, 13, 0, 1, 11, 103, 62, 107, 116, 125, 104, 62, 60, 38, 60, 62, 54, 17, 25, 28, 21, 20, 80, 4, 31, 80, 31, 0, 21, 30, 80, 17, 3, 3, 21, 4, 3, 80, 50, 9, 6, 5, 11, 2, 71, 19, 8, 71, 4, 11, 8, 20, 2, 10, 22, 27, 3, 31, 8, 31, 64};
    }

    static {
        A03();
        A0P = HK.class.getSimpleName();
    }

    public HK(XI xi) {
        super(xi);
        this.A0C = EnumC0737Py.A04;
        this.A0E = EnumC0737Py.A04;
        this.A0D = EnumC0737Py.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0I = false;
        this.A01 = 3;
        this.A0G = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0H = false;
        this.A0B = PC.A04;
        this.A0M = new C0732Pt(this);
        this.A0N = xi;
    }

    public HK(XI xi, AttributeSet attributeSet) {
        super(xi, attributeSet);
        this.A0C = EnumC0737Py.A04;
        this.A0E = EnumC0737Py.A04;
        this.A0D = EnumC0737Py.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0I = false;
        this.A01 = 3;
        this.A0G = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0H = false;
        this.A0B = PC.A04;
        this.A0M = new C0732Pt(this);
        this.A0N = xi;
    }

    public HK(XI xi, AttributeSet attributeSet, int i) {
        super(xi, attributeSet, i);
        this.A0C = EnumC0737Py.A04;
        this.A0E = EnumC0737Py.A04;
        this.A0D = EnumC0737Py.A04;
        this.A0J = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0I = false;
        this.A01 = 3;
        this.A0G = false;
        this.A0K = false;
        this.A02 = 0;
        this.A0H = false;
        this.A0B = PC.A04;
        this.A0M = new C0732Pt(this);
        this.A0N = xi;
    }

    private boolean A04() {
        HK hk = this;
        boolean z = false;
        char c2 = hk.A0C != EnumC0737Py.A08 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    hk = hk;
                    if (hk.A0C == EnumC0737Py.A07) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    private boolean A05() {
        HK hk = this;
        boolean z = false;
        char c2 = hk.A0C != EnumC0737Py.A07 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    hk = hk;
                    if (hk.A0C == EnumC0737Py.A0A) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    hk = hk;
                    if (hk.A0C == EnumC0737Py.A05) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    hk = hk;
                    if (hk.A0C != EnumC0737Py.A06) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z = true;
                    c2 = 6;
                    break;
                case 6:
                    return z;
                case 7:
                    z = false;
                    c2 = 6;
                    break;
            }
        }
    }

    private boolean A06() {
        HK hk = this;
        boolean z = false;
        char c2 = hk.A0C != EnumC0737Py.A08 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    hk = hk;
                    if (hk.A0C == EnumC0737Py.A07) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    private boolean A07() {
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer == null) {
            return false;
        }
        try {
            mediaPlayer.reset();
            return true;
        } catch (IllegalStateException e) {
            this.A0N.A04().A83(A02(408, 6, 59), C03008a.A1k, new C03018b(e));
            return false;
        }
    }

    private boolean A08(@Nullable Surface surface) {
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer == null) {
            return false;
        }
        try {
            mediaPlayer.setSurface(surface);
            return true;
        } catch (IllegalStateException e) {
            this.A0N.A04().A83(A02(408, 6, 59), C03008a.A1l, new C03018b(e));
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public final void A7H() throws IllegalStateException {
        if (!this.A0G) {
            ABd(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    @SuppressLint({"NewApi"})
    public final boolean A7O() throws IllegalStateException {
        HK hk = this;
        boolean z = false;
        int length = 0;
        int i = 0;
        MediaPlayer.TrackInfo[] trackInfo = null;
        char c2 = hk.A06 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (Build.VERSION.SDK_INT >= 16) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    try {
                        hk = hk;
                        trackInfo = hk.A06.getTrackInfo();
                        length = trackInfo.length;
                        i = 0;
                        c2 = '\t';
                        break;
                    } catch (RuntimeException e) {
                        Log.e(A0P, A02(320, 35, 92), e);
                        return z;
                    }
                case '\t':
                    if (i >= length) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    trackInfo = trackInfo;
                    if (trackInfo[i].getTrackType() != 2) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case '\r':
                    i++;
                    c2 = '\t';
                    break;
                case 14:
                    return z;
                case 15:
                    return false;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public final boolean A7P() {
        return this.A0K;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public final void ABd(boolean z, int i) throws IllegalStateException {
        HK hk = this;
        hk.A0N.A0A().A2u(i);
        hk.A0E = EnumC0737Py.A05;
        char c2 = hk.A06 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    hk = hk;
                    if (!hk.A04()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    hk = hk;
                    hk.setVideoState(EnumC0737Py.A04);
                    c2 = '\t';
                    break;
                case 5:
                    if (!z) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    hk = hk;
                    hk.A0D = EnumC0737Py.A05;
                    hk.A0J = true;
                    c2 = 7;
                    break;
                case 7:
                    hk = hk;
                    hk.A06.pause();
                    if (hk.A0C == EnumC0737Py.A06) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    hk = hk;
                    hk.setVideoState(EnumC0737Py.A05);
                    c2 = '\t';
                    break;
                case '\t':
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public final void ADJ(int i) throws IllegalStateException {
        this.A0N.A0A().A8a(i);
        setVideoState(EnumC0737Py.A09);
        ADT(5);
        this.A03 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public final void ADN(PC pc, int i) throws Throwable {
        HK hk = this;
        int i2 = 0;
        MediaPlayer mediaPlayer = null;
        hk.A0N.A0A().A35(i);
        hk.A0E = EnumC0737Py.A0A;
        hk.A0B = pc;
        char c2 = hk.A0C != EnumC0737Py.A0A ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    hk = hk;
                    if (hk.A0C == EnumC0737Py.A07) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    hk = hk;
                    if (hk.A0C == EnumC0737Py.A04) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    hk = hk;
                    if (hk.A0C == EnumC0737Py.A05) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    hk = hk;
                    if (hk.A0C != EnumC0737Py.A06) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    hk = hk;
                    mediaPlayer = hk.A06;
                    if (mediaPlayer != null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    hk = hk;
                    hk.setup(hk.A07);
                    c2 = '\b';
                    break;
                case '\b':
                    hk = hk;
                    if (!hk.isAvailable()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    hk = hk;
                    hk.onSurfaceTextureAvailable(hk.getSurfaceTexture(), 0, 0);
                    c2 = '\n';
                    break;
                case '\n':
                    return;
                case 11:
                    hk = hk;
                    i2 = hk.A03;
                    if (i2 <= 0) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    mediaPlayer = mediaPlayer;
                    mediaPlayer.seekTo(i2);
                    c2 = '\r';
                    break;
                case '\r':
                    hk = hk;
                    hk.A06.start();
                    if (hk.A0C != EnumC0737Py.A07) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    hk = hk;
                    if (!hk.A0K) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    hk = hk;
                    hk.setVideoState(EnumC0737Py.A0A);
                    c2 = '\b';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public final void ADT(int i) throws IllegalStateException {
        HK hk = this;
        MediaController mediaController = null;
        int currentPosition = 0;
        hk.A0N.A0A().A37(i);
        hk.A0E = EnumC0737Py.A04;
        MediaPlayer mediaPlayer = hk.A06;
        char c2 = mediaPlayer != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    mediaPlayer = mediaPlayer;
                    currentPosition = mediaPlayer.getCurrentPosition();
                    if (currentPosition <= 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    hk = hk;
                    hk.A03 = currentPosition;
                    c2 = 4;
                    break;
                case 4:
                    hk = hk;
                    hk.A06.stop();
                    hk.A07();
                    hk.A06.release();
                    hk.A06 = null;
                    mediaController = hk.A0A;
                    if (mediaController == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    hk = hk;
                    mediaController = mediaController;
                    mediaController.hide();
                    hk.A0A.setEnabled(false);
                    c2 = 6;
                    break;
                case 6:
                    hk.setVideoState(EnumC0737Py.A04);
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public final void destroy() {
        if (this.A06 != null) {
            A08(null);
            this.A06.setOnBufferingUpdateListener(null);
            this.A06.setOnCompletionListener(null);
            this.A06.setOnErrorListener(null);
            this.A06.setOnInfoListener(null);
            this.A06.setOnPreparedListener(null);
            this.A06.setOnVideoSizeChangedListener(null);
            this.A06.setOnSeekCompleteListener(null);
            A07();
            this.A06 = null;
            setVideoState(EnumC0737Py.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public int getCurrentPosition() {
        HK hk = this;
        int currentPosition = 0;
        char c2 = hk.A06 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    hk = hk;
                    if (!hk.A05()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    hk = hk;
                    currentPosition = hk.A06.getCurrentPosition();
                    c2 = 4;
                    break;
                case 4:
                    return currentPosition;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public int getDuration() {
        HK hk = this;
        char c2 = hk.A06 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    hk = hk;
                    if (!hk.A05()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return 0;
                case 4:
                    return hk.A06.getDuration();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public long getInitialBufferTime() {
        return this.A0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public PC getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public EnumC0737Py getState() {
        return this.A0C;
    }

    public EnumC0737Py getTargetState() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public int getVideoHeight() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public int getVideoWidth() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() throws IllegalStateException {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            setVideoState(EnumC0737Py.A03);
            this.A0N.A0A().A2y(5);
            ADT(8);
            this.A0N.A04().A83(A02(355, 5, 37), C03008a.A22, new C03018b(A02(233, 33, 67)));
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) throws IllegalStateException {
        MediaPlayer mediaPlayer2 = this.A06;
        if (mediaPlayer2 != null) {
            mediaPlayer2.pause();
        }
        setVideoState(EnumC0737Py.A06);
        seekTo(0);
        this.A03 = 0;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) throws Throwable {
        HK hk = this;
        hk.A0N.A0A().A8Z(A02(360, 11, 93) + i + A02(94, 14, 95) + i2 + A02(414, 2, k.AppCompatTheme_windowNoTitle));
        char c2 = hk.A01 > 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    hk = hk;
                    if (hk.getState() != EnumC0737Py.A0A) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    hk = hk;
                    hk.A01--;
                    hk.ADT(6);
                    hk.ADN(hk.A0B, 10);
                    c2 = 4;
                    break;
                case 4:
                    return true;
                case 5:
                    hk = hk;
                    hk.setVideoState(EnumC0737Py.A03);
                    hk.A0N.A0A().A2y(1);
                    hk.ADT(7);
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        HK hk = this;
        boolean z = false;
        char c2 = i != 3 ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 701) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 702) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    hk = hk;
                    if (!hk.A06()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    hk = hk;
                    hk.setVideoState(EnumC0737Py.A0A);
                    c2 = 4;
                    break;
                case 7:
                    hk = hk;
                    hk.setVideoState(EnumC0737Py.A02);
                    c2 = 4;
                    break;
                case '\b':
                    hk = hk;
                    z = true;
                    hk.A0K = true;
                    if (hk.A0E != EnumC0737Py.A0A) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    hk = hk;
                    hk.setVideoState(EnumC0737Py.A0A);
                    c2 = '\n';
                    break;
                case '\n':
                    return z;
            }
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws Throwable {
        HK hk = this;
        int i = 0;
        Activity activityA09 = null;
        MediaController mediaController = null;
        View view = null;
        int i2 = 0;
        hk.setVideoState(EnumC0737Py.A07);
        char c2 = hk.A0I ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    hk = hk;
                    if (!hk.A0H) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 3:
                    hk = hk;
                    activityA09 = hk.A0N.A09();
                    if (activityA09 == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    hk = hk;
                    activityA09 = activityA09;
                    hk.A0A = new MediaController(activityA09);
                    mediaController = hk.A0A;
                    view = hk.A09;
                    if (view != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    hk = hk;
                    view = hk;
                    c2 = 6;
                    break;
                case 6:
                    hk = hk;
                    mediaController = mediaController;
                    mediaController.setAnchorView(view);
                    hk.A0A.setMediaPlayer(hk.A0M);
                    hk.A0A.setEnabled(true);
                    c2 = 7;
                    break;
                case 7:
                    hk = hk;
                    mediaPlayer = mediaPlayer;
                    hk.setRequestedVolume(hk.A00);
                    hk.A05 = mediaPlayer.getVideoWidth();
                    hk.A04 = mediaPlayer.getVideoHeight();
                    i2 = hk.A03;
                    if (i2 <= 0) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    hk = hk;
                    i = 0;
                    if (i2 < hk.A06.getDuration()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    hk = hk;
                    i = 0;
                    hk.A03 = 0;
                    c2 = '\n';
                    break;
                case '\n':
                    hk = hk;
                    hk.A06.seekTo(hk.A03);
                    hk.A03 = i;
                    c2 = 11;
                    break;
                case 11:
                    hk = hk;
                    if (hk.A0E != EnumC0737Py.A0A) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    hk = hk;
                    hk.ADN(hk.A0B, 8);
                    c2 = '\r';
                    break;
                case '\r':
                    return;
                case 14:
                    hk = hk;
                    hk.A0A = null;
                    c2 = 7;
                    break;
            }
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        InterfaceC0738Pz interfaceC0738Pz = this.A0F;
        if (interfaceC0738Pz == null) {
            return;
        }
        interfaceC0738Pz.AAy(this.A02, this.A03);
        this.A03 = 0;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        HK hk = this;
        char c2 = hk.A08 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    hk = hk;
                    surfaceTexture = surfaceTexture;
                    hk.A08 = new Surface(surfaceTexture);
                    c2 = 3;
                    break;
                case 3:
                    hk = hk;
                    if (!hk.A08(hk.A08)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    HK hk2 = hk;
                    hk2.setVideoState(EnumC0737Py.A03);
                    hk2.A0N.A0A().A2y(4);
                    hk2.destroy();
                    return;
                case 5:
                    hk = hk;
                    hk.A0J = false;
                    if (hk.A0C != EnumC0737Py.A05) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    hk = hk;
                    if (hk.A0D == EnumC0737Py.A05) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    hk = hk;
                    hk.ADN(hk.A0B, 7);
                    c2 = '\b';
                    break;
                case '\b':
                    return;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) throws IllegalStateException {
        HK hk = this;
        boolean z = false;
        EnumC0737Py enumC0737Py = null;
        hk.A08(null);
        Surface surface = hk.A08;
        char c2 = surface != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    hk = hk;
                    surface = surface;
                    surface.release();
                    hk.A08 = null;
                    c2 = 3;
                    break;
                case 3:
                    hk = hk;
                    z = true;
                    if (!hk.A0J) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 4:
                    hk = hk;
                    if (!hk.A0I) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    enumC0737Py = EnumC0737Py.A0A;
                    c2 = 6;
                    break;
                case 6:
                    hk = hk;
                    enumC0737Py = enumC0737Py;
                    hk.A0D = enumC0737Py;
                    hk.A0J = z;
                    c2 = 7;
                    break;
                case 7:
                    hk = hk;
                    if (hk.A0C == EnumC0737Py.A05) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    hk = hk;
                    hk.ABd(false, 5);
                    c2 = '\t';
                    break;
                case '\t':
                    return z;
                case '\n':
                    hk = hk;
                    enumC0737Py = hk.A0C;
                    c2 = 6;
                    break;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        HK hk = this;
        hk.A05 = mediaPlayer.getVideoWidth();
        hk.A04 = mediaPlayer.getVideoHeight();
        char c2 = hk.A05 != 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    hk = hk;
                    if (hk.A04 == 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    hk = hk;
                    hk.requestLayout();
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) throws Throwable {
        HK hk = this;
        EnumC0737Py enumC0737Py = null;
        MediaController mediaController = null;
        super.onWindowFocusChanged(z);
        char c2 = hk.A06 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    hk = hk;
                    mediaController = hk.A0A;
                    if (mediaController == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    mediaController = mediaController;
                    if (!mediaController.isShowing()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return;
                case 6:
                    if (!z) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 7:
                    hk = hk;
                    if (!hk.A0J) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case '\b':
                    hk = hk;
                    if (!hk.A0I) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    enumC0737Py = EnumC0737Py.A0A;
                    c2 = '\n';
                    break;
                case '\n':
                    hk = hk;
                    enumC0737Py = enumC0737Py;
                    hk.A0D = enumC0737Py;
                    hk.A0J = true;
                    c2 = 11;
                    break;
                case 11:
                    hk = hk;
                    if (hk.A0C == EnumC0737Py.A05) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    hk = hk;
                    hk.A7H();
                    c2 = '\r';
                    break;
                case '\r':
                    return;
                case 14:
                    hk = hk;
                    enumC0737Py = hk.A0C;
                    c2 = '\n';
                    break;
                case 15:
                    hk = hk;
                    hk.A0J = false;
                    if (hk.A0C != EnumC0737Py.A05) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    hk = hk;
                    if (hk.A0D == EnumC0737Py.A05) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    hk = hk;
                    hk.ADN(hk.A0B, 9);
                    c2 = '\r';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public final void seekTo(int i) throws IllegalStateException {
        HK hk = this;
        char c2 = hk.A06 != null ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    hk = hk;
                    if (!hk.A05()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    hk = hk;
                    if (i >= hk.getDuration()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i <= 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    hk = hk;
                    hk.A02 = hk.getCurrentPosition();
                    hk.A03 = i;
                    hk.A06.seekTo(i);
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    hk = hk;
                    hk.A03 = i;
                    c2 = 6;
                    break;
            }
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        HK hk = this;
        char c2 = Build.VERSION.SDK_INT < 24 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    hk = hk;
                    drawable = drawable;
                    super.setBackgroundDrawable(drawable);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    if (!AdInternalSettings.isDebugBuild()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    Log.w(A0P, A02(108, 102, 85));
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.A0G = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public void setControlsAnchorView(View view) {
        this.A09 = view;
        view.setOnTouchListener(new ViewOnTouchListenerC0734Pv(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        HK hk = this;
        char c2 = Build.VERSION.SDK_INT < 24 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    hk = hk;
                    drawable = drawable;
                    super.setForeground(drawable);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    if (!AdInternalSettings.isDebugBuild()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    Log.w(A0P, A02(0, 94, k.AppCompatTheme_windowFixedWidthMajor));
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public void setFullScreen(boolean z) {
        HK hk = this;
        hk.A0I = z;
        char c2 = hk.A0I ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    hk = hk;
                    if (!hk.A0H) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    hk = hk;
                    hk.setOnTouchListener(new ViewOnTouchListenerC0733Pu(hk));
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public void setRequestedVolume(float f) {
        HK hk = this;
        hk.A00 = f;
        char c2 = hk.A06 != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    hk = hk;
                    if (hk.A0C == EnumC0737Py.A08) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    hk = hk;
                    if (hk.A0C == EnumC0737Py.A04) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    hk = hk;
                    hk.A06.setVolume(f, f);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public void setVideoMPD(@Nullable String str) {
    }

    private void setVideoState(EnumC0737Py enumC0737Py) {
        HK hk = this;
        InterfaceC0738Pz interfaceC0738Pz = null;
        char c2 = enumC0737Py != hk.A0C ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (!BuildConfigApi.isDebug()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    enumC0737Py = enumC0737Py;
                    String str = A02(210, 23, 9) + enumC0737Py;
                    c2 = 4;
                    break;
                case 4:
                    hk = hk;
                    enumC0737Py = enumC0737Py;
                    hk.A0C = enumC0737Py;
                    interfaceC0738Pz = hk.A0F;
                    if (interfaceC0738Pz == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    enumC0737Py = enumC0737Py;
                    interfaceC0738Pz = interfaceC0738Pz;
                    interfaceC0738Pz.ABS(enumC0737Py);
                    c2 = 6;
                    break;
                case 6:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    public void setVideoStateChangeListener(InterfaceC0738Pz interfaceC0738Pz) {
        this.A0F = interfaceC0738Pz;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0735Pw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setup(android.net.Uri r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HK.setup(android.net.Uri):void");
    }
}
