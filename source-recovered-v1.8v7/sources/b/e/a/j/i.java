package b.e.a.j;

import b.e.a.j.e;
import b.e.a.j.f;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i extends f {
    protected float k0 = -1.0f;
    protected int l0 = -1;
    protected int m0 = -1;
    private e n0 = this.t;
    private int o0 = 0;
    private boolean p0 = false;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.d.values().length];
            a = iArr;
            try {
                iArr[e.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.d.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.d.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[e.d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[e.d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[e.d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[e.d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[e.d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[e.d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public i() {
        this.B.clear();
        this.B.add(this.n0);
        int length = this.A.length;
        for (int i = 0; i < length; i++) {
            this.A[i] = this.n0;
        }
    }

    @Override // b.e.a.j.f
    public void G0(b.e.a.e eVar) {
        if (u() == null) {
            return;
        }
        int iY = eVar.y(this.n0);
        if (this.o0 == 1) {
            C0(iY);
            D0(0);
            b0(u().r());
            y0(0);
            return;
        }
        C0(0);
        D0(iY);
        y0(u().D());
        b0(0);
    }

    public int I0() {
        return this.o0;
    }

    public void J0(int i) {
        if (i > -1) {
            this.k0 = -1.0f;
            this.l0 = i;
            this.m0 = -1;
        }
    }

    public void K0(int i) {
        if (i > -1) {
            this.k0 = -1.0f;
            this.l0 = -1;
            this.m0 = i;
        }
    }

    public void L0(float f) {
        if (f > -1.0f) {
            this.k0 = f;
            this.l0 = -1;
            this.m0 = -1;
        }
    }

    public void M0(int i) {
        if (this.o0 == i) {
            return;
        }
        this.o0 = i;
        this.B.clear();
        this.n0 = this.o0 == 1 ? this.s : this.t;
        this.B.add(this.n0);
        int length = this.A.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.A[i2] = this.n0;
        }
    }

    @Override // b.e.a.j.f
    public void b(b.e.a.e eVar) {
        g gVar = (g) u();
        if (gVar == null) {
            return;
        }
        e eVarH = gVar.h(e.d.LEFT);
        e eVarH2 = gVar.h(e.d.RIGHT);
        f fVar = this.D;
        boolean z = fVar != null && fVar.C[0] == f.b.WRAP_CONTENT;
        if (this.o0 == 0) {
            eVarH = gVar.h(e.d.TOP);
            eVarH2 = gVar.h(e.d.BOTTOM);
            f fVar2 = this.D;
            z = fVar2 != null && fVar2.C[1] == f.b.WRAP_CONTENT;
        }
        if (this.l0 != -1) {
            b.e.a.i iVarR = eVar.r(this.n0);
            eVar.e(iVarR, eVar.r(eVarH), this.l0, 6);
            if (z) {
                eVar.i(eVar.r(eVarH2), iVarR, 0, 5);
                return;
            }
            return;
        }
        if (this.m0 == -1) {
            if (this.k0 != -1.0f) {
                eVar.d(b.e.a.e.t(eVar, eVar.r(this.n0), eVar.r(eVarH), eVar.r(eVarH2), this.k0, this.p0));
                return;
            }
            return;
        }
        b.e.a.i iVarR2 = eVar.r(this.n0);
        b.e.a.i iVarR3 = eVar.r(eVarH2);
        eVar.e(iVarR2, iVarR3, -this.m0, 6);
        if (z) {
            eVar.i(iVarR2, eVar.r(eVarH), 0, 5);
            eVar.i(iVarR3, iVarR2, 0, 5);
        }
    }

    @Override // b.e.a.j.f
    public boolean c() {
        return true;
    }

    @Override // b.e.a.j.f
    public void d(int i) {
        int i2;
        l lVarF;
        e eVar;
        l lVarF2;
        e eVar2;
        e eVar3;
        l lVarF3;
        int i3;
        f fVarU = u();
        if (fVarU == null) {
            return;
        }
        if (I0() == 1) {
            this.t.f().h(1, fVarU.t.f(), 0);
            this.v.f().h(1, fVarU.t.f(), 0);
            if (this.l0 != -1) {
                this.s.f().h(1, fVarU.s.f(), this.l0);
                lVarF2 = this.u.f();
                eVar3 = fVarU.s;
                lVarF3 = eVar3.f();
                i3 = this.l0;
            } else {
                if (this.m0 == -1) {
                    if (this.k0 == -1.0f || fVarU.s() != f.b.FIXED) {
                        return;
                    }
                    i2 = (int) (fVarU.E * this.k0);
                    this.s.f().h(1, fVarU.s.f(), i2);
                    lVarF = this.u.f();
                    eVar = fVarU.s;
                    lVarF.h(1, eVar.f(), i2);
                    return;
                }
                this.s.f().h(1, fVarU.u.f(), -this.m0);
                lVarF2 = this.u.f();
                eVar2 = fVarU.u;
                lVarF3 = eVar2.f();
                i3 = -this.m0;
            }
        } else {
            this.s.f().h(1, fVarU.s.f(), 0);
            this.u.f().h(1, fVarU.s.f(), 0);
            if (this.l0 != -1) {
                this.t.f().h(1, fVarU.t.f(), this.l0);
                lVarF2 = this.v.f();
                eVar3 = fVarU.t;
                lVarF3 = eVar3.f();
                i3 = this.l0;
            } else {
                if (this.m0 == -1) {
                    if (this.k0 == -1.0f || fVarU.B() != f.b.FIXED) {
                        return;
                    }
                    i2 = (int) (fVarU.F * this.k0);
                    this.t.f().h(1, fVarU.t.f(), i2);
                    lVarF = this.v.f();
                    eVar = fVarU.t;
                    lVarF.h(1, eVar.f(), i2);
                    return;
                }
                this.t.f().h(1, fVarU.v.f(), -this.m0);
                lVarF2 = this.v.f();
                eVar2 = fVarU.v;
                lVarF3 = eVar2.f();
                i3 = -this.m0;
            }
        }
        lVarF2.h(1, lVarF3, i3);
    }

    @Override // b.e.a.j.f
    public e h(e.d dVar) {
        switch (a.a[dVar.ordinal()]) {
            case 1:
            case 2:
                if (this.o0 == 1) {
                    return this.n0;
                }
                break;
            case 3:
            case 4:
                if (this.o0 == 0) {
                    return this.n0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(dVar.name());
    }

    @Override // b.e.a.j.f
    public ArrayList<e> i() {
        return this.B;
    }
}
