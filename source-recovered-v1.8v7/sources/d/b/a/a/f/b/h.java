package d.b.a.a.f.b;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class h extends d.b.a.a.e.b.a implements g {
    h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // d.b.a.a.f.b.g
    public final void I(i iVar, e eVar) {
        Parcel parcelE = e();
        d.b.a.a.e.b.c.c(parcelE, iVar);
        d.b.a.a.e.b.c.b(parcelE, eVar);
        g(12, parcelE);
    }
}
