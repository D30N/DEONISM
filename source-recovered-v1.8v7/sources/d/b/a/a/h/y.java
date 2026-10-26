package d.b.a.a.h;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
final class y implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ h f2955b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ x f2956c;

    y(x xVar, h hVar) {
        this.f2956c = xVar;
        this.f2955b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            h hVarA = this.f2956c.f2953b.a(this.f2955b.h());
            if (hVarA == null) {
                this.f2956c.c(new NullPointerException("Continuation returned null"));
                return;
            }
            hVarA.d(j.a, this.f2956c);
            hVarA.c(j.a, this.f2956c);
            hVarA.a(j.a, this.f2956c);
        } catch (f e) {
            if (e.getCause() instanceof Exception) {
                this.f2956c.c((Exception) e.getCause());
            } else {
                this.f2956c.c(e);
            }
        } catch (CancellationException unused) {
            this.f2956c.b();
        } catch (Exception e2) {
            this.f2956c.c(e2);
        }
    }
}
