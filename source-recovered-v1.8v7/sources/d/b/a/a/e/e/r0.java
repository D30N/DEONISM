package d.b.a.a.e.e;

import d.b.a.a.e.e.q0;
import d.b.a.a.e.e.r4;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class r0 extends r4<r0, a> implements b6 {
    private static final r0 zzl;
    private static volatile n6<r0> zzm;
    private int zzc;
    private long zzd;
    private int zzf;
    private boolean zzk;
    private String zze = "";
    private z4<s0> zzg = r4.D();
    private z4<q0> zzh = r4.D();
    private z4<i0> zzi = r4.D();
    private String zzj = "";

    public static final class a extends r4.a<r0, a> implements b6 {
        private a() {
            super(r0.zzl);
        }

        /* synthetic */ a(v0 v0Var) {
            this();
        }

        public final a A() {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((r0) this.f2819c).T();
            return this;
        }

        public final int w() {
            return ((r0) this.f2819c).N();
        }

        public final q0 x(int i) {
            return ((r0) this.f2819c).E(i);
        }

        public final a y(int i, q0.a aVar) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((r0) this.f2819c).F(i, (q0) ((r4) aVar.i()));
            return this;
        }

        public final List<i0> z() {
            return Collections.unmodifiableList(((r0) this.f2819c).O());
        }
    }

    static {
        r0 r0Var = new r0();
        zzl = r0Var;
        r4.x(r0.class, r0Var);
    }

    private r0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(int i, q0 q0Var) {
        q0Var.getClass();
        z4<q0> z4Var = this.zzh;
        if (!z4Var.a()) {
            this.zzh = r4.t(z4Var);
        }
        this.zzh.set(i, q0Var);
    }

    public static a Q() {
        return zzl.z();
    }

    public static r0 R() {
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        this.zzi = r4.D();
    }

    public final q0 E(int i) {
        return this.zzh.get(i);
    }

    public final boolean I() {
        return (this.zzc & 1) != 0;
    }

    public final long J() {
        return this.zzd;
    }

    public final boolean K() {
        return (this.zzc & 2) != 0;
    }

    public final String L() {
        return this.zze;
    }

    public final List<s0> M() {
        return this.zzg;
    }

    public final int N() {
        return this.zzh.size();
    }

    public final List<i0> O() {
        return this.zzi;
    }

    public final boolean P() {
        return this.zzk;
    }

    @Override // d.b.a.a.e.e.r4
    protected final Object u(int i, Object obj, Object obj2) {
        v0 v0Var = null;
        switch (v0.a[i - 1]) {
            case 1:
                return new r0();
            case 2:
                return new a(v0Var);
            case 3:
                return r4.v(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", s0.class, "zzh", q0.class, "zzi", i0.class, "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                n6<r0> cVar = zzm;
                if (cVar == null) {
                    synchronized (r0.class) {
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
