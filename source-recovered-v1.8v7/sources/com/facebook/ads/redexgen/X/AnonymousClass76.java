package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.76, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass76 extends AbstractC0653Mr {
    public final Paint A00;
    public final XI A01;

    @Nullable
    public final C0565Jd A02;
    public final AbstractC0644Mh A03;
    public final LM A04;
    public final AbstractC0604Ks A05;
    public final PW A06;

    public AnonymousClass76(XI xi, @Nullable C0565Jd c0565Jd) {
        this(xi, false, c0565Jd);
    }

    public AnonymousClass76(XI xi, boolean z, @Nullable C0565Jd c0565Jd) {
        super(xi);
        this.A04 = new LM() { // from class: com.facebook.ads.redexgen.X.7K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C02977v c02977v) {
                this.A00.A06.setChecked(true);
            }
        };
        this.A05 = new AbstractC0604Ks() { // from class: com.facebook.ads.redexgen.X.7J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(L4 l4) {
                this.A00.A06.setChecked(false);
            }
        };
        this.A03 = new AbstractC0644Mh() { // from class: com.facebook.ads.redexgen.X.7I
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9C
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C02987x c02987x) {
                this.A00.A06.setChecked(true);
            }
        };
        this.A02 = c0565Jd;
        this.A01 = xi;
        this.A06 = new PW(xi, z);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 23.76d), (int) (displayMetrics.density * 23.76d));
        layoutParams.addRule(13);
        this.A06.setLayoutParams(layoutParams);
        this.A06.setChecked(true);
        this.A06.setClickable(false);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        if (z) {
            this.A00.setColor(-1728053248);
        } else {
            this.A00.setColor(-1);
            this.A00.setAlpha(204);
        }
        C0635Ly.A0P(this, 0);
        addView(this.A06);
        setGravity(17);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 72.0d), (int) (displayMetrics.density * 72.0d));
        layoutParams2.addRule(13);
        setLayoutParams(layoutParams2);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0653Mr
    public final void A09() {
        super.A09();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A04, this.A05, this.A03);
        }
        setOnClickListener(new PT(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0653Mr
    public final void A0A() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A03, this.A05, this.A04);
        }
        super.A0A();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int centerX = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        canvas.drawCircle(getPaddingLeft() + r4, getPaddingTop() + (centerX / 2), centerX / 2, this.A00);
        super.onDraw(canvas);
    }
}
