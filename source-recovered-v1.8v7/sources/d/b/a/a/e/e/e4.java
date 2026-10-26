package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class e4 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile e4 f2668b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile e4 f2669c;

    /* renamed from: d, reason: collision with root package name */
    private static final e4 f2670d = new e4(true);
    private final Map<a, r4.d<?, ?>> a;

    static final class a {
        private final Object a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2671b;

        a(Object obj, int i) {
            this.a = obj;
            this.f2671b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.f2671b == aVar.f2671b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.f2671b;
        }
    }

    e4() {
        this.a = new HashMap();
    }

    private e4(boolean z) {
        this.a = Collections.emptyMap();
    }

    public static e4 a() {
        e4 e4Var = f2668b;
        if (e4Var == null) {
            synchronized (e4.class) {
                e4Var = f2668b;
                if (e4Var == null) {
                    e4Var = f2670d;
                    f2668b = e4Var;
                }
            }
        }
        return e4Var;
    }

    public static e4 c() {
        e4 e4Var = f2669c;
        if (e4Var != null) {
            return e4Var;
        }
        synchronized (e4.class) {
            e4 e4Var2 = f2669c;
            if (e4Var2 != null) {
                return e4Var2;
            }
            e4 e4VarB = q4.b(e4.class);
            f2669c = e4VarB;
            return e4VarB;
        }
    }

    public final <ContainingType extends z5> r4.d<ContainingType, ?> b(ContainingType containingtype, int i) {
        return (r4.d) this.a.get(new a(containingtype, i));
    }
}
