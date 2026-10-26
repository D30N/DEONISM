package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class j implements u, Closeable {

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f1284b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1285c;

    /* renamed from: d, reason: collision with root package name */
    private final long f1286d = System.identityHashCode(this);

    public j(int i) {
        this.f1284b = ByteBuffer.allocateDirect(i);
        this.f1285c = i;
    }

    private void i(int i, u uVar, int i2, int i3) {
        if (!(uVar instanceof j)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        d.a.b.d.i.i(!isClosed());
        d.a.b.d.i.i(!uVar.isClosed());
        w.b(i, uVar.a(), i2, i3, this.f1285c);
        this.f1284b.position(i);
        uVar.d().position(i2);
        byte[] bArr = new byte[i3];
        this.f1284b.get(bArr, 0, i3);
        uVar.d().put(bArr, 0, i3);
    }

    @Override // com.facebook.imagepipeline.memory.u
    public int a() {
        return this.f1285c;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized int b(int i, byte[] bArr, int i2, int i3) {
        int iA;
        d.a.b.d.i.g(bArr);
        d.a.b.d.i.i(!isClosed());
        iA = w.a(i, i3, this.f1285c);
        w.b(i, bArr.length, i2, iA, this.f1285c);
        this.f1284b.position(i);
        this.f1284b.get(bArr, i2, iA);
        return iA;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized byte c(int i) {
        boolean z = true;
        d.a.b.d.i.i(!isClosed());
        d.a.b.d.i.b(i >= 0);
        if (i >= this.f1285c) {
            z = false;
        }
        d.a.b.d.i.b(z);
        return this.f1284b.get(i);
    }

    @Override // com.facebook.imagepipeline.memory.u, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f1284b = null;
    }

    @Override // com.facebook.imagepipeline.memory.u
    @Nullable
    public synchronized ByteBuffer d() {
        return this.f1284b;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public long e() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized int f(int i, byte[] bArr, int i2, int i3) {
        int iA;
        d.a.b.d.i.g(bArr);
        d.a.b.d.i.i(!isClosed());
        iA = w.a(i, i3, this.f1285c);
        w.b(i, bArr.length, i2, iA, this.f1285c);
        this.f1284b.position(i);
        this.f1284b.put(bArr, i2, iA);
        return iA;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public long g() {
        return this.f1286d;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public void h(int i, u uVar, int i2, int i3) {
        d.a.b.d.i.g(uVar);
        if (uVar.g() == g()) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(g()) + " to BufferMemoryChunk " + Long.toHexString(uVar.g()) + " which are the same ");
            d.a.b.d.i.b(false);
        }
        if (uVar.g() < g()) {
            synchronized (uVar) {
                synchronized (this) {
                    i(i, uVar, i2, i3);
                }
            }
        } else {
            synchronized (this) {
                synchronized (uVar) {
                    i(i, uVar, i2, i3);
                }
            }
        }
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized boolean isClosed() {
        return this.f1284b == null;
    }
}
