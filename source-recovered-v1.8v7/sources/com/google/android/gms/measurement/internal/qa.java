package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import d.b.a.a.e.e.kb;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class qa extends y5 {

    /* renamed from: b, reason: collision with root package name */
    private Boolean f1863b;

    /* renamed from: c, reason: collision with root package name */
    private b f1864c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f1865d;

    qa(d5 d5Var) {
        super(d5Var);
        this.f1864c = c.a;
    }

    public static long N() {
        return r.D.a(null).longValue();
    }

    public static long O() {
        return r.f1868d.a(null).longValue();
    }

    private final Bundle S() {
        try {
            if (f().getPackageManager() == null) {
                m().G().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoC = d.b.a.a.c.n.c.a(f()).c(f().getPackageName(), 128);
            if (applicationInfoC != null) {
                return applicationInfoC.metaData;
            }
            m().G().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            m().G().b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    private final String i(String str, String str2) {
        b4 b4VarG;
        String str3;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (ClassNotFoundException e) {
            e = e;
            b4VarG = m().G();
            str3 = "Could not find SystemProperties class";
            b4VarG.b(str3, e);
            return str2;
        } catch (IllegalAccessException e2) {
            e = e2;
            b4VarG = m().G();
            str3 = "Could not access SystemProperties.get()";
            b4VarG.b(str3, e);
            return str2;
        } catch (NoSuchMethodException e3) {
            e = e3;
            b4VarG = m().G();
            str3 = "Could not find SystemProperties.get() method";
            b4VarG.b(str3, e);
            return str2;
        } catch (InvocationTargetException e4) {
            e = e4;
            b4VarG = m().G();
            str3 = "SystemProperties.get() threw an exception";
            b4VarG.b(str3, e);
            return str2;
        }
    }

    private final int p(String str, s3<Integer> s3Var, int i, int i2) {
        return Math.max(Math.min(v(str, s3Var), i2), i);
    }

    public final int A() {
        return (d.b.a.a.e.e.v8.b() && n().z(null, r.L0) && g().K0() >= 201500) ? 100 : 25;
    }

    final Boolean B(String str) {
        com.google.android.gms.common.internal.q.g(str);
        Bundle bundleS = S();
        if (bundleS == null) {
            m().G().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleS.containsKey(str)) {
            return Boolean.valueOf(bundleS.getBoolean(str));
        }
        return null;
    }

    public final boolean C(String str, s3<Boolean> s3Var) {
        return z(str, s3Var);
    }

    public final long D() {
        h();
        return 29000L;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.List<java.lang.String> E(java.lang.String r4) throws android.content.res.Resources.NotFoundException {
        /*
            r3 = this;
            com.google.android.gms.common.internal.q.g(r4)
            android.os.Bundle r0 = r3.S()
            r1 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.z3 r4 = r3.m()
            com.google.android.gms.measurement.internal.b4 r4 = r4.G()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L17:
            r4 = r1
            goto L28
        L19:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L20
            goto L17
        L20:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            android.content.Context r0 = r3.f()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r4
        L43:
            r4 = move-exception
            com.google.android.gms.measurement.internal.z3 r0 = r3.m()
            com.google.android.gms.measurement.internal.b4 r0 = r0.G()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.qa.E(java.lang.String):java.util.List");
    }

    public final boolean F() {
        if (this.f1865d == null) {
            synchronized (this) {
                if (this.f1865d == null) {
                    ApplicationInfo applicationInfo = f().getApplicationInfo();
                    String strA = com.google.android.gms.common.util.m.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f1865d = Boolean.valueOf(str != null && str.equals(strA));
                    }
                    if (this.f1865d == null) {
                        this.f1865d = Boolean.TRUE;
                        m().G().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f1865d.booleanValue();
    }

    public final boolean G(String str) {
        return "1".equals(this.f1864c.i(str, "gaia_collection_enabled"));
    }

    public final boolean H() {
        h();
        Boolean boolB = B("firebase_analytics_collection_deactivated");
        return boolB != null && boolB.booleanValue();
    }

    public final boolean I(String str) {
        return "1".equals(this.f1864c.i(str, "measurement.event_sampling_enabled"));
    }

    public final Boolean J() {
        a();
        Boolean boolB = B("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(boolB == null || boolB.booleanValue());
    }

    final boolean K(String str) {
        return z(str, r.K);
    }

    public final Boolean L() {
        a();
        if (!kb.b() || !t(r.C0)) {
            return Boolean.TRUE;
        }
        Boolean boolB = B("google_analytics_automatic_screen_reporting_enabled");
        return Boolean.valueOf(boolB == null || boolB.booleanValue());
    }

    final String M(String str) {
        s3<String> s3Var = r.L;
        return s3Var.a(str == null ? null : this.f1864c.i(str, s3Var.b()));
    }

    public final String P() {
        return i("debug.firebase.analytics.app", "");
    }

    public final String Q() {
        return i("debug.deferred.deeplink", "");
    }

    final boolean R() {
        if (this.f1863b == null) {
            Boolean boolB = B("app_measurement_lite");
            this.f1863b = boolB;
            if (boolB == null) {
                this.f1863b = Boolean.FALSE;
            }
        }
        return this.f1863b.booleanValue() || !this.a.N();
    }

    public final int o(String str) {
        return p(str, r.I, 25, 100);
    }

    public final long q(String str, s3<Long> s3Var) {
        if (str != null) {
            String strI = this.f1864c.i(str, s3Var.b());
            if (!TextUtils.isEmpty(strI)) {
                try {
                    return s3Var.a(Long.valueOf(Long.parseLong(strI))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return s3Var.a(null).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String r(com.google.android.gms.measurement.internal.f4 r6) {
        /*
            r5 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = r6.A()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L33
            boolean r1 = d.b.a.a.e.e.ta.b()
            if (r1 == 0) goto L2f
            com.google.android.gms.measurement.internal.qa r1 = r5.n()
            java.lang.String r2 = r6.t()
            com.google.android.gms.measurement.internal.s3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.r.o0
            boolean r1 = r1.z(r2, r3)
            if (r1 == 0) goto L2f
            java.lang.String r1 = r6.G()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L33
        L2f:
            java.lang.String r1 = r6.D()
        L33:
            com.google.android.gms.measurement.internal.s3<java.lang.String> r2 = com.google.android.gms.measurement.internal.r.e
            r3 = 0
            java.lang.Object r2 = r2.a(r3)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r2 = r0.scheme(r2)
            com.google.android.gms.measurement.internal.s3<java.lang.String> r4 = com.google.android.gms.measurement.internal.r.f
            java.lang.Object r3 = r4.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri$Builder r2 = r2.encodedAuthority(r3)
            java.lang.String r3 = "config/app/"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L5d
            java.lang.String r1 = r3.concat(r1)
            goto L62
        L5d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L62:
            android.net.Uri$Builder r1 = r2.path(r1)
            java.lang.String r6 = r6.x()
            java.lang.String r2 = "app_instance_id"
            android.net.Uri$Builder r6 = r1.appendQueryParameter(r2, r6)
            java.lang.String r1 = "platform"
            java.lang.String r2 = "android"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r1, r2)
            long r1 = r5.D()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "gmp_version"
            r6.appendQueryParameter(r2, r1)
            android.net.Uri r6 = r0.build()
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.qa.r(com.google.android.gms.measurement.internal.f4):java.lang.String");
    }

    final void s(b bVar) {
        this.f1864c = bVar;
    }

    public final boolean t(s3<Boolean> s3Var) {
        return z(null, s3Var);
    }

    final int u(String str) {
        if (d.b.a.a.e.e.v8.b() && z(null, r.K0)) {
            return p(str, r.H, 500, AdError.SERVER_ERROR_CODE);
        }
        return 500;
    }

    public final int v(String str, s3<Integer> s3Var) {
        if (str != null) {
            String strI = this.f1864c.i(str, s3Var.b());
            if (!TextUtils.isEmpty(strI)) {
                try {
                    return s3Var.a(Integer.valueOf(Integer.parseInt(strI))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return s3Var.a(null).intValue();
    }

    public final double w(String str, s3<Double> s3Var) {
        if (str != null) {
            String strI = this.f1864c.i(str, s3Var.b());
            if (!TextUtils.isEmpty(strI)) {
                try {
                    return s3Var.a(Double.valueOf(Double.parseDouble(strI))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return s3Var.a(null).doubleValue();
    }

    public final int x(String str) {
        return v(str, r.o);
    }

    final int y(String str) {
        if (d.b.a.a.e.e.v8.b() && z(null, r.K0)) {
            return p(str, r.G, 25, 100);
        }
        return 25;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z(java.lang.String r4, com.google.android.gms.measurement.internal.s3<java.lang.Boolean> r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Le
        L3:
            java.lang.Object r4 = r5.a(r0)
        L7:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        Le:
            com.google.android.gms.measurement.internal.b r1 = r3.f1864c
            java.lang.String r2 = r5.b()
            java.lang.String r4 = r1.i(r4, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L1f
            goto L3
        L1f:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r4 = r5.a(r4)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.qa.z(java.lang.String, com.google.android.gms.measurement.internal.s3):boolean");
    }
}
