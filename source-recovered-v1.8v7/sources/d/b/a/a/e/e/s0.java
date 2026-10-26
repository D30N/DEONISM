package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;

/* loaded from: classes.dex */
public final class s0 extends r4<s0, a> implements b6 {
    private static final s0 zzf;
    private static volatile n6<s0> zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    public static final class a extends r4.a<s0, a> implements b6 {
        private a() {
            super(s0.zzf);
        }

        /* synthetic */ a(v0 v0Var) {
            this();
        }
    }

    static {
        s0 s0Var = new s0();
        zzf = s0Var;
        r4.x(s0.class, s0Var);
    }

    private s0() {
    }

    public final String E() {
        return this.zzd;
    }

    public final String F() {
        return this.zze;
    }

    @Override // d.b.a.a.e.e.r4
    protected final Object u(int i, Object obj, Object obj2) {
        v0 v0Var = null;
        switch (v0.a[i - 1]) {
            case 1:
                return new s0();
            case 2:
                return new a(v0Var);
            case 3:
                return r4.v(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                n6<s0> cVar = zzg;
                if (cVar == null) {
                    synchronized (s0.class) {
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
