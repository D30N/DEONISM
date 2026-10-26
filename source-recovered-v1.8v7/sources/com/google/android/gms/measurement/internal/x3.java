package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class x3 extends b6 {

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReference<String[]> f1942c = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReference<String[]> f1943d = new AtomicReference<>();
    private static final AtomicReference<String[]> e = new AtomicReference<>();

    x3(d5 d5Var) {
        super(d5Var);
    }

    private final boolean B() {
        h();
        return this.a.J() && this.a.m().C(3);
    }

    private static String x(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        com.google.android.gms.common.internal.q.k(strArr);
        com.google.android.gms.common.internal.q.k(strArr2);
        com.google.android.gms.common.internal.q.k(atomicReference);
        com.google.android.gms.common.internal.q.a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (z9.A0(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    private final String y(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strU = obj instanceof Bundle ? u((Bundle) obj) : String.valueOf(obj);
            if (strU != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strU);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected final String A(String str) {
        if (str == null) {
            return null;
        }
        if (!B()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return x(str, e6.f1682b, e6.a, e);
        }
        return "experiment_id(" + str + ")";
    }

    @Override // com.google.android.gms.measurement.internal.b6
    protected final boolean s() {
        return false;
    }

    protected final String u(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!B()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(z(str));
            sb.append("=");
            if (d.b.a.a.e.e.b9.b() && n().t(r.E0)) {
                Object obj = bundle.get(str);
                sb.append(obj instanceof Bundle ? y(new Object[]{obj}) : obj instanceof Object[] ? y((Object[]) obj) : obj instanceof ArrayList ? y(((ArrayList) obj).toArray()) : String.valueOf(obj));
            } else {
                sb.append(bundle.get(str));
            }
        }
        sb.append("}]");
        return sb.toString();
    }

    protected final String v(p pVar) {
        if (pVar == null) {
            return null;
        }
        if (!B()) {
            return pVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(pVar.f1834d);
        sb.append(",name=");
        sb.append(w(pVar.f1832b));
        sb.append(",params=");
        o oVar = pVar.f1833c;
        sb.append(oVar != null ? !B() ? oVar.toString() : u(oVar.l()) : null);
        return sb.toString();
    }

    protected final String w(String str) {
        if (str == null) {
            return null;
        }
        return !B() ? str : x(str, c6.f1651b, c6.a, f1942c);
    }

    protected final String z(String str) {
        if (str == null) {
            return null;
        }
        return !B() ? str : x(str, f6.f1694b, f6.a, f1943d);
    }
}
