package d.b.a.a.e.e;

import d.b.a.a.e.e.r4;
import d.b.a.a.e.e.r4.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class r4<MessageType extends r4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends b3<MessageType, BuilderType> {
    private static Map<Object, r4<?, ?>> zzd = new ConcurrentHashMap();
    protected k7 zzb = k7.a();
    private int zzc = -1;

    public static abstract class a<MessageType extends r4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a3<MessageType, BuilderType> {

        /* renamed from: b, reason: collision with root package name */
        private final MessageType f2818b;

        /* renamed from: c, reason: collision with root package name */
        protected MessageType f2819c;

        /* renamed from: d, reason: collision with root package name */
        protected boolean f2820d = false;

        protected a(MessageType messagetype) {
            this.f2818b = messagetype;
            this.f2819c = (MessageType) messagetype.u(f.f2823d, null, null);
        }

        private static void r(MessageType messagetype, MessageType messagetype2) {
            p6.a().c(messagetype).g(messagetype, messagetype2);
        }

        private final BuilderType s(byte[] bArr, int i, int i2, e4 e4Var) throws y4 {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            try {
                p6.a().c(this.f2819c).i(this.f2819c, bArr, 0, i2 + 0, new g3(e4Var));
                return this;
            } catch (y4 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw y4.a();
            }
        }

        @Override // d.b.a.a.e.e.b6
        public final boolean b() {
            return r4.y(this.f2819c, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Object clone() {
            a aVar = (a) this.f2818b.u(f.e, null, null);
            aVar.q((r4) h());
            return aVar;
        }

        @Override // d.b.a.a.e.e.b6
        public final /* synthetic */ z5 f() {
            return this.f2818b;
        }

        @Override // d.b.a.a.e.e.a3
        protected final /* synthetic */ a3 k(b3 b3Var) {
            q((r4) b3Var);
            return this;
        }

        @Override // d.b.a.a.e.e.a3
        public final /* synthetic */ a3 n(byte[] bArr, int i, int i2) throws y4 {
            s(bArr, 0, i2, e4.a());
            return this;
        }

        @Override // d.b.a.a.e.e.a3
        public final /* synthetic */ a3 o(byte[] bArr, int i, int i2, e4 e4Var) throws y4 {
            s(bArr, 0, i2, e4Var);
            return this;
        }

        public final BuilderType q(MessageType messagetype) {
            if (this.f2820d) {
                t();
                this.f2820d = false;
            }
            r(this.f2819c, messagetype);
            return this;
        }

        protected void t() {
            MessageType messagetype = (MessageType) this.f2819c.u(f.f2823d, null, null);
            r(messagetype, this.f2819c);
            this.f2819c = messagetype;
        }

        @Override // d.b.a.a.e.e.c6
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public MessageType h() {
            if (this.f2820d) {
                return this.f2819c;
            }
            MessageType messagetype = this.f2819c;
            p6.a().c(messagetype).d(messagetype);
            this.f2820d = true;
            return this.f2819c;
        }

        @Override // d.b.a.a.e.e.c6
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public final MessageType i() {
            MessageType messagetype = (MessageType) h();
            if (messagetype.b()) {
                return messagetype;
            }
            throw new i7(messagetype);
        }
    }

    public static abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType> extends r4<MessageType, BuilderType> implements b6 {
        protected h4<e> zzc = h4.c();

        final h4<e> E() {
            if (this.zzc.o()) {
                this.zzc = (h4) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public static class c<T extends r4<T, ?>> extends c3<T> {
        public c(T t) {
        }
    }

    public static class d<ContainingType extends z5, Type> extends b4<ContainingType, Type> {
    }

    static final class e implements j4<e> {
        @Override // d.b.a.a.e.e.j4
        public final int a() {
            throw new NoSuchMethodError();
        }

        @Override // d.b.a.a.e.e.j4
        public final y7 b() {
            throw new NoSuchMethodError();
        }

        @Override // d.b.a.a.e.e.j4
        public final g8 c() {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // d.b.a.a.e.e.j4
        public final boolean d() {
            throw new NoSuchMethodError();
        }

        @Override // d.b.a.a.e.e.j4
        public final boolean e() {
            throw new NoSuchMethodError();
        }

        @Override // d.b.a.a.e.e.j4
        public final j6 k(j6 j6Var, j6 j6Var2) {
            throw new NoSuchMethodError();
        }

        @Override // d.b.a.a.e.e.j4
        public final c6 r(c6 c6Var, z5 z5Var) {
            throw new NoSuchMethodError();
        }
    }

    public enum f {
        public static final int a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f2821b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f2822c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f2823d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        private static final /* synthetic */ int[] h = {1, 2, 3, 4, 5, 6, 7};
        public static final int i = 1;
        public static final int j = 2;
        public static final int k = 1;
        public static final int l = 2;

        public static int[] a() {
            return (int[]) h.clone();
        }
    }

    protected static x4 B() {
        return s4.i();
    }

    protected static w4 C() {
        return n5.i();
    }

    protected static <E> z4<E> D() {
        return o6.j();
    }

    static <T extends r4<?, ?>> T r(Class<T> cls) throws ClassNotFoundException {
        r4<?, ?> r4Var = zzd.get(cls);
        if (r4Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                r4Var = zzd.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (r4Var == null) {
            r4Var = (T) ((r4) r7.c(cls)).u(f.f, null, null);
            if (r4Var == null) {
                throw new IllegalStateException();
            }
            zzd.put(cls, r4Var);
        }
        return (T) r4Var;
    }

    protected static w4 s(w4 w4Var) {
        int size = w4Var.size();
        return w4Var.f(size == 0 ? 10 : size << 1);
    }

    protected static <E> z4<E> t(z4<E> z4Var) {
        int size = z4Var.size();
        return z4Var.f(size == 0 ? 10 : size << 1);
    }

    protected static Object v(z5 z5Var, String str, Object[] objArr) {
        return new q6(z5Var, str, objArr);
    }

    static Object w(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static <T extends r4<?, ?>> void x(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    protected static final <T extends r4<T, ?>> boolean y(T t, boolean z) {
        byte bByteValue = ((Byte) t.u(f.a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zF = p6.a().c(t).f(t);
        if (z) {
            t.u(f.f2821b, zF ? t : null, null);
        }
        return zF;
    }

    public final BuilderType A() {
        BuilderType buildertype = (BuilderType) u(f.e, null, null);
        buildertype.q(this);
        return buildertype;
    }

    @Override // d.b.a.a.e.e.b6
    public final boolean b() {
        return y(this, true);
    }

    @Override // d.b.a.a.e.e.z5
    public final int c() {
        if (this.zzc == -1) {
            this.zzc = p6.a().c(this).e(this);
        }
        return this.zzc;
    }

    @Override // d.b.a.a.e.e.z5
    public final /* synthetic */ c6 d() {
        a aVar = (a) u(f.e, null, null);
        aVar.q(this);
        return aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return p6.a().c(this).c(this, (r4) obj);
        }
        return false;
    }

    @Override // d.b.a.a.e.e.b6
    public final /* synthetic */ z5 f() {
        return (r4) u(f.f, null, null);
    }

    @Override // d.b.a.a.e.e.z5
    public final /* synthetic */ c6 g() {
        return (a) u(f.e, null, null);
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iB = p6.a().c(this).b(this);
        this.zza = iB;
        return iB;
    }

    @Override // d.b.a.a.e.e.z5
    public final void j(y3 y3Var) {
        p6.a().c(this).h(this, a4.P(y3Var));
    }

    @Override // d.b.a.a.e.e.b3
    final int o() {
        return this.zzc;
    }

    @Override // d.b.a.a.e.e.b3
    final void q(int i) {
        this.zzc = i;
    }

    public String toString() {
        return f6.a(this, super.toString());
    }

    protected abstract Object u(int i, Object obj, Object obj2);

    protected final <MessageType extends r4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType z() {
        return (BuilderType) u(f.e, null, null);
    }
}
