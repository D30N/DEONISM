package com.facebook.imagepipeline.memory;

import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public class q {
    private final d.a.b.h.h<byte[]> a;

    /* renamed from: b, reason: collision with root package name */
    final b f1287b;

    class a implements d.a.b.h.h<byte[]> {
        a() {
        }

        @Override // d.a.b.h.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr) {
            q.this.b(bArr);
        }
    }

    static class b extends r {
        public b(d.a.b.g.c cVar, f0 f0Var, g0 g0Var) {
            super(cVar, f0Var, g0Var);
        }

        @Override // com.facebook.imagepipeline.memory.b
        g<byte[]> s(int i) {
            k(i);
            return new b0(i, this.f1256c.e, 0);
        }
    }

    public q(d.a.b.g.c cVar, f0 f0Var) {
        d.a.b.d.i.b(f0Var.e > 0);
        this.f1287b = new b(cVar, f0Var, a0.h());
        this.a = new a();
    }

    public d.a.b.h.a<byte[]> a(int i) {
        return d.a.b.h.a.x(this.f1287b.get(i), this.a);
    }

    public void b(byte[] bArr) {
        this.f1287b.a(bArr);
    }
}
