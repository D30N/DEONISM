package d.b.a.a.c.m;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class a {
    private static InterfaceC0095a a;

    /* renamed from: d.b.a.a.c.m.a$a, reason: collision with other inner class name */
    public interface InterfaceC0095a {
        ScheduledExecutorService a();
    }

    public static synchronized InterfaceC0095a a() {
        if (a == null) {
            a = new b();
        }
        return a;
    }
}
