package b.g.i;

import android.util.Base64;
import b.g.k.h;
import java.util.List;

/* loaded from: classes.dex */
public final class a {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f855b;

    /* renamed from: c, reason: collision with root package name */
    private final String f856c;

    /* renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f857d;
    private final int e;
    private final String f;

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        h.c(str);
        this.a = str;
        h.c(str2);
        this.f855b = str2;
        h.c(str3);
        this.f856c = str3;
        h.c(list);
        this.f857d = list;
        this.e = 0;
        this.f = this.a + "-" + this.f855b + "-" + this.f856c;
    }

    public List<List<byte[]>> a() {
        return this.f857d;
    }

    public int b() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.f855b;
    }

    public String f() {
        return this.f856c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.f855b + ", mQuery: " + this.f856c + ", mCertificates:");
        for (int i = 0; i < this.f857d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f857d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.e);
        return sb.toString();
    }
}
