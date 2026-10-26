package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k7 {
    private static final k7 f = new k7(0, new int[0], new Object[0], false);
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f2743b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f2744c;

    /* renamed from: d, reason: collision with root package name */
    private int f2745d;
    private boolean e;

    private k7() {
        this(0, new int[8], new Object[8], true);
    }

    private k7(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f2745d = -1;
        this.a = i;
        this.f2743b = iArr;
        this.f2744c = objArr;
        this.e = z;
    }

    public static k7 a() {
        return f;
    }

    static k7 b(k7 k7Var, k7 k7Var2) {
        int i = k7Var.a + k7Var2.a;
        int[] iArrCopyOf = Arrays.copyOf(k7Var.f2743b, i);
        System.arraycopy(k7Var2.f2743b, 0, iArrCopyOf, k7Var.a, k7Var2.a);
        Object[] objArrCopyOf = Arrays.copyOf(k7Var.f2744c, i);
        System.arraycopy(k7Var2.f2744c, 0, objArrCopyOf, k7Var.a, k7Var2.a);
        return new k7(i, iArrCopyOf, objArrCopyOf, true);
    }

    private static void d(int i, Object obj, f8 f8Var) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            f8Var.K(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            f8Var.s(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            f8Var.B(i2, (l3) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 != 5) {
                throw new RuntimeException(y4.d());
            }
            f8Var.m(i2, ((Integer) obj).intValue());
        } else if (f8Var.a() == r4.f.k) {
            f8Var.f(i2);
            ((k7) obj).h(f8Var);
            f8Var.g(i2);
        } else {
            f8Var.g(i2);
            ((k7) obj).h(f8Var);
            f8Var.f(i2);
        }
    }

    static k7 g() {
        return new k7();
    }

    final void c(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.a;
        if (i2 == this.f2743b.length) {
            int i3 = this.a + (i2 < 4 ? 8 : i2 >> 1);
            this.f2743b = Arrays.copyOf(this.f2743b, i3);
            this.f2744c = Arrays.copyOf(this.f2744c, i3);
        }
        int[] iArr = this.f2743b;
        int i4 = this.a;
        iArr[i4] = i;
        this.f2744c[i4] = obj;
        this.a = i4 + 1;
    }

    final void e(f8 f8Var) {
        if (f8Var.a() == r4.f.l) {
            for (int i = this.a - 1; i >= 0; i--) {
                f8Var.b(this.f2743b[i] >>> 3, this.f2744c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            f8Var.b(this.f2743b[i2] >>> 3, this.f2744c[i2]);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        int i = this.a;
        if (i == k7Var.a) {
            int[] iArr = this.f2743b;
            int[] iArr2 = k7Var.f2743b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                }
                if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                Object[] objArr = this.f2744c;
                Object[] objArr2 = k7Var.f2744c;
                int i3 = this.a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    }
                    if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    }
                    i4++;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    final void f(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            f6.d(sb, i, String.valueOf(this.f2743b[i2] >>> 3), this.f2744c[i2]);
        }
    }

    public final void h(f8 f8Var) {
        if (this.a == 0) {
            return;
        }
        if (f8Var.a() == r4.f.k) {
            for (int i = 0; i < this.a; i++) {
                d(this.f2743b[i], this.f2744c[i], f8Var);
            }
            return;
        }
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            d(this.f2743b[i2], this.f2744c[i2], f8Var);
        }
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f2743b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f2744c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final void i() {
        this.e = false;
    }

    public final int j() {
        int i = this.f2745d;
        if (i != -1) {
            return i;
        }
        int iD0 = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            iD0 += y3.d0(this.f2743b[i2] >>> 3, (l3) this.f2744c[i2]);
        }
        this.f2745d = iD0;
        return iD0;
    }

    public final int k() {
        int iI0;
        int i = this.f2745d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.f2743b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                iI0 = y3.i0(i5, ((Long) this.f2744c[i3]).longValue());
            } else if (i6 == 1) {
                iI0 = y3.r0(i5, ((Long) this.f2744c[i3]).longValue());
            } else if (i6 == 2) {
                iI0 = y3.U(i5, (l3) this.f2744c[i3]);
            } else if (i6 == 3) {
                iI0 = (y3.h0(i5) << 1) + ((k7) this.f2744c[i3]).k();
            } else {
                if (i6 != 5) {
                    throw new IllegalStateException(y4.d());
                }
                iI0 = y3.y0(i5, ((Integer) this.f2744c[i3]).intValue());
            }
            i2 += iI0;
        }
        this.f2745d = i2;
        return i2;
    }
}
