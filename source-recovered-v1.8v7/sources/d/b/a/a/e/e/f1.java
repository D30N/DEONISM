package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;
import java.util.List;

/* loaded from: classes.dex */
public final class f1 extends r4<f1, a> implements b6 {
    private static final f1 zzf;
    private static volatile n6<f1> zzg;
    private int zzc;
    private int zzd;
    private w4 zze = r4.C();

    public static final class a extends r4.a<f1, a> implements b6 {
        private a() {
            super(f1.zzf);
        }

        /* synthetic */ a(h1 h1Var) {
            this();
        }

        public final a w(int i) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((f1) this.f2819c).K(i);
            return this;
        }

        public final a x(Iterable<? extends Long> iterable) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((f1) this.f2819c).H(iterable);
            return this;
        }
    }

    static {
        f1 f1Var = new f1();
        zzf = f1Var;
        r4.x(f1.class, f1Var);
    }

    private f1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(Iterable<? extends Long> iterable) {
        w4 w4Var = this.zze;
        if (!w4Var.a()) {
            this.zze = r4.s(w4Var);
        }
        b3.k(iterable, this.zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    public static a N() {
        return zzf.z();
    }

    public final long E(int i) {
        return this.zze.g(i);
    }

    public final boolean I() {
        return (this.zzc & 1) != 0;
    }

    public final int J() {
        return this.zzd;
    }

    public final List<Long> L() {
        return this.zze;
    }

    public final int M() {
        return this.zze.size();
    }

    @Override // d.b.a.a.e.e.r4
    protected final Object u(int i, Object obj, Object obj2) {
        h1 h1Var = null;
        switch (h1.a[i - 1]) {
            case 1:
                return new f1();
            case 2:
                return new a(h1Var);
            case 3:
                return r4.v(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                n6<f1> cVar = zzg;
                if (cVar == null) {
                    synchronized (f1.class) {
                        cVar = zzg;
                        if (cVar == null) {
                            cVar = new r4.c<>(zzf);
                            zzg = cVar;
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
