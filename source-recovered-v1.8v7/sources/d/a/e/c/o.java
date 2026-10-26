package d.a.e.c;

/* loaded from: classes.dex */
public class o<K, V> implements p<K, V> {
    private final p<K, V> a;

    /* renamed from: b, reason: collision with root package name */
    private final r f2497b;

    public o(p<K, V> pVar, r rVar) {
        this.a = pVar;
        this.f2497b = rVar;
    }

    @Override // d.a.e.c.p
    public d.a.b.h.a<V> b(K k, d.a.b.h.a<V> aVar) {
        this.f2497b.c(k);
        return this.a.b(k, aVar);
    }

    @Override // d.a.e.c.p
    public d.a.b.h.a<V> get(K k) {
        d.a.b.h.a<V> aVar = this.a.get(k);
        r rVar = this.f2497b;
        if (aVar == null) {
            rVar.b(k);
        } else {
            rVar.a(k);
        }
        return aVar;
    }
}
