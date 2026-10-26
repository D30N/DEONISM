package d.a.e.l;

import android.net.Uri;
import d.a.e.d.f;
import d.a.e.e.i;
import d.a.e.l.a;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class b {

    @Nullable
    private d.a.e.k.e n;
    private Uri a = null;

    /* renamed from: b, reason: collision with root package name */
    private a.b f2580b = a.b.FULL_FETCH;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private d.a.e.d.e f2581c = null;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private f f2582d = null;
    private d.a.e.d.b e = d.a.e.d.b.a();
    private a.EnumC0093a f = a.EnumC0093a.DEFAULT;
    private boolean g = i.i().a();
    private boolean h = false;
    private d.a.e.d.d i = d.a.e.d.d.HIGH;

    @Nullable
    private c j = null;
    private boolean k = true;
    private boolean l = true;

    @Nullable
    private Boolean m = null;

    @Nullable
    private d.a.e.d.a o = null;

    @Nullable
    private Boolean p = null;

    public static class a extends RuntimeException {
        public a(String str) {
            super("Invalid request builder: " + str);
        }
    }

    private b() {
    }

    public static b b(d.a.e.l.a aVar) {
        b bVarR = r(aVar.p());
        bVarR.u(aVar.c());
        bVarR.s(aVar.a());
        bVarR.t(aVar.b());
        bVarR.v(aVar.d());
        bVarR.w(aVar.e());
        bVarR.x(aVar.f());
        bVarR.y(aVar.j());
        bVarR.A(aVar.i());
        bVarR.B(aVar.l());
        bVarR.z(aVar.k());
        bVarR.C(aVar.n());
        bVarR.D(aVar.u());
        return bVarR;
    }

    public static b r(Uri uri) {
        b bVar = new b();
        bVar.E(uri);
        return bVar;
    }

    public b A(d.a.e.d.d dVar) {
        this.i = dVar;
        return this;
    }

    public b B(@Nullable d.a.e.d.e eVar) {
        this.f2581c = eVar;
        return this;
    }

    public b C(@Nullable f fVar) {
        this.f2582d = fVar;
        return this;
    }

    public b D(@Nullable Boolean bool) {
        this.m = bool;
        return this;
    }

    public b E(Uri uri) {
        d.a.b.d.i.g(uri);
        this.a = uri;
        return this;
    }

    @Nullable
    public Boolean F() {
        return this.m;
    }

    protected void G() throws NumberFormatException {
        Uri uri = this.a;
        if (uri == null) {
            throw new a("Source must be set!");
        }
        if (d.a.b.k.f.k(uri)) {
            if (!this.a.isAbsolute()) {
                throw new a("Resource URI path must be absolute.");
            }
            if (this.a.getPath().isEmpty()) {
                throw new a("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new a("Resource URI path must be a resource id.");
            }
        }
        if (d.a.b.k.f.f(this.a) && !this.a.isAbsolute()) {
            throw new a("Asset URI path must be absolute.");
        }
    }

    public d.a.e.l.a a() throws NumberFormatException {
        G();
        return new d.a.e.l.a(this);
    }

    @Nullable
    public d.a.e.d.a c() {
        return this.o;
    }

    public a.EnumC0093a d() {
        return this.f;
    }

    public d.a.e.d.b e() {
        return this.e;
    }

    public a.b f() {
        return this.f2580b;
    }

    @Nullable
    public c g() {
        return this.j;
    }

    @Nullable
    public d.a.e.k.e h() {
        return this.n;
    }

    public d.a.e.d.d i() {
        return this.i;
    }

    @Nullable
    public d.a.e.d.e j() {
        return this.f2581c;
    }

    @Nullable
    public Boolean k() {
        return this.p;
    }

    @Nullable
    public f l() {
        return this.f2582d;
    }

    public Uri m() {
        return this.a;
    }

    public boolean n() {
        return this.k && d.a.b.k.f.l(this.a);
    }

    public boolean o() {
        return this.h;
    }

    public boolean p() {
        return this.l;
    }

    public boolean q() {
        return this.g;
    }

    public b s(@Nullable d.a.e.d.a aVar) {
        this.o = aVar;
        return this;
    }

    public b t(a.EnumC0093a enumC0093a) {
        this.f = enumC0093a;
        return this;
    }

    public b u(d.a.e.d.b bVar) {
        this.e = bVar;
        return this;
    }

    public b v(boolean z) {
        this.h = z;
        return this;
    }

    public b w(a.b bVar) {
        this.f2580b = bVar;
        return this;
    }

    public b x(@Nullable c cVar) {
        this.j = cVar;
        return this;
    }

    public b y(boolean z) {
        this.g = z;
        return this;
    }

    public b z(d.a.e.k.e eVar) {
        this.n = eVar;
        return this;
    }
}
