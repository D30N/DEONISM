package d.a.e.c;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class u {

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f2501b = u.class;

    @GuardedBy("this")
    private Map<d.a.a.a.d, d.a.e.j.e> a = new HashMap();

    private u() {
    }

    public static u b() {
        return new u();
    }

    private synchronized void c() {
        d.a.b.e.a.o(f2501b, "Count = %d", Integer.valueOf(this.a.size()));
    }

    @Nullable
    public synchronized d.a.e.j.e a(d.a.a.a.d dVar) {
        d.a.b.d.i.g(dVar);
        d.a.e.j.e eVarF = this.a.get(dVar);
        if (eVarF != null) {
            synchronized (eVarF) {
                if (!d.a.e.j.e.x(eVarF)) {
                    this.a.remove(dVar);
                    d.a.b.e.a.w(f2501b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(eVarF)), dVar.a(), Integer.valueOf(System.identityHashCode(dVar)));
                    return null;
                }
                eVarF = d.a.e.j.e.f(eVarF);
            }
        }
        return eVarF;
    }

    public synchronized void d(d.a.a.a.d dVar, d.a.e.j.e eVar) {
        d.a.b.d.i.g(dVar);
        d.a.b.d.i.b(d.a.e.j.e.x(eVar));
        d.a.e.j.e.g(this.a.put(dVar, d.a.e.j.e.f(eVar)));
        c();
    }

    public boolean e(d.a.a.a.d dVar) {
        d.a.e.j.e eVarRemove;
        d.a.b.d.i.g(dVar);
        synchronized (this) {
            eVarRemove = this.a.remove(dVar);
        }
        if (eVarRemove == null) {
            return false;
        }
        try {
            return eVarRemove.w();
        } finally {
            eVarRemove.close();
        }
    }

    public synchronized boolean f(d.a.a.a.d dVar, d.a.e.j.e eVar) {
        d.a.b.d.i.g(dVar);
        d.a.b.d.i.g(eVar);
        d.a.b.d.i.b(d.a.e.j.e.x(eVar));
        d.a.e.j.e eVar2 = this.a.get(dVar);
        if (eVar2 == null) {
            return false;
        }
        d.a.b.h.a<d.a.b.g.g> aVarI = eVar2.i();
        d.a.b.h.a<d.a.b.g.g> aVarI2 = eVar.i();
        if (aVarI != null && aVarI2 != null) {
            try {
                if (aVarI.r() == aVarI2.r()) {
                    this.a.remove(dVar);
                    d.a.b.h.a.o(aVarI2);
                    d.a.b.h.a.o(aVarI);
                    d.a.e.j.e.g(eVar2);
                    c();
                    return true;
                }
            } finally {
                d.a.b.h.a.o(aVarI2);
                d.a.b.h.a.o(aVarI);
                d.a.e.j.e.g(eVar2);
            }
        }
        return false;
    }
}
