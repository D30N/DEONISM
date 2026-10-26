package d.b.a.a.e.e;

import android.net.Uri;

/* loaded from: classes.dex */
public final class a2 {
    private static final b.d.a<String, Uri> a = new b.d.a<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        uri = a.get(str);
        if (uri == null) {
            String strValueOf = String.valueOf(Uri.encode(str));
            uri = Uri.parse(strValueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(strValueOf) : new String("content://com.google.android.gms.phenotype/"));
            a.put(str, uri);
        }
        return uri;
    }
}
