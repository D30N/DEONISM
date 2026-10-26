package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;

/* loaded from: classes.dex */
public final class q0 extends r4<q0, a> implements b6 {
    private static final q0 zzh;
    private static volatile n6<q0> zzi;
    private int zzc;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public static final class a extends r4.a<q0, a> implements b6 {
        private a() {
            super(q0.zzh);
        }

        /* synthetic */ a(v0 v0Var) {
            this();
        }

        public final boolean A() {
            return ((q0) this.f2819c).J();
        }

        public final int B() {
            return ((q0) this.f2819c).K();
        }

        public final a w(String str) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((q0) this.f2819c).G(str);
            return this;
        }

        public final String x() {
            return ((q0) this.f2819c).E();
        }

        public final boolean y() {
            return ((q0) this.f2819c).H();
        }

        public final boolean z() {
            return ((q0) this.f2819c).I();
        }
    }

    static {
        q0 q0Var = new q0();
        zzh = q0Var;
        r4.x(q0.class, q0Var);
    }

    private q0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    public final String E() {
        return this.zzd;
    }

    public final boolean H() {
        return this.zze;
    }

    public final boolean I() {
        return this.zzf;
    }

    public final boolean J() {
        return (this.zzc & 8) != 0;
    }

    public final int K() {
        return this.zzg;
    }

    @Override // d.b.a.a.e.e.r4
    protected final Object u(int i, Object obj, Object obj2) {
        v0 v0Var = null;
        switch (v0.a[i - 1]) {
            case 1:
                return new q0();
            case 2:
                return new a(v0Var);
            case 3:
                return r4.v(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                n6<q0> cVar = zzi;
                if (cVar == null) {
                    synchronized (q0.class) {
                        cVar = zzi;
                        if (cVar == null) {
                            cVar = new r4.c<>(zzh);
                            zzi = cVar;
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
