package d.b.a.a.e.e;

import d.b.a.a.e.e.a1;
import d.b.a.a.e.e.r4;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class y0 extends r4<y0, a> implements b6 {
    private static final y0 zzi;
    private static volatile n6<y0> zzj;
    private int zzc;
    private z4<a1> zzd = r4.D();
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;

    public static final class a extends r4.a<y0, a> implements b6 {
        private a() {
            super(y0.zzi);
        }

        /* synthetic */ a(h1 h1Var) {
            this();
        }

        public final a A(a1 a1Var) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((y0) this.f2819c).P(a1Var);
            return this;
        }

        public final a B(Iterable<? extends a1> iterable) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((y0) this.f2819c).Q(iterable);
            return this;
        }

        public final a C(String str) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((y0) this.f2819c).R(str);
            return this;
        }

        public final a1 D(int i) {
            return ((y0) this.f2819c).E(i);
        }

        public final List<a1> E() {
            return Collections.unmodifiableList(((y0) this.f2819c).F());
        }

        public final int F() {
            return ((y0) this.f2819c).S();
        }

        public final a G(int i) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((y0) this.f2819c).T(i);
            return this;
        }

        public final a H(long j) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((y0) this.f2819c).U(j);
            return this;
        }

        public final a I() {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((y0) this.f2819c).g0();
            return this;
        }

        public final String J() {
            return ((y0) this.f2819c).W();
        }

        public final long K() {
            return ((y0) this.f2819c).Y();
        }

        public final long L() {
            return ((y0) this.f2819c).a0();
        }

        public final a w(int i, a1.a aVar) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((y0) this.f2819c).G(i, (a1) ((r4) aVar.i()));
            return this;
        }

        public final a x(int i, a1 a1Var) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((y0) this.f2819c).G(i, a1Var);
            return this;
        }

        public final a y(long j) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((y0) this.f2819c).H(j);
            return this;
        }

        public final a z(a1.a aVar) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((y0) this.f2819c).P((a1) ((r4) aVar.i()));
            return this;
        }
    }

    static {
        y0 y0Var = new y0();
        zzi = y0Var;
        r4.x(y0.class, y0Var);
    }

    private y0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(int i, a1 a1Var) {
        a1Var.getClass();
        f0();
        this.zzd.set(i, a1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(long j) {
        this.zzc |= 2;
        this.zzf = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(a1 a1Var) {
        a1Var.getClass();
        f0();
        this.zzd.add(a1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(Iterable<? extends a1> iterable) {
        f0();
        b3.k(iterable, this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(int i) {
        f0();
        this.zzd.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(long j) {
        this.zzc |= 4;
        this.zzg = j;
    }

    public static a d0() {
        return zzi.z();
    }

    private final void f0() {
        z4<a1> z4Var = this.zzd;
        if (z4Var.a()) {
            return;
        }
        this.zzd = r4.t(z4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        this.zzd = r4.D();
    }

    public final a1 E(int i) {
        return this.zzd.get(i);
    }

    public final List<a1> F() {
        return this.zzd;
    }

    public final int S() {
        return this.zzd.size();
    }

    public final String W() {
        return this.zze;
    }

    public final boolean X() {
        return (this.zzc & 2) != 0;
    }

    public final long Y() {
        return this.zzf;
    }

    public final boolean Z() {
        return (this.zzc & 4) != 0;
    }

    public final long a0() {
        return this.zzg;
    }

    public final boolean b0() {
        return (this.zzc & 8) != 0;
    }

    public final int c0() {
        return this.zzh;
    }

    @Override // d.b.a.a.e.e.r4
    protected final Object u(int i, Object obj, Object obj2) {
        h1 h1Var = null;
        switch (h1.a[i - 1]) {
            case 1:
                return new y0();
            case 2:
                return new a(h1Var);
            case 3:
                return r4.v(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", a1.class, "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                n6<y0> cVar = zzj;
                if (cVar == null) {
                    synchronized (y0.class) {
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
