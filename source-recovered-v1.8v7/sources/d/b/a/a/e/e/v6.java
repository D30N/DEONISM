package d.b.a.a.e.e;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class v6<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: b, reason: collision with root package name */
    private int f2864b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f2865c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ t6 f2866d;

    private v6(t6 t6Var) {
        this.f2866d = t6Var;
        this.f2864b = this.f2866d.f2843c.size();
    }

    /* synthetic */ v6(t6 t6Var, w6 w6Var) {
        this(t6Var);
    }

    private final Iterator<Map.Entry<K, V>> b() {
        if (this.f2865c == null) {
            this.f2865c = this.f2866d.g.entrySet().iterator();
        }
        return this.f2865c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f2864b;
        return (i > 0 && i <= this.f2866d.f2843c.size()) || b().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, V> next;
        if (b().hasNext()) {
            next = b().next();
        } else {
            List list = this.f2866d.f2843c;
            int i = this.f2864b - 1;
            this.f2864b = i;
            next = (Map.Entry<K, V>) list.get(i);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
