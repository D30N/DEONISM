package d.b.a.a.h;

/* loaded from: classes.dex */
final class u implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ h f2947b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ t f2948c;

    u(t tVar, h hVar) {
        this.f2948c = tVar;
        this.f2947b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f2948c.f2945b) {
            if (this.f2948c.f2946c != null) {
                this.f2948c.f2946c.c(this.f2947b.g());
            }
        }
    }
}
