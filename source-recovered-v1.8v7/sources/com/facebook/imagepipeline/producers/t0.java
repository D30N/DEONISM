package com.facebook.imagepipeline.producers;

import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class t0<T> extends d.a.b.b.f<T> {

    /* renamed from: c, reason: collision with root package name */
    private final k<T> f1399c;

    /* renamed from: d, reason: collision with root package name */
    private final o0 f1400d;
    private final String e;
    private final m0 f;

    public t0(k<T> kVar, o0 o0Var, m0 m0Var, String str) {
        this.f1399c = kVar;
        this.f1400d = o0Var;
        this.e = str;
        this.f = m0Var;
        o0Var.d(m0Var, str);
    }

    @Override // d.a.b.b.f
    protected void d() {
        o0 o0Var = this.f1400d;
        m0 m0Var = this.f;
        String str = this.e;
        o0Var.c(m0Var, str, o0Var.i(m0Var, str) ? g() : null);
        this.f1399c.b();
    }

    @Override // d.a.b.b.f
    protected void e(Exception exc) {
        o0 o0Var = this.f1400d;
        m0 m0Var = this.f;
        String str = this.e;
        o0Var.h(m0Var, str, exc, o0Var.i(m0Var, str) ? h(exc) : null);
        this.f1399c.a(exc);
    }

    @Override // d.a.b.b.f
    protected void f(T t) {
        o0 o0Var = this.f1400d;
        m0 m0Var = this.f;
        String str = this.e;
        o0Var.k(m0Var, str, o0Var.i(m0Var, str) ? i(t) : null);
        this.f1399c.d(t, 1);
    }

    @Nullable
    protected Map<String, String> g() {
        return null;
    }

    @Nullable
    protected Map<String, String> h(Exception exc) {
        return null;
    }

    @Nullable
    protected Map<String, String> i(T t) {
        return null;
    }
}
