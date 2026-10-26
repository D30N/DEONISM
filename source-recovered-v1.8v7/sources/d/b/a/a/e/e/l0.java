package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;

/* loaded from: classes.dex */
public final class l0 extends r4<l0, b> implements b6 {
    private static final l0 zzi;
    private static volatile n6<l0> zzj;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    public enum a implements t4 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);


        /* renamed from: b, reason: collision with root package name */
        private final int f2750b;

        a(int i) {
            this.f2750b = i;
        }

        public static a f(int i) {
            if (i == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i == 1) {
                return LESS_THAN;
            }
            if (i == 2) {
                return GREATER_THAN;
            }
            if (i == 3) {
                return EQUAL;
            }
            if (i != 4) {
                return null;
            }
            return BETWEEN;
        }

        public static v4 g() {
            return p0.a;
        }

        @Override // d.b.a.a.e.e.t4
        public final int a() {
            return this.f2750b;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f2750b + " name=" + name() + '>';
        }
    }

    public static final class b extends r4.a<l0, b> implements b6 {
        private b() {
            super(l0.zzi);
        }

        /* synthetic */ b(o0 o0Var) {
            this();
        }
    }

    static {
        l0 l0Var = new l0();
        zzi = l0Var;
        r4.x(l0.class, l0Var);
    }

    private l0() {
    }

    public static l0 O() {
        return zzi;
    }

    public final boolean E() {
        return (this.zzc & 1) != 0;
    }

    public final a F() {
        a aVarF = a.f(this.zzd);
        return aVarF == null ? a.UNKNOWN_COMPARISON_TYPE : aVarF;
    }

    public final boolean G() {
        return (this.zzc & 2) != 0;
    }

    public final boolean H() {
        return this.zze;
    }

    public final boolean I() {
        return (this.zzc & 4) != 0;
    }

    public final String J() {
        return this.zzf;
    }

    public final boolean K() {
        return (this.zzc & 8) != 0;
    }

    public final String L() {
        return this.zzg;
    }

    public final boolean M() {
        return (this.zzc & 16) != 0;
    }

    public final String N() {
        return this.zzh;
    }

    @Override // d.b.a.a.e.e.r4
    protected final Object u(int i, Object obj, Object obj2) {
        o0 o0Var = null;
        switch (o0.a[i - 1]) {
            case 1:
                return new l0();
            case 2:
                return new b(o0Var);
            case 3:
                return r4.v(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzc", "zzd", a.g(), "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                n6<l0> cVar = zzj;
                if (cVar == null) {
                    synchronized (l0.class) {
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
