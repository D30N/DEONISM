package d.b.a.a.e.e;

/* loaded from: classes.dex */
final class i4 {
    private static final g4<?> a = new f4();

    /* renamed from: b, reason: collision with root package name */
    private static final g4<?> f2717b = c();

    static g4<?> a() {
        return a;
    }

    static g4<?> b() {
        g4<?> g4Var = f2717b;
        if (g4Var != null) {
            return g4Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static g4<?> c() {
        try {
            return (g4) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
