package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import b.g.l.r;
import com.google.android.material.internal.g;
import d.b.a.b.j;
import d.b.a.b.z.h;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    private static final int Q = j.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.b.a.b.b.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(g.f(context, attributeSet, i, Q), attributeSet, i);
        O(getContext());
    }

    private void O(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            d.b.a.b.z.g gVar = new d.b.a.b.z.g();
            gVar.T(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.L(context);
            gVar.S(r.q(this));
            r.f0(this, gVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        h.d(this, f);
    }
}
