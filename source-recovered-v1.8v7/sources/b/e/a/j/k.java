package b.e.a.j;

import b.e.a.j.f;

/* loaded from: classes.dex */
public class k {
    static boolean[] a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c4, code lost:
    
        if (r6 != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c6, code lost:
    
        r4.j(r2, 1, r17.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01cf, code lost:
    
        r4.i(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e0, code lost:
    
        if (r6 != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e9, code lost:
    
        if (r6 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f4, code lost:
    
        r7 = r17.D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010f, code lost:
    
        if (r6 != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8 A[PHI: r7
      0x00f8: PHI (r7v38 int) = (r7v31 int), (r7v39 int), (r7v39 int) binds: [B:58:0x00f4, B:33:0x0080, B:27:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void a(int r16, b.e.a.j.f r17) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.a.j.k.a(int, b.e.a.j.f):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[PHI: r11 r12
      0x0034: PHI (r11v18 boolean) = (r11v2 boolean), (r11v21 boolean) binds: [B:25:0x0048, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0034: PHI (r12v9 boolean) = (r12v2 boolean), (r12v12 boolean) binds: [B:25:0x0048, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[PHI: r11 r12
      0x0036: PHI (r11v4 boolean) = (r11v2 boolean), (r11v21 boolean) binds: [B:25:0x0048, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0036: PHI (r12v4 boolean) = (r12v2 boolean), (r12v12 boolean) binds: [B:25:0x0048, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean b(b.e.a.j.g r24, b.e.a.e r25, int r26, int r27, b.e.a.j.d r28) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.a.j.k.b(b.e.a.j.g, b.e.a.e, int, int, b.e.a.j.d):boolean");
    }

    static void c(g gVar, b.e.a.e eVar, f fVar) {
        if (gVar.C[0] != f.b.WRAP_CONTENT && fVar.C[0] == f.b.MATCH_PARENT) {
            int i = fVar.s.e;
            int iD = gVar.D() - fVar.u.e;
            e eVar2 = fVar.s;
            eVar2.i = eVar.r(eVar2);
            e eVar3 = fVar.u;
            eVar3.i = eVar.r(eVar3);
            eVar.f(fVar.s.i, i);
            eVar.f(fVar.u.i, iD);
            fVar.a = 2;
            fVar.f0(i, iD);
        }
        if (gVar.C[1] == f.b.WRAP_CONTENT || fVar.C[1] != f.b.MATCH_PARENT) {
            return;
        }
        int i2 = fVar.t.e;
        int iR = gVar.r() - fVar.v.e;
        e eVar4 = fVar.t;
        eVar4.i = eVar.r(eVar4);
        e eVar5 = fVar.v;
        eVar5.i = eVar.r(eVar5);
        eVar.f(fVar.t.i, i2);
        eVar.f(fVar.v.i, iR);
        if (fVar.Q > 0 || fVar.C() == 8) {
            e eVar6 = fVar.w;
            eVar6.i = eVar.r(eVar6);
            eVar.f(fVar.w.i, fVar.Q + i2);
        }
        fVar.f813b = 2;
        fVar.t0(i2, iR);
    }

    private static boolean d(f fVar, int i) {
        f.b[] bVarArr = fVar.C;
        if (bVarArr[i] != f.b.MATCH_CONSTRAINT) {
            return false;
        }
        if (fVar.G != 0.0f) {
            f.b bVar = bVarArr[i != 0 ? (char) 0 : (char) 1];
            f.b bVar2 = f.b.MATCH_CONSTRAINT;
            return false;
        }
        if (i == 0) {
            if (fVar.e != 0 || fVar.h != 0 || fVar.i != 0) {
                return false;
            }
        } else if (fVar.f != 0 || fVar.k != 0 || fVar.l != 0) {
            return false;
        }
        return true;
    }

    static void e(f fVar, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        fVar.A[i3].f().f = fVar.u().s.f();
        fVar.A[i3].f().g = i2;
        fVar.A[i3].f().f826b = 1;
        fVar.A[i4].f().f = fVar.A[i3].f();
        fVar.A[i4].f().g = fVar.t(i);
        fVar.A[i4].f().f826b = 1;
    }
}
