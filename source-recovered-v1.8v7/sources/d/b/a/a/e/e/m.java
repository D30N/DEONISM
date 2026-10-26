package d.b.a.a.e.e;

import android.app.Activity;
import d.b.a.a.e.e.g;

/* loaded from: classes.dex */
final class m extends g.a {
    private final /* synthetic */ Activity f;
    private final /* synthetic */ String g;
    private final /* synthetic */ String h;
    private final /* synthetic */ g i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(g gVar, Activity activity, String str, String str2) {
        super(gVar);
        this.i = gVar;
        this.f = activity;
        this.g = str;
        this.h = str2;
    }

    @Override // d.b.a.a.e.e.g.a
    final void a() {
        this.i.h.setCurrentScreen(d.b.a.a.d.b.U(this.f), this.g, this.h, this.f2687b);
    }
}
