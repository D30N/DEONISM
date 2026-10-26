package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.support.annotation.Nullable;
import d.b.a.b.k;
import java.util.Arrays;

@TargetApi(17)
/* loaded from: assets/audience_network.dex */
public final class IT implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static byte[] A06;
    public static final int[] A07;

    @Nullable
    public SurfaceTexture A00;

    @Nullable
    public EGLContext A01;

    @Nullable
    public EGLDisplay A02;

    @Nullable
    public EGLSurface A03;
    public final Handler A04;
    public final int[] A05 = new int[1];

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 76);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A06 = new byte[]{-26, -21, -58, -28, -19, -45, -28, -9, -13, -12, -15, -28, -14, -97, -27, -32, -24, -21, -28, -29, -83, -97, -60, -15, -15, -18, -15, -71, -97, 4, 6, 11, -30, 17, 4, 0, 19, 4, -17, 1, 20, 5, 5, 4, 17, -14, 20, 17, 5, 0, 2, 4, -65, 5, 0, 8, 11, 4, 3, -35, -33, -28, -65, -35, -20, -68, -31, -21, -24, -28, -39, -15, -104, -34, -39, -31, -28, -35, -36, -72, -70, -65, -106, -59, -72, -76, -57, -72, -106, -62, -63, -57, -72, -53, -57, 115, -71, -76, -68, -65, -72, -73, -19, -17, -12, -43, -23, -13, -19, -53, -3, -6, -6, -19, -10, -4, -88, -18, -23, -15, -12, -19, -20, 43, 45, 50, 15, 52, 47, 58, 47, 39, 50, 47, 64, 43, -26, 44, 39, 47, 50, 43, 42, -22, -20, -15, -56, -19, -12, -12, -8, -22, -56, -12, -13, -21, -18, -20, -91, -21, -26, -18, -15, -22, -23, -65, -91, -8, -6, -24, -24, -22, -8, -8, -62, -86, -25, -79, -91, -13, -6, -14, -56, -12, -13, -21, -18, -20, -8, -32, -75, -30, -62, -86, -23, -79, -91, -24, -12, -13, -21, -18, -20, -8, -32, -75, -30, -62, -86, -8};
    }

    static {
        A05();
        A07 = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    }

    public IT(Handler handler) {
        this.A04 = handler;
    }

    public static EGLConfig A00(EGLDisplay eGLDisplay) {
        EGLConfig[] configs = new EGLConfig[1];
        int[] numConfigs = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, A07, 0, configs, 0, 1, numConfigs, 0);
        char c2 = 0;
        char c3 = zEglChooseConfig ? (char) 2 : (char) 5;
        while (true) {
            switch (c3) {
                case 2:
                    numConfigs = numConfigs;
                    c2 = 0;
                    if (numConfigs[0] <= 0) {
                        c3 = 5;
                        break;
                    } else {
                        c3 = 3;
                        break;
                    }
                case 3:
                    configs = configs;
                    if (configs[c2] == null) {
                        c3 = 5;
                        break;
                    } else {
                        c3 = 4;
                        break;
                    }
                case 4:
                    return configs[c2];
                case 5:
                    Object[] objArr = new Object[3];
                    objArr[c2] = Boolean.valueOf(zEglChooseConfig);
                    objArr[1] = Integer.valueOf(numConfigs[c2]);
                    objArr[2] = configs[c2];
                    throw new IR(C0560Iy.A0S(A04(143, 67, 57), objArr));
            }
        }
    }

    public static EGLContext A01(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr = null;
        EGLContext eGLContextEglCreateContext = null;
        char c2 = i == 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    iArr = new int[]{12440, 2, 12344};
                    c2 = 3;
                    break;
                case 3:
                    eGLDisplay = eGLDisplay;
                    eGLConfig = eGLConfig;
                    iArr = iArr;
                    eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                    if (eGLContextEglCreateContext == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return eGLContextEglCreateContext;
                case 5:
                    iArr = new int[]{12440, 2, 12992, 1, 12344};
                    c2 = 3;
                    break;
                case 6:
                    throw new IR(A04(79, 23, 7));
            }
        }
    }

    public static EGLDisplay A02() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        char c2 = eGLDisplayEglGetDisplay != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    eGLDisplayEglGetDisplay = eGLDisplayEglGetDisplay;
                    int[] iArr = new int[2];
                    boolean eglInitialized = EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
                    if (!eglInitialized) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return eGLDisplayEglGetDisplay;
                case 4:
                    throw new IR(A04(k.AppCompatTheme_windowMinWidthMinor, 20, k.AppCompatTheme_windowMinWidthMajor));
                case 5:
                    throw new IR(A04(59, 20, 44));
            }
        }
    }

    public static EGLSurface A03(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = null;
        EGLSurface eGLSurface = null;
        int[] iArr = null;
        char c2 = i == 1 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    eGLSurface = EGL14.EGL_NO_SURFACE;
                    c2 = 3;
                    break;
                case 3:
                    eGLDisplay = eGLDisplay;
                    eGLContext = eGLContext;
                    eGLSurface = eGLSurface;
                    if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return eGLSurface;
                case 5:
                    if (i != 2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                    c2 = 7;
                    break;
                case 7:
                    eGLDisplay = eGLDisplay;
                    eGLConfig = eGLConfig;
                    iArr = iArr;
                    eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
                    if (eGLSurfaceEglCreatePbufferSurface == null) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    eGLSurfaceEglCreatePbufferSurface = eGLSurfaceEglCreatePbufferSurface;
                    eGLSurface = eGLSurfaceEglCreatePbufferSurface;
                    c2 = 3;
                    break;
                case '\t':
                    iArr = new int[]{12375, 1, 12374, 1, 12344};
                    c2 = 7;
                    break;
                case '\n':
                    throw new IR(A04(102, 21, 60));
                case 11:
                    throw new IR(A04(29, 30, 83));
            }
        }
    }

    public static void A06(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        int errorCode = GLES20.glGetError();
        if (errorCode == 0) {
            return;
        }
        throw new IR(A04(0, 29, 51) + Integer.toHexString(errorCode));
    }

    public final SurfaceTexture A07() {
        return (SurfaceTexture) IJ.A01(this.A00);
    }

    public final void A08() throws Throwable {
        IT it = this;
        Throwable th = null;
        EGLSurface eGLSurface = null;
        EGLDisplay eGLDisplay = null;
        EGLContext eGLContext = null;
        EGLContext eGLContext2 = null;
        EGLDisplay eGLDisplay2 = null;
        EGLSurface eGLSurface2 = null;
        it.A04.removeCallbacks(it);
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        it = it;
                        if (it.A00 != null) {
                            it.A00.release();
                            GLES20.glDeleteTextures(1, it.A05, 0);
                        }
                        eGLDisplay2 = it.A02;
                        if (eGLDisplay2 == null) {
                            c2 = 11;
                            break;
                        } else {
                            c2 = '\t';
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        eGLDisplay = it.A02;
                        if (eGLDisplay == null) {
                            c2 = 22;
                            break;
                        } else {
                            c2 = 20;
                            break;
                        }
                    }
                case '\t':
                    eGLDisplay2 = eGLDisplay2;
                    if (!eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case '\n':
                    it = it;
                    EGL14.eglMakeCurrent(it.A02, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                    c2 = 11;
                    break;
                case 11:
                    it = it;
                    eGLSurface2 = it.A03;
                    if (eGLSurface2 == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    eGLSurface2 = eGLSurface2;
                    if (!eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case '\r':
                    it = it;
                    EGL14.eglDestroySurface(it.A02, it.A03);
                    c2 = 14;
                    break;
                case 14:
                    it = it;
                    eGLContext2 = it.A01;
                    if (eGLContext2 == null) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    it = it;
                    eGLContext2 = eGLContext2;
                    EGL14.eglDestroyContext(it.A02, eGLContext2);
                    c2 = 16;
                    break;
                case 16:
                    if (C0560Iy.A01 < 19) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    EGL14.eglReleaseThread();
                    c2 = 18;
                    break;
                case 18:
                    IT it2 = it;
                    it2.A02 = null;
                    it2.A01 = null;
                    it2.A03 = null;
                    it2.A00 = null;
                    return;
                case 20:
                    eGLDisplay = eGLDisplay;
                    if (!eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 21:
                    it = it;
                    EGL14.eglMakeCurrent(it.A02, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                    c2 = 22;
                    break;
                case 22:
                    it = it;
                    eGLSurface = it.A03;
                    if (eGLSurface == null) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    eGLSurface = eGLSurface;
                    if (!eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 24:
                    it = it;
                    EGL14.eglDestroySurface(it.A02, it.A03);
                    c2 = 25;
                    break;
                case 25:
                    it = it;
                    eGLContext = it.A01;
                    if (eGLContext == null) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    it = it;
                    eGLContext = eGLContext;
                    EGL14.eglDestroyContext(it.A02, eGLContext);
                    c2 = 27;
                    break;
                case 27:
                    if (C0560Iy.A01 < 19) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    EGL14.eglReleaseThread();
                    c2 = 29;
                    break;
                case 29:
                    IT it3 = it;
                    Throwable th3 = th;
                    it3.A02 = null;
                    it3.A01 = null;
                    it3.A03 = null;
                    it3.A00 = null;
                    throw th3;
            }
        }
    }

    public final void A09(int i) {
        this.A02 = A02();
        EGLConfig eGLConfigA00 = A00(this.A02);
        this.A01 = A01(this.A02, eGLConfigA00, i);
        this.A03 = A03(this.A02, eGLConfigA00, this.A01, i);
        A06(this.A05);
        this.A00 = new SurfaceTexture(this.A05[0]);
        this.A00.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A04.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        IT it = this;
        IT it2 = null;
        char c2 = C0601Ko.A02(it) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    it = it;
                    it2 = it;
                    c2 = 4;
                    break;
                case 4:
                    try {
                        it2 = it2;
                        if (it2.A00 != null) {
                            it2.A00.updateTexImage();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        C0601Ko.A00(th, it2);
                        return;
                    }
            }
        }
    }
}
