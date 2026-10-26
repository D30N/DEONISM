package d.b.a.a.e.e;

import java.util.Map;

/* loaded from: classes.dex */
final class g5<K> implements Map.Entry<K, Object> {

    /* renamed from: b, reason: collision with root package name */
    private Map.Entry<K, e5> f2696b;

    private g5(Map.Entry<K, e5> entry) {
        this.f2696b = entry;
    }

    public final e5 a() {
        return this.f2696b.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f2696b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f2696b.getValue() == null) {
            return null;
        }
        e5.e();
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof z5) {
            return this.f2696b.getValue().a((z5) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
