package com.facebook.imagepipeline.memory;

import java.io.IOException;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes.dex */
public class z extends d.a.b.g.j {

    /* renamed from: b, reason: collision with root package name */
    private final v f1295b;

    /* renamed from: c, reason: collision with root package name */
    private d.a.b.h.a<u> f1296c;

    /* renamed from: d, reason: collision with root package name */
    private int f1297d;

    public static class a extends RuntimeException {
        public a() {
            super("OutputStream no longer valid");
        }
    }

    public z(v vVar) {
        this(vVar, vVar.y());
    }

    public z(v vVar, int i) {
        d.a.b.d.i.b(i > 0);
        d.a.b.d.i.g(vVar);
        v vVar2 = vVar;
        this.f1295b = vVar2;
        this.f1297d = 0;
        this.f1296c = d.a.b.h.a.x(vVar2.get(i), this.f1295b);
    }

    private void f() {
        if (!d.a.b.h.a.u(this.f1296c)) {
            throw new a();
        }
    }

    @Override // d.a.b.g.j, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws X, IOException {
        d.a.b.h.a.o(this.f1296c);
        this.f1296c = null;
        this.f1297d = -1;
        super.close();
    }

    void g(int i) throws X {
        f();
        if (i <= this.f1296c.r().a()) {
            return;
        }
        u uVar = this.f1295b.get(i);
        this.f1296c.r().h(0, uVar, 0, this.f1297d);
        this.f1296c.close();
        this.f1296c = d.a.b.h.a.x(uVar, this.f1295b);
    }

    @Override // d.a.b.g.j
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public x a() {
        f();
        return new x(this.f1296c, this.f1297d);
    }

    @Override // d.a.b.g.j
    public int size() {
        return this.f1297d;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws X {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            f();
            g(this.f1297d + i2);
            this.f1296c.r().f(this.f1297d, bArr, i, i2);
            this.f1297d += i2;
            return;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
    }
}
