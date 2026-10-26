package d.b.a.a.e.e;

import android.app.Activity;
import d.b.a.a.e.e.g;

/* loaded from: classes.dex */
final class h0 extends g.a {
    private final /* synthetic */ Activity f;
    private final /* synthetic */ g.b g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h0(g.b bVar, Activity activity) {
        super(g.this);
        this.g = bVar;
        this.f = activity;
    }

    @Override // d.b.a.a.e.e.g.a
    final void a() {
        g.this.h.onActivityDestroyed(d.b.a.a.d.b.U(this.f), this.f2688c);
    }
}
