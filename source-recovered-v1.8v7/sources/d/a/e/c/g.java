package d.a.e.c;

import java.util.LinkedHashMap;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public class g<K, V> {
    private final v<V> a;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    private final LinkedHashMap<K, V> f2487b = new LinkedHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    private int f2488c = 0;

    public g(v<V> vVar) {
        this.a = vVar;
    }

    private int f(V v) {
        if (v == null) {
            return 0;
        }
        return this.a.a(v);
    }

    public synchronized boolean a(K k) {
        return this.f2487b.containsKey(k);
    }

    @Nullable
    public synchronized V b(K k) {
        return this.f2487b.get(k);
    }

    public synchronized int c() {
        return this.f2487b.size();
    }

    @Nullable
    public synchronized K d() {
        return this.f2487b.isEmpty() ? null : this.f2487b.keySet().iterator().next();
    }

    public synchronized int e() {
        return this.f2488c;
    }

    @Nullable
    public synchronized V g(K k, V v) {
        V vRemove;
        vRemove = this.f2487b.remove(k);
        this.f2488c -= f(vRemove);
        this.f2487b.put(k, v);
        this.f2488c += f(v);
        return vRemove;
    }

    @Nullable
    public synchronized V h(K k) {
        V vRemove;
        vRemove = this.f2487b.remove(k);
        this.f2488c -= f(vRemove);
        return vRemove;
    }
}
