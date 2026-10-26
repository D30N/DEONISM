package d.b.a.a.e.e;

/* loaded from: classes.dex */
public final class r8 implements s8 {
    private static final z1<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final z1<Long> f2827b;

    static {
        g2 g2Var = new g2(a2.a("com.google.android.gms.measurement"));
        a = g2Var.d("measurement.sdk.attribution.cache", true);
        f2827b = g2Var.b("measurement.sdk.attribution.cache.ttl", 604800000L);
    }

    @Override // d.b.a.a.e.e.s8
    public final boolean a() {
        return a.n().booleanValue();
    }

    @Override // d.b.a.a.e.e.s8
    public final long b() {
        return f2827b.n().longValue();
    }
}
