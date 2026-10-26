package com.facebook.imagepipeline.producers;

import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class v implements o0 {
    private final p0 a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final o0 f1409b;

    public v(p0 p0Var, @Nullable o0 o0Var) {
        this.a = p0Var;
        this.f1409b = o0Var;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(m0 m0Var, String str, boolean z) {
        p0 p0Var = this.a;
        if (p0Var != null) {
            p0Var.k(m0Var.getId(), str, z);
        }
        o0 o0Var = this.f1409b;
        if (o0Var != null) {
            o0Var.b(m0Var, str, z);
        }
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void c(m0 m0Var, String str, @Nullable Map<String, String> map) {
        p0 p0Var = this.a;
        if (p0Var != null) {
            p0Var.h(m0Var.getId(), str, map);
        }
        o0 o0Var = this.f1409b;
        if (o0Var != null) {
            o0Var.c(m0Var, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void d(m0 m0Var, String str) {
        p0 p0Var = this.a;
        if (p0Var != null) {
            p0Var.e(m0Var.getId(), str);
        }
        o0 o0Var = this.f1409b;
        if (o0Var != null) {
            o0Var.d(m0Var, str);
        }
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void e(m0 m0Var, String str, String str2) {
        p0 p0Var = this.a;
        if (p0Var != null) {
            p0Var.c(m0Var.getId(), str, str2);
        }
        o0 o0Var = this.f1409b;
        if (o0Var != null) {
            o0Var.e(m0Var, str, str2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void h(m0 m0Var, String str, Throwable th, @Nullable Map<String, String> map) {
        p0 p0Var = this.a;
        if (p0Var != null) {
            p0Var.g(m0Var.getId(), str, th, map);
        }
        o0 o0Var = this.f1409b;
        if (o0Var != null) {
            o0Var.h(m0Var, str, th, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public boolean i(m0 m0Var, String str) {
        o0 o0Var;
        p0 p0Var = this.a;
        boolean zJ = p0Var != null ? p0Var.j(m0Var.getId()) : false;
        return (zJ || (o0Var = this.f1409b) == null) ? zJ : o0Var.i(m0Var, str);
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void k(m0 m0Var, String str, @Nullable Map<String, String> map) {
        p0 p0Var = this.a;
        if (p0Var != null) {
            p0Var.d(m0Var.getId(), str, map);
        }
        o0 o0Var = this.f1409b;
        if (o0Var != null) {
            o0Var.k(m0Var, str, map);
        }
    }
}
