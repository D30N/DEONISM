package d.a.e.l;

import android.net.Uri;
import d.a.b.d.h;
import d.a.e.d.f;
import java.io.File;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes.dex */
public class a {
    private final EnumC0093a a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f2571b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2572c;

    /* renamed from: d, reason: collision with root package name */
    private File f2573d;
    private final boolean e;
    private final boolean f;
    private final d.a.e.d.b g;

    @Nullable
    private final d.a.e.d.e h;
    private final f i;

    @Nullable
    private final d.a.e.d.a j;
    private final d.a.e.d.d k;
    private final b l;
    private final boolean m;
    private final boolean n;

    @Nullable
    private final Boolean o;

    @Nullable
    private final c p;

    @Nullable
    private final d.a.e.k.e q;

    @Nullable
    private final Boolean r;

    /* renamed from: d.a.e.l.a$a, reason: collision with other inner class name */
    public enum EnumC0093a {
        SMALL,
        DEFAULT
    }

    public enum b {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);


        /* renamed from: b, reason: collision with root package name */
        private int f2579b;

        b(int i) {
            this.f2579b = i;
        }

        public static b f(b bVar, b bVar2) {
            return bVar.g() > bVar2.g() ? bVar : bVar2;
        }

        public int g() {
            return this.f2579b;
        }
    }

    protected a(d.a.e.l.b bVar) {
        this.a = bVar.d();
        Uri uriM = bVar.m();
        this.f2571b = uriM;
        this.f2572c = r(uriM);
        this.e = bVar.q();
        this.f = bVar.o();
        this.g = bVar.e();
        this.h = bVar.j();
        this.i = bVar.l() == null ? f.a() : bVar.l();
        this.j = bVar.c();
        this.k = bVar.i();
        this.l = bVar.f();
        this.m = bVar.n();
        this.n = bVar.p();
        this.o = bVar.F();
        this.p = bVar.g();
        this.q = bVar.h();
        this.r = bVar.k();
    }

    private static int r(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (d.a.b.k.f.l(uri)) {
            return 0;
        }
        if (d.a.b.k.f.j(uri)) {
            return d.a.b.f.a.c(d.a.b.f.a.b(uri.getPath())) ? 2 : 3;
        }
        if (d.a.b.k.f.i(uri)) {
            return 4;
        }
        if (d.a.b.k.f.f(uri)) {
            return 5;
        }
        if (d.a.b.k.f.k(uri)) {
            return 6;
        }
        if (d.a.b.k.f.e(uri)) {
            return 7;
        }
        return d.a.b.k.f.m(uri) ? 8 : -1;
    }

    @Nullable
    public d.a.e.d.a a() {
        return this.j;
    }

    public EnumC0093a b() {
        return this.a;
    }

    public d.a.e.d.b c() {
        return this.g;
    }

    public boolean d() {
        return this.f;
    }

    public b e() {
        return this.l;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!h.a(this.f2571b, aVar.f2571b) || !h.a(this.a, aVar.a) || !h.a(this.f2573d, aVar.f2573d) || !h.a(this.j, aVar.j) || !h.a(this.g, aVar.g) || !h.a(this.h, aVar.h) || !h.a(this.i, aVar.i)) {
            return false;
        }
        c cVar = this.p;
        d.a.a.a.d dVarB = cVar != null ? cVar.b() : null;
        c cVar2 = aVar.p;
        return h.a(dVarB, cVar2 != null ? cVar2.b() : null);
    }

    @Nullable
    public c f() {
        return this.p;
    }

    public int g() {
        d.a.e.d.e eVar = this.h;
        if (eVar != null) {
            return eVar.f2512b;
        }
        return 2048;
    }

    public int h() {
        d.a.e.d.e eVar = this.h;
        if (eVar != null) {
            return eVar.a;
        }
        return 2048;
    }

    public int hashCode() {
        c cVar = this.p;
        return h.b(this.a, this.f2571b, this.f2573d, this.j, this.g, this.h, this.i, cVar != null ? cVar.b() : null, this.r);
    }

    public d.a.e.d.d i() {
        return this.k;
    }

    public boolean j() {
        return this.e;
    }

    @Nullable
    public d.a.e.k.e k() {
        return this.q;
    }

    @Nullable
    public d.a.e.d.e l() {
        return this.h;
    }

    @Nullable
    public Boolean m() {
        return this.r;
    }

    public f n() {
        return this.i;
    }

    public synchronized File o() {
        if (this.f2573d == null) {
            this.f2573d = new File(this.f2571b.getPath());
        }
        return this.f2573d;
    }

    public Uri p() {
        return this.f2571b;
    }

    public int q() {
        return this.f2572c;
    }

    public boolean s() {
        return this.m;
    }

    public boolean t() {
        return this.n;
    }

    public String toString() {
        h.b bVarD = h.d(this);
        bVarD.b("uri", this.f2571b);
        bVarD.b("cacheChoice", this.a);
        bVarD.b("decodeOptions", this.g);
        bVarD.b("postprocessor", this.p);
        bVarD.b("priority", this.k);
        bVarD.b("resizeOptions", this.h);
        bVarD.b("rotationOptions", this.i);
        bVarD.b("bytesRange", this.j);
        bVarD.b("resizingAllowedOverride", this.r);
        return bVarD.toString();
    }

    @Nullable
    public Boolean u() {
        return this.o;
    }
}
