package d.b.a.a.e.e;

import android.os.Bundle;
import d.b.a.a.e.e.g;

/* loaded from: classes.dex */
final class l extends g.a {
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ Bundle h;
    private final /* synthetic */ g i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(g gVar, String str, String str2, Bundle bundle) {
        super(gVar);
        this.i = gVar;
        this.f = str;
        this.g = str2;
        this.h = bundle;
    }

    @Override // d.b.a.a.e.e.g.a
    final void a() {
        this.i.h.clearConditionalUserProperty(this.f, this.g, this.h);
    }
}
