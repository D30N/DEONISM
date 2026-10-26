package b.b.a.a;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f724c;
    private c a;

    /* renamed from: b, reason: collision with root package name */
    private c f725b;

    private a() {
        b bVar = new b();
        this.f725b = bVar;
        this.a = bVar;
    }

    public static a b() {
        if (f724c != null) {
            return f724c;
        }
        synchronized (a.class) {
            if (f724c == null) {
                f724c = new a();
            }
        }
        return f724c;
    }

    @Override // b.b.a.a.c
    public boolean a() {
        return this.a.a();
    }
}
