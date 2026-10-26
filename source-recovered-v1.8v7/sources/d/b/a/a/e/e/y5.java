package d.b.a.a.e.e;

/* loaded from: classes.dex */
final class y5 {
    private static final w5 a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final w5 f2888b = new v5();

    static w5 a() {
        return a;
    }

    static w5 b() {
        return f2888b;
    }

    private static w5 c() {
        try {
            return (w5) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
