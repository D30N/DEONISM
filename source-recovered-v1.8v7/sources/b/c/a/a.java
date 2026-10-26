package b.c.a;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class a extends FrameLayout {
    private static final f f;

    /* renamed from: b, reason: collision with root package name */
    private boolean f738b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f739c;

    /* renamed from: d, reason: collision with root package name */
    final Rect f740d;
    private final e e;

    static {
        int i = Build.VERSION.SDK_INT;
        f = i >= 21 ? new c() : i >= 17 ? new b() : new d();
        f.m();
    }

    public ColorStateList getCardBackgroundColor() {
        return f.f(this.e);
    }

    public float getCardElevation() {
        return f.k(this.e);
    }

    public int getContentPaddingBottom() {
        return this.f740d.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f740d.left;
    }

    public int getContentPaddingRight() {
        return this.f740d.right;
    }

    public int getContentPaddingTop() {
        return this.f740d.top;
    }

    public float getMaxCardElevation() {
        return f.a(this.e);
    }

    public boolean getPreventCornerOverlap() {
        return this.f739c;
    }

    public float getRadius() {
        return f.b(this.e);
    }

    public boolean getUseCompatPadding() {
        return this.f738b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (!(f instanceof c)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(f.d(this.e)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(f.c(this.e)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f.j(this.e, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f.j(this.e, colorStateList);
    }

    public void setCardElevation(float f2) {
        f.g(this.e, f2);
    }

    public void setMaxCardElevation(float f2) {
        f.l(this.e, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f739c) {
            this.f739c = z;
            f.i(this.e);
        }
    }

    public void setRadius(float f2) {
        f.h(this.e, f2);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f738b != z) {
            this.f738b = z;
            f.e(this.e);
        }
    }
}
