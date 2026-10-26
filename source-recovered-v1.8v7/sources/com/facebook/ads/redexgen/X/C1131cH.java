package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.cH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1131cH extends AnonymousClass52 implements DefaultMediaViewVideoRendererApi {
    public static byte[] A0F;
    public static final String A0G;
    public MediaViewVideoRenderer A00;
    public XI A01;

    @Nullable
    public InterfaceC0574Jm A02;

    @Nullable
    public C03409p A04;
    public C7W A05;
    public C7O A06;

    @DoNotStrip
    public Q0 A07;
    public Q1 A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final P9 A0C = new C1125cB(this);
    public final AtomicBoolean A0D = new AtomicBoolean(false);
    public final AtomicBoolean A0E = new AtomicBoolean(false);
    public EnumC0585Jx A03 = EnumC0585Jx.A02;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 4);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0E() {
        A0F = new byte[]{-66, -42, -43, -38, -46, -57, -38, -42, -24, -57, -38, -43, -42, -32, -111, -38, -28, -111, -33, -26, -35, -35, -84, -111, -26, -33, -46, -45, -35, -42, -111, -27, -32, -111, -41, -38, -33, -43, -111, -38, -27, -97, 80, 117, 125, 104, 115, 112, 107, 39, 121, 108, 117, 107, 108, 121, 108, 121, 39, 106, 111, 112, 115, 107, 39, 106, 118, 117, 109, 112, 110, 53, 108, -123, 120, 121, -125, 124, 55, -117, -122, 55, 125, Byte.MIN_VALUE, -123, 123, 55, 100, 124, 123, Byte.MIN_VALUE, 120, 109, Byte.MIN_VALUE, 124, -114, 109, Byte.MIN_VALUE, 123, 124, -122, 55, 122, Byte.MAX_VALUE, Byte.MIN_VALUE, -125, 123, 69};
    }

    static {
        A0E();
        A0G = C1131cH.class.getSimpleName();
    }

    private InterfaceC0576Jo A01(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new C1126cC(this, mediaViewVideoRendererApi);
    }

    private InterfaceC0576Jo A02(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new C1127cD(this, mediaViewVideoRendererApi);
    }

    private Q0 A04() {
        return new C1129cF(this);
    }

    private Q1 A05() {
        return new Q1(this.A00, 50, true, new WeakReference(this.A07), this.A01);
    }

    private void A09() {
        C03409p c03409p = this.A04;
        if (c03409p != null) {
            ((PA) c03409p.getVideoView()).setViewImplInflationListener(this.A0C);
        }
    }

    private void A0A() {
        C03409p c03409p = this.A04;
        if (c03409p != null) {
            c03409p.getVideoView().setOnTouchListener(new ViewOnTouchListenerC0573Jl(this));
        }
    }

    private void A0B() {
        C03409p c03409p = this.A04;
        if (c03409p != null) {
            ((PA) c03409p.getVideoView()).setViewImplInflationListener(null);
        }
    }

    private void A0C() {
        C1131cH c1131cH = this;
        C03409p c03409p = null;
        char c2 = c1131cH.A00.getVisibility() == 0 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c1131cH = c1131cH;
                    if (!c1131cH.A09) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1131cH = c1131cH;
                    if (!c1131cH.A00.hasWindowFocus()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1131cH = c1131cH;
                    c1131cH.A08.A0V();
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c1131cH = c1131cH;
                    c03409p = c1131cH.A04;
                    if (c03409p == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c03409p = c03409p;
                    if (c03409p.getState() != EnumC0737Py.A05) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c1131cH = c1131cH;
                    c1131cH.A0B = true;
                    c2 = '\t';
                    break;
                case '\t':
                    c1131cH = c1131cH;
                    c1131cH.A08.A0W();
                    c2 = 5;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A03 = EnumC0585Jx.A02;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(C1141cR c1141cR, @Nullable InterfaceC0574Jm interfaceC0574Jm) {
        String url = null;
        this.A0A = false;
        this.A0B = false;
        this.A02 = interfaceC0574Jm;
        A09();
        C7W c7w = this.A05;
        char c2 = c1141cR != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c1141cR = c1141cR;
                    if (c1141cR.getAdCoverImage() == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1141cR = c1141cR;
                    url = c1141cR.getAdCoverImage().getUrl();
                    c2 = 4;
                    break;
                case 4:
                    C1131cH c1131cH = this;
                    C1141cR c1141cR2 = c1141cR;
                    c7w.setImage(url, new C1128cE(c1131cH));
                    c1131cH.A03 = c1141cR2.A13();
                    c1131cH.A06.setPlayAccessibilityLabel(c1141cR2.A17());
                    c1131cH.A06.setPauseAccessibilityLabel(c1141cR2.A16());
                    c1131cH.A08.A0V();
                    return;
                case 5:
                    url = null;
                    c2 = 4;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(PC pc) {
        C03409p c03409p = this.A04;
        char c2 = c03409p != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    pc = pc;
                    c03409p = c03409p;
                    c03409p.A0Y(pc, 24);
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
                    Log.e(A0G, A06(0, 42, 109));
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0K() {
        C1131cH c1131cH = this;
        C03409p c03409p = c1131cH.A04;
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
                    c1131cH = c1131cH;
                    if (c1131cH.A03 == EnumC0585Jx.A04) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1131cH = c1131cH;
                    if (c1131cH.A03 != EnumC0585Jx.A02) {
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

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void initialize(Context context, MediaViewVideoRenderer mediaViewVideoRenderer, MediaViewVideoRendererApi mediaViewVideoRendererApi, int i) {
        C1131cH c1131cH = this;
        C03409p c03409p = null;
        int i2 = 0;
        int i3 = 0;
        InterfaceC0576Jo interfaceC0576JoA02 = null;
        View childAt = null;
        ((AnonymousClass52) mediaViewVideoRendererApi.getAdComponentViewApi()).A00(c1131cH);
        char c2 = i != 0 ? (char) 2 : (char) 14;
        while (true) {
            switch (c2) {
                case 2:
                    if (i != 1) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1131cH = c1131cH;
                    mediaViewVideoRendererApi = mediaViewVideoRendererApi;
                    interfaceC0576JoA02 = c1131cH.A01(mediaViewVideoRendererApi);
                    c2 = 4;
                    break;
                case 4:
                    c1131cH = c1131cH;
                    context = context;
                    mediaViewVideoRenderer = mediaViewVideoRenderer;
                    mediaViewVideoRendererApi = mediaViewVideoRendererApi;
                    interfaceC0576JoA02 = interfaceC0576JoA02;
                    ((C5A) mediaViewVideoRendererApi).A06(interfaceC0576JoA02);
                    c1131cH.A01 = AnonymousClass53.A02(context);
                    c1131cH.A00 = mediaViewVideoRenderer;
                    c1131cH.A05 = new C7W(c1131cH.A01);
                    c1131cH.A07 = c1131cH.A04();
                    c1131cH.A08 = c1131cH.A05();
                    float f = C0635Ly.A01;
                    int i4 = (int) (2.0f * f);
                    int i5 = (int) (25.0f * f);
                    c1131cH.A06 = new C7O(c1131cH.A01);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(9);
                    layoutParams.addRule(12);
                    c1131cH.A06.setPadding(i4, i5, i5, i4);
                    c1131cH.A06.setLayoutParams(layoutParams);
                    i2 = 0;
                    c2 = 5;
                    break;
                case 5:
                    c1131cH = c1131cH;
                    i3 = 0;
                    if (i2 >= c1131cH.A00.getChildCount()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c1131cH = c1131cH;
                    i3 = 0;
                    childAt = c1131cH.A00.getChildAt(0);
                    if (!(childAt instanceof C03409p)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c1131cH = c1131cH;
                    childAt = childAt;
                    c1131cH.A04 = (C03409p) childAt;
                    c2 = '\b';
                    break;
                case '\b':
                    c1131cH = c1131cH;
                    c03409p = c1131cH.A04;
                    if (c03409p != null) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (!AdInternalSettings.isDebugBuild()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    Log.e(A0G, A06(72, 36, 19));
                    c2 = 11;
                    break;
                case 11:
                    C1131cH c1131cH2 = c1131cH;
                    c1131cH2.A08.A0X(i3);
                    c1131cH2.A08.A0Y(250);
                    interfaceC0576JoA02.AD4();
                    return;
                case '\f':
                    c1131cH = c1131cH;
                    c03409p = c03409p;
                    c03409p.A0Z(c1131cH.A05);
                    c1131cH.A04.A0Z(c1131cH.A06);
                    c2 = 11;
                    break;
                case '\r':
                    i2++;
                    c2 = 5;
                    break;
                case 14:
                    c1131cH = c1131cH;
                    mediaViewVideoRendererApi = mediaViewVideoRendererApi;
                    interfaceC0576JoA02 = c1131cH.A02(mediaViewVideoRendererApi);
                    c2 = 4;
                    break;
                case 15:
                    throw new IllegalArgumentException(A06(42, 30, 3));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass52, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09 = true;
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass52, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09 = false;
        A0C();
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void onPrepared() {
        this.A00.setOnTouchListener(new ViewOnTouchListenerC0572Jk(this));
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass52, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass52, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A0C();
    }
}
