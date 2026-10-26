package com.facebook.imagepipeline.producers;

/* loaded from: classes.dex */
public abstract class n<I, O> extends b<I> {

    /* renamed from: b, reason: collision with root package name */
    private final k<O> f1372b;

    public n(k<O> kVar) {
        this.f1372b = kVar;
    }

    @Override // com.facebook.imagepipeline.producers.b
    protected void g() {
        this.f1372b.b();
    }

    @Override // com.facebook.imagepipeline.producers.b
    protected void h(Throwable th) {
        this.f1372b.a(th);
    }

    @Override // com.facebook.imagepipeline.producers.b
    protected void j(float f) {
        this.f1372b.c(f);
    }

    public k<O> p() {
        return this.f1372b;
    }
}
