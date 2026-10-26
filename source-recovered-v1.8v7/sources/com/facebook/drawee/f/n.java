package com.facebook.drawee.f;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;

/* loaded from: classes.dex */
public class n extends m {
    public n(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // com.facebook.drawee.f.m, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("RoundedNinePatchDrawable#draw");
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
        canvas.clipPath(this.f);
        super.draw(canvas);
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
    }
}
