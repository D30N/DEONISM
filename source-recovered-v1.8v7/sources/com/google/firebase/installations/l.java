package com.google.firebase.installations;

/* loaded from: classes.dex */
class l implements o {
    final d.b.a.a.h.i<String> a;

    public l(d.b.a.a.h.i<String> iVar) {
        this.a = iVar;
    }

    @Override // com.google.firebase.installations.o
    public boolean a(com.google.firebase.installations.q.d dVar, Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.o
    public boolean b(com.google.firebase.installations.q.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.a.e(dVar.d());
        return true;
    }
}
