package com.facebook.drawee.g;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.f.g;
import com.facebook.drawee.f.p;
import java.util.Iterator;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class a implements com.facebook.drawee.i.c {
    private final Drawable a = new ColorDrawable(0);

    /* renamed from: b, reason: collision with root package name */
    private final Resources f1209b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private e f1210c;

    /* renamed from: d, reason: collision with root package name */
    private final d f1211d;
    private final com.facebook.drawee.f.f e;
    private final g f;

    a(b bVar) {
        int i = 0;
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("GenericDraweeHierarchy()");
        }
        this.f1209b = bVar.p();
        this.f1210c = bVar.s();
        this.f = new g(this.a);
        int i2 = 1;
        int size = (bVar.j() != null ? bVar.j().size() : 1) + (bVar.m() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[size + 6];
        drawableArr[0] = i(bVar.e(), null);
        drawableArr[1] = i(bVar.k(), bVar.l());
        drawableArr[2] = h(this.f, bVar.d(), bVar.c(), bVar.b());
        drawableArr[3] = i(bVar.n(), bVar.o());
        drawableArr[4] = i(bVar.q(), bVar.r());
        drawableArr[5] = i(bVar.h(), bVar.i());
        if (size > 0) {
            if (bVar.j() != null) {
                Iterator<Drawable> it = bVar.j().iterator();
                while (it.hasNext()) {
                    drawableArr[i + 6] = i(it.next(), null);
                    i++;
                }
                i2 = i;
            }
            if (bVar.m() != null) {
                drawableArr[i2 + 6] = i(bVar.m(), null);
            }
        }
        com.facebook.drawee.f.f fVar = new com.facebook.drawee.f.f(drawableArr);
        this.e = fVar;
        fVar.o(bVar.g());
        d dVar = new d(f.e(this.e, this.f1210c));
        this.f1211d = dVar;
        dVar.mutate();
        n();
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
    }

    @Nullable
    private Drawable h(Drawable drawable, @Nullable p.b bVar, @Nullable PointF pointF, @Nullable ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return f.g(drawable, bVar, pointF);
    }

    @Nullable
    private Drawable i(@Nullable Drawable drawable, @Nullable p.b bVar) {
        return f.f(f.d(drawable, this.f1210c, this.f1209b), bVar);
    }

    private void j(int i) {
        if (i >= 0) {
            this.e.j(i);
        }
    }

    private void k() {
        l(1);
        l(2);
        l(3);
        l(4);
        l(5);
    }

    private void l(int i) {
        if (i >= 0) {
            this.e.k(i);
        }
    }

    private void m() {
        this.f.b(this.a);
    }

    private void n() {
        com.facebook.drawee.f.f fVar = this.e;
        if (fVar != null) {
            fVar.e();
            this.e.i();
            k();
            j(1);
            this.e.l();
            this.e.g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void o(float f) {
        Drawable drawableA = this.e.a(3);
        if (drawableA == 0) {
            return;
        }
        if (f >= 0.999f) {
            if (drawableA instanceof Animatable) {
                ((Animatable) drawableA).stop();
            }
            l(3);
        } else {
            if (drawableA instanceof Animatable) {
                ((Animatable) drawableA).start();
            }
            j(3);
        }
        drawableA.setLevel(Math.round(f * 10000.0f));
    }

    @Override // com.facebook.drawee.i.c
    public void a(float f, boolean z) {
        if (this.e.a(3) == null) {
            return;
        }
        this.e.e();
        o(f);
        if (z) {
            this.e.l();
        }
        this.e.g();
    }

    @Override // com.facebook.drawee.i.c
    public void b(@Nullable Drawable drawable) {
        this.f1211d.p(drawable);
    }

    @Override // com.facebook.drawee.i.b
    public Drawable c() {
        return this.f1211d;
    }

    @Override // com.facebook.drawee.i.c
    public void d(Drawable drawable, float f, boolean z) {
        Drawable drawableD = f.d(drawable, this.f1210c, this.f1209b);
        drawableD.mutate();
        this.f.b(drawableD);
        this.e.e();
        k();
        j(2);
        o(f);
        if (z) {
            this.e.l();
        }
        this.e.g();
    }

    @Override // com.facebook.drawee.i.c
    public void e(Throwable th) {
        this.e.e();
        k();
        if (this.e.a(4) != null) {
            j(4);
        } else {
            j(1);
        }
        this.e.g();
    }

    @Override // com.facebook.drawee.i.c
    public void f(Throwable th) {
        this.e.e();
        k();
        if (this.e.a(5) != null) {
            j(5);
        } else {
            j(1);
        }
        this.e.g();
    }

    @Override // com.facebook.drawee.i.c
    public void g() {
        m();
        n();
    }
}
