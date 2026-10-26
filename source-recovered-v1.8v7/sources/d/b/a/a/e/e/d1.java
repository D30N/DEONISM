package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;

/* loaded from: classes.dex */
public final class d1 extends r4<d1, b> implements b6 {
    private static final d1 zzf;
    private static volatile n6<d1> zzg;
    private int zzc;
    private int zzd = 1;
    private z4<z0> zze = r4.D();

    public enum a implements t4 {
        RADS(1),
        PROVISIONING(2);


        /* renamed from: b, reason: collision with root package name */
        private final int f2654b;

        a(int i) {
            this.f2654b = i;
        }

        public static a f(int i) {
            if (i == 1) {
                return RADS;
            }
            if (i != 2) {
                return null;
            }
            return PROVISIONING;
        }

        public static v4 g() {
            return i1.a;
        }

        @Override // d.b.a.a.e.e.t4
        public final int a() {
            return this.f2654b;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f2654b + " name=" + name() + '>';
        }
    }

    public static final class b extends r4.a<d1, b> implements b6 {
        private b() {
            super(d1.zzf);
        }

        /* synthetic */ b(h1 h1Var) {
            this();
        }
    }

    static {
        d1 d1Var = new d1();
        zzf = d1Var;
        r4.x(d1.class, d1Var);
    }

    private d1() {
    }

    @Override // d.b.a.a.e.e.r4
    protected final Object u(int i, Object obj, Object obj2) {
        h1 h1Var = null;
        switch (h1.a[i - 1]) {
            case 1:
                return new d1();
            case 2:
                return new b(h1Var);
            case 3:
                return r4.v(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzc", "zzd", a.g(), "zze", z0.class});
            case 4:
                return zzf;
            case 5:
                n6<d1> cVar = zzg;
                if (cVar == null) {
                    synchronized (d1.class) {
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
