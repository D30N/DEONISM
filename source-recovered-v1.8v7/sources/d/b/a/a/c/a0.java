package d.b.a.a.c;

import android.util.Log;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
/* loaded from: classes.dex */
class a0 {

    /* renamed from: d, reason: collision with root package name */
    private static final a0 f2596d = new a0(true, null, null);
    final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2597b;

    /* renamed from: c, reason: collision with root package name */
    private final Throwable f2598c;

    a0(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.a = z;
        this.f2597b = str;
        this.f2598c = th;
    }

    static a0 b(String str, Throwable th) {
        return new a0(false, str, th);
    }

    static a0 c(Callable<String> callable) {
        return new c0(callable);
    }

    static a0 d(String str) {
        return new a0(false, str, null);
    }

    static String e(String str, s sVar, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", z2 ? "debug cert rejected" : "not whitelisted", str, com.google.android.gms.common.util.j.a(com.google.android.gms.common.util.a.b("SHA-1").digest(sVar.h())), Boolean.valueOf(z), "12451009.false");
    }

    static a0 f() {
        return f2596d;
    }

    @Nullable
    String a() {
        return this.f2597b;
    }

    final void g() {
        if (this.a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f2598c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f2598c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
