package com.facebook.ads.redexgen.X;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import d.b.a.b.k;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC01632g {
    public static byte[] A02;
    public DataSetObserver A00;
    public final DataSetObservable A01 = new DataSetObservable();

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 29);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{9, 62, 42, 46, 50, 41, 62, 63, 123, 54, 62, 47, 51, 52, 63, 123, 50, 53, 40, 47, 58, 53, 47, 50, 58, 47, 62, 18, 47, 62, 54, 123, 44, 58, 40, 123, 53, 52, 47, 123, 52, 45, 62, 41, 41, 50, 63, 63, 62, 53, 53, 2, 22, 18, 14, 21, 2, 3, 71, 10, 2, 19, 15, 8, 3, 71, 3, 2, 20, 19, 21, 8, 30, 46, 19, 2, 10, 71, 16, 6, 20, 71, 9, 8, 19, 71, 8, 17, 2, 21, 21, 14, 3, 3, 2, 9};
    }

    public abstract int A05();

    public abstract boolean A0C(View view, Object obj);

    @Deprecated
    private final Object A00(View view, int i) {
        throw new UnsupportedOperationException(A01(0, 50, 70));
    }

    @Deprecated
    private final void A03(View view, int i, Object obj) {
        throw new UnsupportedOperationException(A01(50, 46, k.AppCompatTheme_windowMinWidthMajor));
    }

    public final float A04(int i) {
        return 1.0f;
    }

    public int A06(Object obj) {
        return -1;
    }

    public final Parcelable A07() {
        return null;
    }

    public Object A08(ViewGroup viewGroup, int i) {
        return A00(viewGroup, i);
    }

    public final void A09() {
        synchronized (this) {
            if (this.A00 != null) {
                this.A00.onChanged();
            }
        }
        this.A01.notifyChanged();
    }

    public final void A0A(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.A00 = dataSetObserver;
        }
    }

    public void A0B(ViewGroup viewGroup, int i, Object obj) {
        A03(viewGroup, i, obj);
    }
}
