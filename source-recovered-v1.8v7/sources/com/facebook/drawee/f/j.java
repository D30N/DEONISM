package com.facebook.drawee.f;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class j extends m {
    private final Paint E;
    private final Paint F;

    @Nullable
    private final Bitmap G;
    private WeakReference<Bitmap> H;

    public j(Resources resources, @Nullable Bitmap bitmap, @Nullable Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        this.E = new Paint();
        this.F = new Paint(1);
        this.G = bitmap;
        if (paint != null) {
            this.E.set(paint);
        }
        this.E.setFlags(1);
        this.F.setStyle(Paint.Style.STROKE);
    }

    private void h() {
        WeakReference<Bitmap> weakReference = this.H;
        if (weakReference == null || weakReference.get() != this.G) {
            this.H = new WeakReference<>(this.G);
            Paint paint = this.E;
            Bitmap bitmap = this.G;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.g = true;
        }
        if (this.g) {
            this.E.getShader().setLocalMatrix(this.y);
            this.g = false;
        }
        this.E.setFilterBitmap(b());
    }

    @Override // com.facebook.drawee.f.m
    boolean c() {
        return super.c() && this.G != null;
    }

    @Override // com.facebook.drawee.f.m, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("RoundedBitmapDrawable#draw");
        }
        if (!c()) {
            super.draw(canvas);
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
                return;
            }
            return;
        }
        g();
        e();
        h();
        int iSave = canvas.save();
        canvas.concat(this.v);
        canvas.drawPath(this.f, this.E);
        float f = this.e;
        if (f > 0.0f) {
            this.F.setStrokeWidth(f);
            this.F.setColor(e.c(this.h, this.E.getAlpha()));
            canvas.drawPath(this.i, this.F);
        }
        canvas.restoreToCount(iSave);
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
    }

    @Override // com.facebook.drawee.f.m, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        super.setAlpha(i);
        if (i != this.E.getAlpha()) {
            this.E.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.f.m, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.E.setColorFilter(colorFilter);
    }
}
