package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;
import java.util.List;

/* loaded from: classes.dex */
public final class j0 extends r4<j0, a> implements b6 {
    private static final j0 zzl;
    private static volatile n6<j0> zzm;
    private int zzc;
    private int zzd;
    private String zze = "";
    private z4<k0> zzf = r4.D();
    private boolean zzg;
    private l0 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public static final class a extends r4.a<j0, a> implements b6 {
        private a() {
            super(j0.zzl);
        }

        /* synthetic */ a(o0 o0Var) {
            this();
        }

        public final int A() {
            return ((j0) this.f2819c).N();
        }

        public final a w(int i, k0 k0Var) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((j0) this.f2819c).F(i, k0Var);
            return this;
        }

        public final a x(String str) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((j0) this.f2819c).I(str);
            return this;
        }

        public final k0 y(int i) {
            return ((j0) this.f2819c).E(i);
        }

        public final String z() {
            return ((j0) this.f2819c).L();
        }
    }

    static {
        j0 j0Var = new j0();
        zzl = j0Var;
        r4.x(j0.class, j0Var);
    }

    private j0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(int i, k0 k0Var) {
        k0Var.getClass();
        z4<k0> z4Var = this.zzf;
        if (!z4Var.a()) {
            this.zzf = r4.t(z4Var);
        }
        this.zzf.set(i, k0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    public static a U() {
        return zzl.z();
    }

    public final k0 E(int i) {
        return this.zzf.get(i);
    }

    public final boolean J() {
        return (this.zzc & 1) != 0;
    }

    public final int K() {
        return this.zzd;
    }

    public final String L() {
        return this.zze;
    }

    public final List<k0> M() {
        return this.zzf;
    }

    public final int N() {
        return this.zzf.size();
    }

    public final boolean O() {
        return (this.zzc & 8) != 0;
    }

    public final l0 P() {
        l0 l0Var = this.zzh;
        return l0Var == null ? l0.O() : l0Var;
    }

    public final boolean Q() {
        return this.zzi;
    }

    public final boolean R() {
        return this.zzj;
    }

    public final boolean S() {
        return (this.zzc & 64) != 0;
    }

    public final boolean T() {
        return this.zzk;
    }

    @Override // d.b.a.a.e.e.r4
    protected final Object u(int i, Object obj, Object obj2) {
        o0 o0Var = null;
        switch (o0.a[i - 1]) {
            case 1:
                return new j0();
            case 2:
                return new a(o0Var);
            case 3:
                return r4.v(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", k0.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                n6<j0> cVar = zzm;
                if (cVar == null) {
                    synchronized (j0.class) {
                        cVar = zzm;
                        if (cVar == null) {
                            cVar = new r4.c<>(zzl);
                            zzm = cVar;
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
