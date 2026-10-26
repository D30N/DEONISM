package d.b.a.a.c;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.l0;
import com.google.android.gms.common.internal.m0;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* loaded from: classes.dex */
final class q {
    private static volatile l0 a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f2617b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static Context f2618c;

    static a0 a(String str, s sVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return d(str, sVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static synchronized void c(Context context) {
        if (f2618c != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f2618c = context.getApplicationContext();
        }
    }

    private static a0 d(final String str, final s sVar, final boolean z, boolean z2) {
        try {
            if (a == null) {
                com.google.android.gms.common.internal.q.k(f2618c);
                synchronized (f2617b) {
                    if (a == null) {
                        a = m0.g(DynamiteModule.d(f2618c, DynamiteModule.j, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            com.google.android.gms.common.internal.q.k(f2618c);
            try {
                return a.R(new y(str, sVar, z, z2), d.b.a.a.d.b.U(f2618c.getPackageManager())) ? a0.f() : a0.c(new Callable(z, str, sVar) { // from class: d.b.a.a.c.r
                    private final boolean a;

                    /* renamed from: b, reason: collision with root package name */
                    private final String f2619b;

                    /* renamed from: c, reason: collision with root package name */
                    private final s f2620c;

                    {
                        this.a = z;
                        this.f2619b = str;
                        this.f2620c = sVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z3 = this.a;
                        String str2 = this.f2619b;
                        s sVar2 = this.f2620c;
                        return a0.e(str2, sVar2, z3, !z3 && q.d(str2, sVar2, true, false).a);
                    }
                });
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return a0.b("module call", e);
            }
        } catch (DynamiteModule.a e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String strValueOf = String.valueOf(e2.getMessage());
            return a0.b(strValueOf.length() != 0 ? "module init: ".concat(strValueOf) : new String("module init: "), e2);
        }
    }
}
