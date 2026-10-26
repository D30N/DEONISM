package d.b.a.a.c.m;

import d.b.a.a.c.m.a;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class b implements a.InterfaceC0095a {
    b() {
    }

    @Override // d.b.a.a.c.m.a.InterfaceC0095a
    public final ScheduledExecutorService a() {
        return Executors.newSingleThreadScheduledExecutor();
    }
}
