package com.facebook.imagepipeline.producers;

import d.a.e.l.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class d implements m0 {
    private final d.a.e.l.a a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1317b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f1318c;

    /* renamed from: d, reason: collision with root package name */
    private final o0 f1319d;
    private final Object e;
    private final a.b f;

    @GuardedBy("this")
    private boolean g;

    @GuardedBy("this")
    private d.a.e.d.d h;

    @GuardedBy("this")
    private boolean i;

    @GuardedBy("this")
    private boolean j;

    @GuardedBy("this")
    private final List<n0> k;
    private final d.a.e.e.i l;
    private d.a.e.j.f m;

    public d(d.a.e.l.a aVar, String str, o0 o0Var, Object obj, a.b bVar, boolean z, boolean z2, d.a.e.d.d dVar, d.a.e.e.i iVar) {
        this(aVar, str, null, o0Var, obj, bVar, z, z2, dVar, iVar);
    }

    public d(d.a.e.l.a aVar, String str, @Nullable String str2, o0 o0Var, Object obj, a.b bVar, boolean z, boolean z2, d.a.e.d.d dVar, d.a.e.e.i iVar) {
        this.m = d.a.e.j.f.NOT_SET;
        this.a = aVar;
        this.f1317b = str;
        this.f1318c = str2;
        this.f1319d = o0Var;
        this.e = obj;
        this.f = bVar;
        this.g = z;
        this.h = dVar;
        this.i = z2;
        this.j = false;
        this.k = new ArrayList();
        this.l = iVar;
    }

    public static void m(@Nullable List<n0> list) {
        if (list == null) {
            return;
        }
        Iterator<n0> it = list.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public static void n(@Nullable List<n0> list) {
        if (list == null) {
            return;
        }
        Iterator<n0> it = list.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public static void o(@Nullable List<n0> list) {
        if (list == null) {
            return;
        }
        Iterator<n0> it = list.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    public static void p(@Nullable List<n0> list) {
        if (list == null) {
            return;
        }
        Iterator<n0> it = list.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public Object a() {
        return this.e;
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public synchronized d.a.e.d.d b() {
        return this.h;
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public d.a.e.l.a c() {
        return this.a;
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public synchronized boolean d() {
        return this.g;
    }

    @Override // com.facebook.imagepipeline.producers.m0
    @Nullable
    public String e() {
        return this.f1318c;
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public void f(n0 n0Var) {
        boolean z;
        synchronized (this) {
            this.k.add(n0Var);
            z = this.j;
        }
        if (z) {
            n0Var.b();
        }
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public synchronized boolean g() {
        return this.i;
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public String getId() {
        return this.f1317b;
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public a.b h() {
        return this.f;
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public d.a.e.e.i i() {
        return this.l;
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public d.a.e.j.f j() {
        return this.m;
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public void k(d.a.e.j.f fVar) {
        this.m = fVar;
    }

    @Override // com.facebook.imagepipeline.producers.m0
    public o0 l() {
        return this.f1319d;
    }

    public void q() {
        m(r());
    }

    @Nullable
    public synchronized List<n0> r() {
        if (this.j) {
            return null;
        }
        this.j = true;
        return new ArrayList(this.k);
    }

    @Nullable
    public synchronized List<n0> s(boolean z) {
        if (z == this.i) {
            return null;
        }
        this.i = z;
        return new ArrayList(this.k);
    }

    @Nullable
    public synchronized List<n0> t(boolean z) {
        if (z == this.g) {
            return null;
        }
        this.g = z;
        return new ArrayList(this.k);
    }

    @Nullable
    public synchronized List<n0> u(d.a.e.d.d dVar) {
        if (dVar == this.h) {
            return null;
        }
        this.h = dVar;
        return new ArrayList(this.k);
    }
}
