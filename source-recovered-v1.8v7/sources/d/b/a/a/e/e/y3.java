package d.b.a.a.e.e;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class y3 extends i3 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f2885b = Logger.getLogger(y3.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f2886c = r7.m();
    a4 a;

    static class a extends y3 {

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f2887d;
        private final int e;
        private int f;

        a(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i2 + 0;
            if ((i2 | 0 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            this.f2887d = bArr;
            this.f = 0;
            this.e = i3;
        }

        private final void G0(byte[] bArr, int i, int i2) throws b {
            try {
                System.arraycopy(bArr, i, this.f2887d, this.f, i2);
                this.f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)), e);
            }
        }

        @Override // d.b.a.a.e.e.y3
        public final void O(int i) throws b {
            if (!y3.f2886c || e3.b() || b() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f2887d;
                        int i2 = this.f;
                        this.f = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                    }
                }
                byte[] bArr2 = this.f2887d;
                int i3 = this.f;
                this.f = i3 + 1;
                bArr2[i3] = (byte) i;
                return;
            }
            if ((i & (-128)) == 0) {
                byte[] bArr3 = this.f2887d;
                int i4 = this.f;
                this.f = i4 + 1;
                r7.l(bArr3, i4, (byte) i);
                return;
            }
            byte[] bArr4 = this.f2887d;
            int i5 = this.f;
            this.f = i5 + 1;
            r7.l(bArr4, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & (-128)) == 0) {
                byte[] bArr5 = this.f2887d;
                int i7 = this.f;
                this.f = i7 + 1;
                r7.l(bArr5, i7, (byte) i6);
                return;
            }
            byte[] bArr6 = this.f2887d;
            int i8 = this.f;
            this.f = i8 + 1;
            r7.l(bArr6, i8, (byte) (i6 | 128));
            int i9 = i6 >>> 7;
            if ((i9 & (-128)) == 0) {
                byte[] bArr7 = this.f2887d;
                int i10 = this.f;
                this.f = i10 + 1;
                r7.l(bArr7, i10, (byte) i9);
                return;
            }
            byte[] bArr8 = this.f2887d;
            int i11 = this.f;
            this.f = i11 + 1;
            r7.l(bArr8, i11, (byte) (i9 | 128));
            int i12 = i9 >>> 7;
            if ((i12 & (-128)) == 0) {
                byte[] bArr9 = this.f2887d;
                int i13 = this.f;
                this.f = i13 + 1;
                r7.l(bArr9, i13, (byte) i12);
                return;
            }
            byte[] bArr10 = this.f2887d;
            int i14 = this.f;
            this.f = i14 + 1;
            r7.l(bArr10, i14, (byte) (i12 | 128));
            byte[] bArr11 = this.f2887d;
            int i15 = this.f;
            this.f = i15 + 1;
            r7.l(bArr11, i15, (byte) (i12 >>> 7));
        }

        @Override // d.b.a.a.e.e.y3
        public final void P(int i, int i2) throws b {
            m(i, 0);
            j(i2);
        }

        @Override // d.b.a.a.e.e.y3
        public final void R(int i, l3 l3Var) throws b {
            m(1, 3);
            Y(2, i);
            o(3, l3Var);
            m(1, 4);
        }

        @Override // d.b.a.a.e.e.y3
        public final void T(byte[] bArr, int i, int i2) throws b {
            O(i2);
            G0(bArr, 0, i2);
        }

        @Override // d.b.a.a.e.e.y3
        public final void Y(int i, int i2) throws b {
            m(i, 0);
            O(i2);
        }

        @Override // d.b.a.a.e.e.y3
        public final void Z(int i, long j) throws b {
            m(i, 1);
            a0(j);
        }

        @Override // d.b.a.a.e.e.i3
        public final void a(byte[] bArr, int i, int i2) throws b {
            G0(bArr, i, i2);
        }

        @Override // d.b.a.a.e.e.y3
        public final void a0(long j) throws b {
            try {
                byte[] bArr = this.f2887d;
                int i = this.f;
                int i2 = i + 1;
                this.f = i2;
                bArr[i] = (byte) j;
                byte[] bArr2 = this.f2887d;
                int i3 = i2 + 1;
                this.f = i3;
                bArr2[i2] = (byte) (j >> 8);
                byte[] bArr3 = this.f2887d;
                int i4 = i3 + 1;
                this.f = i4;
                bArr3[i3] = (byte) (j >> 16);
                byte[] bArr4 = this.f2887d;
                int i5 = i4 + 1;
                this.f = i5;
                bArr4[i4] = (byte) (j >> 24);
                byte[] bArr5 = this.f2887d;
                int i6 = i5 + 1;
                this.f = i6;
                bArr5[i5] = (byte) (j >> 32);
                byte[] bArr6 = this.f2887d;
                int i7 = i6 + 1;
                this.f = i7;
                bArr6[i6] = (byte) (j >> 40);
                byte[] bArr7 = this.f2887d;
                int i8 = i7 + 1;
                this.f = i8;
                bArr7[i7] = (byte) (j >> 48);
                byte[] bArr8 = this.f2887d;
                this.f = i8 + 1;
                bArr8[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // d.b.a.a.e.e.y3
        public final int b() {
            return this.e - this.f;
        }

        @Override // d.b.a.a.e.e.y3
        public final void f0(int i) throws b {
            try {
                byte[] bArr = this.f2887d;
                int i2 = this.f;
                int i3 = i2 + 1;
                this.f = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f2887d;
                int i4 = i3 + 1;
                this.f = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f2887d;
                int i5 = i4 + 1;
                this.f = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f2887d;
                this.f = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // d.b.a.a.e.e.y3
        public final void g(byte b2) throws b {
            try {
                byte[] bArr = this.f2887d;
                int i = this.f;
                this.f = i + 1;
                bArr[i] = b2;
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // d.b.a.a.e.e.y3
        public final void j(int i) throws b {
            if (i >= 0) {
                O(i);
            } else {
                t(i);
            }
        }

        @Override // d.b.a.a.e.e.y3
        public final void k0(int i, int i2) throws b {
            m(i, 5);
            f0(i2);
        }

        @Override // d.b.a.a.e.e.y3
        public final void m(int i, int i2) throws b {
            O((i << 3) | i2);
        }

        @Override // d.b.a.a.e.e.y3
        public final void n(int i, long j) throws b {
            m(i, 0);
            t(j);
        }

        @Override // d.b.a.a.e.e.y3
        public final void o(int i, l3 l3Var) throws b {
            m(i, 2);
            u(l3Var);
        }

        @Override // d.b.a.a.e.e.y3
        public final void p(int i, z5 z5Var) throws b {
            m(1, 3);
            Y(2, i);
            m(3, 2);
            v(z5Var);
            m(1, 4);
        }

        @Override // d.b.a.a.e.e.y3
        final void q(int i, z5 z5Var, s6 s6Var) throws b {
            m(i, 2);
            b3 b3Var = (b3) z5Var;
            int iO = b3Var.o();
            if (iO == -1) {
                iO = s6Var.e(b3Var);
                b3Var.q(iO);
            }
            O(iO);
            s6Var.h(z5Var, this.a);
        }

        @Override // d.b.a.a.e.e.y3
        public final void r(int i, String str) throws b {
            m(i, 2);
            w(str);
        }

        @Override // d.b.a.a.e.e.y3
        public final void s(int i, boolean z) throws b {
            m(i, 0);
            g(z ? (byte) 1 : (byte) 0);
        }

        @Override // d.b.a.a.e.e.y3
        public final void t(long j) throws b {
            if (y3.f2886c && b() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f2887d;
                    int i = this.f;
                    this.f = i + 1;
                    r7.l(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f2887d;
                int i2 = this.f;
                this.f = i2 + 1;
                r7.l(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f2887d;
                    int i3 = this.f;
                    this.f = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                }
            }
            byte[] bArr4 = this.f2887d;
            int i4 = this.f;
            this.f = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // d.b.a.a.e.e.y3
        public final void u(l3 l3Var) throws b {
            O(l3Var.h());
            l3Var.n(this);
        }

        @Override // d.b.a.a.e.e.y3
        public final void v(z5 z5Var) throws b {
            O(z5Var.c());
            z5Var.j(this);
        }

        @Override // d.b.a.a.e.e.y3
        public final void w(String str) throws b {
            int i = this.f;
            try {
                int iP0 = y3.p0(str.length() * 3);
                int iP02 = y3.p0(str.length());
                if (iP02 != iP0) {
                    O(t7.d(str));
                    this.f = t7.e(str, this.f2887d, this.f, b());
                    return;
                }
                int i2 = i + iP02;
                this.f = i2;
                int iE = t7.e(str, this.f2887d, i2, b());
                this.f = i;
                O((iE - i) - iP02);
                this.f = iE;
            } catch (x7 e) {
                this.f = i;
                x(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new b(e2);
            }
        }
    }

    public static class b extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        b(String str, Throwable th) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
        }

        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private y3() {
    }

    public static int A(float f) {
        return 4;
    }

    public static int A0(int i) {
        return 4;
    }

    public static int B(int i, double d2) {
        return h0(i) + 8;
    }

    public static int B0(int i, int i2) {
        return h0(i) + 4;
    }

    public static int C(int i, float f) {
        return h0(i) + 4;
    }

    public static int C0(int i) {
        return l0(i);
    }

    public static int D(int i, i5 i5Var) {
        return (h0(1) << 1) + q0(2, i) + c(3, i5Var);
    }

    public static int D0(int i, int i2) {
        return h0(i) + l0(i2);
    }

    public static int E(int i, z5 z5Var) {
        return (h0(1) << 1) + q0(2, i) + h0(3) + J(z5Var);
    }

    @Deprecated
    public static int E0(int i) {
        return p0(i);
    }

    static int F(int i, z5 z5Var, s6 s6Var) {
        return h0(i) + e(z5Var, s6Var);
    }

    private static int F0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int G(int i, String str) {
        return h0(i) + K(str);
    }

    public static int H(int i, boolean z) {
        return h0(i) + 1;
    }

    public static int I(l3 l3Var) {
        int iH = l3Var.h();
        return p0(iH) + iH;
    }

    public static int J(z5 z5Var) {
        int iC = z5Var.c();
        return p0(iC) + iC;
    }

    public static int K(String str) {
        int length;
        try {
            length = t7.d(str);
        } catch (x7 unused) {
            length = str.getBytes(u4.a).length;
        }
        return p0(length) + length;
    }

    public static int L(boolean z) {
        return 1;
    }

    public static int M(byte[] bArr) {
        int length = bArr.length;
        return p0(length) + length;
    }

    public static int U(int i, l3 l3Var) {
        int iH0 = h0(i);
        int iH = l3Var.h();
        return iH0 + p0(iH) + iH;
    }

    @Deprecated
    static int V(int i, z5 z5Var, s6 s6Var) {
        int iH0 = h0(i) << 1;
        b3 b3Var = (b3) z5Var;
        int iO = b3Var.o();
        if (iO == -1) {
            iO = s6Var.e(b3Var);
            b3Var.q(iO);
        }
        return iH0 + iO;
    }

    @Deprecated
    public static int W(z5 z5Var) {
        return z5Var.c();
    }

    public static int c(int i, i5 i5Var) {
        int iH0 = h0(i);
        int iB = i5Var.b();
        return iH0 + p0(iB) + iB;
    }

    public static int c0(int i, long j) {
        return h0(i) + j0(j);
    }

    public static int d(i5 i5Var) {
        int iB = i5Var.b();
        return p0(iB) + iB;
    }

    public static int d0(int i, l3 l3Var) {
        return (h0(1) << 1) + q0(2, i) + U(3, l3Var);
    }

    static int e(z5 z5Var, s6 s6Var) {
        b3 b3Var = (b3) z5Var;
        int iO = b3Var.o();
        if (iO == -1) {
            iO = s6Var.e(b3Var);
            b3Var.q(iO);
        }
        return p0(iO) + iO;
    }

    public static int e0(long j) {
        return j0(j);
    }

    public static y3 f(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int h0(int i) {
        return p0(i << 3);
    }

    public static int i0(int i, long j) {
        return h0(i) + j0(j);
    }

    public static int j0(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int l0(int i) {
        if (i >= 0) {
            return p0(i);
        }
        return 10;
    }

    public static int m0(int i, int i2) {
        return h0(i) + l0(i2);
    }

    public static int n0(int i, long j) {
        return h0(i) + j0(z0(j));
    }

    public static int o0(long j) {
        return j0(z0(j));
    }

    public static int p0(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int q0(int i, int i2) {
        return h0(i) + p0(i2);
    }

    public static int r0(int i, long j) {
        return h0(i) + 8;
    }

    public static int s0(long j) {
        return 8;
    }

    public static int t0(int i) {
        return p0(F0(i));
    }

    public static int u0(int i, int i2) {
        return h0(i) + p0(F0(i2));
    }

    public static int v0(int i, long j) {
        return h0(i) + 8;
    }

    public static int w0(long j) {
        return 8;
    }

    public static int x0(int i) {
        return 4;
    }

    public static int y0(int i, int i2) {
        return h0(i) + 4;
    }

    public static int z(double d2) {
        return 8;
    }

    private static long z0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public final void N() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void O(int i);

    public abstract void P(int i, int i2);

    public final void Q(int i, long j) {
        n(i, z0(j));
    }

    public abstract void R(int i, l3 l3Var);

    public final void S(long j) {
        t(z0(j));
    }

    abstract void T(byte[] bArr, int i, int i2);

    public final void X(int i) {
        O(F0(i));
    }

    public abstract void Y(int i, int i2);

    public abstract void Z(int i, long j);

    public abstract void a0(long j);

    public abstract int b();

    public abstract void f0(int i);

    public abstract void g(byte b2);

    public final void g0(int i, int i2) {
        Y(i, F0(i2));
    }

    public final void h(double d2) {
        a0(Double.doubleToRawLongBits(d2));
    }

    public final void i(float f) {
        f0(Float.floatToRawIntBits(f));
    }

    public abstract void j(int i);

    public final void k(int i, double d2) {
        Z(i, Double.doubleToRawLongBits(d2));
    }

    public abstract void k0(int i, int i2);

    public final void l(int i, float f) {
        k0(i, Float.floatToRawIntBits(f));
    }

    public abstract void m(int i, int i2);

    public abstract void n(int i, long j);

    public abstract void o(int i, l3 l3Var);

    public abstract void p(int i, z5 z5Var);

    abstract void q(int i, z5 z5Var, s6 s6Var);

    public abstract void r(int i, String str);

    public abstract void s(int i, boolean z);

    public abstract void t(long j);

    public abstract void u(l3 l3Var);

    public abstract void v(z5 z5Var);

    public abstract void w(String str);

    final void x(String str, x7 x7Var) throws b {
        f2885b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) x7Var);
        byte[] bytes = str.getBytes(u4.a);
        try {
            O(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (b e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new b(e2);
        }
    }

    public final void y(boolean z) {
        g(z ? (byte) 1 : (byte) 0);
    }
}
