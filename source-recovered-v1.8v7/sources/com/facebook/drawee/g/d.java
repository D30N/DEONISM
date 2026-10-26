package com.facebook.drawee.g;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.f.g;
import com.facebook.drawee.f.s;
import com.facebook.drawee.f.t;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class d extends g implements s {

    @Nullable
    Drawable e;

    @Nullable
    private t f;

    public d(Drawable drawable) {
        super(drawable);
        this.e = null;
    }

    @Override // com.facebook.drawee.f.g, android.graphics.drawable.Drawable
    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas) {
        if (isVisible()) {
            t tVar = this.f;
            if (tVar != null) {
                tVar.a();
            }
            super.draw(canvas);
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.e.draw(canvas);
            }
        }
    }

    @Override // com.facebook.drawee.f.s
    public void e(@Nullable t tVar) {
        this.f = tVar;
    }

    @Override // com.facebook.drawee.f.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // com.facebook.drawee.f.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    public void p(@Nullable Drawable drawable) {
        this.e = drawable;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.f.g, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        t tVar = this.f;
        if (tVar != null) {
            tVar.b(z);
        }
        return super.setVisible(z, z2);
    }
}
