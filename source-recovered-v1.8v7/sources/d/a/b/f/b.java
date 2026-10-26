package d.a.b.f;

import android.webkit.MimeTypeMap;
import d.a.b.d.f;
import java.util.Map;

/* loaded from: classes.dex */
public class b {
    private static final MimeTypeMap a = MimeTypeMap.getSingleton();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, String> f2377b;

    static {
        f.d("image/heif", "heif", "image/heic", "heic");
        f2377b = f.d("heif", "image/heif", "heic", "image/heic");
    }

    public static String a(String str) {
        String str2 = f2377b.get(str);
        return str2 != null ? str2 : a.getMimeTypeFromExtension(str);
    }
}
