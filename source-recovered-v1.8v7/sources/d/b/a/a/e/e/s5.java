package d.b.a.a.e.e;

/* loaded from: classes.dex */
final class s5 implements a6 {
    private a6[] a;

    s5(a6... a6VarArr) {
        this.a = a6VarArr;
    }

    @Override // d.b.a.a.e.e.a6
    public final boolean a(Class<?> cls) {
        for (a6 a6Var : this.a) {
            if (a6Var.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // d.b.a.a.e.e.a6
    public final x5 b(Class<?> cls) {
        for (a6 a6Var : this.a) {
            if (a6Var.a(cls)) {
                return a6Var.b(cls);
            }
        }
        String strValueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(strValueOf.length() != 0 ? "No factory is available for message type: ".concat(strValueOf) : new String("No factory is available for message type: "));
    }
}
