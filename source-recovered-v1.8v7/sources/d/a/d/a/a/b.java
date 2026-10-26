package d.a.d.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import d.a.d.a.a.a;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class b<T extends a> implements a {

    @Nullable
    private T a;

    public b(@Nullable T t) {
        this.a = t;
    }

    @Override // d.a.d.a.a.d
    public int a() {
        T t = this.a;
        if (t == null) {
            return 0;
        }
        return t.a();
    }

    @Override // d.a.d.a.a.d
    public int b() {
        T t = this.a;
        if (t == null) {
            return 0;
        }
        return t.b();
    }

    @Override // d.a.d.a.a.a
    public int c() {
        T t = this.a;
        if (t == null) {
            return -1;
        }
        return t.c();
    }

    @Override // d.a.d.a.a.a
    public void clear() {
        T t = this.a;
        if (t != null) {
            t.clear();
        }
    }

    @Override // d.a.d.a.a.a
    public int d() {
        T t = this.a;
        if (t == null) {
            return -1;
        }
        return t.d();
    }

    @Override // d.a.d.a.a.a
    public void e(@Nullable Rect rect) {
        T t = this.a;
        if (t != null) {
            t.e(rect);
        }
    }

    @Override // d.a.d.a.a.d
    public int f(int i) {
        T t = this.a;
        if (t == null) {
            return 0;
        }
        return t.f(i);
    }

    @Override // d.a.d.a.a.a
    public void g(int i) {
        T t = this.a;
        if (t != null) {
            t.g(i);
        }
    }

    @Override // d.a.d.a.a.a
    public boolean i(Drawable drawable, Canvas canvas, int i) {
        T t = this.a;
        return t != null && t.i(drawable, canvas, i);
    }

    @Override // d.a.d.a.a.a
    public void j(ColorFilter colorFilter) {
        T t = this.a;
        if (t != null) {
            t.j(colorFilter);
        }
    }
}
