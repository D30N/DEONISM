package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.b;

/* loaded from: classes.dex */
public final class c0 extends b0<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    private final f<?> f1508b;

    public c0(f<?> fVar, d.b.a.a.h.i<Boolean> iVar) {
        super(4, iVar);
        this.f1508b = fVar;
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final /* bridge */ /* synthetic */ void d(i iVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.u
    public final d.b.a.a.c.d[] g(b.a<?> aVar) {
        t tVar = aVar.x().get(this.f1508b);
        if (tVar == null) {
            return null;
        }
        return tVar.a.b();
    }

    @Override // com.google.android.gms.common.api.internal.u
    public final boolean h(b.a<?> aVar) {
        t tVar = aVar.x().get(this.f1508b);
        if (tVar == null) {
            return false;
        }
        tVar.a.d();
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.b0
    public final void i(b.a<?> aVar) {
        t tVarRemove = aVar.x().remove(this.f1508b);
        if (tVarRemove == null) {
            this.a.e(Boolean.FALSE);
        } else {
            tVarRemove.f1525b.a(aVar.o(), this.a);
            tVarRemove.a.a();
        }
    }
}
