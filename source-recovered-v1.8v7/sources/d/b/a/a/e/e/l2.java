package d.b.a.a.e.e;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class l2<T> extends n2<T> {

    /* renamed from: b, reason: collision with root package name */
    static final l2<Object> f2754b = new l2<>();

    private l2() {
    }

    @Override // d.b.a.a.e.e.n2
    public final boolean b() {
        return false;
    }

    @Override // d.b.a.a.e.e.n2
    public final T c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
