package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;

/* loaded from: classes.dex */
final class p4 implements a6 {
    private static final p4 a = new p4();

    private p4() {
    }

    public static p4 c() {
        return a;
    }

    @Override // d.b.a.a.e.e.a6
    public final boolean a(Class<?> cls) {
        return r4.class.isAssignableFrom(cls);
    }

    @Override // d.b.a.a.e.e.a6
    public final x5 b(Class<?> cls) {
        if (!r4.class.isAssignableFrom(cls)) {
            String strValueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unsupported message type: ".concat(strValueOf) : new String("Unsupported message type: "));
        }
        try {
            return (x5) r4.r(cls.asSubclass(r4.class)).u(r4.f.f2822c, null, null);
        } catch (Exception e) {
            String strValueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(strValueOf2.length() != 0 ? "Unable to get message info for ".concat(strValueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
