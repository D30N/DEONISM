package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;
import java.util.List;

/* loaded from: classes.dex */
public final class a1 extends r4<a1, a> implements b6 {
    private static final a1 zzj;
    private static volatile n6<a1> zzk;
    private int zzc;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private z4<a1> zzi = r4.D();

    public static final class a extends r4.a<a1, a> implements b6 {
        private a() {
            super(a1.zzj);
        }

        /* synthetic */ a(h1 h1Var) {
            this();
        }

        public final a A(Iterable<? extends a1> iterable) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((a1) this.f2819c).M(iterable);
            return this;
        }

        public final a B(String str) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((a1) this.f2819c).N(str);
            return this;
        }

        public final a C() {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((a1) this.f2819c).j0();
            return this;
        }

        public final a D(String str) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((a1) this.f2819c).S(str);
            return this;
        }

        public final a E() {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((a1) this.f2819c).k0();
            return this;
        }

        public final int F() {
            return ((a1) this.f2819c).f0();
        }

        public final a G() {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((a1) this.f2819c).m0();
            return this;
        }

        public final a w() {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((a1) this.f2819c).i0();
            return this;
        }

        public final a x(double d2) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((a1) this.f2819c).E(d2);
            return this;
        }

        public final a y(long j) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((a1) this.f2819c).F(j);
            return this;
        }

        public final a z(a aVar) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((a1) this.f2819c).X((a1) ((r4) aVar.i()));
            return this;
        }
    }

    static {
        a1 a1Var = new a1();
        zzj = a1Var;
        r4.x(a1.class, a1Var);
    }

    private a1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(double d2) {
        this.zzc |= 16;
        this.zzh = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(long j) {
        this.zzc |= 4;
        this.zzf = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(Iterable<? extends a1> iterable) {
        l0();
        b3.k(iterable, this.zzi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(a1 a1Var) {
        a1Var.getClass();
        l0();
        this.zzi.add(a1Var);
    }

    public static a g0() {
        return zzj.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0() {
        this.zzc &= -3;
        this.zze = zzj.zze;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0() {
        this.zzc &= -5;
        this.zzf = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0() {
        this.zzc &= -17;
        this.zzh = 0.0d;
    }

    private final void l0() {
        z4<a1> z4Var = this.zzi;
        if (z4Var.a()) {
            return;
        }
        this.zzi = r4.t(z4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0() {
        this.zzi = r4.D();
    }

    public final boolean O() {
        return (this.zzc & 1) != 0;
    }

    public final String P() {
        return this.zzd;
    }

    public final boolean U() {
        return (this.zzc & 2) != 0;
    }

    public final String V() {
        return this.zze;
    }

    public final boolean Y() {
        return (this.zzc & 4) != 0;
    }

    public final long Z() {
        return this.zzf;
    }

    public final boolean a0() {
        return (this.zzc & 8) != 0;
    }

    public final float b0() {
        return this.zzg;
    }

    public final boolean c0() {
        return (this.zzc & 16) != 0;
    }

    public final double d0() {
        return this.zzh;
    }

    public final List<a1> e0() {
        return this.zzi;
    }

    public final int f0() {
        return this.zzi.size();
    }

    @Override // d.b.a.a.e.e.r4
    protected final Object u(int i, Object obj, Object obj2) {
        h1 h1Var = null;
        switch (h1.a[i - 1]) {
            case 1:
                return new a1();
            case 2:
                return new a(h1Var);
            case 3:
                return r4.v(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", a1.class});
            case 4:
                return zzj;
            case 5:
                n6<a1> cVar = zzk;
                if (cVar == null) {
                    synchronized (a1.class) {
                        cVar = zzk;
                        if (cVar == null) {
                            cVar = new r4.c<>(zzj);
                            zzk = cVar;
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
