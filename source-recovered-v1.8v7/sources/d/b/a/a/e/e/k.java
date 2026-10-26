package d.b.a.a.e.e;

import d.b.a.a.e.e.g;

/* loaded from: classes.dex */
final class k extends g.a {
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ bd h;
    private final /* synthetic */ g i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(g gVar, String str, String str2, bd bdVar) {
        super(gVar);
        this.i = gVar;
        this.f = str;
        this.g = str2;
        this.h = bdVar;
    }

    @Override // d.b.a.a.e.e.g.a
    final void a() {
        this.i.h.getConditionalUserProperties(this.f, this.g, this.h);
    }

    @Override // d.b.a.a.e.e.g.a
    protected final void b() {
        this.h.f(null);
    }
}
