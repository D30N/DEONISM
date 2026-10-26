package d.b.a.a.e.e;

/* loaded from: classes.dex */
public final class x8 implements y8 {
    private static final z1<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final z1<Boolean> f2882b;

    static {
        g2 g2Var = new g2(a2.a("com.google.android.gms.measurement"));
        a = g2Var.d("measurement.service.configurable_service_limits", false);
        f2882b = g2Var.d("measurement.client.configurable_service_limits", false);
        g2Var.b("measurement.id.service.configurable_service_limits", 0L);
    }

    @Override // d.b.a.a.e.e.y8
    public final boolean a() {
        return true;
    }

    @Override // d.b.a.a.e.e.y8
    public final boolean b() {
        return a.n().booleanValue();
    }

    @Override // d.b.a.a.e.e.y8
    public final boolean c() {
        return f2882b.n().booleanValue();
    }
}
