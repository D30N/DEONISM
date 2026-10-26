package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;

/* loaded from: classes.dex */
public final class h<S> extends androidx.fragment.app.c {
    static boolean u1(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(d.b.a.b.w.b.c(context, d.b.a.b.b.materialCalendarStyle, g.class.getCanonicalName()), new int[]{R.attr.windowFullscreen});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }
}
