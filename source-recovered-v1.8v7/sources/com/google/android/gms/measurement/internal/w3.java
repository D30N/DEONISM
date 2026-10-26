package com.google.android.gms.measurement.internal;

import android.content.Context;
import d.b.a.a.e.e.oc;
import d.b.a.a.e.e.ta;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes.dex */
public final class w3 extends f5 {

    /* renamed from: c, reason: collision with root package name */
    private String f1930c;

    /* renamed from: d, reason: collision with root package name */
    private String f1931d;
    private int e;
    private String f;
    private long g;
    private long h;
    private List<String> i;
    private int j;
    private String k;
    private String l;
    private String m;

    w3(d5 d5Var, long j) {
        super(d5Var);
        this.h = j;
    }

    private final String K() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        b4 b4VarK;
        String str;
        if (oc.b() && n().t(r.r0)) {
            b4VarK = m().O();
            str = "Disabled IID for tests.";
        } else {
            try {
                Class<?> clsLoadClass = f().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (clsLoadClass == null) {
                    return null;
                }
                try {
                    Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, f());
                    if (objInvoke == null) {
                        return null;
                    }
                    try {
                        return (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                    } catch (Exception unused) {
                        b4VarK = m().L();
                        str = "Failed to retrieve Firebase Instance Id";
                    }
                } catch (Exception unused2) {
                    b4VarK = m().K();
                    str = "Failed to obtain Firebase Analytics instance";
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        }
        b4VarK.a(str);
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.f5
    protected final boolean B() {
        return true;
    }

    final fa C(String str) {
        boolean z;
        long jMin;
        c();
        a();
        String strD = D();
        String strE = E();
        y();
        String str2 = this.f1931d;
        long jH = H();
        y();
        String str3 = this.f;
        long jD = n().D();
        y();
        c();
        if (this.g == 0) {
            this.g = this.a.G().x(f(), f().getPackageName());
        }
        long j = this.g;
        boolean zP = this.a.p();
        boolean z2 = !l().v;
        c();
        a();
        String strK = !this.a.p() ? null : K();
        d5 d5Var = this.a;
        Long lValueOf = Long.valueOf(d5Var.A().j.a());
        long jLongValue = lValueOf.longValue();
        long j2 = d5Var.F;
        if (jLongValue == 0) {
            jMin = j2;
            z = zP;
        } else {
            z = zP;
            jMin = Math.min(j2, lValueOf.longValue());
        }
        int I = I();
        boolean zBooleanValue = n().J().booleanValue();
        qa qaVarN = n();
        qaVarN.a();
        Boolean boolB = qaVarN.B("google_analytics_ssaid_collection_enabled");
        boolean zBooleanValue2 = Boolean.valueOf(boolB == null || boolB.booleanValue()).booleanValue();
        m4 m4VarL = l();
        m4VarL.c();
        return new fa(strD, strE, str2, jH, str3, jD, j, str, z, z2, strK, 0L, jMin, I, zBooleanValue, zBooleanValue2, m4VarL.C().getBoolean("deferred_analytics_collection", false), F(), n().B("google_analytics_default_allow_ad_personalization_signals") == null ? null : Boolean.valueOf(!r1.booleanValue()), this.h, n().t(r.c0) ? this.i : null, (ta.b() && n().t(r.o0)) ? G() : null);
    }

    final String D() {
        y();
        return this.f1930c;
    }

    final String E() {
        y();
        return this.k;
    }

    final String F() {
        y();
        return this.l;
    }

    final String G() {
        y();
        return this.m;
    }

    final int H() {
        y();
        return this.e;
    }

    final int I() {
        y();
        return this.j;
    }

    final List<String> J() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018f A[Catch: IllegalStateException -> 0x0211, TryCatch #2 {IllegalStateException -> 0x0211, blocks: (B:61:0x016d, B:63:0x0173, B:65:0x017f, B:67:0x0193, B:71:0x019c, B:74:0x01a6, B:76:0x01b2, B:80:0x01c9, B:82:0x01d1, B:90:0x01f4, B:92:0x0208, B:94:0x020d, B:93:0x020b, B:84:0x01d7, B:85:0x01db, B:86:0x01de, B:88:0x01e4, B:66:0x018f), top: B:127:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01de A[Catch: IllegalStateException -> 0x0211, TryCatch #2 {IllegalStateException -> 0x0211, blocks: (B:61:0x016d, B:63:0x0173, B:65:0x017f, B:67:0x0193, B:71:0x019c, B:74:0x01a6, B:76:0x01b2, B:80:0x01c9, B:82:0x01d1, B:90:0x01f4, B:92:0x0208, B:94:0x020d, B:93:0x020b, B:84:0x01d7, B:85:0x01db, B:86:0x01de, B:88:0x01e4, B:66:0x018f), top: B:127:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e4 A[Catch: IllegalStateException -> 0x0211, TryCatch #2 {IllegalStateException -> 0x0211, blocks: (B:61:0x016d, B:63:0x0173, B:65:0x017f, B:67:0x0193, B:71:0x019c, B:74:0x01a6, B:76:0x01b2, B:80:0x01c9, B:82:0x01d1, B:90:0x01f4, B:92:0x0208, B:94:0x020d, B:93:0x020b, B:84:0x01d7, B:85:0x01db, B:86:0x01de, B:88:0x01e4, B:66:0x018f), top: B:127:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f4 A[Catch: IllegalStateException -> 0x0211, TryCatch #2 {IllegalStateException -> 0x0211, blocks: (B:61:0x016d, B:63:0x0173, B:65:0x017f, B:67:0x0193, B:71:0x019c, B:74:0x01a6, B:76:0x01b2, B:80:0x01c9, B:82:0x01d1, B:90:0x01f4, B:92:0x0208, B:94:0x020d, B:93:0x020b, B:84:0x01d7, B:85:0x01db, B:86:0x01de, B:88:0x01e4, B:66:0x018f), top: B:127:0x016d }] */
    @Override // com.google.android.gms.measurement.internal.f5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void w() throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w3.w():void");
    }
}
