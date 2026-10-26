package d.b.a.a.e.a;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class f extends a implements d {
    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // d.b.a.a.e.a.d
    public final String getId() {
        Parcel parcelG = g(1, e());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // d.b.a.a.e.a.d
    public final boolean s(boolean z) {
        Parcel parcelE = e();
        c.a(parcelE, true);
        Parcel parcelG = g(2, parcelE);
        boolean zB = c.b(parcelG);
        parcelG.recycle();
        return zB;
    }
}
