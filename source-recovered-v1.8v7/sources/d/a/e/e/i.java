package d.a.e.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.imagepipeline.memory.e0;
import com.facebook.imagepipeline.producers.h0;
import d.a.b.l.b;
import d.a.e.c.p;
import d.a.e.c.q;
import d.a.e.e.j;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class i {
    private static c F = new c(null);
    private final j A;
    private final boolean B;

    @Nullable
    private final com.facebook.callercontext.a C;
    private final d.a.e.g.a D;

    @Nullable
    private final p<d.a.a.a.d, d.a.e.j.c> E;
    private final Bitmap.Config a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a.b.d.k<q> f2524b;

    /* renamed from: c, reason: collision with root package name */
    private final p.a f2525c;

    /* renamed from: d, reason: collision with root package name */
    private final d.a.e.c.f f2526d;
    private final Context e;
    private final boolean f;
    private final g g;
    private final d.a.b.d.k<q> h;
    private final f i;
    private final d.a.e.c.n j;

    @Nullable
    private final d.a.e.h.c k;

    @Nullable
    private final d.a.e.n.d l;

    @Nullable
    private final Integer m;
    private final d.a.b.d.k<Boolean> n;
    private final d.a.a.b.c o;
    private final d.a.b.g.c p;
    private final int q;
    private final h0 r;
    private final int s;
    private final e0 t;
    private final d.a.e.h.e u;
    private final Set<d.a.e.k.e> v;
    private final Set<d.a.e.k.d> w;
    private final boolean x;
    private final d.a.a.b.c y;

    @Nullable
    private final d.a.e.h.d z;

    class a implements d.a.b.d.k<Boolean> {
        a(i iVar) {
        }

        @Override // d.a.b.d.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    public static class b {
        private int A;
        private final j.b B;
        private boolean C;
        private com.facebook.callercontext.a D;
        private d.a.e.g.a E;

        @Nullable
        private p<d.a.a.a.d, d.a.e.j.c> F;
        private Bitmap.Config a;

        /* renamed from: b, reason: collision with root package name */
        private d.a.b.d.k<q> f2527b;

        /* renamed from: c, reason: collision with root package name */
        private p.a f2528c;

        /* renamed from: d, reason: collision with root package name */
        private d.a.e.c.f f2529d;
        private final Context e;
        private boolean f;
        private d.a.b.d.k<q> g;
        private f h;
        private d.a.e.c.n i;
        private d.a.e.h.c j;
        private d.a.e.n.d k;

        @Nullable
        private Integer l;
        private d.a.b.d.k<Boolean> m;
        private d.a.a.b.c n;
        private d.a.b.g.c o;

        @Nullable
        private Integer p;
        private h0 q;
        private d.a.e.b.f r;
        private e0 s;
        private d.a.e.h.e t;
        private Set<d.a.e.k.e> u;
        private Set<d.a.e.k.d> v;
        private boolean w;
        private d.a.a.b.c x;
        private g y;
        private d.a.e.h.d z;

        private b(Context context) {
            this.f = false;
            this.l = null;
            this.p = null;
            this.w = true;
            this.A = -1;
            this.B = new j.b(this);
            this.C = true;
            this.E = new d.a.e.g.b();
            d.a.b.d.i.g(context);
            this.e = context;
        }

        /* synthetic */ b(Context context, a aVar) {
            this(context);
        }

        public i G() {
            return new i(this, null);
        }
    }

    public static class c {
        private boolean a;

        private c() {
            this.a = false;
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        public boolean a() {
            return this.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private i(d.a.e.e.i.b r4) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.e.e.i.<init>(d.a.e.e.i$b):void");
    }

    /* synthetic */ i(b bVar, a aVar) {
        this(bVar);
    }

    public static b I(Context context) {
        return new b(context, null);
    }

    private static void J(d.a.b.l.b bVar, j jVar, d.a.b.l.a aVar) {
        d.a.b.l.c.f2408c = bVar;
        b.a aVarL = jVar.l();
        if (aVarL != null) {
            bVar.b(aVarL);
        }
        if (aVar != null) {
            bVar.a(aVar);
        }
    }

    public static c i() {
        return F;
    }

    private static d.a.a.b.c j(Context context) {
        try {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("DiskCacheConfig.getDefaultMainDiskCacheConfig");
            }
            return d.a.a.b.c.m(context).m();
        } finally {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        }
    }

    @Nullable
    private static d.a.e.n.d s(b bVar) {
        if (bVar.k != null && bVar.l != null) {
            throw new IllegalStateException("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
        }
        if (bVar.k != null) {
            return bVar.k;
        }
        return null;
    }

    private static int x(b bVar, j jVar) {
        if (bVar.p != null) {
            return bVar.p.intValue();
        }
        if (jVar.f() == 2 && Build.VERSION.SDK_INT >= 27) {
            return 2;
        }
        if (jVar.f() == 1) {
            return 1;
        }
        int i = (jVar.f() > 0L ? 1 : (jVar.f() == 0L ? 0 : -1));
        return 0;
    }

    public e0 A() {
        return this.t;
    }

    public d.a.e.h.e B() {
        return this.u;
    }

    public Set<d.a.e.k.d> C() {
        return Collections.unmodifiableSet(this.w);
    }

    public Set<d.a.e.k.e> D() {
        return Collections.unmodifiableSet(this.v);
    }

    public d.a.a.b.c E() {
        return this.y;
    }

    public boolean F() {
        return this.B;
    }

    public boolean G() {
        return this.f;
    }

    public boolean H() {
        return this.x;
    }

    @Nullable
    public p<d.a.a.a.d, d.a.e.j.c> a() {
        return this.E;
    }

    public Bitmap.Config b() {
        return this.a;
    }

    public d.a.b.d.k<q> c() {
        return this.f2524b;
    }

    public p.a d() {
        return this.f2525c;
    }

    public d.a.e.c.f e() {
        return this.f2526d;
    }

    @Nullable
    public com.facebook.callercontext.a f() {
        return this.C;
    }

    public d.a.e.g.a g() {
        return this.D;
    }

    public Context h() {
        return this.e;
    }

    public d.a.b.d.k<q> k() {
        return this.h;
    }

    public f l() {
        return this.i;
    }

    public j m() {
        return this.A;
    }

    public g n() {
        return this.g;
    }

    public d.a.e.c.n o() {
        return this.j;
    }

    @Nullable
    public d.a.e.h.c p() {
        return this.k;
    }

    @Nullable
    public d.a.e.h.d q() {
        return this.z;
    }

    @Nullable
    public d.a.e.n.d r() {
        return this.l;
    }

    @Nullable
    public Integer t() {
        return this.m;
    }

    public d.a.b.d.k<Boolean> u() {
        return this.n;
    }

    public d.a.a.b.c v() {
        return this.o;
    }

    public int w() {
        return this.q;
    }

    public d.a.b.g.c y() {
        return this.p;
    }

    public h0 z() {
        return this.r;
    }
}
