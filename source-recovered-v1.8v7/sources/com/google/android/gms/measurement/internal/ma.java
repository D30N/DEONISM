package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class ma extends na {
    private d.b.a.a.e.e.m0 g;
    private final /* synthetic */ ga h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ma(ga gaVar, String str, int i, d.b.a.a.e.e.m0 m0Var) {
        super(str, i);
        this.h = gaVar;
        this.g = m0Var;
    }

    @Override // com.google.android.gms.measurement.internal.na
    final int a() {
        return this.g.H();
    }

    @Override // com.google.android.gms.measurement.internal.na
    final boolean i() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.na
    final boolean j() {
        return false;
    }

    final boolean k(Long l, Long l2, d.b.a.a.e.e.g1 g1Var, boolean z) {
        b4 b4VarJ;
        String strA;
        String str;
        Boolean boolG;
        boolean z2 = d.b.a.a.e.e.o9.b() && this.h.n().z(this.a, r.e0);
        boolean zK = this.g.K();
        boolean zL = this.g.L();
        boolean zN = this.g.N();
        boolean z3 = zK || zL || zN;
        Boolean boolD = null;
        boolD = null;
        if (z && !z3) {
            this.h.m().O().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f1813b), this.g.G() ? Integer.valueOf(this.g.H()) : null);
            return true;
        }
        d.b.a.a.e.e.k0 k0VarJ = this.g.J();
        boolean zL2 = k0VarJ.L();
        if (g1Var.W()) {
            if (k0VarJ.I()) {
                boolG = na.c(g1Var.X(), k0VarJ.J());
                boolD = na.d(boolG, zL2);
            } else {
                b4VarJ = this.h.m().J();
                strA = this.h.e().A(g1Var.S());
                str = "No number filter for long property. property";
                b4VarJ.b(str, strA);
            }
        } else if (!g1Var.Y()) {
            if (g1Var.U()) {
                if (k0VarJ.G()) {
                    boolG = na.g(g1Var.V(), k0VarJ.H(), this.h.m());
                } else if (!k0VarJ.I()) {
                    b4VarJ = this.h.m().J();
                    strA = this.h.e().A(g1Var.S());
                    str = "No string or number filter defined. property";
                } else if (v9.T(g1Var.V())) {
                    boolG = na.e(g1Var.V(), k0VarJ.J());
                } else {
                    this.h.m().J().c("Invalid user property value for Numeric number filter. property, value", this.h.e().A(g1Var.S()), g1Var.V());
                }
                boolD = na.d(boolG, zL2);
            } else {
                b4VarJ = this.h.m().J();
                strA = this.h.e().A(g1Var.S());
                str = "User property has no value, property";
            }
            b4VarJ.b(str, strA);
        } else if (k0VarJ.I()) {
            boolG = na.b(g1Var.Z(), k0VarJ.J());
            boolD = na.d(boolG, zL2);
        } else {
            b4VarJ = this.h.m().J();
            strA = this.h.e().A(g1Var.S());
            str = "No number filter for double property. property";
            b4VarJ.b(str, strA);
        }
        this.h.m().O().b("Property filter result", boolD == null ? "null" : boolD);
        if (boolD == null) {
            return false;
        }
        this.f1814c = Boolean.TRUE;
        if (zN && !boolD.booleanValue()) {
            return true;
        }
        if (!z || this.g.K()) {
            this.f1815d = boolD;
        }
        if (boolD.booleanValue() && z3 && g1Var.L()) {
            long jM = g1Var.M();
            if (l != null) {
                jM = l.longValue();
            }
            if (z2 && this.g.K() && !this.g.L() && l2 != null) {
                jM = l2.longValue();
            }
            if (this.g.L()) {
                this.f = Long.valueOf(jM);
            } else {
                this.e = Long.valueOf(jM);
            }
        }
        return true;
    }
}
