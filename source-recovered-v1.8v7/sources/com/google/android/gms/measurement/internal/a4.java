package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.b;

/* loaded from: classes.dex */
public final class a4 extends com.google.android.gms.common.internal.b<r3> {
    public a4(Context context, Looper looper, b.a aVar, b.InterfaceC0065b interfaceC0065b) {
        super(context, looper, 93, aVar, interfaceC0065b, null);
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String g() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.b
    public final /* synthetic */ IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof r3 ? (r3) iInterfaceQueryLocalInterface : new t3(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String n() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int q() {
        return 12451000;
    }
}
