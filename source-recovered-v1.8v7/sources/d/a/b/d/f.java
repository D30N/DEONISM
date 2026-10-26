package d.a.b.d;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class f<K, V> extends HashMap<K, V> {
    private f(Map<? extends K, ? extends V> map) {
        super(map);
    }

    public static <K, V> f<K, V> b(Map<? extends K, ? extends V> map) {
        return new f<>(map);
    }

    public static <K, V> Map<K, V> c(K k, V v) {
        HashMap map = new HashMap(1);
        map.put(k, v);
        return Collections.unmodifiableMap(map);
    }

    public static <K, V> Map<K, V> d(K k, V v, K k2, V v2) {
        HashMap map = new HashMap(2);
        map.put(k, v);
        map.put(k2, v2);
        return Collections.unmodifiableMap(map);
    }
}
