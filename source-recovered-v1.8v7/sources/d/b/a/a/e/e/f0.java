package d.b.a.a.e.e;

import android.app.Activity;
import d.b.a.a.e.e.g;

/* loaded from: classes.dex */
final class f0 extends g.a {
    private final /* synthetic */ Activity f;
    private final /* synthetic */ bd g;
    private final /* synthetic */ g.b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f0(g.b bVar, Activity activity, bd bdVar) {
        super(g.this);
        this.h = bVar;
        this.f = activity;
        this.g = bdVar;
    }

    @Override // d.b.a.a.e.e.g.a
    final void a() {
        g.this.h.onActivitySaveInstanceState(d.b.a.a.d.b.U(this.f), this.g, this.f2688c);
    }
}
