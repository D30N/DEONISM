package d.b.b.j;

import com.google.firebase.components.d;
import com.google.firebase.components.n;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class c implements h {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final d f3041b;

    c(Set<f> set, d dVar) {
        this.a = d(set);
        this.f3041b = dVar;
    }

    public static com.google.firebase.components.d<h> b() {
        d.b bVarA = com.google.firebase.components.d.a(h.class);
        bVarA.b(n.f(f.class));
        bVarA.f(b.b());
        return bVarA.d();
    }

    static /* synthetic */ h c(com.google.firebase.components.e eVar) {
        return new c(eVar.c(f.class), d.a());
    }

    private static String d(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // d.b.b.j.h
    public String a() {
        if (this.f3041b.b().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + d(this.f3041b.b());
    }
}
