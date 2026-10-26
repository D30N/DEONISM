package d.b.a.a.e.e;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class y6 extends f7 {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ t6 f2889c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private y6(t6 t6Var) {
        super(t6Var, null);
        this.f2889c = t6Var;
    }

    /* synthetic */ y6(t6 t6Var, w6 w6Var) {
        this(t6Var);
    }

    @Override // d.b.a.a.e.e.f7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new v6(this.f2889c, null);
    }
}
