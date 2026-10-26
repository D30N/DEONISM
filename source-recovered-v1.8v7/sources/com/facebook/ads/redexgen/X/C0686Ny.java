package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ny, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0686Ny extends LinearLayout {
    public int A00;
    public List<GradientDrawable> A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public C0686Ny(XI xi, C1I c1i, int dotSize) {
        super(xi);
        this.A00 = -1;
        setOrientation(0);
        setGravity(17);
        float f = C0635Ly.A01;
        int i = (int) (8.0f * f);
        int i2 = (int) (6.0f * f);
        int margin = (int) (1.0f * f);
        this.A02 = margin;
        int margin2 = c1i.A04(false);
        this.A04 = margin2;
        int margin3 = C2H.A01(this.A04, 128);
        this.A03 = margin3;
        this.A01 = new ArrayList();
        for (int i3 = 0; i3 < dotSize; i3++) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i, i);
            int margin4 = this.A02;
            gradientDrawable.setStroke(margin4, 0);
            ImageView imageView = new ImageView(xi);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, i2, 0);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageDrawable(gradientDrawable);
            this.A01.add(gradientDrawable);
            addView(imageView);
        }
        A00(0);
    }

    public final void A00(int bgColor) {
        C0686Ny c0686Ny = this;
        int borderColor = 0;
        int i = 0;
        int i2 = 0;
        char c2 = c0686Ny.A00 == bgColor ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0686Ny = c0686Ny;
                    c0686Ny.A00 = bgColor;
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    c0686Ny = c0686Ny;
                    if (i >= c0686Ny.A01.size()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i != bgColor) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0686Ny = c0686Ny;
                    borderColor = c0686Ny.A04;
                    i2 = c0686Ny.A04;
                    c2 = 7;
                    break;
                case 7:
                    c0686Ny = c0686Ny;
                    c0686Ny.A01.get(i).setStroke(c0686Ny.A02, i2);
                    c0686Ny.A01.get(i).setColor(borderColor);
                    c0686Ny.A01.get(i).invalidateSelf();
                    i++;
                    c2 = 4;
                    break;
                case '\b':
                    c0686Ny = c0686Ny;
                    borderColor = c0686Ny.A03;
                    i2 = 0;
                    c2 = 7;
                    break;
                case '\t':
                    return;
            }
        }
    }
}
