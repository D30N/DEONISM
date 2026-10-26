package com.facebook.imagepipeline.producers;

import android.util.Pair;
import d.a.e.l.a;

/* loaded from: classes.dex */
public class g extends f0<Pair<d.a.a.a.d, a.b>, d.a.b.h.a<d.a.e.j.c>> {

    /* renamed from: d, reason: collision with root package name */
    private final d.a.e.c.f f1329d;

    public g(d.a.e.c.f fVar, l0 l0Var) {
        super(l0Var);
        this.f1329d = fVar;
    }

    @Override // com.facebook.imagepipeline.producers.f0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public d.a.b.h.a<d.a.e.j.c> e(d.a.b.h.a<d.a.e.j.c> aVar) {
        return d.a.b.h.a.k(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.f0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Pair<d.a.a.a.d, a.b> h(m0 m0Var) {
        return Pair.create(this.f1329d.b(m0Var.c(), m0Var.a()), m0Var.h());
    }
}
