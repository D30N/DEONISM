package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.widget.Button;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class PW extends Button {
    public static byte[] A07;
    public String A00;
    public String A01;
    public boolean A02;
    public final Paint A03;
    public final Path A04;
    public final Path A05;
    public final Path A06;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 72);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A07 = new byte[]{-93, -65, -76, -52, -88, -71, -51, -53, -67};
    }

    public PW(XI xi) {
        this(xi, false);
    }

    public PW(XI xi, boolean z) {
        super(xi);
        this.A02 = false;
        this.A01 = A00(0, 4, 11);
        this.A00 = A00(4, 5, 16);
        this.A04 = new Path();
        this.A05 = new Path();
        this.A06 = new Path();
        this.A03 = new PV(this, z);
        A01();
        setClickable(true);
        C0635Ly.A0P(this, 0);
    }

    private void A01() {
        PW pw = this;
        String str = null;
        char c2 = pw.A02 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    pw = pw;
                    str = pw.A01;
                    c2 = 3;
                    break;
                case 3:
                    pw.setContentDescription(str);
                    return;
                case 4:
                    pw = pw;
                    str = pw.A00;
                    c2 = 3;
                    break;
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        PW pw = this;
        float fMax = 0.0f;
        char c2 = canvas.isHardwareAccelerated() ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (Build.VERSION.SDK_INT >= 17) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    pw = pw;
                    pw.setLayerType(1, null);
                    c2 = 4;
                    break;
                case 4:
                    pw = pw;
                    canvas = canvas;
                    fMax = Math.max(canvas.getWidth(), canvas.getHeight()) / 100.0f;
                    if (!pw.A02) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    pw = pw;
                    canvas = canvas;
                    pw.A06.rewind();
                    pw.A06.moveTo(fMax * 26.5f, fMax * 15.5f);
                    pw.A06.lineTo(fMax * 26.5f, 84.5f * fMax);
                    pw.A06.lineTo(90.0f * fMax, 50.0f * fMax);
                    pw.A06.lineTo(26.5f * fMax, 15.5f * fMax);
                    pw.A06.close();
                    canvas.drawPath(pw.A06, pw.A03);
                    c2 = 6;
                    break;
                case 6:
                    super.onDraw(canvas);
                    return;
                case 7:
                    pw = pw;
                    canvas = canvas;
                    pw.A04.rewind();
                    pw.A04.moveTo(fMax * 29.0f, fMax * 21.0f);
                    pw.A04.lineTo(fMax * 29.0f, fMax * 79.0f);
                    pw.A04.lineTo(fMax * 45.0f, fMax * 79.0f);
                    pw.A04.lineTo(45.0f * fMax, fMax * 21.0f);
                    pw.A04.lineTo(29.0f * fMax, fMax * 21.0f);
                    pw.A04.close();
                    pw.A05.rewind();
                    pw.A05.moveTo(fMax * 55.0f, fMax * 21.0f);
                    pw.A05.lineTo(fMax * 55.0f, fMax * 79.0f);
                    pw.A05.lineTo(fMax * 71.0f, 79.0f * fMax);
                    pw.A05.lineTo(71.0f * fMax, fMax * 21.0f);
                    pw.A05.lineTo(55.0f * fMax, 21.0f * fMax);
                    pw.A05.close();
                    canvas.drawPath(pw.A04, pw.A03);
                    canvas.drawPath(pw.A05, pw.A03);
                    c2 = 6;
                    break;
            }
        }
    }

    public void setChecked(boolean z) {
        this.A02 = z;
        A01();
        refreshDrawableState();
        invalidate();
    }

    public void setPauseAccessibilityLabel(@Nullable String str) {
        if (str != null) {
            this.A00 = str;
            A01();
        }
    }

    public void setPlayAccessibilityLabel(@Nullable String str) {
        if (str != null) {
            this.A01 = str;
            A01();
        }
    }
}
