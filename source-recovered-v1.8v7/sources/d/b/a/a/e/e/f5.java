package d.b.a.a.e.e;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class f5<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: b, reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f2678b;

    public f5(Iterator<Map.Entry<K, Object>> it) {
        this.f2678b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2678b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f2678b.next();
        return next.getValue() instanceof e5 ? new g5(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f2678b.remove();
    }
}
