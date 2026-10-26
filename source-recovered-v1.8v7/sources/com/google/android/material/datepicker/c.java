package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* loaded from: classes.dex */
final class c {
    final b a;

    /* renamed from: b, reason: collision with root package name */
    final b f2039b;

    /* renamed from: c, reason: collision with root package name */
    final b f2040c;

    /* renamed from: d, reason: collision with root package name */
    final b f2041d;
    final b e;
    final b f;
    final b g;
    final Paint h;

    c(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(d.b.a.b.w.b.c(context, d.b.a.b.b.materialCalendarStyle, g.class.getCanonicalName()), d.b.a.b.k.MaterialCalendar);
        this.a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(d.b.a.b.k.MaterialCalendar_dayStyle, 0));
        this.g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(d.b.a.b.k.MaterialCalendar_dayInvalidStyle, 0));
        this.f2039b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(d.b.a.b.k.MaterialCalendar_daySelectedStyle, 0));
        this.f2040c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(d.b.a.b.k.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateListA = d.b.a.b.w.c.a(context, typedArrayObtainStyledAttributes, d.b.a.b.k.MaterialCalendar_rangeFillColor);
        this.f2041d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(d.b.a.b.k.MaterialCalendar_yearStyle, 0));
        this.e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(d.b.a.b.k.MaterialCalendar_yearSelectedStyle, 0));
        this.f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(d.b.a.b.k.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
