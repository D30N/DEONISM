package d.b.a.a.e.e;

/* loaded from: classes.dex */
public final class l8 implements m8 {
    private static final z1<Boolean> a;

    static {
        g2 g2Var = new g2(a2.a("com.google.android.gms.measurement"));
        a = g2Var.d("measurement.androidId.delete_feature", true);
        g2Var.d("measurement.log_androidId_enabled", false);
    }

    @Override // d.b.a.a.e.e.m8
    public final boolean a() {
        return a.n().booleanValue();
    }
}
