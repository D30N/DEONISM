package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.aa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1028aa extends C0687Nz {

    @Nullable
    public ImageView.ScaleType A00;

    public C1028aa(XI xi) {
        super(xi);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int widthSpecSize, int i) {
        C1028aa c1028aa = this;
        ImageView.ScaleType scaleType = null;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(widthSpecSize);
        char c2 = View.MeasureSpec.getMode(widthSpecSize) == 1073741824 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    if (View.MeasureSpec.getMode(i) != 1073741824) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1028aa = c1028aa;
                    int iMin = Math.min(size2, size);
                    c1028aa.setMeasuredDimension(iMin, iMin);
                    c2 = 4;
                    break;
                case 4:
                    c1028aa = c1028aa;
                    scaleType = c1028aa.A00;
                    if (scaleType == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1028aa = c1028aa;
                    scaleType = scaleType;
                    super.setScaleType(scaleType);
                    c2 = 6;
                    break;
                case 6:
                    return;
                case 7:
                    if (View.MeasureSpec.getMode(widthSpecSize) != 1073741824) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (size <= 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    size2 = Math.min(size2, size);
                    c2 = '\n';
                    break;
                case '\n':
                    c1028aa = c1028aa;
                    c1028aa.setMeasuredDimension(size2, size2);
                    c2 = 4;
                    break;
                case 11:
                    if (View.MeasureSpec.getMode(i) != 1073741824) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    if (size2 <= 0) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    size = Math.min(size2, size);
                    c2 = 14;
                    break;
                case 14:
                    c1028aa = c1028aa;
                    c1028aa.setMeasuredDimension(size, size);
                    c2 = 4;
                    break;
                case 15:
                    c1028aa = c1028aa;
                    super.onMeasure(widthSpecSize, i);
                    c2 = 4;
                    break;
            }
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        this.A00 = scaleType;
    }
}
