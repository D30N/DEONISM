package d.b.a.a.e.e;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class p6 {

    /* renamed from: c, reason: collision with root package name */
    private static final p6 f2795c = new p6();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, s6<?>> f2796b = new ConcurrentHashMap();
    private final r6 a = new q5();

    private p6() {
    }

    public static p6 a() {
        return f2795c;
    }

    public final <T> s6<T> b(Class<T> cls) {
        u4.f(cls, "messageType");
        s6<T> s6Var = (s6) this.f2796b.get(cls);
        if (s6Var != null) {
            return s6Var;
        }
        s6<T> s6VarA = this.a.a(cls);
        u4.f(cls, "messageType");
        u4.f(s6VarA, "schema");
        s6<T> s6Var2 = (s6) this.f2796b.putIfAbsent(cls, s6VarA);
        return s6Var2 != null ? s6Var2 : s6VarA;
    }

    public final <T> s6<T> c(T t) {
        return b(t.getClass());
    }
}
