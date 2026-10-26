package d.b.b.j;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f3042b;
    private final Set<f> a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f3042b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f3042b;
                if (dVar == null) {
                    dVar = new d();
                    f3042b = dVar;
                }
            }
        }
        return dVar;
    }

    Set<f> b() {
        Set<f> setUnmodifiableSet;
        synchronized (this.a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.a);
        }
        return setUnmodifiableSet;
    }
}
