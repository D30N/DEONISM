package d.b.a.a.e.e;

import java.util.ListIterator;

/* loaded from: classes.dex */
final class p7 implements ListIterator<String> {

    /* renamed from: b, reason: collision with root package name */
    private ListIterator<String> f2797b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f2798c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ m7 f2799d;

    p7(m7 m7Var, int i) {
        this.f2799d = m7Var;
        this.f2798c = i;
        this.f2797b = this.f2799d.f2766b.listIterator(this.f2798c);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f2797b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2797b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f2797b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2797b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f2797b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2797b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
