package d.b.a.a.e.e;

import d.b.a.a.e.e.g;

/* loaded from: classes.dex */
final class w extends g.a {
    private final /* synthetic */ String g;
    private final /* synthetic */ Object h;
    private final /* synthetic */ g k;
    private final /* synthetic */ int f = 5;
    private final /* synthetic */ Object i = null;
    private final /* synthetic */ Object j = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(g gVar, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.k = gVar;
        this.g = str;
        this.h = obj;
    }

    @Override // d.b.a.a.e.e.g.a
    final void a() {
        this.k.h.logHealthData(this.f, this.g, d.b.a.a.d.b.U(this.h), d.b.a.a.d.b.U(this.i), d.b.a.a.d.b.U(this.j));
    }
}
