package d.b.a.b.z;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes.dex */
public class h {
    static d a(int i) {
        return i != 0 ? i != 1 ? b() : new e() : new j();
    }

    static d b() {
        return new j();
    }

    static f c() {
        return new f();
    }

    public static void d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).S(f);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            f(view, (g) background);
        }
    }

    public static void f(View view, g gVar) {
        if (gVar.N()) {
            gVar.W(com.google.android.material.internal.h.b(view));
        }
    }
}
