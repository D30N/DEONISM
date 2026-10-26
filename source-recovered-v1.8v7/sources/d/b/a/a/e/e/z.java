package d.b.a.a.e.e;

import d.b.a.a.e.e.g;

/* loaded from: classes.dex */
final class z extends g.a {
    private final /* synthetic */ boolean f;
    private final /* synthetic */ g g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(g gVar, boolean z) {
        super(gVar);
        this.g = gVar;
        this.f = z;
    }

    @Override // d.b.a.a.e.e.g.a
    final void a() {
        this.g.h.setDataCollectionEnabled(this.f);
    }
}
