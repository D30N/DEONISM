package com.facebook.ads.redexgen.X;

import android.net.Uri;

/* renamed from: com.facebook.ads.redexgen.X.Fh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0467Fh {
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final Uri[] A03;

    public C0467Fh() {
        this(-1, new int[0], new Uri[0], new long[0]);
    }

    public C0467Fh(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
        IJ.A03(iArr.length == uriArr.length);
        this.A00 = i;
        this.A01 = iArr;
        this.A03 = uriArr;
        this.A02 = jArr;
    }

    public final int A00() {
        return A01(-1);
    }

    public final int A01(int i) {
        C0467Fh c0467Fh = this;
        int[] iArr = null;
        int i2 = i + 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0467Fh = c0467Fh;
                    iArr = c0467Fh.A01;
                    if (i2 >= iArr.length) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    iArr = iArr;
                    if (iArr[i2] == 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    iArr = iArr;
                    if (iArr[i2] != 1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return i2;
                case 6:
                    i2++;
                    c2 = 2;
                    break;
            }
        }
    }

    public final boolean A02() {
        C0467Fh c0467Fh = this;
        boolean z = false;
        char c2 = c0467Fh.A00 != -1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c0467Fh = c0467Fh;
                    if (c0467Fh.A00() >= c0467Fh.A00) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }
}
