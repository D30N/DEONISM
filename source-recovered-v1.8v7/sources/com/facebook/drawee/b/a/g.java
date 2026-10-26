package com.facebook.drawee.b.a;

import android.content.res.Resources;
import d.a.b.d.k;
import d.a.e.c.p;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class g {
    private Resources a;

    /* renamed from: b, reason: collision with root package name */
    private com.facebook.drawee.c.a f1138b;

    /* renamed from: c, reason: collision with root package name */
    private d.a.e.i.a f1139c;

    /* renamed from: d, reason: collision with root package name */
    private Executor f1140d;
    private p<d.a.a.a.d, d.a.e.j.c> e;

    @Nullable
    private d.a.b.d.e<d.a.e.i.a> f;

    @Nullable
    private k<Boolean> g;

    public void a(Resources resources, com.facebook.drawee.c.a aVar, d.a.e.i.a aVar2, Executor executor, p<d.a.a.a.d, d.a.e.j.c> pVar, @Nullable d.a.b.d.e<d.a.e.i.a> eVar, @Nullable k<Boolean> kVar) {
        this.a = resources;
        this.f1138b = aVar;
        this.f1139c = aVar2;
        this.f1140d = executor;
        this.e = pVar;
        this.f = eVar;
        this.g = kVar;
    }

    protected d b(Resources resources, com.facebook.drawee.c.a aVar, d.a.e.i.a aVar2, Executor executor, p<d.a.a.a.d, d.a.e.j.c> pVar, @Nullable d.a.b.d.e<d.a.e.i.a> eVar) {
        return new d(resources, aVar, aVar2, executor, pVar, eVar);
    }

    public d c() {
        d dVarB = b(this.a, this.f1138b, this.f1139c, this.f1140d, this.e, this.f);
        k<Boolean> kVar = this.g;
        if (kVar != null) {
            dVarB.j0(kVar.get().booleanValue());
        }
        return dVarB;
    }
}
