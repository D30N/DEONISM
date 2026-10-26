package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Qq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0755Qq extends RelativeLayout implements InterfaceC0738Pz, P6, InterfaceC0736Px {
    public int A00;
    public C0565Jd A01;
    public PA A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final Handler A08;
    public final View.OnTouchListener A09;
    public final XI A0A;
    public final C9B<C9C, C9A> A0B;
    public final List<PD> A0C;
    public final InterfaceC0735Pw A0D;
    public static final C0603Kr A0G = new C0603Kr();
    public static final C0643Mg A0E = new C0643Mg();
    public static final C0593Kf A0H = new C0593Kf();
    public static final C0591Kd A0I = new C0591Kd();
    public static final L4 A0F = new L4();
    public static final KQ A0J = new KQ();
    public static final KN A0L = new KN();
    public static final KO A0K = new KO();

    public C0755Qq(XI xi) {
        super(xi);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C9B<>();
        this.A05 = false;
        this.A06 = true;
        this.A00 = 200;
        this.A09 = new P4(this);
        this.A0A = xi;
        if (A0O(xi)) {
            this.A0D = new HN(xi);
        } else {
            this.A0D = new HK(xi);
        }
        A0F();
    }

    public C0755Qq(XI xi, AttributeSet attributeSet) {
        super(xi, attributeSet);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C9B<>();
        this.A05 = false;
        this.A06 = true;
        this.A00 = 200;
        this.A09 = new P4(this);
        this.A0A = xi;
        if (A0O(xi)) {
            this.A0D = new HN(xi, attributeSet);
        } else {
            this.A0D = new HK(xi, attributeSet);
        }
        A0F();
    }

    public C0755Qq(XI xi, AttributeSet attributeSet, int i) {
        super(xi, attributeSet, i);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C9B<>();
        this.A05 = false;
        this.A06 = true;
        this.A00 = 200;
        this.A09 = new P4(this);
        this.A0A = xi;
        if (A0O(xi)) {
            this.A0D = new HN(xi, attributeSet, i);
        } else {
            this.A0D = new HK(xi, attributeSet, i);
        }
        A0F();
    }

    private void A0F() {
        this.A0A.A0A().A2t();
        this.A0D.setRequestedVolume(1.0f);
        this.A0D.setVideoStateChangeListener(this);
        this.A02 = new PA(this.A0A, this.A0D);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
        setOnTouchListener(this.A09);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G() {
        this.A07.postDelayed(new C0759Qu(this), this.A00);
    }

    private final void A0H() {
        C0755Qq c0755Qq = this;
        PD plugin = null;
        Iterator<PD> it = c0755Qq.A0C.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    it = it;
                    plugin = it.next();
                    if (!(plugin instanceof AbstractC0653Mr)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0755Qq = c0755Qq;
                    plugin = plugin;
                    c0755Qq.A0M((AbstractC0653Mr) plugin);
                    c2 = 5;
                    break;
                case 5:
                    c0755Qq = c0755Qq;
                    plugin = plugin;
                    plugin.A7t(c0755Qq);
                    c2 = 2;
                    break;
                case 6:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(EnumC0564Jc enumC0564Jc) {
        C0565Jd c0565Jd = this.A01;
        if (c0565Jd == null) {
            return;
        }
        c0565Jd.A02(enumC0564Jc, null);
    }

    private void A0L(PD pd) {
        if (pd instanceof AbstractC0653Mr) {
            A0N((AbstractC0653Mr) pd);
        }
        pd.ADf(this);
    }

    private void A0M(AbstractC0653Mr abstractC0653Mr) {
        C0755Qq c0755Qq = this;
        char c2 = abstractC0653Mr.getParent() == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    abstractC0653Mr = abstractC0653Mr;
                    if (!(abstractC0653Mr instanceof C7W)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0755Qq = c0755Qq;
                    abstractC0653Mr = abstractC0653Mr;
                    c0755Qq.A02.A00(abstractC0653Mr);
                    c2 = 4;
                    break;
                case 4:
                    return;
                case 5:
                    c0755Qq = c0755Qq;
                    abstractC0653Mr = abstractC0653Mr;
                    c0755Qq.addView(abstractC0653Mr);
                    c2 = 4;
                    break;
            }
        }
    }

    private void A0N(AbstractC0653Mr abstractC0653Mr) {
        C0755Qq c0755Qq = this;
        char c2 = abstractC0653Mr instanceof C7W ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0755Qq = c0755Qq;
                    abstractC0653Mr = abstractC0653Mr;
                    c0755Qq.A02.A01(abstractC0653Mr);
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    abstractC0653Mr = abstractC0653Mr;
                    C0635Ly.A0M(abstractC0653Mr);
                    c2 = 3;
                    break;
            }
        }
    }

    private boolean A0O(XI xi) {
        boolean z = false;
        char c2 = HN.A08() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    xi = xi;
                    if (!JQ.A1c(xi)) {
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

    public final void A0R() {
        this.A0D.setVideoStateChangeListener(null);
        this.A0D.destroy();
    }

    public final void A0S() {
        if (A0f()) {
            return;
        }
        this.A0D.A7H();
    }

    public final void A0T() {
        C0755Qq c0755Qq = this;
        Iterator<PD> it = c0755Qq.A0C.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0755Qq = c0755Qq;
                    it = it;
                    PD plugin = it.next();
                    c0755Qq.A0L(plugin);
                    c2 = 2;
                    break;
                case 4:
                    c0755Qq.A0C.clear();
                    return;
            }
        }
    }

    public final void A0U(int i) {
        this.A07.removeCallbacksAndMessages(null);
        this.A0D.seekTo(i);
    }

    public final void A0V(int i) {
        this.A0D.ADT(i);
    }

    public final void A0W(P8 p8) {
        this.A08.post(new C0756Qr(this));
        this.A0D.ADJ(p8.A02());
    }

    public final void A0X(PC pc) {
        C0755Qq c0755Qq = this;
        char c2 = Build.VERSION.SDK_INT >= 18 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0755Qq = c0755Qq;
                    pc = pc;
                    c0755Qq.getView().getViewTreeObserver().addOnWindowFocusChangeListener(new P5(c0755Qq, pc));
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c0755Qq = c0755Qq;
                    pc = pc;
                    c0755Qq.A0Y(pc, 5);
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A0Y(PC pc, int i) {
        C0755Qq c0755Qq = this;
        char c2 = c0755Qq.A03 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0755Qq = c0755Qq;
                    if (c0755Qq.A0D.getState() != EnumC0737Py.A06) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0755Qq = c0755Qq;
                    c0755Qq.A03 = false;
                    c2 = 4;
                    break;
                case 4:
                    c0755Qq.A0D.ADN(pc, i);
                    return;
            }
        }
    }

    public final void A0Z(PD pd) {
        this.A0C.add(pd);
    }

    public final void A0a(PD pd) {
        this.A0C.remove(pd);
        A0L(pd);
    }

    public final void A0b(boolean z, int i) {
        if (A0f()) {
            return;
        }
        this.A0D.ABd(z, i);
        this.A05 = z;
    }

    public final void A0c(boolean z, boolean z2, int i) {
        this.A06 = z2;
        A0b(z, i);
    }

    public final boolean A0d() {
        return this.A0D.A7O();
    }

    public final boolean A0e() {
        boolean z = false;
        char c2 = getVolume() == 0.0f ? (char) 2 : (char) 4;
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

    public final boolean A0f() {
        boolean z = false;
        char c2 = getState() == EnumC0737Py.A05 ? (char) 2 : (char) 4;
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

    public final boolean A0g() {
        C0755Qq c0755Qq = this;
        boolean z = false;
        char c2 = c0755Qq.A0f() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    c0755Qq = c0755Qq;
                    if (!c0755Qq.A05) {
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

    public final boolean A0h() {
        boolean z = false;
        char c2 = getState() == EnumC0737Py.A0A ? (char) 2 : (char) 4;
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

    public final boolean A0i() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.P6
    public final boolean A7e() {
        return A0O(this.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.P6
    public final boolean A7g() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0738Pz
    public final void AAy(int i, int i2) {
        this.A08.post(new C0757Qs(this, i, i2));
        A0G();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0738Pz
    public final void ABS(EnumC0737Py enumC0737Py) {
        int currentPositionInMillis = getCurrentPositionInMillis();
        this.A08.post(new C0758Qt(this, enumC0737Py, getDuration(), currentPositionInMillis));
    }

    @Override // com.facebook.ads.redexgen.X.P6
    public int getCurrentPositionInMillis() {
        return this.A0D.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0D.getDuration();
    }

    @NonNull
    public C9B<C9C, C9A> getEventBus() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.P6
    public long getInitialBufferTime() {
        return this.A0D.getInitialBufferTime();
    }

    public EnumC0737Py getState() {
        return this.A0D.getState();
    }

    public Handler getStateHandler() {
        return this.A08;
    }

    public TextureView getTextureView() {
        return (TextureView) this.A0D;
    }

    public int getVideoHeight() {
        return this.A0D.getVideoHeight();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.P6
    public PC getVideoStartReason() {
        return this.A0D.getStartReason();
    }

    public View getVideoView() {
        return this.A02;
    }

    public int getVideoWidth() {
        return this.A0D.getVideoWidth();
    }

    @Override // com.facebook.ads.redexgen.X.P6
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.P6
    public float getVolume() {
        return this.A0D.getVolume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.A0B.A02(A0K);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.A0B.A02(A0L);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        InterfaceC0735Pw interfaceC0735Pw = this.A0D;
        if (interfaceC0735Pw != null) {
            interfaceC0735Pw.setControlsAnchorView(view);
        }
    }

    public void setFunnelLoggingHandler(C0565Jd c0565Jd) {
        this.A01 = c0565Jd;
    }

    public void setIsFullScreen(boolean z) {
        this.A04 = z;
        this.A0D.setFullScreen(z);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(@Nullable String str) {
        this.A0D.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i) {
        this.A00 = i;
    }

    public void setVideoURI(@Nullable Uri uri) {
        C0755Qq c0755Qq = this;
        char c2 = uri == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0755Qq = c0755Qq;
                    c0755Qq.A0T();
                    c2 = 3;
                    break;
                case 3:
                    c0755Qq.A03 = false;
                    return;
                case 4:
                    c0755Qq = c0755Qq;
                    uri = uri;
                    c0755Qq.A0H();
                    c0755Qq.A0D.setup(uri);
                    c2 = 3;
                    break;
            }
        }
    }

    public void setVideoURI(@Nullable String str) {
        Uri uri = null;
        this.A0A.A0A().A30(str);
        char c2 = str != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    uri = Uri.parse(str);
                    c2 = 3;
                    break;
                case 3:
                    setVideoURI(uri);
                    return;
                case 4:
                    uri = null;
                    c2 = 3;
                    break;
            }
        }
    }

    public void setVolume(float f) {
        C0755Qq c0755Qq = this;
        char c2 = f == 1.0f ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0755Qq = c0755Qq;
                    c0755Qq.A0I(EnumC0564Jc.A0a);
                    c0755Qq.A0A.A0A().A34();
                    c2 = 3;
                    break;
                case 3:
                    C0755Qq c0755Qq2 = c0755Qq;
                    c0755Qq2.A0D.setRequestedVolume(f);
                    c0755Qq2.getEventBus().A02(A0J);
                    return;
                case 4:
                    c0755Qq = c0755Qq;
                    c0755Qq.A0I(EnumC0564Jc.A0Z);
                    c0755Qq.A0A.A0A().A33();
                    c2 = 3;
                    break;
            }
        }
    }
}
