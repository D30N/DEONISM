package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;
import java.util.List;

/* loaded from: classes.dex */
public final class e1 extends r4<e1, a> implements b6 {
    private static final e1 zzg;
    private static volatile n6<e1> zzh;
    private w4 zzc = r4.C();
    private w4 zzd = r4.C();
    private z4<x0> zze = r4.D();
    private z4<f1> zzf = r4.D();

    public static final class a extends r4.a<e1, a> implements b6 {
        private a() {
            super(e1.zzg);
        }

        /* synthetic */ a(h1 h1Var) {
            this();
        }

        public final a A(int i) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((e1) this.f2819c).Y(i);
            return this;
        }

        public final a B(Iterable<? extends Long> iterable) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((e1) this.f2819c).P(iterable);
            return this;
        }

        public final a C(Iterable<? extends x0> iterable) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((e1) this.f2819c).S(iterable);
            return this;
        }

        public final a D(Iterable<? extends f1> iterable) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((e1) this.f2819c).W(iterable);
            return this;
        }

        public final a w() {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((e1) this.f2819c).f0();
            return this;
        }

        public final a x(int i) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((e1) this.f2819c).U(i);
            return this;
        }

        public final a y(Iterable<? extends Long> iterable) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((e1) this.f2819c).J(iterable);
            return this;
        }

        public final a z() {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((e1) this.f2819c).g0();
            return this;
        }
    }

    static {
        e1 e1Var = new e1();
        zzg = e1Var;
        r4.x(e1.class, e1Var);
    }

    private e1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Iterable<? extends Long> iterable) {
        w4 w4Var = this.zzc;
        if (!w4Var.a()) {
            this.zzc = r4.s(w4Var);
        }
        b3.k(iterable, this.zzc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(Iterable<? extends Long> iterable) {
        w4 w4Var = this.zzd;
        if (!w4Var.a()) {
            this.zzd = r4.s(w4Var);
        }
        b3.k(iterable, this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(Iterable<? extends x0> iterable) {
        h0();
        b3.k(iterable, this.zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(int i) {
        h0();
        this.zze.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(Iterable<? extends f1> iterable) {
        i0();
        b3.k(iterable, this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(int i) {
        i0();
        this.zzf.remove(i);
    }

    public static a c0() {
        return zzg.z();
    }

    public static e1 d0() {
        return zzg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0() {
        this.zzc = r4.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        this.zzd = r4.C();
    }

    private final void h0() {
        z4<x0> z4Var = this.zze;
        if (z4Var.a()) {
            return;
        }
        this.zze = r4.t(z4Var);
    }

    private final void i0() {
        z4<f1> z4Var = this.zzf;
        if (z4Var.a()) {
            return;
        }
        this.zzf = r4.t(z4Var);
    }

    public final x0 E(int i) {
        return this.zze.get(i);
    }

    public final List<Long> F() {
        return this.zzc;
    }

    public final int K() {
        return this.zzc.size();
    }

    public final f1 L(int i) {
        return this.zzf.get(i);
    }

    public final List<Long> Q() {
        return this.zzd;
    }

    public final int T() {
        return this.zzd.size();
    }

    public final List<x0> X() {
        return this.zze;
    }

    public final int Z() {
        return this.zze.size();
    }

    public final List<f1> a0() {
        return this.zzf;
    }

    public final int b0() {
        return this.zzf.size();
    }

    @Override // d.b.a.a.e.e.r4
    protected final Object u(int i, Object obj, Object obj2) {
        h1 h1Var = null;
        switch (h1.a[i - 1]) {
            case 1:
                return new e1();
            case 2:
                return new a(h1Var);
            case 3:
                return r4.v(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", x0.class, "zzf", f1.class});
            case 4:
                return zzg;
            case 5:
                n6<e1> cVar = zzh;
                if (cVar == null) {
                    synchronized (e1.class) {
                        cVar = zzh;
                        if (cVar == null) {
                            cVar = new r4.c<>(zzg);
                            zzh = cVar;
                        }
                    }
                }
                return cVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
