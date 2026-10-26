package d.b.a.b.v;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.s;
import androidx.core.widget.c;
import com.google.android.material.internal.g;
import d.b.a.b.b;
import d.b.a.b.j;
import d.b.a.b.k;

/* loaded from: classes.dex */
public class a extends s {
    private static final int g = j.Widget_MaterialComponents_CompoundButton_RadioButton;
    private static final int[][] h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList e;
    private boolean f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.radioButtonStyle);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(g.f(context, attributeSet, i, g), attributeSet, i);
        TypedArray typedArrayK = g.k(getContext(), attributeSet, k.MaterialRadioButton, i, g, new int[0]);
        this.f = typedArrayK.getBoolean(k.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayK.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int iC = d.b.a.b.q.a.c(this, b.colorControlActivated);
            int iC2 = d.b.a.b.q.a.c(this, b.colorOnSurface);
            int iC3 = d.b.a.b.q.a.c(this, b.colorSurface);
            int[] iArr = new int[h.length];
            iArr[0] = d.b.a.b.q.a.f(iC3, iC, 1.0f);
            iArr[1] = d.b.a.b.q.a.f(iC3, iC2, 0.54f);
            iArr[2] = d.b.a.b.q.a.f(iC3, iC2, 0.38f);
            iArr[3] = d.b.a.b.q.a.f(iC3, iC2, 0.38f);
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
