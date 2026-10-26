package com.facebook.drawee.f;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class m extends Drawable implements i, q {
    private r D;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f1203b;
    float[] l;
    RectF q;
    Matrix w;
    Matrix x;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f1204c = false;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f1205d = false;
    protected float e = 0.0f;
    protected final Path f = new Path();
    protected boolean g = true;
    protected int h = 0;
    protected final Path i = new Path();
    private final float[] j = new float[8];
    final float[] k = new float[8];
    final RectF m = new RectF();
    final RectF n = new RectF();
    final RectF o = new RectF();
    final RectF p = new RectF();
    final Matrix r = new Matrix();
    final Matrix s = new Matrix();
    final Matrix t = new Matrix();
    final Matrix u = new Matrix();
    final Matrix v = new Matrix();
    final Matrix y = new Matrix();
    private float z = 0.0f;
    private boolean A = false;
    private boolean B = false;
    private boolean C = true;

    m(Drawable drawable) {
        this.f1203b = drawable;
    }

    @Override // com.facebook.drawee.f.i
    public void a(int i, float f) {
        if (this.h == i && this.e == f) {
            return;
        }
        this.h = i;
        this.e = f;
        this.C = true;
        invalidateSelf();
    }

    public boolean b() {
        return this.B;
    }

    boolean c() {
        return this.f1204c || this.f1205d || this.e > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f1203b.clearColorFilter();
    }

    @Override // com.facebook.drawee.f.q
    public void d(r rVar) {
        this.D = rVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("RoundedDrawable#draw");
        }
        this.f1203b.draw(canvas);
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
    }

    protected void e() {
        float[] fArr;
        if (this.C) {
            this.i.reset();
            RectF rectF = this.m;
            float f = this.e;
            rectF.inset(f / 2.0f, f / 2.0f);
            if (this.f1204c) {
                this.i.addCircle(this.m.centerX(), this.m.centerY(), Math.min(this.m.width(), this.m.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.k;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (this.j[i] + this.z) - (this.e / 2.0f);
                    i++;
                }
                this.i.addRoundRect(this.m, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.m;
            float f2 = this.e;
            rectF2.inset((-f2) / 2.0f, (-f2) / 2.0f);
            this.f.reset();
            float f3 = this.z + (this.A ? this.e : 0.0f);
            this.m.inset(f3, f3);
            if (this.f1204c) {
                this.f.addCircle(this.m.centerX(), this.m.centerY(), Math.min(this.m.width(), this.m.height()) / 2.0f, Path.Direction.CW);
            } else if (this.A) {
                if (this.l == null) {
                    this.l = new float[8];
                }
                for (int i2 = 0; i2 < this.k.length; i2++) {
                    this.l[i2] = this.j[i2] - this.e;
                }
                this.f.addRoundRect(this.m, this.l, Path.Direction.CW);
            } else {
                this.f.addRoundRect(this.m, this.j, Path.Direction.CW);
            }
            float f4 = -f3;
            this.m.inset(f4, f4);
            this.f.setFillType(Path.FillType.WINDING);
            this.C = false;
        }
    }

    @Override // com.facebook.drawee.f.i
    public void f(boolean z) {
        if (this.B != z) {
            this.B = z;
            invalidateSelf();
        }
    }

    protected void g() {
        Matrix matrix;
        r rVar = this.D;
        if (rVar != null) {
            rVar.c(this.t);
            this.D.h(this.m);
        } else {
            this.t.reset();
            this.m.set(getBounds());
        }
        this.o.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        this.p.set(this.f1203b.getBounds());
        this.r.setRectToRect(this.o, this.p, Matrix.ScaleToFit.FILL);
        if (this.A) {
            RectF rectF = this.q;
            if (rectF == null) {
                this.q = new RectF(this.m);
            } else {
                rectF.set(this.m);
            }
            RectF rectF2 = this.q;
            float f = this.e;
            rectF2.inset(f, f);
            if (this.w == null) {
                this.w = new Matrix();
            }
            this.w.setRectToRect(this.m, this.q, Matrix.ScaleToFit.FILL);
        } else {
            Matrix matrix2 = this.w;
            if (matrix2 != null) {
                matrix2.reset();
            }
        }
        if (!this.t.equals(this.u) || !this.r.equals(this.s) || ((matrix = this.w) != null && !matrix.equals(this.x))) {
            this.g = true;
            this.t.invert(this.v);
            this.y.set(this.t);
            if (this.A) {
                this.y.postConcat(this.w);
            }
            this.y.preConcat(this.r);
            this.u.set(this.t);
            this.s.set(this.r);
            if (this.A) {
                Matrix matrix3 = this.x;
                if (matrix3 == null) {
                    this.x = new Matrix(this.w);
                } else {
                    matrix3.set(this.w);
                }
            } else {
                Matrix matrix4 = this.x;
                if (matrix4 != null) {
                    matrix4.reset();
                }
            }
        }
        if (this.m.equals(this.n)) {
            return;
        }
        this.C = true;
        this.n.set(this.m);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1203b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f1203b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f1203b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f1203b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f1203b.getOpacity();
    }

    @Override // com.facebook.drawee.f.i
    public void i(boolean z) {
        if (this.A != z) {
            this.A = z;
            this.C = true;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.f.i
    public void j(boolean z) {
        this.f1204c = z;
        this.C = true;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.f.i
    public void k(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.j, 0.0f);
            this.f1205d = false;
        } else {
            d.a.b.d.i.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.j, 0, 8);
            this.f1205d = false;
            for (int i = 0; i < 8; i++) {
                this.f1205d |= fArr[i] > 0.0f;
            }
        }
        this.C = true;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.f.i
    public void l(float f) {
        if (this.z != f) {
            this.z = f;
            this.C = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f1203b.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f1203b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        this.f1203b.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1203b.setColorFilter(colorFilter);
    }
}
