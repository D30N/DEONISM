package d.b.a.a.e.e;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class z1<T> {
    private static final Object f = new Object();

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context g;
    private static volatile o2<n2<v1>> h;
    private static final AtomicInteger i;
    private final g2 a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2898b;

    /* renamed from: c, reason: collision with root package name */
    private final T f2899c;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f2900d;
    private volatile T e;

    static {
        new AtomicReference();
        i = new AtomicInteger();
    }

    private z1(g2 g2Var, String str, T t, boolean z) {
        this.f2900d = -1;
        if (g2Var.a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.a = g2Var;
        this.f2898b = str;
        this.f2899c = t;
    }

    /* synthetic */ z1(g2 g2Var, String str, Object obj, boolean z, b2 b2Var) {
        this(g2Var, str, obj, z);
    }

    private final String f(String str) {
        if (str != null && str.isEmpty()) {
            return this.f2898b;
        }
        String strValueOf = String.valueOf(str);
        String strValueOf2 = String.valueOf(this.f2898b);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    static void g() {
        i.incrementAndGet();
    }

    @Deprecated
    public static void h(Context context) {
        synchronized (f) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (g != context) {
                l1.d();
                j2.b();
                u1.b();
                h = r2.a(c2.f2646b);
                g = context;
                i.incrementAndGet();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static z1<Double> i(g2 g2Var, String str, double d2, boolean z) {
        return new d2(g2Var, str, Double.valueOf(d2), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static z1<Long> j(g2 g2Var, String str, long j, boolean z) {
        return new b2(g2Var, str, Long.valueOf(j), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static z1<String> k(g2 g2Var, String str, String str2, boolean z) {
        return new h2(g2Var, str, str2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static z1<Boolean> l(g2 g2Var, String str, boolean z, boolean z2) {
        return new f2(g2Var, str, Boolean.valueOf(z), true);
    }

    abstract T e(Object obj);

    public final String m() {
        return f(this.a.f2692c);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c A[Catch: all -> 0x00f5, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0023, B:17:0x0035, B:19:0x003b, B:21:0x0047, B:25:0x0060, B:27:0x006a, B:45:0x00bb, B:47:0x00c9, B:49:0x00df, B:50:0x00e2, B:51:0x00e6, B:38:0x009c, B:40:0x00b0, B:44:0x00b9, B:23:0x0058, B:28:0x006f, B:30:0x0078, B:32:0x008a, B:34:0x0095, B:33:0x008f, B:52:0x00eb, B:53:0x00f2, B:54:0x00f3), top: B:61:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9 A[Catch: all -> 0x00f5, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0023, B:17:0x0035, B:19:0x003b, B:21:0x0047, B:25:0x0060, B:27:0x006a, B:45:0x00bb, B:47:0x00c9, B:49:0x00df, B:50:0x00e2, B:51:0x00e6, B:38:0x009c, B:40:0x00b0, B:44:0x00b9, B:23:0x0058, B:28:0x006f, B:30:0x0078, B:32:0x008a, B:34:0x0095, B:33:0x008f, B:52:0x00eb, B:53:0x00f2, B:54:0x00f3), top: B:61:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T n() {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.a.a.e.e.z1.n():java.lang.Object");
    }
}
