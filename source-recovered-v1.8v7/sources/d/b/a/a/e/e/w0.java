package d.b.a.a.e.e;

import d.b.a.a.e.e.e1;
import d.b.a.a.e.e.r4;

/* loaded from: classes.dex */
public final class w0 extends r4<w0, a> implements b6 {
    private static final w0 zzh;
    private static volatile n6<w0> zzi;
    private int zzc;
    private int zzd;
    private e1 zze;
    private e1 zzf;
    private boolean zzg;

    public static final class a extends r4.a<w0, a> implements b6 {
        private a() {
            super(w0.zzh);
        }

        /* synthetic */ a(h1 h1Var) {
            this();
        }

        public final a w(int i) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((w0) this.f2819c).E(i);
            return this;
        }

        public final a x(e1.a aVar) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((w0) this.f2819c).I((e1) ((r4) aVar.i()));
            return this;
        }

        public final a y(e1 e1Var) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((w0) this.f2819c).N(e1Var);
            return this;
        }

        public final a z(boolean z) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((w0) this.f2819c).J(z);
            return this;
        }
    }

    static {
        w0 w0Var = new w0();
        zzh = w0Var;
        r4.x(w0.class, w0Var);
    }

    private w0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(e1 e1Var) {
        e1Var.getClass();
        this.zze = e1Var;
        this.zzc |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(boolean z) {
        this.zzc |= 8;
        this.zzg = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(e1 e1Var) {
        e1Var.getClass();
        this.zzf = e1Var;
        this.zzc |= 4;
    }

    public static a T() {
        return zzh.z();
    }

    public final boolean K() {
        return (this.zzc & 1) != 0;
    }

    public final int L() {
        return this.zzd;
    }

    public final e1 O() {
        e1 e1Var = this.zze;
        return e1Var == null ? e1.d0() : e1Var;
    }

    public final boolean P() {
        return (this.zzc & 4) != 0;
    }

    public final e1 Q() {
        e1 e1Var = this.zzf;
        return e1Var == null ? e1.d0() : e1Var;
    }

    public final boolean R() {
        return (this.zzc & 8) != 0;
    }

    public final boolean S() {
        return this.zzg;
    }

    @Override // d.b.a.a.e.e.r4
    protected final Object u(int i, Object obj, Object obj2) {
        h1 h1Var = null;
        switch (h1.a[i - 1]) {
            case 1:
                return new w0();
            case 2:
                return new a(h1Var);
            case 3:
                return r4.v(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                n6<w0> cVar = zzi;
                if (cVar == null) {
                    synchronized (w0.class) {
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
