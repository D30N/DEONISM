package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import b.g.l.r;
import com.google.android.material.internal.g;
import d.b.a.b.k;

/* loaded from: classes.dex */
public class d extends FrameLayout {
    private static final View.OnTouchListener g = new a();

    /* renamed from: b, reason: collision with root package name */
    private c f2123b;

    /* renamed from: c, reason: collision with root package name */
    private b f2124c;

    /* renamed from: d, reason: collision with root package name */
    private int f2125d;
    private final float e;
    private final float f;

    static class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    protected d(Context context, AttributeSet attributeSet) {
        super(g.f(context, attributeSet, 0, 0), attributeSet);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.SnackbarLayout);
        if (typedArrayObtainStyledAttributes.hasValue(k.SnackbarLayout_elevation)) {
            r.j0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(k.SnackbarLayout_elevation, 0));
        }
        this.f2125d = typedArrayObtainStyledAttributes.getInt(k.SnackbarLayout_animationMode, 0);
        this.e = typedArrayObtainStyledAttributes.getFloat(k.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        this.f = typedArrayObtainStyledAttributes.getFloat(k.SnackbarLayout_actionTextColorAlpha, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(g);
        setFocusable(true);
    }

    float getActionTextColorAlpha() {
        return this.f;
    }

    int getAnimationMode() {
        return this.f2125d;
    }

    float getBackgroundOverlayColorAlpha() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f2124c;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        r.a0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f2124c;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c cVar = this.f2123b;
        if (cVar != null) {
            cVar.a(this, i, i2, i3, i4);
        }
    }

    void setAnimationMode(int i) {
        this.f2125d = i;
    }

    void setOnAttachStateChangeListener(b bVar) {
        this.f2124c = bVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : g);
        super.setOnClickListener(onClickListener);
    }

    void setOnLayoutChangeListener(c cVar) {
        this.f2123b = cVar;
    }
}
