package d.b.a.a.e.e;

/* loaded from: classes.dex */
final class o5 extends j5 {
    private o5() {
        super();
    }

    private static <E> z4<E> e(Object obj, long j) {
        return (z4) r7.F(obj, j);
    }

    @Override // d.b.a.a.e.e.j5
    final <E> void b(Object obj, Object obj2, long j) {
        z4 z4VarE = e(obj, j);
        z4 z4VarE2 = e(obj2, j);
        int size = z4VarE.size();
        int size2 = z4VarE2.size();
        if (size > 0 && size2 > 0) {
            if (!z4VarE.a()) {
                z4VarE = z4VarE.f(size2 + size);
            }
            z4VarE.addAll(z4VarE2);
        }
        if (size > 0) {
            z4VarE2 = z4VarE;
        }
        r7.j(obj, j, z4VarE2);
    }

    @Override // d.b.a.a.e.e.j5
    final void d(Object obj, long j) {
        e(obj, j).b();
    }
}
