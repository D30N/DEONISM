package d.a.e.a.a;

import android.graphics.Bitmap;
import java.util.List;

/* loaded from: classes.dex */
public class f {
    private final c a;

    /* renamed from: b, reason: collision with root package name */
    private d.a.b.h.a<Bitmap> f2448b;

    /* renamed from: c, reason: collision with root package name */
    private List<d.a.b.h.a<Bitmap>> f2449c;

    /* renamed from: d, reason: collision with root package name */
    private int f2450d;

    f(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e a() {
        try {
            return new e(this);
        } finally {
            d.a.b.h.a.o(this.f2448b);
            this.f2448b = null;
            d.a.b.h.a.q(this.f2449c);
            this.f2449c = null;
        }
    }

    public List<d.a.b.h.a<Bitmap>> b() {
        return d.a.b.h.a.n(this.f2449c);
    }

    public int c() {
        return this.f2450d;
    }

    public c d() {
        return this.a;
    }

    public d.a.b.h.a<Bitmap> e() {
        return d.a.b.h.a.k(this.f2448b);
    }

    public f f(List<d.a.b.h.a<Bitmap>> list) {
        this.f2449c = d.a.b.h.a.n(list);
        return this;
    }

    public f g(int i) {
        this.f2450d = i;
        return this;
    }

    public f h(d.a.b.h.a<Bitmap> aVar) {
        this.f2448b = d.a.b.h.a.k(aVar);
        return this;
    }
}
