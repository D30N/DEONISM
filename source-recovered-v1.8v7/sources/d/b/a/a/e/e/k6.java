package d.b.a.a.e.e;

/* loaded from: classes.dex */
final class k6 {
    private static final i6 a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final i6 f2742b = new l6();

    static i6 a() {
        return a;
    }

    static i6 b() {
        return f2742b;
    }

    private static i6 c() {
        try {
            return (i6) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
