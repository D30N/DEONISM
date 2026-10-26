package com.facebook.imagepipeline.memory;

import java.io.IOException;
import java.io.InputStream;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public class y implements d.a.b.g.h {
    private final d.a.b.g.k a;

    /* renamed from: b, reason: collision with root package name */
    private final v f1294b;

    public y(v vVar, d.a.b.g.k kVar) {
        this.f1294b = vVar;
        this.a = kVar;
    }

    x f(InputStream inputStream, z zVar) {
        this.a.a(inputStream, zVar);
        return zVar.a();
    }

    @Override // d.a.b.g.h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public x d(InputStream inputStream) throws X, IOException {
        z zVar = new z(this.f1294b);
        try {
            return f(inputStream, zVar);
        } finally {
            zVar.close();
        }
    }

    @Override // d.a.b.g.h
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public x a(InputStream inputStream, int i) throws X, IOException {
        z zVar = new z(this.f1294b, i);
        try {
            return f(inputStream, zVar);
        } finally {
            zVar.close();
        }
    }

    @Override // d.a.b.g.h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public x c(byte[] bArr) throws X, IOException {
        z zVar = new z(this.f1294b, bArr.length);
        try {
            try {
                zVar.write(bArr, 0, bArr.length);
                return zVar.a();
            } catch (IOException e) {
                d.a.b.d.m.a(e);
                throw null;
            }
        } finally {
            zVar.close();
        }
    }

    @Override // d.a.b.g.h
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public z b() {
        return new z(this.f1294b);
    }

    @Override // d.a.b.g.h
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public z e(int i) {
        return new z(this.f1294b, i);
    }
}
