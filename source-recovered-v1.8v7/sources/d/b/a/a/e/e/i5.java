package d.b.a.a.e.e;

/* loaded from: classes.dex */
public class i5 {
    private volatile z5 a;

    /* renamed from: b, reason: collision with root package name */
    private volatile l3 f2718b;

    static {
        e4.a();
    }

    private final z5 c(z5 z5Var) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = z5Var;
                        this.f2718b = l3.f2755c;
                    } catch (y4 unused) {
                        this.a = z5Var;
                        this.f2718b = l3.f2755c;
                    }
                }
            }
        }
        return this.a;
    }

    public final z5 a(z5 z5Var) {
        z5 z5Var2 = this.a;
        this.f2718b = null;
        this.a = z5Var;
        return z5Var2;
    }

    public final int b() {
        if (this.f2718b != null) {
            return this.f2718b.h();
        }
        if (this.a != null) {
            return this.a.c();
        }
        return 0;
    }

    public final l3 d() {
        if (this.f2718b != null) {
            return this.f2718b;
        }
        synchronized (this) {
            if (this.f2718b != null) {
                return this.f2718b;
            }
            this.f2718b = this.a == null ? l3.f2755c : this.a.e();
            return this.f2718b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        z5 z5Var = this.a;
        z5 z5Var2 = i5Var.a;
        return (z5Var == null && z5Var2 == null) ? d().equals(i5Var.d()) : (z5Var == null || z5Var2 == null) ? z5Var != null ? z5Var.equals(i5Var.c(z5Var.f())) : c(z5Var2.f()).equals(z5Var2) : z5Var.equals(z5Var2);
    }

    public int hashCode() {
        return 1;
    }
}
