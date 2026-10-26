package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public class x0 implements d0 {
    Toolbar a;

    /* renamed from: b, reason: collision with root package name */
    private int f316b;

    /* renamed from: c, reason: collision with root package name */
    private View f317c;

    /* renamed from: d, reason: collision with root package name */
    private View f318d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private boolean h;
    CharSequence i;
    private CharSequence j;
    private CharSequence k;
    Window.Callback l;
    boolean m;
    private c n;
    private int o;
    private int p;
    private Drawable q;

    class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        final androidx.appcompat.view.menu.a f319b;

        a() {
            this.f319b = new androidx.appcompat.view.menu.a(x0.this.a.getContext(), 0, R.id.home, 0, 0, x0.this.i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x0 x0Var = x0.this;
            Window.Callback callback = x0Var.l;
            if (callback == null || !x0Var.m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f319b);
        }
    }

    class b extends b.g.l.x {
        private boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f321b;

        b(int i) {
            this.f321b = i;
        }

        @Override // b.g.l.w
        public void a(View view) {
            if (this.a) {
                return;
            }
            x0.this.a.setVisibility(this.f321b);
        }

        @Override // b.g.l.x, b.g.l.w
        public void b(View view) {
            x0.this.a.setVisibility(0);
        }

        @Override // b.g.l.x, b.g.l.w
        public void c(View view) {
            this.a = true;
        }
    }

    public x0(Toolbar toolbar, boolean z) {
        this(toolbar, z, b.a.h.abc_action_bar_up_description, b.a.e.abc_ic_ab_back_material);
    }

    public x0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        w0 w0VarU = w0.u(toolbar.getContext(), null, b.a.j.ActionBar, b.a.a.actionBarStyle, 0);
        this.q = w0VarU.g(b.a.j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence charSequenceP = w0VarU.p(b.a.j.ActionBar_title);
            if (!TextUtils.isEmpty(charSequenceP)) {
                setTitle(charSequenceP);
            }
            CharSequence charSequenceP2 = w0VarU.p(b.a.j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                D(charSequenceP2);
            }
            Drawable drawableG = w0VarU.g(b.a.j.ActionBar_logo);
            if (drawableG != null) {
                z(drawableG);
            }
            Drawable drawableG2 = w0VarU.g(b.a.j.ActionBar_icon);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.g == null && (drawable = this.q) != null) {
                C(drawable);
            }
            v(w0VarU.k(b.a.j.ActionBar_displayOptions, 0));
            int iN = w0VarU.n(b.a.j.ActionBar_customNavigationLayout, 0);
            if (iN != 0) {
                x(LayoutInflater.from(this.a.getContext()).inflate(iN, (ViewGroup) this.a, false));
                v(this.f316b | 16);
            }
            int iM = w0VarU.m(b.a.j.ActionBar_height, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = iM;
                this.a.setLayoutParams(layoutParams);
            }
            int iE = w0VarU.e(b.a.j.ActionBar_contentInsetStart, -1);
            int iE2 = w0VarU.e(b.a.j.ActionBar_contentInsetEnd, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.a.H(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = w0VarU.n(b.a.j.ActionBar_titleTextStyle, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.K(toolbar2.getContext(), iN2);
            }
            int iN3 = w0VarU.n(b.a.j.ActionBar_subtitleTextStyle, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.J(toolbar3.getContext(), iN3);
            }
            int iN4 = w0VarU.n(b.a.j.ActionBar_popupTheme, 0);
            if (iN4 != 0) {
                this.a.setPopupTheme(iN4);
            }
        } else {
            this.f316b = w();
        }
        w0VarU.v();
        y(i);
        this.k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    private void E(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.f316b & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    private void F() {
        if ((this.f316b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.a.setNavigationContentDescription(this.p);
            } else {
                this.a.setNavigationContentDescription(this.k);
            }
        }
    }

    private void G() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f316b & 4) != 0) {
            toolbar = this.a;
            drawable = this.g;
            if (drawable == null) {
                drawable = this.q;
            }
        } else {
            toolbar = this.a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void H() {
        Drawable drawable;
        int i = this.f316b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f) == null) {
            drawable = this.e;
        }
        this.a.setLogo(drawable);
    }

    private int w() {
        if (this.a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.a.getNavigationIcon();
        return 15;
    }

    public void A(int i) {
        B(i == 0 ? null : o().getString(i));
    }

    public void B(CharSequence charSequence) {
        this.k = charSequence;
        F();
    }

    public void C(Drawable drawable) {
        this.g = drawable;
        G();
    }

    public void D(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.f316b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.d0
    public void a(Menu menu, m.a aVar) {
        if (this.n == null) {
            c cVar = new c(this.a.getContext());
            this.n = cVar;
            cVar.p(b.a.f.action_menu_presenter);
        }
        this.n.g(aVar);
        this.a.I((androidx.appcompat.view.menu.g) menu, this.n);
    }

    @Override // androidx.appcompat.widget.d0
    public boolean b() {
        return this.a.z();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean c() {
        return this.a.A();
    }

    @Override // androidx.appcompat.widget.d0
    public void collapseActionView() {
        this.a.e();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean d() {
        return this.a.w();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean e() {
        return this.a.N();
    }

    @Override // androidx.appcompat.widget.d0
    public void f() {
        this.m = true;
    }

    @Override // androidx.appcompat.widget.d0
    public boolean g() {
        return this.a.d();
    }

    @Override // androidx.appcompat.widget.d0
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // androidx.appcompat.widget.d0
    public void h() {
        this.a.f();
    }

    @Override // androidx.appcompat.widget.d0
    public int i() {
        return this.f316b;
    }

    @Override // androidx.appcompat.widget.d0
    public void j(int i) {
        this.a.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.d0
    public void k(int i) {
        z(i != 0 ? b.a.k.a.a.d(o(), i) : null);
    }

    @Override // androidx.appcompat.widget.d0
    public void l(p0 p0Var) {
        View view = this.f317c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.f317c);
            }
        }
        this.f317c = p0Var;
        if (p0Var == null || this.o != 2) {
            return;
        }
        this.a.addView(p0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f317c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.a = 8388691;
        p0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.d0
    public ViewGroup m() {
        return this.a;
    }

    @Override // androidx.appcompat.widget.d0
    public void n(boolean z) {
    }

    @Override // androidx.appcompat.widget.d0
    public Context o() {
        return this.a.getContext();
    }

    @Override // androidx.appcompat.widget.d0
    public int p() {
        return this.o;
    }

    @Override // androidx.appcompat.widget.d0
    public b.g.l.v q(int i, long j) {
        b.g.l.v vVarC = b.g.l.r.c(this.a);
        vVarC.a(i == 0 ? 1.0f : 0.0f);
        vVarC.d(j);
        vVarC.f(new b(i));
        return vVarC;
    }

    @Override // androidx.appcompat.widget.d0
    public void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.d0
    public boolean s() {
        return this.a.v();
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(int i) {
        setIcon(i != 0 ? b.a.k.a.a.d(o(), i) : null);
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(Drawable drawable) {
        this.e = drawable;
        H();
    }

    @Override // androidx.appcompat.widget.d0
    public void setTitle(CharSequence charSequence) {
        this.h = true;
        E(charSequence);
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.h) {
            return;
        }
        E(charSequence);
    }

    @Override // androidx.appcompat.widget.d0
    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.d0
    public void u(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.d0
    public void v(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f316b ^ i;
        this.f316b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    F();
                }
                G();
            }
            if ((i2 & 3) != 0) {
                H();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.setTitle(this.i);
                    toolbar = this.a;
                    charSequence = this.j;
                } else {
                    charSequence = null;
                    this.a.setTitle((CharSequence) null);
                    toolbar = this.a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.f318d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    public void x(View view) {
        View view2 = this.f318d;
        if (view2 != null && (this.f316b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.f318d = view;
        if (view == null || (this.f316b & 16) == 0) {
            return;
        }
        this.a.addView(view);
    }

    public void y(int i) {
        if (i == this.p) {
            return;
        }
        this.p = i;
        if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
            A(this.p);
        }
    }

    public void z(Drawable drawable) {
        this.f = drawable;
        H();
    }
}
