package com.google.firebase.components;

/* loaded from: classes.dex */
final /* synthetic */ class i implements d.b.b.h.a {
    private final l a;

    /* renamed from: b, reason: collision with root package name */
    private final d f2183b;

    private i(l lVar, d dVar) {
        this.a = lVar;
        this.f2183b = dVar;
    }

    public static d.b.b.h.a a(l lVar, d dVar) {
        return new i(lVar, dVar);
    }

    @Override // d.b.b.h.a
    public Object get() {
        l lVar = this.a;
        d dVar = this.f2183b;
        return dVar.d().a(new v(dVar, lVar));
    }
}
