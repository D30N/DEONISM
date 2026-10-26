package b.e.a.j;

import b.e.a.j.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a {
    public static void a(g gVar) {
        if ((gVar.R0() & 32) != 32) {
            j(gVar);
            return;
        }
        gVar.D0 = true;
        gVar.x0 = false;
        gVar.y0 = false;
        gVar.z0 = false;
        ArrayList<f> arrayList = gVar.k0;
        List<h> list = gVar.w0;
        boolean z = gVar.s() == f.b.WRAP_CONTENT;
        boolean z2 = gVar.B() == f.b.WRAP_CONTENT;
        boolean z3 = z || z2;
        list.clear();
        for (f fVar : arrayList) {
            fVar.p = null;
            fVar.d0 = false;
            fVar.S();
        }
        for (f fVar2 : arrayList) {
            if (fVar2.p == null && !b(fVar2, list, z3)) {
                j(gVar);
                gVar.D0 = false;
                return;
            }
        }
        int iMax = 0;
        int iMax2 = 0;
        for (h hVar : list) {
            iMax = Math.max(iMax, c(hVar, 0));
            iMax2 = Math.max(iMax2, c(hVar, 1));
        }
        if (z) {
            gVar.g0(f.b.FIXED);
            gVar.y0(iMax);
            gVar.x0 = true;
            gVar.y0 = true;
            gVar.A0 = iMax;
        }
        if (z2) {
            gVar.u0(f.b.FIXED);
            gVar.b0(iMax2);
            gVar.x0 = true;
            gVar.z0 = true;
            gVar.B0 = iMax2;
        }
        i(list, 0, gVar.D());
        i(list, 1, gVar.r());
    }

    private static boolean b(f fVar, List<h> list, boolean z) {
        h hVar = new h(new ArrayList(), true);
        list.add(hVar);
        return k(fVar, hVar, list, z);
    }

    private static int c(h hVar, int i) {
        int i2 = i * 2;
        List<f> listB = hVar.b(i);
        int size = listB.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            f fVar = listB.get(i3);
            e[] eVarArr = fVar.A;
            int i4 = i2 + 1;
            iMax = Math.max(iMax, d(fVar, i, eVarArr[i4].f803d == null || !(eVarArr[i2].f803d == null || eVarArr[i4].f803d == null), 0));
        }
        hVar.e[i] = iMax;
        return iMax;
    }

    private static int d(f fVar, int i, boolean z, int i2) {
        int iR;
        int iJ;
        int i3;
        int i4;
        int i5;
        int iD;
        int i6;
        int i7;
        int i8;
        int iMax = 0;
        if (!fVar.b0) {
            return 0;
        }
        boolean z2 = fVar.w.f803d != null && i == 1;
        if (z) {
            iR = fVar.j();
            iJ = fVar.r() - fVar.j();
            i4 = i * 2;
            i3 = i4 + 1;
        } else {
            iR = fVar.r() - fVar.j();
            iJ = fVar.j();
            i3 = i * 2;
            i4 = i3 + 1;
        }
        e[] eVarArr = fVar.A;
        if (eVarArr[i3].f803d == null || eVarArr[i4].f803d != null) {
            i5 = 1;
        } else {
            i5 = -1;
            int i9 = i3;
            i3 = i4;
            i4 = i9;
        }
        int i10 = z2 ? i2 - iR : i2;
        int iD2 = (fVar.A[i4].d() * i5) + e(fVar, i);
        int i11 = i10 + iD2;
        int iD3 = (i == 0 ? fVar.D() : fVar.r()) * i5;
        Iterator<n> it = fVar.A[i4].f().a.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, d(((l) it.next()).f823c.f801b, i, z, i11));
        }
        int iMax2 = 0;
        for (Iterator<n> it2 = fVar.A[i3].f().a.iterator(); it2.hasNext(); it2 = it2) {
            iMax2 = Math.max(iMax2, d(((l) it2.next()).f823c.f801b, i, z, iD3 + i11));
        }
        if (z2) {
            iMax -= iR;
            iD = iMax2 + iJ;
        } else {
            iD = iMax2 + ((i == 0 ? fVar.D() : fVar.r()) * i5);
        }
        int i12 = 1;
        if (i == 1) {
            Iterator<n> it3 = fVar.w.f().a.iterator();
            int iMax3 = 0;
            while (it3.hasNext()) {
                Iterator<n> it4 = it3;
                l lVar = (l) it3.next();
                if (i5 == i12) {
                    iMax3 = Math.max(iMax3, d(lVar.f823c.f801b, i, z, iR + i11));
                    i8 = i3;
                } else {
                    i8 = i3;
                    iMax3 = Math.max(iMax3, d(lVar.f823c.f801b, i, z, (iJ * i5) + i11));
                }
                it3 = it4;
                i3 = i8;
                i12 = 1;
            }
            i6 = i3;
            int i13 = iMax3;
            i7 = (fVar.w.f().a.size() <= 0 || z2) ? i13 : i5 == 1 ? i13 + iR : i13 - iJ;
        } else {
            i6 = i3;
            i7 = 0;
        }
        int iMax4 = iD2 + Math.max(iMax, Math.max(iD, i7));
        int i14 = iD3 + i11;
        if (i5 == -1) {
            i14 = i11;
            i11 = i14;
        }
        if (z) {
            k.e(fVar, i, i11);
            fVar.Z(i11, i14, i);
        } else {
            fVar.p.a(fVar, i);
            fVar.q0(i11, i);
        }
        if (fVar.o(i) == f.b.MATCH_CONSTRAINT && fVar.G != 0.0f) {
            fVar.p.a(fVar, i);
        }
        e[] eVarArr2 = fVar.A;
        if (eVarArr2[i4].f803d != null && eVarArr2[i6].f803d != null) {
            f fVarU = fVar.u();
            e[] eVarArr3 = fVar.A;
            if (eVarArr3[i4].f803d.f801b == fVarU && eVarArr3[i6].f803d.f801b == fVarU) {
                fVar.p.a(fVar, i);
            }
        }
        return iMax4;
    }

    private static int e(f fVar, int i) {
        e eVar;
        int i2 = i * 2;
        e[] eVarArr = fVar.A;
        e eVar2 = eVarArr[i2];
        e eVar3 = eVarArr[i2 + 1];
        e eVar4 = eVar2.f803d;
        if (eVar4 == null) {
            return 0;
        }
        f fVar2 = eVar4.f801b;
        f fVar3 = fVar.D;
        if (fVar2 != fVar3 || (eVar = eVar3.f803d) == null || eVar.f801b != fVar3) {
            return 0;
        }
        return (int) ((((fVar3.t(i) - eVar2.d()) - eVar3.d()) - fVar.t(i)) * (i == 0 ? fVar.V : fVar.W));
    }

    private static void f(g gVar, f fVar, h hVar) {
        hVar.f822d = false;
        gVar.D0 = false;
        fVar.b0 = false;
    }

    private static int g(f fVar) {
        if (fVar.s() == f.b.MATCH_CONSTRAINT) {
            int iR = (int) (fVar.H == 0 ? fVar.r() * fVar.G : fVar.r() / fVar.G);
            fVar.y0(iR);
            return iR;
        }
        if (fVar.B() != f.b.MATCH_CONSTRAINT) {
            return -1;
        }
        int iD = (int) (fVar.H == 1 ? fVar.D() * fVar.G : fVar.D() / fVar.G);
        fVar.b0(iD);
        return iD;
    }

    private static void h(e eVar) {
        l lVarF = eVar.f();
        e eVar2 = eVar.f803d;
        if (eVar2 == null || eVar2.f803d == eVar) {
            return;
        }
        eVar2.f().a(lVarF);
    }

    public static void i(List<h> list, int i, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            for (f fVar : list.get(i3).c(i)) {
                if (fVar.b0) {
                    l(fVar, i, i2);
                }
            }
        }
    }

    private static void j(g gVar) {
        gVar.w0.clear();
        gVar.w0.add(0, new h(gVar.k0));
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean k(b.e.a.j.f r8, b.e.a.j.h r9, java.util.List<b.e.a.j.h> r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.a.j.a.k(b.e.a.j.f, b.e.a.j.h, java.util.List, boolean):boolean");
    }

    private static void l(f fVar, int i, int i2) {
        int i3 = i * 2;
        e[] eVarArr = fVar.A;
        e eVar = eVarArr[i3];
        e eVar2 = eVarArr[i3 + 1];
        if ((eVar.f803d == null || eVar2.f803d == null) ? false : true) {
            k.e(fVar, i, e(fVar, i) + eVar.d());
            return;
        }
        if (fVar.G == 0.0f || fVar.o(i) != f.b.MATCH_CONSTRAINT) {
            int iV = i2 - fVar.v(i);
            int iT = iV - fVar.t(i);
            fVar.Z(iT, iV, i);
            k.e(fVar, i, iT);
            return;
        }
        int iG = g(fVar);
        int i4 = (int) fVar.A[i3].f().g;
        eVar2.f().f = eVar.f();
        eVar2.f().g = iG;
        eVar2.f().f826b = 1;
        fVar.Z(i4, i4 + iG, i);
    }
}
