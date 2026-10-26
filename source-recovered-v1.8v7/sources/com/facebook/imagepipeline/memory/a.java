package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

@TargetApi(27)
/* loaded from: classes.dex */
public class a implements u, Closeable {

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private SharedMemory f1252b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private ByteBuffer f1253c;

    /* renamed from: d, reason: collision with root package name */
    private final long f1254d;

    public a(int i) throws ErrnoException {
        d.a.b.d.i.b(i > 0);
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i);
            this.f1252b = sharedMemoryCreate;
            this.f1253c = sharedMemoryCreate.mapReadWrite();
            this.f1254d = System.identityHashCode(this);
        } catch (ErrnoException e) {
            throw new RuntimeException("Fail to create AshmemMemory", e);
        }
    }

    private void i(int i, u uVar, int i2, int i3) {
        if (!(uVar instanceof a)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        d.a.b.d.i.i(!isClosed());
        d.a.b.d.i.i(!uVar.isClosed());
        w.b(i, uVar.a(), i2, i3, a());
        this.f1253c.position(i);
        uVar.d().position(i2);
        byte[] bArr = new byte[i3];
        this.f1253c.get(bArr, 0, i3);
        uVar.d().put(bArr, 0, i3);
    }

    @Override // com.facebook.imagepipeline.memory.u
    public int a() {
        d.a.b.d.i.i(!isClosed());
        return this.f1252b.getSize();
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized int b(int i, byte[] bArr, int i2, int i3) {
        int iA;
        d.a.b.d.i.g(bArr);
        d.a.b.d.i.i(!isClosed());
        iA = w.a(i, i3, a());
        w.b(i, bArr.length, i2, iA, a());
        this.f1253c.position(i);
        this.f1253c.get(bArr, i2, iA);
        return iA;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized byte c(int i) {
        boolean z = true;
        d.a.b.d.i.i(!isClosed());
        d.a.b.d.i.b(i >= 0);
        if (i >= a()) {
            z = false;
        }
        d.a.b.d.i.b(z);
        return this.f1253c.get(i);
    }

    @Override // com.facebook.imagepipeline.memory.u, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!isClosed()) {
            SharedMemory.unmap(this.f1253c);
            this.f1252b.close();
            this.f1253c = null;
            this.f1252b = null;
        }
    }

    @Override // com.facebook.imagepipeline.memory.u
    @Nullable
    public ByteBuffer d() {
        return this.f1253c;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public long e() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized int f(int i, byte[] bArr, int i2, int i3) {
        int iA;
        d.a.b.d.i.g(bArr);
        d.a.b.d.i.i(!isClosed());
        iA = w.a(i, i3, a());
        w.b(i, bArr.length, i2, iA, a());
        this.f1253c.position(i);
        this.f1253c.put(bArr, i2, iA);
        return iA;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public long g() {
        return this.f1254d;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public void h(int i, u uVar, int i2, int i3) {
        d.a.b.d.i.g(uVar);
        if (uVar.g() == g()) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(g()) + " to AshmemMemoryChunk " + Long.toHexString(uVar.g()) + " which are the same ");
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // com.facebook.imagepipeline.memory.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean isClosed() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.nio.ByteBuffer r0 = r1.f1253c     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Lc
            android.os.SharedMemory r0 = r1.f1252b     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto La
            goto Lc
        La:
            r0 = 0
            goto Ld
        Lc:
            r0 = 1
        Ld:
            monitor-exit(r1)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.a.isClosed():boolean");
    }
}
