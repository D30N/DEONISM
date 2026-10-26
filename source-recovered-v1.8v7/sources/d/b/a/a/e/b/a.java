package d.b.a.a.e.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class a implements IInterface {
    private final IBinder a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2628b;

    protected a(IBinder iBinder, String str) {
        this.a = iBinder;
        this.f2628b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.a;
    }

    protected final Parcel e() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f2628b);
        return parcelObtain;
    }

    protected final void g(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
