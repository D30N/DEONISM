package d.a.d.a.b.e;

/* loaded from: classes.dex */
public class d implements a {

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f2428b = d.class;
    private final int a;

    public d() {
        this(3);
    }

    public d(int i) {
        this.a = i;
    }

    @Override // d.a.d.a.b.e.a
    public void a(b bVar, d.a.d.a.b.b bVar2, d.a.d.a.a.a aVar, int i) {
        for (int i2 = 1; i2 <= this.a; i2++) {
            int iA = (i + i2) % aVar.a();
            if (d.a.b.e.a.m(2)) {
                d.a.b.e.a.p(f2428b, "Preparing frame %d, last drawn: %d", Integer.valueOf(iA), Integer.valueOf(i));
            }
            if (!bVar.a(bVar2, aVar, iA)) {
                return;
            }
        }
    }
}
