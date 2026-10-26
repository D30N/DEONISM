package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class f4 {
    private long A;
    private long B;
    private long C;
    private String D;
    private boolean E;
    private long F;
    private long G;
    private final d5 a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1690b;

    /* renamed from: c, reason: collision with root package name */
    private String f1691c;

    /* renamed from: d, reason: collision with root package name */
    private String f1692d;
    private String e;
    private String f;
    private long g;
    private long h;
    private long i;
    private String j;
    private long k;
    private String l;
    private long m;
    private long n;
    private boolean o;
    private long p;
    private boolean q;
    private boolean r;
    private String s;
    private Boolean t;
    private long u;
    private List<String> v;
    private String w;
    private long x;
    private long y;
    private long z;

    f4(d5 d5Var, String str) {
        com.google.android.gms.common.internal.q.k(d5Var);
        com.google.android.gms.common.internal.q.g(str);
        this.a = d5Var;
        this.f1690b = str;
        d5Var.j().c();
    }

    public final String A() {
        this.a.j().c();
        return this.f1692d;
    }

    public final void B(long j) {
        this.a.j().c();
        this.E |= this.n != j;
        this.n = j;
    }

    public final void C(String str) {
        this.a.j().c();
        this.E |= !z9.A0(this.e, str);
        this.e = str;
    }

    public final String D() {
        this.a.j().c();
        return this.s;
    }

    public final void E(long j) {
        this.a.j().c();
        this.E |= this.u != j;
        this.u = j;
    }

    public final void F(String str) {
        this.a.j().c();
        this.E |= !z9.A0(this.f, str);
        this.f = str;
    }

    public final String G() {
        this.a.j().c();
        return this.w;
    }

    public final void H(long j) {
        com.google.android.gms.common.internal.q.a(j >= 0);
        this.a.j().c();
        this.E = (this.g != j) | this.E;
        this.g = j;
    }

    public final void I(String str) {
        this.a.j().c();
        this.E |= !z9.A0(this.j, str);
        this.j = str;
    }

    public final String J() {
        this.a.j().c();
        return this.e;
    }

    public final void K(long j) {
        this.a.j().c();
        this.E |= this.F != j;
        this.F = j;
    }

    public final void L(String str) {
        this.a.j().c();
        this.E |= !z9.A0(this.l, str);
        this.l = str;
    }

    public final String M() {
        this.a.j().c();
        return this.f;
    }

    public final void N(long j) {
        this.a.j().c();
        this.E |= this.G != j;
        this.G = j;
    }

    public final void O(String str) {
        this.a.j().c();
        this.E |= !z9.A0(this.D, str);
        this.D = str;
    }

    public final long P() {
        this.a.j().c();
        return this.h;
    }

    public final void Q(long j) {
        this.a.j().c();
        this.E |= this.x != j;
        this.x = j;
    }

    public final long R() {
        this.a.j().c();
        return this.i;
    }

    public final void S(long j) {
        this.a.j().c();
        this.E |= this.y != j;
        this.y = j;
    }

    public final String T() {
        this.a.j().c();
        return this.j;
    }

    public final void U(long j) {
        this.a.j().c();
        this.E |= this.z != j;
        this.z = j;
    }

    public final long V() {
        this.a.j().c();
        return this.k;
    }

    public final void W(long j) {
        this.a.j().c();
        this.E |= this.A != j;
        this.A = j;
    }

    public final String X() {
        this.a.j().c();
        return this.l;
    }

    public final void Y(long j) {
        this.a.j().c();
        this.E |= this.C != j;
        this.C = j;
    }

    public final long Z() {
        this.a.j().c();
        return this.m;
    }

    public final void a(long j) {
        this.a.j().c();
        this.E |= this.h != j;
        this.h = j;
    }

    public final void a0(long j) {
        this.a.j().c();
        this.E |= this.B != j;
        this.B = j;
    }

    public final void b(Boolean bool) {
        this.a.j().c();
        this.E |= !z9.b0(this.t, bool);
        this.t = bool;
    }

    public final long b0() {
        this.a.j().c();
        return this.n;
    }

    public final void c(String str) {
        this.a.j().c();
        this.E |= !z9.A0(this.f1691c, str);
        this.f1691c = str;
    }

    public final void c0(long j) {
        this.a.j().c();
        this.E |= this.p != j;
        this.p = j;
    }

    public final void d(List<String> list) {
        this.a.j().c();
        if (z9.m0(this.v, list)) {
            return;
        }
        this.E = true;
        this.v = list != null ? new ArrayList(list) : null;
    }

    public final long d0() {
        this.a.j().c();
        return this.u;
    }

    public final void e(boolean z) {
        this.a.j().c();
        this.E |= this.o != z;
        this.o = z;
    }

    public final boolean e0() {
        this.a.j().c();
        return this.o;
    }

    public final boolean f() {
        this.a.j().c();
        return this.E;
    }

    public final long f0() {
        this.a.j().c();
        return this.g;
    }

    public final long g() {
        this.a.j().c();
        return this.C;
    }

    public final long g0() {
        this.a.j().c();
        return this.F;
    }

    public final long h() {
        this.a.j().c();
        return this.B;
    }

    public final long h0() {
        this.a.j().c();
        return this.G;
    }

    public final String i() {
        this.a.j().c();
        return this.D;
    }

    public final void i0() {
        this.a.j().c();
        long j = this.g + 1;
        if (j > 2147483647L) {
            this.a.m().J().b("Bundle index overflow. appId", z3.x(this.f1690b));
            j = 0;
        }
        this.E = true;
        this.g = j;
    }

    public final String j() {
        this.a.j().c();
        String str = this.D;
        O(null);
        return str;
    }

    public final long j0() {
        this.a.j().c();
        return this.x;
    }

    public final long k() {
        this.a.j().c();
        return this.p;
    }

    public final long k0() {
        this.a.j().c();
        return this.y;
    }

    public final boolean l() {
        this.a.j().c();
        return this.q;
    }

    public final long l0() {
        this.a.j().c();
        return this.z;
    }

    public final boolean m() {
        this.a.j().c();
        return this.r;
    }

    public final long m0() {
        this.a.j().c();
        return this.A;
    }

    public final Boolean n() {
        this.a.j().c();
        return this.t;
    }

    public final List<String> o() {
        this.a.j().c();
        return this.v;
    }

    public final void p() {
        this.a.j().c();
        this.E = false;
    }

    public final void q(long j) {
        this.a.j().c();
        this.E |= this.i != j;
        this.i = j;
    }

    public final void r(String str) {
        this.a.j().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !z9.A0(this.f1692d, str);
        this.f1692d = str;
    }

    public final void s(boolean z) {
        this.a.j().c();
        this.E |= this.q != z;
        this.q = z;
    }

    public final String t() {
        this.a.j().c();
        return this.f1690b;
    }

    public final void u(long j) {
        this.a.j().c();
        this.E |= this.k != j;
        this.k = j;
    }

    public final void v(String str) {
        this.a.j().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !z9.A0(this.s, str);
        this.s = str;
    }

    public final void w(boolean z) {
        this.a.j().c();
        this.E |= this.r != z;
        this.r = z;
    }

    public final String x() {
        this.a.j().c();
        return this.f1691c;
    }

    public final void y(long j) {
        this.a.j().c();
        this.E |= this.m != j;
        this.m = j;
    }

    public final void z(String str) {
        this.a.j().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !z9.A0(this.w, str);
        this.w = str;
    }
}
