package d.b.a.a.e.e;

import android.os.Bundle;
import d.b.a.a.e.e.g;

/* loaded from: classes.dex */
final class a0 extends g.a {
    private final /* synthetic */ Long f;
    private final /* synthetic */ String g;
    private final /* synthetic */ String h;
    private final /* synthetic */ Bundle i;
    private final /* synthetic */ boolean j;
    private final /* synthetic */ boolean k;
    private final /* synthetic */ g l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a0(g gVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(gVar);
        this.l = gVar;
        this.f = l;
        this.g = str;
        this.h = str2;
        this.i = bundle;
        this.j = z;
        this.k = z2;
    }

    @Override // d.b.a.a.e.e.g.a
    final void a() {
        Long l = this.f;
        this.l.h.logEvent(this.g, this.h, this.i, this.j, this.k, l == null ? this.f2687b : l.longValue());
    }
}
