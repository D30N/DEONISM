package com.facebook.drawee.b.a.i;

import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class h {

    @Nullable
    private String A;

    @Nullable
    private d.a.d.b.a.a B;

    @Nullable
    private String a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private String f1146b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private d.a.e.l.a f1147c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private Object f1148d;

    @Nullable
    private d.a.e.j.g e;

    @Nullable
    private d.a.e.l.a f;

    @Nullable
    private d.a.e.l.a g;

    @Nullable
    private d.a.e.l.a[] h;

    @Nullable
    private String q;
    private boolean r;

    @Nullable
    private Throwable u;
    private long i = -1;
    private long j = -1;
    private long k = -1;
    private long l = -1;
    private long m = -1;
    private long n = -1;
    private long o = -1;
    private int p = 1;
    private int s = -1;
    private int t = -1;
    private int v = -1;
    private int w = -1;
    private long x = -1;
    private long y = -1;
    private long z = -1;

    public e A() {
        return new e(this.a, this.f1146b, this.f1147c, this.f1148d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.w, this.x, this.y, this.A, this.z, this.B);
    }

    public int a() {
        return this.v;
    }

    public void b() {
        this.f1146b = null;
        this.f1147c = null;
        this.f1148d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.p = 1;
        this.q = null;
        this.r = false;
        this.s = -1;
        this.t = -1;
        this.u = null;
        this.v = -1;
        this.w = -1;
        this.A = null;
        this.B = null;
        c();
    }

    public void c() {
        this.n = -1L;
        this.o = -1L;
        this.i = -1L;
        this.k = -1L;
        this.l = -1L;
        this.m = -1L;
        this.x = -1L;
        this.y = -1L;
        this.z = -1L;
    }

    public void d(@Nullable Object obj) {
        this.f1148d = obj;
    }

    public void e(long j) {
        this.m = j;
    }

    public void f(long j) {
        this.l = j;
    }

    public void g(long j) {
        this.k = j;
    }

    public void h(@Nullable String str) {
        this.a = str;
    }

    public void i(@Nullable d.a.e.l.a aVar, @Nullable d.a.e.l.a aVar2, @Nullable d.a.e.l.a[] aVarArr) {
        this.f = aVar;
        this.g = aVar2;
        this.h = aVarArr;
    }

    public void j(long j) {
        this.j = j;
    }

    public void k(long j) {
        this.i = j;
    }

    public void l(@Nullable Throwable th) {
        this.u = th;
    }

    public void m(@Nullable d.a.e.j.g gVar) {
        this.e = gVar;
    }

    public void n(int i) {
        this.v = i;
    }

    public void o(int i) {
        this.p = i;
    }

    public void p(@Nullable d.a.e.l.a aVar) {
        this.f1147c = aVar;
    }

    public void q(long j) {
        this.o = j;
    }

    public void r(long j) {
        this.n = j;
    }

    public void s(long j) {
        this.y = j;
    }

    public void t(int i) {
        this.t = i;
    }

    public void u(int i) {
        this.s = i;
    }

    public void v(boolean z) {
        this.r = z;
    }

    public void w(@Nullable String str) {
        this.f1146b = str;
    }

    public void x(@Nullable String str) {
        this.q = str;
    }

    public void y(long j) {
        this.x = j;
    }

    public void z(boolean z) {
        this.w = z ? 1 : 2;
    }
}
