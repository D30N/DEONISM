package d.b.a.a.e.e;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import d.b.a.a.e.e.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class j extends g.a {
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ Context h;
    private final /* synthetic */ Bundle i;
    private final /* synthetic */ g j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(g gVar, String str, String str2, Context context, Bundle bundle) {
        super(gVar);
        this.j = gVar;
        this.f = str;
        this.g = str2;
        this.h = context;
        this.i = bundle;
    }

    @Override // d.b.a.a.e.e.g.a
    public final void a() {
        String str;
        String str2;
        String str3;
        boolean z;
        int iMax;
        try {
            this.j.e = new ArrayList();
            g gVar = this.j;
            if (g.D(this.f, this.g)) {
                String str4 = this.g;
                str2 = this.f;
                str3 = str4;
                str = this.j.a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            g.N(this.h);
            boolean z2 = g.j.booleanValue() || str2 != null;
            this.j.h = this.j.c(this.h, z2);
            if (this.j.h == null) {
                Log.w(this.j.a, "Failed to connect to measurement client.");
                return;
            }
            int iL = g.L(this.h);
            int iJ = g.J(this.h);
            if (z2) {
                iMax = Math.max(iL, iJ);
                z = iJ < iL;
            } else {
                if (iL > 0) {
                    iJ = iL;
                }
                z = iL > 0;
                iMax = iJ;
            }
            this.j.h.initialize(d.b.a.a.d.b.U(this.h), new e(29000L, iMax, z, str, str2, str3, this.i), this.f2687b);
        } catch (Exception e) {
            this.j.n(e, true, false);
        }
    }
}
