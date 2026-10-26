package b.g.k;

import android.os.Build;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c {
    public static boolean a(Object obj, Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? defpackage.a.a(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        int i = Build.VERSION.SDK_INT;
        return Arrays.hashCode(objArr);
    }
}
