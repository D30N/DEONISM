package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface k extends IInterface {

    public static abstract class a extends d.b.a.a.e.c.b implements k {

        /* renamed from: com.google.android.gms.common.internal.k$a$a, reason: collision with other inner class name */
        public static class C0066a extends d.b.a.a.e.c.a implements k {
            C0066a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            @Override // com.google.android.gms.common.internal.k
            public final Account d() {
                Parcel parcelG = g(2, e());
                Account account = (Account) d.b.a.a.e.c.c.b(parcelG, Account.CREATOR);
                parcelG.recycle();
                return account;
            }
        }

        public static k g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new C0066a(iBinder);
        }
    }

    Account d();
}
