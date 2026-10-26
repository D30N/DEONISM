package d.b.a.a.e.e;

/* loaded from: classes.dex */
public final class c9 implements z8 {
    private static final z1<Boolean> a;

    static {
        g2 g2Var = new g2(a2.a("com.google.android.gms.measurement"));
        a = g2Var.d("measurement.sdk.dynamite.allow_remote_dynamite2", false);
        g2Var.d("measurement.collection.init_params_control_enabled", true);
        g2Var.d("measurement.sdk.dynamite.use_dynamite3", true);
        g2Var.b("measurement.id.sdk.dynamite.use_dynamite", 0L);
    }

    @Override // d.b.a.a.e.e.z8
    public final boolean a() {
        return a.n().booleanValue();
    }
}
