package com.facebook.imagepipeline.producers;

import android.util.Pair;
import d.a.e.l.a;

/* loaded from: classes.dex */
public class q extends f0<Pair<d.a.a.a.d, a.b>, d.a.e.j.e> {

    /* renamed from: d, reason: collision with root package name */
    private final d.a.e.c.f f1384d;

    public q(d.a.e.c.f fVar, boolean z, l0 l0Var) {
        super(l0Var, z);
        this.f1384d = fVar;
    }

    @Override // com.facebook.imagepipeline.producers.f0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public d.a.e.j.e e(d.a.e.j.e eVar) {
        return d.a.e.j.e.f(eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.f0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Pair<d.a.a.a.d, a.b> h(m0 m0Var) {
        return Pair.create(this.f1384d.c(m0Var.c(), m0Var.a()), m0Var.h());
    }
}
