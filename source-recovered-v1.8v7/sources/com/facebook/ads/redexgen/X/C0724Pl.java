package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

@TargetApi(14)
/* renamed from: com.facebook.ads.redexgen.X.Pl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0724Pl {
    public static byte[] A02;
    public final EK A00;
    public final C1081bR A01 = new C1081bR();

    static {
        A02();
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 103);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{117, 123, 119, 117, 37, 50, 57, 51, 50, 37, 50, 37, 30, 57, 51, 50, 47, 117, 119, 109, 119, 117, 90, 95, 72, 1, 15, 3, 1, 64, 66, 86, 80, 70, 1, 3, 25, 3, 1, 89, 0, 86, 91, 82, 71, 0, 2, 24, 2, 0, 26, 69};
    }

    public C0724Pl(XI xi) {
        this.A00 = C03499y.A00(new Y7(xi), new BK(new C1070bG(this.A01)), new Y5());
    }

    @VisibleForTesting
    public static String A01(C03479w c03479w) {
        return A00(39, 11, 69) + c03479w.A01 + A00(0, 22, 48) + c03479w.A00 + A00(25, 14, 68) + c03479w.getCause() + A00(50, 2, 95);
    }

    public static boolean A03() {
        return true;
    }

    public final int A04() {
        return this.A00.A0J();
    }

    public final int A05() {
        return this.A00.A5W();
    }

    public final long A06() {
        return this.A00.A5u();
    }

    public final long A07() {
        return this.A00.A64();
    }

    @Nullable
    public final C0722Pj A08() {
        Format formatA0L = this.A00.A0L();
        if (formatA0L == null) {
            return null;
        }
        return new C0722Pj(formatA0L.A0F, formatA0L.A08);
    }

    public final void A09() {
        this.A00.ACJ();
    }

    public final void A0A() {
        this.A00.ACs();
    }

    public final void A0B() {
        this.A00.A0M();
    }

    public final void A0C(float f) {
        this.A00.A0N(f);
    }

    public final void A0D(long j) {
        this.A00.ACr(j);
    }

    public final void A0E(Context context, Uri uri) {
        C0724Pl c0724Pl = this;
        char c2 = JQ.A1b(context) ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0724Pl = c0724Pl;
                    context = context;
                    uri = uri;
                    c0724Pl.A00.A0P(new C1016aO(C0728Pp.A05(context).A0E(context)).A00(uri));
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c0724Pl = c0724Pl;
                    context = context;
                    uri = uri;
                    c0724Pl.A00.A0P(new C1016aO(new C1083bT(context, C0560Iy.A0N(context, A00(22, 3, 92)), c0724Pl.A01)).A00(uri));
                    c2 = 3;
                    break;
            }
        }
    }

    public final void A0F(@Nullable Surface surface) {
        this.A00.A0O(surface);
    }

    public final void A0G(InterfaceC0721Pi interfaceC0721Pi) {
        this.A00.A3G(new C0521Hk(this, interfaceC0721Pi));
    }

    public final void A0H(InterfaceC0723Pk interfaceC0723Pk) {
        this.A00.A0Q(new Hm(this, interfaceC0723Pk));
    }

    public final void A0I(boolean z) {
        this.A00.AD8(z);
    }

    public final boolean A0J() {
        return this.A00.A6l();
    }

    public final boolean A0K() {
        boolean z = false;
        char c2 = this.A00.A0K() != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }
}
