package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.l0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int C = b.a.g.abc_cascading_menu_item_layout;
    private PopupWindow.OnDismissListener A;
    boolean B;

    /* renamed from: c, reason: collision with root package name */
    private final Context f95c;

    /* renamed from: d, reason: collision with root package name */
    private final int f96d;
    private final int e;
    private final int f;
    private final boolean g;
    final Handler h;
    private View p;
    View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private m.a y;
    ViewTreeObserver z;
    private final List<g> i = new ArrayList();
    final List<C0002d> j = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    private final View.OnAttachStateChangeListener l = new b();
    private final k0 m = new c();
    private int n = 0;
    private int o = 0;
    private boolean w = false;
    private int r = C();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.b() || d.this.j.size() <= 0 || d.this.j.get(0).a.w()) {
                return;
            }
            View view = d.this.q;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            Iterator<C0002d> it = d.this.j.iterator();
            while (it.hasNext()) {
                it.next().a.show();
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
            ViewTreeObserver viewTreeObserver = d.this.z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.z = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.z.removeGlobalOnLayoutListener(dVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements k0 {

        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0002d f100b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ MenuItem f101c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ g f102d;

            a(C0002d c0002d, MenuItem menuItem, g gVar) {
                this.f100b = c0002d;
                this.f101c = menuItem;
                this.f102d = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0002d c0002d = this.f100b;
                if (c0002d != null) {
                    d.this.B = true;
                    c0002d.f103b.e(false);
                    d.this.B = false;
                }
                if (this.f101c.isEnabled() && this.f101c.hasSubMenu()) {
                    this.f102d.L(this.f101c, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.k0
        public void a(g gVar, MenuItem menuItem) {
            d.this.h.removeCallbacksAndMessages(null);
            int size = d.this.j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == d.this.j.get(i).f103b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            d.this.h.postAtTime(new a(i2 < d.this.j.size() ? d.this.j.get(i2) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.k0
        public void h(g gVar, MenuItem menuItem) {
            d.this.h.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d, reason: collision with other inner class name */
    private static class C0002d {
        public final l0 a;

        /* renamed from: b, reason: collision with root package name */
        public final g f103b;

        /* renamed from: c, reason: collision with root package name */
        public final int f104c;

        public C0002d(l0 l0Var, g gVar, int i) {
            this.a = l0Var;
            this.f103b = gVar;
            this.f104c = i;
        }

        public ListView a() {
            return this.a.k();
        }
    }

    public d(Context context, View view, int i, int i2, boolean z) {
        this.f95c = context;
        this.p = view;
        this.e = i;
        this.f = i2;
        this.g = z;
        Resources resources = context.getResources();
        this.f96d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(b.a.d.abc_config_prefDialogWidth));
        this.h = new Handler();
    }

    private MenuItem A(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View B(C0002d c0002d, g gVar) {
        f fVar;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemA = A(c0002d.f103b, gVar);
        if (menuItemA == null) {
            return null;
        }
        ListView listViewA = c0002d.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            headersCount = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i >= count) {
                i = -1;
                break;
            }
            if (menuItemA == fVar.getItem(i)) {
                break;
            }
            i++;
        }
        if (i != -1 && (firstVisiblePosition = (i + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int C() {
        return b.g.l.r.v(this.p) == 1 ? 0 : 1;
    }

    private int D(int i) {
        List<C0002d> list = this.j;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.q.getWindowVisibleDisplayFrame(rect);
        return this.r == 1 ? (iArr[0] + listViewA.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    private void E(g gVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C0002d c0002d;
        View viewB;
        int i;
        int i2;
        int i3;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f95c);
        f fVar = new f(gVar, layoutInflaterFrom, this.g, C);
        if (!b() && this.w) {
            fVar.d(true);
        } else if (b()) {
            fVar.d(k.w(gVar));
        }
        int iN = k.n(fVar, null, this.f95c, this.f96d);
        l0 l0VarY = y();
        l0VarY.n(fVar);
        l0VarY.A(iN);
        l0VarY.B(this.o);
        if (this.j.size() > 0) {
            List<C0002d> list = this.j;
            c0002d = list.get(list.size() - 1);
            viewB = B(c0002d, gVar);
        } else {
            c0002d = null;
            viewB = null;
        }
        if (viewB != null) {
            l0VarY.P(false);
            l0VarY.M(null);
            int iD = D(iN);
            boolean z = iD == 1;
            this.r = iD;
            if (Build.VERSION.SDK_INT >= 26) {
                l0VarY.y(viewB);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewB.getLocationOnScreen(iArr2);
                if ((this.o & 7) == 5) {
                    iArr[0] = iArr[0] + this.p.getWidth();
                    iArr2[0] = iArr2[0] + viewB.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.o & 5) == 5) {
                if (!z) {
                    iN = viewB.getWidth();
                    i3 = i - iN;
                }
                i3 = i + iN;
            } else {
                if (z) {
                    iN = viewB.getWidth();
                    i3 = i + iN;
                }
                i3 = i - iN;
            }
            l0VarY.d(i3);
            l0VarY.H(true);
            l0VarY.m(i2);
        } else {
            if (this.s) {
                l0VarY.d(this.u);
            }
            if (this.t) {
                l0VarY.m(this.v);
            }
            l0VarY.C(m());
        }
        this.j.add(new C0002d(l0VarY, gVar, this.r));
        l0VarY.show();
        ListView listViewK = l0VarY.k();
        listViewK.setOnKeyListener(this);
        if (c0002d == null && this.x && gVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(b.a.g.abc_popup_menu_header_item_layout, (ViewGroup) listViewK, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(gVar.x());
            listViewK.addHeaderView(frameLayout, null, false);
            l0VarY.show();
        }
    }

    private l0 y() {
        l0 l0Var = new l0(this.f95c, null, this.e, this.f);
        l0Var.O(this.m);
        l0Var.G(this);
        l0Var.F(this);
        l0Var.y(this.p);
        l0Var.B(this.o);
        l0Var.E(true);
        l0Var.D(2);
        return l0Var;
    }

    private int z(g gVar) {
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            if (gVar == this.j.get(i).f103b) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z) {
        int iZ = z(gVar);
        if (iZ < 0) {
            return;
        }
        int i = iZ + 1;
        if (i < this.j.size()) {
            this.j.get(i).f103b.e(false);
        }
        C0002d c0002dRemove = this.j.remove(iZ);
        c0002dRemove.f103b.O(this);
        if (this.B) {
            c0002dRemove.a.N(null);
            c0002dRemove.a.z(0);
        }
        c0002dRemove.a.dismiss();
        int size = this.j.size();
        this.r = size > 0 ? this.j.get(size - 1).f104c : C();
        if (size != 0) {
            if (z) {
                this.j.get(0).f103b.e(false);
                return;
            }
            return;
        }
        dismiss();
        m.a aVar = this.y;
        if (aVar != null) {
            aVar.a(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.z.removeGlobalOnLayoutListener(this.k);
            }
            this.z = null;
        }
        this.q.removeOnAttachStateChangeListener(this.l);
        this.A.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return this.j.size() > 0 && this.j.get(0).a.b();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        int size = this.j.size();
        if (size > 0) {
            C0002d[] c0002dArr = (C0002d[]) this.j.toArray(new C0002d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0002d c0002d = c0002dArr[i];
                if (c0002d.a.b()) {
                    c0002d.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void g(m.a aVar) {
        this.y = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean h(r rVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (C0002d c0002d : this.j) {
            if (rVar == c0002d.f103b) {
                c0002d.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        j(rVar);
        m.a aVar = this.y;
        if (aVar != null) {
            aVar.b(rVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(boolean z) {
        Iterator<C0002d> it = this.j.iterator();
        while (it.hasNext()) {
            k.x(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void j(g gVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        gVar.c(this, this.f95c);
        if (b()) {
            E(gVar);
        } else {
            this.i.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView k() {
        if (this.j.isEmpty()) {
            return null;
        }
        return this.j.get(r0.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.k
    protected boolean l() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public void o(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = b.g.l.c.b(this.n, b.g.l.r.v(view));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0002d c0002d;
        int size = this.j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0002d = null;
                break;
            }
            c0002d = this.j.get(i);
            if (!c0002d.a.b()) {
                break;
            } else {
                i++;
            }
        }
        if (c0002d != null) {
            c0002d.f103b.e(false);
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
        this.w = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(int i) {
        if (this.n != i) {
            this.n = i;
            this.o = b.g.l.c.b(i, b.g.l.r.v(this.p));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // androidx.appcompat.view.menu.p
    public void show() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (b()) {
            return;
        }
        Iterator<g> it = this.i.iterator();
        while (it.hasNext()) {
            E(it.next());
        }
        this.i.clear();
        View view = this.p;
        this.q = view;
        if (view != null) {
            boolean z = this.z == null;
            ViewTreeObserver viewTreeObserver = this.q.getViewTreeObserver();
            this.z = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.k);
            }
            this.q.addOnAttachStateChangeListener(this.l);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(boolean z) {
        this.x = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(int i) {
        this.t = true;
        this.v = i;
    }
}
