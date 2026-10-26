package d.b.a.a.e.e;

/* loaded from: classes.dex */
public final class yb implements vb {
    private static final z1<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final z1<Double> f2895b;

    /* renamed from: c, reason: collision with root package name */
    private static final z1<Long> f2896c;

    /* renamed from: d, reason: collision with root package name */
    private static final z1<Long> f2897d;
    private static final z1<String> e;

    static {
        g2 g2Var = new g2(a2.a("com.google.android.gms.measurement"));
        a = g2Var.d("measurement.test.boolean_flag", false);
        f2895b = g2Var.a("measurement.test.double_flag", -3.0d);
        f2896c = g2Var.b("measurement.test.int_flag", -2L);
        f2897d = g2Var.b("measurement.test.long_flag", -1L);
        e = g2Var.c("measurement.test.string_flag", "---");
    }

    @Override // d.b.a.a.e.e.vb
    public final boolean a() {
        return a.n().booleanValue();
    }

    @Override // d.b.a.a.e.e.vb
    public final double b() {
        return f2895b.n().doubleValue();
    }

    @Override // d.b.a.a.e.e.vb
    public final long c() {
        return f2896c.n().longValue();
    }

    @Override // d.b.a.a.e.e.vb
    public final long d() {
        return f2897d.n().longValue();
    }

    @Override // d.b.a.a.e.e.vb
    public final String e() {
        return e.n();
    }
}
