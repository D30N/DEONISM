package d.b.a.a.c.n;

import android.content.Context;
import com.google.android.gms.common.util.l;

/* loaded from: classes.dex */
public class a {
    private static Context a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f2615b;

    public static synchronized boolean a(Context context) {
        Boolean boolValueOf;
        Context applicationContext = context.getApplicationContext();
        if (a != null && f2615b != null && a == applicationContext) {
            return f2615b.booleanValue();
        }
        f2615b = null;
        if (!l.i()) {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f2615b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                boolValueOf = Boolean.FALSE;
            }
            a = applicationContext;
            return f2615b.booleanValue();
        }
        boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f2615b = boolValueOf;
        a = applicationContext;
        return f2615b.booleanValue();
    }
}
