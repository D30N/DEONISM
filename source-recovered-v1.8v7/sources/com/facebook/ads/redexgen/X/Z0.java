package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import d.b.a.b.k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class Z0 implements CC {
    public static byte[] A0p;
    public static final CF A0q;
    public static final UUID A0r;
    public static final byte[] A0s;
    public static final byte[] A0t;
    public static final byte[] A0u;
    public static final byte[] A0v;
    public static final byte[] A0w;
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public CE A0N;
    public CY A0O;
    public IY A0P;
    public IY A0Q;
    public ByteBuffer A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public int[] A0b;
    public final SparseArray<CY> A0c;
    public final CU A0d;
    public final C0401Cb A0e;
    public final C0544Ii A0f;
    public final C0544Ii A0g;
    public final C0544Ii A0h;
    public final C0544Ii A0i;
    public final C0544Ii A0j;
    public final C0544Ii A0k;
    public final C0544Ii A0l;
    public final C0544Ii A0m;
    public final C0544Ii A0n;
    public final boolean A0o;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0p, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 103);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A06() {
        A0p = new byte[]{20, 53, -26, 60, 39, 50, 47, 42, -26, 60, 39, 56, 47, 52, 58, -26, 50, 43, 52, 45, 58, 46, -26, 51, 39, 57, 49, -26, 44, 53, 59, 52, 42, -30, 14, 13, 19, 4, 13, 19, -28, 13, 2, -32, 11, 6, 14, -65, -70, -40, -67, -51, -52, 44, 53, 35, 38, 27, 29, 10, 5, 31, 41, 37, 5, 23, 41, 38, -35, -5, -35, -33, -49, -63, -22, -33, -18, -11, -20, -16, -31, -32, -100, -48, -18, -35, -33, -25, -100, -30, -21, -15, -22, -32, -100, -34, -15, -16, -100, -65, -21, -22, -16, -31, -22, -16, -63, -22, -33, -57, -31, -11, -59, -64, -100, -13, -35, -17, -100, -22, -21, -16, -100, -30, -21, -15, -22, -32, -51, -7, -8, -2, -17, -8, -2, -49, -8, -19, -7, -18, -13, -8, -15, -39, -4, -18, -17, -4, -86, 27, 57, 30, 46, 45, 9, 31, 50, 42, 44, 31, 45, 45, -60, -9, -13, -28, -19, -14, -24, -18, -19, -97, -31, -24, -13, -97, -24, -14, -97, -14, -28, -13, -97, -24, -19, -97, -14, -24, -26, -19, -32, -21, -97, -31, -8, -13, -28, -53, -41, -68, -50, -70, -53, -51, -70, -30, 11, 14, 9, -3, 16, -42, -68, -17, 16, -3, 14, 16, -56, -68, -31, 10, 0, -56, -68, -18, 1, -3, 0, -21, 14, 0, 1, 14, -56, -68, -24, -3, 21, 1, 14, -56, -68, -17, 16, 21, 8, 1, -56, -68, -22, -3, 9, 1, -56, -68, -23, -3, 14, 3, 5, 10, -24, -56, -68, -23, -3, 14, 3, 5, 10, -18, -56, -68, -23, -3, 14, 3, 5, 10, -14, -56, -68, -31, 2, 2, 1, -1, 16, -56, -68, -16, 1, 20, 16, -114, -103, -101, -51, -93, -114, -103, -101, -51, -93, -114, -103, -101, -51, -107, -114, -103, -100, -51, -21, 23, 22, 28, 13, 22, 28, -19, 22, 11, 23, 12, 17, 22, 15, -5, 11, 23, 24, 13, -56, -9, 0, -18, -15, -26, -24, -43, -48, -22, -12, -16, -48, -30, -9, -28, -75, -45, -32, -103, -26, -110, -27, -43, -45, -34, -41, -110, -26, -37, -33, -41, -43, -31, -42, -41, -110, -30, -28, -37, -31, -28, -110, -26, -31, -110, -26, -37, -33, -41, -43, -31, -42, -41, -59, -43, -45, -34, -41, -110, -44, -41, -37, -32, -39, -110, -27, -41, -26, -96, -53, -42, -41, 10, -32, -53, -42, -40, 10, -32, -53, -42, -40, 10, -32, -53, -42, -40, 10, 90, 72, 69, 80, -4, 26, 11, -2, 8, -22, 4, 9, 15, -22, 7, 4, 15, 6, 15, -3, 0, -11, -9, -8, -33, -7, 3, -1, -33, -8, -11, 6, -13, 25, 55, 37, 40, 29, 31, 7, 36, 11, 29, 59, 29, 29, 31, 22, 52, 36, 37, 42, 40, -18, 7, -2, 17, 9, -2, -4, 13, -2, -3, -71, 5, -6, -4, 2, 7, 0, -71, 15, -6, 5, 14, -2, -45, -71, -31, -19, -28, -35, -48, -31, -29, -48, -65, -68, -57, -58, -102, -26, -37, -35, -29, -24, -31, -102, -19, -37, -25, -22, -26, -33, -102, -19, -29, -12, -33, -102, -23, -17, -18, -102, -23, -32, -102, -20, -37, -24, -31, -33, -88, -45, -33, -56, -60, -51, -42, -81, -48, -57, -45, 14, 34, 47, 37, 34, 53, 48, 51, 58, -31, 38, 45, 38, 46, 38, 47, 53, -31, 20, 38, 38, 44, 10, 5, -31, 48, 51, -31, 20, 38, 38, 44, 17, 48, 52, 42, 53, 42, 48, 47, -31, 47, 48, 53, -31, 39, 48, 54, 47, 37, 28, 61, -18, 68, 47, 58, 55, 50, -18, 66, 64, 47, 49, 57, 65, -18, 69, 51, 64, 51, -18, 52, 61, 67, 60, 50, -27, 3, -23, -27, -25, -41, -63, -51, -62, -77, -58, -62, -99, -61, -62, -76, -90, 37, 49, 38, 23, 42, 38, 1, 19, 37, 37, 10, 40, 22, 25, 14, 16, -8, 21, -5, 19, 7, 26, 24, 21, 25, 17, 7, 42, 39, 50, 49, 55, 74, 70, 73, 59, 74, 87, 88, 78, 84, 83, 5, -47, -17, -26, -33, -30, -46, -39, -29, -39, 5, 4, 10, -5, 4, 10, -39, 5, 3, 6, -41, 2, -3, 5, -74, -33, -29, -15, -15, 3, 18, 18, 7, 12, 5, 17, -31, 7, 14, 6, 3, 16, -21, 13, 2, 3, -66, -34, -25, -43, -40, -51, -49, -68, -73, -47, -37, -41, -73, -55, -40, -36, -27, -36, -42, -66, -50, -41, -52, -64, -67, -57, -54, -71, -57, -48, -57, -63, -86, -23, 55, 56, 61, -23, 60, 62, 57, 57, 56, 59, 61, 46, 45, -50, -20, -38, -32, -68, -50, -48, -38, 18, 27, 9, 12, 1, 3, -16, -21, 5, 15, 11, -21, 15, 12, 19, 59, 50, 58, 47, 54, 50, 43, -26, 25, 43, 45, 51, 43, 52, 58, -26, 43, 50, 43, 51, 43, 52, 58, 57, -26, 52, 53, 58, -26, 57, 59, 54, 54, 53, 56, 58, 43, 42, -84, -54, -65, -67, -64, -80, -77, -81, -45, -2, -14, -29, 8, -1, -12, -81, -45, -1, -3, -14, -7, -2, -7, -2, -9, -80, -11, -2, -13, 2, 9, 0, 4, -7, -1, -2, -80, -15, -2, -12, -80, -13, -1, -3, 0, 2, -11, 3, 3, -7, -1, -2, -80, -7, 3, -80, -2, -1, 4, -80, 3, 5, 0, 0, -1, 2, 4, -11, -12, -47, -26, -24, -18, -13, -20, -91, -12, -13, -15, -2, -91, -8, -6, -11, -11, -12, -9, -7, -22, -23, -91, -18, -13, -91, -40, -18, -14, -11, -15, -22, -57, -15, -12, -24, -16, -8, -77, -49, -19, -46, -30, -31, -67, -38, -35, -31, -31, -38, -45, -31, -31, -54, -24, -49, -43, -54, -52, -33, -24, -42, -39, -50, -48, -69, -52, -43, -61, -55, -91, -52, -68, -51, -91, -68, -59, -53, -56, -71, -71, -13, 30, 18, 3, 40, 31, 
        20, 1, 20, 16, 19, 5, 20, 33, 34, 24, 30, 29, -49, -66, -41, -50, -31, -39, -50, -52, -35, -50, -51, -119, -46, -51, -93, -119, 19, 6, 1, 2, 12, -52, 20, 2, -1, 10};
    }

    static {
        A06();
        A0q = new C0968Yy();
        A0v = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        A0w = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0s = C0560Iy.A0l(A03(205, 90, 53));
        A0t = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        A0u = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0r = new UUID(72057594037932032L, -9223371306706625679L);
    }

    public Z0() {
        this(0);
    }

    public Z0(int i) {
        this(new C0967Yx(), i);
    }

    public Z0(CU cu, int i) {
        this.A0K = -1L;
        this.A0M = -9223372036854775807L;
        this.A0G = -9223372036854775807L;
        this.A0H = -9223372036854775807L;
        this.A0F = -1L;
        this.A0J = -1L;
        this.A0E = -9223372036854775807L;
        this.A0d = cu;
        this.A0d.A7U(new C0969Yz(this, null));
        this.A0o = (i & 1) == 0;
        this.A0e = new C0401Cb();
        this.A0c = new SparseArray<>();
        this.A0k = new C0544Ii(4);
        this.A0n = new C0544Ii(ByteBuffer.allocate(4).putInt(-1).array());
        this.A0l = new C0544Ii(4);
        this.A0i = new C0544Ii(C0540Ie.A02);
        this.A0h = new C0544Ii(4);
        this.A0j = new C0544Ii();
        this.A0m = new C0544Ii();
        this.A0f = new C0544Ii(8);
        this.A0g = new C0544Ii();
    }

    private int A00(CD cd, CO co, int i) throws InterruptedException, IOException {
        Z0 z0 = this;
        int iACj = 0;
        int iA04 = z0.A0j.A04();
        char c2 = iA04 > 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z0 = z0;
                    co = co;
                    iACj = Math.min(i, iA04);
                    co.ACk(z0.A0j, iACj);
                    c2 = 3;
                    break;
                case 3:
                    Z0 z02 = z0;
                    z02.A07 += iACj;
                    z02.A08 += iACj;
                    return iACj;
                case 4:
                    cd = cd;
                    co = co;
                    iACj = co.ACj(cd, i, false);
                    c2 = 3;
                    break;
            }
        }
    }

    private long A01(long j) throws AF {
        long j2 = this.A0M;
        if (j2 != -9223372036854775807L) {
            return C0560Iy.A0G(j, j2, 1000L);
        }
        throw new AF(A03(350, 54, 11));
    }

    private CL A02() {
        Z0 z0 = this;
        long[] jArr = null;
        long[] durationsUs = null;
        int i = 0;
        long[] jArr2 = null;
        long[] jArr3 = null;
        IY iy = null;
        IY iy2 = null;
        int iA02 = 0;
        int i2 = 0;
        char c2 = z0.A0K != -1 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    z0 = z0;
                    if (z0.A0H == -9223372036854775807L) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z0 = z0;
                    iy = z0.A0Q;
                    if (iy == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    iy = iy;
                    if (iy.A02() == 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z0 = z0;
                    iy2 = z0.A0P;
                    if (iy2 == null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    z0 = z0;
                    iy2 = iy2;
                    if (iy2.A02() == z0.A0Q.A02()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    Z0 z02 = z0;
                    z02.A0Q = null;
                    z02.A0P = null;
                    return new C0958Yo(z02.A0H);
                case '\b':
                    z0 = z0;
                    iA02 = z0.A0Q.A02();
                    durationsUs = new int[iA02];
                    jArr3 = new long[iA02];
                    jArr = new long[iA02];
                    jArr2 = new long[iA02];
                    i2 = 0;
                    c2 = '\t';
                    break;
                case '\t':
                    if (i2 >= iA02) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    z0 = z0;
                    jArr3 = jArr3;
                    jArr2 = jArr2;
                    jArr2[i2] = z0.A0Q.A03(i2);
                    jArr3[i2] = z0.A0K + z0.A0P.A03(i2);
                    i2++;
                    c2 = '\t';
                    break;
                case 11:
                    i = 0;
                    c2 = '\f';
                    break;
                case '\f':
                    if (i >= iA02 - 1) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    durationsUs = (int[]) durationsUs;
                    jArr3 = jArr3;
                    jArr = jArr;
                    jArr2 = jArr2;
                    durationsUs[i] = (int) (jArr3[i + 1] - jArr3[i]);
                    jArr[i] = jArr2[i + 1] - jArr2[i];
                    i++;
                    c2 = '\f';
                    break;
                case 14:
                    Z0 z03 = z0;
                    int[] iArr = (int[]) durationsUs;
                    long[] jArr4 = jArr3;
                    long[] jArr5 = jArr;
                    long[] jArr6 = jArr2;
                    iArr[iA02 - 1] = (int) ((z03.A0K + z03.A0L) - jArr4[iA02 - 1]);
                    jArr5[iA02 - 1] = z03.A0H - jArr6[iA02 - 1];
                    z03.A0Q = null;
                    z03.A0P = null;
                    return new C0953Yj(iArr, jArr4, jArr5, jArr6);
            }
        }
    }

    private void A05() {
        this.A07 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A0S = false;
        this.A0X = false;
        this.A0U = false;
        this.A0A = 0;
        this.A00 = (byte) 0;
        this.A0T = false;
        this.A0j.A0V();
    }

    private void A07(CD cd, int i) throws InterruptedException, IOException {
        Z0 z0 = this;
        char c2 = z0.A0k.A07() >= i ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    z0 = z0;
                    if (z0.A0k.A05() >= i) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z0 = z0;
                    C0544Ii c0544Ii = z0.A0k;
                    c0544Ii.A0b(Arrays.copyOf(c0544Ii.A00, Math.max(z0.A0k.A00.length * 2, i)), z0.A0k.A07());
                    c2 = 5;
                    break;
                case 5:
                    Z0 z02 = z0;
                    cd.readFully(z02.A0k.A00, z02.A0k.A07(), i - z02.A0k.A07());
                    z02.A0k.A0X(i);
                    return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A08(CD cd, CY cy, int i) throws InterruptedException, IOException {
        CY cy2 = cy;
        CD cd2 = cd;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        byte[] bArr = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        ByteBuffer byteBuffer = null;
        boolean z = false;
        int i9 = 0;
        boolean z2 = false;
        short s2 = 0;
        int iA07 = 0;
        int i10 = 0;
        int i11 = 0;
        int iA0H = 0;
        byte[] bArr2 = null;
        CO co = null;
        short s3 = 0;
        short s4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        Z0 z0 = this;
        int i12 = A03(638, 11, 7).equals(cy2.A0Y) ? 2 : 3;
        while (true) {
            switch (i12) {
                case 2:
                    z0.A09(cd2, A0v, i);
                    return;
                case 3:
                    cy2 = cy2;
                    if (!A03(649, 10, 107).equals(cy2.A0Y)) {
                        i12 = 5;
                        break;
                    } else {
                        i12 = 4;
                        break;
                    }
                case 4:
                    z0.A09(cd2, A0t, i);
                    return;
                case 5:
                    z0 = z0;
                    cy2 = cy2;
                    co = cy2.A0W;
                    s = 2;
                    z2 = true;
                    z2 = true;
                    i11 = 0;
                    if (!z0.A0S) {
                        i12 = 6;
                        break;
                    } else {
                        i12 = 40;
                        break;
                    }
                case 6:
                    cy2 = cy2;
                    if (!cy2.A0c) {
                        i12 = 34;
                        break;
                    } else {
                        i12 = 7;
                        break;
                    }
                case 7:
                    z0 = z0;
                    z0.A01 &= -1073741825;
                    s4 = 128;
                    if (!z0.A0X) {
                        i12 = 8;
                        break;
                    } else {
                        i12 = 10;
                        break;
                    }
                case 8:
                    z0 = z0;
                    cd2 = cd2;
                    i11 = 0;
                    cd2.readFully(z0.A0k.A00, 0, z2 ? 1 : 0);
                    z0.A07 += z2 ? 1 : 0;
                    if ((z0.A0k.A00[0] & s4) == s4) {
                        i12 = 33;
                        break;
                    } else {
                        i12 = 9;
                        break;
                    }
                case 9:
                    z0 = z0;
                    z0.A00 = z0.A0k.A00[i11];
                    z0.A0X = z2;
                    i12 = 10;
                    break;
                case 10:
                    z0 = z0;
                    if ((z0.A00 & (z2 ? 1 : 0)) != z2) {
                        i12 = 32;
                        break;
                    } else {
                        i12 = 11;
                        break;
                    }
                case 11:
                    z4 = true;
                    i12 = 12;
                    break;
                case 12:
                    if (!z4) {
                        i12 = 39;
                        break;
                    } else {
                        i12 = 13;
                        break;
                    }
                case 13:
                    z0 = z0;
                    if ((z0.A00 & s) != s) {
                        i12 = 31;
                        break;
                    } else {
                        i12 = 14;
                        break;
                    }
                case 14:
                    z3 = true;
                    i12 = 15;
                    break;
                case 15:
                    z0 = z0;
                    z0.A01 |= 1073741824;
                    if (!z0.A0T) {
                        i12 = 16;
                        break;
                    } else {
                        i12 = 18;
                        break;
                    }
                case 16:
                    z0 = z0;
                    cd2 = cd2;
                    s3 = 8;
                    cd2.readFully(z0.A0f.A00, i11, 8);
                    z0.A07 += 8;
                    z0.A0T = z2;
                    bArr2 = z0.A0k.A00;
                    if (!z3) {
                        i12 = 30;
                        break;
                    } else {
                        i12 = 17;
                        break;
                    }
                case 17:
                    z0 = z0;
                    co = co;
                    bArr2 = bArr2;
                    bArr2[i11] = (byte) (s4 | s3);
                    z0.A0k.A0Y(i11);
                    co.ACk(z0.A0k, z2 ? 1 : 0);
                    z0.A08 += z2 ? 1 : 0;
                    z0.A0f.A0Y(i11);
                    co.ACk(z0.A0f, s3);
                    z0.A08 += s3;
                    i12 = 18;
                    break;
                case 18:
                    if (!z3) {
                        i12 = 39;
                        break;
                    } else {
                        i12 = 19;
                        break;
                    }
                case 19:
                    z0 = z0;
                    if (!z0.A0U) {
                        i12 = 20;
                        break;
                    } else {
                        i12 = 21;
                        break;
                    }
                case 20:
                    z0 = z0;
                    cd2 = cd2;
                    cd2.readFully(z0.A0k.A00, i11, z2 ? 1 : 0);
                    z0.A07 += z2 ? 1 : 0;
                    z0.A0k.A0Y(i11);
                    z0.A0A = z0.A0k.A0E();
                    z0.A0U = z2;
                    i12 = 21;
                    break;
                case 21:
                    z0 = z0;
                    cd2 = cd2;
                    int i13 = z0.A0A * 4;
                    z0.A0k.A0W(i13);
                    cd2.readFully(z0.A0k.A00, i11, i13);
                    z0.A07 += i13;
                    s2 = (short) ((z0.A0A / s) + (z2 ? 1 : 0));
                    i7 = (s2 * 6) + s;
                    byteBuffer = z0.A0R;
                    if (byteBuffer == null) {
                        i12 = 23;
                        break;
                    } else {
                        i12 = 22;
                        break;
                    }
                case 22:
                    byteBuffer = byteBuffer;
                    if (byteBuffer.capacity() >= i7) {
                        i12 = 24;
                        break;
                    } else {
                        i12 = 23;
                        break;
                    }
                case 23:
                    z0 = z0;
                    z0.A0R = ByteBuffer.allocate(i7);
                    i12 = 24;
                    break;
                case 24:
                    z0 = z0;
                    z0.A0R.position(i11);
                    z0.A0R.putShort(s2);
                    iA0H = 0;
                    i8 = 0;
                    i12 = 25;
                    break;
                case 25:
                    z0 = z0;
                    i9 = z0.A0A;
                    if (i8 >= i9) {
                        i12 = 36;
                        break;
                    } else {
                        i12 = 26;
                        break;
                    }
                case 26:
                    z0 = z0;
                    i10 = iA0H;
                    iA0H = z0.A0k.A0H();
                    if (i8 % 2 != 0) {
                        i12 = 29;
                        break;
                    } else {
                        i12 = 27;
                        break;
                    }
                case 27:
                    z0 = z0;
                    z0.A0R.putShort((short) (iA0H - i10));
                    i12 = 28;
                    break;
                case 28:
                    i8++;
                    i12 = 25;
                    break;
                case 29:
                    z0 = z0;
                    z0.A0R.putInt(iA0H - i10);
                    i12 = 28;
                    break;
                case 30:
                    s4 = 0;
                    i12 = 17;
                    break;
                case 31:
                    z3 = false;
                    i12 = 15;
                    break;
                case 32:
                    z4 = false;
                    i12 = 12;
                    break;
                case 33:
                    throw new AF(A03(162, 35, 24));
                case 34:
                    cy2 = cy2;
                    if (cy2.A0f == null) {
                        i12 = 39;
                        break;
                    } else {
                        i12 = 35;
                        break;
                    }
                case 35:
                    z0 = z0;
                    cy2 = cy2;
                    z0.A0j.A0b(cy2.A0f, cy2.A0f.length);
                    i12 = 39;
                    break;
                case 36:
                    z0 = z0;
                    i5 = (i - z0.A07) - iA0H;
                    if (i9 % s != 1) {
                        i12 = 47;
                        break;
                    } else {
                        i12 = 37;
                        break;
                    }
                case 37:
                    z0 = z0;
                    z0.A0R.putInt(i5);
                    i12 = 38;
                    break;
                case 38:
                    z0 = z0;
                    co = co;
                    z0.A0g.A0b(z0.A0R.array(), i7);
                    co.ACk(z0.A0g, i7);
                    z0.A08 += i7;
                    i12 = 39;
                    break;
                case 39:
                    z0 = z0;
                    z0.A0S = true;
                    i12 = 40;
                    break;
                case 40:
                    z0 = z0;
                    cy2 = cy2;
                    iA07 = i + z0.A0j.A07();
                    if (!A03(335, 15, 58).equals(cy2.A0Y)) {
                        i12 = 41;
                        break;
                    } else {
                        i12 = 42;
                        break;
                    }
                case 41:
                    cy2 = cy2;
                    if (!A03(440, 16, 73).equals(cy2.A0Y)) {
                        i12 = 48;
                        break;
                    } else {
                        i12 = 42;
                        break;
                    }
                case 42:
                    z0 = z0;
                    cy2 = cy2;
                    bArr = z0.A0h.A00;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[s] = 0;
                    i6 = cy2.A0M;
                    i4 = 4 - cy2.A0M;
                    i12 = 43;
                    break;
                case 43:
                    z0 = z0;
                    if (z0.A07 >= iA07) {
                        i12 = 55;
                        break;
                    } else {
                        i12 = 44;
                        break;
                    }
                case 44:
                    z0 = z0;
                    i3 = z0.A09;
                    if (i3 != 0) {
                        i12 = 46;
                        break;
                    } else {
                        i12 = 45;
                        break;
                    }
                case 45:
                    z0 = z0;
                    cd2 = cd2;
                    co = co;
                    bArr = bArr;
                    z0.A0A(cd2, bArr, i4, i6);
                    z0.A0h.A0Y(0);
                    z0.A09 = z0.A0h.A0H();
                    z0.A0i.A0Y(0);
                    co.ACk(z0.A0i, 4);
                    z0.A08 += 4;
                    i12 = 43;
                    break;
                case 46:
                    z0 = z0;
                    cd2 = cd2;
                    co = co;
                    z0.A09 = i3 - z0.A00(cd2, co, i3);
                    i12 = 43;
                    break;
                case 47:
                    z0 = z0;
                    z0.A0R.putShort((short) i5);
                    z0.A0R.putInt(0);
                    i12 = 38;
                    break;
                case 48:
                    cy2 = cy2;
                    if (cy2.A0X == null) {
                        i12 = 52;
                        break;
                    } else {
                        i12 = 49;
                        break;
                    }
                case 49:
                    z0 = z0;
                    if (z0.A0j.A07() != 0) {
                        i12 = 54;
                        break;
                    } else {
                        i12 = 50;
                        break;
                    }
                case 50:
                    z = true;
                    i12 = 51;
                    break;
                case 51:
                    z0 = z0;
                    cd2 = cd2;
                    cy2 = cy2;
                    IJ.A04(z);
                    cy2.A0X.A01(cd2, z0.A01, iA07);
                    i12 = 52;
                    break;
                case 52:
                    z0 = z0;
                    i2 = z0.A07;
                    if (i2 >= iA07) {
                        i12 = 55;
                        break;
                    } else {
                        i12 = 53;
                        break;
                    }
                case 53:
                    z0 = z0;
                    cd2 = cd2;
                    co = co;
                    z0.A00(cd2, co, iA07 - i2);
                    i12 = 52;
                    break;
                case 54:
                    z = false;
                    i12 = 51;
                    break;
                case 55:
                    cy2 = cy2;
                    if (!A03(692, 8, 41).equals(cy2.A0Y)) {
                        i12 = 57;
                        break;
                    } else {
                        i12 = 56;
                        break;
                    }
                case 56:
                    z0 = z0;
                    co = co;
                    z0.A0n.A0Y(0);
                    co.ACk(z0.A0n, 4);
                    z0.A08 += 4;
                    i12 = 57;
                    break;
                case 57:
                    return;
            }
        }
    }

    private void A09(CD cd, byte[] bArr, int i) throws InterruptedException, IOException {
        Z0 z0 = this;
        int length = bArr.length + i;
        char c2 = z0.A0m.A05() < length ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z0 = z0;
                    bArr = bArr;
                    z0.A0m.A00 = Arrays.copyOf(bArr, length + i);
                    c2 = 3;
                    break;
                case 3:
                    Z0 z02 = z0;
                    cd.readFully(z02.A0m.A00, bArr.length, i);
                    z02.A0m.A0W(length);
                    return;
                case 4:
                    z0 = z0;
                    bArr = bArr;
                    System.arraycopy(bArr, 0, z0.A0m.A00, 0, bArr.length);
                    c2 = 3;
                    break;
            }
        }
    }

    private void A0A(CD cd, byte[] bArr, int i, int i2) throws InterruptedException, IOException {
        int iMin = Math.min(i2, this.A0j.A04());
        cd.readFully(bArr, i + iMin, i2 - iMin);
        if (iMin > 0) {
            this.A0j.A0c(bArr, i, iMin);
        }
        this.A07 += i2;
    }

    private void A0B(CY cy, long j) {
        CY cy2 = cy;
        Z0 z0 = this;
        Z0 z02 = z0;
        CY cy3 = cy2;
        char c2 = cy3.A0X != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    cy3 = cy3;
                    cy3.A0X.A03(cy3, j);
                    c2 = 3;
                    break;
                case 3:
                    z02.A0V = true;
                    z0.A05();
                    return;
                case 4:
                    cy3 = cy3;
                    if (!A03(638, 11, 7).equals(cy3.A0Y)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z0 = z0;
                    cy2 = cy2;
                    z0.A0C(cy2, A03(295, 19, 2), 19, 1000L, A0w);
                    c2 = 6;
                    break;
                case 6:
                    z02 = z02;
                    cy3 = cy3;
                    cy3.A0W.ACl(j, z02.A01, z02.A08, 0, cy3.A0V);
                    c2 = 3;
                    break;
                case 7:
                    cy3 = cy3;
                    if (!A03(649, 10, 107).equals(cy3.A0Y)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    z0 = z0;
                    cy2 = cy2;
                    z0.A0C(cy2, A03(404, 19, 63), 21, 10000L, A0u);
                    c2 = 6;
                    break;
            }
        }
    }

    private void A0C(CY cy, String str, int i, long j, byte[] bArr) {
        A0D(this.A0m.A00, this.A0C, str, i, j, bArr);
        CO co = cy.A0W;
        C0544Ii c0544Ii = this.A0m;
        co.ACk(c0544Ii, c0544Ii.A07());
        this.A08 += this.A0m.A07();
    }

    public static void A0D(byte[] bArr, long j, String str, int i, long j2, byte[] bArr2) {
        byte[] bArr3 = bArr2;
        byte[] bArrA0l = null;
        int i2 = 0;
        int seconds = j == -9223372036854775807L ? 2 : 4;
        while (true) {
            switch (seconds) {
                case 2:
                    bArr3 = bArr3;
                    bArrA0l = bArr3;
                    seconds = 3;
                    break;
                case 3:
                    System.arraycopy(bArrA0l, i2, bArr, i, bArr3.length);
                    return;
                case 4:
                    str = str;
                    i2 = 0;
                    long j3 = j - ((r8 * 3600) * 1000000);
                    int i3 = (int) (j3 / 60000000);
                    int hours = i3 * 60;
                    long j4 = j3 - (hours * 1000000);
                    int lastValue = (int) (j4 / 1000000);
                    int hours2 = (int) ((j4 - (lastValue * 1000000)) / j2);
                    bArrA0l = C0560Iy.A0l(String.format(Locale.US, str, Integer.valueOf((int) (j / 3600000000L)), Integer.valueOf(i3), Integer.valueOf(lastValue), Integer.valueOf(hours2)));
                    seconds = 3;
                    break;
            }
        }
    }

    private boolean A0E(CJ cj, long j) {
        Z0 z0 = this;
        long j2 = 0;
        long j3 = 0;
        char c2 = z0.A0Y ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    Z0 z02 = z0;
                    z02.A0J = j;
                    cj.A00 = z02.A0F;
                    z02.A0Y = false;
                    return true;
                case 3:
                    z0 = z0;
                    if (!z0.A0a) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z0 = z0;
                    j3 = z0.A0J;
                    j2 = -1;
                    if (j3 == -1) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    cj.A00 = j3;
                    z0.A0J = j2;
                    return true;
                case 6:
                    return false;
            }
        }
    }

    public static boolean A0F(String str) {
        boolean z = false;
        char c2 = !A03(752, 5, 31).equals(str) ? (char) 2 : (char) 30;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!A03(765, 5, 10).equals(str)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 3:
                    str = str;
                    if (!A03(972, 7, 34).equals(str)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 4:
                    str = str;
                    if (!A03(792, 14, 85).equals(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 5:
                    str = str;
                    if (!A03(53, 15, 111).equals(str)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 6:
                    str = str;
                    if (!A03(738, 14, 33).equals(str)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 7:
                    str = str;
                    if (!A03(335, 15, 58).equals(str)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case '\b':
                    str = str;
                    if (!A03(440, 16, 73).equals(str)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case '\t':
                    str = str;
                    if (!A03(979, 15, 15).equals(str)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case '\n':
                    str = str;
                    if (!A03(757, 8, 17).equals(str)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 11:
                    str = str;
                    if (!A03(470, 6, 110).equals(str)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case '\f':
                    str = str;
                    if (!A03(692, 8, 41).equals(str)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case '\r':
                    str = str;
                    if (!A03(465, 5, k.AppCompatTheme_windowActionModeOverlay).equals(str)) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 14:
                    str = str;
                    if (!A03(659, 9, 98).equals(str)) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 15:
                    str = str;
                    if (!A03(456, 9, 113).equals(str)) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 16:
                    str = str;
                    if (!A03(68, 5, 53).equals(str)) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 17:
                    str = str;
                    if (!A03(632, 6, 61).equals(str)) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 18:
                    str = str;
                    if (!A03(845, 8, 4).equals(str)) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 19:
                    str = str;
                    if (!A03(48, 5, 18).equals(str)) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 20:
                    str = str;
                    if (!A03(149, 13, k.AppCompatTheme_windowActionBar).equals(str)) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 21:
                    str = str;
                    if (!A03(952, 14, 39).equals(str)) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 22:
                    str = str;
                    if (!A03(966, 6, 34).equals(str)) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 23:
                    str = str;
                    if (!A03(784, 8, 38).equals(str)) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 24:
                    str = str;
                    if (!A03(427, 13, 84).equals(str)) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 25:
                    str = str;
                    if (!A03(638, 11, 7).equals(str)) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 26:
                    str = str;
                    if (!A03(649, 10, 107).equals(str)) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 27:
                    str = str;
                    if (!A03(501, 8, 39).equals(str)) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 28:
                    str = str;
                    if (!A03(546, 10, 25).equals(str)) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 29:
                    str = str;
                    if (!A03(197, 8, 17).equals(str)) {
                        c2 = ' ';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    z = true;
                    c2 = 31;
                    break;
                case 31:
                    return z;
                case ' ':
                    z = false;
                    c2 = 31;
                    break;
            }
        }
    }

    public static int[] A0H(int[] iArr, int i) {
        char c2 = iArr == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return new int[i];
                case 3:
                    iArr = iArr;
                    if (iArr.length < i) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return iArr;
                case 5:
                    return new int[Math.max(iArr.length * 2, i)];
            }
        }
    }

    public final void A0I(int i) throws AF {
        Z0 z0 = this;
        int i2 = 0;
        int i3 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        char c2 = i != 160 ? (char) 2 : (char) 30;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 174) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i3 = 475249515;
                    if (i == 19899) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 25152) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == 28032) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i == 357149030) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i == 374648427) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (i == i3) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return;
                case '\n':
                    z0 = z0;
                    if (!z0.A0a) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 11:
                    z0 = z0;
                    z0.A0N.ACq(z0.A02());
                    z0.A0a = true;
                    c2 = '\t';
                    break;
                case '\f':
                    z0 = z0;
                    if (z0.A0c.size() == 0) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    z0 = z0;
                    z0.A0N.A4w();
                    c2 = '\t';
                    break;
                case 14:
                    z0 = z0;
                    j3 = -9223372036854775807L;
                    if (z0.A0M != -9223372036854775807L) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    z0 = z0;
                    z0.A0M = 1000000L;
                    c2 = 16;
                    break;
                case 16:
                    z0 = z0;
                    j2 = z0.A0G;
                    if (j2 == j3) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    z0 = z0;
                    z0.A0H = z0.A01(j2);
                    c2 = '\t';
                    break;
                case 18:
                    z0 = z0;
                    if (!z0.A0O.A0c) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    z0 = z0;
                    if (z0.A0O.A0f != null) {
                        c2 = '$';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case 20:
                    z0 = z0;
                    if (!z0.A0O.A0c) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    z0 = z0;
                    if (z0.A0O.A0V == null) {
                        c2 = '%';
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    z0 = z0;
                    z0.A0O.A0U = new DrmInitData(new DrmInitData.SchemeData(C03419q.A04, A03(1028, 10, 54), z0.A0O.A0V.A03));
                    c2 = '\t';
                    break;
                case 23:
                    z0 = z0;
                    i2 = z0.A0B;
                    if (i2 == -1) {
                        c2 = '&';
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    z0 = z0;
                    j = z0.A0I;
                    if (j == -1) {
                        c2 = '&';
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    if (i2 != i3) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    z0 = z0;
                    z0.A0F = j;
                    c2 = '\t';
                    break;
                case 27:
                    z0 = z0;
                    if (!A0F(z0.A0O.A0Y)) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    z0 = z0;
                    CY cy = z0.A0O;
                    cy.A09(z0.A0N, cy.A0N);
                    z0.A0c.put(z0.A0O.A0N, z0.A0O);
                    c2 = 29;
                    break;
                case 29:
                    z0 = z0;
                    z0.A0O = null;
                    c2 = '\t';
                    break;
                case 30:
                    z0 = z0;
                    if (z0.A04 == 2) {
                        c2 = ' ';
                        break;
                    } else {
                        c2 = 31;
                        break;
                    }
                case 31:
                    return;
                case ' ':
                    z0 = z0;
                    if (!z0.A0W) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = '\"';
                        break;
                    }
                case '!':
                    z0 = z0;
                    z0.A01 |= 1;
                    c2 = '\"';
                    break;
                case '\"':
                    z0 = z0;
                    z0.A0B(z0.A0c.get(z0.A05), z0.A0D);
                    z0.A04 = 0;
                    c2 = '\t';
                    break;
                case '#':
                    throw new AF(A03(606, 26, 103));
                case '$':
                    throw new AF(A03(861, 53, 41));
                case '%':
                    throw new AF(A03(73, 55, 21));
                case '&':
                    throw new AF(A03(556, 50, 90));
            }
        }
    }

    public final void A0J(int i, double d2) {
        Z0 z0 = this;
        char c2 = i != 181 ? (char) 2 : (char) 16;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 17545) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    switch (i) {
                        case 21969:
                            c2 = 5;
                            break;
                        case 21970:
                            c2 = 6;
                            break;
                        case 21971:
                            c2 = 7;
                            break;
                        case 21972:
                            c2 = '\b';
                            break;
                        case 21973:
                            c2 = '\t';
                            break;
                        case 21974:
                            c2 = '\n';
                            break;
                        case 21975:
                            c2 = 11;
                            break;
                        case 21976:
                            c2 = '\f';
                            break;
                        case 21977:
                            c2 = '\r';
                            break;
                        case 21978:
                            c2 = 14;
                            break;
                        default:
                            c2 = 4;
                            break;
                    }
                case 4:
                    return;
                case 5:
                    z0 = z0;
                    z0.A0O.A06 = (float) d2;
                    c2 = 4;
                    break;
                case 6:
                    z0 = z0;
                    z0.A0O.A07 = (float) d2;
                    c2 = 4;
                    break;
                case 7:
                    z0 = z0;
                    z0.A0O.A04 = (float) d2;
                    c2 = 4;
                    break;
                case '\b':
                    z0 = z0;
                    z0.A0O.A05 = (float) d2;
                    c2 = 4;
                    break;
                case '\t':
                    z0 = z0;
                    z0.A0O.A02 = (float) d2;
                    c2 = 4;
                    break;
                case '\n':
                    z0 = z0;
                    z0.A0O.A03 = (float) d2;
                    c2 = 4;
                    break;
                case 11:
                    z0 = z0;
                    z0.A0O.A08 = (float) d2;
                    c2 = 4;
                    break;
                case '\f':
                    z0 = z0;
                    z0.A0O.A09 = (float) d2;
                    c2 = 4;
                    break;
                case '\r':
                    z0 = z0;
                    z0.A0O.A00 = (float) d2;
                    c2 = 4;
                    break;
                case 14:
                    z0 = z0;
                    z0.A0O.A01 = (float) d2;
                    c2 = 4;
                    break;
                case 15:
                    z0 = z0;
                    z0.A0G = (long) d2;
                    c2 = 4;
                    break;
                case 16:
                    z0 = z0;
                    z0.A0O.A0O = (int) d2;
                    c2 = 4;
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0K(int i, int i2, CD cd) throws InterruptedException, IOException {
        CD cd2 = cd;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        long j = 0;
        int i6 = 0;
        int[] iArr = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z = false;
        byte b2 = 0;
        int[] iArr2 = null;
        int i16 = 0;
        int i17 = 0;
        byte b3 = 0;
        int i18 = 0;
        CY cy = null;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        boolean z2 = false;
        Z0 z0 = this;
        int i23 = 0;
        boolean z3 = true;
        char c2 = i != 161 ? (char) 2 : (char) 14;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 163) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 16981) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 18402) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == 21419) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i == 25506) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i != 30322) {
                        c2 = 'G';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    z0 = z0;
                    cd2 = cd2;
                    i23 = 0;
                    CY cy2 = z0.A0O;
                    cy2.A0e = new byte[i2];
                    cd2.readFully(cy2.A0e, 0, i2);
                    c2 = '\t';
                    break;
                case '\t':
                    return;
                case '\n':
                    z0 = z0;
                    cd2 = cd2;
                    i23 = 0;
                    CY cy3 = z0.A0O;
                    cy3.A0d = new byte[i2];
                    cd2.readFully(cy3.A0d, 0, i2);
                    c2 = '\t';
                    break;
                case 11:
                    z0 = z0;
                    cd2 = cd2;
                    i23 = 0;
                    Arrays.fill(z0.A0l.A00, (byte) 0);
                    cd2.readFully(z0.A0l.A00, 4 - i2, i2);
                    z0.A0l.A0Y(0);
                    z0.A0B = (int) z0.A0l.A0M();
                    c2 = '\t';
                    break;
                case '\f':
                    z0 = z0;
                    cd2 = cd2;
                    i23 = 0;
                    byte[] bArr = new byte[i2];
                    cd2.readFully(bArr, 0, i2);
                    z0.A0O.A0V = new CN(z3 ? 1 : 0, bArr, 0, 0);
                    c2 = '\t';
                    break;
                case '\r':
                    z0 = z0;
                    cd2 = cd2;
                    i23 = 0;
                    CY cy4 = z0.A0O;
                    cy4.A0f = new byte[i2];
                    cd2.readFully(cy4.A0f, 0, i2);
                    c2 = '\t';
                    break;
                case 14:
                    z0 = z0;
                    b2 = 8;
                    if (z0.A04 != 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    z0 = z0;
                    cd2 = cd2;
                    i23 = 0;
                    z0.A05 = (int) z0.A0e.A05(cd2, false, z3, b2);
                    z0.A06 = z0.A0e.A04();
                    z0.A0C = -9223372036854775807L;
                    z0.A04 = z3 ? 1 : 0;
                    z0.A0k.A0V();
                    c2 = 16;
                    break;
                case 16:
                    z0 = z0;
                    cy = z0.A0c.get(z0.A05);
                    if (cy != null) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    Z0 z02 = z0;
                    cd2.ADL(i2 - z02.A06);
                    z02.A04 = i23;
                    return;
                case 18:
                    z0 = z0;
                    if (z0.A04 != z3) {
                        c2 = ' ';
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    z0 = z0;
                    cd2 = cd2;
                    i15 = 3;
                    z0.A07(cd2, 3);
                    i11 = 2;
                    i10 = (z0.A0k.A00[2] & 6) >> (z3 ? 1 : 0);
                    b3 = 255;
                    if (i10 != 0) {
                        c2 = '\'';
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    z0 = z0;
                    z0.A02 = z3 ? 1 : 0;
                    z0.A0b = A0H(z0.A0b, z3 ? 1 : 0);
                    z0.A0b[i23] = (i2 - z0.A06) - i15;
                    c2 = 21;
                    break;
                case 21:
                    z0 = z0;
                    z0.A0D = z0.A0E + z0.A01((z0.A0k.A00[0] << b2) | (z0.A0k.A00[1] & b3));
                    i21 = 2;
                    if ((z0.A0k.A00[2] & b2) != b2) {
                        c2 = '&';
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    z = true;
                    c2 = 23;
                    break;
                case 23:
                    cy = cy;
                    if (cy.A0Q == i21) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    if (i != 163) {
                        c2 = '%';
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    z0 = z0;
                    if ((z0.A0k.A00[i21] & 128) != 128) {
                        c2 = '%';
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    z2 = true;
                    c2 = 27;
                    break;
                case 27:
                    if (!z2) {
                        c2 = '$';
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    i20 = 1;
                    c2 = 29;
                    break;
                case 29:
                    if (!z) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    i14 = RecyclerView.UNDEFINED_DURATION;
                    c2 = 31;
                    break;
                case 31:
                    z0 = z0;
                    z0.A01 = i20 | i14;
                    z0.A04 = 2;
                    z0.A03 = 0;
                    c2 = ' ';
                    break;
                case ' ':
                    if (i != 163) {
                        c2 = 'F';
                        break;
                    } else {
                        c2 = '!';
                        break;
                    }
                case '!':
                    z0 = z0;
                    i12 = z0.A03;
                    if (i12 >= z0.A02) {
                        c2 = 'E';
                        break;
                    } else {
                        c2 = '\"';
                        break;
                    }
                case '\"':
                    z0 = z0;
                    cd2 = cd2;
                    cy = cy;
                    z0.A08(cd2, cy, z0.A0b[i12]);
                    z0.A0B(cy, z0.A0D + ((z0.A03 * cy.A0F) / AdError.NETWORK_ERROR_CODE));
                    z0.A03++;
                    c2 = '!';
                    break;
                case '#':
                    i14 = 0;
                    c2 = 31;
                    break;
                case '$':
                    i20 = 0;
                    c2 = 29;
                    break;
                case '%':
                    z2 = false;
                    c2 = 27;
                    break;
                case '&':
                    z = false;
                    c2 = 23;
                    break;
                case '\'':
                    if (i != 163) {
                        c2 = 'K';
                        break;
                    } else {
                        c2 = '(';
                        break;
                    }
                case '(':
                    z0 = z0;
                    cd2 = cd2;
                    z0.A07(cd2, 4);
                    z0.A02 = (z0.A0k.A00[i15] & b3) + (z3 ? 1 : 0);
                    z0.A0b = A0H(z0.A0b, z0.A02);
                    if (i10 != i11) {
                        c2 = '*';
                        break;
                    } else {
                        c2 = ')';
                        break;
                    }
                case ')':
                    z0 = z0;
                    int i24 = (i2 - z0.A06) - 4;
                    int i25 = z0.A02;
                    Arrays.fill(z0.A0b, i23, i25, i24 / i25);
                    c2 = 21;
                    break;
                case '*':
                    if (i10 != z3) {
                        c2 = '1';
                        break;
                    } else {
                        c2 = '+';
                        break;
                    }
                case '+':
                    i19 = 0;
                    i13 = 4;
                    i9 = 0;
                    c2 = ',';
                    break;
                case ',':
                    z0 = z0;
                    i7 = z0.A02;
                    if (i9 >= i7 - 1) {
                        c2 = '0';
                        break;
                    } else {
                        c2 = '-';
                        break;
                    }
                case '-':
                    z0 = z0;
                    z0.A0b[i9] = i23;
                    c2 = '.';
                    break;
                case '.':
                    z0 = z0;
                    cd2 = cd2;
                    i13 += z3 ? 1 : 0;
                    z0.A07(cd2, i13);
                    int i26 = z0.A0k.A00[i13 - 1] & b3;
                    iArr2 = z0.A0b;
                    iArr2[i9] = iArr2[i9] + i26;
                    if (i26 == b3) {
                        c2 = '.';
                        break;
                    } else {
                        c2 = '/';
                        break;
                    }
                case '/':
                    iArr2 = iArr2;
                    i19 += iArr2[i9];
                    i9++;
                    c2 = ',';
                    break;
                case '0':
                    z0 = z0;
                    z0.A0b[i7 - (z3 ? 1 : 0)] = ((i2 - z0.A06) - i13) - i19;
                    c2 = 21;
                    break;
                case '1':
                    if (i10 != i15) {
                        c2 = 'J';
                        break;
                    } else {
                        c2 = '2';
                        break;
                    }
                case '2':
                    i5 = 0;
                    i6 = 4;
                    i18 = 0;
                    c2 = '3';
                    break;
                case '3':
                    z0 = z0;
                    i3 = z0.A02;
                    if (i18 >= i3 - 1) {
                        c2 = 'D';
                        break;
                    } else {
                        c2 = '4';
                        break;
                    }
                case '4':
                    z0 = z0;
                    cd2 = cd2;
                    z0.A0b[i18] = i23;
                    i6++;
                    z0.A07(cd2, i6);
                    if (z0.A0k.A00[i6 - 1] == 0) {
                        c2 = 'I';
                        break;
                    } else {
                        c2 = '5';
                        break;
                    }
                case '5':
                    j = 0;
                    i17 = 0;
                    c2 = '6';
                    break;
                case '6':
                    if (i17 >= b2) {
                        c2 = '>';
                        break;
                    } else {
                        c2 = '7';
                        break;
                    }
                case '7':
                    z0 = z0;
                    i22 = (z3 ? 1 : 0) << (7 - i17);
                    if ((z0.A0k.A00[i6 - 1] & i22) == 0) {
                        c2 = ';';
                        break;
                    } else {
                        c2 = '8';
                        break;
                    }
                case '8':
                    z0 = z0;
                    cd2 = cd2;
                    int i27 = i6 - 1;
                    i6 += i17;
                    z0.A07(cd2, i6);
                    i16 = i27 + 1;
                    j = z0.A0k.A00[i27] & b3 & (i22 ^ (-1));
                    c2 = '9';
                    break;
                case '9':
                    if (i16 >= i6) {
                        c2 = '<';
                        break;
                    } else {
                        c2 = ':';
                        break;
                    }
                case ':':
                    z0 = z0;
                    j = (j << b2) | (z0.A0k.A00[i16] & b3);
                    i16++;
                    c2 = '9';
                    break;
                case ';':
                    i17++;
                    z3 = true;
                    c2 = '6';
                    break;
                case '<':
                    if (i18 <= 0) {
                        c2 = '>';
                        break;
                    } else {
                        c2 = '=';
                        break;
                    }
                case '=':
                    j -= (1 << ((i17 * 7) + 6)) - 1;
                    c2 = '>';
                    break;
                case '>':
                    if (j < -2147483648L) {
                        c2 = 'H';
                        break;
                    } else {
                        c2 = '?';
                        break;
                    }
                case '?':
                    if (j > 2147483647L) {
                        c2 = 'H';
                        break;
                    } else {
                        c2 = '@';
                        break;
                    }
                case '@':
                    z0 = z0;
                    i8 = (int) j;
                    iArr = z0.A0b;
                    if (i18 != 0) {
                        c2 = 'C';
                        break;
                    } else {
                        c2 = 'A';
                        break;
                    }
                case 'A':
                    i4 = i8;
                    c2 = 'B';
                    break;
                case 'B':
                    z0 = z0;
                    iArr = iArr;
                    iArr[i18] = i4;
                    i5 += z0.A0b[i18];
                    i18++;
                    i23 = 0;
                    z3 = true;
                    c2 = '3';
                    break;
                case 'C':
                    iArr = iArr;
                    i4 = iArr[i18 - 1] + i8;
                    c2 = 'B';
                    break;
                case 'D':
                    z0 = z0;
                    z0.A0b[i3 - 1] = ((i2 - z0.A06) - i6) - i5;
                    c2 = 21;
                    break;
                case 'E':
                    z0 = z0;
                    z0.A04 = 0;
                    c2 = '\t';
                    break;
                case 'F':
                    z0 = z0;
                    cd2 = cd2;
                    cy = cy;
                    z0.A08(cd2, cy, z0.A0b[0]);
                    c2 = '\t';
                    break;
                case 'G':
                    throw new AF(A03(1013, 15, 2) + i);
                case 'H':
                    throw new AF(A03(509, 37, 19));
                case 'I':
                    throw new AF(A03(0, 33, 95));
                case 'J':
                    throw new AF(A03(476, 25, 50) + i10);
                case 'K':
                    throw new AF(A03(914, 38, 30));
            }
        }
    }

    public final void A0L(int i, long j) throws AF {
        Z0 z0 = this;
        CY cy = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        CY cy2 = null;
        int i9 = 0;
        CY cy3 = null;
        long j2 = 0;
        boolean z2 = false;
        String strA03 = A03(770, 14, 98);
        char c2 = i != 20529 ? (char) 2 : 'F';
        while (true) {
            switch (c2) {
                case 2:
                    j2 = 1;
                    if (i == 20530) {
                        c2 = 'E';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z2 = false;
                    i7 = 3;
                    i5 = 2;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    z = true;
                    switch (i) {
                        case 131:
                            c2 = 29;
                            break;
                        case 136:
                            c2 = 30;
                            break;
                        case 155:
                            c2 = '!';
                            break;
                        case 159:
                            c2 = '\"';
                            break;
                        case 176:
                            c2 = '#';
                            break;
                        case 179:
                            c2 = '$';
                            break;
                        case 186:
                            c2 = '%';
                            break;
                        case 215:
                            c2 = '&';
                            break;
                        case 231:
                            c2 = '\'';
                            break;
                        case 241:
                            c2 = '(';
                            break;
                        case 251:
                            c2 = '*';
                            break;
                        case 16980:
                            c2 = '+';
                            break;
                        case 17029:
                            c2 = ',';
                            break;
                        case 17143:
                            c2 = '.';
                            break;
                        case 18401:
                            c2 = '/';
                            break;
                        case 18408:
                            c2 = '0';
                            break;
                        case 21420:
                            c2 = '1';
                            break;
                        case 21432:
                            c2 = '2';
                            break;
                        case 21680:
                            c2 = ':';
                            break;
                        case 21682:
                            c2 = ';';
                            break;
                        case 21690:
                            c2 = '<';
                            break;
                        case 21930:
                            c2 = '=';
                            break;
                        case 22186:
                            c2 = '@';
                            break;
                        case 22203:
                            c2 = 'A';
                            break;
                        case 25188:
                            c2 = 'B';
                            break;
                        case 2352003:
                            c2 = 'C';
                            break;
                        case 2807729:
                            c2 = 'D';
                            break;
                        default:
                            c2 = 4;
                            break;
                    }
                case 4:
                    i9 = 7;
                    i3 = 6;
                    switch (i) {
                        case 21945:
                            c2 = 6;
                            break;
                        case 21946:
                            c2 = '\n';
                            break;
                        case 21947:
                            c2 = 18;
                            break;
                        case 21948:
                            c2 = 27;
                            break;
                        case 21949:
                            c2 = 28;
                            break;
                        default:
                            c2 = 5;
                            break;
                    }
                case 5:
                    return;
                case 6:
                    i2 = (int) j;
                    if (i2 == z) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i2 == i5) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case '\b':
                    z0 = z0;
                    z0.A0O.A0C = z ? 1 : 0;
                    c2 = 5;
                    break;
                case '\t':
                    z0 = z0;
                    z0.A0O.A0C = i5;
                    c2 = 5;
                    break;
                case '\n':
                    i6 = (int) j;
                    if (i6 == z) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    if (i6 == 16) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    if (i6 == 18) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    if (i6 == i3) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    if (i6 == i9) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 15:
                    z0 = z0;
                    z0.A0O.A0E = i9;
                    c2 = 5;
                    break;
                case 16:
                    z0 = z0;
                    z0.A0O.A0E = i3;
                    c2 = 5;
                    break;
                case 17:
                    z0 = z0;
                    z0.A0O.A0E = i7;
                    c2 = 5;
                    break;
                case 18:
                    z0 = z0;
                    cy2 = z0.A0O;
                    cy2.A0b = z;
                    i8 = (int) j;
                    if (i8 == z) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    if (i8 == 9) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    if (i8 == 4) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    if (i8 == 5) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    if (i8 == i3) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    if (i8 == i9) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 24:
                    z0 = z0;
                    z0.A0O.A0D = i5;
                    c2 = 5;
                    break;
                case 25:
                    cy2 = cy2;
                    cy2.A0D = i3;
                    c2 = 5;
                    break;
                case 26:
                    cy2 = cy2;
                    cy2.A0D = z ? 1 : 0;
                    c2 = 5;
                    break;
                case 27:
                    z0 = z0;
                    z0.A0O.A0K = (int) j;
                    c2 = 5;
                    break;
                case 28:
                    z0 = z0;
                    z0.A0O.A0L = (int) j;
                    c2 = 5;
                    break;
                case 29:
                    z0 = z0;
                    z0.A0O.A0Q = (int) j;
                    c2 = 5;
                    break;
                case 30:
                    z0 = z0;
                    cy3 = z0.A0O;
                    if (j != j2) {
                        c2 = ' ';
                        break;
                    } else {
                        c2 = 31;
                        break;
                    }
                case 31:
                    z2 = true;
                    c2 = ' ';
                    break;
                case ' ':
                    cy3 = cy3;
                    cy3.A0Z = z2;
                    c2 = 5;
                    break;
                case '!':
                    z0 = z0;
                    z0.A0C = z0.A01(j);
                    c2 = 5;
                    break;
                case '\"':
                    z0 = z0;
                    z0.A0O.A0B = (int) j;
                    c2 = 5;
                    break;
                case '#':
                    z0 = z0;
                    z0.A0O.A0R = (int) j;
                    c2 = 5;
                    break;
                case '$':
                    z0 = z0;
                    z0.A0Q.A04(z0.A01(j));
                    c2 = 5;
                    break;
                case '%':
                    z0 = z0;
                    z0.A0O.A0J = (int) j;
                    c2 = 5;
                    break;
                case '&':
                    z0 = z0;
                    z0.A0O.A0N = (int) j;
                    c2 = 5;
                    break;
                case '\'':
                    z0 = z0;
                    z0.A0E = z0.A01(j);
                    c2 = 5;
                    break;
                case '(':
                    z0 = z0;
                    if (!z0.A0Z) {
                        c2 = ')';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case ')':
                    z0 = z0;
                    z0.A0P.A04(j);
                    z0.A0Z = z;
                    c2 = 5;
                    break;
                case '*':
                    z0 = z0;
                    z0.A0W = z;
                    c2 = 5;
                    break;
                case '+':
                    if (j != 3) {
                        c2 = 'G';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case ',':
                    if (j < j2) {
                        c2 = 'H';
                        break;
                    } else {
                        c2 = '-';
                        break;
                    }
                case '-':
                    if (j > 2) {
                        c2 = 'H';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case '.':
                    if (j != j2) {
                        c2 = 'I';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case '/':
                    if (j != 5) {
                        c2 = 'J';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case '0':
                    if (j != j2) {
                        c2 = 'K';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case '1':
                    z0 = z0;
                    z0.A0I = z0.A0K + j;
                    c2 = 5;
                    break;
                case '2':
                    i4 = (int) j;
                    if (i4 == 0) {
                        c2 = '9';
                        break;
                    } else {
                        c2 = '3';
                        break;
                    }
                case '3':
                    if (i4 == z) {
                        c2 = '8';
                        break;
                    } else {
                        c2 = '4';
                        break;
                    }
                case '4':
                    if (i4 == i7) {
                        c2 = '7';
                        break;
                    } else {
                        c2 = '5';
                        break;
                    }
                case '5':
                    if (i4 == 15) {
                        c2 = '6';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case '6':
                    z0 = z0;
                    z0.A0O.A0P = i7;
                    c2 = 5;
                    break;
                case '7':
                    z0 = z0;
                    z0.A0O.A0P = z ? 1 : 0;
                    c2 = 5;
                    break;
                case '8':
                    z0 = z0;
                    z0.A0O.A0P = i5;
                    c2 = 5;
                    break;
                case '9':
                    z0 = z0;
                    z2 = false;
                    z0.A0O.A0P = 0;
                    c2 = 5;
                    break;
                case ':':
                    z0 = z0;
                    z0.A0O.A0I = (int) j;
                    c2 = 5;
                    break;
                case ';':
                    z0 = z0;
                    z0.A0O.A0H = (int) j;
                    c2 = 5;
                    break;
                case '<':
                    z0 = z0;
                    z0.A0O.A0G = (int) j;
                    c2 = 5;
                    break;
                case '=':
                    z0 = z0;
                    cy = z0.A0O;
                    if (j != j2) {
                        c2 = '?';
                        break;
                    } else {
                        c2 = '>';
                        break;
                    }
                case '>':
                    z2 = true;
                    c2 = '?';
                    break;
                case '?':
                    cy = cy;
                    cy.A0a = z2;
                    c2 = 5;
                    break;
                case '@':
                    z0 = z0;
                    z0.A0O.A0S = j;
                    c2 = 5;
                    break;
                case 'A':
                    z0 = z0;
                    z0.A0O.A0T = j;
                    c2 = 5;
                    break;
                case 'B':
                    z0 = z0;
                    z0.A0O.A0A = (int) j;
                    c2 = 5;
                    break;
                case 'C':
                    z0 = z0;
                    z0.A0O.A0F = (int) j;
                    c2 = 5;
                    break;
                case 'D':
                    z0 = z0;
                    z0.A0M = j;
                    c2 = 5;
                    break;
                case 'E':
                    if (j != j2) {
                        c2 = 'L';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 'F':
                    if (j != 0) {
                        c2 = 'M';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 'G':
                    throw new AF(A03(700, 16, 47) + j + strA03);
                case 'H':
                    throw new AF(A03(994, 19, 72) + j + strA03);
                case 'I':
                    throw new AF(A03(676, 16, 126) + j + strA03);
                case 'J':
                    throw new AF(A03(33, 15, 56) + j + strA03);
                case 'K':
                    throw new AF(A03(716, 22, 55) + j + strA03);
                case 'L':
                    throw new AF(A03(314, 21, 65) + j + strA03);
                case 'M':
                    throw new AF(A03(128, 21, 35) + j + strA03);
            }
        }
    }

    public final void A0M(int i, long j, long j2) throws AF {
        Z0 z0 = this;
        long j3 = 0;
        boolean z = false;
        long j4 = 0;
        char c2 = i != 160 ? (char) 2 : (char) 26;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 174) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 187) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    j3 = -1;
                    if (i == 19899) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z = true;
                    if (i == 20533) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i == 21968) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i == 25152) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (i == 408125543) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (i == 475249515) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (i == 524531317) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return;
                case '\f':
                    z0 = z0;
                    if (!z0.A0a) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case '\r':
                    z0 = z0;
                    if (!z0.A0o) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    z0 = z0;
                    if (z0.A0F == j3) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    z0 = z0;
                    z0.A0Y = z;
                    c2 = 11;
                    break;
                case 16:
                    z0 = z0;
                    z0.A0N.ACq(new C0958Yo(z0.A0H));
                    z0.A0a = z;
                    c2 = 11;
                    break;
                case 17:
                    z0 = z0;
                    z0.A0Q = new IY();
                    z0.A0P = new IY();
                    c2 = 11;
                    break;
                case 18:
                    z0 = z0;
                    j4 = z0.A0K;
                    if (j4 == j3) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    if (j4 != j) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    z0 = z0;
                    z0.A0K = j;
                    z0.A0L = j2;
                    c2 = 11;
                    break;
                case 21:
                    z0 = z0;
                    z0.A0O.A0b = z;
                    c2 = 11;
                    break;
                case 22:
                    z0 = z0;
                    z0.A0O.A0c = z;
                    c2 = 11;
                    break;
                case 23:
                    z0 = z0;
                    z0.A0B = -1;
                    z0.A0I = j3;
                    c2 = 11;
                    break;
                case 24:
                    z0 = z0;
                    z0.A0Z = false;
                    c2 = 11;
                    break;
                case 25:
                    z0 = z0;
                    z0.A0O = new CY(null);
                    c2 = 11;
                    break;
                case 26:
                    z0 = z0;
                    z0.A0W = false;
                    c2 = 11;
                    break;
                case 27:
                    throw new AF(A03(806, 39, 95));
            }
        }
    }

    public final void A0N(int i, String str) throws AF {
        Z0 z0 = this;
        char c2 = i != 134 ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 17026) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 2274716) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return;
                case 5:
                    z0 = z0;
                    str = str;
                    z0.A0O.A0g = str;
                    c2 = 4;
                    break;
                case 6:
                    str = str;
                    if (!A03(423, 4, k.AppCompatTheme_windowNoTitle).equals(str)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 7:
                    str = str;
                    if (!A03(668, 8, 63).equals(str)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case '\b':
                    z0 = z0;
                    str = str;
                    z0.A0O.A0Y = str;
                    c2 = 4;
                    break;
                case '\t':
                    throw new AF(A03(853, 8, 40) + str + A03(770, 14, 98));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void A7T(CE ce) {
        this.A0N = ce;
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final int AC3(CD cd, CJ cj) throws InterruptedException, IOException {
        Z0 z0 = this;
        int i = 0;
        z0.A0V = false;
        boolean zAC5 = true;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (!zAC5) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z0 = z0;
                    if (!z0.A0V) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 4:
                    z0 = z0;
                    cd = cd;
                    zAC5 = z0.A0d.AC5(cd);
                    if (!zAC5) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z0 = z0;
                    cd = cd;
                    cj = cj;
                    if (!z0.A0E(cj, cd.A6n())) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return 1;
                case 7:
                    if (!zAC5) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\b':
                    i = 0;
                    c2 = '\t';
                    break;
                case '\t':
                    z0 = z0;
                    if (i >= z0.A0c.size()) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    z0 = z0;
                    z0.A0c.valueAt(i).A07();
                    i++;
                    c2 = '\t';
                    break;
                case 11:
                    return -1;
                case '\f':
                    return 0;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void ACp(long j, long j2) {
        Z0 z0 = this;
        z0.A0E = -9223372036854775807L;
        z0.A04 = 0;
        z0.A0d.reset();
        z0.A0e.A06();
        z0.A05();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    z0 = z0;
                    if (i >= z0.A0c.size()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z0 = z0;
                    z0.A0c.valueAt(i).A08();
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final boolean ADM(CD cd) throws InterruptedException, IOException {
        return new Ca().A01(cd);
    }
}
