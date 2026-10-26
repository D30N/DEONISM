package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;

/* loaded from: classes.dex */
public class l {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final g f130b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f131c;

    /* renamed from: d, reason: collision with root package name */
    private final int f132d;
    private final int e;
    private View f;
    private int g;
    private boolean h;
    private m.a i;
    private k j;
    private PopupWindow.OnDismissListener k;
    private final PopupWindow.OnDismissListener l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.e();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i) {
        this(context, gVar, view, z, i, 0);
    }

    public l(Context context, g gVar, View view, boolean z, int i, int i2) {
        this.g = 8388611;
        this.l = new a();
        this.a = context;
        this.f130b = gVar;
        this.f = view;
        this.f131c = z;
        this.f132d = i;
        this.e = i2;
    }

    private k a() {
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        k dVar = Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(b.a.d.abc_cascading_menus_min_smallest_width) ? new d(this.a, this.f, this.f132d, this.e, this.f131c) : new q(this.a, this.f130b, this.f, this.f132d, this.e, this.f131c);
        dVar.j(this.f130b);
        dVar.t(this.l);
        dVar.o(this.f);
        dVar.g(this.i);
        dVar.q(this.h);
        dVar.r(this.g);
        return dVar;
    }

    private void l(int i, int i2, boolean z, boolean z2) {
        k kVarC = c();
        kVarC.u(z2);
        if (z) {
            if ((b.g.l.c.b(this.g, b.g.l.r.v(this.f)) & 7) == 5) {
                i -= this.f.getWidth();
            }
            kVarC.s(i);
            kVarC.v(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            kVarC.p(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        kVarC.show();
    }

    public void b() {
        if (d()) {
            this.j.dismiss();
        }
    }

    public k c() {
        if (this.j == null) {
            this.j = a();
        }
        return this.j;
    }

    public boolean d() {
        k kVar = this.j;
        return kVar != null && kVar.b();
    }

    protected void e() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f = view;
    }

    public void g(boolean z) {
        this.h = z;
        k kVar = this.j;
        if (kVar != null) {
            kVar.q(z);
        }
    }

    public void h(int i) {
        this.g = i;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void j(m.a aVar) {
        this.i = aVar;
        k kVar = this.j;
        if (kVar != null) {
            kVar.g(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i, int i2) {
        if (d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        l(i, i2, true, true);
        return true;
    }
}
