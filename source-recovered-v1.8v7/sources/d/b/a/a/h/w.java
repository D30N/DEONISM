package d.b.a.a.h;

/* loaded from: classes.dex */
final class w implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ h f2951b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ v f2952c;

    w(v vVar, h hVar) {
        this.f2952c = vVar;
        this.f2951b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f2952c.f2949b) {
            if (this.f2952c.f2950c != null) {
                this.f2952c.f2950c.d(this.f2951b.h());
            }
        }
    }
}
