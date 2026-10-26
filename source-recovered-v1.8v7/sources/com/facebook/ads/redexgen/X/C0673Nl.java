package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.Nl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0673Nl extends FrameLayout {
    public int A00;
    public int A01;
    public final ImageView A02;
    public final ImageView A03;

    public C0673Nl(XI xi) {
        super(xi);
        this.A03 = new ImageView(xi);
        this.A02 = new ImageView(xi);
        A00();
    }

    public C0673Nl(XI xi, AttributeSet attributeSet) {
        super(xi, attributeSet);
        this.A03 = new ImageView(xi, attributeSet);
        this.A02 = new ImageView(xi, attributeSet);
        A00();
    }

    public C0673Nl(XI xi, AttributeSet attributeSet, int i) {
        super(xi, attributeSet, i);
        this.A03 = new ImageView(xi, attributeSet, i);
        this.A02 = new ImageView(xi, attributeSet, i);
        A00();
    }

    @TargetApi(21)
    public C0673Nl(XI xi, AttributeSet attributeSet, int i, int i2) {
        super(xi, attributeSet, i, i2);
        this.A03 = new ImageView(xi, attributeSet, i, i2);
        this.A02 = new ImageView(xi, attributeSet, i, i2);
        A00();
    }

    private void A00() {
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
        addView(this.A03, new FrameLayout.LayoutParams(-2, -2));
        LW.A04(this.A03, LW.A0A);
        setId(C0635Ly.A00());
    }

    public ImageView getBodyImageView() {
        return this.A03;
    }

    public int getImageHeight() {
        return this.A00;
    }

    public int getImageWidth() {
        return this.A01;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0673Nl c0673Nl = this;
        int i5 = 0;
        C0673Nl c0673Nl2 = c0673Nl;
        int i6 = c0673Nl2.A01;
        int centerY = i6 > 0 ? 2 : 3;
        while (true) {
            switch (centerY) {
                case 2:
                    c0673Nl2 = c0673Nl2;
                    i5 = c0673Nl2.A00;
                    if (i5 > 0) {
                        centerY = 5;
                        break;
                    } else {
                        centerY = 3;
                        break;
                    }
                case 3:
                    c0673Nl = c0673Nl;
                    super.onLayout(z, i, i2, i3, i4);
                    centerY = 4;
                    break;
                case 4:
                    return;
                case 5:
                    c0673Nl2 = c0673Nl2;
                    int i7 = i3 - i;
                    int i8 = i4 - i2;
                    float fMin = Math.min(i7 / i6, i8 / i5);
                    int blurBorderViewHeight = c0673Nl2.A01;
                    int i9 = (int) (blurBorderViewHeight * fMin);
                    int blurBorderViewHeight2 = c0673Nl2.A00;
                    int i10 = (int) (blurBorderViewHeight2 * fMin);
                    c0673Nl2.A02.layout(i, i2, i3, i4);
                    int i11 = (i7 / 2) + i;
                    int i12 = (i8 / 2) + i2;
                    int centerY2 = i9 / 2;
                    int i13 = i11 - centerY2;
                    int centerY3 = i10 / 2;
                    int centerY4 = i10 / 2;
                    c0673Nl2.A03.layout(i13, i12 - centerY3, (i9 / 2) + i11, i12 + centerY4);
                    c0673Nl2.A02.setVisibility(0);
                    centerY = 4;
                    break;
            }
        }
    }

    public void setImage(@Nullable Bitmap bitmap, @Nullable Bitmap bitmap2) {
        C0673Nl c0673Nl = this;
        char c2 = bitmap2 != null ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    c0673Nl = c0673Nl;
                    bitmap2 = bitmap2;
                    C0635Ly.A0W(c0673Nl.A02, new BitmapDrawable(c0673Nl.getContext().getResources(), bitmap2));
                    c2 = 3;
                    break;
                case 3:
                    bitmap = bitmap;
                    if (bitmap == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0673Nl = c0673Nl;
                    bitmap = bitmap;
                    c0673Nl.A01 = bitmap.getWidth();
                    c0673Nl.A00 = bitmap.getHeight();
                    c0673Nl.A03.setImageBitmap(Bitmap.createBitmap(bitmap));
                    c2 = 5;
                    break;
                case 5:
                    return;
                case 6:
                    c0673Nl = c0673Nl;
                    c0673Nl.A03.setImageDrawable(null);
                    c2 = 5;
                    break;
                case 7:
                    c0673Nl = c0673Nl;
                    C0635Ly.A0P(c0673Nl.A02, 0);
                    c2 = 3;
                    break;
            }
        }
    }
}
