package d.a.e.a.a;

import android.graphics.Bitmap;
import d.a.b.d.i;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class e {
    private final c a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private d.a.b.h.a<Bitmap> f2446b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private List<d.a.b.h.a<Bitmap>> f2447c;

    private e(c cVar) {
        i.g(cVar);
        this.a = cVar;
    }

    e(f fVar) {
        c cVarD = fVar.d();
        i.g(cVarD);
        this.a = cVarD;
        fVar.c();
        this.f2446b = fVar.e();
        this.f2447c = fVar.b();
    }

    public static e b(c cVar) {
        return new e(cVar);
    }

    public static f d(c cVar) {
        return new f(cVar);
    }

    public synchronized void a() {
        d.a.b.h.a.o(this.f2446b);
        this.f2446b = null;
        d.a.b.h.a.q(this.f2447c);
        this.f2447c = null;
    }

    public c c() {
        return this.a;
    }
}
