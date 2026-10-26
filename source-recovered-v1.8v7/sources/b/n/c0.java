package b.n;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
class c0 {
    private static final i0 a;

    /* renamed from: b, reason: collision with root package name */
    static final Property<View, Float> f981b;

    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(c0.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            c0.g(view, f.floatValue());
        }
    }

    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return b.g.l.r.o(view);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            b.g.l.r.i0(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        a = i >= 29 ? new h0() : i >= 23 ? new g0() : i >= 22 ? new f0() : i >= 21 ? new e0() : i >= 19 ? new d0() : new i0();
        f981b = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        a.a(view);
    }

    static b0 b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new a0(view) : z.e(view);
    }

    static float c(View view) {
        return a.c(view);
    }

    static m0 d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new l0(view) : new k0(view.getWindowToken());
    }

    static void e(View view) {
        a.d(view);
    }

    static void f(View view, int i, int i2, int i3, int i4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        a.e(view, i, i2, i3, i4);
    }

    static void g(View view, float f) {
        a.f(view, f);
    }

    static void h(View view, int i) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        a.g(view, i);
    }

    static void i(View view, Matrix matrix) {
        a.h(view, matrix);
    }

    static void j(View view, Matrix matrix) {
        a.i(view, matrix);
    }
}
