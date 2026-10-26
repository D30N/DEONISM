package d.b.a.a.e.e;

/* loaded from: classes.dex */
public enum a5 {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(l3.class, l3.class, l3.f2755c),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);


    /* renamed from: b, reason: collision with root package name */
    private final Class<?> f2632b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f2633c;

    a5(Class cls, Class cls2, Object obj) {
        this.f2632b = cls2;
        this.f2633c = obj;
    }

    public final Class<?> f() {
        return this.f2632b;
    }
}
