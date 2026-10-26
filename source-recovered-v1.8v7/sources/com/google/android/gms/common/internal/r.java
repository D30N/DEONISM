package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public class r extends com.google.android.gms.common.internal.v.a {
    public static final Parcelable.Creator<r> CREATOR = new z();

    /* renamed from: b, reason: collision with root package name */
    private final int f1571b;

    /* renamed from: c, reason: collision with root package name */
    private final Account f1572c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1573d;
    private final GoogleSignInAccount e;

    r(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f1571b = i;
        this.f1572c = account;
        this.f1573d = i2;
        this.e = googleSignInAccount;
    }

    public r(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public Account h() {
        return this.f1572c;
    }

    public int i() {
        return this.f1573d;
    }

    public GoogleSignInAccount k() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.j(parcel, 1, this.f1571b);
        com.google.android.gms.common.internal.v.c.m(parcel, 2, h(), i, false);
        com.google.android.gms.common.internal.v.c.j(parcel, 3, i());
        com.google.android.gms.common.internal.v.c.m(parcel, 4, k(), i, false);
        com.google.android.gms.common.internal.v.c.b(parcel, iA);
    }
}
