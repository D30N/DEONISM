package d.b.a.a.e.e;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class e6<T> implements s6<T> {
    private static final int[] q = new int[0];
    private static final Unsafe r = r7.t();
    private final int[] a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f2672b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2673c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2674d;
    private final z5 e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final int[] i;
    private final int j;
    private final int k;
    private final i6 l;
    private final j5 m;
    private final l7<?, ?> n;
    private final g4<?> o;
    private final w5 p;

    private e6(int[] iArr, Object[] objArr, int i, int i2, z5 z5Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, i6 i6Var, j5 j5Var, l7<?, ?> l7Var, g4<?> g4Var, w5 w5Var) {
        this.a = iArr;
        this.f2672b = objArr;
        this.f2673c = i;
        this.f2674d = i2;
        boolean z3 = z5Var instanceof r4;
        this.g = z;
        this.f = g4Var != null && g4Var.e(z5Var);
        this.h = false;
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = i6Var;
        this.m = j5Var;
        this.n = l7Var;
        this.o = g4Var;
        this.e = z5Var;
        this.p = w5Var;
    }

    private final boolean A(T t, int i) {
        int iQ = Q(i);
        long j = iQ & 1048575;
        if (j != 1048575) {
            return (r7.b(t, j) & (1 << (iQ >>> 20))) != 0;
        }
        int iO = O(i);
        long j2 = iO & 1048575;
        switch ((iO & 267386880) >>> 20) {
            case 0:
                return r7.C(t, j2) != 0.0d;
            case 1:
                return r7.x(t, j2) != 0.0f;
            case 2:
                return r7.o(t, j2) != 0;
            case 3:
                return r7.o(t, j2) != 0;
            case 4:
                return r7.b(t, j2) != 0;
            case 5:
                return r7.o(t, j2) != 0;
            case 6:
                return r7.b(t, j2) != 0;
            case 7:
                return r7.w(t, j2);
            case 8:
                Object objF = r7.F(t, j2);
                if (objF instanceof String) {
                    return !((String) objF).isEmpty();
                }
                if (objF instanceof l3) {
                    return !l3.f2755c.equals(objF);
                }
                throw new IllegalArgumentException();
            case 9:
                return r7.F(t, j2) != null;
            case 10:
                return !l3.f2755c.equals(r7.F(t, j2));
            case 11:
                return r7.b(t, j2) != 0;
            case 12:
                return r7.b(t, j2) != 0;
            case 13:
                return r7.b(t, j2) != 0;
            case 14:
                return r7.o(t, j2) != 0;
            case 15:
                return r7.b(t, j2) != 0;
            case 16:
                return r7.o(t, j2) != 0;
            case 17:
                return r7.F(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean B(T t, int i, int i2) {
        return r7.b(t, (long) (Q(i2) & 1048575)) == i;
    }

    private final boolean C(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? A(t, i) : (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean D(Object obj, int i, s6 s6Var) {
        return s6Var.f(r7.F(obj, i & 1048575));
    }

    private static <T> double E(T t, long j) {
        return ((Double) r7.F(t, j)).doubleValue();
    }

    private final int F(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final Object G(int i) {
        return this.f2672b[(i / 3) << 1];
    }

    private final void H(T t, int i) {
        int iQ = Q(i);
        long j = 1048575 & iQ;
        if (j == 1048575) {
            return;
        }
        r7.h(t, j, (1 << (iQ >>> 20)) | r7.b(t, j));
    }

    private final void I(T t, int i, int i2) {
        r7.h(t, Q(i2) & 1048575, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void J(T r17, d.b.a.a.e.e.f8 r18) {
        /*
            Method dump skipped, instructions count: 1290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.a.a.e.e.e6.J(java.lang.Object, d.b.a.a.e.e.f8):void");
    }

    private final void K(T t, T t2, int i) {
        int iO = O(i);
        int i2 = this.a[i];
        long j = iO & 1048575;
        if (B(t2, i2, i)) {
            Object objF = r7.F(t, j);
            Object objF2 = r7.F(t2, j);
            if (objF != null && objF2 != null) {
                r7.j(t, j, u4.e(objF, objF2));
                I(t, i2, i);
            } else if (objF2 != null) {
                r7.j(t, j, objF2);
                I(t, i2, i);
            }
        }
    }

    private static <T> float L(T t, long j) {
        return ((Float) r7.F(t, j)).floatValue();
    }

    private final v4 M(int i) {
        return (v4) this.f2672b[((i / 3) << 1) + 1];
    }

    private final boolean N(T t, T t2, int i) {
        return A(t, i) == A(t2, i);
    }

    private final int O(int i) {
        return this.a[i + 1];
    }

    private static <T> int P(T t, long j) {
        return ((Integer) r7.F(t, j)).intValue();
    }

    private final int Q(int i) {
        return this.a[i + 2];
    }

    private static <T> long R(T t, long j) {
        return ((Long) r7.F(t, j)).longValue();
    }

    private static k7 S(Object obj) {
        r4 r4Var = (r4) obj;
        k7 k7Var = r4Var.zzb;
        if (k7Var != k7.a()) {
            return k7Var;
        }
        k7 k7VarG = k7.g();
        r4Var.zzb = k7VarG;
        return k7VarG;
    }

    private static <T> boolean T(T t, long j) {
        return ((Boolean) r7.F(t, j)).booleanValue();
    }

    private final int U(int i) {
        if (i < this.f2673c || i > this.f2674d) {
            return -1;
        }
        return F(i, 0);
    }

    private final int j(int i, int i2) {
        if (i < this.f2673c || i > this.f2674d) {
            return -1;
        }
        return F(i, i2);
    }

    private static <UT, UB> int k(l7<UT, UB> l7Var, T t) {
        return l7Var.l(l7Var.f(t));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int l(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, g3 g3Var) throws y4 {
        Object objValueOf;
        Object objValueOf2;
        int iK;
        long jA;
        int iC;
        Object objValueOf3;
        Unsafe unsafe = r;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    objValueOf = Double.valueOf(h3.m(bArr, i));
                    unsafe.putObject(t, j, objValueOf);
                    iK = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return iK;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    objValueOf2 = Float.valueOf(h3.o(bArr, i));
                    unsafe.putObject(t, j, objValueOf2);
                    iK = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return iK;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    iK = h3.k(bArr, i, g3Var);
                    jA = g3Var.f2693b;
                    objValueOf3 = Long.valueOf(jA);
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, i4);
                    return iK;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    iK = h3.i(bArr, i, g3Var);
                    iC = g3Var.a;
                    objValueOf3 = Integer.valueOf(iC);
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, i4);
                    return iK;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    objValueOf = Long.valueOf(h3.l(bArr, i));
                    unsafe.putObject(t, j, objValueOf);
                    iK = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return iK;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    objValueOf2 = Integer.valueOf(h3.h(bArr, i));
                    unsafe.putObject(t, j, objValueOf2);
                    iK = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return iK;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    iK = h3.k(bArr, i, g3Var);
                    objValueOf3 = Boolean.valueOf(g3Var.f2693b != 0);
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, i4);
                    return iK;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    iK = h3.i(bArr, i, g3Var);
                    int i9 = g3Var.a;
                    if (i9 == 0) {
                        objValueOf3 = "";
                        unsafe.putObject(t, j, objValueOf3);
                        unsafe.putInt(t, j2, i4);
                        return iK;
                    }
                    if ((i6 & 536870912) != 0 && !t7.g(bArr, iK, iK + i9)) {
                        throw y4.f();
                    }
                    unsafe.putObject(t, j, new String(bArr, iK, i9, u4.a));
                    iK += i9;
                    unsafe.putInt(t, j2, i4);
                    return iK;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    iK = h3.g(r(i8), bArr, i, i2, g3Var);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    objValueOf3 = g3Var.f2694c;
                    if (object != null) {
                        objValueOf3 = u4.e(object, objValueOf3);
                    }
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, i4);
                    return iK;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    iK = h3.q(bArr, i, g3Var);
                    objValueOf3 = g3Var.f2694c;
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, i4);
                    return iK;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int i10 = h3.i(bArr, i, g3Var);
                    int i11 = g3Var.a;
                    v4 v4VarM = M(i8);
                    if (v4VarM != null && !v4VarM.f(i11)) {
                        S(t).c(i3, Long.valueOf(i11));
                        return i10;
                    }
                    unsafe.putObject(t, j, Integer.valueOf(i11));
                    iK = i10;
                    unsafe.putInt(t, j2, i4);
                    return iK;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    iK = h3.i(bArr, i, g3Var);
                    iC = w3.c(g3Var.a);
                    objValueOf3 = Integer.valueOf(iC);
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, i4);
                    return iK;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    iK = h3.k(bArr, i, g3Var);
                    jA = w3.a(g3Var.f2693b);
                    objValueOf3 = Long.valueOf(jA);
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, i4);
                    return iK;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    iK = h3.f(r(i8), bArr, i, i2, (i3 & (-8)) | 4, g3Var);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    objValueOf3 = g3Var.f2694c;
                    if (object2 != null) {
                        objValueOf3 = u4.e(object2, objValueOf3);
                    }
                    unsafe.putObject(t, j, objValueOf3);
                    unsafe.putInt(t, j2, i4);
                    return iK;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x026e, code lost:
    
        if (r30.f2693b != 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0270, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0272, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0273, code lost:
    
        r11.h(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0276, code lost:
    
        if (r4 >= r20) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0278, code lost:
    
        r6 = d.b.a.a.e.e.h3.i(r18, r4, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x027e, code lost:
    
        if (r21 != r30.a) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0280, code lost:
    
        r4 = d.b.a.a.e.e.h3.k(r18, r6, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0288, code lost:
    
        if (r30.f2693b == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0150, code lost:
    
        r11.add(d.b.a.a.e.e.l3.l(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0273, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0140, code lost:
    
        if (r4 == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0142, code lost:
    
        r11.add(d.b.a.a.e.e.l3.f2755c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0148, code lost:
    
        r11.add(d.b.a.a.e.e.l3.l(r18, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0150, code lost:
    
        if (r1 >= r20) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0152, code lost:
    
        r4 = d.b.a.a.e.e.h3.i(r18, r1, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0158, code lost:
    
        if (r21 != r30.a) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015a, code lost:
    
        r1 = d.b.a.a.e.e.h3.i(r18, r4, r30);
        r4 = r30.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0160, code lost:
    
        if (r4 < 0) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0164, code lost:
    
        if (r4 > (r18.length - r1)) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0166, code lost:
    
        if (r4 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016d, code lost:
    
        throw d.b.a.a.e.e.y4.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0172, code lost:
    
        throw d.b.a.a.e.e.y4.b();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x01cf -> B:94:0x01ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x0213 -> B:112:0x01ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x0288 -> B:151:0x0270). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0166 -> B:67:0x0142). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int m(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, d.b.a.a.e.e.g3 r30) throws d.b.a.a.e.e.y4 {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.a.a.e.e.e6.m(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, d.b.a.a.e.e.g3):int");
    }

    private final <K, V> int n(T t, byte[] bArr, int i, int i2, int i3, long j, g3 g3Var) throws y4 {
        Unsafe unsafe = r;
        Object objG = G(i3);
        Object object = unsafe.getObject(t, j);
        if (this.p.f(object)) {
            Object objG2 = this.p.g(objG);
            this.p.c(objG2, object);
            unsafe.putObject(t, j, objG2);
            object = objG2;
        }
        u5<?, ?> u5VarE = this.p.e(objG);
        Map<?, ?> mapB = this.p.b(object);
        int i4 = h3.i(bArr, i, g3Var);
        int i5 = g3Var.a;
        if (i5 < 0 || i5 > i2 - i4) {
            throw y4.a();
        }
        int i6 = i5 + i4;
        K k = u5VarE.f2852b;
        V v = u5VarE.f2854d;
        while (i4 < i6) {
            int iD = i4 + 1;
            int i7 = bArr[i4];
            if (i7 < 0) {
                iD = h3.d(i7, bArr, iD, g3Var);
                i7 = g3Var.a;
            }
            int i8 = iD;
            int i9 = i7 >>> 3;
            int i10 = i7 & 7;
            if (i9 != 1) {
                if (i9 == 2 && i10 == u5VarE.f2853c.g()) {
                    i4 = p(bArr, i8, i2, u5VarE.f2853c, u5VarE.f2854d.getClass(), g3Var);
                    v = g3Var.f2694c;
                } else {
                    i4 = h3.a(i7, bArr, i8, i2, g3Var);
                }
            } else if (i10 == u5VarE.a.g()) {
                i4 = p(bArr, i8, i2, u5VarE.a, null, g3Var);
                k = (K) g3Var.f2694c;
            } else {
                i4 = h3.a(i7, bArr, i8, i2, g3Var);
            }
        }
        if (i4 != i6) {
            throw y4.e();
        }
        mapB.put(k, v);
        return i6;
    }

    private static int p(byte[] bArr, int i, int i2, y7 y7Var, Class<?> cls, g3 g3Var) {
        int iK;
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        int iC;
        long jA;
        switch (h6.a[y7Var.ordinal()]) {
            case 1:
                iK = h3.k(bArr, i, g3Var);
                objValueOf = Boolean.valueOf(g3Var.f2693b != 0);
                g3Var.f2694c = objValueOf;
                return iK;
            case 2:
                return h3.q(bArr, i, g3Var);
            case 3:
                objValueOf2 = Double.valueOf(h3.m(bArr, i));
                g3Var.f2694c = objValueOf2;
                return i + 8;
            case 4:
            case 5:
                objValueOf3 = Integer.valueOf(h3.h(bArr, i));
                g3Var.f2694c = objValueOf3;
                return i + 4;
            case 6:
            case 7:
                objValueOf2 = Long.valueOf(h3.l(bArr, i));
                g3Var.f2694c = objValueOf2;
                return i + 8;
            case 8:
                objValueOf3 = Float.valueOf(h3.o(bArr, i));
                g3Var.f2694c = objValueOf3;
                return i + 4;
            case 9:
            case 10:
            case 11:
                iK = h3.i(bArr, i, g3Var);
                iC = g3Var.a;
                objValueOf = Integer.valueOf(iC);
                g3Var.f2694c = objValueOf;
                return iK;
            case 12:
            case 13:
                iK = h3.k(bArr, i, g3Var);
                jA = g3Var.f2693b;
                objValueOf = Long.valueOf(jA);
                g3Var.f2694c = objValueOf;
                return iK;
            case 14:
                return h3.g(p6.a().b(cls), bArr, i, i2, g3Var);
            case 15:
                iK = h3.i(bArr, i, g3Var);
                iC = w3.c(g3Var.a);
                objValueOf = Integer.valueOf(iC);
                g3Var.f2694c = objValueOf;
                return iK;
            case 16:
                iK = h3.k(bArr, i, g3Var);
                jA = w3.a(g3Var.f2693b);
                objValueOf = Long.valueOf(jA);
                g3Var.f2694c = objValueOf;
                return iK;
            case 17:
                return h3.p(bArr, i, g3Var);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> d.b.a.a.e.e.e6<T> q(java.lang.Class<T> r33, d.b.a.a.e.e.x5 r34, d.b.a.a.e.e.i6 r35, d.b.a.a.e.e.j5 r36, d.b.a.a.e.e.l7<?, ?> r37, d.b.a.a.e.e.g4<?> r38, d.b.a.a.e.e.w5 r39) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.a.a.e.e.e6.q(java.lang.Class, d.b.a.a.e.e.x5, d.b.a.a.e.e.i6, d.b.a.a.e.e.j5, d.b.a.a.e.e.l7, d.b.a.a.e.e.g4, d.b.a.a.e.e.w5):d.b.a.a.e.e.e6");
    }

    private final s6 r(int i) {
        int i2 = (i / 3) << 1;
        s6 s6Var = (s6) this.f2672b[i2];
        if (s6Var != null) {
            return s6Var;
        }
        s6<T> s6VarB = p6.a().b((Class) this.f2672b[i2 + 1]);
        this.f2672b[i2] = s6VarB;
        return s6VarB;
    }

    private final <K, V, UT, UB> UB s(int i, int i2, Map<K, V> map, v4 v4Var, UB ub, l7<UT, UB> l7Var) {
        u5<?, ?> u5VarE = this.p.e(G(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!v4Var.f(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = l7Var.a();
                }
                s3 s3VarS = l3.s(r5.a(u5VarE, next.getKey(), next.getValue()));
                try {
                    r5.b(s3VarS.b(), u5VarE, next.getKey(), next.getValue());
                    l7Var.c(ub, i2, s3VarS.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private final <UT, UB> UB t(Object obj, int i, UB ub, l7<UT, UB> l7Var) {
        v4 v4VarM;
        int i2 = this.a[i];
        Object objF = r7.F(obj, O(i) & 1048575);
        return (objF == null || (v4VarM = M(i)) == null) ? ub : (UB) s(i, i2, this.p.b(objF), v4VarM, ub, l7Var);
    }

    private static Field u(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString());
        }
    }

    private static List<?> v(Object obj, long j) {
        return (List) r7.F(obj, j);
    }

    private static void w(int i, Object obj, f8 f8Var) {
        if (obj instanceof String) {
            f8Var.z(i, (String) obj);
        } else {
            f8Var.B(i, (l3) obj);
        }
    }

    private static <UT, UB> void x(l7<UT, UB> l7Var, T t, f8 f8Var) {
        l7Var.d(l7Var.f(t), f8Var);
    }

    private final <K, V> void y(f8 f8Var, int i, Object obj, int i2) {
        if (obj != null) {
            f8Var.k(i, this.p.e(G(i2)), this.p.d(obj));
        }
    }

    private final void z(T t, T t2, int i) {
        long jO = O(i) & 1048575;
        if (A(t2, i)) {
            Object objF = r7.F(t, jO);
            Object objF2 = r7.F(t2, jO);
            if (objF != null && objF2 != null) {
                r7.j(t, jO, u4.e(objF, objF2));
                H(t, i);
            } else if (objF2 != null) {
                r7.j(t, jO, objF2);
                H(t, i);
            }
        }
    }

    @Override // d.b.a.a.e.e.s6
    public final T a() {
        return (T) this.l.b(this.e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[PHI: r3
      0x00e2: PHI (r3v13 java.lang.Object) = (r3v11 java.lang.Object), (r3v14 java.lang.Object) binds: [B:67:0x00e0, B:62:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // d.b.a.a.e.e.s6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(T r9) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.a.a.e.e.e6.b(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01b2  */
    @Override // d.b.a.a.e.e.s6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.a.a.e.e.e6.c(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // d.b.a.a.e.e.s6
    public final void d(T t) {
        int i;
        int i2 = this.j;
        while (true) {
            i = this.k;
            if (i2 >= i) {
                break;
            }
            long jO = O(this.i[i2]) & 1048575;
            Object objF = r7.F(t, jO);
            if (objF != null) {
                r7.j(t, jO, this.p.h(objF));
            }
            i2++;
        }
        int length = this.i.length;
        while (i < length) {
            this.m.d(t, this.i[i]);
            i++;
        }
        this.n.j(t);
        if (this.f) {
            this.o.g(t);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0416, code lost:
    
        if (B(r20, r15, r3) != false) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0436, code lost:
    
        if (B(r20, r15, r3) != false) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x043e, code lost:
    
        if (B(r20, r15, r3) != false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x045e, code lost:
    
        if (B(r20, r15, r3) != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0466, code lost:
    
        if (B(r20, r15, r3) != false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x047e, code lost:
    
        if (B(r20, r15, r3) != false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x06b6, code lost:
    
        if ((r12 & r18) != 0) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x06b8, code lost:
    
        r4 = d.b.a.a.e.e.y3.V(r15, (d.b.a.a.e.e.z5) r2.getObject(r20, r10), r(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x06e3, code lost:
    
        if ((r12 & r18) != 0) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x06e5, code lost:
    
        r4 = d.b.a.a.e.e.y3.v0(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x06ee, code lost:
    
        if ((r12 & r18) != 0) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x06f0, code lost:
    
        r9 = d.b.a.a.e.e.y3.B0(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0713, code lost:
    
        if ((r12 & r18) != 0) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0715, code lost:
    
        r4 = r2.getObject(r20, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0722, code lost:
    
        if ((r12 & r18) != 0) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0724, code lost:
    
        r4 = d.b.a.a.e.e.u6.a(r15, r2.getObject(r20, r10), r(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0749, code lost:
    
        if ((r12 & r18) != 0) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x074b, code lost:
    
        r4 = d.b.a.a.e.e.y3.H(r15, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x020d A[PHI: r5
      0x020d: PHI (r5v83 int) = 
      (r5v46 int)
      (r5v49 int)
      (r5v52 int)
      (r5v55 int)
      (r5v58 int)
      (r5v61 int)
      (r5v64 int)
      (r5v67 int)
      (r5v70 int)
      (r5v73 int)
      (r5v76 int)
      (r5v79 int)
      (r5v82 int)
      (r5v87 int)
     binds: [B:141:0x020b, B:136:0x01fa, B:131:0x01e9, B:126:0x01d8, B:121:0x01c7, B:116:0x01b6, B:111:0x01a5, B:106:0x0193, B:101:0x0181, B:96:0x016f, B:91:0x015d, B:86:0x014b, B:81:0x0139, B:76:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x030a A[PHI: r5
      0x030a: PHI (r5v106 java.lang.Object) = (r5v24 java.lang.Object), (r5v104 java.lang.Object), (r5v108 java.lang.Object) binds: [B:193:0x0331, B:45:0x00ab, B:185:0x0306] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0334 A[PHI: r5
      0x0334: PHI (r5v102 java.lang.Object) = (r5v24 java.lang.Object), (r5v104 java.lang.Object) binds: [B:193:0x0331, B:45:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x05fc A[PHI: r4
      0x05fc: PHI (r4v110 int) = 
      (r4v73 int)
      (r4v76 int)
      (r4v79 int)
      (r4v82 int)
      (r4v85 int)
      (r4v88 int)
      (r4v91 int)
      (r4v94 int)
      (r4v97 int)
      (r4v100 int)
      (r4v103 int)
      (r4v106 int)
      (r4v109 int)
      (r4v114 int)
     binds: [B:373:0x05fa, B:368:0x05e9, B:363:0x05d8, B:358:0x05c7, B:353:0x05b6, B:348:0x05a5, B:343:0x0594, B:338:0x0582, B:333:0x0570, B:328:0x055e, B:323:0x054c, B:318:0x053a, B:313:0x0528, B:308:0x0516] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x06ac A[PHI: r5
      0x06ac: PHI (r5v4 int) = 
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v13 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v14 int)
      (r5v1 int)
     binds: [B:245:0x040d, B:435:0x0753, B:432:0x0749, B:426:0x0734, B:423:0x0722, B:419:0x0713, B:415:0x0706, B:411:0x06f9, B:407:0x06ee, B:404:0x06e3, B:400:0x06d6, B:396:0x06c9, B:393:0x06b6, B:371:0x05f6, B:366:0x05e5, B:361:0x05d4, B:356:0x05c3, B:351:0x05b2, B:346:0x05a1, B:341:0x0590, B:336:0x057e, B:331:0x056c, B:326:0x055a, B:321:0x0548, B:316:0x0536, B:311:0x0524, B:306:0x0512, B:301:0x04de, B:298:0x04d1, B:295:0x04c1, B:292:0x04b1, B:289:0x04a1, B:286:0x0493, B:283:0x0486, B:280:0x047e, B:275:0x046e, B:272:0x0466, B:269:0x045e, B:266:0x0452, B:263:0x0446, B:409:0x06f5, B:260:0x043e, B:257:0x0436, B:254:0x042a, B:251:0x041e, B:389:0x06ab, B:248:0x0416] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0719 A[PHI: r4
      0x0719: PHI (r4v145 java.lang.Object) = (r4v19 java.lang.Object), (r4v141 java.lang.Object), (r4v148 java.lang.Object) binds: [B:428:0x073c, B:277:0x0476, B:420:0x0715] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x073f A[PHI: r4
      0x073f: PHI (r4v137 java.lang.Object) = (r4v19 java.lang.Object), (r4v141 java.lang.Object) binds: [B:428:0x073c, B:277:0x0476] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // d.b.a.a.e.e.s6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(T r20) {
        /*
            Method dump skipped, instructions count: 2360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.a.a.e.e.e6.e(java.lang.Object):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [d.b.a.a.e.e.s6] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [d.b.a.a.e.e.s6] */
    @Override // d.b.a.a.e.e.s6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(T r19) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.a.a.e.e.e6.f(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // d.b.a.a.e.e.s6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(T r7, T r8) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.a.a.e.e.e6.g(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // d.b.a.a.e.e.s6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(T r13, d.b.a.a.e.e.f8 r14) {
        /*
            Method dump skipped, instructions count: 2538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.a.a.e.e.e6.h(java.lang.Object, d.b.a.a.e.e.f8):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x02c6, code lost:
    
        if (r0 == r5) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02ca, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r18;
        r1 = r25;
        r6 = r27;
        r7 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x030d, code lost:
    
        if (r0 == r15) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x032e, code lost:
    
        if (r0 == r15) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0330, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0095. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    @Override // d.b.a.a.e.e.s6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(T r31, byte[] r32, int r33, int r34, d.b.a.a.e.e.g3 r35) throws d.b.a.a.e.e.y4 {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.a.a.e.e.e6.i(java.lang.Object, byte[], int, int, d.b.a.a.e.e.g3):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x04c0, code lost:
    
        if (r6 == 1048575) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x04c2, code lost:
    
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x04c8, code lost:
    
        r1 = null;
        r2 = r9.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04cd, code lost:
    
        if (r2 >= r9.k) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04cf, code lost:
    
        r1 = (d.b.a.a.e.e.k7) r9.t(r12, r9.i[r2], r1, r9.n);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04de, code lost:
    
        if (r1 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04e0, code lost:
    
        r9.n.h(r12, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04e7, code lost:
    
        if (r7 != 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04e9, code lost:
    
        if (r0 != r31) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04f0, code lost:
    
        throw d.b.a.a.e.e.y4.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04f1, code lost:
    
        if (r0 > r31) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04f3, code lost:
    
        if (r3 != r7) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04f5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04fb, code lost:
    
        throw d.b.a.a.e.e.y4.e();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int o(T r28, byte[] r29, int r30, int r31, int r32, d.b.a.a.e.e.g3 r33) throws d.b.a.a.e.e.y4 {
        /*
            Method dump skipped, instructions count: 1318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.a.a.e.e.e6.o(java.lang.Object, byte[], int, int, int, d.b.a.a.e.e.g3):int");
    }
}
