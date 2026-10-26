package d.b.b.g;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
class d {

    /* renamed from: b, reason: collision with root package name */
    private static d f3037b;
    private final SharedPreferences a;

    private d(Context context) {
        this.a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    static synchronized d a(Context context) {
        if (f3037b == null) {
            f3037b = new d(context);
        }
        return f3037b;
    }

    synchronized boolean b(long j) {
        return c("fire-global", j);
    }

    synchronized boolean c(String str, long j) {
        if (!this.a.contains(str)) {
            this.a.edit().putLong(str, j).apply();
            return true;
        }
        if (j - this.a.getLong(str, -1L) < 86400000) {
            return false;
        }
        this.a.edit().putLong(str, j).apply();
        return true;
    }
}
