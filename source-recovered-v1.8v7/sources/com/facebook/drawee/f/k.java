package com.facebook.drawee.f;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class k extends Drawable implements i {

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    float[] f1199d;

    /* renamed from: b, reason: collision with root package name */
    private final float[] f1197b = new float[8];

    /* renamed from: c, reason: collision with root package name */
    final float[] f1198c = new float[8];
    final Paint e = new Paint(1);
    private boolean f = false;
    private float g = 0.0f;
    private float h = 0.0f;
    private int i = 0;
    private boolean j = false;
    private boolean k = false;
    final Path l = new Path();
    final Path m = new Path();
    private int n = 0;
    private final RectF o = new RectF();
    private int p = 255;

    public k(int i) {
        d(i);
    }

    @TargetApi(11)
    public static k b(ColorDrawable colorDrawable) {
        return new k(colorDrawable.getColor());
    }

    private void e() {
        float[] fArr;
        float[] fArr2;
        this.l.reset();
        this.m.reset();
        this.o.set(getBounds());
        RectF rectF = this.o;
        float f = this.g;
        rectF.inset(f / 2.0f, f / 2.0f);
        int i = 0;
        if (this.f) {
            this.m.addCircle(this.o.centerX(), this.o.centerY(), Math.min(this.o.width(), this.o.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr = this.f1198c;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = (this.f1197b[i2] + this.h) - (this.g / 2.0f);
                i2++;
            }
            this.m.addRoundRect(this.o, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.o;
        float f2 = this.g;
        rectF2.inset((-f2) / 2.0f, (-f2) / 2.0f);
        float f3 = this.h + (this.j ? this.g : 0.0f);
        this.o.inset(f3, f3);
        if (this.f) {
            this.l.addCircle(this.o.centerX(), this.o.centerY(), Math.min(this.o.width(), this.o.height()) / 2.0f, Path.Direction.CW);
        } else if (this.j) {
            if (this.f1199d == null) {
                this.f1199d = new float[8];
            }
            while (true) {
                fArr2 = this.f1199d;
                if (i >= fArr2.length) {
                    break;
                }
                fArr2[i] = this.f1197b[i] - this.g;
                i++;
            }
            this.l.addRoundRect(this.o, fArr2, Path.Direction.CW);
        } else {
            this.l.addRoundRect(this.o, this.f1197b, Path.Direction.CW);
        }
        float f4 = -f3;
        this.o.inset(f4, f4);
    }

    @Override // com.facebook.drawee.f.i
    public void a(int i, float f) {
        if (this.i != i) {
            this.i = i;
            invalidateSelf();
        }
        if (this.g != f) {
            this.g = f;
            e();
            invalidateSelf();
        }
    }

    public boolean c() {
        return this.k;
    }

    public void d(int i) {
        if (this.n != i) {
            this.n = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.e.setColor(e.c(this.n, this.p));
        this.e.setStyle(Paint.Style.FILL);
        this.e.setFilterBitmap(c());
        canvas.drawPath(this.l, this.e);
        if (this.g != 0.0f) {
            this.e.setColor(e.c(this.i, this.p));
            this.e.setStyle(Paint.Style.STROKE);
            this.e.setStrokeWidth(this.g);
            canvas.drawPath(this.m, this.e);
        }
    }

    @Override // com.facebook.drawee.f.i
    public void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return e.b(e.c(this.n, this.p));
    }

    @Override // com.facebook.drawee.f.i
    public void i(boolean z) {
        if (this.j != z) {
            this.j = z;
            e();
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.f.i
    public void j(boolean z) {
        this.f = z;
        e();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.f.i
    public void k(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f1197b, 0.0f);
        } else {
            d.a.b.d.i.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f1197b, 0, 8);
        }
        e();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.f.i
    public void l(float f) {
        if (this.h != f) {
            this.h = f;
            e();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        e();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.p) {
            this.p = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
