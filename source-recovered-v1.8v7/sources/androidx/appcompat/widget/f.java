package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* loaded from: classes.dex */
public class f extends Button implements b.g.l.q, androidx.core.widget.b {

    /* renamed from: b, reason: collision with root package name */
    private final e f212b;

    /* renamed from: c, reason: collision with root package name */
    private final y f213c;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a.buttonStyle);
    }

    public f(Context context, AttributeSet attributeSet, int i) {
        super(t0.b(context), attributeSet, i);
        e eVar = new e(this);
        this.f212b = eVar;
        eVar.e(attributeSet, i);
        y yVar = new y(this);
        this.f213c = yVar;
        yVar.m(attributeSet, i);
        this.f213c.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f212b;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f213c;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f213c;
        if (yVar != null) {
            return yVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f213c;
        if (yVar != null) {
            return yVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.a) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.f213c;
        if (yVar != null) {
            return yVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f213c;
        return yVar != null ? yVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.f213c;
        if (yVar != null) {
            return yVar.i();
        }
        return 0;
    }

    @Override // b.g.l.q
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f212b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // b.g.l.q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f212b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        y yVar = this.f213c;
        if (yVar != null) {
            yVar.n(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        y yVar = this.f213c;
        if (yVar == null || androidx.core.widget.b.a || !yVar.l()) {
            return;
        }
        this.f213c.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (androidx.core.widget.b.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        y yVar = this.f213c;
        if (yVar != null) {
            yVar.s(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (androidx.core.widget.b.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        y yVar = this.f213c;
        if (yVar != null) {
            yVar.t(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (androidx.core.widget.b.a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        y yVar = this.f213c;
        if (yVar != null) {
            yVar.u(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f212b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f212b;
        if (eVar != null) {
            eVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.p(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        y yVar = this.f213c;
        if (yVar != null) {
            yVar.r(z);
        }
    }

    @Override // b.g.l.q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f212b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // b.g.l.q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f212b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f213c;
        if (yVar != null) {
            yVar.p(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (androidx.core.widget.b.a) {
            super.setTextSize(i, f);
            return;
        }
        y yVar = this.f213c;
        if (yVar != null) {
            yVar.z(i, f);
        }
    }
}
