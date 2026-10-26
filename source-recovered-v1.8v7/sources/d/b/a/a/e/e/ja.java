package d.b.a.a.e.e;

/* loaded from: classes.dex */
public final class ja implements ka {
    private static final z1<Boolean> a;

    static {
        g2 g2Var = new g2(a2.a("com.google.android.gms.measurement"));
        a = g2Var.d("measurement.client.sessions.check_on_reset_and_enable2", true);
        g2Var.d("measurement.client.sessions.check_on_startup", true);
        g2Var.d("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // d.b.a.a.e.e.ka
    public final boolean a() {
        return true;
    }

    @Override // d.b.a.a.e.e.ka
    public final boolean b() {
        return a.n().booleanValue();
    }
}
