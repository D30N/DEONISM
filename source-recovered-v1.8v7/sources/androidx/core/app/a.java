package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class a extends b.g.d.a {

    /* renamed from: c, reason: collision with root package name */
    private static InterfaceC0007a f372c;

    /* renamed from: androidx.core.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC0007a {
        boolean a(Activity activity, int i, int i2, Intent intent);
    }

    public static void j(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static InterfaceC0007a k() {
        return f372c;
    }

    public static void l(Activity activity) {
        if (Build.VERSION.SDK_INT < 28 && b.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void m(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }
}
