package d.b.a.a.h;

/* loaded from: classes.dex */
final class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ h f2943b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ r f2944c;

    s(r rVar, h hVar) {
        this.f2944c = rVar;
        this.f2943b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f2944c.f2941b) {
            if (this.f2944c.f2942c != null) {
                this.f2944c.f2942c.a(this.f2943b);
            }
        }
    }
}
