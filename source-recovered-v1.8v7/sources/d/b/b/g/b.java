package d.b.b.g;

import android.content.Context;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.n;
import d.b.b.g.c;

/* loaded from: classes.dex */
public class b implements c {
    private d a;

    private b(Context context) {
        this.a = d.a(context);
    }

    public static com.google.firebase.components.d<c> b() {
        d.b bVarA = com.google.firebase.components.d.a(c.class);
        bVarA.b(n.e(Context.class));
        bVarA.f(a.b());
        return bVarA.d();
    }

    static /* synthetic */ c c(e eVar) {
        return new b((Context) eVar.a(Context.class));
    }

    @Override // d.b.b.g.c
    public c.a a(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zC = this.a.c(str, jCurrentTimeMillis);
        boolean zB = this.a.b(jCurrentTimeMillis);
        return (zC && zB) ? c.a.COMBINED : zB ? c.a.GLOBAL : zC ? c.a.SDK : c.a.NONE;
    }
}
