package d.b.a.b.p;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import d.b.a.b.p.d;

/* loaded from: classes.dex */
public class b extends FrameLayout implements d {

    /* renamed from: b, reason: collision with root package name */
    private final c f2970b;

    @Override // d.b.a.b.p.d
    public void a() {
        this.f2970b.a();
        throw null;
    }

    @Override // d.b.a.b.p.d
    public void b() {
        this.f2970b.b();
        throw null;
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        c cVar = this.f2970b;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.c(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f2970b.d();
        throw null;
    }

    @Override // d.b.a.b.p.d
    public int getCircularRevealScrimColor() {
        this.f2970b.e();
        throw null;
    }

    @Override // d.b.a.b.p.d
    public d.e getRevealInfo() {
        this.f2970b.f();
        throw null;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        c cVar = this.f2970b;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.g();
        throw null;
    }

    @Override // d.b.a.b.p.d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f2970b.h(drawable);
        throw null;
    }

    @Override // d.b.a.b.p.d
    public void setCircularRevealScrimColor(int i) {
        this.f2970b.i(i);
        throw null;
    }

    @Override // d.b.a.b.p.d
    public void setRevealInfo(d.e eVar) {
        this.f2970b.j(eVar);
        throw null;
    }
}
