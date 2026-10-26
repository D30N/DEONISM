package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;

/* loaded from: classes.dex */
public final class x0 extends r4<x0, a> implements b6 {
    private static final x0 zzf;
    private static volatile n6<x0> zzg;
    private int zzc;
    private int zzd;
    private long zze;

    public static final class a extends r4.a<x0, a> implements b6 {
        private a() {
            super(x0.zzf);
        }

        /* synthetic */ a(h1 h1Var) {
            this();
        }

        public final a w(int i) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((x0) this.f2819c).E(i);
            return this;
        }

        public final a x(long j) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((x0) this.f2819c).F(j);
            return this;
        }
    }

    static {
        x0 x0Var = new x0();
        zzf = x0Var;
        r4.x(x0.class, x0Var);
    }

    private x0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(long j) {
        this.zzc |= 2;
        this.zze = j;
    }

    public static a M() {
        return zzf.z();
    }

    public final boolean I() {
        return (this.zzc & 1) != 0;
    }

    public final int J() {
        return this.zzd;
    }

    public final boolean K() {
        return (this.zzc & 2) != 0;
    }

    public final long L() {
        return this.zze;
    }

    @Override // d.b.a.a.e.e.r4
    protected final Object u(int i, Object obj, Object obj2) {
        h1 h1Var = null;
        switch (h1.a[i - 1]) {
            case 1:
                return new x0();
            case 2:
                return new a(h1Var);
            case 3:
                return r4.v(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                n6<x0> cVar = zzg;
                if (cVar == null) {
                    synchronized (x0.class) {
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
