package d.a.e.c;

/* loaded from: classes.dex */
public class m {

    static class a implements r<d.a.a.a.d> {
        final /* synthetic */ n a;

        a(n nVar) {
            this.a = nVar;
        }

        @Override // d.a.e.c.r
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(d.a.a.a.d dVar) {
            this.a.f(dVar);
        }

        @Override // d.a.e.c.r
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(d.a.a.a.d dVar) {
            this.a.h(dVar);
        }

        @Override // d.a.e.c.r
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void c(d.a.a.a.d dVar) {
            this.a.e(dVar);
        }
    }

    public static o<d.a.a.a.d, d.a.b.g.g> a(p<d.a.a.a.d, d.a.b.g.g> pVar, n nVar) {
        nVar.d(pVar);
        return new o<>(pVar, new a(nVar));
    }
}
