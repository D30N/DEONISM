package d.b.a.a.e.e;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class v5 implements w5 {
    v5() {
    }

    @Override // d.b.a.a.e.e.w5
    public final Map<?, ?> b(Object obj) {
        return (t5) obj;
    }

    @Override // d.b.a.a.e.e.w5
    public final Object c(Object obj, Object obj2) {
        t5 t5VarE = (t5) obj;
        t5 t5Var = (t5) obj2;
        if (!t5Var.isEmpty()) {
            if (!t5VarE.g()) {
                t5VarE = t5VarE.e();
            }
            t5VarE.d(t5Var);
        }
        return t5VarE;
    }

    @Override // d.b.a.a.e.e.w5
    public final Map<?, ?> d(Object obj) {
        return (t5) obj;
    }

    @Override // d.b.a.a.e.e.w5
    public final u5<?, ?> e(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // d.b.a.a.e.e.w5
    public final boolean f(Object obj) {
        return !((t5) obj).g();
    }

    @Override // d.b.a.a.e.e.w5
    public final Object g(Object obj) {
        return t5.c().e();
    }

    @Override // d.b.a.a.e.e.w5
    public final Object h(Object obj) {
        ((t5) obj).f();
        return obj;
    }

    @Override // d.b.a.a.e.e.w5
    public final int i(int i, Object obj, Object obj2) {
        t5 t5Var = (t5) obj;
        if (t5Var.isEmpty()) {
            return 0;
        }
        Iterator it = t5Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
