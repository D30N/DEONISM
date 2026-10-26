package d.a.a.a;

import d.a.a.a.a;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class g implements a {

    @Nullable
    private static g a;

    private g() {
    }

    public static synchronized g b() {
        if (a == null) {
            a = new g();
        }
        return a;
    }

    @Override // d.a.a.a.a
    public void a(a.EnumC0081a enumC0081a, Class<?> cls, String str, @Nullable Throwable th) {
    }
}
