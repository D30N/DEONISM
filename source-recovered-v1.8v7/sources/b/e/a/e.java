package b.e.a;

import b.e.a.i;
import b.e.a.j.e;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class e {
    private static int p = 1000;
    public static f q;

    /* renamed from: c, reason: collision with root package name */
    private a f786c;
    b[] f;
    final c l;
    private final a o;
    int a = 0;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, i> f785b = null;

    /* renamed from: d, reason: collision with root package name */
    private int f787d = 32;
    private int e = 32;
    public boolean g = false;
    private boolean[] h = new boolean[32];
    int i = 1;
    int j = 0;
    private int k = 32;
    private i[] m = new i[p];
    private int n = 0;

    interface a {
        void a(a aVar);

        void b(i iVar);

        i c(e eVar, boolean[] zArr);

        void clear();

        i getKey();
    }

    public e() {
        this.f = null;
        this.f = new b[32];
        D();
        c cVar = new c();
        this.l = cVar;
        this.f786c = new d(cVar);
        this.o = new b(this.l);
    }

    private final int C(a aVar, boolean z) {
        f fVar = q;
        if (fVar != null) {
            fVar.h++;
        }
        for (int i = 0; i < this.i; i++) {
            this.h[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            f fVar2 = q;
            if (fVar2 != null) {
                fVar2.i++;
            }
            i2++;
            if (i2 >= this.i * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.h[aVar.getKey().f792b] = true;
            }
            i iVarC = aVar.c(this, this.h);
            if (iVarC != null) {
                boolean[] zArr = this.h;
                int i3 = iVarC.f792b;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (iVarC != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.j; i5++) {
                    b bVar = this.f[i5];
                    if (bVar.a.g != i.a.UNRESTRICTED && !bVar.e && bVar.s(iVarC)) {
                        float f2 = bVar.f782d.f(iVarC);
                        if (f2 < 0.0f) {
                            float f3 = (-bVar.f780b) / f2;
                            if (f3 < f) {
                                i4 = i5;
                                f = f3;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    b bVar2 = this.f[i4];
                    bVar2.a.f793c = -1;
                    f fVar3 = q;
                    if (fVar3 != null) {
                        fVar3.j++;
                    }
                    bVar2.v(iVarC);
                    i iVar = bVar2.a;
                    iVar.f793c = i4;
                    iVar.f(bVar2);
                }
            }
            z2 = true;
        }
        return i2;
    }

    private void D() {
        int i = 0;
        while (true) {
            b[] bVarArr = this.f;
            if (i >= bVarArr.length) {
                return;
            }
            b bVar = bVarArr[i];
            if (bVar != null) {
                this.l.a.a(bVar);
            }
            this.f[i] = null;
            i++;
        }
    }

    private final void F(b bVar) {
        if (this.j > 0) {
            bVar.f782d.o(bVar, this.f);
            if (bVar.f782d.a == 0) {
                bVar.e = true;
            }
        }
    }

    private i a(i.a aVar, String str) {
        i iVarB = this.l.f783b.b();
        if (iVarB == null) {
            iVarB = new i(aVar, str);
        } else {
            iVarB.d();
        }
        iVarB.e(aVar, str);
        int i = this.n;
        int i2 = p;
        if (i >= i2) {
            int i3 = i2 * 2;
            p = i3;
            this.m = (i[]) Arrays.copyOf(this.m, i3);
        }
        i[] iVarArr = this.m;
        int i4 = this.n;
        this.n = i4 + 1;
        iVarArr[i4] = iVarB;
        return iVarB;
    }

    private void g(b bVar) {
        bVar.d(this, 0);
    }

    private final void m(b bVar) {
        b[] bVarArr = this.f;
        int i = this.j;
        if (bVarArr[i] != null) {
            this.l.a.a(bVarArr[i]);
        }
        b[] bVarArr2 = this.f;
        int i2 = this.j;
        bVarArr2[i2] = bVar;
        i iVar = bVar.a;
        iVar.f793c = i2;
        this.j = i2 + 1;
        iVar.f(bVar);
    }

    private void o() {
        for (int i = 0; i < this.j; i++) {
            b bVar = this.f[i];
            bVar.a.e = bVar.f780b;
        }
    }

    public static b t(e eVar, i iVar, i iVar2, i iVar3, float f, boolean z) {
        b bVarS = eVar.s();
        if (z) {
            eVar.g(bVarS);
        }
        bVarS.i(iVar, iVar2, iVar3, f);
        return bVarS;
    }

    private int v(a aVar) {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.j) {
                z = false;
                break;
            }
            b[] bVarArr = this.f;
            if (bVarArr[i].a.g != i.a.UNRESTRICTED && bVarArr[i].f780b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            f fVar = q;
            if (fVar != null) {
                fVar.k++;
            }
            i2++;
            float f2 = Float.MAX_VALUE;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            while (i3 < this.j) {
                b bVar = this.f[i3];
                if (bVar.a.g != i.a.UNRESTRICTED && !bVar.e && bVar.f780b < f) {
                    int i7 = 1;
                    while (i7 < this.i) {
                        i iVar = this.l.f784c[i7];
                        float f3 = bVar.f782d.f(iVar);
                        if (f3 > f) {
                            for (int i8 = 0; i8 < 7; i8++) {
                                float f4 = iVar.f[i8] / f3;
                                if ((f4 < f2 && i8 == i6) || i8 > i6) {
                                    i5 = i7;
                                    i6 = i8;
                                    f2 = f4;
                                    i4 = i3;
                                }
                            }
                        }
                        i7++;
                        f = 0.0f;
                    }
                }
                i3++;
                f = 0.0f;
            }
            if (i4 != -1) {
                b bVar2 = this.f[i4];
                bVar2.a.f793c = -1;
                f fVar2 = q;
                if (fVar2 != null) {
                    fVar2.j++;
                }
                bVar2.v(this.l.f784c[i5]);
                i iVar2 = bVar2.a;
                iVar2.f793c = i4;
                iVar2.f(bVar2);
            } else {
                z2 = true;
            }
            if (i2 > this.i / 2) {
                z2 = true;
            }
            f = 0.0f;
        }
        return i2;
    }

    public static f x() {
        return q;
    }

    private void z() {
        int i = this.f787d * 2;
        this.f787d = i;
        this.f = (b[]) Arrays.copyOf(this.f, i);
        c cVar = this.l;
        cVar.f784c = (i[]) Arrays.copyOf(cVar.f784c, this.f787d);
        int i2 = this.f787d;
        this.h = new boolean[i2];
        this.e = i2;
        this.k = i2;
        f fVar = q;
        if (fVar != null) {
            fVar.f790d++;
            fVar.o = Math.max(fVar.o, i2);
            f fVar2 = q;
            fVar2.A = fVar2.o;
        }
    }

    public void A() {
        f fVar = q;
        if (fVar != null) {
            fVar.e++;
        }
        if (this.g) {
            f fVar2 = q;
            if (fVar2 != null) {
                fVar2.q++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.j) {
                    z = true;
                    break;
                } else if (!this.f[i].e) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                f fVar3 = q;
                if (fVar3 != null) {
                    fVar3.p++;
                }
                o();
                return;
            }
        }
        B(this.f786c);
    }

    void B(a aVar) {
        f fVar = q;
        if (fVar != null) {
            fVar.s++;
            fVar.t = Math.max(fVar.t, this.i);
            f fVar2 = q;
            fVar2.u = Math.max(fVar2.u, this.j);
        }
        F((b) aVar);
        v(aVar);
        C(aVar, false);
        o();
    }

    public void E() {
        c cVar;
        int i = 0;
        while (true) {
            cVar = this.l;
            i[] iVarArr = cVar.f784c;
            if (i >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.d();
            }
            i++;
        }
        cVar.f783b.c(this.m, this.n);
        this.n = 0;
        Arrays.fill(this.l.f784c, (Object) null);
        HashMap<String, i> map = this.f785b;
        if (map != null) {
            map.clear();
        }
        this.a = 0;
        this.f786c.clear();
        this.i = 1;
        for (int i2 = 0; i2 < this.j; i2++) {
            this.f[i2].f781c = false;
        }
        D();
        this.j = 0;
    }

    public void b(b.e.a.j.f fVar, b.e.a.j.f fVar2, float f, int i) {
        i iVarR = r(fVar.h(e.d.LEFT));
        i iVarR2 = r(fVar.h(e.d.TOP));
        i iVarR3 = r(fVar.h(e.d.RIGHT));
        i iVarR4 = r(fVar.h(e.d.BOTTOM));
        i iVarR5 = r(fVar2.h(e.d.LEFT));
        i iVarR6 = r(fVar2.h(e.d.TOP));
        i iVarR7 = r(fVar2.h(e.d.RIGHT));
        i iVarR8 = r(fVar2.h(e.d.BOTTOM));
        b bVarS = s();
        double d2 = f;
        double dSin = Math.sin(d2);
        double d3 = i;
        Double.isNaN(d3);
        bVarS.p(iVarR2, iVarR4, iVarR6, iVarR8, (float) (dSin * d3));
        d(bVarS);
        b bVarS2 = s();
        double dCos = Math.cos(d2);
        Double.isNaN(d3);
        bVarS2.p(iVarR, iVarR3, iVarR5, iVarR7, (float) (dCos * d3));
        d(bVarS2);
    }

    public void c(i iVar, i iVar2, int i, float f, i iVar3, i iVar4, int i2, int i3) {
        b bVarS = s();
        bVarS.g(iVar, iVar2, i, f, iVar3, iVar4, i2);
        if (i3 != 6) {
            bVarS.d(this, i3);
        }
        d(bVarS);
    }

    public void d(b bVar) {
        i iVarU;
        if (bVar == null) {
            return;
        }
        f fVar = q;
        if (fVar != null) {
            fVar.f++;
            if (bVar.e) {
                fVar.g++;
            }
        }
        boolean z = true;
        if (this.j + 1 >= this.k || this.i + 1 >= this.e) {
            z();
        }
        boolean z2 = false;
        if (!bVar.e) {
            F(bVar);
            if (bVar.t()) {
                return;
            }
            bVar.q();
            if (bVar.f(this)) {
                i iVarQ = q();
                bVar.a = iVarQ;
                m(bVar);
                this.o.a(bVar);
                C(this.o, true);
                if (iVarQ.f793c == -1) {
                    if (bVar.a == iVarQ && (iVarU = bVar.u(iVarQ)) != null) {
                        f fVar2 = q;
                        if (fVar2 != null) {
                            fVar2.j++;
                        }
                        bVar.v(iVarU);
                    }
                    if (!bVar.e) {
                        bVar.a.f(bVar);
                    }
                    this.j--;
                }
            } else {
                z = false;
            }
            if (!bVar.r()) {
                return;
            } else {
                z2 = z;
            }
        }
        if (z2) {
            return;
        }
        m(bVar);
    }

    public b e(i iVar, i iVar2, int i, int i2) {
        b bVarS = s();
        bVarS.m(iVar, iVar2, i);
        if (i2 != 6) {
            bVarS.d(this, i2);
        }
        d(bVarS);
        return bVarS;
    }

    public void f(i iVar, int i) {
        b bVarS;
        int i2 = iVar.f793c;
        if (i2 != -1) {
            b bVar = this.f[i2];
            if (!bVar.e) {
                if (bVar.f782d.a == 0) {
                    bVar.e = true;
                } else {
                    bVarS = s();
                    bVarS.l(iVar, i);
                }
            }
            bVar.f780b = i;
            return;
        }
        bVarS = s();
        bVarS.h(iVar, i);
        d(bVarS);
    }

    public void h(i iVar, i iVar2, boolean z) {
        b bVarS = s();
        i iVarU = u();
        iVarU.f794d = 0;
        bVarS.n(iVar, iVar2, iVarU, 0);
        if (z) {
            n(bVarS, (int) (bVarS.f782d.f(iVarU) * (-1.0f)), 1);
        }
        d(bVarS);
    }

    public void i(i iVar, i iVar2, int i, int i2) {
        b bVarS = s();
        i iVarU = u();
        iVarU.f794d = 0;
        bVarS.n(iVar, iVar2, iVarU, i);
        if (i2 != 6) {
            n(bVarS, (int) (bVarS.f782d.f(iVarU) * (-1.0f)), i2);
        }
        d(bVarS);
    }

    public void j(i iVar, i iVar2, boolean z) {
        b bVarS = s();
        i iVarU = u();
        iVarU.f794d = 0;
        bVarS.o(iVar, iVar2, iVarU, 0);
        if (z) {
            n(bVarS, (int) (bVarS.f782d.f(iVarU) * (-1.0f)), 1);
        }
        d(bVarS);
    }

    public void k(i iVar, i iVar2, int i, int i2) {
        b bVarS = s();
        i iVarU = u();
        iVarU.f794d = 0;
        bVarS.o(iVar, iVar2, iVarU, i);
        if (i2 != 6) {
            n(bVarS, (int) (bVarS.f782d.f(iVarU) * (-1.0f)), i2);
        }
        d(bVarS);
    }

    public void l(i iVar, i iVar2, i iVar3, i iVar4, float f, int i) {
        b bVarS = s();
        bVarS.j(iVar, iVar2, iVar3, iVar4, f);
        if (i != 6) {
            bVarS.d(this, i);
        }
        d(bVarS);
    }

    void n(b bVar, int i, int i2) {
        bVar.e(p(i2, null), i);
    }

    public i p(int i, String str) {
        f fVar = q;
        if (fVar != null) {
            fVar.l++;
        }
        if (this.i + 1 >= this.e) {
            z();
        }
        i iVarA = a(i.a.ERROR, str);
        int i2 = this.a + 1;
        this.a = i2;
        this.i++;
        iVarA.f792b = i2;
        iVarA.f794d = i;
        this.l.f784c[i2] = iVarA;
        this.f786c.b(iVarA);
        return iVarA;
    }

    public i q() {
        f fVar = q;
        if (fVar != null) {
            fVar.n++;
        }
        if (this.i + 1 >= this.e) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i = this.a + 1;
        this.a = i;
        this.i++;
        iVarA.f792b = i;
        this.l.f784c[i] = iVarA;
        return iVarA;
    }

    public i r(Object obj) {
        i iVarG = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            z();
        }
        if (obj instanceof b.e.a.j.e) {
            b.e.a.j.e eVar = (b.e.a.j.e) obj;
            iVarG = eVar.g();
            if (iVarG == null) {
                eVar.n(this.l);
                iVarG = eVar.g();
            }
            int i = iVarG.f792b;
            if (i == -1 || i > this.a || this.l.f784c[i] == null) {
                if (iVarG.f792b != -1) {
                    iVarG.d();
                }
                int i2 = this.a + 1;
                this.a = i2;
                this.i++;
                iVarG.f792b = i2;
                iVarG.g = i.a.UNRESTRICTED;
                this.l.f784c[i2] = iVarG;
            }
        }
        return iVarG;
    }

    public b s() {
        b bVarB = this.l.a.b();
        if (bVarB == null) {
            bVarB = new b(this.l);
        } else {
            bVarB.w();
        }
        i.b();
        return bVarB;
    }

    public i u() {
        f fVar = q;
        if (fVar != null) {
            fVar.m++;
        }
        if (this.i + 1 >= this.e) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i = this.a + 1;
        this.a = i;
        this.i++;
        iVarA.f792b = i;
        this.l.f784c[i] = iVarA;
        return iVarA;
    }

    public c w() {
        return this.l;
    }

    public int y(Object obj) {
        i iVarG = ((b.e.a.j.e) obj).g();
        if (iVarG != null) {
            return (int) (iVarG.e + 0.5f);
        }
        return 0;
    }
}
