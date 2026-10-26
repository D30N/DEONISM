package d.b.a.a.e.e;

/* loaded from: classes.dex */
public final class pa implements qa {
    private static final z1<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final z1<Boolean> f2802b;

    static {
        g2 g2Var = new g2(a2.a("com.google.android.gms.measurement"));
        a = g2Var.d("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f2802b = g2Var.d("measurement.collection.redundant_engagement_removal_enabled", false);
        g2Var.b("measurement.id.collection.redundant_engagement_removal_enabled", 0L);
    }

    @Override // d.b.a.a.e.e.qa
    public final boolean a() {
        return a.n().booleanValue();
    }

    @Override // d.b.a.a.e.e.qa
    public final boolean b() {
        return f2802b.n().booleanValue();
    }
}
