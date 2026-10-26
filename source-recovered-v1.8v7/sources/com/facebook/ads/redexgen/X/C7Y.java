package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.7Y, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7Y extends AbstractC0653Mr {
    public final Paint A00;
    public final RectF A01;
    public final TextView A02;
    public final XI A03;
    public final JW A04;
    public final String A05;
    public final String A06;

    public C7Y(XI xi, String str, JW jw, String str2, String str3) {
        super(xi);
        this.A03 = xi;
        this.A06 = str;
        this.A04 = jw;
        this.A05 = str2;
        DisplayMetrics displayMetrics = xi.getResources().getDisplayMetrics();
        this.A02 = new TextView(getContext());
        this.A02.setTextColor(-3355444);
        this.A02.setTextSize(16.0f);
        this.A02.setPadding((int) (displayMetrics.density * 6.0f), (int) (displayMetrics.density * 4.0f), (int) (displayMetrics.density * 6.0f), (int) (displayMetrics.density * 4.0f));
        C0635Ly.A0J(AdError.NO_FILL_ERROR_CODE, this.A02);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        this.A00.setColor(-16777216);
        this.A00.setAlpha(178);
        this.A01 = new RectF();
        C0635Ly.A0P(this, 0);
        this.A02.setText(str3);
        addView(this.A02, new RelativeLayout.LayoutParams(-2, -2));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0653Mr
    public final void A09() {
        super.A09();
        this.A02.setOnClickListener(new PP(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0653Mr
    public final void A0A() {
        this.A02.setOnClickListener(null);
        super.A0A();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A01.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(this.A01, 0.0f, 0.0f, this.A00);
        super.onDraw(canvas);
    }
}
