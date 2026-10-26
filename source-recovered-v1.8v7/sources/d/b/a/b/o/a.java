package d.b.a.b.o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.g;
import androidx.core.widget.c;
import d.b.a.b.b;
import d.b.a.b.j;
import d.b.a.b.k;

/* loaded from: classes.dex */
public class a extends g {
    private static final int g = j.Widget_MaterialComponents_CompoundButton_CheckBox;
    private static final int[][] h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList e;
    private boolean f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.checkboxStyle);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(com.google.android.material.internal.g.f(context, attributeSet, i, g), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayK = com.google.android.material.internal.g.k(context2, attributeSet, k.MaterialCheckBox, i, g, new int[0]);
        if (typedArrayK.hasValue(k.MaterialCheckBox_buttonTint)) {
            c.c(this, d.b.a.b.w.c.a(context2, typedArrayK, k.MaterialCheckBox_buttonTint));
        }
        this.f = typedArrayK.getBoolean(k.MaterialCheckBox_useMaterialThemeColors, false);
        typedArrayK.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int[] iArr = new int[h.length];
            int iC = d.b.a.b.q.a.c(this, b.colorControlActivated);
            int iC2 = d.b.a.b.q.a.c(this, b.colorSurface);
            int iC3 = d.b.a.b.q.a.c(this, b.colorOnSurface);
            iArr[0] = d.b.a.b.q.a.f(iC2, iC, 1.0f);
            iArr[1] = d.b.a.b.q.a.f(iC2, iC3, 0.54f);
            iArr[2] = d.b.a.b.q.a.f(iC2, iC3, 0.38f);
            iArr[3] = d.b.a.b.q.a.f(iC2, iC3, 0.38f);
            this.e = new ColorStateList(h, iArr);
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        c.c(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
