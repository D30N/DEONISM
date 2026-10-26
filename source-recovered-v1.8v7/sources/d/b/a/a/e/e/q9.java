package d.b.a.a.e.e;

/* loaded from: classes.dex */
public final class q9 implements r9 {
    private static final z1<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final z1<Boolean> f2813b;

    /* renamed from: c, reason: collision with root package name */
    private static final z1<Boolean> f2814c;

    /* renamed from: d, reason: collision with root package name */
    private static final z1<Boolean> f2815d;

    static {
        g2 g2Var = new g2(a2.a("com.google.android.gms.measurement"));
        a = g2Var.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f2813b = g2Var.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f2814c = g2Var.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f2815d = g2Var.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // d.b.a.a.e.e.r9
    public final boolean a() {
        return true;
    }

    @Override // d.b.a.a.e.e.r9
    public final boolean b() {
        return a.n().booleanValue();
    }

    @Override // d.b.a.a.e.e.r9
    public final boolean c() {
        return f2813b.n().booleanValue();
    }

    @Override // d.b.a.a.e.e.r9
    public final boolean d() {
        return f2814c.n().booleanValue();
    }

    @Override // d.b.a.a.e.e.r9
    public final boolean e() {
        return f2815d.n().booleanValue();
    }
}
