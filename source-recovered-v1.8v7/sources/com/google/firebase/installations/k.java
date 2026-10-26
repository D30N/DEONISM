package com.google.firebase.installations;

import com.google.firebase.installations.m;

/* loaded from: classes.dex */
class k implements o {
    private final p a;

    /* renamed from: b, reason: collision with root package name */
    private final d.b.a.a.h.i<m> f2291b;

    public k(p pVar, d.b.a.a.h.i<m> iVar) {
        this.a = pVar;
        this.f2291b = iVar;
    }

    @Override // com.google.firebase.installations.o
    public boolean a(com.google.firebase.installations.q.d dVar, Exception exc) {
        if (!dVar.i() && !dVar.j() && !dVar.l()) {
            return false;
        }
        this.f2291b.d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.o
    public boolean b(com.google.firebase.installations.q.d dVar) {
        if (!dVar.k() || this.a.b(dVar)) {
            return false;
        }
        d.b.a.a.h.i<m> iVar = this.f2291b;
        m.a aVarA = m.a();
        aVarA.b(dVar.b());
        aVarA.d(dVar.c());
        aVarA.c(dVar.h());
        iVar.c(aVarA.a());
        return true;
    }
}
