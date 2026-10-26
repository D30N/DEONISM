package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.Log;
import android.util.SparseArray;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Gr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0503Gr {
    public static byte[] A07;
    public static final byte[] A08;
    public static final byte[] A09;
    public static final byte[] A0A;
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02 = new Paint();
    public final Paint A03;
    public final C0495Gj A04;
    public final C0496Gk A05;
    public final C0502Gq A06;

    public static String A09(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 43);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0A() {
        A07 = new byte[]{9, 44, 57, 44, 109, 43, 36, 40, 33, 41, 109, 33, 40, 35, 42, 57, 37, 109, 40, 53, 46, 40, 40, 41, 62, 109, 33, 36, 32, 36, 57, 98, 80, 68, 118, 71, 84, 85, 67, 84};
    }

    static {
        A0A();
        A08 = new byte[]{0, 7, 8, 15};
        A09 = new byte[]{0, 119, -120, -1};
        A0A = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public C0503Gr(int i, int i2) {
        this.A02.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.A02.setPathEffect(null);
        this.A03 = new Paint();
        this.A03.setStyle(Paint.Style.FILL);
        this.A03.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.A03.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new C0496Gk(719, 575, 0, 719, 0, 575);
        this.A04 = new C0495Gj(0, A0F(), A0G(), A0H());
        this.A06 = new C0502Gq(i, i2);
    }

    public static int A00(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static int A01(C0543Ih c0543Ih, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int[] iArr2 = iArr;
        C0543Ih c0543Ih2 = c0543Ih;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        byte[] bArr2 = bArr;
        int i3 = i;
        int runLength = 0;
        int iA04 = 0;
        int i4 = 0;
        int iA042 = 0;
        boolean z = false;
        int peek = 0;
        int i5 = 0;
        int i6 = 0;
        Paint paint3 = paint2;
        boolean z2 = false;
        int clutIndex = 2;
        while (true) {
            switch (clutIndex) {
                case 2:
                    c0543Ih2 = c0543Ih2;
                    i6 = 2;
                    iA04 = c0543Ih2.A04(2);
                    if (iA04 == 0) {
                        clutIndex = 13;
                        break;
                    } else {
                        clutIndex = 3;
                        break;
                    }
                case 3:
                    runLength = 1;
                    z = z2;
                    peek = iA04;
                    clutIndex = 4;
                    break;
                case 4:
                    if (runLength == 0) {
                        clutIndex = 9;
                        break;
                    } else {
                        clutIndex = 5;
                        break;
                    }
                case 5:
                    paint3 = paint3;
                    if (paint3 == null) {
                        clutIndex = 9;
                        break;
                    } else {
                        clutIndex = 6;
                        break;
                    }
                case 6:
                    bArr2 = bArr2;
                    if (bArr2 == null) {
                        clutIndex = 12;
                        break;
                    } else {
                        clutIndex = 7;
                        break;
                    }
                case 7:
                    bArr2 = bArr2;
                    i5 = bArr2[peek];
                    clutIndex = 8;
                    break;
                case 8:
                    iArr2 = iArr2;
                    paint2 = paint2;
                    canvas2 = canvas2;
                    paint3 = paint3;
                    paint3.setColor(iArr2[i5]);
                    canvas2.drawRect(i3, i2, i3 + runLength, i2 + 1, paint2);
                    clutIndex = 9;
                    break;
                case 9:
                    i3 += runLength;
                    if (!z) {
                        clutIndex = 11;
                        break;
                    } else {
                        clutIndex = 10;
                        break;
                    }
                case 10:
                    return i3;
                case 11:
                    z2 = z;
                    clutIndex = 2;
                    break;
                case 12:
                    i5 = peek;
                    clutIndex = 8;
                    break;
                case 13:
                    c0543Ih2 = c0543Ih2;
                    i4 = 3;
                    if (!c0543Ih2.A0F()) {
                        clutIndex = 15;
                        break;
                    } else {
                        clutIndex = 14;
                        break;
                    }
                case 14:
                    c0543Ih2 = c0543Ih2;
                    runLength = c0543Ih2.A04(i4) + 3;
                    peek = c0543Ih2.A04(i6);
                    z = z2;
                    clutIndex = 4;
                    break;
                case 15:
                    c0543Ih2 = c0543Ih2;
                    if (!c0543Ih2.A0F()) {
                        clutIndex = 17;
                        break;
                    } else {
                        clutIndex = 16;
                        break;
                    }
                case 16:
                    peek = 0;
                    runLength = 1;
                    z = z2;
                    clutIndex = 4;
                    break;
                case 17:
                    c0543Ih2 = c0543Ih2;
                    iA042 = c0543Ih2.A04(i6);
                    if (iA042 == 0) {
                        clutIndex = 25;
                        break;
                    } else {
                        clutIndex = 18;
                        break;
                    }
                case 18:
                    if (iA042 == 1) {
                        clutIndex = 24;
                        break;
                    } else {
                        clutIndex = 19;
                        break;
                    }
                case 19:
                    if (iA042 == i6) {
                        clutIndex = 23;
                        break;
                    } else {
                        clutIndex = 20;
                        break;
                    }
                case 20:
                    if (iA042 == i4) {
                        clutIndex = 22;
                        break;
                    } else {
                        clutIndex = 21;
                        break;
                    }
                case 21:
                    peek = 0;
                    runLength = 0;
                    z = z2;
                    clutIndex = 4;
                    break;
                case 22:
                    c0543Ih2 = c0543Ih2;
                    int peek2 = c0543Ih2.A04(8);
                    runLength = peek2 + 29;
                    peek = c0543Ih2.A04(i6);
                    z = z2;
                    clutIndex = 4;
                    break;
                case 23:
                    c0543Ih2 = c0543Ih2;
                    int peek3 = c0543Ih2.A04(4);
                    runLength = peek3 + 12;
                    peek = c0543Ih2.A04(i6);
                    z = z2;
                    clutIndex = 4;
                    break;
                case 24:
                    peek = 0;
                    runLength = 2;
                    z = z2;
                    clutIndex = 4;
                    break;
                case 25:
                    peek = 0;
                    runLength = 0;
                    z = true;
                    clutIndex = 4;
                    break;
            }
        }
    }

    public static int A02(C0543Ih c0543Ih, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        byte[] bArr2 = bArr;
        C0543Ih c0543Ih2 = c0543Ih;
        int[] iArr2 = iArr;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        int i3 = i;
        int iA04 = 0;
        int i4 = 0;
        int column = 0;
        int iA042 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int iA043 = 0;
        int i7 = 0;
        int iA044 = 0;
        Paint paint3 = paint2;
        boolean z2 = false;
        int clutIndex = 2;
        while (true) {
            switch (clutIndex) {
                case 2:
                    c0543Ih2 = c0543Ih2;
                    i4 = 4;
                    iA042 = c0543Ih2.A04(4);
                    if (iA042 == 0) {
                        clutIndex = 13;
                        break;
                    } else {
                        clutIndex = 3;
                        break;
                    }
                case 3:
                    column = 1;
                    z = z2;
                    iA043 = iA042;
                    clutIndex = 4;
                    break;
                case 4:
                    if (column == 0) {
                        clutIndex = 9;
                        break;
                    } else {
                        clutIndex = 5;
                        break;
                    }
                case 5:
                    paint3 = paint3;
                    if (paint3 == null) {
                        clutIndex = 9;
                        break;
                    } else {
                        clutIndex = 6;
                        break;
                    }
                case 6:
                    bArr2 = bArr2;
                    if (bArr2 == null) {
                        clutIndex = 12;
                        break;
                    } else {
                        clutIndex = 7;
                        break;
                    }
                case 7:
                    bArr2 = bArr2;
                    i7 = bArr2[iA043];
                    clutIndex = 8;
                    break;
                case 8:
                    iArr2 = iArr2;
                    paint2 = paint2;
                    canvas2 = canvas2;
                    paint3 = paint3;
                    paint3.setColor(iArr2[i7]);
                    canvas2.drawRect(i3, i2, i3 + column, i2 + 1, paint2);
                    clutIndex = 9;
                    break;
                case 9:
                    i3 += column;
                    if (!z) {
                        clutIndex = 11;
                        break;
                    } else {
                        clutIndex = 10;
                        break;
                    }
                case 10:
                    return i3;
                case 11:
                    z2 = z;
                    clutIndex = 2;
                    break;
                case 12:
                    i7 = iA043;
                    clutIndex = 8;
                    break;
                case 13:
                    c0543Ih2 = c0543Ih2;
                    i5 = 3;
                    if (!c0543Ih2.A0F()) {
                        clutIndex = 14;
                        break;
                    } else {
                        clutIndex = 17;
                        break;
                    }
                case 14:
                    c0543Ih2 = c0543Ih2;
                    iA044 = c0543Ih2.A04(i5);
                    if (iA044 == 0) {
                        clutIndex = 16;
                        break;
                    } else {
                        clutIndex = 15;
                        break;
                    }
                case 15:
                    column = iA044 + 2;
                    iA043 = 0;
                    z = z2;
                    clutIndex = 4;
                    break;
                case 16:
                    iA043 = 0;
                    column = 0;
                    z = true;
                    clutIndex = 4;
                    break;
                case 17:
                    c0543Ih2 = c0543Ih2;
                    i6 = 2;
                    if (!c0543Ih2.A0F()) {
                        clutIndex = 18;
                        break;
                    } else {
                        clutIndex = 19;
                        break;
                    }
                case 18:
                    c0543Ih2 = c0543Ih2;
                    int column2 = c0543Ih2.A04(i6);
                    column = column2 + 4;
                    iA043 = c0543Ih2.A04(i4);
                    z = z2;
                    clutIndex = 4;
                    break;
                case 19:
                    c0543Ih2 = c0543Ih2;
                    iA04 = c0543Ih2.A04(i6);
                    if (iA04 == 0) {
                        clutIndex = 27;
                        break;
                    } else {
                        clutIndex = 20;
                        break;
                    }
                case 20:
                    if (iA04 == 1) {
                        clutIndex = 26;
                        break;
                    } else {
                        clutIndex = 21;
                        break;
                    }
                case 21:
                    if (iA04 == i6) {
                        clutIndex = 25;
                        break;
                    } else {
                        clutIndex = 22;
                        break;
                    }
                case 22:
                    if (iA04 == i5) {
                        clutIndex = 24;
                        break;
                    } else {
                        clutIndex = 23;
                        break;
                    }
                case 23:
                    iA043 = 0;
                    column = 0;
                    z = z2;
                    clutIndex = 4;
                    break;
                case 24:
                    c0543Ih2 = c0543Ih2;
                    int peek = c0543Ih2.A04(8);
                    column = peek + 25;
                    iA043 = c0543Ih2.A04(i4);
                    z = z2;
                    clutIndex = 4;
                    break;
                case 25:
                    c0543Ih2 = c0543Ih2;
                    int peek2 = c0543Ih2.A04(i4);
                    column = peek2 + 9;
                    iA043 = c0543Ih2.A04(i4);
                    z = z2;
                    clutIndex = 4;
                    break;
                case 26:
                    iA043 = 0;
                    column = 2;
                    z = z2;
                    clutIndex = 4;
                    break;
                case 27:
                    iA043 = 0;
                    column = 1;
                    z = z2;
                    clutIndex = 4;
                    break;
            }
        }
    }

    public static int A03(C0543Ih c0543Ih, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        byte[] bArr2 = bArr;
        C0543Ih c0543Ih2 = c0543Ih;
        int runLength = i;
        int[] iArr2 = iArr;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        int i3 = 0;
        int iA04 = 0;
        int iA042 = 0;
        int i4 = 0;
        boolean z = false;
        int clutIndex = 0;
        int i5 = 0;
        int iA043 = 0;
        Paint paint3 = paint2;
        boolean z2 = false;
        int clutIndex2 = 2;
        while (true) {
            switch (clutIndex2) {
                case 2:
                    c0543Ih2 = c0543Ih2;
                    i3 = 8;
                    iA042 = c0543Ih2.A04(8);
                    if (iA042 == 0) {
                        clutIndex2 = 13;
                        break;
                    } else {
                        clutIndex2 = 3;
                        break;
                    }
                case 3:
                    iA04 = 1;
                    z = z2;
                    clutIndex = iA042;
                    clutIndex2 = 4;
                    break;
                case 4:
                    if (iA04 == 0) {
                        clutIndex2 = 9;
                        break;
                    } else {
                        clutIndex2 = 5;
                        break;
                    }
                case 5:
                    paint3 = paint3;
                    if (paint3 == null) {
                        clutIndex2 = 9;
                        break;
                    } else {
                        clutIndex2 = 6;
                        break;
                    }
                case 6:
                    bArr2 = bArr2;
                    if (bArr2 == null) {
                        clutIndex2 = 12;
                        break;
                    } else {
                        clutIndex2 = 7;
                        break;
                    }
                case 7:
                    bArr2 = bArr2;
                    i5 = bArr2[clutIndex];
                    clutIndex2 = 8;
                    break;
                case 8:
                    iArr2 = iArr2;
                    paint2 = paint2;
                    canvas2 = canvas2;
                    paint3 = paint3;
                    paint3.setColor(iArr2[i5]);
                    canvas2.drawRect(runLength, i2, runLength + iA04, i2 + 1, paint2);
                    clutIndex2 = 9;
                    break;
                case 9:
                    runLength += iA04;
                    if (!z) {
                        clutIndex2 = 11;
                        break;
                    } else {
                        clutIndex2 = 10;
                        break;
                    }
                case 10:
                    return runLength;
                case 11:
                    z2 = z;
                    clutIndex2 = 2;
                    break;
                case 12:
                    i5 = clutIndex;
                    clutIndex2 = 8;
                    break;
                case 13:
                    c0543Ih2 = c0543Ih2;
                    i4 = 7;
                    if (!c0543Ih2.A0F()) {
                        clutIndex2 = 14;
                        break;
                    } else {
                        clutIndex2 = 17;
                        break;
                    }
                case 14:
                    c0543Ih2 = c0543Ih2;
                    iA043 = c0543Ih2.A04(i4);
                    if (iA043 == 0) {
                        clutIndex2 = 16;
                        break;
                    } else {
                        clutIndex2 = 15;
                        break;
                    }
                case 15:
                    clutIndex = 0;
                    z = z2;
                    iA04 = iA043;
                    clutIndex2 = 4;
                    break;
                case 16:
                    clutIndex = 0;
                    iA04 = 0;
                    z = true;
                    clutIndex2 = 4;
                    break;
                case 17:
                    c0543Ih2 = c0543Ih2;
                    iA04 = c0543Ih2.A04(i4);
                    clutIndex = c0543Ih2.A04(i3);
                    z = z2;
                    clutIndex2 = 4;
                    break;
            }
        }
    }

    public static C0495Gj A04(C0543Ih c0543Ih, int i) {
        C0543Ih c0543Ih2 = c0543Ih;
        int iA04 = 0;
        int iA042 = 0;
        int[] clutEntries8Bit = null;
        int entryFlags = 0;
        int remainingLength = 0;
        int t = 0;
        int iA043 = 0;
        int iA044 = 0;
        int i2 = 0;
        int i3 = 8;
        int iA045 = c0543Ih2.A04(8);
        c0543Ih2.A08(8);
        int i4 = i - 2;
        int[] iArrA0F = A0F();
        int[] iArrA0G = A0G();
        int[] iArrA0H = A0H();
        int cr = 2;
        while (true) {
            switch (cr) {
                case 2:
                    if (i4 <= 0) {
                        cr = 14;
                        break;
                    } else {
                        cr = 3;
                        break;
                    }
                case 3:
                    c0543Ih2 = c0543Ih2;
                    entryFlags = c0543Ih2.A04(i3);
                    iA044 = c0543Ih2.A04(i3);
                    i2 = i4 - 2;
                    if ((iA044 & 128) == 0) {
                        cr = 11;
                        break;
                    } else {
                        cr = 4;
                        break;
                    }
                case 4:
                    iArrA0F = iArrA0F;
                    clutEntries8Bit = iArrA0F;
                    cr = 5;
                    break;
                case 5:
                    if ((iA044 & 1) == 0) {
                        cr = 10;
                        break;
                    } else {
                        cr = 6;
                        break;
                    }
                case 6:
                    c0543Ih2 = c0543Ih2;
                    remainingLength = c0543Ih2.A04(i3);
                    iA043 = c0543Ih2.A04(i3);
                    iA042 = c0543Ih2.A04(i3);
                    iA04 = c0543Ih2.A04(i3);
                    t = i2 - 4;
                    cr = 7;
                    break;
                case 7:
                    if (remainingLength != 0) {
                        cr = 9;
                        break;
                    } else {
                        cr = 8;
                        break;
                    }
                case 8:
                    iA043 = 0;
                    iA042 = 0;
                    iA04 = 255;
                    cr = 9;
                    break;
                case 9:
                    iArrA0F = iArrA0F;
                    iArrA0G = iArrA0G;
                    clutEntries8Bit = clutEntries8Bit;
                    int clutId = iA043 - 128;
                    int i5 = (int) (remainingLength + (clutId * 1.402d));
                    int remainingLength2 = iA042 - 128;
                    int i6 = (int) ((remainingLength - (remainingLength2 * 0.34414d)) - ((iA043 - 128) * 0.71414d));
                    int t2 = iA042 - 128;
                    clutEntries8Bit[entryFlags] = A00((byte) (255 - (iA04 & 255)), C0560Iy.A06(i5, 0, 255), C0560Iy.A06(i6, 0, 255), C0560Iy.A06((int) (remainingLength + (t2 * 1.772d)), 0, 255));
                    i4 = t;
                    i3 = 8;
                    cr = 2;
                    break;
                case 10:
                    c0543Ih2 = c0543Ih2;
                    remainingLength = c0543Ih2.A04(6) << 2;
                    iA043 = c0543Ih2.A04(4) << 4;
                    int cr2 = c0543Ih2.A04(4);
                    iA042 = cr2 << 4;
                    int cr3 = c0543Ih2.A04(2);
                    iA04 = cr3 << 6;
                    t = i2 - 2;
                    cr = 7;
                    break;
                case 11:
                    if ((iA044 & 64) == 0) {
                        cr = 13;
                        break;
                    } else {
                        cr = 12;
                        break;
                    }
                case 12:
                    iArrA0G = iArrA0G;
                    clutEntries8Bit = iArrA0G;
                    cr = 5;
                    break;
                case 13:
                    iArrA0H = iArrA0H;
                    clutEntries8Bit = iArrA0H;
                    cr = 5;
                    break;
                case 14:
                    return new C0495Gj(iA045, iArrA0F, iArrA0G, iArrA0H);
            }
        }
    }

    public static C0496Gk A05(C0543Ih c0543Ih) {
        int verticalPositionMinimum;
        int width;
        int verticalPositionMaximum;
        int height;
        c0543Ih.A08(4);
        boolean zA0F = c0543Ih.A0F();
        c0543Ih.A08(3);
        int iA04 = c0543Ih.A04(16);
        int iA042 = c0543Ih.A04(16);
        if (zA0F) {
            verticalPositionMinimum = c0543Ih.A04(16);
            verticalPositionMaximum = c0543Ih.A04(16);
            width = c0543Ih.A04(16);
            height = c0543Ih.A04(16);
        } else {
            verticalPositionMinimum = 0;
            width = 0;
            verticalPositionMaximum = iA04;
            height = iA042;
        }
        return new C0496Gk(iA04, iA042, verticalPositionMinimum, verticalPositionMaximum, width, height);
    }

    public static C0497Gl A06(C0543Ih c0543Ih) {
        int objectId = 0;
        int objectCodingMethod = 0;
        int iA04 = 0;
        int iA042 = c0543Ih.A04(16);
        c0543Ih.A08(4);
        int iA043 = c0543Ih.A04(2);
        boolean zA0F = c0543Ih.A0F();
        c0543Ih.A08(1);
        byte[] bArr = null;
        byte[] bArr2 = null;
        int topFieldDataLength = iA043 == 1 ? 2 : 4;
        while (true) {
            switch (topFieldDataLength) {
                case 2:
                    c0543Ih = c0543Ih;
                    int topFieldDataLength2 = c0543Ih.A04(8);
                    c0543Ih.A08(topFieldDataLength2 * 16);
                    topFieldDataLength = 3;
                    break;
                case 3:
                    return new C0497Gl(iA042, zA0F, bArr, bArr2);
                case 4:
                    if (iA043 != 0) {
                        topFieldDataLength = 3;
                        break;
                    } else {
                        topFieldDataLength = 5;
                        break;
                    }
                case 5:
                    c0543Ih = c0543Ih;
                    iA04 = c0543Ih.A04(16);
                    objectId = c0543Ih.A04(16);
                    objectCodingMethod = 0;
                    if (iA04 <= 0) {
                        topFieldDataLength = 7;
                        break;
                    } else {
                        topFieldDataLength = 6;
                        break;
                    }
                case 6:
                    c0543Ih = c0543Ih;
                    objectCodingMethod = 0;
                    bArr = new byte[iA04];
                    c0543Ih.A0E(bArr, 0, iA04);
                    topFieldDataLength = 7;
                    break;
                case 7:
                    if (objectId <= 0) {
                        topFieldDataLength = 9;
                        break;
                    } else {
                        topFieldDataLength = 8;
                        break;
                    }
                case 8:
                    c0543Ih = c0543Ih;
                    bArr2 = new byte[objectId];
                    c0543Ih.A0E(bArr2, objectCodingMethod, objectId);
                    topFieldDataLength = 3;
                    break;
                case 9:
                    bArr2 = bArr;
                    topFieldDataLength = 3;
                    break;
            }
        }
    }

    public static C0498Gm A07(C0543Ih c0543Ih, int timeoutSecs) {
        int iA04 = c0543Ih.A04(8);
        int iA042 = c0543Ih.A04(4);
        int iA043 = c0543Ih.A04(2);
        c0543Ih.A08(2);
        int i = timeoutSecs - 2;
        SparseArray sparseArray = new SparseArray();
        int remainingLength = 2;
        while (true) {
            switch (remainingLength) {
                case 2:
                    if (i <= 0) {
                        remainingLength = 4;
                        break;
                    } else {
                        remainingLength = 3;
                        break;
                    }
                case 3:
                    c0543Ih = c0543Ih;
                    sparseArray = sparseArray;
                    int iA044 = c0543Ih.A04(8);
                    c0543Ih.A08(8);
                    i -= 6;
                    sparseArray.put(iA044, new C0499Gn(c0543Ih.A04(16), c0543Ih.A04(16)));
                    remainingLength = 2;
                    break;
                case 4:
                    return new C0498Gm(iA04, iA042, iA043, sparseArray);
            }
        }
    }

    public static C0500Go A08(C0543Ih c0543Ih, int i) {
        int i2 = 8;
        int iA04 = c0543Ih.A04(8);
        c0543Ih.A08(4);
        boolean zA0F = c0543Ih.A0F();
        c0543Ih.A08(3);
        int iA042 = c0543Ih.A04(16);
        int iA043 = c0543Ih.A04(16);
        int iA044 = c0543Ih.A04(3);
        int iA045 = c0543Ih.A04(3);
        c0543Ih.A08(2);
        int id = c0543Ih.A04(8);
        int iA046 = c0543Ih.A04(8);
        int width = c0543Ih.A04(4);
        int height = c0543Ih.A04(2);
        c0543Ih.A08(2);
        int pixelCode8Bit = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (pixelCode8Bit > 0) {
            int pixelCode4Bit = c0543Ih.A04(16);
            int pixelCode2Bit = c0543Ih.A04(2);
            int remainingLength = c0543Ih.A04(2);
            int objectHorizontalPosition = c0543Ih.A04(12);
            c0543Ih.A08(4);
            int objectVerticalPosition = c0543Ih.A04(12);
            pixelCode8Bit -= 6;
            int remainingLength2 = 0;
            int objectType = 0;
            if (pixelCode2Bit == 1 || pixelCode2Bit == 2) {
                remainingLength2 = c0543Ih.A04(i2);
                objectType = c0543Ih.A04(i2);
                pixelCode8Bit -= 2;
            }
            sparseArray.put(pixelCode4Bit, new C0501Gp(pixelCode2Bit, remainingLength, objectHorizontalPosition, objectVerticalPosition, remainingLength2, objectType));
            i2 = 8;
        }
        return new C0500Go(iA04, zA0F, iA042, iA043, iA044, iA045, id, iA046, width, height, sparseArray);
    }

    public static void A0B(C0497Gl c0497Gl, C0495Gj c0495Gj, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr = null;
        char c2 = i == 3 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0495Gj = c0495Gj;
                    iArr = c0495Gj.A03;
                    c2 = 3;
                    break;
                case 3:
                    C0497Gl c0497Gl2 = c0497Gl;
                    Paint paint2 = paint;
                    Canvas canvas2 = canvas;
                    int[] iArr2 = iArr;
                    A0D(c0497Gl2.A03, iArr2, i, i2, i3, paint2, canvas2);
                    A0D(c0497Gl2.A02, iArr2, i, i2, i3 + 1, paint2, canvas2);
                    return;
                case 4:
                    if (i != 2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0495Gj = c0495Gj;
                    iArr = c0495Gj.A02;
                    c2 = 3;
                    break;
                case 6:
                    c0495Gj = c0495Gj;
                    iArr = c0495Gj.A01;
                    c2 = 3;
                    break;
            }
        }
    }

    public static void A0C(C0543Ih c0543Ih, C0502Gq c0502Gq) {
        C0498Gm current = null;
        C0500Go c0500GoA08 = null;
        C0498Gm c0498GmA07 = null;
        C0498Gm c0498Gm = null;
        int iA04 = c0543Ih.A04(8);
        int iA042 = c0543Ih.A04(16);
        int iA043 = c0543Ih.A04(16);
        int iA02 = c0543Ih.A02() + iA043;
        int i = iA043 * 8;
        int pageId = c0543Ih.A01();
        int pageId2 = i > pageId ? 2 : 3;
        while (true) {
            switch (pageId2) {
                case 2:
                    C0543Ih c0543Ih2 = c0543Ih;
                    Log.w(A09(31, 9, 13), A09(0, 31, 102));
                    int pageId3 = c0543Ih2.A01();
                    c0543Ih2.A08(pageId3);
                    return;
                case 3:
                    switch (iA04) {
                        case 16:
                            pageId2 = 5;
                            break;
                        case 17:
                            pageId2 = 11;
                            break;
                        case 18:
                            pageId2 = 16;
                            break;
                        case 19:
                            pageId2 = 20;
                            break;
                        case 20:
                            pageId2 = 24;
                            break;
                        default:
                            pageId2 = 4;
                            break;
                    }
                case 4:
                    C0543Ih c0543Ih3 = c0543Ih;
                    int pageId4 = c0543Ih3.A02();
                    c0543Ih3.A09(iA02 - pageId4);
                    return;
                case 5:
                    c0502Gq = c0502Gq;
                    int pageId5 = c0502Gq.A03;
                    if (iA042 != pageId5) {
                        pageId2 = 4;
                        break;
                    } else {
                        pageId2 = 6;
                        break;
                    }
                case 6:
                    c0543Ih = c0543Ih;
                    c0502Gq = c0502Gq;
                    current = c0502Gq.A01;
                    c0498GmA07 = A07(c0543Ih, iA043);
                    int pageId6 = c0498GmA07.A00;
                    if (pageId6 == 0) {
                        pageId2 = 8;
                        break;
                    } else {
                        pageId2 = 7;
                        break;
                    }
                case 7:
                    c0502Gq = c0502Gq;
                    c0498GmA07 = c0498GmA07;
                    c0502Gq.A01 = c0498GmA07;
                    c0502Gq.A08.clear();
                    c0502Gq.A06.clear();
                    c0502Gq.A07.clear();
                    pageId2 = 4;
                    break;
                case 8:
                    current = current;
                    if (current == null) {
                        pageId2 = 4;
                        break;
                    } else {
                        pageId2 = 9;
                        break;
                    }
                case 9:
                    current = current;
                    c0498GmA07 = c0498GmA07;
                    int i2 = current.A02;
                    int pageId7 = c0498GmA07.A02;
                    if (i2 == pageId7) {
                        pageId2 = 4;
                        break;
                    } else {
                        pageId2 = 10;
                        break;
                    }
                case 10:
                    c0502Gq = c0502Gq;
                    c0498GmA07 = c0498GmA07;
                    c0502Gq.A01 = c0498GmA07;
                    pageId2 = 4;
                    break;
                case 11:
                    c0502Gq = c0502Gq;
                    c0498Gm = c0502Gq.A01;
                    int pageId8 = c0502Gq.A03;
                    if (iA042 != pageId8) {
                        pageId2 = 4;
                        break;
                    } else {
                        pageId2 = 12;
                        break;
                    }
                case 12:
                    c0498Gm = c0498Gm;
                    if (c0498Gm == null) {
                        pageId2 = 4;
                        break;
                    } else {
                        pageId2 = 13;
                        break;
                    }
                case 13:
                    c0543Ih = c0543Ih;
                    c0498Gm = c0498Gm;
                    c0500GoA08 = A08(c0543Ih, iA043);
                    int pageId9 = c0498Gm.A00;
                    if (pageId9 != 0) {
                        pageId2 = 15;
                        break;
                    } else {
                        pageId2 = 14;
                        break;
                    }
                case 14:
                    c0502Gq = c0502Gq;
                    c0500GoA08 = c0500GoA08;
                    SparseArray<C0500Go> sparseArray = c0502Gq.A08;
                    int pageId10 = c0500GoA08.A03;
                    c0500GoA08.A00(sparseArray.get(pageId10));
                    pageId2 = 15;
                    break;
                case 15:
                    c0502Gq = c0502Gq;
                    c0500GoA08 = c0500GoA08;
                    SparseArray<C0500Go> sparseArray2 = c0502Gq.A08;
                    int pageId11 = c0500GoA08.A03;
                    sparseArray2.put(pageId11, c0500GoA08);
                    pageId2 = 4;
                    break;
                case 16:
                    c0502Gq = c0502Gq;
                    int pageId12 = c0502Gq.A03;
                    if (iA042 != pageId12) {
                        pageId2 = 18;
                        break;
                    } else {
                        pageId2 = 17;
                        break;
                    }
                case 17:
                    c0543Ih = c0543Ih;
                    c0502Gq = c0502Gq;
                    C0495Gj c0495GjA04 = A04(c0543Ih, iA043);
                    SparseArray<C0495Gj> sparseArray3 = c0502Gq.A06;
                    int pageId13 = c0495GjA04.A00;
                    sparseArray3.put(pageId13, c0495GjA04);
                    pageId2 = 4;
                    break;
                case 18:
                    c0502Gq = c0502Gq;
                    int pageId14 = c0502Gq.A02;
                    if (iA042 != pageId14) {
                        pageId2 = 4;
                        break;
                    } else {
                        pageId2 = 19;
                        break;
                    }
                case 19:
                    c0543Ih = c0543Ih;
                    c0502Gq = c0502Gq;
                    C0495Gj c0495GjA042 = A04(c0543Ih, iA043);
                    SparseArray<C0495Gj> sparseArray4 = c0502Gq.A04;
                    int pageId15 = c0495GjA042.A00;
                    sparseArray4.put(pageId15, c0495GjA042);
                    pageId2 = 4;
                    break;
                case 20:
                    c0502Gq = c0502Gq;
                    int pageId16 = c0502Gq.A03;
                    if (iA042 != pageId16) {
                        pageId2 = 22;
                        break;
                    } else {
                        pageId2 = 21;
                        break;
                    }
                case 21:
                    c0543Ih = c0543Ih;
                    c0502Gq = c0502Gq;
                    C0497Gl c0497GlA06 = A06(c0543Ih);
                    SparseArray<C0497Gl> sparseArray5 = c0502Gq.A07;
                    int pageId17 = c0497GlA06.A00;
                    sparseArray5.put(pageId17, c0497GlA06);
                    pageId2 = 4;
                    break;
                case 22:
                    c0502Gq = c0502Gq;
                    int pageId18 = c0502Gq.A02;
                    if (iA042 != pageId18) {
                        pageId2 = 4;
                        break;
                    } else {
                        pageId2 = 23;
                        break;
                    }
                case 23:
                    c0543Ih = c0543Ih;
                    c0502Gq = c0502Gq;
                    C0497Gl c0497GlA062 = A06(c0543Ih);
                    SparseArray<C0497Gl> sparseArray6 = c0502Gq.A05;
                    int pageId19 = c0497GlA062.A00;
                    sparseArray6.put(pageId19, c0497GlA062);
                    pageId2 = 4;
                    break;
                case 24:
                    c0502Gq = c0502Gq;
                    int pageId20 = c0502Gq.A03;
                    if (iA042 != pageId20) {
                        pageId2 = 4;
                        break;
                    } else {
                        pageId2 = 25;
                        break;
                    }
                case 25:
                    c0543Ih = c0543Ih;
                    c0502Gq = c0502Gq;
                    c0502Gq.A00 = A05(c0543Ih);
                    pageId2 = 4;
                    break;
            }
        }
    }

    public static void A0D(byte[] bArr, int[] iArr, int i, int column, int i2, Paint paint, Canvas canvas) {
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        int line = i2;
        int[] iArr2 = iArr;
        byte[] bArr2 = null;
        byte[] clutMapTable4To8 = null;
        int column2 = 0;
        int line2 = 0;
        int i3 = 0;
        int iA04 = 0;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        C0543Ih c0543Ih = new C0543Ih(bArr);
        byte[] bArrA0E = null;
        byte[] bArrA0E2 = null;
        int iA01 = column;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0543Ih = c0543Ih;
                    if (c0543Ih.A01() == 0) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0543Ih = c0543Ih;
                    line2 = 8;
                    iA04 = c0543Ih.A04(8);
                    if (iA04 == 240) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    column2 = 3;
                    switch (iA04) {
                        case 16:
                            c2 = '\t';
                            break;
                        case 17:
                            c2 = 21;
                            break;
                        case 18:
                            c2 = 28;
                            break;
                        default:
                            c2 = 5;
                            break;
                    }
                case 5:
                    i3 = 4;
                    switch (iA04) {
                        case 32:
                            c2 = 6;
                            break;
                        case 33:
                            c2 = 7;
                            break;
                        case 34:
                            c2 = '\b';
                            break;
                        default:
                            c2 = 2;
                            break;
                    }
                case 6:
                    c0543Ih = c0543Ih;
                    bArrA0E = A0E(i3, i3, c0543Ih);
                    c2 = 2;
                    break;
                case 7:
                    c0543Ih = c0543Ih;
                    bArrA0E2 = A0E(i3, line2, c0543Ih);
                    c2 = 2;
                    break;
                case '\b':
                    c0543Ih = c0543Ih;
                    bArrA0E2 = A0E(16, line2, c0543Ih);
                    c2 = 2;
                    break;
                case '\t':
                    if (i != column2) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (bArrA0E2 != null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    bArr3 = A09;
                    c2 = '\f';
                    break;
                case '\f':
                    bArr5 = bArr3;
                    c2 = '\r';
                    break;
                case '\r':
                    iArr2 = iArr2;
                    paint2 = paint2;
                    canvas2 = canvas2;
                    c0543Ih = c0543Ih;
                    iA01 = A01(c0543Ih, iArr2, bArr5, iA01, line, paint2, canvas2);
                    c0543Ih.A05();
                    c2 = 2;
                    break;
                case 14:
                    bArr3 = bArrA0E2;
                    c2 = '\f';
                    break;
                case 15:
                    if (i != 2) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    if (bArrA0E != null) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    bArr4 = A08;
                    c2 = 18;
                    break;
                case 18:
                    bArr5 = bArr4;
                    c2 = '\r';
                    break;
                case 19:
                    bArr4 = bArrA0E;
                    c2 = 18;
                    break;
                case 20:
                    bArr5 = null;
                    c2 = '\r';
                    break;
                case 21:
                    if (i != column2) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    if (0 != 0) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    clutMapTable4To8 = A0A;
                    c2 = 24;
                    break;
                case 24:
                    bArr2 = clutMapTable4To8;
                    c2 = 25;
                    break;
                case 25:
                    iArr2 = iArr2;
                    paint2 = paint2;
                    canvas2 = canvas2;
                    c0543Ih = c0543Ih;
                    iA01 = A02(c0543Ih, iArr2, bArr2, iA01, line, paint2, canvas2);
                    c0543Ih.A05();
                    c2 = 2;
                    break;
                case 26:
                    clutMapTable4To8 = null;
                    c2 = 24;
                    break;
                case 27:
                    bArr2 = null;
                    c2 = 25;
                    break;
                case 28:
                    iArr2 = iArr2;
                    paint2 = paint2;
                    canvas2 = canvas2;
                    c0543Ih = c0543Ih;
                    iA01 = A03(c0543Ih, iArr2, null, iA01, line, paint2, canvas2);
                    c2 = 2;
                    break;
                case 29:
                    iA01 = column;
                    line += 2;
                    c2 = 2;
                    break;
                case 30:
                    return;
            }
        }
    }

    public static byte[] A0E(int i, int i2, C0543Ih c0543Ih) {
        byte[] bArr = new byte[i];
        int i3 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 >= i) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0543Ih = c0543Ih;
                    bArr = bArr;
                    bArr[i3] = (byte) c0543Ih.A04(i2);
                    i3++;
                    c2 = 2;
                    break;
                case 4:
                    return bArr;
            }
        }
    }

    public static int[] A0F() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] A0G() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int[] iArr = new int[16];
        iArr[0] = 0;
        int i8 = 1;
        int i9 = 2;
        while (true) {
            switch (i9) {
                case 2:
                    iArr = iArr;
                    int i10 = iArr.length;
                    if (i8 >= i10) {
                        i9 = 24;
                        break;
                    } else {
                        i9 = 3;
                        break;
                    }
                case 3:
                    i6 = 255;
                    if (i8 >= 8) {
                        i9 = 15;
                        break;
                    } else {
                        i9 = 4;
                        break;
                    }
                case 4:
                    int i11 = i8 & 1;
                    if (i11 == 0) {
                        i9 = 14;
                        break;
                    } else {
                        i9 = 5;
                        break;
                    }
                case 5:
                    i5 = 255;
                    i9 = 6;
                    break;
                case 6:
                    int i12 = i8 & 2;
                    if (i12 == 0) {
                        i9 = 13;
                        break;
                    } else {
                        i9 = 7;
                        break;
                    }
                case 7:
                    i3 = 255;
                    i9 = 8;
                    break;
                case 8:
                    if ((i8 & 4) == 0) {
                        i9 = 12;
                        break;
                    } else {
                        i9 = 9;
                        break;
                    }
                case 9:
                    i7 = 255;
                    i9 = 10;
                    break;
                case 10:
                    iArr = iArr;
                    iArr[i8] = A00(i6, i5, i3, i7);
                    i9 = 11;
                    break;
                case 11:
                    i8++;
                    i9 = 2;
                    break;
                case 12:
                    i7 = 0;
                    i9 = 10;
                    break;
                case 13:
                    i3 = 0;
                    i9 = 8;
                    break;
                case 14:
                    i5 = 0;
                    i9 = 6;
                    break;
                case 15:
                    i2 = 127;
                    if ((i8 & 1) == 0) {
                        i9 = 23;
                        break;
                    } else {
                        i9 = 16;
                        break;
                    }
                case 16:
                    i = 127;
                    i9 = 17;
                    break;
                case 17:
                    if ((i8 & 2) == 0) {
                        i9 = 22;
                        break;
                    } else {
                        i9 = 18;
                        break;
                    }
                case 18:
                    i4 = 127;
                    i9 = 19;
                    break;
                case 19:
                    int i13 = i8 & 4;
                    if (i13 == 0) {
                        i9 = 21;
                        break;
                    } else {
                        i9 = 20;
                        break;
                    }
                case 20:
                    iArr = iArr;
                    int i14 = A00(i6, i, i4, i2);
                    iArr[i8] = i14;
                    i9 = 11;
                    break;
                case 21:
                    i2 = 0;
                    i9 = 20;
                    break;
                case 22:
                    i4 = 0;
                    i9 = 19;
                    break;
                case 23:
                    i = 0;
                    i9 = 17;
                    break;
                case 24:
                    return iArr;
            }
        }
    }

    public static int[] A0H() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int[] iArr = new int[256];
        iArr[0] = 0;
        int i38 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    iArr = iArr;
                    if (i38 >= iArr.length) {
                        c2 = 'V';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i15 = 8;
                    i18 = 255;
                    if (i38 >= 8) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i22 = 63;
                    if ((i38 & 1) == 0) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i23 = 255;
                    c2 = 6;
                    break;
                case 6:
                    if ((i38 & 2) == 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    i25 = 255;
                    c2 = '\b';
                    break;
                case '\b':
                    if ((i38 & 4) == 0) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    iArr = iArr;
                    iArr[i38] = A00(i22, i23, i25, i18);
                    c2 = '\n';
                    break;
                case '\n':
                    i38++;
                    c2 = 2;
                    break;
                case 11:
                    i18 = 0;
                    c2 = '\t';
                    break;
                case '\f':
                    i25 = 0;
                    c2 = '\b';
                    break;
                case '\r':
                    i23 = 0;
                    c2 = 6;
                    break;
                case 14:
                    i13 = i38 & 136;
                    i35 = 170;
                    i9 = 85;
                    if (i13 == 0) {
                        c2 = 'E';
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    i27 = 127;
                    if (i13 == i15) {
                        c2 = '4';
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    i7 = 43;
                    if (i13 == 128) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    if (i13 == 136) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case 18:
                    if ((i38 & 1) == 0) {
                        c2 = '\"';
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    i14 = 43;
                    c2 = 20;
                    break;
                case 20:
                    if ((i38 & 16) == 0) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    i20 = 85;
                    c2 = 22;
                    break;
                case 22:
                    i6 = i14 + i20;
                    if ((i38 & 2) == 0) {
                        c2 = ' ';
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    i12 = 43;
                    c2 = 24;
                    break;
                case 24:
                    if ((i38 & 32) == 0) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    i11 = 85;
                    c2 = 26;
                    break;
                case 26:
                    i4 = i12 + i11;
                    if ((i38 & 4) == 0) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    if ((i38 & 64) == 0) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    iArr = iArr;
                    iArr[i38] = A00(i18, i6, i4, i7 + i9);
                    c2 = '\n';
                    break;
                case 29:
                    i9 = 0;
                    c2 = 28;
                    break;
                case 30:
                    i7 = 0;
                    c2 = 27;
                    break;
                case 31:
                    i11 = 0;
                    c2 = 26;
                    break;
                case ' ':
                    i12 = 0;
                    c2 = 24;
                    break;
                case '!':
                    i20 = 0;
                    c2 = 22;
                    break;
                case '\"':
                    i14 = 0;
                    c2 = 20;
                    break;
                case '#':
                    if ((i38 & 1) == 0) {
                        c2 = '3';
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case '$':
                    i28 = 43;
                    c2 = '%';
                    break;
                case '%':
                    i29 = i28 + i27;
                    if ((i38 & 16) == 0) {
                        c2 = '2';
                        break;
                    } else {
                        c2 = '&';
                        break;
                    }
                case '&':
                    i30 = 85;
                    c2 = '\'';
                    break;
                case '\'':
                    i17 = i29 + i30;
                    if ((i38 & 2) == 0) {
                        c2 = '1';
                        break;
                    } else {
                        c2 = '(';
                        break;
                    }
                case '(':
                    i16 = 43;
                    c2 = ')';
                    break;
                case ')':
                    i19 = i16 + i27;
                    if ((i38 & 32) == 0) {
                        c2 = '0';
                        break;
                    } else {
                        c2 = '*';
                        break;
                    }
                case '*':
                    i31 = 85;
                    c2 = '+';
                    break;
                case '+':
                    i24 = i19 + i31;
                    if ((i38 & 4) == 0) {
                        c2 = '/';
                        break;
                    } else {
                        c2 = ',';
                        break;
                    }
                case ',':
                    i26 = i7 + i27;
                    if ((i38 & 64) == 0) {
                        c2 = '.';
                        break;
                    } else {
                        c2 = '-';
                        break;
                    }
                case '-':
                    iArr = iArr;
                    iArr[i38] = A00(i18, i17, i24, i26 + i9);
                    c2 = '\n';
                    break;
                case '.':
                    i9 = 0;
                    c2 = '-';
                    break;
                case '/':
                    i7 = 0;
                    c2 = ',';
                    break;
                case '0':
                    i31 = 0;
                    c2 = '+';
                    break;
                case '1':
                    i16 = 0;
                    c2 = ')';
                    break;
                case '2':
                    i30 = 0;
                    c2 = '\'';
                    break;
                case '3':
                    i28 = 0;
                    c2 = '%';
                    break;
                case '4':
                    if ((i38 & 1) == 0) {
                        c2 = 'D';
                        break;
                    } else {
                        c2 = '5';
                        break;
                    }
                case '5':
                    i10 = 85;
                    c2 = '6';
                    break;
                case '6':
                    if ((i38 & 16) == 0) {
                        c2 = 'C';
                        break;
                    } else {
                        c2 = '7';
                        break;
                    }
                case '7':
                    i32 = 170;
                    c2 = '8';
                    break;
                case '8':
                    i8 = i10 + i32;
                    if ((i38 & 2) == 0) {
                        c2 = 'B';
                        break;
                    } else {
                        c2 = '9';
                        break;
                    }
                case '9':
                    i33 = 85;
                    c2 = ':';
                    break;
                case ':':
                    if ((i38 & 32) == 0) {
                        c2 = 'A';
                        break;
                    } else {
                        c2 = ';';
                        break;
                    }
                case ';':
                    i34 = 170;
                    c2 = '<';
                    break;
                case '<':
                    i21 = i33 + i34;
                    if ((i38 & 4) == 0) {
                        c2 = '@';
                        break;
                    } else {
                        c2 = '=';
                        break;
                    }
                case '=':
                    if ((i38 & 64) == 0) {
                        c2 = '?';
                        break;
                    } else {
                        c2 = '>';
                        break;
                    }
                case '>':
                    iArr = iArr;
                    iArr[i38] = A00(i27, i8, i21, i9 + i35);
                    c2 = '\n';
                    break;
                case '?':
                    i35 = 0;
                    c2 = '>';
                    break;
                case '@':
                    i9 = 0;
                    c2 = '=';
                    break;
                case 'A':
                    i34 = 0;
                    c2 = '<';
                    break;
                case 'B':
                    i33 = 0;
                    c2 = ':';
                    break;
                case 'C':
                    i32 = 0;
                    c2 = '8';
                    break;
                case 'D':
                    i10 = 0;
                    c2 = '6';
                    break;
                case 'E':
                    if ((i38 & 1) == 0) {
                        c2 = 'U';
                        break;
                    } else {
                        c2 = 'F';
                        break;
                    }
                case 'F':
                    i5 = 85;
                    c2 = 'G';
                    break;
                case 'G':
                    if ((i38 & 16) == 0) {
                        c2 = 'T';
                        break;
                    } else {
                        c2 = 'H';
                        break;
                    }
                case 'H':
                    i36 = 170;
                    c2 = 'I';
                    break;
                case 'I':
                    i2 = i5 + i36;
                    if ((i38 & 2) == 0) {
                        c2 = 'S';
                        break;
                    } else {
                        c2 = 'J';
                        break;
                    }
                case 'J':
                    i37 = 85;
                    c2 = 'K';
                    break;
                case 'K':
                    if ((i38 & 32) == 0) {
                        c2 = 'R';
                        break;
                    } else {
                        c2 = 'L';
                        break;
                    }
                case 'L':
                    i3 = 170;
                    c2 = 'M';
                    break;
                case 'M':
                    i = i37 + i3;
                    if ((i38 & 4) == 0) {
                        c2 = 'Q';
                        break;
                    } else {
                        c2 = 'N';
                        break;
                    }
                case 'N':
                    if ((i38 & 64) == 0) {
                        c2 = 'P';
                        break;
                    } else {
                        c2 = 'O';
                        break;
                    }
                case 'O':
                    iArr = iArr;
                    iArr[i38] = A00(i18, i2, i, i9 + i35);
                    c2 = '\n';
                    break;
                case 'P':
                    i35 = 0;
                    c2 = 'O';
                    break;
                case 'Q':
                    i9 = 0;
                    c2 = 'N';
                    break;
                case 'R':
                    i3 = 0;
                    c2 = 'M';
                    break;
                case 'S':
                    i37 = 0;
                    c2 = 'K';
                    break;
                case k.AppCompatTheme_panelBackground /* 84 */:
                    i36 = 0;
                    c2 = 'I';
                    break;
                case 'U':
                    i5 = 0;
                    c2 = 'G';
                    break;
                case 'V':
                    return iArr;
            }
        }
    }

    public final List<GX> A0I(byte[] bArr, int i) {
        C0496Gk c0496Gk;
        int i2;
        C0543Ih c0543Ih = new C0543Ih(bArr, i);
        while (c0543Ih.A01() >= 48 && c0543Ih.A04(8) == 15) {
            A0C(c0543Ih, this.A06);
        }
        if (this.A06.A01 == null) {
            return Collections.emptyList();
        }
        if (this.A06.A00 != null) {
            c0496Gk = this.A06.A00;
        } else {
            c0496Gk = this.A05;
        }
        if (this.A00 == null || c0496Gk.A05 + 1 != this.A00.getWidth() || c0496Gk.A00 + 1 != this.A00.getHeight()) {
            this.A00 = Bitmap.createBitmap(c0496Gk.A05 + 1, c0496Gk.A00 + 1, Bitmap.Config.ARGB_8888);
            this.A01.setBitmap(this.A00);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C0499Gn> sparseArray = this.A06.A01.A03;
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            C0499Gn c0499GnValueAt = sparseArray.valueAt(i3);
            C0500Go c0500Go = this.A06.A08.get(sparseArray.keyAt(i3));
            int i4 = c0499GnValueAt.A00 + c0496Gk.A02;
            int i5 = c0499GnValueAt.A01 + c0496Gk.A04;
            this.A01.clipRect(i4, i5, Math.min(c0500Go.A08 + i4, c0496Gk.A01), Math.min(c0500Go.A02 + i5, c0496Gk.A03), Region.Op.REPLACE);
            C0495Gj c0495Gj = this.A06.A06.get(c0500Go.A00);
            if (c0495Gj == null && (c0495Gj = this.A06.A04.get(c0500Go.A00)) == null) {
                c0495Gj = this.A04;
            }
            SparseArray<C0501Gp> sparseArray2 = c0500Go.A09;
            for (int i6 = 0; i6 < sparseArray2.size(); i6++) {
                int iKeyAt = sparseArray2.keyAt(i6);
                C0501Gp c0501GpValueAt = sparseArray2.valueAt(i6);
                C0497Gl c0497Gl = this.A06.A07.get(iKeyAt);
                if (c0497Gl == null) {
                    c0497Gl = this.A06.A05.get(iKeyAt);
                }
                if (c0497Gl != null) {
                    A0B(c0497Gl, c0495Gj, c0500Go.A01, i4 + c0501GpValueAt.A02, i5 + c0501GpValueAt.A05, c0497Gl.A01 ? null : this.A02, this.A01);
                }
            }
            if (c0500Go.A0A) {
                if (c0500Go.A01 == 3) {
                    i2 = c0495Gj.A03[c0500Go.A07];
                } else if (c0500Go.A01 == 2) {
                    i2 = c0495Gj.A02[c0500Go.A06];
                } else {
                    i2 = c0495Gj.A01[c0500Go.A05];
                }
                this.A03.setColor(i2);
                this.A01.drawRect(i4, i5, c0500Go.A08 + i4, c0500Go.A02 + i5, this.A03);
            }
            arrayList.add(new GX(Bitmap.createBitmap(this.A00, i4, i5, c0500Go.A08, c0500Go.A02), i4 / c0496Gk.A05, 0, i5 / c0496Gk.A00, 0, c0500Go.A08 / c0496Gk.A05, c0500Go.A02 / c0496Gk.A00));
            this.A01.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    public final void A0J() {
        this.A06.A00();
    }
}
