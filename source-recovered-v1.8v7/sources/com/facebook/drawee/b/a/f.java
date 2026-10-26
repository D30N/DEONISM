package com.facebook.drawee.b.a;

import android.content.Context;
import android.content.res.Resources;
import d.a.b.d.k;
import d.a.e.c.p;
import d.a.e.e.h;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class f implements k<e> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final h f1135b;

    /* renamed from: c, reason: collision with root package name */
    private final g f1136c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<com.facebook.drawee.d.d> f1137d;

    @Nullable
    private final com.facebook.drawee.b.a.i.f e;

    public f(Context context, @Nullable b bVar) {
        this(context, d.a.e.e.k.k(), bVar);
    }

    public f(Context context, d.a.e.e.k kVar, @Nullable b bVar) {
        this(context, kVar, null, bVar);
    }

    public f(Context context, d.a.e.e.k kVar, Set<com.facebook.drawee.d.d> set, @Nullable b bVar) {
        this.a = context;
        this.f1135b = kVar.i();
        if (bVar != null) {
            bVar.d();
            throw null;
        }
        g gVar = new g();
        this.f1136c = gVar;
        Resources resources = context.getResources();
        com.facebook.drawee.c.a aVarB = com.facebook.drawee.c.a.b();
        d.a.e.i.a aVarA = kVar.a(context);
        d.a.b.b.g gVarG = d.a.b.b.g.g();
        p<d.a.a.a.d, d.a.e.j.c> pVarC = this.f1135b.c();
        if (bVar != null) {
            bVar.a();
            throw null;
        }
        if (bVar != null) {
            bVar.b();
            throw null;
        }
        gVar.a(resources, aVarB, aVarA, gVarG, pVarC, null, null);
        this.f1137d = set;
        if (bVar == null) {
            this.e = null;
        } else {
            bVar.c();
            throw null;
        }
    }

    @Override // d.a.b.d.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e get() {
        return new e(this.a, this.f1136c, this.f1135b, this.f1137d).H(this.e);
    }
}
