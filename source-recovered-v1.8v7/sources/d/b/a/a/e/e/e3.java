package d.b.a.a.e.e;

/* loaded from: classes.dex */
final class e3 {
    private static final Class<?> a = a("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f2667b;

    static {
        f2667b = a("org.robolectric.Robolectric") != null;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean b() {
        return (a == null || f2667b) ? false : true;
    }

    static Class<?> c() {
        return a;
    }
}
