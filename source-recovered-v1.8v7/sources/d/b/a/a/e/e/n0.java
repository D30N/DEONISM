package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;
import java.util.List;

/* loaded from: classes.dex */
public final class n0 extends r4<n0, a> implements b6 {
    private static final n0 zzh;
    private static volatile n6<n0> zzi;
    private int zzc;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private z4<String> zzg = r4.D();

    public static final class a extends r4.a<n0, a> implements b6 {
        private a() {
            super(n0.zzh);
        }

        /* synthetic */ a(o0 o0Var) {
            this();
        }
    }

    public enum b implements t4 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);


        /* renamed from: b, reason: collision with root package name */
        private final int f2772b;

        b(int i) {
            this.f2772b = i;
        }

        public static b f(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static v4 g() {
            return t0.a;
        }

        @Override // d.b.a.a.e.e.t4
        public final int a() {
            return this.f2772b;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f2772b + " name=" + name() + '>';
        }
    }

    static {
        n0 n0Var = new n0();
        zzh = n0Var;
        r4.x(n0.class, n0Var);
    }

    private n0() {
    }

    public static n0 M() {
        return zzh;
    }

    public final boolean E() {
        return (this.zzc & 1) != 0;
    }

    public final b F() {
        b bVarF = b.f(this.zzd);
        return bVarF == null ? b.UNKNOWN_MATCH_TYPE : bVarF;
    }

    public final boolean G() {
        return (this.zzc & 2) != 0;
    }

    public final String H() {
        return this.zze;
    }

    public final boolean I() {
        return (this.zzc & 4) != 0;
    }

    public final boolean J() {
        return this.zzf;
    }

    public final List<String> K() {
        return this.zzg;
    }

    public final int L() {
        return this.zzg.size();
    }

    @Override // d.b.a.a.e.e.r4
    protected final Object u(int i, Object obj, Object obj2) {
        o0 o0Var = null;
        switch (o0.a[i - 1]) {
            case 1:
                return new n0();
            case 2:
                return new a(o0Var);
            case 3:
                return r4.v(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzc", "zzd", b.g(), "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                n6<n0> cVar = zzi;
                if (cVar == null) {
                    synchronized (n0.class) {
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
