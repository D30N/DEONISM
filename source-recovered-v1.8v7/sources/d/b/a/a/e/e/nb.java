package d.b.a.a.e.e;

/* loaded from: classes.dex */
public final class nb implements ob {
    private static final z1<Long> a;

    static {
        g2 g2Var = new g2(a2.a("com.google.android.gms.measurement"));
        g2Var.b("measurement.id.max_bundles_per_iteration", 0L);
        a = g2Var.b("measurement.max_bundles_per_iteration", 2L);
    }

    @Override // d.b.a.a.e.e.ob
    public final long a() {
        return a.n().longValue();
    }
}
