package d.b.a.a.e.e;

/* loaded from: classes.dex */
public final class w9 implements x9 {
    private static final z1<Boolean> a;

    static {
        g2 g2Var = new g2(a2.a("com.google.android.gms.measurement"));
        a = g2Var.d("measurement.sdk.referrer.delayed_install_referrer_api", false);
        g2Var.b("measurement.id.sdk.referrer.delayed_install_referrer_api", 0L);
    }

    @Override // d.b.a.a.e.e.x9
    public final boolean a() {
        return true;
    }

    @Override // d.b.a.a.e.e.x9
    public final boolean b() {
        return a.n().booleanValue();
    }
}
