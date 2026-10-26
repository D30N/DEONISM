package d.b.a.a.e.e;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class r7 {
    private static final Logger a = Logger.getLogger(r7.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final Unsafe f2824b = t();

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f2825c = e3.c();

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f2826d = B(Long.TYPE);
    private static final boolean e = B(Integer.TYPE);
    private static final c f;
    private static final boolean g;
    private static final boolean h;
    private static final long i;
    static final boolean j;

    static final class a extends c {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // d.b.a.a.e.e.r7.c
        public final byte a(Object obj, long j) {
            return r7.j ? r7.L(obj, j) : r7.M(obj, j);
        }

        @Override // d.b.a.a.e.e.r7.c
        public final void b(Object obj, long j, byte b2) {
            if (r7.j) {
                r7.u(obj, j, b2);
            } else {
                r7.y(obj, j, b2);
            }
        }

        @Override // d.b.a.a.e.e.r7.c
        public final void c(Object obj, long j, double d2) {
            f(obj, j, Double.doubleToLongBits(d2));
        }

        @Override // d.b.a.a.e.e.r7.c
        public final void d(Object obj, long j, float f) {
            e(obj, j, Float.floatToIntBits(f));
        }

        @Override // d.b.a.a.e.e.r7.c
        public final void g(Object obj, long j, boolean z) {
            if (r7.j) {
                r7.z(obj, j, z);
            } else {
                r7.D(obj, j, z);
            }
        }

        @Override // d.b.a.a.e.e.r7.c
        public final boolean h(Object obj, long j) {
            return r7.j ? r7.N(obj, j) : r7.O(obj, j);
        }

        @Override // d.b.a.a.e.e.r7.c
        public final float i(Object obj, long j) {
            return Float.intBitsToFloat(k(obj, j));
        }

        @Override // d.b.a.a.e.e.r7.c
        public final double j(Object obj, long j) {
            return Double.longBitsToDouble(l(obj, j));
        }
    }

    static final class b extends c {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // d.b.a.a.e.e.r7.c
        public final byte a(Object obj, long j) {
            return r7.j ? r7.L(obj, j) : r7.M(obj, j);
        }

        @Override // d.b.a.a.e.e.r7.c
        public final void b(Object obj, long j, byte b2) {
            if (r7.j) {
                r7.u(obj, j, b2);
            } else {
                r7.y(obj, j, b2);
            }
        }

        @Override // d.b.a.a.e.e.r7.c
        public final void c(Object obj, long j, double d2) {
            f(obj, j, Double.doubleToLongBits(d2));
        }

        @Override // d.b.a.a.e.e.r7.c
        public final void d(Object obj, long j, float f) {
            e(obj, j, Float.floatToIntBits(f));
        }

        @Override // d.b.a.a.e.e.r7.c
        public final void g(Object obj, long j, boolean z) {
            if (r7.j) {
                r7.z(obj, j, z);
            } else {
                r7.D(obj, j, z);
            }
        }

        @Override // d.b.a.a.e.e.r7.c
        public final boolean h(Object obj, long j) {
            return r7.j ? r7.N(obj, j) : r7.O(obj, j);
        }

        @Override // d.b.a.a.e.e.r7.c
        public final float i(Object obj, long j) {
            return Float.intBitsToFloat(k(obj, j));
        }

        @Override // d.b.a.a.e.e.r7.c
        public final double j(Object obj, long j) {
            return Double.longBitsToDouble(l(obj, j));
        }
    }

    static abstract class c {
        Unsafe a;

        c(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract byte a(Object obj, long j);

        public abstract void b(Object obj, long j, byte b2);

        public abstract void c(Object obj, long j, double d2);

        public abstract void d(Object obj, long j, float f);

        public final void e(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final void f(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public abstract void g(Object obj, long j, boolean z);

        public abstract boolean h(Object obj, long j);

        public abstract float i(Object obj, long j);

        public abstract double j(Object obj, long j);

        public final int k(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long l(Object obj, long j) {
            return this.a.getLong(obj, j);
        }
    }

    static final class d extends c {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // d.b.a.a.e.e.r7.c
        public final byte a(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        @Override // d.b.a.a.e.e.r7.c
        public final void b(Object obj, long j, byte b2) {
            this.a.putByte(obj, j, b2);
        }

        @Override // d.b.a.a.e.e.r7.c
        public final void c(Object obj, long j, double d2) {
            this.a.putDouble(obj, j, d2);
        }

        @Override // d.b.a.a.e.e.r7.c
        public final void d(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // d.b.a.a.e.e.r7.c
        public final void g(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // d.b.a.a.e.e.r7.c
        public final boolean h(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // d.b.a.a.e.e.r7.c
        public final float i(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // d.b.a.a.e.e.r7.c
        public final double j(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }
    }

    static {
        c cVar;
        c dVar = null;
        if (f2824b != null) {
            if (!e3.b()) {
                dVar = new d(f2824b);
            } else if (f2826d) {
                dVar = new a(f2824b);
            } else if (e) {
                dVar = new b(f2824b);
            }
        }
        f = dVar;
        g = E();
        h = A();
        i = n(byte[].class);
        n(boolean[].class);
        s(boolean[].class);
        n(int[].class);
        s(int[].class);
        n(long[].class);
        s(long[].class);
        n(float[].class);
        s(float[].class);
        n(double[].class);
        s(double[].class);
        n(Object[].class);
        s(Object[].class);
        Field fieldG = G();
        if (fieldG != null && (cVar = f) != null) {
            cVar.a.objectFieldOffset(fieldG);
        }
        j = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private r7() {
    }

    private static boolean A() {
        Unsafe unsafe = f2824b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (e3.b()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean B(Class<?> cls) {
        if (!e3.b()) {
            return false;
        }
        try {
            Class<?> cls2 = f2825c;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static double C(Object obj, long j2) {
        return f.j(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(Object obj, long j2, boolean z) {
        y(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    private static boolean E() {
        Unsafe unsafe = f2824b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (G() == null) {
                return false;
            }
            if (e3.b()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    static Object F(Object obj, long j2) {
        return f.a.getObject(obj, j2);
    }

    private static Field G() {
        Field fieldD;
        if (e3.b() && (fieldD = d(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldD;
        }
        Field fieldD2 = d(Buffer.class, "address");
        if (fieldD2 == null || fieldD2.getType() != Long.TYPE) {
            return null;
        }
        return fieldD2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte L(Object obj, long j2) {
        return (byte) (b(obj, (-4) & j2) >>> ((int) (((j2 ^ (-1)) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte M(Object obj, long j2) {
        return (byte) (b(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean N(Object obj, long j2) {
        return L(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean O(Object obj, long j2) {
        return M(obj, j2) != 0;
    }

    static byte a(byte[] bArr, long j2) {
        return f.a(bArr, i + j2);
    }

    static int b(Object obj, long j2) {
        return f.k(obj, j2);
    }

    static <T> T c(Class<T> cls) {
        try {
            return (T) f2824b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static Field d(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void f(Object obj, long j2, double d2) {
        f.c(obj, j2, d2);
    }

    static void g(Object obj, long j2, float f2) {
        f.d(obj, j2, f2);
    }

    static void h(Object obj, long j2, int i2) {
        f.e(obj, j2, i2);
    }

    static void i(Object obj, long j2, long j3) {
        f.f(obj, j2, j3);
    }

    static void j(Object obj, long j2, Object obj2) {
        f.a.putObject(obj, j2, obj2);
    }

    static void k(Object obj, long j2, boolean z) {
        f.g(obj, j2, z);
    }

    static void l(byte[] bArr, long j2, byte b2) {
        f.b(bArr, i + j2, b2);
    }

    static boolean m() {
        return h;
    }

    private static int n(Class<?> cls) {
        if (h) {
            return f.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static long o(Object obj, long j2) {
        return f.l(obj, j2);
    }

    static boolean r() {
        return g;
    }

    private static int s(Class<?> cls) {
        if (h) {
            return f.a.arrayIndexScale(cls);
        }
        return -1;
    }

    static Unsafe t() {
        try {
            return (Unsafe) AccessController.doPrivileged(new q7());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = ((((int) j2) ^ (-1)) & 3) << 3;
        h(obj, j3, ((255 & b2) << i2) | (b(obj, j3) & ((255 << i2) ^ (-1))));
    }

    static boolean w(Object obj, long j2) {
        return f.h(obj, j2);
    }

    static float x(Object obj, long j2) {
        return f.i(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        h(obj, j3, ((255 & b2) << i2) | (b(obj, j3) & ((255 << i2) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z(Object obj, long j2, boolean z) {
        u(obj, j2, z ? (byte) 1 : (byte) 0);
    }
}
