package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.l0;

/* loaded from: classes.dex */
final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {
    private static final int w = b.a.g.abc_popup_menu_item_layout;

    /* renamed from: c, reason: collision with root package name */
    private final Context f135c;

    /* renamed from: d, reason: collision with root package name */
    private final g f136d;
    private final f e;
    private final boolean f;
    private final int g;
    private final int h;
    private final int i;
    final l0 j;
    private PopupWindow.OnDismissListener m;
    private View n;
    View o;
    private m.a p;
    ViewTreeObserver q;
    private boolean r;
    private boolean s;
    private int t;
    private boolean v;
    final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    private final View.OnAttachStateChangeListener l = new b();
    private int u = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!q.this.b() || q.this.j.w()) {
                return;
            }
            View view = q.this.o;
            if (view == null || !view.isShown()) {
                q.this.dismiss();
            } else {
                q.this.j.show();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.q = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.q.removeGlobalOnLayoutListener(qVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i, int i2, boolean z) {
        this.f135c = context;
        this.f136d = gVar;
        this.f = z;
        this.e = new f(gVar, LayoutInflater.from(context), this.f, w);
        this.h = i;
        this.i = i2;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(b.a.d.abc_config_prefDialogWidth));
        this.n = view;
        this.j = new l0(this.f135c, null, this.h, this.i);
        gVar.c(this, context);
    }

    private boolean y() {
        View view;
        if (b()) {
            return true;
        }
        if (this.r || (view = this.n) == null) {
            return false;
        }
        this.o = view;
        this.j.F(this);
        this.j.G(this);
        this.j.E(true);
        View view2 = this.o;
        boolean z = this.q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.q = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.k);
        }
        view2.addOnAttachStateChangeListener(this.l);
        this.j.y(view2);
        this.j.B(this.u);
        if (!this.s) {
            this.t = k.n(this.e, null, this.f135c, this.g);
            this.s = true;
        }
        this.j.A(this.t);
        this.j.D(2);
        this.j.C(m());
        this.j.show();
        ListView listViewK = this.j.k();
        listViewK.setOnKeyListener(this);
        if (this.v && this.f136d.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f135c).inflate(b.a.g.abc_popup_menu_header_item_layout, (ViewGroup) listViewK, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f136d.x());
            }
            frameLayout.setEnabled(false);
            listViewK.addHeaderView(frameLayout, null, false);
        }
        this.j.n(this.e);
        this.j.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z) {
        if (gVar != this.f136d) {
            return;
        }
        dismiss();
        m.a aVar = this.p;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return !this.r && this.j.b();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        if (b()) {
            this.j.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void g(m.a aVar) {
        this.p = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean h(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f135c, rVar, this.o, this.f, this.h, this.i);
            lVar.j(this.p);
            lVar.g(k.w(rVar));
            lVar.i(this.m);
            this.m = null;
            this.f136d.e(false);
            int iE = this.j.e();
            int iG = this.j.g();
            if ((Gravity.getAbsoluteGravity(this.u, b.g.l.r.v(this.n)) & 7) == 5) {
                iE += this.n.getWidth();
            }
            if (lVar.n(iE, iG)) {
                m.a aVar = this.p;
                if (aVar == null) {
                    return true;
                }
                aVar.b(rVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(boolean z) {
        this.s = false;
        f fVar = this.e;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void j(g gVar) {
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView k() {
        return this.j.k();
    }

    @Override // androidx.appcompat.view.menu.k
    public void o(View view) {
        this.n = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.r = true;
        this.f136d.close();
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void q(boolean z) {
        this.e.d(z);
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(int i) {
        this.u = i;
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i) {
        this.j.d(i);
    }

    @Override // androidx.appcompat.view.menu.p
    public void show() {
        if (!y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(boolean z) {
        this.v = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(int i) {
        this.j.m(i);
    }
}
