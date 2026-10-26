package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import com.facebook.ads.redexgen.X.C4Y;
import d.b.a.b.k;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.44, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class AnonymousClass44<VH extends C4Y> {
    public static byte[] A02;
    public final AnonymousClass45 A01 = new AnonymousClass45();
    public boolean A00 = false;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_viewInflaterClass);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{85, 81, 39, 72, 105, 69, 110, 105, 99, 81, 110, 98, 112, 24, 28, 106, 9, 56, 47, 43, 62, 47, 28, 35, 47, 61};
    }

    public abstract VH A0C(ViewGroup viewGroup, int i);

    public abstract int A0D();

    public abstract void A0E(VH vh, int i);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.44 != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4Y> */
    private final void A02(VH holder, int i, List<Object> payloads) {
        A0E(holder, i);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.44 != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4Y> */
    public final int A03(int i) {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.44 != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4Y> */
    public final long A04(int i) {
        return -1L;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.44 != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4Y> */
    public final VH A05(ViewGroup viewGroup, int i) {
        C2I.A01(A00(13, 13, 56));
        VH vh = (VH) A0C(viewGroup, i);
        vh.A00 = i;
        C2I.A00();
        return vh;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.44 != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4Y> */
    public final void A06() {
        this.A01.A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.44 != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4Y> */
    public final void A07(AnonymousClass46 anonymousClass46) {
        this.A01.registerObserver(anonymousClass46);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.44 != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4Y> */
    public final void A08(AnonymousClass46 anonymousClass46) {
        this.A01.unregisterObserver(anonymousClass46);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.44 != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4Y> */
    public final void A09(VH vh, int i) {
        AnonymousClass44<VH> anonymousClass44 = this;
        ViewGroup.LayoutParams layoutParams = null;
        boolean z = false;
        vh.A03 = i;
        char c2 = anonymousClass44.A0A() ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    anonymousClass44 = anonymousClass44;
                    vh = vh;
                    vh.A05 = anonymousClass44.A04(i);
                    c2 = 3;
                    break;
                case 3:
                    anonymousClass44 = anonymousClass44;
                    vh = vh;
                    z = true;
                    vh.A0U(1, 519);
                    C2I.A01(A00(0, 13, k.AppCompatTheme_windowActionModeOverlay));
                    anonymousClass44.A02(vh, i, vh.A0L());
                    vh.A0N();
                    layoutParams = vh.A0H.getLayoutParams();
                    if (!(layoutParams instanceof C4H)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    layoutParams = layoutParams;
                    ((C4H) layoutParams).A01 = z;
                    c2 = 5;
                    break;
                case 5:
                    C2I.A00();
                    return;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.44 != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4Y> */
    public final boolean A0A() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.44 != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.4Y> */
    public final boolean A0B(VH vh) {
        return false;
    }
}
