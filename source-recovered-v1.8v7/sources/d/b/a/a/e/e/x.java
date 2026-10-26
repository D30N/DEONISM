package d.b.a.a.e.e;

import d.b.a.a.e.e.g;

/* loaded from: classes.dex */
final class x extends g.a {
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ bd i;
    private final /* synthetic */ g j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(g gVar, String str, String str2, boolean z, bd bdVar) {
        super(gVar);
        this.j = gVar;
        this.f = str;
        this.g = str2;
        this.h = z;
        this.i = bdVar;
    }

    @Override // d.b.a.a.e.e.g.a
    final void a() {
        this.j.h.getUserProperties(this.f, this.g, this.h, this.i);
    }

    @Override // d.b.a.a.e.e.g.a
    protected final void b() {
        this.i.f(null);
    }
}
