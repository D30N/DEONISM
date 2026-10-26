package d.b.a.a.e.e;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class c5 extends u0 implements e2 {
    public static e2 g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return iInterfaceQueryLocalInterface instanceof e2 ? (e2) iInterfaceQueryLocalInterface : new c4(iBinder);
    }
}
