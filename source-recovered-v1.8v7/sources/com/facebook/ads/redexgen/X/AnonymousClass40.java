package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.40, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class AnonymousClass40 {
    public static byte[] A03;
    public int A00;
    public final Rect A01;
    public final C4G A02;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 60);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A03 = new byte[]{64, 71, 95, 72, 69, 64, 77, 9, 70, 91, 64, 76, 71, 93, 72, 93, 64, 70, 71};
    }

    public abstract int A06();

    public abstract int A07();

    public abstract int A08();

    public abstract int A09();

    public abstract int A0A();

    public abstract int A0B();

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract int A0E(View view);

    public abstract int A0F(View view);

    public abstract int A0G(View view);

    public abstract int A0H(View view);

    public abstract void A0J(int i);

    public AnonymousClass40(C4G c4g) {
        this.A00 = RecyclerView.UNDEFINED_DURATION;
        this.A01 = new Rect();
        this.A02 = c4g;
    }

    public /* synthetic */ AnonymousClass40(C4G c4g, T4 t4) {
        this(c4g);
    }

    public static AnonymousClass40 A00(C4G c4g) {
        return new T4(c4g);
    }

    public static AnonymousClass40 A01(C4G c4g) {
        return new T5(c4g);
    }

    public static AnonymousClass40 A02(C4G c4g, int i) {
        char c2 = i != 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (i != 1) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return A01(c4g);
                case 4:
                    throw new IllegalArgumentException(A03(0, 19, 21));
                case 5:
                    return A00(c4g);
            }
        }
    }

    public final int A05() {
        AnonymousClass40 anonymousClass40 = this;
        int iA0B = 0;
        char c2 = Integer.MIN_VALUE == anonymousClass40.A00 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    iA0B = 0;
                    c2 = 3;
                    break;
                case 3:
                    return iA0B;
                case 4:
                    anonymousClass40 = anonymousClass40;
                    iA0B = anonymousClass40.A0B() - anonymousClass40.A00;
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A0I() {
        this.A00 = A0B();
    }
}
