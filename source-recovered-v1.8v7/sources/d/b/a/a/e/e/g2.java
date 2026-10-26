package d.b.a.a.e.e;

import android.content.Context;
import android.net.Uri;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class g2 {
    final Uri a;

    /* renamed from: b, reason: collision with root package name */
    final String f2691b;

    /* renamed from: c, reason: collision with root package name */
    final String f2692c;

    public g2(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private g2(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable k2<Context, Boolean> k2Var) {
        this.a = uri;
        this.f2691b = str2;
        this.f2692c = str3;
    }

    public final z1<Double> a(String str, double d2) {
        return z1.i(this, str, -3.0d, true);
    }

    public final z1<Long> b(String str, long j) {
        return z1.j(this, str, j, true);
    }

    public final z1<String> c(String str, String str2) {
        return z1.k(this, str, str2, true);
    }

    public final z1<Boolean> d(String str, boolean z) {
        return z1.l(this, str, z, true);
    }
}
