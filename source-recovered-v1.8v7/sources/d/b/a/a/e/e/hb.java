package d.b.a.a.e.e;

/* loaded from: classes.dex */
public final class hb implements ib {
    private static final z1<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final z1<Boolean> f2715b;

    /* renamed from: c, reason: collision with root package name */
    private static final z1<Boolean> f2716c;

    static {
        g2 g2Var = new g2(a2.a("com.google.android.gms.measurement"));
        g2Var.b("measurement.id.lifecycle.app_in_background_parameter", 0L);
        a = g2Var.d("measurement.lifecycle.app_backgrounded_engagement", false);
        f2715b = g2Var.d("measurement.lifecycle.app_backgrounded_tracking", true);
        f2716c = g2Var.d("measurement.lifecycle.app_in_background_parameter", false);
        g2Var.b("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // d.b.a.a.e.e.ib
    public final boolean a() {
        return a.n().booleanValue();
    }

    @Override // d.b.a.a.e.e.ib
    public final boolean b() {
        return f2715b.n().booleanValue();
    }

    @Override // d.b.a.a.e.e.ib
    public final boolean c() {
        return f2716c.n().booleanValue();
    }
}
