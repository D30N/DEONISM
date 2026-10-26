package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class L1 {
    public static final ThreadLocal<L1> A01 = new ThreadLocal<>();
    public final C0597Kk A00 = new C0597Kk();

    public static C0597Kk A00() {
        return A02().A00;
    }

    public static C0597Kk A01(L0 l0) {
        C0597Kk c0597Kk = new C0597Kk(A00());
        c0597Kk.add(l0);
        return c0597Kk;
    }

    public static L1 A02() {
        L1 l1 = A01.get();
        if (l1 == null) {
            L1 l12 = new L1();
            A01.set(l12);
            return l12;
        }
        return l1;
    }

    public static void A03(AbstractRunnableC0608Kw abstractRunnableC0608Kw) {
        C0597Kk createRunnableAsyncStackTrace = abstractRunnableC0608Kw.A05();
        if (createRunnableAsyncStackTrace != null) {
            A02().A00.addAll(createRunnableAsyncStackTrace);
        }
    }

    public static void A04(AbstractRunnableC0608Kw abstractRunnableC0608Kw) {
        C0597Kk createRunnableAsyncStackTrace = abstractRunnableC0608Kw.A05();
        if (createRunnableAsyncStackTrace != null) {
            A02().A00.removeAll(createRunnableAsyncStackTrace);
        }
    }
}
