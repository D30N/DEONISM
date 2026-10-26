package com.facebook.imagepipeline.memory;

import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes.dex */
public class d0 {
    private final f0 a;

    /* renamed from: b, reason: collision with root package name */
    private final g0 f1264b;

    /* renamed from: c, reason: collision with root package name */
    private final f0 f1265c;

    /* renamed from: d, reason: collision with root package name */
    private final d.a.b.g.c f1266d;
    private final f0 e;
    private final g0 f;
    private final f0 g;
    private final g0 h;
    private final String i;
    private final int j;
    private final int k;
    private final boolean l;

    public static class b {
        private f0 a;

        /* renamed from: b, reason: collision with root package name */
        private g0 f1267b;

        /* renamed from: c, reason: collision with root package name */
        private f0 f1268c;

        /* renamed from: d, reason: collision with root package name */
        private d.a.b.g.c f1269d;
        private f0 e;
        private g0 f;
        private f0 g;
        private g0 h;
        private String i;
        private int j;
        private int k;
        private boolean l;

        private b() {
        }

        public d0 m() {
            return new d0(this);
        }
    }

    private d0(b bVar) {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("PoolConfig()");
        }
        this.a = bVar.a == null ? k.a() : bVar.a;
        this.f1264b = bVar.f1267b == null ? a0.h() : bVar.f1267b;
        this.f1265c = bVar.f1268c == null ? m.b() : bVar.f1268c;
        this.f1266d = bVar.f1269d == null ? d.a.b.g.d.b() : bVar.f1269d;
        this.e = bVar.e == null ? n.a() : bVar.e;
        this.f = bVar.f == null ? a0.h() : bVar.f;
        this.g = bVar.g == null ? l.a() : bVar.g;
        this.h = bVar.h == null ? a0.h() : bVar.h;
        this.i = bVar.i == null ? "legacy" : bVar.i;
        this.j = bVar.j;
        this.k = bVar.k > 0 ? bVar.k : 4194304;
        this.l = bVar.l;
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
    }

    public static b m() {
        return new b();
    }

    public int a() {
        return this.k;
    }

    public int b() {
        return this.j;
    }

    public f0 c() {
        return this.a;
    }

    public g0 d() {
        return this.f1264b;
    }

    public String e() {
        return this.i;
    }

    public f0 f() {
        return this.f1265c;
    }

    public f0 g() {
        return this.e;
    }

    public g0 h() {
        return this.f;
    }

    public d.a.b.g.c i() {
        return this.f1266d;
    }

    public f0 j() {
        return this.g;
    }

    public g0 k() {
        return this.h;
    }

    public boolean l() {
        return this.l;
    }
}
