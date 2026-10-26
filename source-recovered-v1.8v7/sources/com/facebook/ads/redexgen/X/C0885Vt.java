package com.facebook.ads.redexgen.X;

import android.app.KeyguardManager;
import android.content.Context;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0885Vt extends C6U {
    public static byte[] A01;
    public final KeyguardManager A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 113);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A01 = new byte[]{27, 21, 41, 23, 37, 17, 34, 20};
    }

    public C0885Vt(Context context, C02525u c02525u) {
        super(context, c02525u);
        this.A00 = (KeyguardManager) context.getSystemService(A02(0, 8, 63));
    }

    public final InterfaceC02616d A0G() {
        return new C0881Vp(this);
    }

    public final InterfaceC02616d A0H() {
        return new C0882Vq(this);
    }

    public final InterfaceC02616d A0I() {
        return new C0883Vr(this);
    }

    public final InterfaceC02616d A0J() {
        return new C0884Vs(this);
    }
}
