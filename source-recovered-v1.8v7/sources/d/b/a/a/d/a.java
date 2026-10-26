package d.b.a.a.d;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: d.b.a.a.d.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0096a extends d.b.a.a.e.c.b implements a {

        /* renamed from: d.b.a.a.d.a$a$a, reason: collision with other inner class name */
        public static class C0097a extends d.b.a.a.e.c.a implements a {
            C0097a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public AbstractBinderC0096a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C0097a(iBinder);
        }
    }
}
