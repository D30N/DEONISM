package d.b.b.j;

import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class e {
    public static String a() {
        try {
            return KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
