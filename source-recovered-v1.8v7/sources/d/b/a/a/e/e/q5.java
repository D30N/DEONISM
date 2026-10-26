package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;

/* loaded from: classes.dex */
final class q5 implements r6 {

    /* renamed from: b, reason: collision with root package name */
    private static final a6 f2809b = new p5();
    private final a6 a;

    public q5() {
        this(new s5(p4.c(), b()));
    }

    private q5(a6 a6Var) {
        u4.f(a6Var, "messageInfoFactory");
        this.a = a6Var;
    }

    private static a6 b() {
        try {
            return (a6) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f2809b;
        }
    }

    private static boolean c(x5 x5Var) {
        return x5Var.a() == r4.f.i;
    }

    @Override // d.b.a.a.e.e.r6
    public final <T> s6<T> a(Class<T> cls) {
        u6.p(cls);
        x5 x5VarB = this.a.b(cls);
        if (x5VarB.b()) {
            return r4.class.isAssignableFrom(cls) ? g6.j(u6.B(), i4.a(), x5VarB.c()) : g6.j(u6.f(), i4.b(), x5VarB.c());
        }
        if (!r4.class.isAssignableFrom(cls)) {
            boolean zC = c(x5VarB);
            i6 i6VarA = k6.a();
            j5 j5VarA = j5.a();
            return zC ? e6.q(cls, x5VarB, i6VarA, j5VarA, u6.f(), i4.b(), y5.a()) : e6.q(cls, x5VarB, i6VarA, j5VarA, u6.v(), null, y5.a());
        }
        boolean zC2 = c(x5VarB);
        i6 i6VarB = k6.b();
        j5 j5VarC = j5.c();
        l7<?, ?> l7VarB = u6.B();
        return zC2 ? e6.q(cls, x5VarB, i6VarB, j5VarC, l7VarB, i4.a(), y5.b()) : e6.q(cls, x5VarB, i6VarB, j5VarC, l7VarB, null, y5.b());
    }
}
