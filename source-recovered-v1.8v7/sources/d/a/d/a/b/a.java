package d.a.d.a.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import d.a.d.a.a.c;
import d.a.d.a.a.d;
import d.a.e.b.f;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class a implements d.a.d.a.a.a, c.b {
    private static final Class<?> m = a.class;
    private final f a;

    /* renamed from: b, reason: collision with root package name */
    private final b f2414b;

    /* renamed from: c, reason: collision with root package name */
    private final d f2415c;

    /* renamed from: d, reason: collision with root package name */
    private final c f2416d;

    @Nullable
    private final d.a.d.a.b.e.a e;

    @Nullable
    private final d.a.d.a.b.e.b f;

    @Nullable
    private Rect h;
    private int i;
    private int j;

    @Nullable
    private InterfaceC0087a l;
    private Bitmap.Config k = Bitmap.Config.ARGB_8888;
    private final Paint g = new Paint(6);

    /* renamed from: d.a.d.a.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC0087a {
        void a(a aVar, int i, int i2);

        void b(a aVar, int i);

        void c(a aVar, int i);
    }

    public a(f fVar, b bVar, d dVar, c cVar, @Nullable d.a.d.a.b.e.a aVar, @Nullable d.a.d.a.b.e.b bVar2) {
        this.a = fVar;
        this.f2414b = bVar;
        this.f2415c = dVar;
        this.f2416d = cVar;
        this.e = aVar;
        this.f = bVar2;
        n();
    }

    private boolean k(int i, @Nullable d.a.b.h.a<Bitmap> aVar, Canvas canvas, int i2) {
        if (!d.a.b.h.a.u(aVar)) {
            return false;
        }
        if (this.h == null) {
            canvas.drawBitmap(aVar.r(), 0.0f, 0.0f, this.g);
        } else {
            canvas.drawBitmap(aVar.r(), (Rect) null, this.h, this.g);
        }
        if (i2 != 3) {
            this.f2414b.c(i, aVar, i2);
        }
        InterfaceC0087a interfaceC0087a = this.l;
        if (interfaceC0087a == null) {
            return true;
        }
        interfaceC0087a.a(this, i, i2);
        return true;
    }

    private boolean l(Canvas canvas, int i, int i2) {
        d.a.b.h.a<Bitmap> aVarA;
        boolean zK;
        int i3 = 3;
        boolean z = false;
        try {
            if (i2 == 0) {
                aVarA = this.f2414b.a(i);
                zK = k(i, aVarA, canvas, 0);
                i3 = 1;
            } else if (i2 == 1) {
                aVarA = this.f2414b.b(i, this.i, this.j);
                if (m(i, aVarA) && k(i, aVarA, canvas, 1)) {
                    z = true;
                }
                zK = z;
                i3 = 2;
            } else if (i2 == 2) {
                aVarA = this.a.a(this.i, this.j, this.k);
                if (m(i, aVarA) && k(i, aVarA, canvas, 2)) {
                    z = true;
                }
                zK = z;
            } else {
                if (i2 != 3) {
                    return false;
                }
                aVarA = this.f2414b.d(i);
                zK = k(i, aVarA, canvas, 3);
                i3 = -1;
            }
            d.a.b.h.a.o(aVarA);
            return (zK || i3 == -1) ? zK : l(canvas, i, i3);
        } catch (RuntimeException e) {
            d.a.b.e.a.v(m, "Failed to create frame bitmap", e);
            return false;
        } finally {
            d.a.b.h.a.o(null);
        }
    }

    private boolean m(int i, @Nullable d.a.b.h.a<Bitmap> aVar) {
        if (!d.a.b.h.a.u(aVar)) {
            return false;
        }
        boolean zA = this.f2416d.a(i, aVar.r());
        if (!zA) {
            d.a.b.h.a.o(aVar);
        }
        return zA;
    }

    private void n() {
        int iC = this.f2416d.c();
        this.i = iC;
        if (iC == -1) {
            Rect rect = this.h;
            this.i = rect == null ? -1 : rect.width();
        }
        int iD = this.f2416d.d();
        this.j = iD;
        if (iD == -1) {
            Rect rect2 = this.h;
            this.j = rect2 != null ? rect2.height() : -1;
        }
    }

    @Override // d.a.d.a.a.d
    public int a() {
        return this.f2415c.a();
    }

    @Override // d.a.d.a.a.d
    public int b() {
        return this.f2415c.b();
    }

    @Override // d.a.d.a.a.a
    public int c() {
        return this.i;
    }

    @Override // d.a.d.a.a.a
    public void clear() {
        this.f2414b.clear();
    }

    @Override // d.a.d.a.a.a
    public int d() {
        return this.j;
    }

    @Override // d.a.d.a.a.a
    public void e(@Nullable Rect rect) {
        this.h = rect;
        this.f2416d.e(rect);
        n();
    }

    @Override // d.a.d.a.a.d
    public int f(int i) {
        return this.f2415c.f(i);
    }

    @Override // d.a.d.a.a.a
    public void g(int i) {
        this.g.setAlpha(i);
    }

    @Override // d.a.d.a.a.c.b
    public void h() {
        clear();
    }

    @Override // d.a.d.a.a.a
    public boolean i(Drawable drawable, Canvas canvas, int i) {
        d.a.d.a.b.e.b bVar;
        InterfaceC0087a interfaceC0087a;
        InterfaceC0087a interfaceC0087a2 = this.l;
        if (interfaceC0087a2 != null) {
            interfaceC0087a2.c(this, i);
        }
        boolean zL = l(canvas, i, 0);
        if (!zL && (interfaceC0087a = this.l) != null) {
            interfaceC0087a.b(this, i);
        }
        d.a.d.a.b.e.a aVar = this.e;
        if (aVar != null && (bVar = this.f) != null) {
            aVar.a(bVar, this.f2414b, this, i);
        }
        return zL;
    }

    @Override // d.a.d.a.a.a
    public void j(@Nullable ColorFilter colorFilter) {
        this.g.setColorFilter(colorFilter);
    }
}
