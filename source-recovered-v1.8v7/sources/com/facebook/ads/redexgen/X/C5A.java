package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.VideoAutoplayBehavior;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5A, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5A implements MediaViewVideoRendererApi {
    public static byte[] A0G;
    public static final String A0H;
    public MediaViewVideoRenderer A00;
    public VideoAutoplayBehavior A01;
    public XI A03;

    @Nullable
    public InterfaceC0576Jo A04;
    public C03409p A05;
    public boolean A06;
    public boolean A07;

    @Nullable
    public NativeAd A08;
    public final AbstractC0602Kp A0D = new C0448Em(this);
    public final AbstractC0604Ks A0C = new C0447El(this);
    public final LM A0B = new C0446Ek(this);
    public final AbstractC0594Kh A0E = new C0445Ej(this);
    public final AbstractC0644Mh A09 = new Ei(this);
    public final KP A0F = new C0441Ed(this);
    public final AbstractC0633Lw A0A = new C0440Ec(this);
    public AnonymousClass52 A02 = new AnonymousClass52();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 107);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A0G = new byte[]{-7, 30, 38, 17, 28, 25, 20, -48, 6, 25, 21, 39, -48, 19, 31, 30, 35, 36, 34, 37, 19, 36, 31, 34, -48, 32, 17, 34, 17, 29, 35, -48, 36, 41, 32, 21, -34, 49, 54, 64, 50, 59, 52, 46, 52, 50, 32, 50, 50, 56, -19, 48, 46, 57, 57, 50, 49, -19, 68, 54, 65, 53, 60, 66, 65, -19, 50, 59, 52, 46, 52, 50, 32, 50, 50, 56, -5, -56, -38, -38, -32, -34, -29, -36, -107, -30, -22, -24, -23, -107, -41, -38, -107, -27, -25, -38, -40, -38, -39, -38, -39, -107, -41, -18, -107, -42, -107, -40, -42, -31, -31, -107, -23, -28, -107, -38, -29, -36, -42, -36, -38, -56, -38, -38, -32, -95, -107, -42, -29, -39, -107, -37, -28, -31, -31, -28, -20, -38, -39, -107, -41, -18, -107, -42, -107, -40, -42, -31, -31, -107, -23, -28, -107, -39, -34, -24, -38, -29, -36, -42, -36, -38, -56, -38, -38, -32, -93, 49, 58, 51, 45, 51, 49, 31, 49, 49, 55, -20, 47, 45, 56, 56, 49, 48, -20, 67, 53, 64, 52, 59, 65, 64, -20, 48, 53, 63, 49, 58, 51, 45, 51, 49, 31, 49, 49, 55, -6};
    }

    static {
        A02();
        A0H = MediaViewVideoRenderer.class.getSimpleName();
    }

    public final void A03() {
        C5A c5a = this;
        InterfaceC0576Jo interfaceC0576Jo = null;
        c5a.A00.pause(false);
        c5a.A05.setClientToken(null);
        c5a.A05.setVideoMPD(null);
        c5a.A05.setVideoURI((Uri) null);
        c5a.A05.setVideoCTA(null);
        c5a.A05.setNativeAd(null);
        c5a.A01 = VideoAutoplayBehavior.DEFAULT;
        NativeAd nativeAd = c5a.A08;
        char c2 = nativeAd != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    nativeAd = nativeAd;
                    C1141cR.A0J(nativeAd.getInternalNativeAd()).A1T(false, false);
                    c2 = 3;
                    break;
                case 3:
                    c5a = c5a;
                    c5a.A08 = null;
                    interfaceC0576Jo = c5a.A04;
                    if (interfaceC0576Jo == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    interfaceC0576Jo = interfaceC0576Jo;
                    interfaceC0576Jo.ADh();
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    public final void A04(NativeAd nativeAd) {
        C5A c5a = this;
        InterfaceC0576Jo interfaceC0576Jo = null;
        c5a.A08 = nativeAd;
        c5a.A03.A0D(((C1141cR) nativeAd.getInternalNativeAd()).A0w());
        C5B c5b = (C5B) nativeAd.getNativeAdApi();
        c5a.A05.setClientToken(C1141cR.A0J(nativeAd.getInternalNativeAd()).A14());
        c5a.A05.setVideoMPD(c5b.A01());
        c5a.A05.setVideoURI(c5b.A02());
        C0770Rf c0770RfA0u = C1141cR.A0J(nativeAd.getInternalNativeAd()).A0u();
        char c2 = c0770RfA0u != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c5a = c5a;
                    c0770RfA0u = c0770RfA0u;
                    c5a.A05.setVideoProgressReportIntervalMs(c0770RfA0u.A0E());
                    c2 = 3;
                    break;
                case 3:
                    c5a = c5a;
                    nativeAd = nativeAd;
                    c5b = c5b;
                    c5a.A05.setVideoCTA(nativeAd.getAdCallToAction());
                    c5a.A05.setNativeAd(nativeAd);
                    c5a.A01 = c5b.getVideoAutoplayBehavior();
                    interfaceC0576Jo = c5a.A04;
                    if (interfaceC0576Jo == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    nativeAd = nativeAd;
                    interfaceC0576Jo = interfaceC0576Jo;
                    interfaceC0576Jo.AD7(nativeAd);
                    c2 = 5;
                    break;
                case 5:
                    return;
            }
        }
    }

    public final void A05(JW jw) {
        this.A05.setAdEventManager(jw);
    }

    public final void A06(@Nullable InterfaceC0576Jo interfaceC0576Jo) {
        this.A04 = interfaceC0576Jo;
    }

    public final void A07(@Nullable MY my) {
        this.A05.setListener(my);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void destroy() {
        this.A05.A0R();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void disengageSeek(VideoStartReason videoStartReason) {
        C5A c5a = this;
        char c2 = !c5a.A06 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    Log.w(A0H, A01(37, 40, 98));
                    return;
                case 3:
                    c5a = c5a;
                    c5a.A06 = false;
                    if (!c5a.A07) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c5a = c5a;
                    videoStartReason = videoStartReason;
                    c5a.A05.A0Y(PC.A00(videoStartReason), 3);
                    c2 = 5;
                    break;
                case 5:
                    c5a.A00.onSeekDisengaged();
                    return;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void engageSeek() {
        if (this.A06) {
            Log.w(A0H, A01(167, 40, 97));
            return;
        }
        this.A06 = true;
        this.A07 = EnumC0737Py.A0A.equals(this.A05.getState());
        this.A05.A0b(false, 1);
        this.A00.onSeekEngaged();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    @IntRange(from = 0)
    public final int getCurrentTimeMs() {
        return this.A05.getCurrentPositionInMillis();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    @IntRange(from = 0)
    public final int getDuration() {
        return this.A05.getDuration();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final View getVideoView() {
        return this.A05.getVideoView();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getVolume() {
        return this.A05.getVolume();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaViewVideoRenderer mediaViewVideoRenderer) {
        C5A c5a = this;
        int i = 0;
        int i2 = 0;
        int initializationType = 0;
        int i3 = 0;
        XI xiA02 = null;
        c5a.A00 = mediaViewVideoRenderer;
        Context context = adViewConstructorParams.getContext();
        char c2 = context instanceof XI ? (char) 2 : '\f';
        while (true) {
            switch (c2) {
                case 2:
                    context = context;
                    xiA02 = (XI) context;
                    c2 = 3;
                    break;
                case 3:
                    c5a = c5a;
                    adViewConstructorParams = adViewConstructorParams;
                    xiA02 = xiA02;
                    c5a.A03 = xiA02;
                    initializationType = adViewConstructorParams.getInitializationType();
                    i = 3;
                    i2 = 2;
                    i3 = 1;
                    if (initializationType == 0) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (initializationType == i3) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (initializationType == i2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (initializationType != i) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c5a = c5a;
                    adViewConstructorParams = adViewConstructorParams;
                    xiA02 = xiA02;
                    c5a.A05 = new C03409p(xiA02, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleRes());
                    c2 = '\b';
                    break;
                case '\b':
                    C5A c5a2 = c5a;
                    c5a2.A05.setEnableBackgroundVideo(mediaViewVideoRenderer.shouldAllowBackgroundPlayback());
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    c5a2.A05.setLayoutParams(layoutParams);
                    c5a2.A02.addView(c5a2.A05, -1, layoutParams);
                    LW.A04(c5a2.A05, LW.A0A);
                    C9B<C9C, C9A> eventBus = c5a2.A05.getEventBus();
                    C9C[] c9cArr = new C9C[7];
                    c9cArr[0] = c5a2.A0D;
                    c9cArr[i3] = c5a2.A0C;
                    c9cArr[i2] = c5a2.A0B;
                    c9cArr[i] = c5a2.A0E;
                    c9cArr[4] = c5a2.A09;
                    c9cArr[5] = c5a2.A0F;
                    c9cArr[6] = c5a2.A0A;
                    eventBus.A03(c9cArr);
                    return;
                case '\t':
                    c5a = c5a;
                    adViewConstructorParams = adViewConstructorParams;
                    xiA02 = xiA02;
                    c5a.A05 = new C03409p(xiA02, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr());
                    c2 = '\b';
                    break;
                case '\n':
                    c5a = c5a;
                    adViewConstructorParams = adViewConstructorParams;
                    xiA02 = xiA02;
                    c5a.A05 = new C03409p(xiA02, adViewConstructorParams.getAttributeSet());
                    c2 = '\b';
                    break;
                case 11:
                    c5a = c5a;
                    xiA02 = xiA02;
                    c5a.A05 = new C03409p(xiA02);
                    c2 = '\b';
                    break;
                case '\f':
                    context = context;
                    xiA02 = AnonymousClass53.A02(context);
                    c2 = 3;
                    break;
                case '\r':
                    throw new IllegalArgumentException(A01(0, 37, 69));
            }
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void pause(boolean z) {
        this.A05.A0b(z, 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void play(VideoStartReason videoStartReason) {
        this.A05.A0Y(PC.A00(videoStartReason), 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void seekTo(@IntRange(from = 0) int i) {
        if (!this.A06) {
            Log.w(A0H, A01(77, 90, 10));
        } else {
            this.A05.A0U(i);
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void setVolume(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.A05.setVolume(f);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final boolean shouldAutoplay() {
        C5A c5a = this;
        C03409p c03409p = c5a.A05;
        boolean z = false;
        char c2 = c03409p != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c03409p = c03409p;
                    if (c03409p.getState() != EnumC0737Py.A06) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return false;
                case 4:
                    c5a = c5a;
                    if (c5a.A01 == VideoAutoplayBehavior.ON) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c5a = c5a;
                    if (c5a.A01 != VideoAutoplayBehavior.DEFAULT) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    z = true;
                    c2 = 7;
                    break;
                case 7:
                    return z;
            }
        }
    }
}
