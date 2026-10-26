package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;

/* loaded from: classes.dex */
public final class g1 extends r4<g1, a> implements b6 {
    private static final g1 zzj;
    private static volatile n6<g1> zzk;
    private int zzc;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    public static final class a extends r4.a<g1, a> implements b6 {
        private a() {
            super(g1.zzj);
        }

        /* synthetic */ a(h1 h1Var) {
            this();
        }

        public final a A() {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((g1) this.f2819c).d0();
            return this;
        }

        public final a B(long j) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((g1) this.f2819c).N(j);
            return this;
        }

        public final a C(String str) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((g1) this.f2819c).R(str);
            return this;
        }

        public final a D() {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((g1) this.f2819c).e0();
            return this;
        }

        public final a w() {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((g1) this.f2819c).c0();
            return this;
        }

        public final a x(double d2) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((g1) this.f2819c).E(d2);
            return this;
        }

        public final a y(long j) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((g1) this.f2819c).F(j);
            return this;
        }

        public final a z(String str) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((g1) this.f2819c).K(str);
            return this;
        }
    }

    static {
        g1 g1Var = new g1();
        zzj = g1Var;
        r4.x(g1.class, g1Var);
    }

    private g1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(double d2) {
        this.zzc |= 32;
        this.zzi = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(long j) {
        this.zzc |= 1;
        this.zzd = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(long j) {
        this.zzc |= 8;
        this.zzg = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(String str) {
        str.getClass();
        this.zzc |= 4;
        this.zzf = str;
    }

    public static a a0() {
        return zzj.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0() {
        this.zzc &= -5;
        this.zzf = zzj.zzf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0() {
        this.zzc &= -9;
        this.zzg = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0() {
        this.zzc &= -33;
        this.zzi = 0.0d;
    }

    public final boolean L() {
        return (this.zzc & 1) != 0;
    }

    public final long M() {
        return this.zzd;
    }

    public final String S() {
        return this.zze;
    }

    public final boolean U() {
        return (this.zzc & 4) != 0;
    }

    public final String V() {
        return this.zzf;
    }

    public final boolean W() {
        return (this.zzc & 8) != 0;
    }

    public final long X() {
        return this.zzg;
    }

    public final boolean Y() {
        return (this.zzc & 32) != 0;
    }

    public final double Z() {
        return this.zzi;
    }

    @Override // d.b.a.a.e.e.r4
    protected final Object u(int i, Object obj, Object obj2) {
        h1 h1Var = null;
        switch (h1.a[i - 1]) {
            case 1:
                return new g1();
            case 2:
                return new a(h1Var);
            case 3:
                return r4.v(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                n6<g1> cVar = zzk;
                if (cVar == null) {
                    synchronized (g1.class) {
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
