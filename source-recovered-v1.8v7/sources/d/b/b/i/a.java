package d.b.b.i;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import d.b.b.f.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class a {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f3038b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f3039c = new AtomicBoolean(c());

    public a(Context context, String str, c cVar) {
        this.a = a(context);
        this.f3038b = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
    }

    private static Context a(Context context) {
        return (Build.VERSION.SDK_INT < 24 || b.g.d.a.h(context)) ? context : b.g.d.a.b(context);
    }

    private boolean c() {
        ApplicationInfo applicationInfo;
        if (this.f3038b.contains("firebase_data_collection_default_enabled")) {
            return this.f3038b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }

    public boolean b() {
        return this.f3039c.get();
    }
}
