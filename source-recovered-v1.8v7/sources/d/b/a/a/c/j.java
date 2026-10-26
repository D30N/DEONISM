package d.b.a.a.c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* loaded from: classes.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    private static j f2614b;
    private final Context a;

    private j(Context context) {
        this.a = context.getApplicationContext();
    }

    public static j a(Context context) {
        com.google.android.gms.common.internal.q.k(context);
        synchronized (j.class) {
            if (f2614b == null) {
                q.c(context);
                f2614b = new j(context);
            }
        }
        return f2614b;
    }

    private static s d(PackageInfo packageInfo, s... sVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        t tVar = new t(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < sVarArr.length; i++) {
            if (sVarArr[i].equals(tVar)) {
                return sVarArr[i];
            }
        }
        return null;
    }

    private final a0 e(String str, int i) {
        try {
            PackageInfo packageInfoH = d.b.a.a.c.n.c.a(this.a).h(str, 64, i);
            boolean zE = i.e(this.a);
            if (packageInfoH == null) {
                return a0.d("null pkg");
            }
            if (packageInfoH.signatures.length != 1) {
                return a0.d("single cert required");
            }
            t tVar = new t(packageInfoH.signatures[0].toByteArray());
            String str2 = packageInfoH.packageName;
            a0 a0VarA = q.a(str2, tVar, zE, false);
            return (!a0VarA.a || packageInfoH.applicationInfo == null || (packageInfoH.applicationInfo.flags & 2) == 0 || !q.a(str2, tVar, false, true).a) ? a0VarA : a0.d("debuggable release cert app rejected");
        } catch (PackageManager.NameNotFoundException unused) {
            String strValueOf = String.valueOf(str);
            return a0.d(strValueOf.length() != 0 ? "no pkg ".concat(strValueOf) : new String("no pkg "));
        }
    }

    public static boolean f(PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? d(packageInfo, v.a) : d(packageInfo, v.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (f(packageInfo, false)) {
            return true;
        }
        if (f(packageInfo, true)) {
            if (i.e(this.a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i) {
        a0 a0VarD;
        String[] strArrF = d.b.a.a.c.n.c.a(this.a).f(i);
        if (strArrF == null || strArrF.length == 0) {
            a0VarD = a0.d("no pkgs");
        } else {
            a0VarD = null;
            for (String str : strArrF) {
                a0VarD = e(str, i);
                if (a0VarD.a) {
                    break;
                }
            }
        }
        a0VarD.g();
        return a0VarD.a;
    }
}
