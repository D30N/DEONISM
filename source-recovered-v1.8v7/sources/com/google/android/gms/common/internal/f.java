package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.k;

/* loaded from: classes.dex */
public class f extends com.google.android.gms.common.internal.v.a {
    public static final Parcelable.Creator<f> CREATOR = new d0();

    /* renamed from: b, reason: collision with root package name */
    private final int f1551b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1552c;

    /* renamed from: d, reason: collision with root package name */
    private int f1553d;
    String e;
    IBinder f;
    Scope[] g;
    Bundle h;
    Account i;
    d.b.a.a.c.d[] j;
    d.b.a.a.c.d[] k;
    private boolean l;

    public f(int i) {
        this.f1551b = 4;
        this.f1553d = d.b.a.a.c.f.a;
        this.f1552c = i;
        this.l = true;
    }

    f(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, d.b.a.a.c.d[] dVarArr, d.b.a.a.c.d[] dVarArr2, boolean z) {
        this.f1551b = i;
        this.f1552c = i2;
        this.f1553d = i3;
        if ("com.google.android.gms".equals(str)) {
            this.e = "com.google.android.gms";
        } else {
            this.e = str;
        }
        if (i < 2) {
            this.i = iBinder != null ? a.h(k.a.g(iBinder)) : null;
        } else {
            this.f = iBinder;
            this.i = account;
        }
        this.g = scopeArr;
        this.h = bundle;
        this.j = dVarArr;
        this.k = dVarArr2;
        this.l = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.j(parcel, 1, this.f1551b);
        com.google.android.gms.common.internal.v.c.j(parcel, 2, this.f1552c);
        com.google.android.gms.common.internal.v.c.j(parcel, 3, this.f1553d);
        com.google.android.gms.common.internal.v.c.n(parcel, 4, this.e, false);
        com.google.android.gms.common.internal.v.c.i(parcel, 5, this.f, false);
        com.google.android.gms.common.internal.v.c.p(parcel, 6, this.g, i, false);
        com.google.android.gms.common.internal.v.c.e(parcel, 7, this.h, false);
        com.google.android.gms.common.internal.v.c.m(parcel, 8, this.i, i, false);
        com.google.android.gms.common.internal.v.c.p(parcel, 10, this.j, i, false);
        com.google.android.gms.common.internal.v.c.p(parcel, 11, this.k, i, false);
        com.google.android.gms.common.internal.v.c.c(parcel, 12, this.l);
        com.google.android.gms.common.internal.v.c.b(parcel, iA);
    }
}
