package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class a4 implements f8 {
    private final y3 a;

    private a4(y3 y3Var) {
        u4.f(y3Var, "output");
        y3 y3Var2 = y3Var;
        this.a = y3Var2;
        y3Var2.a = this;
    }

    public static a4 P(y3 y3Var) {
        a4 a4Var = y3Var.a;
        return a4Var != null ? a4Var : new a4(y3Var);
    }

    @Override // d.b.a.a.e.e.f8
    public final void A(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.Y(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.m(i, 2);
        int iP0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iP0 += y3.p0(list.get(i3).intValue());
        }
        this.a.O(iP0);
        while (i2 < list.size()) {
            this.a.O(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // d.b.a.a.e.e.f8
    public final void B(int i, l3 l3Var) {
        this.a.o(i, l3Var);
    }

    @Override // d.b.a.a.e.e.f8
    public final void C(int i, int i2) {
        this.a.Y(i, i2);
    }

    @Override // d.b.a.a.e.e.f8
    public final void D(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.k0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.m(i, 2);
        int iA0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA0 += y3.A0(list.get(i3).intValue());
        }
        this.a.O(iA0);
        while (i2 < list.size()) {
            this.a.f0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // d.b.a.a.e.e.f8
    public final void E(int i, Object obj, s6 s6Var) {
        this.a.q(i, (z5) obj, s6Var);
    }

    @Override // d.b.a.a.e.e.f8
    public final void F(int i, List<?> list, s6 s6Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            o(i, list.get(i2), s6Var);
        }
    }

    @Override // d.b.a.a.e.e.f8
    public final void G(int i, long j) {
        this.a.Q(i, j);
    }

    @Override // d.b.a.a.e.e.f8
    public final void H(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.g0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.m(i, 2);
        int iT0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iT0 += y3.t0(list.get(i3).intValue());
        }
        this.a.O(iT0);
        while (i2 < list.size()) {
            this.a.X(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // d.b.a.a.e.e.f8
    public final void I(int i, List<String> list) {
        int i2 = 0;
        if (!(list instanceof k5)) {
            while (i2 < list.size()) {
                this.a.r(i, list.get(i2));
                i2++;
            }
            return;
        }
        k5 k5Var = (k5) list;
        while (i2 < list.size()) {
            Object objG = k5Var.g(i2);
            if (objG instanceof String) {
                this.a.r(i, (String) objG);
            } else {
                this.a.o(i, (l3) objG);
            }
            i2++;
        }
    }

    @Override // d.b.a.a.e.e.f8
    public final void J(int i, int i2) {
        this.a.k0(i, i2);
    }

    @Override // d.b.a.a.e.e.f8
    public final void K(int i, long j) {
        this.a.n(i, j);
    }

    @Override // d.b.a.a.e.e.f8
    public final void L(int i, int i2) {
        this.a.P(i, i2);
    }

    @Override // d.b.a.a.e.e.f8
    public final void M(int i, double d2) {
        this.a.k(i, d2);
    }

    @Override // d.b.a.a.e.e.f8
    public final void N(int i, float f) {
        this.a.l(i, f);
    }

    @Override // d.b.a.a.e.e.f8
    public final void O(int i, long j) {
        this.a.n(i, j);
    }

    @Override // d.b.a.a.e.e.f8
    public final int a() {
        return r4.f.k;
    }

    @Override // d.b.a.a.e.e.f8
    public final void b(int i, Object obj) {
        if (obj instanceof l3) {
            this.a.R(i, (l3) obj);
        } else {
            this.a.p(i, (z5) obj);
        }
    }

    @Override // d.b.a.a.e.e.f8
    public final void c(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.n(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.m(i, 2);
        int iE0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iE0 += y3.e0(list.get(i3).longValue());
        }
        this.a.O(iE0);
        while (i2 < list.size()) {
            this.a.t(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // d.b.a.a.e.e.f8
    public final void d(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.Z(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.m(i, 2);
        int iS0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iS0 += y3.s0(list.get(i3).longValue());
        }
        this.a.O(iS0);
        while (i2 < list.size()) {
            this.a.a0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // d.b.a.a.e.e.f8
    public final void e(int i, boolean z) {
        this.a.s(i, z);
    }

    @Override // d.b.a.a.e.e.f8
    public final void f(int i) {
        this.a.m(i, 3);
    }

    @Override // d.b.a.a.e.e.f8
    public final void g(int i) {
        this.a.m(i, 4);
    }

    @Override // d.b.a.a.e.e.f8
    public final void h(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.k(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.a.m(i, 2);
        int iZ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZ += y3.z(list.get(i3).doubleValue());
        }
        this.a.O(iZ);
        while (i2 < list.size()) {
            this.a.h(list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // d.b.a.a.e.e.f8
    public final void i(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.s(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.a.m(i, 2);
        int iL = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iL += y3.L(list.get(i3).booleanValue());
        }
        this.a.O(iL);
        while (i2 < list.size()) {
            this.a.y(list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // d.b.a.a.e.e.f8
    public final void j(int i, List<?> list, s6 s6Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            E(i, list.get(i2), s6Var);
        }
    }

    @Override // d.b.a.a.e.e.f8
    public final <K, V> void k(int i, u5<K, V> u5Var, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a.m(i, 2);
            this.a.O(r5.a(u5Var, entry.getKey(), entry.getValue()));
            r5.b(this.a, u5Var, entry.getKey(), entry.getValue());
        }
    }

    @Override // d.b.a.a.e.e.f8
    public final void l(int i, List<l3> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.o(i, list.get(i2));
        }
    }

    @Override // d.b.a.a.e.e.f8
    public final void m(int i, int i2) {
        this.a.k0(i, i2);
    }

    @Override // d.b.a.a.e.e.f8
    public final void n(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.Z(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.m(i, 2);
        int iW0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iW0 += y3.w0(list.get(i3).longValue());
        }
        this.a.O(iW0);
        while (i2 < list.size()) {
            this.a.a0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // d.b.a.a.e.e.f8
    public final void o(int i, Object obj, s6 s6Var) {
        y3 y3Var = this.a;
        y3Var.m(i, 3);
        s6Var.h((z5) obj, y3Var.a);
        y3Var.m(i, 4);
    }

    @Override // d.b.a.a.e.e.f8
    public final void p(int i, int i2) {
        this.a.g0(i, i2);
    }

    @Override // d.b.a.a.e.e.f8
    public final void q(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.Q(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.m(i, 2);
        int iO0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iO0 += y3.o0(list.get(i3).longValue());
        }
        this.a.O(iO0);
        while (i2 < list.size()) {
            this.a.S(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // d.b.a.a.e.e.f8
    public final void r(int i, long j) {
        this.a.Z(i, j);
    }

    @Override // d.b.a.a.e.e.f8
    public final void s(int i, long j) {
        this.a.Z(i, j);
    }

    @Override // d.b.a.a.e.e.f8
    public final void t(int i, int i2) {
        this.a.P(i, i2);
    }

    @Override // d.b.a.a.e.e.f8
    public final void u(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.P(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.m(i, 2);
        int iL0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iL0 += y3.l0(list.get(i3).intValue());
        }
        this.a.O(iL0);
        while (i2 < list.size()) {
            this.a.j(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // d.b.a.a.e.e.f8
    public final void v(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.k0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.m(i, 2);
        int iX0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iX0 += y3.x0(list.get(i3).intValue());
        }
        this.a.O(iX0);
        while (i2 < list.size()) {
            this.a.f0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // d.b.a.a.e.e.f8
    public final void w(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.n(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.m(i, 2);
        int iJ0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ0 += y3.j0(list.get(i3).longValue());
        }
        this.a.O(iJ0);
        while (i2 < list.size()) {
            this.a.t(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // d.b.a.a.e.e.f8
    public final void x(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.l(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.a.m(i, 2);
        int iA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA += y3.A(list.get(i3).floatValue());
        }
        this.a.O(iA);
        while (i2 < list.size()) {
            this.a.i(list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // d.b.a.a.e.e.f8
    public final void y(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.P(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.m(i, 2);
        int iC0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iC0 += y3.C0(list.get(i3).intValue());
        }
        this.a.O(iC0);
        while (i2 < list.size()) {
            this.a.j(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // d.b.a.a.e.e.f8
    public final void z(int i, String str) {
        this.a.r(i, str);
    }
}
