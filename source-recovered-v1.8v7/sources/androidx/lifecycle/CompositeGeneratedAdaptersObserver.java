package androidx.lifecycle;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements e {
    private final c[] a;

    CompositeGeneratedAdaptersObserver(c[] cVarArr) {
        this.a = cVarArr;
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.a aVar) {
        k kVar = new k();
        for (c cVar : this.a) {
            cVar.a(gVar, aVar, false, kVar);
        }
        for (c cVar2 : this.a) {
            cVar2.a(gVar, aVar, true, kVar);
        }
    }
}
