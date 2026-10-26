package d.a.a.b;

import d.a.a.b.d;

/* loaded from: classes.dex */
public class b implements h {

    class a implements g {
        a(b bVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d.a aVar, d.a aVar2) {
            long jB = aVar.b();
            long jB2 = aVar2.b();
            if (jB < jB2) {
                return -1;
            }
            return jB2 == jB ? 0 : 1;
        }
    }

    @Override // d.a.a.b.h
    public g get() {
        return new a(this);
    }
}
