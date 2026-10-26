package d.b.a.a.e.e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class gd extends a implements ed {
    gd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // d.b.a.a.e.e.ed
    public final void f(Bundle bundle) {
        Parcel parcelE = e();
        v.c(parcelE, bundle);
        h(1, parcelE);
    }
}
