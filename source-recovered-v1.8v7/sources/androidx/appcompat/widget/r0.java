package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;

/* loaded from: classes.dex */
class r0 {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    static final int[] f283b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f284c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f285d = {R.attr.state_pressed};
    static final int[] e = {R.attr.state_checked};
    static final int[] f = new int[0];
    private static final int[] g = new int[1];

    public static int a(Context context, int i) {
        ColorStateList colorStateListD = d(context, i);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f283b, colorStateListD.getDefaultColor());
        }
        TypedValue typedValueE = e();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueE, true);
        return c(context, i, typedValueE.getFloat());
    }

    public static int b(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        w0 w0VarT = w0.t(context, null, iArr);
        try {
            return w0VarT.b(0, 0);
        } finally {
            w0VarT.v();
        }
    }

    static int c(Context context, int i, float f2) {
        return b.g.e.a.d(b(context, i), Math.round(Color.alpha(r0) * f2));
    }

    public static ColorStateList d(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        w0 w0VarT = w0.t(context, null, iArr);
        try {
            return w0VarT.c(0);
        } finally {
            w0VarT.v();
        }
    }

    private static TypedValue e() {
        TypedValue typedValue = a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        a.set(typedValue2);
        return typedValue2;
    }
}
