package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public class O0 extends RelativeLayout {
    public static final int A04 = (int) (C0635Ly.A01 * 4.0f);
    public static final float[] A05;
    public boolean A00;
    public float[] A01;
    public final Path A02;
    public final RectF A03;

    static {
        int i = A04;
        A05 = new float[]{i, i, i, i, i, i, i, i};
    }

    public O0(XI xi) {
        super(xi);
        this.A01 = A05;
        this.A00 = false;
        this.A02 = new Path();
        this.A03 = new RectF();
        C0635Ly.A0P(this, 0);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    private float[] getRadiiForCircularImage() {
        int iMin = Math.min(getWidth(), getHeight()) / 2;
        return new float[]{iMin, iMin, iMin, iMin, iMin, iMin, iMin, iMin};
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        O0 o0 = this;
        float[] radiiForCircularImage = null;
        o0.A03.set(0.0f, 0.0f, o0.getWidth(), o0.getHeight());
        o0.A02.reset();
        char c2 = o0.A00 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    o0 = o0;
                    radiiForCircularImage = o0.getRadiiForCircularImage();
                    c2 = 3;
                    break;
                case 3:
                    O0 o02 = o0;
                    Canvas canvas2 = canvas;
                    o02.A02.addRoundRect(o02.A03, radiiForCircularImage, Path.Direction.CW);
                    canvas2.clipPath(o02.A02);
                    super.onDraw(canvas2);
                    return;
                case 4:
                    o0 = o0;
                    radiiForCircularImage = o0.A01;
                    c2 = 3;
                    break;
            }
        }
    }

    public void setFullCircleCorners(boolean z) {
        this.A00 = z;
    }

    public void setRadius(int i) {
        int i2 = (int) (i * C0635Ly.A01);
        this.A01 = new float[]{i2, i2, i2, i2, i2, i2, i2, i2};
    }

    public void setRadius(float[] fArr) {
        this.A01 = fArr;
    }
}
