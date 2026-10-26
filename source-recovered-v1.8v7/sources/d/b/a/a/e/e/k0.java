package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;

/* loaded from: classes.dex */
public final class k0 extends r4<k0, a> implements b6 {
    private static final k0 zzh;
    private static volatile n6<k0> zzi;
    private int zzc;
    private n0 zzd;
    private l0 zze;
    private boolean zzf;
    private String zzg = "";

    public static final class a extends r4.a<k0, a> implements b6 {
        private a() {
            super(k0.zzh);
        }

        /* synthetic */ a(o0 o0Var) {
            this();
        }

        public final a w(String str) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((k0) this.f2819c).F(str);
            return this;
        }
    }

    static {
        k0 k0Var = new k0();
        zzh = k0Var;
        r4.x(k0.class, k0Var);
    }

    private k0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(String str) {
        str.getClass();
        this.zzc |= 8;
        this.zzg = str;
    }

    public static k0 O() {
        return zzh;
    }

    public final boolean G() {
        return (this.zzc & 1) != 0;
    }

    public final n0 H() {
        n0 n0Var = this.zzd;
        return n0Var == null ? n0.M() : n0Var;
    }

    public final boolean I() {
        return (this.zzc & 2) != 0;
    }

    public final l0 J() {
        l0 l0Var = this.zze;
        return l0Var == null ? l0.O() : l0Var;
    }

    public final boolean K() {
        return (this.zzc & 4) != 0;
    }

    public final boolean L() {
        return this.zzf;
    }

    public final boolean M() {
        return (this.zzc & 8) != 0;
    }

    public final String N() {
        return this.zzg;
    }

    @Override // d.b.a.a.e.e.r4
    protected final Object u(int i, Object obj, Object obj2) {
        o0 o0Var = null;
        switch (o0.a[i - 1]) {
            case 1:
                return new k0();
            case 2:
                return new a(o0Var);
            case 3:
                return r4.v(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                n6<k0> cVar = zzi;
                if (cVar == null) {
                    synchronized (k0.class) {
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
