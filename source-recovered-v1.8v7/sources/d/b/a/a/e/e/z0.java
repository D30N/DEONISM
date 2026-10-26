package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;

/* loaded from: classes.dex */
public final class z0 extends r4<z0, a> implements b6 {
    private static final z0 zzf;
    private static volatile n6<z0> zzg;
    private int zzc;
    private String zzd = "";
    private long zze;

    public static final class a extends r4.a<z0, a> implements b6 {
        private a() {
            super(z0.zzf);
        }

        /* synthetic */ a(h1 h1Var) {
            this();
        }
    }

    static {
        z0 z0Var = new z0();
        zzf = z0Var;
        r4.x(z0.class, z0Var);
    }

    private z0() {
    }

    @Override // d.b.a.a.e.e.r4
    protected final Object u(int i, Object obj, Object obj2) {
        h1 h1Var = null;
        switch (h1.a[i - 1]) {
            case 1:
                return new z0();
            case 2:
                return new a(h1Var);
            case 3:
                return r4.v(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                n6<z0> cVar = zzg;
                if (cVar == null) {
                    synchronized (z0.class) {
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
