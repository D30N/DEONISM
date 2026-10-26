package d.b.a.a.e.e;

import d.b.a.a.e.e.j0;
import d.b.a.a.e.e.m0;
import d.b.a.a.e.e.r4;
import java.util.List;

/* loaded from: classes.dex */
public final class i0 extends r4<i0, a> implements b6 {
    private static final i0 zzi;
    private static volatile n6<i0> zzj;
    private int zzc;
    private int zzd;
    private z4<m0> zze = r4.D();
    private z4<j0> zzf = r4.D();
    private boolean zzg;
    private boolean zzh;

    public static final class a extends r4.a<i0, a> implements b6 {
        private a() {
            super(i0.zzi);
        }

        /* synthetic */ a(o0 o0Var) {
            this();
        }

        public final int A() {
            return ((i0) this.f2819c).P();
        }

        public final j0 B(int i) {
            return ((i0) this.f2819c).L(i);
        }

        public final int w() {
            return ((i0) this.f2819c).N();
        }

        public final a x(int i, j0.a aVar) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((i0) this.f2819c).F(i, (j0) ((r4) aVar.i()));
            return this;
        }

        public final a y(int i, m0.a aVar) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((i0) this.f2819c).G(i, (m0) ((r4) aVar.i()));
            return this;
        }

        public final m0 z(int i) {
            return ((i0) this.f2819c).E(i);
        }
    }

    static {
        i0 i0Var = new i0();
        zzi = i0Var;
        r4.x(i0.class, i0Var);
    }

    private i0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(int i, j0 j0Var) {
        j0Var.getClass();
        z4<j0> z4Var = this.zzf;
        if (!z4Var.a()) {
            this.zzf = r4.t(z4Var);
        }
        this.zzf.set(i, j0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(int i, m0 m0Var) {
        m0Var.getClass();
        z4<m0> z4Var = this.zze;
        if (!z4Var.a()) {
            this.zze = r4.t(z4Var);
        }
        this.zze.set(i, m0Var);
    }

    public final m0 E(int i) {
        return this.zze.get(i);
    }

    public final boolean J() {
        return (this.zzc & 1) != 0;
    }

    public final int K() {
        return this.zzd;
    }

    public final j0 L(int i) {
        return this.zzf.get(i);
    }

    public final List<m0> M() {
        return this.zze;
    }

    public final int N() {
        return this.zze.size();
    }

    public final List<j0> O() {
        return this.zzf;
    }

    public final int P() {
        return this.zzf.size();
    }

    @Override // d.b.a.a.e.e.r4
    protected final Object u(int i, Object obj, Object obj2) {
        o0 o0Var = null;
        switch (o0.a[i - 1]) {
            case 1:
                return new i0();
            case 2:
                return new a(o0Var);
            case 3:
                return r4.v(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzc", "zzd", "zze", m0.class, "zzf", j0.class, "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                n6<i0> cVar = zzj;
                if (cVar == null) {
                    synchronized (i0.class) {
                        cVar = zzj;
                        if (cVar == null) {
                            cVar = new r4.c<>(zzi);
                            zzj = cVar;
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
