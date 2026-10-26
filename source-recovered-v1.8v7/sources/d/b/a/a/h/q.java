package d.b.a.a.h;

/* loaded from: classes.dex */
final class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ p f2940b;

    q(p pVar) {
        this.f2940b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f2940b.f2938b) {
            if (this.f2940b.f2939c != null) {
                this.f2940b.f2939c.b();
            }
        }
    }
}
