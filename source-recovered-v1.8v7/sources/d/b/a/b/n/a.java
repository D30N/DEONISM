package d.b.a.b.n;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import d.b.a.b.z.k;
import d.b.a.b.z.n;

/* loaded from: classes.dex */
public class a extends b.c.a.a implements Checkable, n {
    private static final int[] l = {R.attr.state_checkable};
    private static final int[] m = {R.attr.state_checked};
    private static final int[] n = {d.b.a.b.b.state_dragged};
    private final b g;
    private boolean h;
    private boolean i;
    private boolean j;
    private InterfaceC0099a k;

    /* renamed from: d.b.a.b.n.a$a, reason: collision with other inner class name */
    public interface InterfaceC0099a {
        void a(a aVar, boolean z);
    }

    private void d() {
        if (Build.VERSION.SDK_INT <= 26) {
            return;
        }
        this.g.a();
        throw null;
    }

    public boolean e() {
        b bVar = this.g;
        if (bVar == null) {
            return false;
        }
        bVar.o();
        throw null;
    }

    public boolean f() {
        return this.j;
    }

    @Override // b.c.a.a
    public ColorStateList getCardBackgroundColor() {
        this.g.c();
        throw null;
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        this.g.d();
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        this.g.e();
        throw null;
    }

    @Override // b.c.a.a
    public int getContentPaddingBottom() {
        this.g.m();
        throw null;
    }

    @Override // b.c.a.a
    public int getContentPaddingLeft() {
        this.g.m();
        throw null;
    }

    @Override // b.c.a.a
    public int getContentPaddingRight() {
        this.g.m();
        throw null;
    }

    @Override // b.c.a.a
    public int getContentPaddingTop() {
        this.g.m();
        throw null;
    }

    public float getProgress() {
        this.g.g();
        throw null;
    }

    @Override // b.c.a.a
    public float getRadius() {
        this.g.f();
        throw null;
    }

    public ColorStateList getRippleColor() {
        this.g.h();
        throw null;
    }

    public k getShapeAppearanceModel() {
        this.g.i();
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        this.g.j();
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        this.g.k();
        throw null;
    }

    public int getStrokeWidth() {
        this.g.l();
        throw null;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g.b();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (e()) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, l);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, m);
        }
        if (f()) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, n);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(b.c.a.a.class.getName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(b.c.a.a.class.getName());
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // b.c.a.a, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.g.p(getMeasuredWidth(), getMeasuredHeight());
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.h) {
            this.g.n();
            throw null;
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // b.c.a.a
    public void setCardBackgroundColor(int i) {
        this.g.q(ColorStateList.valueOf(i));
        throw null;
    }

    @Override // b.c.a.a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.g.q(colorStateList);
        throw null;
    }

    @Override // b.c.a.a
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.g.B();
        throw null;
    }

    public void setCheckable(boolean z) {
        this.g.r(z);
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.i != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.g.s(drawable);
        throw null;
    }

    public void setCheckedIconResource(int i) {
        this.g.s(b.a.k.a.a.d(getContext(), i));
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.g.t(colorStateList);
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        this.g.A();
        throw null;
    }

    public void setDragged(boolean z) {
        if (this.j != z) {
            this.j = z;
            refreshDrawableState();
            d();
            invalidate();
        }
    }

    @Override // b.c.a.a
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.g.C();
        throw null;
    }

    public void setOnCheckedChangeListener(InterfaceC0099a interfaceC0099a) {
        this.k = interfaceC0099a;
    }

    @Override // b.c.a.a
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.g.C();
        throw null;
    }

    public void setProgress(float f) {
        this.g.v(f);
        throw null;
    }

    @Override // b.c.a.a
    public void setRadius(float f) {
        super.setRadius(f);
        this.g.u(f);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.g.w(colorStateList);
        throw null;
    }

    public void setRippleColorResource(int i) {
        this.g.w(b.a.k.a.a.c(getContext(), i));
        throw null;
    }

    @Override // d.b.a.b.z.n
    public void setShapeAppearanceModel(k kVar) {
        this.g.x(kVar);
        throw null;
    }

    public void setStrokeColor(int i) {
        this.g.y(ColorStateList.valueOf(i));
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.g.y(colorStateList);
        throw null;
    }

    public void setStrokeWidth(int i) {
        this.g.z(i);
        throw null;
    }

    @Override // b.c.a.a
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.g.C();
        throw null;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (e() && isEnabled()) {
            this.i = !this.i;
            refreshDrawableState();
            d();
            InterfaceC0099a interfaceC0099a = this.k;
            if (interfaceC0099a != null) {
                interfaceC0099a.a(this, this.i);
            }
        }
    }
}
