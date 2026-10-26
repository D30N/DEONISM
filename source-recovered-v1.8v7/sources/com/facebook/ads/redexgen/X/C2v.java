package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.support.annotation.NonNull;
import android.view.Display;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.2v, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2v {
    public static final C01772u A00;

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            A00 = new C0P() { // from class: com.facebook.ads.redexgen.X.04
            };
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            A00 = new C0P();
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            A00 = new C0Z();
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C01060b();
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            A00 = new AnonymousClass19();
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            A00 = new C2A();
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            A00 = new C3X();
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            A00 = new C0461Ez();
        } else if (Build.VERSION.SDK_INT >= 15) {
            A00 = new C0801Sl();
        } else {
            A00 = new C01772u();
        }
    }

    public static int A00(View view) {
        return A00.A03(view);
    }

    public static int A01(View view) {
        return A00.A04(view);
    }

    public static int A02(View view) {
        return A00.A05(view);
    }

    public static int A03(View view) {
        return A00.A06(view);
    }

    public static Display A04(@NonNull View view) {
        return A00.A07(view);
    }

    public static C3C A05(View view, C3C c3c) {
        return A00.A08(view, c3c);
    }

    public static C3C A06(View view, C3C c3c) {
        return A00.A09(view, c3c);
    }

    public static void A07(View view) {
        A00.A0A(view);
    }

    public static void A08(@NonNull View view) {
        A00.A0B(view);
    }

    public static void A09(View view, int i) {
        A00.A0C(view, i);
    }

    public static void A0A(View view, C2Z c2z) {
        A00.A0D(view, c2z);
    }

    public static void A0B(View view, InterfaceC01622f interfaceC01622f) {
        A00.A0E(view, interfaceC01622f);
    }

    public static void A0C(View view, Runnable runnable) {
        A00.A0F(view, runnable);
    }

    public static void A0D(View view, Runnable runnable, long j) {
        A00.A0G(view, runnable, j);
    }

    public static boolean A0E(View view) {
        return A00.A0J(view);
    }

    public static boolean A0F(View view) {
        return A00.A0H(view);
    }
}
