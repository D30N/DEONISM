package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import b.g.l.r;

/* loaded from: classes.dex */
final class b {
    private final Rect a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f2036b;

    /* renamed from: c, reason: collision with root package name */
    private final ColorStateList f2037c;

    /* renamed from: d, reason: collision with root package name */
    private final ColorStateList f2038d;
    private final int e;
    private final d.b.a.b.z.k f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, d.b.a.b.z.k kVar, Rect rect) {
        b.g.k.h.b(rect.left);
        b.g.k.h.b(rect.top);
        b.g.k.h.b(rect.right);
        b.g.k.h.b(rect.bottom);
        this.a = rect;
        this.f2036b = colorStateList2;
        this.f2037c = colorStateList;
        this.f2038d = colorStateList3;
        this.e = i;
        this.f = kVar;
    }

    static b a(Context context, int i) throws Resources.NotFoundException {
        b.g.k.h.a(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, d.b.a.b.k.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(d.b.a.b.k.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(d.b.a.b.k.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(d.b.a.b.k.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(d.b.a.b.k.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateListA = d.b.a.b.w.c.a(context, typedArrayObtainStyledAttributes, d.b.a.b.k.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateListA2 = d.b.a.b.w.c.a(context, typedArrayObtainStyledAttributes, d.b.a.b.k.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateListA3 = d.b.a.b.w.c.a(context, typedArrayObtainStyledAttributes, d.b.a.b.k.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(d.b.a.b.k.MaterialCalendarItem_itemStrokeWidth, 0);
        d.b.a.b.z.k kVarM = d.b.a.b.z.k.b(context, typedArrayObtainStyledAttributes.getResourceId(d.b.a.b.k.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(d.b.a.b.k.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, kVarM, rect);
    }

    int b() {
        return this.a.bottom;
    }

    int c() {
        return this.a.top;
    }

    void d(TextView textView) {
        d.b.a.b.z.g gVar = new d.b.a.b.z.g();
        d.b.a.b.z.g gVar2 = new d.b.a.b.z.g();
        gVar.setShapeAppearanceModel(this.f);
        gVar2.setShapeAppearanceModel(this.f);
        gVar.T(this.f2037c);
        gVar.Z(this.e, this.f2038d);
        textView.setTextColor(this.f2036b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f2036b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.a;
        r.f0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
