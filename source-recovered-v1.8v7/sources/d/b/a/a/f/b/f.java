package d.b.a.a.f.b;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class f extends d.b.a.a.e.b.b implements e {
    public f() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // d.b.a.a.e.b.b
    protected boolean U(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            L((d.b.a.a.c.b) d.b.a.a.e.b.c.a(parcel, d.b.a.a.c.b.CREATOR), (b) d.b.a.a.e.b.c.a(parcel, b.CREATOR));
        } else if (i == 4) {
            S((Status) d.b.a.a.e.b.c.a(parcel, Status.CREATOR));
        } else if (i == 6) {
            n((Status) d.b.a.a.e.b.c.a(parcel, Status.CREATOR));
        } else if (i == 7) {
            p((Status) d.b.a.a.e.b.c.a(parcel, Status.CREATOR), (GoogleSignInAccount) d.b.a.a.e.b.c.a(parcel, GoogleSignInAccount.CREATOR));
        } else {
            if (i != 8) {
                return false;
            }
            y((k) d.b.a.a.e.b.c.a(parcel, k.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
