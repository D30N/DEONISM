package d.a.e.j;

/* loaded from: classes.dex */
public class h implements j {

    /* renamed from: d, reason: collision with root package name */
    public static final j f2568d = d(Integer.MAX_VALUE, true, true);
    int a;

    /* renamed from: b, reason: collision with root package name */
    boolean f2569b;

    /* renamed from: c, reason: collision with root package name */
    boolean f2570c;

    private h(int i, boolean z, boolean z2) {
        this.a = i;
        this.f2569b = z;
        this.f2570c = z2;
    }

    public static j d(int i, boolean z, boolean z2) {
        return new h(i, z, z2);
    }

    @Override // d.a.e.j.j
    public boolean a() {
        return this.f2570c;
    }

    @Override // d.a.e.j.j
    public boolean b() {
        return this.f2569b;
    }

    @Override // d.a.e.j.j
    public int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.f2569b == hVar.f2569b && this.f2570c == hVar.f2570c;
    }

    public int hashCode() {
        return (this.a ^ (this.f2569b ? 4194304 : 0)) ^ (this.f2570c ? 8388608 : 0);
    }
}
