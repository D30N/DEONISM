package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;

/* loaded from: classes.dex */
public final class m0 extends r4<m0, a> implements b6 {
    private static final m0 zzj;
    private static volatile n6<m0> zzk;
    private int zzc;
    private int zzd;
    private String zze = "";
    private k0 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public static final class a extends r4.a<m0, a> implements b6 {
        private a() {
            super(m0.zzj);
        }

        /* synthetic */ a(o0 o0Var) {
            this();
        }

        public final a w(String str) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((m0) this.f2819c).F(str);
            return this;
        }
    }

    static {
        m0 m0Var = new m0();
        zzj = m0Var;
        r4.x(m0.class, m0Var);
    }

    private m0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    public static a O() {
        return zzj.z();
    }

    public final boolean G() {
        return (this.zzc & 1) != 0;
    }

    public final int H() {
        return this.zzd;
    }

    public final String I() {
        return this.zze;
    }

    public final k0 J() {
        k0 k0Var = this.zzf;
        return k0Var == null ? k0.O() : k0Var;
    }

    public final boolean K() {
        return this.zzg;
    }

    public final boolean L() {
        return this.zzh;
    }

    public final boolean M() {
        return (this.zzc & 32) != 0;
    }

    public final boolean N() {
        return this.zzi;
    }

    @Override // d.b.a.a.e.e.r4
    protected final Object u(int i, Object obj, Object obj2) {
        o0 o0Var = null;
        switch (o0.a[i - 1]) {
            case 1:
                return new m0();
            case 2:
                return new a(o0Var);
            case 3:
                return r4.v(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                n6<m0> cVar = zzk;
                if (cVar == null) {
                    synchronized (m0.class) {
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
