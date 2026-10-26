package d.b.a.a.c;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.g0;

/* loaded from: classes.dex */
public class f {
    public static final int a = i.a;

    /* renamed from: b, reason: collision with root package name */
    private static final f f2610b = new f();

    f() {
    }

    public static f f() {
        return f2610b;
    }

    private static String j(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(d.b.a.a.c.n.c.a(context).e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    public int a(Context context) {
        return i.a(context);
    }

    public Intent b(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            return (context == null || !com.google.android.gms.common.util.i.d(context)) ? g0.a("com.google.android.gms", j(context, str)) : g0.c();
        }
        if (i != 3) {
            return null;
        }
        return g0.b("com.google.android.gms");
    }

    public PendingIntent c(Context context, int i, int i2) {
        return d(context, i, i2, null);
    }

    public PendingIntent d(Context context, int i, int i2, String str) {
        Intent intentB = b(context, i, str);
        if (intentB == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, intentB, 134217728);
    }

    public String e(int i) {
        return i.b(i);
    }

    public int g(Context context) {
        return h(context, a);
    }

    public int h(Context context, int i) {
        int iF = i.f(context, i);
        if (i.g(context, iF)) {
            return 18;
        }
        return iF;
    }

    public boolean i(int i) {
        return i.j(i);
    }
}
