package d.a.b.f;

import d.a.b.d.f;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class a {
    public static final Map<String, String> a = f.d("mkv", "video/x-matroska", "glb", "model/gltf-binary");

    @Nullable
    private static String a(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0 || iLastIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(iLastIndexOf + 1);
    }

    @Nullable
    public static String b(String str) {
        String strA = a(str);
        if (strA == null) {
            return null;
        }
        String lowerCase = strA.toLowerCase(Locale.US);
        String strA2 = b.a(lowerCase);
        return strA2 == null ? a.get(lowerCase) : strA2;
    }

    public static boolean c(@Nullable String str) {
        return str != null && str.startsWith("video/");
    }
}
