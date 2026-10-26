package d.a.e.c;

import android.net.Uri;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class j implements f {
    private static j a;

    protected j() {
    }

    public static synchronized j f() {
        if (a == null) {
            a = new j();
        }
        return a;
    }

    @Override // d.a.e.c.f
    public d.a.a.a.d a(d.a.e.l.a aVar, Object obj) {
        d.a.a.a.d dVar;
        String name;
        d.a.e.l.c cVarF = aVar.f();
        if (cVarF != null) {
            d.a.a.a.d dVarB = cVarF.b();
            name = cVarF.getClass().getName();
            dVar = dVarB;
        } else {
            dVar = null;
            name = null;
        }
        Uri uriP = aVar.p();
        e(uriP);
        return new c(uriP.toString(), aVar.l(), aVar.n(), aVar.c(), dVar, name, obj);
    }

    @Override // d.a.e.c.f
    public d.a.a.a.d b(d.a.e.l.a aVar, Object obj) {
        Uri uriP = aVar.p();
        e(uriP);
        return new c(uriP.toString(), aVar.l(), aVar.n(), aVar.c(), null, null, obj);
    }

    @Override // d.a.e.c.f
    public d.a.a.a.d c(d.a.e.l.a aVar, @Nullable Object obj) {
        return d(aVar, aVar.p(), obj);
    }

    @Override // d.a.e.c.f
    public d.a.a.a.d d(d.a.e.l.a aVar, Uri uri, @Nullable Object obj) {
        e(uri);
        return new d.a.a.a.i(uri.toString());
    }

    protected Uri e(Uri uri) {
        return uri;
    }
}
