package com.facebook.animated.webp;

import com.facebook.imagepipeline.nativecode.e;
import d.a.b.d.d;
import d.a.b.d.i;
import d.a.e.a.a.b;
import d.a.e.a.a.c;
import java.nio.ByteBuffer;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@d
/* loaded from: classes.dex */
public class WebPImage implements c, d.a.e.a.b.c {

    @d
    private long mNativeContext;

    @d
    public WebPImage() {
    }

    @d
    WebPImage(long j) {
        this.mNativeContext = j;
    }

    public static WebPImage j(long j, int i) {
        e.a();
        i.b(j != 0);
        return nativeCreateFromNativeMemory(j, i);
    }

    public static WebPImage k(ByteBuffer byteBuffer) {
        e.a();
        byteBuffer.rewind();
        return nativeCreateFromDirectByteBuffer(byteBuffer);
    }

    public static WebPImage l(byte[] bArr) {
        e.a();
        i.g(bArr);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.put(bArr);
        byteBufferAllocateDirect.rewind();
        return nativeCreateFromDirectByteBuffer(byteBufferAllocateDirect);
    }

    private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    @Override // d.a.e.a.a.c
    public int a() {
        return nativeGetFrameCount();
    }

    @Override // d.a.e.a.a.c
    public int b() {
        return nativeGetLoopCount();
    }

    @Override // d.a.e.a.a.c
    public b c(int i) {
        WebPFrame webPFrameF = f(i);
        try {
            return new b(i, webPFrameF.c(), webPFrameF.d(), webPFrameF.getWidth(), webPFrameF.getHeight(), webPFrameF.e() ? b.a.BLEND_WITH_PREVIOUS : b.a.NO_BLEND, webPFrameF.f() ? b.EnumC0089b.DISPOSE_TO_BACKGROUND : b.EnumC0089b.DISPOSE_DO_NOT);
        } finally {
            webPFrameF.a();
        }
    }

    @Override // d.a.e.a.a.c
    public int[] d() {
        return nativeGetFrameDurations();
    }

    @Override // d.a.e.a.b.c
    public c e(ByteBuffer byteBuffer) {
        return k(byteBuffer);
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // d.a.e.a.b.c
    public c g(long j, int i) {
        return j(j, i);
    }

    @Override // d.a.e.a.a.c
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // d.a.e.a.a.c
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // d.a.e.a.a.c
    public int h() {
        return nativeGetSizeInBytes();
    }

    @Override // d.a.e.a.a.c
    public boolean i() {
        return true;
    }

    @Override // d.a.e.a.a.c
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public WebPFrame f(int i) {
        return nativeGetFrame(i);
    }
}
