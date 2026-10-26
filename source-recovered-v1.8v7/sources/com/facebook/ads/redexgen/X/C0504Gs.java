package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Gs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0504Gs {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final C0544Ii A07 = new C0544Ii();
    public final int[] A08 = new int[256];

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C0544Ii c0544Ii, int i) {
        C0504Gs c0504Gs = this;
        int bytesToRead = 0;
        int iA0G = 0;
        int iA07 = 0;
        int i2 = 0;
        boolean z = false;
        char c2 = i < 4 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Z(3);
                    if ((c0544Ii.A0E() & 128) == 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    i2 = i - 4;
                    if (!z) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i2 >= 7) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return;
                case '\b':
                    z = false;
                    c2 = 5;
                    break;
                case '\t':
                    c0544Ii = c0544Ii;
                    iA0G = c0544Ii.A0G();
                    if (iA0G >= 4) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    return;
                case 11:
                    c0504Gs = c0504Gs;
                    c0544Ii = c0544Ii;
                    c0504Gs.A01 = c0544Ii.A0I();
                    c0504Gs.A00 = c0544Ii.A0I();
                    c0504Gs.A07.A0W(iA0G - 4);
                    i2 -= 7;
                    c2 = '\f';
                    break;
                case '\f':
                    c0504Gs = c0504Gs;
                    bytesToRead = c0504Gs.A07.A06();
                    iA07 = c0504Gs.A07.A07();
                    if (bytesToRead >= iA07) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    if (i2 <= 0) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c0504Gs = c0504Gs;
                    c0544Ii = c0544Ii;
                    int iMin = Math.min(i2, iA07 - bytesToRead);
                    c0544Ii.A0c(c0504Gs.A07.A00, bytesToRead, iMin);
                    c0504Gs.A07.A0Y(bytesToRead + iMin);
                    c2 = 15;
                    break;
                case 15:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(C0544Ii c0544Ii, int i) {
        if (i < 19) {
            return;
        }
        this.A05 = c0544Ii.A0I();
        this.A04 = c0544Ii.A0I();
        c0544Ii.A0Z(11);
        this.A02 = c0544Ii.A0I();
        this.A03 = c0544Ii.A0I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(C0544Ii c0544Ii, int i) {
        C0544Ii c0544Ii2 = c0544Ii;
        int i2 = 0;
        int i3 = 0;
        C0504Gs c0504Gs = this;
        char c2 = i % 5 != 2 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0544Ii2 = c0544Ii2;
                    c0504Gs = c0504Gs;
                    c0544Ii2.A0Z(2);
                    Arrays.fill(c0504Gs.A08, 0);
                    i3 = i / 5;
                    i2 = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i2 >= i3) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0544Ii2 = c0544Ii2;
                    c0504Gs = c0504Gs;
                    int entryCount = c0544Ii2.A0E();
                    int i4 = c0544Ii2.A0E();
                    int iA0E = c0544Ii2.A0E();
                    int iA0E2 = c0544Ii2.A0E();
                    int iA0E3 = c0544Ii2.A0E();
                    int a = iA0E - 128;
                    int i5 = (int) (i4 + (a * 1.402d));
                    int a2 = iA0E2 - 128;
                    double d2 = i4 - (a2 * 0.34414d);
                    int a3 = iA0E - 128;
                    int i6 = (int) (d2 - (a3 * 0.71414d));
                    int g = iA0E2 - 128;
                    int i7 = (int) (i4 + (g * 1.772d));
                    int[] iArr = c0504Gs.A08;
                    int g2 = C0560Iy.A06(i5, 0, 255);
                    int i8 = (iA0E3 << 24) | (g2 << 16);
                    int g3 = C0560Iy.A06(i6, 0, 255);
                    int i9 = i8 | (g3 << 8);
                    int g4 = C0560Iy.A06(i7, 0, 255);
                    iArr[entryCount] = i9 | g4;
                    i2++;
                    c2 = 4;
                    break;
                case 6:
                    c0504Gs.A06 = true;
                    return;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:20:0x003b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.X.GX A06() {
        /*
            r11 = this;
            int r0 = r11.A05
            if (r0 == 0) goto L2a
            int r0 = r11.A04
            if (r0 == 0) goto L2a
            int r0 = r11.A01
            if (r0 == 0) goto L2a
            int r0 = r11.A00
            if (r0 == 0) goto L2a
            com.facebook.ads.redexgen.X.Ii r0 = r11.A07
            int r0 = r0.A07()
            if (r0 == 0) goto L2a
            com.facebook.ads.redexgen.X.Ii r0 = r11.A07
            int r1 = r0.A06()
            com.facebook.ads.redexgen.X.Ii r0 = r11.A07
            int r0 = r0.A07()
            if (r1 != r0) goto L2a
            boolean r0 = r11.A06
            if (r0 != 0) goto L2c
        L2a:
            r0 = 0
            return r0
        L2c:
            com.facebook.ads.redexgen.X.Ii r1 = r11.A07
            r0 = 0
            r1.A0Y(r0)
            int r1 = r11.A01
            int r0 = r11.A00
            int r1 = r1 * r0
            int[] r3 = new int[r1]
            r4 = 0
        L3a:
            int r0 = r3.length
            if (r4 >= r0) goto L80
            com.facebook.ads.redexgen.X.Ii r0 = r11.A07
            int r2 = r0.A0E()
            if (r2 == 0) goto L4f
            int r1 = r4 + 1
            int[] r0 = r11.A08
            r0 = r0[r2]
            r3[r4] = r0
            r4 = r1
            goto L3a
        L4f:
            com.facebook.ads.redexgen.X.Ii r0 = r11.A07
            int r2 = r0.A0E()
            if (r2 == 0) goto L3a
            r0 = r2 & 64
            if (r0 != 0) goto L74
            r1 = r2 & 63
        L5d:
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L69
            r2 = 0
        L62:
            int r0 = r4 + r1
            java.util.Arrays.fill(r3, r4, r0, r2)
            int r4 = r4 + r1
            goto L3a
        L69:
            int[] r2 = r11.A08
            com.facebook.ads.redexgen.X.Ii r0 = r11.A07
            int r0 = r0.A0E()
            r2 = r2[r0]
            goto L62
        L74:
            r0 = r2 & 63
            int r1 = r0 << 8
            com.facebook.ads.redexgen.X.Ii r0 = r11.A07
            int r0 = r0.A0E()
            r1 = r1 | r0
            goto L5d
        L80:
            int r2 = r11.A01
            int r1 = r11.A00
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r3, r2, r1, r0)
            com.facebook.ads.redexgen.X.GX r3 = new com.facebook.ads.redexgen.X.GX
            int r0 = r11.A02
            float r5 = (float) r0
            int r2 = r11.A05
            float r0 = (float) r2
            float r5 = r5 / r0
            r6 = 0
            int r0 = r11.A03
            float r7 = (float) r0
            int r1 = r11.A04
            float r0 = (float) r1
            float r7 = r7 / r0
            r8 = 0
            int r0 = r11.A01
            float r9 = (float) r0
            float r0 = (float) r2
            float r9 = r9 / r0
            int r0 = r11.A00
            float r10 = (float) r0
            float r0 = (float) r1
            float r10 = r10 / r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0504Gs.A06():com.facebook.ads.redexgen.X.GX");
    }

    public final void A07() {
        this.A05 = 0;
        this.A04 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A07.A0W(0);
        this.A06 = false;
    }
}
