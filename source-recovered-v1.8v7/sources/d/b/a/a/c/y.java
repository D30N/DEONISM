package d.b.a.a.c;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.j0;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class y extends com.google.android.gms.common.internal.v.a {
    public static final Parcelable.Creator<y> CREATOR = new z();

    /* renamed from: b, reason: collision with root package name */
    private final String f2624b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final s f2625c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f2626d;
    private final boolean e;

    y(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        this.f2624b = str;
        this.f2625c = h(iBinder);
        this.f2626d = z;
        this.e = z2;
    }

    y(String str, @Nullable s sVar, boolean z, boolean z2) {
        this.f2624b = str;
        this.f2625c = sVar;
        this.f2626d = z;
        this.e = z2;
    }

    @Nullable
    private static s h(@Nullable IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            d.b.a.a.d.a aVarB = j0.g(iBinder).b();
            byte[] bArr = aVarB == null ? null : (byte[]) d.b.a.a.d.b.h(aVarB);
            if (bArr != null) {
                return new t(bArr);
            }
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (RemoteException e) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.n(parcel, 1, this.f2624b, false);
        s sVar = this.f2625c;
        if (sVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            sVar = null;
        } else {
            sVar.asBinder();
        }
        com.google.android.gms.common.internal.v.c.i(parcel, 2, sVar, false);
        com.google.android.gms.common.internal.v.c.c(parcel, 3, this.f2626d);
        com.google.android.gms.common.internal.v.c.c(parcel, 4, this.e);
        com.google.android.gms.common.internal.v.c.b(parcel, iA);
    }
}
