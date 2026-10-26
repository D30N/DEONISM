package com.facebook.imagepipeline.producers;

import android.net.Uri;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class t {
    private final k<d.a.e.j.e> a;

    /* renamed from: b, reason: collision with root package name */
    private final m0 f1396b;

    /* renamed from: c, reason: collision with root package name */
    private long f1397c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f1398d;

    @Nullable
    private d.a.e.d.a e;

    public t(k<d.a.e.j.e> kVar, m0 m0Var) {
        this.a = kVar;
        this.f1396b = m0Var;
    }

    public k<d.a.e.j.e> a() {
        return this.a;
    }

    public m0 b() {
        return this.f1396b;
    }

    public long c() {
        return this.f1397c;
    }

    public o0 d() {
        return this.f1396b.l();
    }

    public int e() {
        return this.f1398d;
    }

    @Nullable
    public d.a.e.d.a f() {
        return this.e;
    }

    public Uri g() {
        return this.f1396b.c().p();
    }

    public void h(long j) {
        this.f1397c = j;
    }
}
