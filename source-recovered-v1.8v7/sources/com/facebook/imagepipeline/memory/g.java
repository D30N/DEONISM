package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import java.util.Queue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes.dex */
class g<V> {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1276b;

    /* renamed from: c, reason: collision with root package name */
    final Queue f1277c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1278d;
    private int e;

    public g(int i, int i2, int i3, boolean z) {
        d.a.b.d.i.i(i > 0);
        d.a.b.d.i.i(i2 >= 0);
        d.a.b.d.i.i(i3 >= 0);
        this.a = i;
        this.f1276b = i2;
        this.f1277c = new LinkedList();
        this.e = i3;
        this.f1278d = z;
    }

    void a(V v) {
        this.f1277c.add(v);
    }

    public void b() {
        d.a.b.d.i.i(this.e > 0);
        this.e--;
    }

    @Nullable
    @Deprecated
    public V c() {
        V vG = g();
        if (vG != null) {
            this.e++;
        }
        return vG;
    }

    int d() {
        return this.f1277c.size();
    }

    public void e() {
        this.e++;
    }

    public boolean f() {
        return this.e + d() > this.f1276b;
    }

    @Nullable
    public V g() {
        return (V) this.f1277c.poll();
    }

    public void h(V v) {
        int i;
        d.a.b.d.i.g(v);
        if (this.f1278d) {
            d.a.b.d.i.i(this.e > 0);
            i = this.e;
        } else {
            i = this.e;
            if (i <= 0) {
                d.a.b.e.a.j("BUCKET", "Tried to release value %s from an empty bucket!", v);
                return;
            }
        }
        this.e = i - 1;
        a(v);
    }
}
