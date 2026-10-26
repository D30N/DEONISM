package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class MT extends View {
    public int A00;
    public Paint A01;
    public Paint A02;
    public Paint A03;
    public boolean A04;

    public MT(XI xi) {
        this(xi, 60, true);
    }

    public MT(XI xi, int i, boolean z) {
        super(xi);
        this.A00 = i;
        this.A04 = z;
        if (z) {
            this.A02 = new Paint();
            this.A02.setColor(-3355444);
            this.A02.setStyle(Paint.Style.STROKE);
            this.A02.setStrokeWidth(3.0f);
            this.A02.setAntiAlias(true);
            this.A01 = new Paint();
            this.A01.setColor(-1287371708);
            this.A01.setStyle(Paint.Style.FILL);
            this.A01.setAntiAlias(true);
            this.A03 = new Paint();
            this.A03.setColor(-1);
            this.A03.setStyle(Paint.Style.STROKE);
            this.A03.setStrokeWidth(6.0f);
            this.A03.setAntiAlias(true);
        }
    }

    public RelativeLayout.LayoutParams getDefaultLayoutParams() {
        float f = C0635Ly.A01;
        int i = this.A00;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (i * f), (int) (i * f));
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        return layoutParams;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        MT mt = this;
        int startY = mt.A04 ? 2 : 6;
        while (true) {
            switch (startY) {
                case 2:
                    canvas2 = canvas2;
                    if (!canvas2.isHardwareAccelerated()) {
                        startY = 5;
                        break;
                    } else {
                        startY = 3;
                        break;
                    }
                case 3:
                    if (Build.VERSION.SDK_INT >= 17) {
                        startY = 5;
                        break;
                    } else {
                        startY = 4;
                        break;
                    }
                case 4:
                    mt = mt;
                    mt.setLayerType(1, null);
                    startY = 5;
                    break;
                case 5:
                    mt = mt;
                    canvas2 = canvas2;
                    int iMin = Math.min(canvas2.getWidth(), canvas2.getHeight());
                    int i = iMin / 2;
                    int i2 = iMin / 2;
                    int centerY = i * 2;
                    int i3 = centerY / 3;
                    canvas2.drawCircle(i, i2, i3, mt.A02);
                    int outerRadius = i3 - 2;
                    canvas2.drawCircle(i, i2, outerRadius, mt.A01);
                    int i4 = iMin / 3;
                    int startX = iMin / 3;
                    int startY2 = i4 * 2;
                    float f = startY2;
                    int startY3 = startX * 2;
                    canvas2.drawLine(i4, startX, f, startY3, mt.A03);
                    int startY4 = i4 * 2;
                    int startY5 = startX * 2;
                    canvas2.drawLine(startY4, startX, i4, startY5, mt.A03);
                    startY = 6;
                    break;
                case 6:
                    super.onDraw(canvas2);
                    return;
            }
        }
    }
}
