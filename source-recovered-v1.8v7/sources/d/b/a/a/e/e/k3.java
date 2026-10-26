package d.b.a.a.e.e;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class k3 extends m3 {

    /* renamed from: b, reason: collision with root package name */
    private int f2738b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final int f2739c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ l3 f2740d;

    k3(l3 l3Var) {
        this.f2740d = l3Var;
        this.f2739c = this.f2740d.h();
    }

    @Override // d.b.a.a.e.e.p3
    public final byte a() {
        int i = this.f2738b;
        if (i >= this.f2739c) {
            throw new NoSuchElementException();
        }
        this.f2738b = i + 1;
        return this.f2740d.o(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2738b < this.f2739c;
    }
}
