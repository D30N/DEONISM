package com.facebook.drawee.f;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.f.p;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class o extends g {
    p.b e;
    Object f;

    @Nullable
    PointF g;
    int h;
    int i;
    Matrix j;
    private Matrix k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Drawable drawable, p.b bVar) {
        super(drawable);
        d.a.b.d.i.g(drawable);
        this.g = null;
        this.h = 0;
        this.i = 0;
        this.k = new Matrix();
        this.e = bVar;
    }

    private void q() {
        boolean z;
        p.b bVar = this.e;
        boolean z2 = true;
        if (bVar instanceof p.n) {
            Object state = ((p.n) bVar).getState();
            z = state == null || !state.equals(this.f);
            this.f = state;
        } else {
            z = false;
        }
        if (this.h == getCurrent().getIntrinsicWidth() && this.i == getCurrent().getIntrinsicHeight()) {
            z2 = false;
        }
        if (z2 || z) {
            p();
        }
    }

    @Override // com.facebook.drawee.f.g, com.facebook.drawee.f.r
    public void c(Matrix matrix) {
        m(matrix);
        q();
        Matrix matrix2 = this.j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // com.facebook.drawee.f.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        q();
        if (this.j == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.j);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // com.facebook.drawee.f.g
    public Drawable n(Drawable drawable) {
        Drawable drawableN = super.n(drawable);
        p();
        return drawableN;
    }

    @Override // com.facebook.drawee.f.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        p();
    }

    void p() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.h = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.i = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.j = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            current.setBounds(bounds);
            this.j = null;
            return;
        }
        if (this.e == p.b.a) {
            current.setBounds(bounds);
            this.j = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        p.b bVar = this.e;
        Matrix matrix = this.k;
        PointF pointF = this.g;
        float f = pointF != null ? pointF.x : 0.5f;
        PointF pointF2 = this.g;
        bVar.a(matrix, bounds, intrinsicWidth, intrinsicHeight, f, pointF2 != null ? pointF2.y : 0.5f);
        this.j = this.k;
    }

    public p.b r() {
        return this.e;
    }

    public void s(PointF pointF) {
        if (d.a.b.d.h.a(this.g, pointF)) {
            return;
        }
        if (this.g == null) {
            this.g = new PointF();
        }
        this.g.set(pointF);
        p();
        invalidateSelf();
    }
}
