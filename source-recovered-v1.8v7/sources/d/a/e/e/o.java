package d.a.e.e;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.imagepipeline.producers.h0;
import com.facebook.imagepipeline.producers.l0;
import com.facebook.imagepipeline.producers.v0;
import com.facebook.imagepipeline.producers.z0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class o {
    private final ContentResolver a;

    /* renamed from: b, reason: collision with root package name */
    private final n f2547b;

    /* renamed from: c, reason: collision with root package name */
    private final h0 f2548c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f2549d;
    private final boolean e;
    private final boolean f;
    private final v0 g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final d.a.e.n.d k;
    l0<d.a.b.h.a<d.a.e.j.c>> l;
    private l0<d.a.e.j.e> m;
    l0<d.a.b.h.a<d.a.e.j.c>> n;
    l0<d.a.b.h.a<d.a.e.j.c>> o;
    l0<d.a.b.h.a<d.a.e.j.c>> p;
    l0<d.a.b.h.a<d.a.e.j.c>> q;
    l0<d.a.b.h.a<d.a.e.j.c>> r;
    l0<d.a.b.h.a<d.a.e.j.c>> s;
    l0<d.a.b.h.a<d.a.e.j.c>> t;
    Map<l0<d.a.b.h.a<d.a.e.j.c>>, l0<d.a.b.h.a<d.a.e.j.c>>> u = new HashMap();
    Map<l0<d.a.b.h.a<d.a.e.j.c>>, l0<d.a.b.h.a<d.a.e.j.c>>> v;

    public o(ContentResolver contentResolver, n nVar, h0 h0Var, boolean z, boolean z2, v0 v0Var, boolean z3, boolean z4, boolean z5, boolean z6, d.a.e.n.d dVar) {
        this.a = contentResolver;
        this.f2547b = nVar;
        this.f2548c = h0Var;
        this.f2549d = z;
        this.e = z2;
        new HashMap();
        this.v = new HashMap();
        this.g = v0Var;
        this.h = z3;
        this.i = z4;
        this.f = z5;
        this.j = z6;
        this.k = dVar;
    }

    private l0<d.a.b.h.a<d.a.e.j.c>> a(d.a.e.l.a aVar) {
        try {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("ProducerSequenceFactory#getBasicDecodedImageSequence");
            }
            d.a.b.d.i.g(aVar);
            Uri uriP = aVar.p();
            d.a.b.d.i.h(uriP, "Uri is null.");
            int iQ = aVar.q();
            if (iQ == 0) {
                l0<d.a.b.h.a<d.a.e.j.c>> l0VarK = k();
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.b();
                }
                return l0VarK;
            }
            switch (iQ) {
                case 2:
                    l0<d.a.b.h.a<d.a.e.j.c>> l0VarJ = j();
                    if (d.a.e.m.b.d()) {
                        d.a.e.m.b.b();
                    }
                    return l0VarJ;
                case 3:
                    l0<d.a.b.h.a<d.a.e.j.c>> l0VarH = h();
                    if (d.a.e.m.b.d()) {
                        d.a.e.m.b.b();
                    }
                    return l0VarH;
                case 4:
                    if (d.a.b.f.a.c(this.a.getType(uriP))) {
                        l0<d.a.b.h.a<d.a.e.j.c>> l0VarJ2 = j();
                        if (d.a.e.m.b.d()) {
                            d.a.e.m.b.b();
                        }
                        return l0VarJ2;
                    }
                    l0<d.a.b.h.a<d.a.e.j.c>> l0VarG = g();
                    if (d.a.e.m.b.d()) {
                        d.a.e.m.b.b();
                    }
                    return l0VarG;
                case 5:
                    l0<d.a.b.h.a<d.a.e.j.c>> l0VarF = f();
                    if (d.a.e.m.b.d()) {
                        d.a.e.m.b.b();
                    }
                    return l0VarF;
                case 6:
                    l0<d.a.b.h.a<d.a.e.j.c>> l0VarI = i();
                    if (d.a.e.m.b.d()) {
                        d.a.e.m.b.b();
                    }
                    return l0VarI;
                case 7:
                    l0<d.a.b.h.a<d.a.e.j.c>> l0VarD = d();
                    if (d.a.e.m.b.d()) {
                        d.a.e.m.b.b();
                    }
                    return l0VarD;
                case 8:
                    return m();
                default:
                    throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + n(uriP));
            }
        } finally {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        }
    }

    private synchronized l0<d.a.b.h.a<d.a.e.j.c>> b(l0<d.a.b.h.a<d.a.e.j.c>> l0Var) {
        l0<d.a.b.h.a<d.a.e.j.c>> l0VarF;
        l0VarF = this.v.get(l0Var);
        if (l0VarF == null) {
            l0VarF = this.f2547b.f(l0Var);
            this.v.put(l0Var, l0VarF);
        }
        return l0VarF;
    }

    private synchronized l0<d.a.e.j.e> c() {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        }
        if (this.m == null) {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence:init");
            }
            com.facebook.imagepipeline.producers.a aVarA = n.a(t(this.f2547b.u(this.f2548c)));
            this.m = aVarA;
            this.m = this.f2547b.z(aVarA, this.f2549d && !this.h, this.k);
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        }
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
        return this.m;
    }

    private synchronized l0<d.a.b.h.a<d.a.e.j.c>> d() {
        if (this.s == null) {
            l0<d.a.e.j.e> l0VarH = this.f2547b.h();
            if (d.a.b.l.c.a && (!this.e || d.a.b.l.c.f2408c == null)) {
                l0VarH = this.f2547b.C(l0VarH);
            }
            this.s = p(this.f2547b.z(n.a(l0VarH), true, this.k));
        }
        return this.s;
    }

    private synchronized l0<d.a.b.h.a<d.a.e.j.c>> f() {
        if (this.r == null) {
            this.r = q(this.f2547b.n());
        }
        return this.r;
    }

    private synchronized l0<d.a.b.h.a<d.a.e.j.c>> g() {
        if (this.p == null) {
            this.p = r(this.f2547b.o(), new z0[]{this.f2547b.p(), this.f2547b.q()});
        }
        return this.p;
    }

    private synchronized l0<d.a.b.h.a<d.a.e.j.c>> h() {
        if (this.n == null) {
            this.n = q(this.f2547b.r());
        }
        return this.n;
    }

    private synchronized l0<d.a.b.h.a<d.a.e.j.c>> i() {
        if (this.q == null) {
            this.q = q(this.f2547b.s());
        }
        return this.q;
    }

    private synchronized l0<d.a.b.h.a<d.a.e.j.c>> j() {
        if (this.o == null) {
            this.o = o(this.f2547b.t());
        }
        return this.o;
    }

    private synchronized l0<d.a.b.h.a<d.a.e.j.c>> k() {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("ProducerSequenceFactory#getNetworkFetchSequence");
        }
        if (this.l == null) {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("ProducerSequenceFactory#getNetworkFetchSequence:init");
            }
            this.l = p(c());
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        }
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
        return this.l;
    }

    private synchronized l0<d.a.b.h.a<d.a.e.j.c>> l(l0<d.a.b.h.a<d.a.e.j.c>> l0Var) {
        if (!this.u.containsKey(l0Var)) {
            this.u.put(l0Var, this.f2547b.w(this.f2547b.x(l0Var)));
        }
        return this.u.get(l0Var);
    }

    private synchronized l0<d.a.b.h.a<d.a.e.j.c>> m() {
        if (this.t == null) {
            this.t = q(this.f2547b.y());
        }
        return this.t;
    }

    private static String n(Uri uri) {
        String strValueOf = String.valueOf(uri);
        if (strValueOf.length() <= 30) {
            return strValueOf;
        }
        return strValueOf.substring(0, 30) + "...";
    }

    private l0<d.a.b.h.a<d.a.e.j.c>> o(l0<d.a.b.h.a<d.a.e.j.c>> l0Var) {
        return this.f2547b.c(this.f2547b.b(this.f2547b.d(this.f2547b.e(l0Var)), this.g));
    }

    private l0<d.a.b.h.a<d.a.e.j.c>> p(l0<d.a.e.j.e> l0Var) {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        }
        l0<d.a.b.h.a<d.a.e.j.c>> l0VarO = o(this.f2547b.i(l0Var));
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
        return l0VarO;
    }

    private l0<d.a.b.h.a<d.a.e.j.c>> q(l0<d.a.e.j.e> l0Var) {
        return r(l0Var, new z0[]{this.f2547b.q()});
    }

    private l0<d.a.b.h.a<d.a.e.j.c>> r(l0<d.a.e.j.e> l0Var, z0<d.a.e.j.e>[] z0VarArr) {
        return p(v(t(l0Var), z0VarArr));
    }

    private l0<d.a.e.j.e> s(l0<d.a.e.j.e> l0Var) {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("ProducerSequenceFactory#newDiskCacheSequence");
        }
        if (this.f) {
            l0Var = this.f2547b.v(l0Var);
        }
        com.facebook.imagepipeline.producers.o oVarJ = this.f2547b.j(this.f2547b.k(l0Var));
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
        return oVarJ;
    }

    private l0<d.a.e.j.e> t(l0<d.a.e.j.e> l0Var) {
        if (d.a.b.l.c.a && (!this.e || d.a.b.l.c.f2408c == null)) {
            l0Var = this.f2547b.C(l0Var);
        }
        if (this.j) {
            l0Var = s(l0Var);
        }
        return this.f2547b.l(this.f2547b.m(l0Var));
    }

    private l0<d.a.e.j.e> u(z0<d.a.e.j.e>[] z0VarArr) {
        return this.f2547b.z(this.f2547b.B(z0VarArr), true, this.k);
    }

    private l0<d.a.e.j.e> v(l0<d.a.e.j.e> l0Var, z0<d.a.e.j.e>[] z0VarArr) {
        return n.g(u(z0VarArr), this.f2547b.A(this.f2547b.z(n.a(l0Var), true, this.k)));
    }

    public l0<d.a.b.h.a<d.a.e.j.c>> e(d.a.e.l.a aVar) {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        }
        l0<d.a.b.h.a<d.a.e.j.c>> l0VarA = a(aVar);
        if (aVar.f() != null) {
            l0VarA = l(l0VarA);
        }
        if (this.i) {
            l0VarA = b(l0VarA);
        }
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
        return l0VarA;
    }
}
