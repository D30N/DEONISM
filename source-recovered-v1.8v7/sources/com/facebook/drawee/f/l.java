package com.facebook.drawee.f;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class l extends g implements i {
    b e;
    private final RectF f;

    @Nullable
    private RectF g;

    @Nullable
    private Matrix h;
    private final float[] i;
    final float[] j;
    final Paint k;
    private boolean l;
    private float m;
    private int n;
    private int o;
    private float p;
    private boolean q;
    private boolean r;
    private final Path s;
    private final Path t;
    private final RectF u;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        OVERLAY_COLOR,
        CLIPPING
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Drawable drawable) {
        super(drawable);
        d.a.b.d.i.g(drawable);
        this.e = b.OVERLAY_COLOR;
        this.f = new RectF();
        this.i = new float[8];
        this.j = new float[8];
        this.k = new Paint(1);
        this.l = false;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = 0.0f;
        this.q = false;
        this.r = false;
        this.s = new Path();
        this.t = new Path();
        this.u = new RectF();
    }

    private void r() {
        float[] fArr;
        this.s.reset();
        this.t.reset();
        this.u.set(getBounds());
        RectF rectF = this.u;
        float f = this.p;
        rectF.inset(f, f);
        if (this.e == b.OVERLAY_COLOR) {
            this.s.addRect(this.u, Path.Direction.CW);
        }
        if (this.l) {
            this.s.addCircle(this.u.centerX(), this.u.centerY(), Math.min(this.u.width(), this.u.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.s.addRoundRect(this.u, this.i, Path.Direction.CW);
        }
        RectF rectF2 = this.u;
        float f2 = this.p;
        rectF2.inset(-f2, -f2);
        RectF rectF3 = this.u;
        float f3 = this.m;
        rectF3.inset(f3 / 2.0f, f3 / 2.0f);
        if (this.l) {
            this.t.addCircle(this.u.centerX(), this.u.centerY(), Math.min(this.u.width(), this.u.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.j;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.i[i] + this.p) - (this.m / 2.0f);
                i++;
            }
            this.t.addRoundRect(this.u, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.u;
        float f4 = this.m;
        rectF4.inset((-f4) / 2.0f, (-f4) / 2.0f);
    }

    @Override // com.facebook.drawee.f.i
    public void a(int i, float f) {
        this.n = i;
        this.m = f;
        r();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.f.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f.set(getBounds());
        int i = a.a[this.e.ordinal()];
        if (i == 1) {
            int iSave = canvas.save();
            canvas.clipPath(this.s);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        } else if (i == 2) {
            if (this.q) {
                RectF rectF = this.g;
                if (rectF == null) {
                    this.g = new RectF(this.f);
                    this.h = new Matrix();
                } else {
                    rectF.set(this.f);
                }
                RectF rectF2 = this.g;
                float f = this.m;
                rectF2.inset(f, f);
                this.h.setRectToRect(this.f, this.g, Matrix.ScaleToFit.FILL);
                int iSave2 = canvas.save();
                canvas.clipRect(this.f);
                canvas.concat(this.h);
                super.draw(canvas);
                canvas.restoreToCount(iSave2);
            } else {
                super.draw(canvas);
            }
            this.k.setStyle(Paint.Style.FILL);
            this.k.setColor(this.o);
            this.k.setStrokeWidth(0.0f);
            this.k.setFilterBitmap(p());
            this.s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.s, this.k);
            if (this.l) {
                float fWidth = ((this.f.width() - this.f.height()) + this.m) / 2.0f;
                float fHeight = ((this.f.height() - this.f.width()) + this.m) / 2.0f;
                if (fWidth > 0.0f) {
                    RectF rectF3 = this.f;
                    float f2 = rectF3.left;
                    canvas.drawRect(f2, rectF3.top, f2 + fWidth, rectF3.bottom, this.k);
                    RectF rectF4 = this.f;
                    float f3 = rectF4.right;
                    canvas.drawRect(f3 - fWidth, rectF4.top, f3, rectF4.bottom, this.k);
                }
                if (fHeight > 0.0f) {
                    RectF rectF5 = this.f;
                    float f4 = rectF5.left;
                    float f5 = rectF5.top;
                    canvas.drawRect(f4, f5, rectF5.right, f5 + fHeight, this.k);
                    RectF rectF6 = this.f;
                    float f6 = rectF6.left;
                    float f7 = rectF6.bottom;
                    canvas.drawRect(f6, f7 - fHeight, rectF6.right, f7, this.k);
                }
            }
        }
        if (this.n != 0) {
            this.k.setStyle(Paint.Style.STROKE);
            this.k.setColor(this.n);
            this.k.setStrokeWidth(this.m);
            this.s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.t, this.k);
        }
    }

    @Override // com.facebook.drawee.f.i
    public void f(boolean z) {
        if (this.r != z) {
            this.r = z;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.f.i
    public void i(boolean z) {
        this.q = z;
        r();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.f.i
    public void j(boolean z) {
        this.l = z;
        r();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.f.i
    public void k(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.i, 0.0f);
        } else {
            d.a.b.d.i.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.i, 0, 8);
        }
        r();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.f.i
    public void l(float f) {
        this.p = f;
        r();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.f.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        r();
    }

    public boolean p() {
        return this.r;
    }

    public void q(int i) {
        this.o = i;
        invalidateSelf();
    }
}
