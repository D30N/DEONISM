package com.facebook.animated.webp;

import android.graphics.Bitmap;
import d.a.e.a.a.d;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public class WebPFrame implements d {

    @d.a.b.d.d
    private long mNativeContext;

    @d.a.b.d.d
    WebPFrame(long j) {
        this.mNativeContext = j;
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeIsBlendWithPreviousFrame();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    private native boolean nativeShouldDisposeToBackgroundColor();

    @Override // d.a.e.a.a.d
    public void a() {
        nativeDispose();
    }

    @Override // d.a.e.a.a.d
    public void b(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }

    @Override // d.a.e.a.a.d
    public int c() {
        return nativeGetXOffset();
    }

    @Override // d.a.e.a.a.d
    public int d() {
        return nativeGetYOffset();
    }

    public boolean e() {
        return nativeIsBlendWithPreviousFrame();
    }

    public boolean f() {
        return nativeShouldDisposeToBackgroundColor();
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // d.a.e.a.a.d
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // d.a.e.a.a.d
    public int getWidth() {
        return nativeGetWidth();
    }
}
