package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.p0;
import b.a.n.b;
import b.g.l.r;
import b.g.l.v;
import b.g.l.w;
import b.g.l.x;
import b.g.l.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class k extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator B = new AccelerateInterpolator();
    private static final Interpolator C = new DecelerateInterpolator();
    final y A;
    Context a;

    /* renamed from: b, reason: collision with root package name */
    private Context f77b;

    /* renamed from: c, reason: collision with root package name */
    ActionBarOverlayLayout f78c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarContainer f79d;
    d0 e;
    ActionBarContextView f;
    View g;
    p0 h;
    private boolean i;
    d j;
    b.a.n.b k;
    b.a l;
    private boolean m;
    private ArrayList<a.b> n;
    private boolean o;
    private int p;
    boolean q;
    boolean r;
    boolean s;
    private boolean t;
    private boolean u;
    b.a.n.h v;
    private boolean w;
    boolean x;
    final w y;
    final w z;

    class a extends x {
        a() {
        }

        @Override // b.g.l.w
        public void a(View view) {
            View view2;
            k kVar = k.this;
            if (kVar.q && (view2 = kVar.g) != null) {
                view2.setTranslationY(0.0f);
                k.this.f79d.setTranslationY(0.0f);
            }
            k.this.f79d.setVisibility(8);
            k.this.f79d.setTransitioning(false);
            k kVar2 = k.this;
            kVar2.v = null;
            kVar2.A();
            ActionBarOverlayLayout actionBarOverlayLayout = k.this.f78c;
            if (actionBarOverlayLayout != null) {
                r.a0(actionBarOverlayLayout);
            }
        }
    }

    class b extends x {
        b() {
        }

        @Override // b.g.l.w
        public void a(View view) {
            k kVar = k.this;
            kVar.v = null;
            kVar.f79d.requestLayout();
        }
    }

    class c implements y {
        c() {
        }

        @Override // b.g.l.y
        public void a(View view) {
            ((View) k.this.f79d.getParent()).invalidate();
        }
    }

    public class d extends b.a.n.b implements g.a {

        /* renamed from: d, reason: collision with root package name */
        private final Context f80d;
        private final androidx.appcompat.view.menu.g e;
        private b.a f;
        private WeakReference<View> g;

        public d(Context context, b.a aVar) {
            this.f80d = context;
            this.f = aVar;
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            gVar.S(1);
            this.e = gVar;
            gVar.R(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            b.a aVar = this.f;
            if (aVar != null) {
                return aVar.b(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (this.f == null) {
                return;
            }
            k();
            k.this.f.l();
        }

        @Override // b.a.n.b
        public void c() {
            k kVar = k.this;
            if (kVar.j != this) {
                return;
            }
            if (k.z(kVar.r, kVar.s, false)) {
                this.f.d(this);
            } else {
                k kVar2 = k.this;
                kVar2.k = this;
                kVar2.l = this.f;
            }
            this.f = null;
            k.this.y(false);
            k.this.f.g();
            k.this.e.m().sendAccessibilityEvent(32);
            k kVar3 = k.this;
            kVar3.f78c.setHideOnContentScrollEnabled(kVar3.x);
            k.this.j = null;
        }

        @Override // b.a.n.b
        public View d() {
            WeakReference<View> weakReference = this.g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // b.a.n.b
        public Menu e() {
            return this.e;
        }

        @Override // b.a.n.b
        public MenuInflater f() {
            return new b.a.n.g(this.f80d);
        }

        @Override // b.a.n.b
        public CharSequence g() {
            return k.this.f.getSubtitle();
        }

        @Override // b.a.n.b
        public CharSequence i() {
            return k.this.f.getTitle();
        }

        @Override // b.a.n.b
        public void k() {
            if (k.this.j != this) {
                return;
            }
            this.e.d0();
            try {
                this.f.a(this, this.e);
            } finally {
                this.e.c0();
            }
        }

        @Override // b.a.n.b
        public boolean l() {
            return k.this.f.j();
        }

        @Override // b.a.n.b
        public void m(View view) {
            k.this.f.setCustomView(view);
            this.g = new WeakReference<>(view);
        }

        @Override // b.a.n.b
        public void n(int i) {
            o(k.this.a.getResources().getString(i));
        }

        @Override // b.a.n.b
        public void o(CharSequence charSequence) {
            k.this.f.setSubtitle(charSequence);
        }

        @Override // b.a.n.b
        public void q(int i) {
            r(k.this.a.getResources().getString(i));
        }

        @Override // b.a.n.b
        public void r(CharSequence charSequence) {
            k.this.f.setTitle(charSequence);
        }

        @Override // b.a.n.b
        public void s(boolean z) {
            super.s(z);
            k.this.f.setTitleOptional(z);
        }

        public boolean t() {
            this.e.d0();
            try {
                return this.f.c(this, this.e);
            } finally {
                this.e.c0();
            }
        }
    }

    public k(Activity activity, boolean z) {
        new ArrayList();
        this.n = new ArrayList<>();
        this.p = 0;
        this.q = true;
        this.u = true;
        this.y = new a();
        this.z = new b();
        this.A = new c();
        View decorView = activity.getWindow().getDecorView();
        G(decorView);
        if (z) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public k(Dialog dialog) {
        new ArrayList();
        this.n = new ArrayList<>();
        this.p = 0;
        this.q = true;
        this.u = true;
        this.y = new a();
        this.z = new b();
        this.A = new c();
        G(dialog.getWindow().getDecorView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d0 D(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void F() {
        if (this.t) {
            this.t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f78c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            O(false);
        }
    }

    private void G(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(b.a.f.decor_content_parent);
        this.f78c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.e = D(view.findViewById(b.a.f.action_bar));
        this.f = (ActionBarContextView) view.findViewById(b.a.f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(b.a.f.action_bar_container);
        this.f79d = actionBarContainer;
        d0 d0Var = this.e;
        if (d0Var == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(k.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = d0Var.o();
        boolean z = (this.e.i() & 4) != 0;
        if (z) {
            this.i = true;
        }
        b.a.n.a aVarB = b.a.n.a.b(this.a);
        L(aVarB.a() || z);
        J(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, b.a.j.ActionBar, b.a.a.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(b.a.j.ActionBar_hideOnContentScroll, false)) {
            K(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(b.a.j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            I(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void J(boolean z) {
        this.o = z;
        if (z) {
            this.f79d.setTabContainer(null);
            this.e.l(this.h);
        } else {
            this.e.l(null);
            this.f79d.setTabContainer(this.h);
        }
        boolean z2 = E() == 2;
        p0 p0Var = this.h;
        if (p0Var != null) {
            if (z2) {
                p0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f78c;
                if (actionBarOverlayLayout != null) {
                    r.a0(actionBarOverlayLayout);
                }
            } else {
                p0Var.setVisibility(8);
            }
        }
        this.e.u(!this.o && z2);
        this.f78c.setHasNonEmbeddedTabs(!this.o && z2);
    }

    private boolean M() {
        return r.J(this.f79d);
    }

    private void N() {
        if (this.t) {
            return;
        }
        this.t = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f78c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        O(false);
    }

    private void O(boolean z) {
        if (z(this.r, this.s, this.t)) {
            if (this.u) {
                return;
            }
            this.u = true;
            C(z);
            return;
        }
        if (this.u) {
            this.u = false;
            B(z);
        }
    }

    static boolean z(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    void A() {
        b.a aVar = this.l;
        if (aVar != null) {
            aVar.d(this.k);
            this.k = null;
            this.l = null;
        }
    }

    public void B(boolean z) {
        View view;
        b.a.n.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        if (this.p != 0 || (!this.w && !z)) {
            this.y.a(null);
            return;
        }
        this.f79d.setAlpha(1.0f);
        this.f79d.setTransitioning(true);
        b.a.n.h hVar2 = new b.a.n.h();
        float f = -this.f79d.getHeight();
        if (z) {
            this.f79d.getLocationInWindow(new int[]{0, 0});
            f -= r5[1];
        }
        v vVarC = r.c(this.f79d);
        vVarC.k(f);
        vVarC.i(this.A);
        hVar2.c(vVarC);
        if (this.q && (view = this.g) != null) {
            v vVarC2 = r.c(view);
            vVarC2.k(f);
            hVar2.c(vVarC2);
        }
        hVar2.f(B);
        hVar2.e(250L);
        hVar2.g(this.y);
        this.v = hVar2;
        hVar2.h();
    }

    public void C(boolean z) {
        View view;
        View view2;
        b.a.n.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        this.f79d.setVisibility(0);
        if (this.p == 0 && (this.w || z)) {
            this.f79d.setTranslationY(0.0f);
            float f = -this.f79d.getHeight();
            if (z) {
                this.f79d.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            this.f79d.setTranslationY(f);
            b.a.n.h hVar2 = new b.a.n.h();
            v vVarC = r.c(this.f79d);
            vVarC.k(0.0f);
            vVarC.i(this.A);
            hVar2.c(vVarC);
            if (this.q && (view2 = this.g) != null) {
                view2.setTranslationY(f);
                v vVarC2 = r.c(this.g);
                vVarC2.k(0.0f);
                hVar2.c(vVarC2);
            }
            hVar2.f(C);
            hVar2.e(250L);
            hVar2.g(this.z);
            this.v = hVar2;
            hVar2.h();
        } else {
            this.f79d.setAlpha(1.0f);
            this.f79d.setTranslationY(0.0f);
            if (this.q && (view = this.g) != null) {
                view.setTranslationY(0.0f);
            }
            this.z.a(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f78c;
        if (actionBarOverlayLayout != null) {
            r.a0(actionBarOverlayLayout);
        }
    }

    public int E() {
        return this.e.p();
    }

    public void H(int i, int i2) {
        int i3 = this.e.i();
        if ((i2 & 4) != 0) {
            this.i = true;
        }
        this.e.v((i & i2) | ((i2 ^ (-1)) & i3));
    }

    public void I(float f) {
        r.j0(this.f79d, f);
    }

    public void K(boolean z) {
        if (z && !this.f78c.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.x = z;
        this.f78c.setHideOnContentScrollEnabled(z);
    }

    public void L(boolean z) {
        this.e.n(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a(boolean z) {
        this.q = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        if (this.s) {
            this.s = false;
            O(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
        b.a.n.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
            this.v = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d(int i) {
        this.p = i;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        if (this.s) {
            return;
        }
        this.s = true;
        O(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f() {
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        d0 d0Var = this.e;
        if (d0Var == null || !d0Var.s()) {
            return false;
        }
        this.e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z) {
        if (z == this.m) {
            return;
        }
        this.m = z;
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            this.n.get(i).a(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.e.i();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        if (this.f77b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(b.a.a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f77b = new ContextThemeWrapper(this.a, i);
            } else {
                this.f77b = this.a;
            }
        }
        return this.f77b;
    }

    @Override // androidx.appcompat.app.a
    public void l() {
        if (this.r) {
            return;
        }
        this.r = true;
        O(false);
    }

    @Override // androidx.appcompat.app.a
    public void n(Configuration configuration) {
        J(b.a.n.a.b(this.a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean p(int i, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.j;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z) {
        if (this.i) {
            return;
        }
        t(z);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z) {
        H(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z) {
        b.a.n.h hVar;
        this.w = z;
        if (z || (hVar = this.v) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void v(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public b.a.n.b x(b.a aVar) {
        d dVar = this.j;
        if (dVar != null) {
            dVar.c();
        }
        this.f78c.setHideOnContentScrollEnabled(false);
        this.f.k();
        d dVar2 = new d(this.f.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.j = dVar2;
        dVar2.k();
        this.f.h(dVar2);
        y(true);
        this.f.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void y(boolean z) {
        v vVarQ;
        v vVarF;
        if (z) {
            N();
        } else {
            F();
        }
        if (!M()) {
            if (z) {
                this.e.j(4);
                this.f.setVisibility(0);
                return;
            } else {
                this.e.j(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z) {
            vVarF = this.e.q(4, 100L);
            vVarQ = this.f.f(0, 200L);
        } else {
            vVarQ = this.e.q(0, 200L);
            vVarF = this.f.f(8, 100L);
        }
        b.a.n.h hVar = new b.a.n.h();
        hVar.d(vVarF, vVarQ);
        hVar.h();
    }
}
