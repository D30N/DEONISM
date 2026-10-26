package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import d.b.a.b.z.k;

/* loaded from: classes.dex */
class c extends d.b.a.b.z.g {
    private final Paint x;
    private final RectF y;
    private int z;

    c() {
        this(null);
    }

    c(k kVar) {
        super(kVar == null ? new k() : kVar);
        this.x = new Paint(1);
        m0();
        this.y = new RectF();
    }

    private void g0(Canvas canvas) {
        if (n0(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.z);
    }

    private void h0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (!n0(callback)) {
            j0(canvas);
            return;
        }
        View view = (View) callback;
        if (view.getLayerType() != 2) {
            view.setLayerType(2, null);
        }
    }

    private void j0(Canvas canvas) {
        this.z = Build.VERSION.SDK_INT >= 21 ? canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null) : canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
    }

    private void m0() {
        this.x.setStyle(Paint.Style.FILL_AND_STROKE);
        this.x.setColor(-1);
        this.x.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    private boolean n0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    @Override // d.b.a.b.z.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        h0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.y, this.x);
        g0(canvas);
    }

    boolean f0() {
        return !this.y.isEmpty();
    }

    void i0() {
        k0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void k0(float f, float f2, float f3, float f4) {
        RectF rectF = this.y;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        this.y.set(f, f2, f3, f4);
        invalidateSelf();
    }

    void l0(RectF rectF) {
        k0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
