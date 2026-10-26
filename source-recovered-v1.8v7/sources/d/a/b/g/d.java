package d.a.b.g;

/* loaded from: classes.dex */
public class d implements c {
    private static d a;

    public static synchronized d b() {
        if (a == null) {
            a = new d();
        }
        return a;
    }

    @Override // d.a.b.g.c
    public void a(b bVar) {
    }
}
