package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.Nz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0687Nz extends ImageView {
    public static final int A04 = (int) (C0635Ly.A01 * 8.0f);
    public static final float[] A05;
    public boolean A00;
    public float[] A01;
    public final Path A02;
    public final RectF A03;

    static {
        int i = A04;
        A05 = new float[]{i, i, i, i, i, i, i, i};
    }

    public C0687Nz(XI xi) {
        super(xi);
        this.A01 = A05;
        this.A00 = false;
        this.A02 = new Path();
        this.A03 = new RectF();
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    private float[] getRadiiForCircularImage() {
        int iMin = Math.min(getWidth(), getHeight()) / 2;
        return new float[]{iMin, iMin, iMin, iMin, iMin, iMin, iMin, iMin};
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        C0687Nz c0687Nz = this;
        float[] radiiForCircularImage = null;
        c0687Nz.A03.set(0.0f, 0.0f, c0687Nz.getWidth(), c0687Nz.getHeight());
        c0687Nz.A02.reset();
        char c2 = c0687Nz.A00 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0687Nz = c0687Nz;
                    radiiForCircularImage = c0687Nz.getRadiiForCircularImage();
                    c2 = 3;
                    break;
                case 3:
                    C0687Nz c0687Nz2 = c0687Nz;
                    Canvas canvas2 = canvas;
                    c0687Nz2.A02.addRoundRect(c0687Nz2.A03, radiiForCircularImage, Path.Direction.CW);
                    canvas2.clipPath(c0687Nz2.A02);
                    super.onDraw(canvas2);
                    return;
                case 4:
                    c0687Nz = c0687Nz;
                    radiiForCircularImage = c0687Nz.A01;
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
