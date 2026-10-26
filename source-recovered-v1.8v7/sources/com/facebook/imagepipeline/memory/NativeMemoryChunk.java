package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

@d.a.b.d.d
/* loaded from: classes.dex */
public class NativeMemoryChunk implements u, Closeable {

    /* renamed from: b, reason: collision with root package name */
    private final long f1249b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1250c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1251d;

    static {
        com.facebook.soloader.o.a.c("imagepipeline");
    }

    public NativeMemoryChunk() {
        this.f1250c = 0;
        this.f1249b = 0L;
        this.f1251d = true;
    }

    public NativeMemoryChunk(int i) {
        d.a.b.d.i.b(i > 0);
        this.f1250c = i;
        this.f1249b = nativeAllocate(i);
        this.f1251d = false;
    }

    private void i(int i, u uVar, int i2, int i3) {
        if (!(uVar instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        d.a.b.d.i.i(!isClosed());
        d.a.b.d.i.i(!uVar.isClosed());
        w.b(i, uVar.a(), i2, i3, this.f1250c);
        nativeMemcpy(uVar.e() + i2, this.f1249b + i, i3);
    }

    @d.a.b.d.d
    private static native long nativeAllocate(int i);

    @d.a.b.d.d
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @d.a.b.d.d
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @d.a.b.d.d
    private static native void nativeFree(long j);

    @d.a.b.d.d
    private static native void nativeMemcpy(long j, long j2, int i);

    @d.a.b.d.d
    private static native byte nativeReadByte(long j);

    @Override // com.facebook.imagepipeline.memory.u
    public int a() {
        return this.f1250c;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized int b(int i, byte[] bArr, int i2, int i3) {
        int iA;
        d.a.b.d.i.g(bArr);
        d.a.b.d.i.i(!isClosed());
        iA = w.a(i, i3, this.f1250c);
        w.b(i, bArr.length, i2, iA, this.f1250c);
        nativeCopyToByteArray(this.f1249b + i, bArr, i2, iA);
        return iA;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized byte c(int i) {
        boolean z = true;
        d.a.b.d.i.i(!isClosed());
        d.a.b.d.i.b(i >= 0);
        if (i >= this.f1250c) {
            z = false;
        }
        d.a.b.d.i.b(z);
        return nativeReadByte(this.f1249b + i);
    }

    @Override // com.facebook.imagepipeline.memory.u, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f1251d) {
            this.f1251d = true;
            nativeFree(this.f1249b);
        }
    }

    @Override // com.facebook.imagepipeline.memory.u
    @Nullable
    public ByteBuffer d() {
        return null;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public long e() {
        return this.f1249b;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public synchronized int f(int i, byte[] bArr, int i2, int i3) {
        int iA;
        d.a.b.d.i.g(bArr);
        d.a.b.d.i.i(!isClosed());
        iA = w.a(i, i3, this.f1250c);
        w.b(i, bArr.length, i2, iA, this.f1250c);
        nativeCopyFromByteArray(this.f1249b + i, bArr, i2, iA);
        return iA;
    }

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.imagepipeline.memory.u
    public long g() {
        return this.f1249b;
    }

    @Override // com.facebook.imagepipeline.memory.u
    public void h(int i, u uVar, int i2, int i3) {
        d.a.b.d.i.g(uVar);
        if (uVar.g() == g()) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(uVar)) + " which share the same address " + Long.toHexString(this.f1249b));
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
        return this.f1251d;
    }
}
