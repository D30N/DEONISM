package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.4e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02114e {
    public static C2R<C02114e> A03 = new C0797Sg(20);
    public int A00;

    @Nullable
    public C4B A01;

    @Nullable
    public C4B A02;

    public static C02114e A00() {
        C02114e c02114e = null;
        C02114e c02114eA2O = A03.A2O();
        char c2 = c02114eA2O == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c02114e = new C02114e();
                    c2 = 3;
                    break;
                case 3:
                    return c02114e;
                case 4:
                    c02114eA2O = c02114eA2O;
                    c02114e = c02114eA2O;
                    c2 = 3;
                    break;
            }
        }
    }

    public static void A01() {
        while (A03.A2O() != null) {
        }
    }

    public static void A02(C02114e c02114e) {
        c02114e.A00 = 0;
        c02114e.A02 = null;
        c02114e.A01 = null;
        A03.ACM(c02114e);
    }
}
