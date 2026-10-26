package com.facebook.ads.redexgen.X;

import android.util.SparseArray;

/* renamed from: com.facebook.ads.redexgen.X.Go, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0500Go {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final SparseArray<C0501Gp> A09;
    public final boolean A0A;

    public C0500Go(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C0501Gp> sparseArray) {
        this.A03 = i;
        this.A0A = z;
        this.A08 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A01 = i5;
        this.A00 = i6;
        this.A07 = i7;
        this.A06 = i8;
        this.A05 = i9;
        this.A09 = sparseArray;
    }

    public final void A00(C0500Go c0500Go) {
        C0500Go c0500Go2 = this;
        int i = 0;
        SparseArray<C0501Gp> sparseArray = null;
        char c2 = c0500Go == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    c0500Go = c0500Go;
                    sparseArray = c0500Go.A09;
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    sparseArray = sparseArray;
                    if (i >= sparseArray.size()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0500Go2 = c0500Go2;
                    sparseArray = sparseArray;
                    c0500Go2.A09.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
                    i++;
                    c2 = 4;
                    break;
                case 6:
                    return;
            }
        }
    }
}
