package d.b.a.a.e.e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class c4 extends a implements e2 {
    c4(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // d.b.a.a.e.e.e2
    public final Bundle f(Bundle bundle) {
        Parcel parcelE = e();
        v.c(parcelE, bundle);
        Parcel parcelG = g(1, parcelE);
        Bundle bundle2 = (Bundle) v.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle2;
    }
}
