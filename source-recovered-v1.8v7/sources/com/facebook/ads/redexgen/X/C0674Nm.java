package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.annotation.IntRange;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import d.b.a.b.k;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0674Nm extends Drawable {
    public static byte[] A0G;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public String A04;
    public String A05;

    @Nullable
    public String A06;

    @Nullable
    public WeakReference<Q1> A07;
    public boolean A08;
    public final Paint A09 = new Paint();
    public final Paint A0A = new Paint();
    public final Path A0C = new Path();
    public final TextPaint A0E = new TextPaint();
    public final Paint A0B = new Paint();
    public final Handler A0D = new Handler();
    public final Runnable A0F = new C1003aB(this);

    static {
        A04();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 39);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A0G = new byte[]{-55, 124, -10, 15, 12, 15, 16, 24, 15, 116, -64, -45, -49, -31, -92, -118, 4, -68, -88, -95, -84, -95, -92, -68, -51, -44, -119, 105, 93, -119, -84, -98, -95, -94, -95, 93, -108, -21, -2, -6, 12, -10, -9, -2, 1, -2, 9, 14, -75, -40, -3, -6, -8, 0, -6, 7, -75, 3, 4, 9, -75, 8, -6, 9, -100, -21, -30, -100, -28, 2, 19, 5, -63, -101, 72, -119, -113, -105, -33, 4, -1, 10, -1, -9, 2, -1, 16, -1, 4, -3, -60, -60, -60};
    }

    public C0674Nm() {
        this.A09.setColor(Color.argb(127, 36, 36, 36));
        this.A09.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A0A.setAntiAlias(true);
        this.A0A.setColor(Color.argb(191, 0, 255, 0));
        this.A0A.setStrokeWidth(20.0f);
        this.A0A.setStyle(Paint.Style.STROKE);
        this.A0E.setAntiAlias(true);
        this.A0E.setColor(-1);
        this.A0E.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A0E.setTextSize(30.0f);
        this.A0B.setColor(Color.argb(212, 0, 0, 0));
        this.A0B.setStyle(Paint.Style.FILL_AND_STROKE);
        A07();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        C0674Nm c0674Nm = this;
        int i = 0;
        String[] strArrSplit = null;
        WeakReference<Q1> weakReference = null;
        int i2 = 0;
        int i3 = 0;
        float fMax = 0.0f;
        int i4 = 0;
        int length = 0;
        int i5 = 0;
        long j = 0;
        StringBuilder sb = new StringBuilder();
        int i6 = c0674Nm.A00;
        String strA02 = A02(36, 1, 99);
        int minutes = i6 <= 0 ? 2 : 21;
        while (true) {
            switch (minutes) {
                case 2:
                    c0674Nm = c0674Nm;
                    if (!TextUtils.isEmpty(c0674Nm.A06)) {
                        minutes = 3;
                        break;
                    } else {
                        minutes = 4;
                        break;
                    }
                case 3:
                    c0674Nm = c0674Nm;
                    sb = sb;
                    strA02 = strA02;
                    sb.append(c0674Nm.A06);
                    sb.append(strA02);
                    minutes = 4;
                    break;
                case 4:
                    c0674Nm = c0674Nm;
                    if (!TextUtils.isEmpty(c0674Nm.A04)) {
                        minutes = 5;
                        break;
                    } else {
                        minutes = 6;
                        break;
                    }
                case 5:
                    c0674Nm = c0674Nm;
                    sb = sb;
                    strA02 = strA02;
                    sb.append(c0674Nm.A04);
                    sb.append(strA02);
                    minutes = 6;
                    break;
                case 6:
                    c0674Nm = c0674Nm;
                    sb = sb;
                    sb.append(A02(23, 4, 66));
                    sb.append(A02(18, 5, 76));
                    sb.append(A02(27, 9, 22));
                    j = 0;
                    if (c0674Nm.A03 <= 0) {
                        minutes = 20;
                        break;
                    } else {
                        minutes = 7;
                        break;
                    }
                case 7:
                    c0674Nm = c0674Nm;
                    long jMax = Math.max(j, System.currentTimeMillis() - c0674Nm.A03);
                    i4 = (int) (jMax / 3600000);
                    long j2 = jMax % 3600000;
                    i5 = (int) (j2 / 60000);
                    i2 = (int) ((j2 % 60000) / 1000);
                    if (i4 <= 0) {
                        minutes = 9;
                        break;
                    } else {
                        minutes = 8;
                        break;
                    }
                case 8:
                    sb = sb;
                    sb.append(i4);
                    sb.append(A02(16, 2, k.AppCompatTheme_windowActionModeOverlay));
                    minutes = 9;
                    break;
                case 9:
                    if (i4 > 0) {
                        minutes = 11;
                        break;
                    } else {
                        minutes = 10;
                        break;
                    }
                case 10:
                    if (i5 <= 0) {
                        minutes = 12;
                        break;
                    } else {
                        minutes = 11;
                        break;
                    }
                case 11:
                    sb = sb;
                    sb.append(i5);
                    sb.append(A02(0, 2, 53));
                    minutes = 12;
                    break;
                case 12:
                    sb = sb;
                    sb.append(i2);
                    sb.append(A02(73, 5, 1));
                    minutes = 13;
                    break;
                case 13:
                    c0674Nm = c0674Nm;
                    sb = sb;
                    sb.append(A02(9, 7, 67));
                    weakReference = c0674Nm.A07;
                    if (weakReference == null) {
                        minutes = 15;
                        break;
                    } else {
                        minutes = 14;
                        break;
                    }
                case 14:
                    weakReference = weakReference;
                    if (weakReference.get() != null) {
                        minutes = 19;
                        break;
                    } else {
                        minutes = 15;
                        break;
                    }
                case 15:
                    sb = sb;
                    sb.append(A02(37, 27, 110));
                    minutes = 16;
                    break;
                case 16:
                    c0674Nm = c0674Nm;
                    sb = sb;
                    strA02 = strA02;
                    c0674Nm.A05 = sb.toString();
                    fMax = -2.14748365E9f;
                    strArrSplit = c0674Nm.A05.split(strA02);
                    length = strArrSplit.length;
                    i = 0;
                    i3 = 0;
                    minutes = 17;
                    break;
                case 17:
                    if (i3 >= length) {
                        minutes = 22;
                        break;
                    } else {
                        minutes = 18;
                        break;
                    }
                case 18:
                    c0674Nm = c0674Nm;
                    strArrSplit = strArrSplit;
                    String str = strArrSplit[i3];
                    TextPaint textPaint = c0674Nm.A0E;
                    int minutes2 = str.length();
                    fMax = Math.max(fMax, textPaint.measureText(str, i, minutes2));
                    i3++;
                    minutes = 17;
                    break;
                case 19:
                    c0674Nm = c0674Nm;
                    sb = sb;
                    sb.append(c0674Nm.A07.get().A0S());
                    minutes = 16;
                    break;
                case 20:
                    sb = sb;
                    sb.append(A02(2, 7, k.AppCompatTheme_windowMinWidthMajor));
                    minutes = 13;
                    break;
                case 21:
                    c0674Nm = c0674Nm;
                    sb = sb;
                    sb.append(A02(68, 5, k.AppCompatTheme_windowMinWidthMajor));
                    int minutes3 = c0674Nm.A01;
                    sb.append(minutes3 + 1);
                    sb.append(A02(64, 4, 85));
                    int minutes4 = c0674Nm.A00;
                    sb.append(minutes4);
                    minutes = 13;
                    break;
                case 22:
                    C0674Nm c0674Nm2 = c0674Nm;
                    int minutes5 = (int) (0.5f + fMax);
                    c0674Nm2.A02 = minutes5;
                    c0674Nm2.invalidateSelf();
                    return;
            }
        }
    }

    public final void A07() {
        this.A00 = 0;
        this.A01 = -1;
        this.A05 = A02(78, 15, 111);
        this.A02 = 100;
        this.A06 = null;
        this.A03 = -1L;
        this.A07 = null;
        A0D(false);
    }

    public final void A08(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        A03();
    }

    public final void A09(long j) {
        this.A03 = j;
        A03();
    }

    public final void A0A(Q1 q1) {
        this.A07 = new WeakReference<>(q1);
        A03();
    }

    public final void A0B(String str) {
        this.A04 = str;
        A03();
    }

    public final void A0C(String str) {
        this.A06 = str;
        A03();
    }

    public final void A0D(boolean z) {
        C0674Nm c0674Nm = this;
        c0674Nm.A08 = z;
        char c2 = c0674Nm.A08 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0674Nm = c0674Nm;
                    c0674Nm.A0D.post(c0674Nm.A0F);
                    c2 = 3;
                    break;
                case 3:
                    c0674Nm.invalidateSelf();
                    return;
                case 4:
                    c0674Nm = c0674Nm;
                    c0674Nm.A0D.removeCallbacks(c0674Nm.A0F);
                    c2 = 3;
                    break;
            }
        }
    }

    public final boolean A0E() {
        return this.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!this.A08) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        canvas.drawRect(0.0f, 0.0f, width, height, this.A09);
        StaticLayout staticLayout = new StaticLayout(this.A05, this.A0E, this.A02, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        float canvasMiddleX = width / 2.0f;
        float f = height / 2.0f;
        float width2 = staticLayout.getWidth() / 2.0f;
        float height2 = staticLayout.getHeight() / 2.0f;
        canvas.drawRect((canvasMiddleX - width2) - 40.0f, (f - height2) - 40.0f, canvasMiddleX + width2 + 40.0f, f + height2 + 40.0f, this.A0B);
        canvas.save();
        canvas.translate(canvasMiddleX - width2, f - height2);
        staticLayout.draw(canvas);
        canvas.restore();
        this.A0C.reset();
        this.A0C.moveTo(0.0f, 0.0f);
        this.A0C.lineTo(width, 0.0f);
        this.A0C.lineTo(width, height);
        this.A0C.lineTo(0.0f, height);
        this.A0C.lineTo(0.0f, 0.0f);
        canvas.drawPath(this.A0C, this.A0A);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(@IntRange(from = 0, to = 255) int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
