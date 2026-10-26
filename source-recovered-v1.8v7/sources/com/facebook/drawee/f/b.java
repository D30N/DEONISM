package com.facebook.drawee.f;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* loaded from: classes.dex */
public class b extends g implements Runnable {
    private int e;
    private boolean f;
    float g;
    private boolean h;

    public b(Drawable drawable, int i) {
        this(drawable, i, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Drawable drawable, int i, boolean z) {
        super(drawable);
        d.a.b.d.i.g(drawable);
        this.g = 0.0f;
        this.h = false;
        this.e = i;
        this.f = z;
    }

    private int p() {
        return (int) ((20.0f / this.e) * 360.0f);
    }

    private void q() {
        if (this.h) {
            return;
        }
        this.h = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // com.facebook.drawee.f.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.g;
        if (!this.f) {
            f = 360.0f - f;
        }
        canvas.rotate(f, bounds.left + (i / 2), bounds.top + (i2 / 2));
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        q();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.h = false;
        this.g += p();
        invalidateSelf();
    }
}
