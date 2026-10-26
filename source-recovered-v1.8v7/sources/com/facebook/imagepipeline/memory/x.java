package com.facebook.imagepipeline.memory;

import d.a.b.g.g;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public class x implements d.a.b.g.g {

    /* renamed from: b, reason: collision with root package name */
    private final int f1292b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    d.a.b.h.a<u> f1293c;

    public x(d.a.b.h.a<u> aVar, int i) {
        d.a.b.d.i.g(aVar);
        d.a.b.d.i.b(i >= 0 && i <= aVar.r().a());
        this.f1293c = aVar.clone();
        this.f1292b = i;
    }

    synchronized void a() {
        if (isClosed()) {
            throw new g.a();
        }
    }

    @Override // d.a.b.g.g
    public synchronized int b(int i, byte[] bArr, int i2, int i3) {
        a();
        d.a.b.d.i.b(i + i3 <= this.f1292b);
        return this.f1293c.r().b(i, bArr, i2, i3);
    }

    @Override // d.a.b.g.g
    public synchronized byte c(int i) {
        a();
        boolean z = true;
        d.a.b.d.i.b(i >= 0);
        if (i >= this.f1292b) {
            z = false;
        }
        d.a.b.d.i.b(z);
        return this.f1293c.r().c(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        d.a.b.h.a.o(this.f1293c);
        this.f1293c = null;
    }

    @Override // d.a.b.g.g
    @Nullable
    public synchronized ByteBuffer d() {
        return this.f1293c.r().d();
    }

    @Override // d.a.b.g.g
    public synchronized long e() {
        a();
        return this.f1293c.r().e();
    }

    @Override // d.a.b.g.g
    public synchronized boolean isClosed() {
        return !d.a.b.h.a.u(this.f1293c);
    }

    @Override // d.a.b.g.g
    public synchronized int size() {
        a();
        return this.f1292b;
    }
}
