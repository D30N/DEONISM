package d.b.a.a.e.e;

/* loaded from: classes.dex */
public final class gb implements db {
    private static final z1<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final z1<Boolean> f2703b;

    /* renamed from: c, reason: collision with root package name */
    private static final z1<Boolean> f2704c;

    /* renamed from: d, reason: collision with root package name */
    private static final z1<Boolean> f2705d;

    static {
        g2 g2Var = new g2(a2.a("com.google.android.gms.measurement"));
        a = g2Var.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f2703b = g2Var.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        f2704c = g2Var.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f2705d = g2Var.d("measurement.sdk.collection.last_gclid_from_referrer2", false);
        g2Var.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // d.b.a.a.e.e.db
    public final boolean a() {
        return a.n().booleanValue();
    }

    @Override // d.b.a.a.e.e.db
    public final boolean b() {
        return f2703b.n().booleanValue();
    }

    @Override // d.b.a.a.e.e.db
    public final boolean c() {
        return f2704c.n().booleanValue();
    }

    @Override // d.b.a.a.e.e.db
    public final boolean d() {
        return f2705d.n().booleanValue();
    }
}
