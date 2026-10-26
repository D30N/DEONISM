package d.b.a.a.c;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;

/* loaded from: classes.dex */
public final class b extends com.google.android.gms.common.internal.v.a {

    /* renamed from: b, reason: collision with root package name */
    private final int f2599b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2600c;

    /* renamed from: d, reason: collision with root package name */
    private final PendingIntent f2601d;
    private final String e;
    public static final b f = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new o();

    public b(int i) {
        this(i, null, null);
    }

    b(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f2599b = i;
        this.f2600c = i2;
        this.f2601d = pendingIntent;
        this.e = str;
    }

    public b(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    static String p(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2600c == bVar.f2600c && com.google.android.gms.common.internal.p.a(this.f2601d, bVar.f2601d) && com.google.android.gms.common.internal.p.a(this.e, bVar.e);
    }

    public final int h() {
        return this.f2600c;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.p.b(Integer.valueOf(this.f2600c), this.f2601d, this.e);
    }

    public final String i() {
        return this.e;
    }

    public final PendingIntent k() {
        return this.f2601d;
    }

    public final boolean l() {
        return (this.f2600c == 0 || this.f2601d == null) ? false : true;
    }

    public final boolean m() {
        return this.f2600c == 0;
    }

    public final String toString() {
        p.a aVarC = com.google.android.gms.common.internal.p.c(this);
        aVarC.a("statusCode", p(this.f2600c));
        aVarC.a("resolution", this.f2601d);
        aVarC.a("message", this.e);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.j(parcel, 1, this.f2599b);
        com.google.android.gms.common.internal.v.c.j(parcel, 2, h());
        com.google.android.gms.common.internal.v.c.m(parcel, 3, k(), i, false);
        com.google.android.gms.common.internal.v.c.n(parcel, 4, i(), false);
        com.google.android.gms.common.internal.v.c.b(parcel, iA);
    }
}
