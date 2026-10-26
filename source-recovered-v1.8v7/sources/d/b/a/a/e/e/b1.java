package d.b.a.a.e.e;

import d.b.a.a.e.e.c1;
import d.b.a.a.e.e.r4;
import java.util.List;

/* loaded from: classes.dex */
public final class b1 extends r4<b1, a> implements b6 {
    private static final b1 zzd;
    private static volatile n6<b1> zze;
    private z4<c1> zzc = r4.D();

    public static final class a extends r4.a<b1, a> implements b6 {
        private a() {
            super(b1.zzd);
        }

        /* synthetic */ a(h1 h1Var) {
            this();
        }

        public final a w(c1.a aVar) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            ((b1) this.f2819c).H((c1) ((r4) aVar.i()));
            return this;
        }

        public final c1 x(int i) {
            return ((b1) this.f2819c).E(0);
        }
    }

    static {
        b1 b1Var = new b1();
        zzd = b1Var;
        r4.x(b1.class, b1Var);
    }

    private b1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(c1 c1Var) {
        c1Var.getClass();
        z4<c1> z4Var = this.zzc;
        if (!z4Var.a()) {
            this.zzc = r4.t(z4Var);
        }
        this.zzc.add(c1Var);
    }

    public static a I() {
        return zzd.z();
    }

    public final c1 E(int i) {
        return this.zzc.get(0);
    }

    public final List<c1> F() {
        return this.zzc;
    }

    @Override // d.b.a.a.e.e.r4
    protected final Object u(int i, Object obj, Object obj2) {
        h1 h1Var = null;
        switch (h1.a[i - 1]) {
            case 1:
                return new b1();
            case 2:
                return new a(h1Var);
            case 3:
                return r4.v(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", c1.class});
            case 4:
                return zzd;
            case 5:
                n6<b1> cVar = zze;
                if (cVar == null) {
                    synchronized (b1.class) {
                        cVar = zze;
                        if (cVar == null) {
                            cVar = new r4.c<>(zzd);
                            zze = cVar;
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
