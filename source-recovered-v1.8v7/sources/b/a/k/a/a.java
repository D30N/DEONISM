package b.a.k.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.m0;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public final class a {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<Context, SparseArray<C0017a>> f685b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f686c = new Object();

    /* renamed from: b.a.k.a.a$a, reason: collision with other inner class name */
    private static class C0017a {
        final ColorStateList a;

        /* renamed from: b, reason: collision with root package name */
        final Configuration f687b;

        C0017a(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.f687b = configuration;
        }
    }

    private static void a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f686c) {
            SparseArray<C0017a> sparseArray = f685b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f685b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0017a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    private static ColorStateList b(Context context, int i) {
        C0017a c0017a;
        synchronized (f686c) {
            SparseArray<C0017a> sparseArray = f685b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (c0017a = sparseArray.get(i)) != null) {
                if (c0017a.f687b.equals(context.getResources().getConfiguration())) {
                    return c0017a.a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    public static ColorStateList c(Context context, int i) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList colorStateListB = b(context, i);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListF = f(context, i);
        if (colorStateListF == null) {
            return b.g.d.a.e(context, i);
        }
        a(context, i, colorStateListF);
        return colorStateListF;
    }

    public static Drawable d(Context context, int i) {
        return m0.h().j(context, i);
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

    private static ColorStateList f(Context context, int i) throws Resources.NotFoundException {
        if (g(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return b.g.d.c.a.a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    private static boolean g(Context context, int i) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        TypedValue typedValueE = e();
        resources.getValue(i, typedValueE, true);
        int i2 = typedValueE.type;
        return i2 >= 28 && i2 <= 31;
    }
}
