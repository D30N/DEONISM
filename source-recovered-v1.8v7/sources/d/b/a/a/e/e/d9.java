package d.b.a.a.e.e;

/* loaded from: classes.dex */
public final class d9 implements e9 {
    private static final z1<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final z1<Boolean> f2659b;

    /* renamed from: c, reason: collision with root package name */
    private static final z1<Boolean> f2660c;

    /* renamed from: d, reason: collision with root package name */
    private static final z1<Boolean> f2661d;
    private static final z1<Boolean> e;
    private static final z1<Boolean> f;

    static {
        g2 g2Var = new g2(a2.a("com.google.android.gms.measurement"));
        a = g2Var.d("measurement.gold.enhanced_ecommerce.format_logs", true);
        f2659b = g2Var.d("measurement.gold.enhanced_ecommerce.log_nested_complex_events", true);
        f2660c = g2Var.d("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", true);
        f2661d = g2Var.d("measurement.gold.enhanced_ecommerce.updated_schema.client", true);
        e = g2Var.d("measurement.gold.enhanced_ecommerce.updated_schema.service", true);
        f = g2Var.d("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", true);
    }

    @Override // d.b.a.a.e.e.e9
    public final boolean a() {
        return true;
    }

    @Override // d.b.a.a.e.e.e9
    public final boolean b() {
        return a.n().booleanValue();
    }

    @Override // d.b.a.a.e.e.e9
    public final boolean c() {
        return f2659b.n().booleanValue();
    }

    @Override // d.b.a.a.e.e.e9
    public final boolean d() {
        return f2660c.n().booleanValue();
    }

    @Override // d.b.a.a.e.e.e9
    public final boolean e() {
        return f2661d.n().booleanValue();
    }

    @Override // d.b.a.a.e.e.e9
    public final boolean g() {
        return e.n().booleanValue();
    }

    @Override // d.b.a.a.e.e.e9
    public final boolean l() {
        return f.n().booleanValue();
    }
}
