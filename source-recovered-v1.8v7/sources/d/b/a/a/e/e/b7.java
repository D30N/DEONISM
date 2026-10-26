package d.b.a.a.e.e;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class b7<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: b, reason: collision with root package name */
    private int f2640b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2641c;

    /* renamed from: d, reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f2642d;
    private final /* synthetic */ t6 e;

    private b7(t6 t6Var) {
        this.e = t6Var;
        this.f2640b = -1;
    }

    /* synthetic */ b7(t6 t6Var, w6 w6Var) {
        this(t6Var);
    }

    private final Iterator<Map.Entry<K, V>> b() {
        if (this.f2642d == null) {
            this.f2642d = this.e.f2844d.entrySet().iterator();
        }
        return this.f2642d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2640b + 1 < this.e.f2843c.size() || (!this.e.f2844d.isEmpty() && b().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f2641c = true;
        int i = this.f2640b + 1;
        this.f2640b = i;
        return i < this.e.f2843c.size() ? (Map.Entry<K, V>) this.e.f2843c.get(this.f2640b) : b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2641c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f2641c = false;
        this.e.p();
        if (this.f2640b >= this.e.f2843c.size()) {
            b().remove();
            return;
        }
        t6 t6Var = this.e;
        int i = this.f2640b;
        this.f2640b = i - 1;
        t6Var.k(i);
    }
}
