package d.a.b.e;

/* loaded from: classes.dex */
public class a {
    private static c a = b.k();

    public static void A(String str, String str2) {
        if (a.b(6)) {
            a.f(str, str2);
        }
    }

    public static void B(String str, String str2, Object... objArr) {
        if (a.b(6)) {
            a.f(str, k(str2, objArr));
        }
    }

    public static void a(Class<?> cls, String str, Object obj) {
        if (a.b(3)) {
            a.j(l(cls), k(str, obj));
        }
    }

    public static void b(String str, String str2) {
        if (a.b(3)) {
            a.j(str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        if (a.b(3)) {
            a.c(str, str2, th);
        }
    }

    public static void d(Class<?> cls, String str) {
        if (a.b(6)) {
            a.d(l(cls), str);
        }
    }

    public static void e(Class<?> cls, String str, Throwable th) {
        if (a.b(6)) {
            a.g(l(cls), str, th);
        }
    }

    public static void f(Class<?> cls, String str, Object... objArr) {
        if (a.b(6)) {
            a.d(l(cls), k(str, objArr));
        }
    }

    public static void g(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (a.b(6)) {
            a.g(l(cls), k(str, objArr), th);
        }
    }

    public static void h(String str, String str2) {
        if (a.b(6)) {
            a.d(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (a.b(6)) {
            a.g(str, str2, th);
        }
    }

    public static void j(String str, String str2, Object... objArr) {
        if (a.b(6)) {
            a.d(str, k(str2, objArr));
        }
    }

    private static String k(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    private static String l(Class<?> cls) {
        return cls.getSimpleName();
    }

    public static boolean m(int i) {
        return a.b(i);
    }

    public static void n(Class<?> cls, String str) {
        if (a.b(2)) {
            a.e(l(cls), str);
        }
    }

    public static void o(Class<?> cls, String str, Object obj) {
        if (a.b(2)) {
            a.e(l(cls), k(str, obj));
        }
    }

    public static void p(Class<?> cls, String str, Object obj, Object obj2) {
        if (a.b(2)) {
            a.e(l(cls), k(str, obj, obj2));
        }
    }

    public static void q(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (m(2)) {
            n(cls, k(str, obj, obj2, obj3));
        }
    }

    public static void r(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (a.b(2)) {
            a.e(l(cls), k(str, obj, obj2, obj3, obj4));
        }
    }

    public static void s(Class<?> cls, String str, Object... objArr) {
        if (a.b(2)) {
            a.e(l(cls), k(str, objArr));
        }
    }

    public static void t(String str, String str2, Object... objArr) {
        if (a.b(2)) {
            a.e(str, k(str2, objArr));
        }
    }

    public static void u(Class<?> cls, String str) {
        if (a.b(5)) {
            a.i(l(cls), str);
        }
    }

    public static void v(Class<?> cls, String str, Throwable th) {
        if (a.b(5)) {
            a.a(l(cls), str, th);
        }
    }

    public static void w(Class<?> cls, String str, Object... objArr) {
        if (a.b(5)) {
            a.i(l(cls), k(str, objArr));
        }
    }

    public static void x(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (m(5)) {
            v(cls, k(str, objArr), th);
        }
    }

    public static void y(String str, String str2, Object... objArr) {
        if (a.b(5)) {
            a.i(str, k(str2, objArr));
        }
    }

    public static void z(Class<?> cls, String str, Throwable th) {
        if (a.b(6)) {
            a.h(l(cls), str, th);
        }
    }
}
