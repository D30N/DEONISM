package d.a.e.n;

import d.a.b.d.i;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class a {
    public static float a(d.a.e.d.f fVar, @Nullable d.a.e.d.e eVar, d.a.e.j.e eVar2) {
        i.b(d.a.e.j.e.v(eVar2));
        if (eVar == null || eVar.f2512b <= 0 || eVar.a <= 0 || eVar2.t() == 0 || eVar2.n() == 0) {
            return 1.0f;
        }
        int iD = d(fVar, eVar2);
        boolean z = iD == 90 || iD == 270;
        int iN = z ? eVar2.n() : eVar2.t();
        int iT = z ? eVar2.t() : eVar2.n();
        float f = eVar.a / iN;
        float f2 = eVar.f2512b / iT;
        float fMax = Math.max(f, f2);
        d.a.b.e.a.t("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(eVar.a), Integer.valueOf(eVar.f2512b), Integer.valueOf(iN), Integer.valueOf(iT), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(fMax));
        return fMax;
    }

    public static int b(d.a.e.d.f fVar, @Nullable d.a.e.d.e eVar, d.a.e.j.e eVar2, int i) {
        if (!d.a.e.j.e.v(eVar2)) {
            return 1;
        }
        float fA = a(fVar, eVar, eVar2);
        int iF = eVar2.o() == com.facebook.imageformat.b.a ? f(fA) : e(fA);
        int iMax = Math.max(eVar2.n(), eVar2.t());
        float f = eVar != null ? eVar.f2513c : i;
        while (iMax / iF > f) {
            iF = eVar2.o() == com.facebook.imageformat.b.a ? iF * 2 : iF + 1;
        }
        return iF;
    }

    public static int c(d.a.e.j.e eVar, int i, int i2) {
        int iR = eVar.r();
        while ((((eVar.t() * eVar.n()) * i) / iR) / iR > i2) {
            iR *= 2;
        }
        return iR;
    }

    private static int d(d.a.e.d.f fVar, d.a.e.j.e eVar) {
        if (!fVar.f()) {
            return 0;
        }
        int iQ = eVar.q();
        i.b(iQ == 0 || iQ == 90 || iQ == 180 || iQ == 270);
        return iQ;
    }

    public static int e(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            double d2 = i;
            double dPow = Math.pow(d2, 2.0d);
            Double.isNaN(d2);
            Double.isNaN(d2);
            if ((1.0d / d2) + ((1.0d / (dPow - d2)) * 0.3333333432674408d) <= f) {
                return i - 1;
            }
            i++;
        }
    }

    public static int f(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            int i2 = i * 2;
            double d2 = i2;
            Double.isNaN(d2);
            double d3 = 1.0d / d2;
            if (d3 + (0.3333333432674408d * d3) <= f) {
                return i;
            }
            i = i2;
        }
    }
}
