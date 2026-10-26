package d.b.a.a.e.e;

/* loaded from: classes.dex */
public final class ab implements xa {
    private static final z1<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final z1<Boolean> f2638b;

    /* renamed from: c, reason: collision with root package name */
    private static final z1<Boolean> f2639c;

    static {
        g2 g2Var = new g2(a2.a("com.google.android.gms.measurement"));
        a = g2Var.d("measurement.client.global_params.dev", false);
        f2638b = g2Var.d("measurement.service.global_params_in_payload", true);
        f2639c = g2Var.d("measurement.service.global_params", false);
    }

    @Override // d.b.a.a.e.e.xa
    public final boolean a() {
        return true;
    }

    @Override // d.b.a.a.e.e.xa
    public final boolean b() {
        return a.n().booleanValue();
    }

    @Override // d.b.a.a.e.e.xa
    public final boolean c() {
        return f2638b.n().booleanValue();
    }

    @Override // d.b.a.a.e.e.xa
    public final boolean d() {
        return f2639c.n().booleanValue();
    }
}
