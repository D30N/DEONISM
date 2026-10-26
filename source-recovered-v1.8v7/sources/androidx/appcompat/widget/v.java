package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
class v extends r {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f297d;
    private Drawable e;
    private ColorStateList f;
    private PorterDuff.Mode g;
    private boolean h;
    private boolean i;

    v(SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.f297d = seekBar;
    }

    private void f() {
        if (this.e != null) {
            if (this.h || this.i) {
                Drawable drawableR = androidx.core.graphics.drawable.a.r(this.e.mutate());
                this.e = drawableR;
                if (this.h) {
                    androidx.core.graphics.drawable.a.o(drawableR, this.f);
                }
                if (this.i) {
                    androidx.core.graphics.drawable.a.p(this.e, this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.f297d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.r
    void c(AttributeSet attributeSet, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.c(attributeSet, i);
        w0 w0VarU = w0.u(this.f297d.getContext(), attributeSet, b.a.j.AppCompatSeekBar, i, 0);
        Drawable drawableH = w0VarU.h(b.a.j.AppCompatSeekBar_android_thumb);
        if (drawableH != null) {
            this.f297d.setThumb(drawableH);
        }
        j(w0VarU.g(b.a.j.AppCompatSeekBar_tickMark));
        if (w0VarU.r(b.a.j.AppCompatSeekBar_tickMarkTintMode)) {
            this.g = e0.d(w0VarU.k(b.a.j.AppCompatSeekBar_tickMarkTintMode, -1), this.g);
            this.i = true;
        }
        if (w0VarU.r(b.a.j.AppCompatSeekBar_tickMarkTint)) {
            this.f = w0VarU.c(b.a.j.AppCompatSeekBar_tickMarkTint);
            this.h = true;
        }
        w0VarU.v();
        f();
    }

    void g(Canvas canvas) {
        if (this.e != null) {
            int max = this.f297d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((this.f297d.getWidth() - this.f297d.getPaddingLeft()) - this.f297d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f297d.getPaddingLeft(), this.f297d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f297d.getDrawableState())) {
            this.f297d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f297d);
            androidx.core.graphics.drawable.a.m(drawable, b.g.l.r.v(this.f297d));
            if (drawable.isStateful()) {
                drawable.setState(this.f297d.getDrawableState());
            }
            f();
        }
        this.f297d.invalidate();
    }
}
