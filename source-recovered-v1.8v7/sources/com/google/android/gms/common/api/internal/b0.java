package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.b;

/* loaded from: classes.dex */
abstract class b0<T> extends u {
    protected final d.b.a.a.h.i<T> a;

    public b0(int i, d.b.a.a.h.i<T> iVar) {
        super(i);
        this.a = iVar;
    }

    @Override // com.google.android.gms.common.api.internal.l
    public void b(Status status) {
        this.a.d(new com.google.android.gms.common.api.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final void c(b.a<?> aVar) throws DeadObjectException {
        try {
            i(aVar);
        } catch (DeadObjectException e) {
            b(l.a(e));
            throw e;
        } catch (RemoteException e2) {
            b(l.a(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.l
    public void e(RuntimeException runtimeException) {
        this.a.d(runtimeException);
    }

    protected abstract void i(b.a<?> aVar);
}
