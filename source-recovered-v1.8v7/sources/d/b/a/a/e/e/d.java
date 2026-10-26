package d.b.a.a.e.e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d extends a implements b {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // d.b.a.a.e.e.b
    public final int a() {
        Parcel parcelG = g(2, e());
        int i = parcelG.readInt();
        parcelG.recycle();
        return i;
    }

    @Override // d.b.a.a.e.e.b
    public final void v(String str, String str2, Bundle bundle, long j) {
        Parcel parcelE = e();
        parcelE.writeString(str);
        parcelE.writeString(str2);
        v.c(parcelE, bundle);
        parcelE.writeLong(j);
        h(1, parcelE);
    }
}
