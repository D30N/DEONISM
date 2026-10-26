package d.b.a.a.e.e;

/* loaded from: classes.dex */
public final class mb implements jb {
    private static final z1<Boolean> a;

    /* renamed from: b, reason: collision with root package name */
    private static final z1<Boolean> f2769b;

    static {
        g2 g2Var = new g2(a2.a("com.google.android.gms.measurement"));
        a = g2Var.d("measurement.sdk.screen.manual_screen_view_logging", true);
        f2769b = g2Var.d("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    @Override // d.b.a.a.e.e.jb
    public final boolean a() {
        return true;
    }

    @Override // d.b.a.a.e.e.jb
    public final boolean b() {
        return a.n().booleanValue();
    }

    @Override // d.b.a.a.e.e.jb
    public final boolean c() {
        return f2769b.n().booleanValue();
    }
}
