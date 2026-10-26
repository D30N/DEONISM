package d.b.a.a.e.e;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class m7 extends AbstractList<String> implements k5, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private final k5 f2766b;

    public m7(k5 k5Var) {
        this.f2766b = k5Var;
    }

    @Override // d.b.a.a.e.e.k5
    public final List<?> d() {
        return this.f2766b.d();
    }

    @Override // d.b.a.a.e.e.k5
    public final k5 e() {
        return this;
    }

    @Override // d.b.a.a.e.e.k5
    public final Object g(int i) {
        return this.f2766b.g(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.f2766b.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new o7(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new p7(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2766b.size();
    }

    @Override // d.b.a.a.e.e.k5
    public final void t(l3 l3Var) {
        throw new UnsupportedOperationException();
    }
}
