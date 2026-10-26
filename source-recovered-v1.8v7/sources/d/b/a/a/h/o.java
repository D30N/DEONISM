package d.b.a.a.h;

/* loaded from: classes.dex */
final class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ h f2936b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ n f2937c;

    o(n nVar, h hVar) {
        this.f2937c = nVar;
        this.f2936b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            h hVar = (h) this.f2937c.f2934b.a(this.f2936b);
            if (hVar == null) {
                this.f2937c.c(new NullPointerException("Continuation returned null"));
                return;
            }
            hVar.d(j.a, this.f2937c);
            hVar.c(j.a, this.f2937c);
            hVar.a(j.a, this.f2937c);
        } catch (f e) {
            if (e.getCause() instanceof Exception) {
                this.f2937c.f2935c.n((Exception) e.getCause());
            } else {
                this.f2937c.f2935c.n(e);
            }
        } catch (Exception e2) {
            this.f2937c.f2935c.n(e2);
        }
    }
}
