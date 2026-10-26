package d.a.e.e;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: b, reason: collision with root package name */
    private final Executor f2518b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f2519c;
    private final Executor a = Executors.newFixedThreadPool(2, new m(10, "FrescoIoBoundExecutor", true));

    /* renamed from: d, reason: collision with root package name */
    private final Executor f2520d = Executors.newFixedThreadPool(1, new m(10, "FrescoLightWeightBackgroundExecutor", true));

    public b(int i) {
        this.f2518b = Executors.newFixedThreadPool(i, new m(10, "FrescoDecodeExecutor", true));
        this.f2519c = Executors.newFixedThreadPool(i, new m(10, "FrescoBackgroundExecutor", true));
    }

    @Override // d.a.e.e.f
    public Executor a() {
        return this.a;
    }

    @Override // d.a.e.e.f
    public Executor b() {
        return this.f2518b;
    }

    @Override // d.a.e.e.f
    public Executor c() {
        return this.f2520d;
    }

    @Override // d.a.e.e.f
    public Executor d() {
        return this.a;
    }

    @Override // d.a.e.e.f
    public Executor e() {
        return this.a;
    }

    @Override // d.a.e.e.f
    public Executor f() {
        return this.f2519c;
    }
}
