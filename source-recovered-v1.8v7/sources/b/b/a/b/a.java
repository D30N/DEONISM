package b.b.a.b;

import b.b.a.b.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {
    private HashMap<K, b.c<K, V>> f = new HashMap<>();

    public boolean contains(K k) {
        return this.f.containsKey(k);
    }

    @Override // b.b.a.b.b
    protected b.c<K, V> i(K k) {
        return this.f.get(k);
    }

    @Override // b.b.a.b.b
    public V m(K k, V v) {
        b.c<K, V> cVarI = i(k);
        if (cVarI != null) {
            return cVarI.f731c;
        }
        this.f.put(k, l(k, v));
        return null;
    }

    @Override // b.b.a.b.b
    public V n(K k) {
        V v = (V) super.n(k);
        this.f.remove(k);
        return v;
    }

    public Map.Entry<K, V> o(K k) {
        if (contains(k)) {
            return this.f.get(k).e;
        }
        return null;
    }
}
