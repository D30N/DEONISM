package com.facebook.ads.internal.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.facebook.ads.redexgen.X.C0560Iy;
import com.facebook.ads.redexgen.X.IJ;
import com.facebook.ads.redexgen.X.J4;
import java.util.Arrays;

@TargetApi(17)
/* loaded from: assets/audience_network.dex */
public final class DummySurface extends Surface {
    public static int A03;
    public static boolean A04;
    public static byte[] A05;
    public boolean A00;
    public final boolean A01;
    public final J4 A02;

    static {
        A04();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 21);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A04() {
        A05 = new byte[]{-112, -99, -109, -95, -98, -104, -109, 93, -105, -112, -95, -109, -90, -112, -95, -108, 93, -91, -95, 93, -105, -104, -106, -105, -114, -97, -108, -95, -107, -98, -95, -100, -112, -99, -110, -108, -80, -78, -73, -54, -74, -77, -67, -54, -34, -32, -35, -47, -52, -50, -48, -41, -48, -34, -34, -54, -50, -38, -39, -33, -48, -29, -33, -61, -65, -100, -95, -96, -101, -111, Byte.MAX_VALUE, -117, -111, -109, -116, -123, -93, -68, -63, -61, -66, -66, -67, -64, -62, -77, -78, 110, -66, -64, -73, -67, -64, 110, -62, -67, 110, -113, -98, -105, 110, -70, -77, -60, -77, -70, 110, Byte.MAX_VALUE, -123, -76, -74, -69, -50, -76, -57, -61, -50, -33, -31, -34, -29, -44, -46, -29, -44, -45, -50, -46, -34, -35, -29, -44, -35, -29};
    }

    public DummySurface(J4 j4, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.A02 = j4;
        this.A01 = z;
    }

    @TargetApi(24)
    public static int A00(Context context) {
        int i = 0;
        String strEglQueryString = null;
        int i2 = 0;
        char c2 = C0560Iy.A01 < 26 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (!A02(69, 7, 9).equals(C0560Iy.A04)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    if (!A02(63, 6, 86).equals(C0560Iy.A05)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return 0;
                case 5:
                    if (C0560Iy.A01 >= 26) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    context = context;
                    if (!context.getPackageManager().hasSystemFeature(A02(0, 36, 26))) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 7:
                    return 0;
                case '\b':
                    i2 = 0;
                    strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (strEglQueryString != null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return i2;
                case '\n':
                    strEglQueryString = strEglQueryString;
                    if (!strEglQueryString.contains(A02(109, 25, 90))) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case 11:
                    return i2;
                case '\f':
                    strEglQueryString = strEglQueryString;
                    if (!strEglQueryString.contains(A02(36, 27, 86))) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    i = 1;
                    c2 = 14;
                    break;
                case 14:
                    return i;
                case 15:
                    i = 2;
                    c2 = 14;
                    break;
            }
        }
    }

    public static DummySurface A01(Context context, boolean z) {
        J4 j4 = null;
        boolean z2 = false;
        A03();
        int i = 0;
        char c2 = z ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    context = context;
                    if (!A05(context)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z2 = true;
                    c2 = 4;
                    break;
                case 4:
                    IJ.A04(z2);
                    j4 = new J4();
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i = A03;
                    c2 = 6;
                    break;
                case 6:
                    return j4.A04(i);
                case 7:
                    z2 = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public static void A03() {
        if (C0560Iy.A01 >= 17) {
        } else {
            throw new UnsupportedOperationException(A02(76, 33, 57));
        }
    }

    public static synchronized boolean A05(Context context) {
        boolean z;
        z = true;
        if (!A04) {
            A03 = C0560Iy.A01 < 24 ? 0 : A00(context);
            A04 = true;
        }
        if (A03 == 0) {
            z = false;
        }
        return z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.A02) {
            if (!this.A00) {
                this.A02.A05();
                this.A00 = true;
            }
        }
    }
}
