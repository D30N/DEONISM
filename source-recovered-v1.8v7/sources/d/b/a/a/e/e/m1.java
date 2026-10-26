package d.b.a.a.e.e;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* loaded from: classes.dex */
public class m1 {
    private static UserManager a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f2762b = !a();

    private m1() {
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean b(Context context) {
        return !a() || d(context);
    }

    @TargetApi(24)
    private static boolean c(Context context) {
        boolean z;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (a == null) {
                a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = a;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                a = null;
                i++;
            }
        }
        z = z2;
        if (z) {
            a = null;
        }
        return z;
    }

    @TargetApi(24)
    private static boolean d(Context context) {
        if (f2762b) {
            return true;
        }
        synchronized (m1.class) {
            if (f2762b) {
                return true;
            }
            boolean zC = c(context);
            if (zC) {
                f2762b = zC;
            }
            return zC;
        }
    }
}
