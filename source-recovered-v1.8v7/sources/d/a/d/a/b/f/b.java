package d.a.d.a.b.f;

import android.graphics.Bitmap;
import android.graphics.Rect;
import d.a.d.a.b.c;
import d.a.e.a.c.d;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class b implements c {
    private static final Class<?> e = b.class;
    private final d.a.d.a.b.b a;

    /* renamed from: b, reason: collision with root package name */
    private d.a.e.a.a.a f2429b;

    /* renamed from: c, reason: collision with root package name */
    private d f2430c;

    /* renamed from: d, reason: collision with root package name */
    private final d.b f2431d;

    class a implements d.b {
        a() {
        }

        @Override // d.a.e.a.c.d.b
        @Nullable
        public d.a.b.h.a<Bitmap> a(int i) {
            return b.this.a.a(i);
        }

        @Override // d.a.e.a.c.d.b
        public void b(int i, Bitmap bitmap) {
        }
    }

    public b(d.a.d.a.b.b bVar, d.a.e.a.a.a aVar) {
        a aVar2 = new a();
        this.f2431d = aVar2;
        this.a = bVar;
        this.f2429b = aVar;
        this.f2430c = new d(aVar, aVar2);
    }

    @Override // d.a.d.a.b.c
    public boolean a(int i, Bitmap bitmap) {
        try {
            this.f2430c.f(i, bitmap);
            return true;
        } catch (IllegalStateException e2) {
            d.a.b.e.a.g(e, e2, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i));
            return false;
        }
    }

    @Override // d.a.d.a.b.c
    public int c() {
        return this.f2429b.getWidth();
    }

    @Override // d.a.d.a.b.c
    public int d() {
        return this.f2429b.getHeight();
    }

    @Override // d.a.d.a.b.c
    public void e(@Nullable Rect rect) {
        d.a.e.a.a.a aVarG = this.f2429b.g(rect);
        if (aVarG != this.f2429b) {
            this.f2429b = aVarG;
            this.f2430c = new d(aVarG, this.f2431d);
        }
    }
}
