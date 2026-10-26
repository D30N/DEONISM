package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class w {
    private static int g;
    private static PendingIntent h;

    /* renamed from: b, reason: collision with root package name */
    private final Context f2265b;

    /* renamed from: c, reason: collision with root package name */
    private final q f2266c;
    private Messenger e;
    private u0 f;

    @GuardedBy("responseCallbacks")
    private final b.d.g<String, d.b.a.a.h.i<Bundle>> a = new b.d.g<>();

    /* renamed from: d, reason: collision with root package name */
    private Messenger f2267d = new Messenger(new z(this, Looper.getMainLooper()));

    public w(Context context, q qVar) {
        this.f2265b = context;
        this.f2266c = qVar;
    }

    private static synchronized String b() {
        int i;
        i = g;
        g = i + 1;
        return Integer.toString(i);
    }

    private static synchronized void c(Context context, Intent intent) {
        if (h == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            h = PendingIntent.getBroadcast(context, 0, intent2, 0);
        }
        intent.putExtra("app", h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.os.Message r9) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.w.d(android.os.Message):void");
    }

    private final void f(String str, Bundle bundle) {
        synchronized (this.a) {
            d.b.a.a.h.i<Bundle> iVarRemove = this.a.remove(str);
            if (iVarRemove != null) {
                iVarRemove.c(bundle);
            } else {
                String strValueOf = String.valueOf(str);
                Log.w("FirebaseInstanceId", strValueOf.length() != 0 ? "Missing callback for ".concat(strValueOf) : new String("Missing callback for "));
            }
        }
    }

    private final Bundle g(Bundle bundle) throws RemoteException, IOException {
        Bundle bundleH = h(bundle);
        if (bundleH == null || !bundleH.containsKey("google.messenger")) {
            return bundleH;
        }
        Bundle bundleH2 = h(bundle);
        if (bundleH2 == null || !bundleH2.containsKey("google.messenger")) {
            return bundleH2;
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:8|(1:10)(1:11)|12|(1:14)|15|(5:(7:17|(0)(2:28|(1:30)(1:31))|65|32|33|eb|37)|65|32|33|eb)|19|68|20|(1:22)(1:23)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bf, code lost:
    
        if (android.util.Log.isLoggable("FirebaseInstanceId", r3) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
    
        android.util.Log.d("FirebaseInstanceId", "Messenger failed, fallback to startService");
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [d.b.a.a.h.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.concurrent.TimeUnit] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d0 -> B:65:0x00db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d6 -> B:65:0x00db). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.os.Bundle h(android.os.Bundle r9) throws android.os.RemoteException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.w.h(android.os.Bundle):android.os.Bundle");
    }

    final Bundle a(Bundle bundle) {
        if (this.f2266c.g() < 12000000) {
            return g(bundle);
        }
        try {
            return (Bundle) d.b.a.a.h.k.a(e.d(this.f2265b).e(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(strValueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if ((e.getCause() instanceof o) && ((o) e.getCause()).a() == 4) {
                return g(bundle);
            }
            return null;
        }
    }
}
