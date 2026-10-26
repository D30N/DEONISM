package com.facebook.drawee.f;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class g extends Drawable implements Drawable.Callback, r, q, c {

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private Drawable f1194b;

    /* renamed from: c, reason: collision with root package name */
    private final d f1195c = new d();

    /* renamed from: d, reason: collision with root package name */
    protected r f1196d;

    static {
        new Matrix();
    }

    public g(@Nullable Drawable drawable) {
        this.f1194b = drawable;
        e.d(drawable, this, this);
    }

    @Override // com.facebook.drawee.f.c
    public Drawable b(@Nullable Drawable drawable) {
        return n(drawable);
    }

    @Override // com.facebook.drawee.f.r
    public void c(Matrix matrix) {
        m(matrix);
    }

    @Override // com.facebook.drawee.f.q
    public void d(r rVar) {
        this.f1196d = rVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f1194b;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // com.facebook.drawee.f.c
    @Nullable
    public Drawable g() {
        return getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f1194b;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable getCurrent() {
        return this.f1194b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f1194b;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f1194b;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1194b;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f1194b;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    @Override // com.facebook.drawee.f.r
    public void h(RectF rectF) {
        r rVar = this.f1196d;
        if (rVar != null) {
            rVar.h(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f1194b;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    protected void m(Matrix matrix) {
        r rVar = this.f1196d;
        if (rVar != null) {
            rVar.c(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f1194b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Nullable
    public Drawable n(@Nullable Drawable drawable) {
        Drawable drawableO = o(drawable);
        invalidateSelf();
        return drawableO;
    }

    @Nullable
    protected Drawable o(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f1194b;
        e.d(drawable2, null, null);
        e.d(drawable, null, null);
        e.e(drawable, this.f1195c);
        e.a(drawable, this);
        e.d(drawable, this, this);
        this.f1194b = drawable;
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1194b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f1194b;
        return drawable == null ? super.onLevelChange(i) : drawable.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1194b;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f1195c.b(i);
        Drawable drawable = this.f1194b;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1195c.c(colorFilter);
        Drawable drawable = this.f1194b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f1195c.d(z);
        Drawable drawable = this.f1194b;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f1195c.e(z);
        Drawable drawable = this.f1194b;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f1194b;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f1194b;
        return drawable == null ? visible : drawable.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
