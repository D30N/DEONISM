package d.b.a.b.p.e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import d.b.a.b.p.c;
import d.b.a.b.p.d;

/* loaded from: classes.dex */
public class a extends d.b.a.b.n.a implements d {
    private final c o;

    @Override // d.b.a.b.p.d
    public void a() {
        this.o.a();
        throw null;
    }

    @Override // d.b.a.b.p.d
    public void b() {
        this.o.b();
        throw null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        c cVar = this.o;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.c(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.o.d();
        throw null;
    }

    @Override // d.b.a.b.p.d
    public int getCircularRevealScrimColor() {
        this.o.e();
        throw null;
    }

    @Override // d.b.a.b.p.d
    public d.e getRevealInfo() {
        this.o.f();
        throw null;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        c cVar = this.o;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.g();
        throw null;
    }

    @Override // d.b.a.b.p.d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.o.h(drawable);
        throw null;
    }

    @Override // d.b.a.b.p.d
    public void setCircularRevealScrimColor(int i) {
        this.o.i(i);
        throw null;
    }

    @Override // d.b.a.b.p.d
    public void setRevealInfo(d.e eVar) {
        this.o.j(eVar);
        throw null;
    }
}
