package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class p7 extends f5 {

    /* renamed from: c, reason: collision with root package name */
    private volatile q7 f1841c;

    /* renamed from: d, reason: collision with root package name */
    private q7 f1842d;
    protected q7 e;
    private final Map<Activity, q7> f;
    private Activity g;
    private volatile boolean h;
    private volatile q7 i;
    private q7 j;
    private boolean k;
    private final Object l;
    private String m;

    public p7(d5 d5Var) {
        super(d5Var);
        this.l = new Object();
        this.f = new ConcurrentHashMap();
    }

    static /* synthetic */ q7 D(p7 p7Var, q7 q7Var) {
        p7Var.j = null;
        return null;
    }

    private static String F(String str) {
        String[] strArrSplit = str.split("\\.");
        String str2 = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    private final void I(Activity activity, q7 q7Var, boolean z) {
        q7 q7Var2;
        q7 q7Var3 = this.f1841c == null ? this.f1842d : this.f1841c;
        if (q7Var.f1855b == null) {
            q7Var2 = new q7(q7Var.a, activity != null ? F(activity.getClass().getCanonicalName()) : null, q7Var.f1856c, q7Var.e);
        } else {
            q7Var2 = q7Var;
        }
        this.f1842d = this.f1841c;
        this.f1841c = q7Var2;
        j().z(new r7(this, q7Var2, q7Var3, k().b(), z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(Bundle bundle, q7 q7Var, q7 q7Var2, long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        Q(q7Var, q7Var2, j, true, g().C(null, "screen_view", bundle, null, true, true));
    }

    public static void P(q7 q7Var, Bundle bundle, boolean z) {
        if (bundle == null || q7Var == null || (bundle.containsKey("_sc") && !z)) {
            if (bundle != null && q7Var == null && z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = q7Var.a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = q7Var.f1855b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", q7Var.f1856c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(q7 q7Var, q7 q7Var2, long j, boolean z, Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z2;
        q7 q7Var3;
        c();
        if (n().t(r.U)) {
            z2 = z && this.e != null;
            if (z2) {
                R(this.e, true, j);
            }
        } else {
            if (z && (q7Var3 = this.e) != null) {
                R(q7Var3, true, j);
            }
            z2 = false;
        }
        if ((q7Var2 != null && q7Var2.f1856c == q7Var.f1856c && z9.A0(q7Var2.f1855b, q7Var.f1855b) && z9.A0(q7Var2.a, q7Var.a)) ? false : true) {
            Bundle bundle2 = new Bundle();
            if (n().t(r.D0)) {
                bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            }
            P(q7Var, bundle2, true);
            if (q7Var2 != null) {
                String str = q7Var2.a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = q7Var2.f1855b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", q7Var2.f1856c);
            }
            if (n().t(r.U) && z2) {
                long jC = (d.b.a.a.e.e.ma.b() && n().t(r.W) && d.b.a.a.e.e.z9.b() && n().t(r.A0)) ? v().C(j) : v().e.e();
                if (jC > 0) {
                    g().L(bundle2, jC);
                }
            }
            String str3 = "auto";
            if (n().t(r.D0)) {
                if (!n().L().booleanValue()) {
                    bundle2.putLong("_mt", 1L);
                }
                if (q7Var.e) {
                    str3 = "app";
                }
            }
            q().r0(str3, "_vs", bundle2);
        }
        this.e = q7Var;
        if (n().t(r.D0) && q7Var.e) {
            this.j = q7Var;
        }
        s().O(q7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(q7 q7Var, boolean z, long j) {
        p().w(k().b());
        if (!v().F(q7Var != null && q7Var.f1857d, z, j) || q7Var == null) {
            return;
        }
        q7Var.f1857d = false;
    }

    private final q7 X(Activity activity) {
        com.google.android.gms.common.internal.q.k(activity);
        q7 q7Var = this.f.get(activity);
        if (q7Var == null) {
            q7 q7Var2 = new q7(null, F(activity.getClass().getCanonicalName()), g().E0());
            this.f.put(activity, q7Var2);
            q7Var = q7Var2;
        }
        return (n().t(r.D0) && this.i != null) ? this.i : q7Var;
    }

    @Override // com.google.android.gms.measurement.internal.f5
    protected final boolean B() {
        return false;
    }

    public final q7 E(boolean z) {
        y();
        c();
        if (!n().t(r.D0) || !z) {
            return this.e;
        }
        q7 q7Var = this.e;
        return q7Var != null ? q7Var : this.j;
    }

    public final void G(Activity activity) {
        if (n().t(r.D0)) {
            synchronized (this.l) {
                this.k = true;
                if (activity != this.g) {
                    synchronized (this.l) {
                        this.g = activity;
                        this.h = false;
                    }
                    if (n().t(r.C0) && n().L().booleanValue()) {
                        this.i = null;
                        j().z(new v7(this));
                    }
                }
            }
        }
        if (n().t(r.C0) && !n().L().booleanValue()) {
            this.f1841c = this.i;
            j().z(new u7(this));
        } else {
            I(activity, X(activity), false);
            a aVarP = p();
            aVarP.j().z(new e3(aVarP, aVarP.k().b()));
        }
    }

    public final void H(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!n().L().booleanValue() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f.put(activity, new q7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void J(Activity activity, String str, String str2) {
        if (!n().L().booleanValue()) {
            m().L().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        if (this.f1841c == null) {
            m().L().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f.get(activity) == null) {
            m().L().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = F(activity.getClass().getCanonicalName());
        }
        boolean zA0 = z9.A0(this.f1841c.f1855b, str2);
        boolean zA02 = z9.A0(this.f1841c.a, str);
        if (zA0 && zA02) {
            m().L().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > 100)) {
            m().L().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > 100)) {
            m().L().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        m().O().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        q7 q7Var = new q7(str, str2, g().E0());
        this.f.put(activity, q7Var);
        I(activity, q7Var, true);
    }

    public final void K(Bundle bundle) {
        String str;
        if (!n().t(r.D0)) {
            m().L().a("Manual screen reporting is disabled.");
            return;
        }
        synchronized (this.l) {
            if (!this.k) {
                m().L().a("Cannot log screen view event when the app is in the background.");
                return;
            }
            String strF = null;
            if (bundle != null) {
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > 100)) {
                    m().L().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > 100)) {
                    m().L().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                } else {
                    str = string;
                    strF = string2;
                }
            } else {
                str = null;
            }
            if (strF == null) {
                strF = this.g != null ? F(this.g.getClass().getCanonicalName()) : "Activity";
            }
            String str2 = strF;
            if (this.h && this.f1841c != null) {
                this.h = false;
                boolean zA0 = z9.A0(this.f1841c.f1855b, str2);
                boolean zA02 = z9.A0(this.f1841c.a, str);
                if (zA0 && zA02) {
                    m().L().a("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            m().O().c("Logging screen view with name, class", str == null ? "null" : str, str2 == null ? "null" : str2);
            q7 q7Var = this.f1841c == null ? this.f1842d : this.f1841c;
            q7 q7Var2 = new q7(str, str2, g().E0(), true);
            this.f1841c = q7Var2;
            this.f1842d = q7Var;
            this.i = q7Var2;
            j().z(new s7(this, bundle, q7Var2, q7Var, k().b()));
        }
    }

    public final void S(String str, q7 q7Var) {
        c();
        synchronized (this) {
            if (this.m == null || this.m.equals(str) || q7Var != null) {
                this.m = str;
            }
        }
    }

    public final q7 T() {
        a();
        return this.f1841c;
    }

    public final void U(Activity activity) {
        if (n().t(r.D0)) {
            synchronized (this.l) {
                this.k = false;
                this.h = true;
            }
        }
        long jB = k().b();
        if (n().t(r.C0) && !n().L().booleanValue()) {
            this.f1841c = null;
            j().z(new t7(this, jB));
        } else {
            q7 q7VarX = X(activity);
            this.f1842d = this.f1841c;
            this.f1841c = null;
            j().z(new w7(this, q7VarX, jB));
        }
    }

    public final void V(Activity activity, Bundle bundle) {
        q7 q7Var;
        if (!n().L().booleanValue() || bundle == null || (q7Var = this.f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", q7Var.f1856c);
        bundle2.putString("name", q7Var.a);
        bundle2.putString("referrer_name", q7Var.f1855b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void W(Activity activity) {
        synchronized (this.l) {
            if (activity == this.g) {
                this.g = null;
            }
        }
        if (n().L().booleanValue()) {
            this.f.remove(activity);
        }
    }
}
