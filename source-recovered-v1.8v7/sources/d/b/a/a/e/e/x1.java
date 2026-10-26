package d.b.a.a.e.e;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;

/* loaded from: classes.dex */
public final class x1 {
    private static volatile n2<Boolean> a = n2.d();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f2876b = new Object();

    private static boolean a(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
    }

    public static boolean b(Context context, Uri uri) {
        ProviderInfo providerInfoResolveContentProvider;
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        }
        if (!a.b()) {
            synchronized (f2876b) {
                if (a.b()) {
                    return a.c().booleanValue();
                }
                if (("com.google.android.gms".equals(context.getPackageName()) || ((providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0)) != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName))) && a(context)) {
                    z = true;
                }
                a = n2.a(Boolean.valueOf(z));
            }
        }
        return a.c().booleanValue();
    }
}
