package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class d4 {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    private String f1661b;

    /* renamed from: c, reason: collision with root package name */
    private long f1662c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f1663d;

    private d4(String str, String str2, Bundle bundle, long j) {
        this.a = str;
        this.f1661b = str2;
        this.f1663d = bundle == null ? new Bundle() : bundle;
        this.f1662c = j;
    }

    public static d4 b(p pVar) {
        return new d4(pVar.f1832b, pVar.f1834d, pVar.f1833c.l(), pVar.e);
    }

    public final p a() {
        return new p(this.a, new o(new Bundle(this.f1663d)), this.f1661b, this.f1662c);
    }

    public final String toString() {
        String str = this.f1661b;
        String str2 = this.a;
        String strValueOf = String.valueOf(this.f1663d);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(strValueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(strValueOf);
        return sb.toString();
    }
}
