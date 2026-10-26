package d.a.e.e;

import android.content.Context;
import d.a.b.l.b;
import d.a.e.c.p;
import d.a.e.e.i;

/* loaded from: classes.dex */
public class j {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final b.a f2530b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2531c;

    /* renamed from: d, reason: collision with root package name */
    private final d.a.b.l.b f2532d;
    private final boolean e;
    private final boolean f;
    private final int g;
    private final int h;
    private boolean i;
    private final int j;
    private final boolean k;
    private final boolean l;
    private final d m;
    private final d.a.b.d.k<Boolean> n;
    private final boolean o;
    private final boolean p;
    private final int q;
    private final d.a.b.d.k<Boolean> r;
    private final boolean s;
    private final long t;
    private boolean u;
    private boolean v;

    public static class b {

        /* renamed from: b, reason: collision with root package name */
        private b.a f2533b;

        /* renamed from: d, reason: collision with root package name */
        private d.a.b.l.b f2535d;
        private d m;
        public d.a.b.d.k<Boolean> n;
        public boolean o;
        public boolean p;
        public int q;
        public boolean s;
        private boolean u;
        public boolean v;
        private boolean a = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f2534c = false;
        private boolean e = false;
        private boolean f = false;
        private int g = 0;
        private int h = 0;
        public boolean i = false;
        private int j = 2048;
        private boolean k = false;
        private boolean l = false;
        public d.a.b.d.k<Boolean> r = d.a.b.d.l.a(Boolean.FALSE);
        public long t = 0;

        public b(i.b bVar) {
        }

        public j n() {
            return new j(this);
        }
    }

    public static class c implements d {
        @Override // d.a.e.e.j.d
        public n a(Context context, d.a.b.g.a aVar, d.a.e.h.c cVar, d.a.e.h.e eVar, boolean z, boolean z2, boolean z3, f fVar, d.a.b.g.h hVar, p<d.a.a.a.d, d.a.e.j.c> pVar, p<d.a.a.a.d, d.a.b.g.g> pVar2, d.a.e.c.e eVar2, d.a.e.c.e eVar3, d.a.e.c.f fVar2, d.a.e.b.f fVar3, int i, int i2, boolean z4, int i3, d.a.e.e.a aVar2, boolean z5) {
            return new n(context, aVar, cVar, eVar, z, z2, z3, fVar, hVar, pVar, pVar2, eVar2, eVar3, fVar2, fVar3, i, i2, z4, i3, aVar2, z5);
        }
    }

    public interface d {
        n a(Context context, d.a.b.g.a aVar, d.a.e.h.c cVar, d.a.e.h.e eVar, boolean z, boolean z2, boolean z3, f fVar, d.a.b.g.h hVar, p<d.a.a.a.d, d.a.e.j.c> pVar, p<d.a.a.a.d, d.a.b.g.g> pVar2, d.a.e.c.e eVar2, d.a.e.c.e eVar3, d.a.e.c.f fVar2, d.a.e.b.f fVar3, int i, int i2, boolean z4, int i3, d.a.e.e.a aVar2, boolean z5);
    }

    private j(b bVar) {
        this.a = bVar.a;
        this.f2530b = bVar.f2533b;
        this.f2531c = bVar.f2534c;
        this.f2532d = bVar.f2535d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.m = bVar.m == null ? new c() : bVar.m;
        this.n = bVar.n;
        this.o = bVar.o;
        this.p = bVar.p;
        this.q = bVar.q;
        this.r = bVar.r;
        this.s = bVar.s;
        this.t = bVar.t;
        this.u = bVar.u;
        this.v = bVar.v;
    }

    public int a() {
        return this.q;
    }

    public boolean b() {
        return this.i;
    }

    public int c() {
        return this.h;
    }

    public int d() {
        return this.g;
    }

    public int e() {
        return this.j;
    }

    public long f() {
        return this.t;
    }

    public d g() {
        return this.m;
    }

    public d.a.b.d.k<Boolean> h() {
        return this.r;
    }

    public boolean i() {
        return this.f;
    }

    public boolean j() {
        return this.e;
    }

    public d.a.b.l.b k() {
        return this.f2532d;
    }

    public b.a l() {
        return this.f2530b;
    }

    public boolean m() {
        return this.f2531c;
    }

    public boolean n() {
        return this.s;
    }

    public boolean o() {
        return this.o;
    }

    public d.a.b.d.k<Boolean> p() {
        return this.n;
    }

    public boolean q() {
        return this.k;
    }

    public boolean r() {
        return this.l;
    }

    public boolean s() {
        return this.a;
    }

    public boolean t() {
        return this.v;
    }

    public boolean u() {
        return this.p;
    }

    public boolean v() {
        return this.u;
    }
}
