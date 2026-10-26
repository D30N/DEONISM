package com.facebook.drawee.b.a;

import android.content.Context;
import android.net.Uri;
import com.facebook.drawee.d.b;
import d.a.e.e.h;
import d.a.e.l.a;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class e extends com.facebook.drawee.d.b<e, d.a.e.l.a, d.a.b.h.a<d.a.e.j.c>, d.a.e.j.g> {
    private final h s;
    private final g t;

    @Nullable
    private d.a.b.d.e<d.a.e.i.a> u;

    @Nullable
    private com.facebook.drawee.b.a.i.b v;

    @Nullable
    private com.facebook.drawee.b.a.i.f w;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.c.values().length];
            a = iArr;
            try {
                iArr[b.c.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.c.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.c.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e(Context context, g gVar, h hVar, Set<com.facebook.drawee.d.d> set) {
        super(context, set);
        this.s = hVar;
        this.t = gVar;
    }

    public static a.b C(b.c cVar) {
        int i = a.a[cVar.ordinal()];
        if (i == 1) {
            return a.b.FULL_FETCH;
        }
        if (i == 2) {
            return a.b.DISK_CACHE;
        }
        if (i == 3) {
            return a.b.BITMAP_MEMORY_CACHE;
        }
        throw new RuntimeException("Cache level" + cVar + "is not supported. ");
    }

    @Nullable
    private d.a.a.a.d D() {
        d.a.e.l.a aVarN = n();
        d.a.e.c.f fVarD = this.s.d();
        if (fVarD == null || aVarN == null) {
            return null;
        }
        return aVarN.f() != null ? fVarD.a(aVarN, f()) : fVarD.b(aVarN, f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.d.b
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public com.facebook.datasource.c<d.a.b.h.a<d.a.e.j.c>> i(com.facebook.drawee.i.a aVar, String str, d.a.e.l.a aVar2, Object obj, b.c cVar) {
        return this.s.a(aVar2, obj, C(cVar), F(aVar), str);
    }

    @Nullable
    protected d.a.e.k.e F(com.facebook.drawee.i.a aVar) {
        if (aVar instanceof d) {
            return ((d) aVar).Y();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.d.b
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public d w() {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            com.facebook.drawee.i.a aVarP = p();
            String strE = com.facebook.drawee.d.b.e();
            d dVarC = aVarP instanceof d ? (d) aVarP : this.t.c();
            dVarC.a0(x(dVarC, strE), strE, D(), f(), this.u, this.v);
            dVarC.b0(this.w, this);
            return dVarC;
        } finally {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        }
    }

    public e H(@Nullable com.facebook.drawee.b.a.i.f fVar) {
        this.w = fVar;
        r();
        return this;
    }

    @Override // com.facebook.drawee.i.d
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public e b(@Nullable Uri uri) throws NumberFormatException {
        d.a.e.l.a aVarA;
        if (uri == null) {
            aVarA = null;
        } else {
            d.a.e.l.b bVarR = d.a.e.l.b.r(uri);
            bVarR.C(d.a.e.d.f.b());
            aVarA = bVarR.a();
        }
        super.z(aVarA);
        return this;
    }
}
