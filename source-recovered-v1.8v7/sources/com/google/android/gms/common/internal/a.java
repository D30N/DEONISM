package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.k;

/* loaded from: classes.dex */
public class a extends k.a {
    public static Account h(k kVar) {
        if (kVar != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return kVar.d();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return null;
    }
}
