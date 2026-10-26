package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m {
    final String a;

    /* renamed from: b, reason: collision with root package name */
    final String f1784b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1785c;

    /* renamed from: d, reason: collision with root package name */
    final long f1786d;
    final long e;
    final o f;

    m(d5 d5Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        o oVar;
        com.google.android.gms.common.internal.q.g(str2);
        com.google.android.gms.common.internal.q.g(str3);
        this.a = str2;
        this.f1784b = str3;
        this.f1785c = TextUtils.isEmpty(str) ? null : str;
        this.f1786d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            d5Var.m().J().b("Event created with reverse previous/current timestamps. appId", z3.x(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            oVar = new o(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    d5Var.m().G().a("Param name can't be null");
                } else {
                    Object objG = d5Var.G().G(next, bundle2.get(next));
                    if (objG == null) {
                        d5Var.m().J().b("Param value can't be null", d5Var.H().z(next));
                    } else {
                        d5Var.G().N(bundle2, next, objG);
                    }
                }
                it.remove();
            }
            oVar = new o(bundle2);
        }
        this.f = oVar;
    }

    private m(d5 d5Var, String str, String str2, String str3, long j, long j2, o oVar) {
        com.google.android.gms.common.internal.q.g(str2);
        com.google.android.gms.common.internal.q.g(str3);
        com.google.android.gms.common.internal.q.k(oVar);
        this.a = str2;
        this.f1784b = str3;
        this.f1785c = TextUtils.isEmpty(str) ? null : str;
        this.f1786d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            d5Var.m().J().c("Event created with reverse previous/current timestamps. appId, name", z3.x(str2), z3.x(str3));
        }
        this.f = oVar;
    }

    final m a(d5 d5Var, long j) {
        return new m(d5Var, this.f1785c, this.a, this.f1784b, this.f1786d, j, this.f);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.f1784b;
        String strValueOf = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(strValueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(strValueOf);
        sb.append('}');
        return sb.toString();
    }
}
