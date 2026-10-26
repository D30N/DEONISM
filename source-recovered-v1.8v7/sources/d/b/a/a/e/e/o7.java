package d.b.a.a.e.e;

import java.util.Iterator;

/* loaded from: classes.dex */
final class o7 implements Iterator<String> {

    /* renamed from: b, reason: collision with root package name */
    private Iterator<String> f2786b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ m7 f2787c;

    o7(m7 m7Var) {
        this.f2787c = m7Var;
        this.f2786b = this.f2787c.f2766b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2786b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f2786b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
