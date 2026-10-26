package com.facebook.imagepipeline.producers;

/* loaded from: classes.dex */
public final class a1 {
    public static int a(int i) {
        return (int) (i * 1.3333334f);
    }

    public static boolean b(int i, int i2, d.a.e.d.e eVar) {
        int iA = a(i);
        return eVar == null ? ((float) iA) >= 2048.0f && a(i2) >= 2048 : iA >= eVar.a && a(i2) >= eVar.f2512b;
    }

    public static boolean c(d.a.e.j.e eVar, d.a.e.d.e eVar2) {
        int iN;
        int iT;
        if (eVar == null) {
            return false;
        }
        int iQ = eVar.q();
        if (iQ == 90 || iQ == 270) {
            iN = eVar.n();
            iT = eVar.t();
        } else {
            iN = eVar.t();
            iT = eVar.n();
        }
        return b(iN, iT, eVar2);
    }
}
