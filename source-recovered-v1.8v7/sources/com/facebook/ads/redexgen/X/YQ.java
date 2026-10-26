package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class YQ extends O8 {
    public RelativeLayout A00;
    public C0648Ml A01;
    public OM A02;
    public C0804Sp A03;
    public C0701On A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Path A09;
    public final RectF A0A;
    public final XI A0B;
    public final AbstractC0644Mh A0C;
    public final LM A0D;
    public final AbstractC0604Ks A0E;
    public final AbstractC0602Kp A0F;
    public final KP A0G;
    public final String A0H;
    public static final int A0J = (int) (C0635Ly.A01 * 1.0f);
    public static final int A0K = (int) (C0635Ly.A01 * 4.0f);
    public static final int A0I = (int) (C0635Ly.A01 * 6.0f);

    public abstract void A0h(XI xi);

    public YQ(OC oc, boolean z, String str, C0804Sp c0804Sp) {
        super(oc, z);
        this.A09 = new Path();
        this.A0A = new RectF();
        this.A0G = new KP() { // from class: com.facebook.ads.redexgen.X.9b
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(KQ kq) {
                this.A00.A03.A0Y().setVolume(this.A00.getVideoView().getVolume());
            }
        };
        this.A0C = new AbstractC0644Mh() { // from class: com.facebook.ads.redexgen.X.9Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C02987x c02987x) {
                this.A00.A03.A0W().ABJ(((Integer) this.A00.getTag(-1593835536)).intValue());
            }
        };
        this.A0E = new AbstractC0604Ks() { // from class: com.facebook.ads.redexgen.X.9S
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(L4 l4) {
                this.A00.A03.A0X().ABQ(this.A00);
            }
        };
        this.A0D = new LM() { // from class: com.facebook.ads.redexgen.X.9N
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C02977v c02977v) {
                this.A00.A03.A0X().ABP(this.A00);
            }
        };
        this.A0F = new AbstractC0602Kp() { // from class: com.facebook.ads.redexgen.X.99
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0603Kr c0603Kr) {
                this.A00.A07 = true;
                this.A00.A01();
            }
        };
        this.A03 = c0804Sp;
        this.A0H = str;
        this.A0B = oc.A05();
        setGravity(17);
        int i = A0J;
        setPadding(i, 0, i, i);
        C0635Ly.A0P(this, 0);
        setUpView(this.A0B);
        this.A08 = new Paint();
        this.A08.setColor(-16777216);
        this.A08.setStyle(Paint.Style.FILL);
        this.A08.setAlpha(16);
        this.A08.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        YQ yq = this;
        char c2 = yq.A02 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    yq = yq;
                    if (!yq.A0k()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    yq = yq;
                    if (!yq.A07) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 5:
                    yq = yq;
                    if (!yq.A0k()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 6:
                    yq = yq;
                    if (!yq.A06) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    yq = yq;
                    yq.A02.A8u();
                    c2 = '\b';
                    break;
                case '\b':
                    return;
            }
        }
    }

    private void A02(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        C0635Ly.A0N(view);
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public boolean A0M() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.O8
    public final boolean A0c() {
        return false;
    }

    public final void A0e() {
        if (A0k()) {
            this.A04.A01();
        }
    }

    public final void A0f() {
        if (A0k()) {
            A0g();
            this.A04.A05(PC.A03);
        }
    }

    public final void A0g() {
        YQ yq = this;
        float volume = yq.A03.A0Y().getVolume();
        char c2 = yq.A0k() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    yq = yq;
                    if (volume == yq.A04.getVolume()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    yq = yq;
                    yq.A04.setVolume(volume);
                    c2 = 4;
                    break;
                case 4:
                    return;
            }
        }
    }

    public final void A0i(Map<String, String> map) {
        this.A04.A02();
        if (A0k()) {
            this.A04.A04(getAdEventManager(), this.A0H, map);
        }
    }

    public final boolean A0j() {
        YQ yq = this;
        boolean z = false;
        char c2 = yq.A0k() ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    yq = yq;
                    if (!yq.A04.A06()) {
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

    public final boolean A0k() {
        return this.A05;
    }

    public final RelativeLayout getMediaContainer() {
        return this.A00;
    }

    public final C0701On getVideoView() {
        return this.A04;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A09.reset();
        this.A0A.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.A09;
        RectF rectF = this.A0A;
        int i = A0I;
        path.addRoundRect(rectF, i, i, Path.Direction.CW);
        canvas.drawPath(this.A09, this.A08);
        this.A0A.set(A0J, 0.0f, getWidth() - A0J, getHeight() - A0J);
        Path path2 = this.A09;
        RectF rectF2 = this.A0A;
        int i2 = A0K;
        path2.addRoundRect(rectF2, i2, i2, Path.Direction.CW);
        canvas.clipPath(this.A09);
        super.onDraw(canvas);
    }

    public void setAdTitleAndDescription(String str, String str2) {
        getTitleDescContainer().A01(str, str2, null, true, false);
    }

    public void setCTAInfo(C1J c1j, Map<String, String> map) {
        getCtaButton().setCta(c1j, this.A0H, map);
    }

    public void setImageUrl(String str) {
        this.A01.setVisibility(0);
        this.A04.setVisibility(8);
        new AsyncTaskC1002aA(this.A01, this.A0B).A04().A06(new YX(this)).A07(str);
    }

    public void setIsVideo(boolean z) {
        this.A05 = z;
    }

    public void setOnAssetsLoadedListener(OM om) {
        this.A02 = om;
    }

    public void setUpImageView(XI xi) {
        this.A01 = new C0648Ml(xi);
        A02(this.A01);
    }

    public void setUpMediaContainer(XI xi) {
        this.A00 = new RelativeLayout(xi);
        A02(this.A00);
    }

    public void setUpVideoView(XI xi) {
        this.A04 = new C0701On(xi, new C0565Jd(this.A0H, getAdEventManager()));
        A02(this.A04);
    }

    private void setUpView(XI xi) {
        setUpImageView(xi);
        setUpVideoView(xi);
        setUpMediaContainer(xi);
        this.A00.addView(this.A01);
        this.A00.addView(this.A04);
        A0h(xi);
    }

    public void setVideoPlaceholderUrl(String str) {
        this.A04.setPlaceholderUrl(str);
    }

    public void setVideoUrl(String str) {
        this.A01.setVisibility(8);
        this.A04.setVisibility(0);
        this.A04.setVideoURI(str);
        this.A04.A03(this.A0G);
        this.A04.A03(this.A0C);
        this.A04.A03(this.A0E);
        this.A04.A03(this.A0D);
        this.A04.A03(this.A0F);
    }
}
