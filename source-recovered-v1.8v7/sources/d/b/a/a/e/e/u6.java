package d.b.a.a.e.e;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class u6 {
    private static final Class<?> a = F();

    /* renamed from: b, reason: collision with root package name */
    private static final l7<?, ?> f2855b = g(false);

    /* renamed from: c, reason: collision with root package name */
    private static final l7<?, ?> f2856c = g(true);

    /* renamed from: d, reason: collision with root package name */
    private static final l7<?, ?> f2857d = new n7();

    static int A(List<Long> list) {
        int iO0;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n5) {
            n5 n5Var = (n5) list;
            iO0 = 0;
            while (i < size) {
                iO0 += y3.o0(n5Var.g(i));
                i++;
            }
        } else {
            iO0 = 0;
            while (i < size) {
                iO0 += y3.o0(list.get(i).longValue());
                i++;
            }
        }
        return iO0;
    }

    public static l7<?, ?> B() {
        return f2857d;
    }

    public static void C(int i, List<Long> list, f8 f8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f8Var.c(i, list, z);
    }

    static int D(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * y3.h0(i));
    }

    static int E(List<Integer> list) {
        int iC0;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s4) {
            s4 s4Var = (s4) list;
            iC0 = 0;
            while (i < size) {
                iC0 += y3.C0(s4Var.h(i));
                i++;
            }
        } else {
            iC0 = 0;
            while (i < size) {
                iC0 += y3.C0(list.get(i).intValue());
                i++;
            }
        }
        return iC0;
    }

    private static Class<?> F() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void G(int i, List<Long> list, f8 f8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f8Var.w(i, list, z);
    }

    static int H(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return I(list) + (size * y3.h0(i));
    }

    static int I(List<Integer> list) {
        int iL0;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s4) {
            s4 s4Var = (s4) list;
            iL0 = 0;
            while (i < size) {
                iL0 += y3.l0(s4Var.h(i));
                i++;
            }
        } else {
            iL0 = 0;
            while (i < size) {
                iL0 += y3.l0(list.get(i).intValue());
                i++;
            }
        }
        return iL0;
    }

    private static Class<?> J() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void K(int i, List<Long> list, f8 f8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f8Var.q(i, list, z);
    }

    static int L(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return M(list) + (size * y3.h0(i));
    }

    static int M(List<Integer> list) {
        int iP0;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s4) {
            s4 s4Var = (s4) list;
            iP0 = 0;
            while (i < size) {
                iP0 += y3.p0(s4Var.h(i));
                i++;
            }
        } else {
            iP0 = 0;
            while (i < size) {
                iP0 += y3.p0(list.get(i).intValue());
                i++;
            }
        }
        return iP0;
    }

    public static void N(int i, List<Long> list, f8 f8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f8Var.d(i, list, z);
    }

    static int O(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return P(list) + (size * y3.h0(i));
    }

    static int P(List<Integer> list) {
        int iT0;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s4) {
            s4 s4Var = (s4) list;
            iT0 = 0;
            while (i < size) {
                iT0 += y3.t0(s4Var.h(i));
                i++;
            }
        } else {
            iT0 = 0;
            while (i < size) {
                iT0 += y3.t0(list.get(i).intValue());
                i++;
            }
        }
        return iT0;
    }

    public static void Q(int i, List<Long> list, f8 f8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f8Var.n(i, list, z);
    }

    static int R(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * y3.y0(i, 0);
    }

    static int S(List<?> list) {
        return list.size() << 2;
    }

    public static void T(int i, List<Integer> list, f8 f8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f8Var.u(i, list, z);
    }

    static int U(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * y3.r0(i, 0L);
    }

    static int V(List<?> list) {
        return list.size() << 3;
    }

    public static void W(int i, List<Integer> list, f8 f8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f8Var.A(i, list, z);
    }

    static int X(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * y3.H(i, true);
    }

    static int Y(List<?> list) {
        return list.size();
    }

    public static void Z(int i, List<Integer> list, f8 f8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f8Var.H(i, list, z);
    }

    static int a(int i, Object obj, s6 s6Var) {
        return obj instanceof i5 ? y3.c(i, (i5) obj) : y3.F(i, (z5) obj, s6Var);
    }

    public static void a0(int i, List<Integer> list, f8 f8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f8Var.v(i, list, z);
    }

    static int b(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iH0 = y3.h0(i) * size;
        if (list instanceof k5) {
            k5 k5Var = (k5) list;
            while (i2 < size) {
                Object objG = k5Var.g(i2);
                iH0 += objG instanceof l3 ? y3.I((l3) objG) : y3.K((String) objG);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iH0 += obj instanceof l3 ? y3.I((l3) obj) : y3.K((String) obj);
                i2++;
            }
        }
        return iH0;
    }

    public static void b0(int i, List<Integer> list, f8 f8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f8Var.D(i, list, z);
    }

    static int c(int i, List<?> list, s6 s6Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH0 = y3.h0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iH0 += obj instanceof i5 ? y3.d((i5) obj) : y3.e((z5) obj, s6Var);
        }
        return iH0;
    }

    public static void c0(int i, List<Integer> list, f8 f8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f8Var.y(i, list, z);
    }

    static int d(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return e(list) + (list.size() * y3.h0(i));
    }

    public static void d0(int i, List<Boolean> list, f8 f8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f8Var.i(i, list, z);
    }

    static int e(List<Long> list) {
        int iE0;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n5) {
            n5 n5Var = (n5) list;
            iE0 = 0;
            while (i < size) {
                iE0 += y3.e0(n5Var.g(i));
                i++;
            }
        } else {
            iE0 = 0;
            while (i < size) {
                iE0 += y3.e0(list.get(i).longValue());
                i++;
            }
        }
        return iE0;
    }

    public static l7<?, ?> f() {
        return f2855b;
    }

    private static l7<?, ?> g(boolean z) {
        try {
            Class<?> clsJ = J();
            if (clsJ == null) {
                return null;
            }
            return (l7) clsJ.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB h(int i, int i2, UB ub, l7<UT, UB> l7Var) {
        if (ub == null) {
            ub = l7Var.a();
        }
        l7Var.b(ub, i, i2);
        return ub;
    }

    static <UT, UB> UB i(int i, List<Integer> list, v4 v4Var, UB ub, l7<UT, UB> l7Var) {
        if (v4Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = list.get(i3).intValue();
                if (v4Var.f(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    ub = (UB) h(i, iIntValue, ub, l7Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!v4Var.f(iIntValue2)) {
                    ub = (UB) h(i, iIntValue2, ub, l7Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void j(int i, List<String> list, f8 f8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f8Var.I(i, list);
    }

    public static void k(int i, List<?> list, f8 f8Var, s6 s6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f8Var.j(i, list, s6Var);
    }

    public static void l(int i, List<Double> list, f8 f8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f8Var.h(i, list, z);
    }

    static <T, FT extends j4<FT>> void m(g4<FT> g4Var, T t, T t2) {
        h4<T> h4VarB = g4Var.b(t2);
        if (h4VarB.a.isEmpty()) {
            return;
        }
        g4Var.f(t).g(h4VarB);
    }

    static <T> void n(w5 w5Var, T t, T t2, long j) {
        r7.j(t, j, w5Var.c(r7.F(t, j), r7.F(t2, j)));
    }

    static <T, UT, UB> void o(l7<UT, UB> l7Var, T t, T t2) {
        l7Var.e(t, l7Var.i(l7Var.f(t), l7Var.f(t2)));
    }

    public static void p(Class<?> cls) {
        Class<?> cls2;
        if (!r4.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int r(int i, List<l3> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH0 = size * y3.h0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iH0 += y3.I(list.get(i2));
        }
        return iH0;
    }

    static int s(int i, List<z5> list, s6 s6Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iV += y3.V(i, list.get(i2), s6Var);
        }
        return iV;
    }

    static int t(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return u(list) + (size * y3.h0(i));
    }

    static int u(List<Long> list) {
        int iJ0;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n5) {
            n5 n5Var = (n5) list;
            iJ0 = 0;
            while (i < size) {
                iJ0 += y3.j0(n5Var.g(i));
                i++;
            }
        } else {
            iJ0 = 0;
            while (i < size) {
                iJ0 += y3.j0(list.get(i).longValue());
                i++;
            }
        }
        return iJ0;
    }

    public static l7<?, ?> v() {
        return f2856c;
    }

    public static void w(int i, List<l3> list, f8 f8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f8Var.l(i, list);
    }

    public static void x(int i, List<?> list, f8 f8Var, s6 s6Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f8Var.F(i, list, s6Var);
    }

    public static void y(int i, List<Float> list, f8 f8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f8Var.x(i, list, z);
    }

    static int z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return A(list) + (size * y3.h0(i));
    }
}
