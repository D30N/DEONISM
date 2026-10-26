package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class H8 {
    public static byte[] A0A;
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public Layout.Alignment A08;
    public SpannableStringBuilder A09;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 68);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A0A = new byte[]{40, 19, 15, 24, 30, 18, 26, 19, 20, 7, 24, 25, 93, 28, 17, 20, 26, 19, 16, 24, 19, 9, 71, 93, 28, 46, 41, 61, 63, 63, 8, 62, 46, 9, 62, 34, 39, 47, 46, 57};
    }

    public H8() {
        A0E();
    }

    private H8 A00() {
        H8 h8 = this;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        char c2 = h8.A08 == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    h8 = h8;
                    h8.A05 = RecyclerView.UNDEFINED_DURATION;
                    c2 = 3;
                    break;
                case 3:
                    return h8;
                case 4:
                    h8 = h8;
                    i3 = H7.A00[h8.A08.ordinal()];
                    i = 1;
                    if (i3 == 1) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i2 = 2;
                    if (i3 == 2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i3 == 3) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    h8 = h8;
                    Log.w(A01(24, 16, 15), A01(0, 24, 57) + h8.A08);
                    h8.A05 = 0;
                    c2 = 3;
                    break;
                case '\b':
                    h8 = h8;
                    h8.A05 = i2;
                    c2 = 3;
                    break;
                case '\t':
                    h8 = h8;
                    h8.A05 = i;
                    c2 = 3;
                    break;
                case '\n':
                    h8 = h8;
                    h8.A05 = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    public final H8 A03(float f) {
        this.A00 = f;
        return this;
    }

    public final H8 A04(float f) {
        this.A01 = f;
        return this;
    }

    public final H8 A05(float f) {
        this.A02 = f;
        return this;
    }

    public final H8 A06(int i) {
        this.A03 = i;
        return this;
    }

    public final H8 A07(int i) {
        this.A04 = i;
        return this;
    }

    public final H8 A08(int i) {
        this.A05 = i;
        return this;
    }

    public final H8 A09(long j) {
        this.A06 = j;
        return this;
    }

    public final H8 A0A(long j) {
        this.A07 = j;
        return this;
    }

    public final H8 A0B(Layout.Alignment alignment) {
        this.A08 = alignment;
        return this;
    }

    public final H8 A0C(SpannableStringBuilder spannableStringBuilder) {
        this.A09 = spannableStringBuilder;
        return this;
    }

    public final C1068bE A0D() {
        if (this.A01 != Float.MIN_VALUE && this.A05 == Integer.MIN_VALUE) {
            A00();
        }
        return new C1068bE(this.A07, this.A06, this.A09, this.A08, this.A00, this.A04, this.A03, this.A01, this.A05, this.A02);
    }

    public final void A0E() {
        this.A07 = 0L;
        this.A06 = 0L;
        this.A09 = null;
        this.A08 = null;
        this.A00 = Float.MIN_VALUE;
        this.A04 = RecyclerView.UNDEFINED_DURATION;
        this.A03 = RecyclerView.UNDEFINED_DURATION;
        this.A01 = Float.MIN_VALUE;
        this.A05 = RecyclerView.UNDEFINED_DURATION;
        this.A02 = Float.MIN_VALUE;
    }
}
