package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public class PS extends TextView {
    public final Paint A00;
    public final Paint A01;
    public final RectF A02;

    public PS(XI xi) {
        super(xi);
        DisplayMetrics displayMetrics = xi.getResources().getDisplayMetrics();
        C0635Ly.A0P(this, 0);
        setTextColor(-3355444);
        setPadding((int) (displayMetrics.density * 9.0f), (int) (displayMetrics.density * 5.0f), (int) (displayMetrics.density * 9.0f), (int) (displayMetrics.density * 5.0f));
        setTextSize(18.0f);
        this.A01 = new Paint();
        this.A01.setStyle(Paint.Style.STROKE);
        this.A01.setColor(-10066330);
        this.A01.setStrokeWidth(1.0f);
        this.A01.setAntiAlias(true);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        this.A00.setColor(-1895825408);
        this.A02 = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (getText().length() == 0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        this.A02.set(0, 0, width, height);
        canvas.drawRoundRect(this.A02, 6.0f, 6.0f, this.A00);
        int bottom = 0 + 2;
        float f = bottom;
        int bottom2 = 0 + 2;
        float f2 = bottom2;
        int bottom3 = width - 2;
        float f3 = bottom3;
        int bottom4 = height - 2;
        this.A02.set(f, f2, f3, bottom4);
        canvas.drawRoundRect(this.A02, 6.0f, 6.0f, this.A01);
        super.onDraw(canvas);
    }
}
