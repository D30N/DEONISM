package d.a.b.a;

import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class c implements b {

    @Nullable
    private static c a;

    private c() {
    }

    public static synchronized c b() {
        if (a == null) {
            a = new c();
        }
        return a;
    }

    @Override // d.a.b.a.b
    public void a(a aVar) {
    }
}
