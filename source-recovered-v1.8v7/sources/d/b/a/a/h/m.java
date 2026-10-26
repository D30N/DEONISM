package d.b.a.a.h;

/* loaded from: classes.dex */
final class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ h f2932b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ l f2933c;

    m(l lVar, h hVar) {
        this.f2933c = lVar;
        this.f2932b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2932b.j()) {
            this.f2933c.f2931c.r();
            return;
        }
        try {
            this.f2933c.f2931c.o(this.f2933c.f2930b.a(this.f2932b));
        } catch (f e) {
            if (e.getCause() instanceof Exception) {
                this.f2933c.f2931c.n((Exception) e.getCause());
            } else {
                this.f2933c.f2931c.n(e);
            }
        } catch (Exception e2) {
            this.f2933c.f2931c.n(e2);
        }
    }
}
