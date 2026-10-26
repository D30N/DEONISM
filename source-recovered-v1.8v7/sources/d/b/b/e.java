package d.b.b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.n;

/* loaded from: classes.dex */
public final class e {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3030b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3031c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3032d;
    private final String e;
    private final String f;
    private final String g;

    private e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        q.o(!n.a(str), "ApplicationId must be set.");
        this.f3030b = str;
        this.a = str2;
        this.f3031c = str3;
        this.f3032d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static e a(Context context) {
        u uVar = new u(context);
        String strA = uVar.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new e(strA, uVar.a("google_api_key"), uVar.a("firebase_database_url"), uVar.a("ga_trackingId"), uVar.a("gcm_defaultSenderId"), uVar.a("google_storage_bucket"), uVar.a("project_id"));
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.f3030b;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p.a(this.f3030b, eVar.f3030b) && p.a(this.a, eVar.a) && p.a(this.f3031c, eVar.f3031c) && p.a(this.f3032d, eVar.f3032d) && p.a(this.e, eVar.e) && p.a(this.f, eVar.f) && p.a(this.g, eVar.g);
    }

    public int hashCode() {
        return p.b(this.f3030b, this.a, this.f3031c, this.f3032d, this.e, this.f, this.g);
    }

    public String toString() {
        p.a aVarC = p.c(this);
        aVarC.a("applicationId", this.f3030b);
        aVarC.a("apiKey", this.a);
        aVarC.a("databaseUrl", this.f3031c);
        aVarC.a("gcmSenderId", this.e);
        aVarC.a("storageBucket", this.f);
        aVarC.a("projectId", this.g);
        return aVarC.toString();
    }
}
