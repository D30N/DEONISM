package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes.dex */
class b0<V> extends g<V> {
    private LinkedList<d.a.b.h.f<V>> f;

    public b0(int i, int i2, int i3) {
        super(i, i2, i3, false);
        this.f = new LinkedList<>();
    }

    @Override // com.facebook.imagepipeline.memory.g
    void a(V v) {
        d.a.b.h.f<V> fVarPoll = this.f.poll();
        if (fVarPoll == null) {
            fVarPoll = new d.a.b.h.f<>();
        }
        fVarPoll.c(v);
        this.f1277c.add(fVarPoll);
    }

    @Override // com.facebook.imagepipeline.memory.g
    public V g() {
        d.a.b.h.f<V> fVar = (d.a.b.h.f) this.f1277c.poll();
        V vB = fVar.b();
        fVar.a();
        this.f.add(fVar);
        return vB;
    }
}
