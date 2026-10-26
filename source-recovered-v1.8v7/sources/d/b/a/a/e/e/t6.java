package d.b.a.a.e.e;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
class t6<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b, reason: collision with root package name */
    private final int f2842b;

    /* renamed from: c, reason: collision with root package name */
    private List<c7> f2843c;

    /* renamed from: d, reason: collision with root package name */
    private Map<K, V> f2844d;
    private boolean e;
    private volatile f7 f;
    private Map<K, V> g;
    private volatile y6 h;

    private t6(int i) {
        this.f2842b = i;
        this.f2843c = Collections.emptyList();
        this.f2844d = Collections.emptyMap();
        this.g = Collections.emptyMap();
    }

    /* synthetic */ t6(int i, w6 w6Var) {
        this(i);
    }

    private final int a(K k) {
        int size = this.f2843c.size() - 1;
        if (size >= 0) {
            int iCompareTo = k.compareTo((Comparable) this.f2843c.get(size).getKey());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int iCompareTo2 = k.compareTo((Comparable) this.f2843c.get(i2).getKey());
            if (iCompareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    static <FieldDescriptorType extends j4<FieldDescriptorType>> t6<FieldDescriptorType, Object> b(int i) {
        return new w6(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V k(int i) {
        p();
        V v = (V) this.f2843c.remove(i).getValue();
        if (!this.f2844d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = q().entrySet().iterator();
            this.f2843c.add(new c7(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        if (this.e) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> q() {
        p();
        if (this.f2844d.isEmpty() && !(this.f2844d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2844d = treeMap;
            this.g = treeMap.descendingMap();
        }
        return (SortedMap) this.f2844d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        p();
        if (!this.f2843c.isEmpty()) {
            this.f2843c.clear();
        }
        if (this.f2844d.isEmpty()) {
            return;
        }
        this.f2844d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f2844d.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        p();
        int iA = a(k);
        if (iA >= 0) {
            return (V) this.f2843c.get(iA).setValue(v);
        }
        p();
        if (this.f2843c.isEmpty() && !(this.f2843c instanceof ArrayList)) {
            this.f2843c = new ArrayList(this.f2842b);
        }
        int i = -(iA + 1);
        if (i >= this.f2842b) {
            return q().put(k, v);
        }
        int size = this.f2843c.size();
        int i2 = this.f2842b;
        if (size == i2) {
            c7 c7VarRemove = this.f2843c.remove(i2 - 1);
            q().put((Comparable) c7VarRemove.getKey(), c7VarRemove.getValue());
        }
        this.f2843c.add(i, new c7(this, k, v));
        return null;
    }

    public void e() {
        if (this.e) {
            return;
        }
        this.f2844d = this.f2844d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f2844d);
        this.g = this.g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.g);
        this.e = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f == null) {
            this.f = new f7(this, null);
        }
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6)) {
            return super.equals(obj);
        }
        t6 t6Var = (t6) obj;
        int size = size();
        if (size != t6Var.size()) {
            return false;
        }
        int iJ = j();
        if (iJ != t6Var.j()) {
            return entrySet().equals(t6Var.entrySet());
        }
        for (int i = 0; i < iJ; i++) {
            if (!h(i).equals(t6Var.h(i))) {
                return false;
            }
        }
        if (iJ != size) {
            return this.f2844d.equals(t6Var.f2844d);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? (V) this.f2843c.get(iA).getValue() : this.f2844d.get(comparable);
    }

    public final Map.Entry<K, V> h(int i) {
        return this.f2843c.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iJ = j();
        int iHashCode = 0;
        for (int i = 0; i < iJ; i++) {
            iHashCode += this.f2843c.get(i).hashCode();
        }
        return this.f2844d.size() > 0 ? iHashCode + this.f2844d.hashCode() : iHashCode;
    }

    public final boolean i() {
        return this.e;
    }

    public final int j() {
        return this.f2843c.size();
    }

    public final Iterable<Map.Entry<K, V>> m() {
        return this.f2844d.isEmpty() ? x6.a() : this.f2844d.entrySet();
    }

    final Set<Map.Entry<K, V>> o() {
        if (this.h == null) {
            this.h = new y6(this, null);
        }
        return this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        p();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return k(iA);
        }
        if (this.f2844d.isEmpty()) {
            return null;
        }
        return this.f2844d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f2843c.size() + this.f2844d.size();
    }
}
