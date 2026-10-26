package d.a.e.n;

import android.graphics.Matrix;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class e {
    public static final d.a.b.d.e<Integer> a = d.a.b.d.e.c(2, 7, 4, 5);

    public static int a(int i) {
        return Math.max(1, 8 / i);
    }

    public static float b(d.a.e.d.e eVar, int i, int i2) {
        if (eVar == null) {
            return 1.0f;
        }
        float f = i;
        float f2 = i2;
        float fMax = Math.max(eVar.a / f, eVar.f2512b / f2);
        float f3 = f * fMax;
        float f4 = eVar.f2513c;
        if (f3 > f4) {
            fMax = f4 / f;
        }
        float f5 = f2 * fMax;
        float f6 = eVar.f2513c;
        return f5 > f6 ? f6 / f2 : fMax;
    }

    private static int c(d.a.e.j.e eVar) {
        int iQ = eVar.q();
        if (iQ == 90 || iQ == 180 || iQ == 270) {
            return eVar.q();
        }
        return 0;
    }

    public static int d(d.a.e.d.f fVar, d.a.e.j.e eVar) {
        int iIndexOf = a.indexOf(Integer.valueOf(eVar.l()));
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Only accepts inverted exif orientations");
        }
        int iD = fVar.f() ? 0 : fVar.d();
        d.a.b.d.e<Integer> eVar2 = a;
        return eVar2.get((iIndexOf + (iD / 90)) % eVar2.size()).intValue();
    }

    public static int e(d.a.e.d.f fVar, d.a.e.j.e eVar) {
        if (!fVar.e()) {
            return 0;
        }
        int iC = c(eVar);
        return fVar.f() ? iC : (iC + fVar.d()) % 360;
    }

    public static int f(d.a.e.d.f fVar, @Nullable d.a.e.d.e eVar, d.a.e.j.e eVar2, boolean z) {
        if (!z || eVar == null) {
            return 8;
        }
        int iE = e(fVar, eVar2);
        int iD = a.contains(Integer.valueOf(eVar2.l())) ? d(fVar, eVar2) : 0;
        boolean z2 = iE == 90 || iE == 270 || iD == 5 || iD == 7;
        int iK = k(b(eVar, z2 ? eVar2.n() : eVar2.t(), z2 ? eVar2.t() : eVar2.n()), eVar.f2514d);
        if (iK > 8) {
            return 8;
        }
        if (iK < 1) {
            return 1;
        }
        return iK;
    }

    @Nullable
    public static Matrix g(d.a.e.j.e eVar, d.a.e.d.f fVar) {
        if (a.contains(Integer.valueOf(eVar.l()))) {
            return h(d(fVar, eVar));
        }
        int iE = e(fVar, eVar);
        if (iE == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(iE);
        return matrix;
    }

    @Nullable
    private static Matrix h(int i) {
        float f;
        Matrix matrix = new Matrix();
        if (i != 2) {
            if (i == 7) {
                f = -90.0f;
            } else if (i == 4) {
                f = 180.0f;
            } else {
                if (i != 5) {
                    return null;
                }
                f = 90.0f;
            }
            matrix.setRotate(f);
            matrix.postScale(-1.0f, 1.0f);
        } else {
            matrix.setScale(-1.0f, 1.0f);
        }
        return matrix;
    }

    public static boolean i(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static boolean j(int i) {
        return i >= 0 && i <= 270 && i % 90 == 0;
    }

    public static int k(float f, float f2) {
        return (int) (f2 + (f * 8.0f));
    }
}
