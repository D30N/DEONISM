package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class c4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f1647b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f1648c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ Object f1649d;
    private final /* synthetic */ Object e;
    private final /* synthetic */ Object f;
    private final /* synthetic */ z3 g;

    c4(z3 z3Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.g = z3Var;
        this.f1647b = i;
        this.f1648c = str;
        this.f1649d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z3 z3Var;
        char c2;
        m4 m4VarA = this.g.a.A();
        if (!m4VarA.t()) {
            this.g.A(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.g.f1967c == 0) {
            if (this.g.n().F()) {
                z3Var = this.g;
                z3Var.h();
                c2 = 'C';
            } else {
                z3Var = this.g;
                z3Var.h();
                c2 = 'c';
            }
            z3Var.f1967c = c2;
        }
        if (this.g.f1968d < 0) {
            z3 z3Var2 = this.g;
            z3Var2.f1968d = z3Var2.n().D();
        }
        char cCharAt = "01VDIWEA?".charAt(this.f1647b);
        char c3 = this.g.f1967c;
        long j = this.g.f1968d;
        String strZ = z3.z(true, this.f1648c, this.f1649d, this.e, this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(strZ).length() + 24);
        sb.append("2");
        sb.append(cCharAt);
        sb.append(c3);
        sb.append(j);
        sb.append(":");
        sb.append(strZ);
        String string = sb.toString();
        if (string.length() > 1024) {
            string = this.f1648c.substring(0, 1024);
        }
        m4VarA.f1788d.b(string, 1L);
    }
}
