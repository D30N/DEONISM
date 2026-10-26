package d.a.e.c;

import d.a.e.c.p;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d.a.e.c.a$a, reason: collision with other inner class name */
    static class C0090a implements v<d.a.e.j.c> {
        C0090a() {
        }

        @Override // d.a.e.c.v
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(d.a.e.j.c cVar) {
            return cVar.f();
        }
    }

    public static h<d.a.a.a.d, d.a.e.j.c> a(d.a.b.d.k<q> kVar, d.a.b.g.c cVar, p.a aVar) {
        h<d.a.a.a.d, d.a.e.j.c> hVar = new h<>(new C0090a(), aVar, kVar);
        cVar.a(hVar);
        return hVar;
    }
}
