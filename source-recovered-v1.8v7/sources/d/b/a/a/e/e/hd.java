package d.b.a.a.e.e;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class hd extends u0 implements ed {
    public hd() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // d.b.a.a.e.e.u0
    protected final boolean e(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        f((Bundle) v.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
