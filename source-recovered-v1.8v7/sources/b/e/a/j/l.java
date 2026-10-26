package b.e.a.j;

import b.e.a.j.e;

/* loaded from: classes.dex */
public class l extends n {

    /* renamed from: c, reason: collision with root package name */
    e f823c;

    /* renamed from: d, reason: collision with root package name */
    l f824d;
    float e;
    l f;
    float g;
    private l i;
    int h = 0;
    private m j = null;
    private int k = 1;
    private m l = null;
    private int m = 1;

    public l(e eVar) {
        this.f823c = eVar;
    }

    @Override // b.e.a.j.n
    public void e() {
        super.e();
        this.f824d = null;
        this.e = 0.0f;
        this.j = null;
        this.k = 1;
        this.l = null;
        this.m = 1;
        this.f = null;
        this.g = 0.0f;
        this.i = null;
        this.h = 0;
    }

    @Override // b.e.a.j.n
    public void f() {
        l lVar;
        l lVar2;
        l lVar3;
        l lVar4;
        l lVar5;
        l lVar6;
        float f;
        l lVar7;
        float fD;
        float f2;
        l lVar8;
        float f3;
        boolean z = true;
        if (this.f826b == 1 || this.h == 4) {
            return;
        }
        m mVar = this.j;
        if (mVar != null) {
            if (mVar.f826b != 1) {
                return;
            } else {
                this.e = this.k * mVar.f825c;
            }
        }
        m mVar2 = this.l;
        if (mVar2 != null) {
            if (mVar2.f826b != 1) {
                return;
            } else {
                float f4 = mVar2.f825c;
            }
        }
        if (this.h == 1 && ((lVar8 = this.f824d) == null || lVar8.f826b == 1)) {
            l lVar9 = this.f824d;
            if (lVar9 == null) {
                this.f = this;
                f3 = this.e;
            } else {
                this.f = lVar9.f;
                f3 = lVar9.g + this.e;
            }
            this.g = f3;
            b();
            return;
        }
        if (this.h == 2 && (lVar4 = this.f824d) != null && lVar4.f826b == 1 && (lVar5 = this.i) != null && (lVar6 = lVar5.f824d) != null && lVar6.f826b == 1) {
            if (b.e.a.e.x() != null) {
                b.e.a.e.x().v++;
            }
            this.f = this.f824d.f;
            l lVar10 = this.i;
            lVar10.f = lVar10.f824d.f;
            e.d dVar = this.f823c.f802c;
            int i = 0;
            if (dVar != e.d.RIGHT && dVar != e.d.BOTTOM) {
                z = false;
            }
            if (z) {
                f = this.f824d.g;
                lVar7 = this.i.f824d;
            } else {
                f = this.i.f824d.g;
                lVar7 = this.f824d;
            }
            float f5 = f - lVar7.g;
            e.d dVar2 = this.f823c.f802c;
            if (dVar2 == e.d.LEFT || dVar2 == e.d.RIGHT) {
                fD = f5 - this.f823c.f801b.D();
                f2 = this.f823c.f801b.V;
            } else {
                fD = f5 - r2.f801b.r();
                f2 = this.f823c.f801b.W;
            }
            int iD = this.f823c.d();
            int iD2 = this.i.f823c.d();
            if (this.f823c.i() == this.i.f823c.i()) {
                f2 = 0.5f;
                iD2 = 0;
            } else {
                i = iD;
            }
            float f6 = i;
            float f7 = iD2;
            float f8 = (fD - f6) - f7;
            if (z) {
                l lVar11 = this.i;
                lVar11.g = lVar11.f824d.g + f7 + (f8 * f2);
                this.g = (this.f824d.g - f6) - (f8 * (1.0f - f2));
            } else {
                this.g = this.f824d.g + f6 + (f8 * f2);
                l lVar12 = this.i;
                lVar12.g = (lVar12.f824d.g - f7) - (f8 * (1.0f - f2));
            }
        } else {
            if (this.h != 3 || (lVar = this.f824d) == null || lVar.f826b != 1 || (lVar2 = this.i) == null || (lVar3 = lVar2.f824d) == null || lVar3.f826b != 1) {
                if (this.h == 5) {
                    this.f823c.f801b.U();
                    return;
                }
                return;
            }
            if (b.e.a.e.x() != null) {
                b.e.a.e.x().w++;
            }
            l lVar13 = this.f824d;
            this.f = lVar13.f;
            l lVar14 = this.i;
            l lVar15 = lVar14.f824d;
            lVar14.f = lVar15.f;
            this.g = lVar13.g + this.e;
            lVar14.g = lVar15.g + lVar14.e;
        }
        b();
        this.i.b();
    }

    void g(b.e.a.e eVar) {
        b.e.a.i iVarG = this.f823c.g();
        l lVar = this.f;
        if (lVar == null) {
            eVar.f(iVarG, (int) (this.g + 0.5f));
        } else {
            eVar.e(iVarG, eVar.r(lVar.f823c), (int) (this.g + 0.5f), 6);
        }
    }

    public void h(int i, l lVar, int i2) {
        this.h = i;
        this.f824d = lVar;
        this.e = i2;
        lVar.a(this);
    }

    public void i(l lVar, int i) {
        this.f824d = lVar;
        this.e = i;
        lVar.a(this);
    }

    public void j(l lVar, int i, m mVar) {
        this.f824d = lVar;
        lVar.a(this);
        this.j = mVar;
        this.k = i;
        mVar.a(this);
    }

    public float k() {
        return this.g;
    }

    public void l(l lVar, float f) {
        if (this.f826b == 0 || !(this.f == lVar || this.g == f)) {
            this.f = lVar;
            this.g = f;
            if (this.f826b == 1) {
                c();
            }
            b();
        }
    }

    String m(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public void n(l lVar, float f) {
        this.i = lVar;
    }

    public void o(l lVar, int i, m mVar) {
        this.i = lVar;
        this.l = mVar;
        this.m = i;
    }

    public void p(int i) {
        this.h = i;
    }

    public void q() {
        e eVarI = this.f823c.i();
        if (eVarI == null) {
            return;
        }
        if (eVarI.i() == this.f823c) {
            this.h = 4;
            eVarI.f().h = 4;
        }
        int iD = this.f823c.d();
        e.d dVar = this.f823c.f802c;
        if (dVar == e.d.RIGHT || dVar == e.d.BOTTOM) {
            iD = -iD;
        }
        i(eVarI.f(), iD);
    }

    public String toString() {
        StringBuilder sb;
        String str;
        if (this.f826b != 1) {
            sb = new StringBuilder();
            sb.append("{ ");
            sb.append(this.f823c);
            str = " UNRESOLVED} type: ";
        } else if (this.f == this) {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f823c);
            sb.append(", RESOLVED: ");
            sb.append(this.g);
            str = "]  type: ";
        } else {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f823c);
            sb.append(", RESOLVED: ");
            sb.append(this.f);
            sb.append(":");
            sb.append(this.g);
            str = "] type: ";
        }
        sb.append(str);
        sb.append(m(this.h));
        return sb.toString();
    }
}
