package d.a.e.m;

import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class b {

    @Nullable
    private static volatile a a;

    public interface a {
        void a(String str);

        void b();

        boolean c();
    }

    private b() {
    }

    public static void a(String str) {
        c().a(str);
    }

    public static void b() {
        c().b();
    }

    private static a c() {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new d.a.e.m.a();
                }
            }
        }
        return a;
    }

    public static boolean d() {
        return c().c();
    }
}
