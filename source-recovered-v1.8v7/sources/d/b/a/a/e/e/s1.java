package d.b.a.a.e.e;

import android.os.Binder;

/* loaded from: classes.dex */
public final /* synthetic */ class s1 {
    public static <V> V a(r1<V> r1Var) {
        try {
            return r1Var.a();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return r1Var.a();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
