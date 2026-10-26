package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.util.Log;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import d.b.a.b.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.3T, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C3T extends EN {
    public static byte[] A0d;
    public static final byte[] A0e;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaCodec A06;
    public Format A07;
    public InterfaceC0396Bv<C0948Ye> A08;
    public InterfaceC0396Bv<C0948Ye> A09;
    public C0418Da A0A;
    public ByteBuffer A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public ByteBuffer[] A0S;
    public ByteBuffer[] A0T;
    public BW A0U;
    public final MediaCodec.BufferInfo A0V;
    public final A9 A0W;
    public final YT A0X;
    public final YT A0Y;

    @Nullable
    public final InterfaceC0397Bw<C0948Ye> A0Z;
    public final Dg A0a;
    public final List<Long> A0b;
    public final boolean A0c;

    public static String A0Z(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0d, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 113);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0j() {
        A0d = new byte[]{9, 33, 32, 37, 29, -1, 43, 32, 33, 31, 14, 33, 42, 32, 33, 46, 33, 46, -32, -38, -70, -44, -59, -67, -67, -66, -66, -66, -66, -66, -65, -60, -59, -62, -64, -47, -66, -66, -48, -46, -49, -64, -61, -57, -66, -66, -66, -66, -66, -66, -65, -60, -58, -47, -45, -66, -44, -65, -63, -64, -66, -66, -66, -66, -66, -66, -65, -60, -61, -58, -58, -58, -62, -66, -46, -47, -45, -59, -65, -65, -58, -49, -66, -66, -66, -64, -44, -48, -44, -65, -47, -63, -65, -47, -63, -64, -59, -61, -46, -59, -58, -39, -45, -93, -95, -95, -95, 13, 25, 24, 16, 19, 17, 31, 28, 15, -19, 25, 14, 15, 13, -12, -14, -3, -45, 12, 20, 20, 12, 17, 10, -45, 27, 20, 23, 7, 14, 24, -45, 9, 10, 8, 20, 9, 10, 23, 55, 53, 64, 22, 73, 85, 84, 87, 79, 81, 75, 22, 73, 94, 75, 22, 76, 77, 75, 87, 76, 77, 90, 22, 73, 95, 77, 91, 87, 85, 77, 22, 91, 77, 75, 93, 90, 77, -97, -109, -43, -24, -25, -109, 1, -1, 10, -32, -1, 6, -3, -32, 8, -5, -10, -9, 1, -32, -10, -9, -11, 1, -10, -9, 4, -32, -13, 8, -11, -16, -18, -7, -49, -12, -26, -28, -49, 2, 23, 4, -49, 5, 6, 4, -49, 20, 6, 4, 22, 19, 6, 86, 72, 67, 83, 71, 41, 35, 3, 32, 13, 6, 6, 35, 49, 32, 40, 45, 0, 45, 35, 5, 36, 36, 35, -22, -24, -13, -55, -23, 17, 4, -1, 4, -4, -55, 3, -51, -47, -49, -55, -1, 0, -2, 10, -1, 0, 1, 6, 20, 13, 19, 17, 28, -14, 54, 47, -14, 58, 45, 40, 41, 51, 35, 40, 41, 39, 51, 40, 41, 54, -14, 37, 58, 39, -15, -42, 4, -1, -78, 5, -9, 5, 5, -5, 1, 0, -78, 4, -9, 3, 7, -5, 4, -9, 5, -78, 5, -9, -11, 7, 4, -9, -78, -10, -9, -11, 1, -10, -9, 4, -78, -8, 1, 4, -78, -25, -24, -43, -26, -24, -73, -29, -40, -39, -41, 62, 60, 71, 29, 52, 103, 104, 93, 94, 98, 29, 80, 101, 82, 29, 83, 84, 82, -13, -16, -12, -14, -13, -1, 16, 40, 39, 44, 36, -29, 53, 40, 52, 56, 44, 53, 40, 54, -29, 36, -29, 7, 53, 48, 22, 40, 54, 54, 44, 50, 49, 16, 36, 49, 36, 42, 40, 53, 7, 5, 16, -26, 25, 36, 36, 47, 33, 38, 38, 29, 42, -26, 46, 33, 28, 29, 39, -26, 28, 29, 27, 39, 28, 29, 42, -26, 25, 46, 27, -16, -18, -7, -49, -18, -11, -20, -49, -30, -10, -27, -22, -16, -49, -27, -26, -28, -16, -27, -26, -13, -49, -18, -15, -44, -26, -20, -17, -11, -18, -28, -27, -14, -33, -20, -12, -27, -7, -9, 2, -40, 11, 23, 22, 25, 17, 19, 13, -40, 11, 32, 13, -40, 14, 15, 13, 25, 14, 15, 28, -40, 11, 33, 15, 29, 25, 23, 15, -61, -56, -42, -43, 33, 39, 42, 48, 41, 31, 32, 45, 29, 40, 37, 43, 38, 27, 40, -3, -5, 6, -36, 21, 29, 29, 21, 26, 19, -36, 15, 15, 17, -36, 18, 19, 17, 29, 18, 19, 32, 49, 47, 58, 16, 48, 88, 75, 70, 75, 67, 16, 74, 20, 24, 22, 16, 70, 71, 69, 81, 70, 71, 16, 85, 71, 69, 87, 84, 71, -50, -56, -88, -68, -80, -83, -85, -14, -20, -52, -13, -44, -41, -44, -52, -54, -43, -85, -62, -11, -10, -21, -20, -16, -85, -34, -13, -32, -85, -31, -30, -32, -85, -16, -30, -32, -14, -17, -30, -6, 9, -4, -8, 11, -4, -38, 6, -5, -4, -6, -47, 80, 69, 72, 61, 76, 69, 61, 72, 77, 70, 83, 83, 74, 81, 18, 72, 84, 90, 83, 89, 27, 71, 59, 84, 73, 72, 46, 51, 65, 47, 40, 38, 49, 7, 44, 30, 28, 7, 58, 79, 60, 7, 61, 62, 60, 42, 36, 4, 24, 12, 8, 7, 74, 75, -4, 79, 65, 63, 81, 78, 65, -4, 64, 65, 63, 75, 64, 65, 78, -4, 61, 82, 61, 69, 72, 61, 62, 72, 65, 10, -4, 48, 78, 85, 69, 74, 67, -4, 80, 75, -4, 76, 78, 75, 63, 65, 65, 64, -4, 83, 69, 80, 68, -4};
    }

    public abstract int A1B(Dg dg, InterfaceC0397Bw<C0948Ye> interfaceC0397Bw, Format format) throws C0424Dj;

    public abstract void A1N(C0418Da c0418Da, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws C0424Dj;

    public abstract boolean A1P(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C03479w;

    static {
        A0j();
        A0e = C0560Iy.A0k(A0Z(25, 76, 29));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bw != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C3T(int i, Dg dg, @Nullable InterfaceC0397Bw<C0948Ye> interfaceC0397Bw, boolean z) {
        super(i);
        IJ.A04(C0560Iy.A01 >= 16);
        this.A0a = (Dg) IJ.A01(dg);
        this.A0Z = interfaceC0397Bw;
        this.A0c = z;
        this.A0X = new YT(0);
        this.A0Y = YT.A02();
        this.A0W = new A9();
        this.A0b = new ArrayList();
        this.A0V = new MediaCodec.BufferInfo();
        this.A01 = 0;
        this.A02 = 0;
    }

    private int A0W(String str) {
        char c2 = C0560Iy.A01 <= 25 ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!A0Z(603, 25, 12).equals(str)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (!C0560Iy.A05.startsWith(A0Z(596, 7, 46))) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 4:
                    if (!C0560Iy.A05.startsWith(A0Z(685, 7, 102))) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 5:
                    if (!C0560Iy.A05.startsWith(A0Z(589, 7, 10))) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    if (!C0560Iy.A05.startsWith(A0Z(242, 7, 101))) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return 2;
                case '\b':
                    if (C0560Iy.A01 >= 24) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    str = str;
                    if (!A0Z(261, 22, 42).equals(str)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case '\n':
                    str = str;
                    if (!A0Z(560, 29, 113).equals(str)) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    if (!A0Z(523, 8, 74).equals(C0560Iy.A02)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case '\f':
                    if (!A0Z(476, 12, 15).equals(C0560Iy.A02)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case '\r':
                    if (!A0Z(531, 7, 69).equals(C0560Iy.A02)) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 14:
                    if (!A0Z(640, 7, 107).equals(C0560Iy.A02)) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    return 1;
                case 16:
                    return 0;
            }
        }
    }

    private final long A0X() {
        return 0L;
    }

    public static MediaCodec.CryptoInfo A0Y(YT yt, int i) {
        MediaCodec.CryptoInfo cryptoInfo = yt.A02.A02();
        char c2 = i == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return cryptoInfo;
                case 3:
                    cryptoInfo = cryptoInfo;
                    if (cryptoInfo.numBytesOfClearData != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    cryptoInfo = cryptoInfo;
                    cryptoInfo.numBytesOfClearData = new int[1];
                    c2 = 5;
                    break;
                case 5:
                    MediaCodec.CryptoInfo cryptoInfo2 = cryptoInfo;
                    int[] iArr = cryptoInfo2.numBytesOfClearData;
                    iArr[0] = iArr[0] + i;
                    return cryptoInfo2;
            }
        }
    }

    private ByteBuffer A0a(int i) {
        if (C0560Iy.A01 >= 21) {
            return this.A06.getInputBuffer(i);
        }
        return this.A0S[i];
    }

    private ByteBuffer A0b(int i) {
        if (C0560Iy.A01 >= 21) {
            return this.A06.getOutputBuffer(i);
        }
        return this.A0T[i];
    }

    private void A0c() {
        if (C0560Iy.A01 < 21) {
            this.A0S = this.A06.getInputBuffers();
            this.A0T = this.A06.getOutputBuffers();
        }
    }

    private void A0d() throws Throwable {
        C3T c3t = this;
        char c2 = c3t.A02 == 2 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c3t = c3t;
                    c3t.A1G();
                    c3t.A1I();
                    c2 = 3;
                    break;
                case 3:
                    return;
                case 4:
                    c3t = c3t;
                    c3t.A0N = true;
                    c3t.A1H();
                    c2 = 3;
                    break;
            }
        }
    }

    private void A0e() {
        if (C0560Iy.A01 < 21) {
            this.A0T = this.A06.getOutputBuffers();
        }
    }

    private void A0f() throws C03479w {
        C3T c3t = this;
        int i = 0;
        MediaFormat outputFormat = c3t.A06.getOutputFormat();
        char c2 = c3t.A00 != 0 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    outputFormat = outputFormat;
                    i = 32;
                    if (outputFormat.getInteger(A0Z(237, 5, 110)) != 32) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    outputFormat = outputFormat;
                    if (outputFormat.getInteger(A0Z(380, 6, 26)) != i) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c3t.A0O = true;
                    return;
                case 5:
                    c3t = c3t;
                    if (!c3t.A0I) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    outputFormat = outputFormat;
                    outputFormat.setInteger(A0Z(647, 13, k.AppCompatTheme_windowActionBarOverlay), 1);
                    c2 = 7;
                    break;
                case 7:
                    C3T c3t2 = c3t;
                    c3t2.A1K(c3t2.A06, outputFormat);
                    return;
            }
        }
    }

    private void A0g() {
        if (C0560Iy.A01 < 21) {
            this.A0S = null;
            this.A0T = null;
        }
    }

    private void A0h() {
        this.A03 = -1;
        this.A0X.A01 = null;
    }

    private void A0i() {
        this.A04 = -1;
        this.A0B = null;
    }

    private void A0k(C0419Dc c0419Dc) throws C03479w {
        throw C03479w.A01(c0419Dc, A0y());
    }

    private boolean A0l() {
        boolean z = false;
        char c2 = A0Z(660, 6, 105).equals(C0560Iy.A04) ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (!A0Z(283, 4, 79).equals(C0560Iy.A05)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    if (!A0Z(666, 4, k.AppCompatTheme_windowNoTitle).equals(C0560Iy.A05)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0288, code lost:
    
        r11.A0h();
        r0.A0J = r1;
        r0.A01 = r2 ? 1 : 0;
        r0.A0U.A04 += r1 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0296, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0m() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3T.A0m():boolean");
    }

    private boolean A0n() {
        boolean z = false;
        char c2 = this.A04 >= 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    private boolean A0o(long j) {
        C3T c3t = this;
        int size = c3t.A0b.size();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= size) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c3t = c3t;
                    if (c3t.A0b.get(i).longValue() != j) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c3t.A0b.remove(i);
                    return true;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return false;
            }
        }
    }

    private boolean A0p(long j, long j2) throws Throwable {
        C3T c3t = this;
        boolean z = false;
        ByteBuffer byteBuffer = null;
        int iDequeueOutputBuffer = 0;
        boolean zA1P = false;
        C3T c3t2 = c3t;
        char c2 = !c3t.A0n() ? (char) 2 : (char) 31;
        while (true) {
            switch (c2) {
                case 2:
                    c3t2 = c3t2;
                    if (!c3t2.A0F) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c3t2 = c3t2;
                    if (!c3t2.A0K) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    try {
                        c3t2 = c3t2;
                        iDequeueOutputBuffer = c3t2.A06.dequeueOutputBuffer(c3t2.A0V, c3t.A0X());
                        c2 = '\r';
                        break;
                    } catch (IllegalStateException unused) {
                        c3t.A0d();
                        if (!c3t2.A0N) {
                            c2 = 11;
                            break;
                        } else {
                            c2 = '\n';
                            break;
                        }
                    }
                case '\n':
                    c3t = c3t;
                    c3t.A1G();
                    c2 = 11;
                    break;
                case 11:
                    return false;
                case '\f':
                    c3t = c3t;
                    c3t2 = c3t2;
                    iDequeueOutputBuffer = c3t2.A06.dequeueOutputBuffer(c3t2.A0V, c3t.A0X());
                    c2 = '\r';
                    break;
                case '\r':
                    if (iDequeueOutputBuffer < 0) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c3t2 = c3t2;
                    if (!c3t2.A0O) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    C3T c3t3 = c3t2;
                    c3t3.A0O = false;
                    c3t3.A06.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    return true;
                case 16:
                    c3t2 = c3t2;
                    if (c3t2.A0V.size != 0) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c3t2 = c3t2;
                    if ((c3t2.A0V.flags & 4) == 0) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c3t.A0d();
                    return false;
                case 19:
                    if (iDequeueOutputBuffer != -2) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    c3t.A0f();
                    return true;
                case 21:
                    if (iDequeueOutputBuffer != -3) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    c3t.A0e();
                    return true;
                case 23:
                    c3t2 = c3t2;
                    if (!c3t2.A0G) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    c3t2 = c3t2;
                    if (!c3t2.A0M) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 25:
                    c3t2 = c3t2;
                    if (c3t2.A02 != 2) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    c3t = c3t;
                    c3t.A0d();
                    c2 = 27;
                    break;
                case 27:
                    return false;
                case 28:
                    c3t2 = c3t2;
                    c3t2.A04 = iDequeueOutputBuffer;
                    c3t2.A0B = c3t2.A0b(iDequeueOutputBuffer);
                    byteBuffer = c3t2.A0B;
                    if (byteBuffer == null) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 29;
                        break;
                    }
                case 29:
                    c3t2 = c3t2;
                    byteBuffer = byteBuffer;
                    byteBuffer.position(c3t2.A0V.offset);
                    c3t2.A0B.limit(c3t2.A0V.offset + c3t2.A0V.size);
                    c2 = 30;
                    break;
                case 30:
                    c3t2 = c3t2;
                    c3t2.A0P = c3t2.A0o(c3t2.A0V.presentationTimeUs);
                    c2 = 31;
                    break;
                case 31:
                    c3t2 = c3t2;
                    if (!c3t2.A0F) {
                        c2 = '.';
                        break;
                    } else {
                        c2 = ' ';
                        break;
                    }
                case ' ':
                    c3t2 = c3t2;
                    if (!c3t2.A0K) {
                        c2 = '.';
                        break;
                    } else {
                        c2 = '!';
                        break;
                    }
                case '!':
                    try {
                        c3t2 = c3t2;
                        zA1P = c3t.A1P(j, j2, c3t2.A06, c3t2.A0B, c3t2.A04, c3t2.A0V.flags, c3t2.A0V.presentationTimeUs, c3t2.A0P);
                        c2 = '/';
                        break;
                    } catch (IllegalStateException unused2) {
                        c3t.A0d();
                        if (!c3t2.A0N) {
                            c2 = '-';
                            break;
                        } else {
                            c2 = ',';
                            break;
                        }
                    }
                case ',':
                    c3t = c3t;
                    c3t.A1G();
                    c2 = '-';
                    break;
                case '-':
                    return false;
                case '.':
                    c3t = c3t;
                    c3t2 = c3t2;
                    zA1P = c3t.A1P(j, j2, c3t2.A06, c3t2.A0B, c3t2.A04, c3t2.A0V.flags, c3t2.A0V.presentationTimeUs, c3t2.A0P);
                    c2 = '/';
                    break;
                case '/':
                    if (!zA1P) {
                        c2 = '6';
                        break;
                    } else {
                        c2 = '0';
                        break;
                    }
                case '0':
                    c3t2 = c3t2;
                    c3t2.A1J(c3t2.A0V.presentationTimeUs);
                    if ((c3t2.A0V.flags & 4) == 0) {
                        c2 = '4';
                        break;
                    } else {
                        c2 = '1';
                        break;
                    }
                case '1':
                    z = true;
                    c2 = '2';
                    break;
                case '2':
                    c3t = c3t;
                    c3t.A0i();
                    if (!z) {
                        c2 = '3';
                        break;
                    } else {
                        c2 = '5';
                        break;
                    }
                case '3':
                    return true;
                case '4':
                    z = false;
                    c2 = '2';
                    break;
                case '5':
                    c3t = c3t;
                    c3t.A0d();
                    c2 = '6';
                    break;
                case '6':
                    return false;
            }
        }
    }

    public static boolean A0q(C0418Da c0418Da) {
        boolean z = false;
        String str = c0418Da.A02;
        char c2 = C0560Iy.A01 <= 17 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!A0Z(287, 24, 83).equals(str)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 3:
                    str = str;
                    if (!A0Z(420, 31, 71).equals(str)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 4:
                    if (!A0Z(660, 6, 105).equals(C0560Iy.A04)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (!A0Z(519, 4, 17).equals(C0560Iy.A05)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0418Da = c0418Da;
                    if (!c0418Da.A05) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    z = true;
                    c2 = '\b';
                    break;
                case '\b':
                    return z;
                case '\t':
                    z = false;
                    c2 = '\b';
                    break;
            }
        }
    }

    public static boolean A0r(String str) {
        boolean z = false;
        char c2 = C0560Iy.A01 <= 23 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!A0Z(k.AppCompatTheme_windowFixedWidthMinor, 25, 52).equals(str)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 3:
                    if (C0560Iy.A01 > 19) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (!A0Z(101, 6, 0).equals(C0560Iy.A02)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    str = str;
                    if (!A0Z(488, 31, 57).equals(str)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    str = str;
                    if (!A0Z(146, 38, k.AppCompatTheme_windowFixedHeightMinor).equals(str)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    z = true;
                    c2 = '\b';
                    break;
                case '\b':
                    return z;
                case '\t':
                    z = false;
                    c2 = '\b';
                    break;
            }
        }
    }

    public static boolean A0s(String str) {
        boolean z = false;
        char c2 = C0560Iy.A01 == 21 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!A0Z(538, 22, 61).equals(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public static boolean A0t(String str) {
        boolean z = false;
        char c2 = C0560Iy.A01 >= 18 ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    if (C0560Iy.A01 != 18) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str = str;
                    if (!A0Z(670, 15, 104).equals(str)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 4:
                    str = str;
                    if (!A0Z(215, 22, 48).equals(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 5:
                    if (C0560Iy.A01 != 19) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (!C0560Iy.A05.startsWith(A0Z(18, 7, 28))) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    str = str;
                    if (!A0Z(362, 18, 126).equals(str)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\b':
                    str = str;
                    if (!A0Z(603, 25, 12).equals(str)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    z = true;
                    c2 = '\n';
                    break;
                case '\n':
                    return z;
                case 11:
                    z = false;
                    c2 = '\n';
                    break;
            }
        }
    }

    public static boolean A0u(String str, Format format) {
        boolean z = false;
        char c2 = C0560Iy.A01 < 21 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    format = format;
                    if (!format.A0P.isEmpty()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str = str;
                    if (!A0Z(190, 25, 65).equals(str)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    public static boolean A0v(String str, Format format) {
        boolean z = true;
        char c2 = C0560Iy.A01 <= 18 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    format = format;
                    if (format.A05 != z) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str = str;
                    if (!A0Z(451, 25, 48).equals(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    private boolean A0w(boolean z) throws C03479w {
        C3T c3t = this;
        int iA73 = 0;
        boolean z2 = false;
        char c2 = c3t.A08 != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (!z) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 3:
                    c3t = c3t;
                    if (!c3t.A0c) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    c3t = c3t;
                    iA73 = c3t.A08.A73();
                    if (iA73 == 1) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (iA73 == 4) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    z2 = true;
                    c2 = '\b';
                    break;
                case '\b':
                    return z2;
                case '\t':
                    C3T c3t2 = c3t;
                    throw C03479w.A01(c3t2.A08.A6B(), c3t2.A0y());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.EN
    public void A12() throws Throwable {
        C3T c3t = this;
        Throwable th = null;
        Throwable th2 = null;
        Throwable th3 = null;
        c3t.A07 = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c3t = c3t;
                        c3t.A1G();
                        try {
                            if (c3t.A08 != null) {
                                c3t.A0Z.ACP(c3t.A08);
                            }
                            try {
                                if (c3t.A09 != null && c3t.A09 != c3t.A08) {
                                    c3t.A0Z.ACP(c3t.A09);
                                }
                                return;
                            } finally {
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            c2 = 19;
                            break;
                        }
                    } catch (Throwable th5) {
                        th3 = th5;
                        c2 = 30;
                        break;
                    }
                case 19:
                    try {
                        c3t = c3t;
                        if (c3t.A09 != null && c3t.A09 != c3t.A08) {
                            c3t.A0Z.ACP(c3t.A09);
                        }
                        throw th2;
                    } finally {
                    }
                case 30:
                    try {
                        c3t = c3t;
                        if (c3t.A08 != null) {
                            c3t.A0Z.ACP(c3t.A08);
                        }
                        try {
                            if (c3t.A09 != null && c3t.A09 != c3t.A08) {
                                c3t.A0Z.ACP(c3t.A09);
                            }
                            throw th3;
                        } finally {
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        c2 = '.';
                        break;
                    }
                    break;
                case '.':
                    try {
                        c3t = c3t;
                        if (c3t.A09 != null && c3t.A09 != c3t.A08) {
                            c3t.A0Z.ACP(c3t.A09);
                        }
                        throw th;
                    } finally {
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.EN
    public void A13() {
    }

    @Override // com.facebook.ads.redexgen.X.EN
    public void A14() {
    }

    @Override // com.facebook.ads.redexgen.X.EN
    public void A15(long j, boolean z) throws C03479w {
        this.A0M = false;
        this.A0N = false;
        if (this.A06 != null) {
            A1F();
        }
    }

    @Override // com.facebook.ads.redexgen.X.EN
    public void A16(boolean z) throws C03479w {
        this.A0U = new BW();
    }

    public int A1A(MediaCodec mediaCodec, C0418Da c0418Da, Format format, Format format2) {
        return 0;
    }

    public final MediaCodec A1C() {
        return this.A06;
    }

    public final C0418Da A1D() {
        return this.A0A;
    }

    public C0418Da A1E(Dg dg, Format format, boolean z) throws C0424Dj {
        return dg.A60(format.A0O, z);
    }

    public void A1F() throws Throwable {
        C3T c3t = this;
        c3t.A05 = -9223372036854775807L;
        c3t.A0h();
        c3t.A0i();
        c3t.A0Q = true;
        c3t.A0R = false;
        c3t.A0P = false;
        c3t.A0b.clear();
        c3t.A0C = false;
        c3t.A0O = false;
        char c2 = !c3t.A0H ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c3t = c3t;
                    if (!c3t.A0E) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c3t = c3t;
                    if (!c3t.A0K) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c3t = c3t;
                    c3t.A1G();
                    c3t.A1I();
                    c2 = 5;
                    break;
                case 5:
                    c3t = c3t;
                    if (!c3t.A0L) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c3t = c3t;
                    if (c3t.A07 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c3t = c3t;
                    c3t.A01 = 1;
                    c2 = '\b';
                    break;
                case '\b':
                    return;
                case '\t':
                    c3t = c3t;
                    if (c3t.A02 == 0) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c3t = c3t;
                    c3t.A1G();
                    c3t.A1I();
                    c2 = 5;
                    break;
                case 11:
                    c3t = c3t;
                    c3t.A06.flush();
                    c3t.A0J = false;
                    c2 = 5;
                    break;
            }
        }
    }

    public void A1G() throws Throwable {
        C3T c3t = this;
        Throwable th = null;
        InterfaceC0396Bv<C0948Ye> interfaceC0396Bv = null;
        Throwable th2 = null;
        InterfaceC0396Bv<C0948Ye> interfaceC0396Bv2 = null;
        InterfaceC0396Bv<C0948Ye> interfaceC0396Bv3 = null;
        Throwable th3 = null;
        InterfaceC0396Bv<C0948Ye> interfaceC0396Bv4 = null;
        c3t.A05 = -9223372036854775807L;
        c3t.A0h();
        c3t.A0i();
        c3t.A0R = false;
        c3t.A0P = false;
        c3t.A0b.clear();
        c3t.A0g();
        c3t.A0A = null;
        c3t.A0L = false;
        c3t.A0J = false;
        c3t.A0D = false;
        c3t.A0H = false;
        c3t.A00 = 0;
        c3t.A0G = false;
        c3t.A0E = false;
        c3t.A0I = false;
        c3t.A0C = false;
        c3t.A0O = false;
        c3t.A0K = false;
        c3t.A01 = 0;
        c3t.A02 = 0;
        char c2 = c3t.A06 != null ? (char) 2 : '%';
        while (true) {
            switch (c2) {
                case 2:
                    c3t = c3t;
                    c3t.A0U.A01++;
                    c2 = 3;
                    break;
                case 3:
                    try {
                        c3t = c3t;
                        c3t.A06.stop();
                        try {
                            c3t.A06.release();
                            c3t.A06 = null;
                            interfaceC0396Bv2 = c3t.A08;
                            if (interfaceC0396Bv2 == null) {
                                c2 = '%';
                                break;
                            } else {
                                c2 = '\b';
                                break;
                            }
                        } catch (Throwable th4) {
                            th3 = th4;
                            c3t.A06 = null;
                            interfaceC0396Bv3 = c3t.A08;
                            if (interfaceC0396Bv3 == null) {
                                c2 = 18;
                                break;
                            } else {
                                c2 = '\r';
                                break;
                            }
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        c2 = 20;
                        break;
                    }
                case '\b':
                    c3t = c3t;
                    interfaceC0396Bv2 = interfaceC0396Bv2;
                    if (c3t.A09 == interfaceC0396Bv2) {
                        c2 = '%';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    try {
                        c3t = c3t;
                        c3t.A0Z.ACP(interfaceC0396Bv2);
                        c3t.A08 = null;
                        c2 = '%';
                        break;
                    } finally {
                    }
                case '\r':
                    c3t = c3t;
                    interfaceC0396Bv3 = interfaceC0396Bv3;
                    if (c3t.A09 == interfaceC0396Bv3) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    try {
                        c3t = c3t;
                        c3t.A0Z.ACP(interfaceC0396Bv3);
                        c3t.A08 = null;
                        c2 = 18;
                        break;
                    } finally {
                    }
                case 18:
                    throw th3;
                case 20:
                    try {
                        c3t = c3t;
                        c3t.A06.release();
                        c3t.A06 = null;
                        interfaceC0396Bv4 = c3t.A08;
                        if (interfaceC0396Bv4 == null) {
                            c2 = 28;
                            break;
                        } else {
                            c2 = 23;
                            break;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        c3t.A06 = null;
                        interfaceC0396Bv = c3t.A08;
                        if (interfaceC0396Bv == null) {
                            c2 = '#';
                            break;
                        } else {
                            c2 = 30;
                            break;
                        }
                    }
                case 23:
                    c3t = c3t;
                    interfaceC0396Bv4 = interfaceC0396Bv4;
                    if (c3t.A09 == interfaceC0396Bv4) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    try {
                        c3t = c3t;
                        c3t.A0Z.ACP(interfaceC0396Bv4);
                        c3t.A08 = null;
                        c2 = 28;
                        break;
                    } finally {
                    }
                case 28:
                    throw th2;
                case 30:
                    c3t = c3t;
                    interfaceC0396Bv = interfaceC0396Bv;
                    if (c3t.A09 == interfaceC0396Bv) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = 31;
                        break;
                    }
                case 31:
                    try {
                        c3t = c3t;
                        c3t.A0Z.ACP(interfaceC0396Bv);
                        c3t.A08 = null;
                        c2 = '#';
                        break;
                    } finally {
                    }
                case '#':
                    throw th;
                case '%':
                    return;
            }
        }
    }

    public void A1H() throws C03479w {
    }

    public final void A1I() throws C03479w {
        Format format;
        long jElapsedRealtime;
        if (this.A06 != null || (format = this.A07) == null) {
            return;
        }
        this.A08 = this.A09;
        String str = format.A0O;
        MediaCrypto mediaCryptoA00 = null;
        boolean zA01 = false;
        InterfaceC0396Bv<C0948Ye> interfaceC0396Bv = this.A08;
        if (interfaceC0396Bv != null) {
            C0948Ye mediaCrypto = (C0948Ye) interfaceC0396Bv.A6X();
            if (mediaCrypto == null) {
                if (this.A08.A6B() == null) {
                    return;
                }
            } else {
                mediaCryptoA00 = mediaCrypto.A00();
                zA01 = mediaCrypto.A01(str);
            }
            if (A0l()) {
                int iA73 = this.A08.A73();
                if (iA73 != 1) {
                    if (iA73 != 4) {
                        return;
                    }
                } else {
                    throw C03479w.A01(this.A08.A6B(), A0y());
                }
            }
        }
        if (this.A0A == null) {
            try {
                this.A0A = A1E(this.A0a, this.A07, zA01);
                if (this.A0A == null && zA01) {
                    this.A0A = A1E(this.A0a, this.A07, false);
                    if (this.A0A != null) {
                        Log.w(A0Z(0, 18, 75), A0Z(312, 40, 33) + str + A0Z(184, 6, 2) + A0Z(692, 52, 107) + this.A0A.A02 + A0Z(311, 1, 82));
                    }
                }
            } catch (C0424Dj e) {
                A0k(new C0419Dc(this.A07, e, zA01, -49998));
            }
            if (this.A0A == null) {
                A0k(new C0419Dc(this.A07, (Throwable) null, zA01, -49999));
            }
        }
        if (!A1Q(this.A0A)) {
            return;
        }
        String str2 = this.A0A.A02;
        this.A00 = A0W(str2);
        this.A0D = A0u(str2, this.A07);
        this.A0H = A0t(str2);
        this.A0G = A0q(this.A0A);
        this.A0E = A0r(str2);
        this.A0F = A0s(str2);
        this.A0I = A0v(str2, this.A07);
        try {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            C0557Iv.A02(A0Z(628, 12, 38) + str2);
            this.A06 = MediaCodec.createByCodecName(str2);
            C0557Iv.A00();
            C0557Iv.A02(A0Z(107, 14, 57));
            A1N(this.A0A, this.A06, this.A07, mediaCryptoA00);
            C0557Iv.A00();
            C0557Iv.A02(A0Z(352, 10, 3));
            this.A06.start();
            C0557Iv.A00();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            A1O(str2, jElapsedRealtime3, jElapsedRealtime3 - jElapsedRealtime2);
            A0c();
        } catch (Exception e2) {
            A0k(new C0419Dc(this.A07, e2, zA01, str2));
        }
        if (A73() == 2) {
            jElapsedRealtime = SystemClock.elapsedRealtime() + 1000;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.A05 = jElapsedRealtime;
        A0h();
        A0i();
        this.A0Q = true;
        this.A0U.A00++;
    }

    public void A1J(long j) {
    }

    public void A1K(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C03479w {
    }

    public void A1L(Format format) throws C03479w {
        C3T c3t = this;
        boolean z = false;
        int i = 0;
        int iA1A = 0;
        boolean z2 = false;
        boolean z3 = false;
        InterfaceC0397Bw<C0948Ye> interfaceC0397Bw = null;
        MediaCodec mediaCodec = null;
        DrmInitData drmInitData = null;
        InterfaceC0396Bv<C0948Ye> interfaceC0396Bv = null;
        Format format2 = c3t.A07;
        c3t.A07 = format;
        DrmInitData drmInitData2 = c3t.A07.A0H;
        InterfaceC0396Bv<C0948Ye> interfaceC0396Bv2 = null;
        char c2 = format2 == null ? (char) 2 : (char) 27;
        while (true) {
            switch (c2) {
                case 2:
                    interfaceC0396Bv2 = null;
                    drmInitData = null;
                    c2 = 3;
                    break;
                case 3:
                    drmInitData2 = drmInitData2;
                    z2 = true;
                    z2 = true;
                    if (!(!C0560Iy.A0j(drmInitData2, drmInitData))) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c3t = c3t;
                    if (c3t.A07.A0H == null) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c3t = c3t;
                    interfaceC0397Bw = c3t.A0Z;
                    if (interfaceC0397Bw == null) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c3t = c3t;
                    interfaceC0397Bw = interfaceC0397Bw;
                    c3t.A09 = interfaceC0397Bw.A2P(Looper.myLooper(), c3t.A07.A0H);
                    interfaceC0396Bv = c3t.A09;
                    if (interfaceC0396Bv != c3t.A08) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c3t = c3t;
                    interfaceC0396Bv = interfaceC0396Bv;
                    c3t.A0Z.ACP(interfaceC0396Bv);
                    c2 = '\b';
                    break;
                case '\b':
                    c3t = c3t;
                    z = false;
                    if (c3t.A09 != c3t.A08) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c3t = c3t;
                    mediaCodec = c3t.A06;
                    if (mediaCodec == null) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c3t = c3t;
                    format2 = format2;
                    mediaCodec = mediaCodec;
                    iA1A = c3t.A1A(mediaCodec, c3t.A0A, format2, c3t.A07);
                    if (iA1A == 0) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    if (iA1A == z2) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    if (iA1A != 3) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c3t = c3t;
                    z = true;
                    c3t.A0L = z2;
                    c3t.A01 = z2 ? 1 : 0;
                    i = c3t.A00;
                    if (i == 2) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    if (i != z2) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c3t = c3t;
                    format2 = format2;
                    if (c3t.A07.A0F != format2.A0F) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c3t = c3t;
                    format2 = format2;
                    if (c3t.A07.A08 != format2.A08) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    z3 = true;
                    c2 = 18;
                    break;
                case 18:
                    c3t = c3t;
                    c3t.A0C = z3;
                    c2 = 19;
                    break;
                case 19:
                    if (!z) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 20:
                    c3t = c3t;
                    if (!c3t.A0J) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    c3t = c3t;
                    c3t.A02 = z2 ? 1 : 0;
                    c2 = 22;
                    break;
                case 22:
                    return;
                case 23:
                    c3t = c3t;
                    c3t.A1G();
                    c3t.A1I();
                    c2 = 22;
                    break;
                case 24:
                    z3 = false;
                    c2 = 18;
                    break;
                case 25:
                    z = true;
                    c2 = 19;
                    break;
                case 26:
                    c3t = c3t;
                    c3t.A09 = interfaceC0396Bv2;
                    c2 = '\b';
                    break;
                case 27:
                    format2 = format2;
                    drmInitData = format2.A0H;
                    c2 = 3;
                    break;
                case 28:
                    throw new IllegalStateException();
                case 29:
                    throw C03479w.A01(new IllegalStateException(A0Z(386, 34, 82)), c3t.A0y());
            }
        }
    }

    public void A1M(YT yt) {
    }

    public void A1O(String str, long j, long j2) {
    }

    public boolean A1Q(C0418Da c0418Da) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public boolean A7c() {
        return this.A0N;
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public boolean A7k() {
        C3T c3t = this;
        boolean z = false;
        char c2 = c3t.A07 != null ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    c3t = c3t;
                    if (!c3t.A0R) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 3:
                    c3t = c3t;
                    if (!c3t.A18()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 4:
                    c3t = c3t;
                    if (!c3t.A0n()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 5:
                    c3t = c3t;
                    if (c3t.A05 == -9223372036854775807L) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c3t = c3t;
                    if (SystemClock.elapsedRealtime() >= c3t.A05) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    z = true;
                    c2 = '\b';
                    break;
                case '\b':
                    return z;
                case '\t':
                    z = false;
                    c2 = '\b';
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.YC
    public final void ACW(long j, long j2) throws Throwable {
        C3T c3t = this;
        int iA10 = 0;
        int iA102 = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        char c2 = c3t.A0N ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    c3t.A1H();
                    return;
                case 3:
                    c3t = c3t;
                    i2 = -4;
                    i = -5;
                    z = true;
                    if (c3t.A07 != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c3t = c3t;
                    c3t.A0Y.A07();
                    iA10 = c3t.A10(c3t.A0W, c3t.A0Y, z);
                    if (iA10 != i) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c3t = c3t;
                    c3t.A1L(c3t.A0W.A00);
                    c2 = 6;
                    break;
                case 6:
                    c3t = c3t;
                    c3t.A1I();
                    if (c3t.A06 == null) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    C0557Iv.A02(A0Z(249, 12, 78));
                    c2 = '\b';
                    break;
                case '\b':
                    c3t = c3t;
                    if (!c3t.A0p(j, j2)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\t':
                    c3t = c3t;
                    if (!c3t.A0m()) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\n':
                    c3t = c3t;
                    c3t.A0U.A07 += c3t.A0z(j);
                    c3t.A0Y.A07();
                    iA102 = c3t.A10(c3t.A0W, c3t.A0Y, false);
                    if (iA102 != i) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c3t = c3t;
                    c3t.A1L(c3t.A0W.A00);
                    c2 = 15;
                    break;
                case '\f':
                    if (iA102 != i2) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c3t = c3t;
                    IJ.A04(c3t.A0Y.A04());
                    c3t.A0M = z;
                    c3t.A0d();
                    c2 = 15;
                    break;
                case 14:
                    C0557Iv.A00();
                    c2 = 15;
                    break;
                case 15:
                    c3t.A0U.A00();
                    return;
                case 16:
                    if (iA10 != i2) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    C3T c3t2 = c3t;
                    IJ.A04(c3t2.A0Y.A04());
                    c3t2.A0M = z;
                    c3t2.A0d();
                    return;
                case 18:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AU
    public final int ADX(Format format) throws C03479w {
        try {
            return A1B(this.A0a, this.A0Z, format);
        } catch (C0424Dj e) {
            throw C03479w.A01(e, A0y());
        }
    }

    @Override // com.facebook.ads.redexgen.X.EN, com.facebook.ads.redexgen.X.AU
    public final int ADZ() {
        return 8;
    }
}
