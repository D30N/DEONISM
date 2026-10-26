package d.b.a.a.e.e;

import android.net.Uri;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class v1 {
    private final Map<String, Map<String, String>> a;

    v1(Map<String, Map<String, String>> map) {
        this.a = map;
    }

    @Nullable
    public final String a(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri != null) {
            str = uri.toString();
        } else if (str == null) {
            return null;
        }
        Map<String, String> map = this.a.get(str);
        if (map == null) {
            return null;
        }
        if (str2 != null) {
            String strValueOf = String.valueOf(str2);
            String strValueOf2 = String.valueOf(str3);
            str3 = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        }
        return map.get(str3);
    }
}
