package d.a.b.d;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class j {
    public static <E> CopyOnWriteArraySet<E> a() {
        return new CopyOnWriteArraySet<>();
    }

    public static <E> Set<E> b() {
        return c(new IdentityHashMap());
    }

    public static <E> Set<E> c(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }
}
