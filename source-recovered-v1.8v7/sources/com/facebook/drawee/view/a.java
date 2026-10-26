package com.facebook.drawee.view;

import android.view.View;
import android.view.ViewGroup;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class a {

    /* renamed from: com.facebook.drawee.view.a$a, reason: collision with other inner class name */
    public static class C0053a {
        public int a;

        /* renamed from: b, reason: collision with root package name */
        public int f1224b;
    }

    private static boolean a(int i) {
        return i == 0 || i == -2;
    }

    public static void b(C0053a c0053a, float f, @Nullable ViewGroup.LayoutParams layoutParams, int i, int i2) {
        if (f <= 0.0f || layoutParams == null) {
            return;
        }
        if (a(layoutParams.height)) {
            c0053a.f1224b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0053a.a) - i) / f) + i2), c0053a.f1224b), 1073741824);
        } else if (a(layoutParams.width)) {
            c0053a.a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0053a.f1224b) - i2) * f) + i), c0053a.a), 1073741824);
        }
    }
}
