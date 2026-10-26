package com.facebook.imagepipeline.producers;

import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class w extends v implements d.a.e.k.d {

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final d.a.e.k.e f1410c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final d.a.e.k.d f1411d;

    public w(@Nullable d.a.e.k.e eVar, @Nullable d.a.e.k.d dVar) {
        super(eVar, dVar);
        this.f1410c = eVar;
        this.f1411d = dVar;
    }

    @Override // d.a.e.k.d
    public void a(m0 m0Var) {
        d.a.e.k.e eVar = this.f1410c;
        if (eVar != null) {
            eVar.i(m0Var.getId());
        }
        d.a.e.k.d dVar = this.f1411d;
        if (dVar != null) {
            dVar.a(m0Var);
        }
    }

    @Override // d.a.e.k.d
    public void f(m0 m0Var) {
        d.a.e.k.e eVar = this.f1410c;
        if (eVar != null) {
            eVar.f(m0Var.c(), m0Var.getId(), m0Var.d());
        }
        d.a.e.k.d dVar = this.f1411d;
        if (dVar != null) {
            dVar.f(m0Var);
        }
    }

    @Override // d.a.e.k.d
    public void g(m0 m0Var) {
        d.a.e.k.e eVar = this.f1410c;
        if (eVar != null) {
            eVar.b(m0Var.c(), m0Var.a(), m0Var.getId(), m0Var.d());
        }
        d.a.e.k.d dVar = this.f1411d;
        if (dVar != null) {
            dVar.g(m0Var);
        }
    }

    @Override // d.a.e.k.d
    public void j(m0 m0Var, Throwable th) {
        d.a.e.k.e eVar = this.f1410c;
        if (eVar != null) {
            eVar.a(m0Var.c(), m0Var.getId(), th, m0Var.d());
        }
        d.a.e.k.d dVar = this.f1411d;
        if (dVar != null) {
            dVar.j(m0Var, th);
        }
    }
}
