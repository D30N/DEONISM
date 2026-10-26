package d.a.e.d;

/* loaded from: classes.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    private static final f f2515c = new f(-1, false);

    /* renamed from: d, reason: collision with root package name */
    private static final f f2516d = new f(-1, true);
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2517b;

    private f(int i, boolean z) {
        this.a = i;
        this.f2517b = z;
    }

    public static f a() {
        return f2515c;
    }

    public static f b() {
        return f2516d;
    }

    public boolean c() {
        return this.f2517b;
    }

    public int d() {
        if (f()) {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
        return this.a;
    }

    public boolean e() {
        return this.a != -2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.f2517b == fVar.f2517b;
    }

    public boolean f() {
        return this.a == -1;
    }

    public int hashCode() {
        return d.a.b.k.b.c(Integer.valueOf(this.a), Boolean.valueOf(this.f2517b));
    }

    public String toString() {
        return String.format(null, "%d defer:%b", Integer.valueOf(this.a), Boolean.valueOf(this.f2517b));
    }
}
