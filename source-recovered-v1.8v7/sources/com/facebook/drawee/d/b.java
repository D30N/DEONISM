package com.facebook.drawee.d;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.datasource.g;
import com.facebook.drawee.d.b;
import com.facebook.infer.annotation.ReturnsOwnership;
import d.a.b.d.h;
import d.a.b.d.i;
import d.a.b.d.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class b<BUILDER extends b<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements com.facebook.drawee.i.d {
    private static final d<Object> p = new a();
    private static final NullPointerException q = new NullPointerException("No image request was specified!");
    private static final AtomicLong r = new AtomicLong();
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<d> f1173b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private Object f1174c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private REQUEST f1175d;

    @Nullable
    private REQUEST e;

    @Nullable
    private REQUEST[] f;
    private boolean g;

    @Nullable
    private k<com.facebook.datasource.c<IMAGE>> h;

    @Nullable
    private d<? super INFO> i;

    @Nullable
    private e j;
    private boolean k;
    private boolean l;
    private boolean m;
    private String n;

    @Nullable
    private com.facebook.drawee.i.a o;

    static class a extends com.facebook.drawee.d.c<Object> {
        a() {
        }

        @Override // com.facebook.drawee.d.c, com.facebook.drawee.d.d
        public void c(String str, @Nullable Object obj, @Nullable Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* renamed from: com.facebook.drawee.d.b$b, reason: collision with other inner class name */
    class C0051b implements k<com.facebook.datasource.c<IMAGE>> {
        final /* synthetic */ com.facebook.drawee.i.a a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f1176b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f1177c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f1178d;
        final /* synthetic */ c e;

        C0051b(com.facebook.drawee.i.a aVar, String str, Object obj, Object obj2, c cVar) {
            this.a = aVar;
            this.f1176b = str;
            this.f1177c = obj;
            this.f1178d = obj2;
            this.e = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // d.a.b.d.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.facebook.datasource.c<IMAGE> get() {
            return b.this.i(this.a, this.f1176b, this.f1177c, this.f1178d, this.e);
        }

        public String toString() {
            h.b bVarD = h.d(this);
            bVarD.b("request", this.f1177c.toString());
            return bVarD.toString();
        }
    }

    public enum c {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    protected b(Context context, Set<d> set) {
        this.a = context;
        this.f1173b = set;
        s();
    }

    protected static String e() {
        return String.valueOf(r.getAndIncrement());
    }

    private void s() {
        this.f1174c = null;
        this.f1175d = null;
        this.e = null;
        this.f = null;
        this.g = true;
        this.i = null;
        this.j = null;
        this.k = false;
        this.l = false;
        this.o = null;
        this.n = null;
    }

    public BUILDER A(@Nullable com.facebook.drawee.i.a aVar) {
        this.o = aVar;
        r();
        return this;
    }

    protected void B() {
        boolean z = false;
        i.j(this.f == null || this.f1175d == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.h == null || (this.f == null && this.f1175d == null && this.e == null)) {
            z = true;
        }
        i.j(z, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    @Override // com.facebook.drawee.i.d
    public /* bridge */ /* synthetic */ com.facebook.drawee.i.d a(@Nullable com.facebook.drawee.i.a aVar) {
        A(aVar);
        return this;
    }

    @Override // com.facebook.drawee.i.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.facebook.drawee.d.a build() {
        REQUEST request;
        B();
        if (this.f1175d == null && this.f == null && (request = this.e) != null) {
            this.f1175d = request;
            this.e = null;
        }
        return d();
    }

    protected com.facebook.drawee.d.a d() {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("AbstractDraweeControllerBuilder#buildController");
        }
        com.facebook.drawee.d.a aVarW = w();
        aVarW.N(q());
        aVarW.J(g());
        aVarW.L(h());
        v(aVarW);
        t(aVarW);
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
        return aVarW;
    }

    @Nullable
    public Object f() {
        return this.f1174c;
    }

    @Nullable
    public String g() {
        return this.n;
    }

    @Nullable
    public e h() {
        return this.j;
    }

    protected abstract com.facebook.datasource.c<IMAGE> i(com.facebook.drawee.i.a aVar, String str, REQUEST request, Object obj, c cVar);

    protected k<com.facebook.datasource.c<IMAGE>> j(com.facebook.drawee.i.a aVar, String str, REQUEST request) {
        return k(aVar, str, request, c.FULL_FETCH);
    }

    protected k<com.facebook.datasource.c<IMAGE>> k(com.facebook.drawee.i.a aVar, String str, REQUEST request, c cVar) {
        return new C0051b(aVar, str, request, f(), cVar);
    }

    protected k<com.facebook.datasource.c<IMAGE>> l(com.facebook.drawee.i.a aVar, String str, REQUEST[] requestArr, boolean z) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z) {
            for (REQUEST request : requestArr) {
                arrayList.add(k(aVar, str, request, c.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST request2 : requestArr) {
            arrayList.add(j(aVar, str, request2));
        }
        return com.facebook.datasource.f.b(arrayList);
    }

    @Nullable
    public REQUEST[] m() {
        return this.f;
    }

    @Nullable
    public REQUEST n() {
        return this.f1175d;
    }

    @Nullable
    public REQUEST o() {
        return this.e;
    }

    @Nullable
    public com.facebook.drawee.i.a p() {
        return this.o;
    }

    public boolean q() {
        return this.m;
    }

    protected final BUILDER r() {
        return this;
    }

    protected void t(com.facebook.drawee.d.a aVar) {
        Set<d> set = this.f1173b;
        if (set != null) {
            Iterator<d> it = set.iterator();
            while (it.hasNext()) {
                aVar.j(it.next());
            }
        }
        d<? super INFO> dVar = this.i;
        if (dVar != null) {
            aVar.j(dVar);
        }
        if (this.l) {
            aVar.j(p);
        }
    }

    protected void u(com.facebook.drawee.d.a aVar) {
        if (aVar.q() == null) {
            aVar.M(com.facebook.drawee.h.a.c(this.a));
        }
    }

    protected void v(com.facebook.drawee.d.a aVar) {
        if (this.k) {
            aVar.v().d(this.k);
            u(aVar);
        }
    }

    @ReturnsOwnership
    protected abstract com.facebook.drawee.d.a w();

    protected k<com.facebook.datasource.c<IMAGE>> x(com.facebook.drawee.i.a aVar, String str) {
        k<com.facebook.datasource.c<IMAGE>> kVar = this.h;
        if (kVar != null) {
            return kVar;
        }
        k<com.facebook.datasource.c<IMAGE>> kVarL = null;
        REQUEST request = this.f1175d;
        if (request != null) {
            kVarL = j(aVar, str, request);
        } else {
            REQUEST[] requestArr = this.f;
            if (requestArr != null) {
                kVarL = l(aVar, str, requestArr, this.g);
            }
        }
        if (kVarL != null && this.e != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(kVarL);
            arrayList.add(j(aVar, str, this.e));
            kVarL = g.c(arrayList, false);
        }
        return kVarL == null ? com.facebook.datasource.d.a(q) : kVarL;
    }

    public BUILDER y(Object obj) {
        this.f1174c = obj;
        r();
        return this;
    }

    public BUILDER z(REQUEST request) {
        this.f1175d = request;
        r();
        return this;
    }
}
