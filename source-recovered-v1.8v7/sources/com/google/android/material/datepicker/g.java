package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.g.l.r;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g<S> extends m<S> {
    static final Object j0 = "MONTHS_VIEW_GROUP_TAG";
    static final Object k0 = "NAVIGATION_PREV_TAG";
    static final Object l0 = "NAVIGATION_NEXT_TAG";
    static final Object m0 = "SELECTOR_TOGGLE_TAG";
    private int Z;
    private com.google.android.material.datepicker.d<S> a0;
    private com.google.android.material.datepicker.a b0;
    private com.google.android.material.datepicker.i c0;
    private k d0;
    private com.google.android.material.datepicker.c e0;
    private RecyclerView f0;
    private RecyclerView g0;
    private View h0;
    private View i0;

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2045b;

        a(int i) {
            this.f2045b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.g0.smoothScrollToPosition(this.f2045b);
        }
    }

    class b extends b.g.l.a {
        b(g gVar) {
        }

        @Override // b.g.l.a
        public void g(View view, b.g.l.a0.c cVar) {
            super.g(view, cVar);
            cVar.X(null);
        }
    }

    class c extends n {
        final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.I = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void M1(RecyclerView.a0 a0Var, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = g.this.g0.getWidth();
                iArr[1] = g.this.g0.getWidth();
            } else {
                iArr[0] = g.this.g0.getHeight();
                iArr[1] = g.this.g0.getHeight();
            }
        }
    }

    class d implements l {
        d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.g.l
        public void a(long j) {
            if (g.this.b0.a().o(j)) {
                g.this.a0.s(j);
                Iterator<com.google.android.material.datepicker.l<S>> it = g.this.Y.iterator();
                while (it.hasNext()) {
                    it.next().a(g.this.a0.j());
                }
                g.this.g0.getAdapter().h();
                if (g.this.f0 != null) {
                    g.this.f0.getAdapter().h();
                }
            }
        }
    }

    class e extends RecyclerView.n {
        private final Calendar a = o.k();

        /* renamed from: b, reason: collision with root package name */
        private final Calendar f2047b = o.k();

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if ((recyclerView.getAdapter() instanceof p) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                p pVar = (p) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (b.g.k.d<Long, Long> dVar : g.this.a0.n()) {
                    Long l = dVar.a;
                    if (l != null && dVar.f906b != null) {
                        this.a.setTimeInMillis(l.longValue());
                        this.f2047b.setTimeInMillis(dVar.f906b.longValue());
                        int iW = pVar.w(this.a.get(1));
                        int iW2 = pVar.w(this.f2047b.get(1));
                        View viewC = gridLayoutManager.C(iW);
                        View viewC2 = gridLayoutManager.C(iW2);
                        int iX2 = iW / gridLayoutManager.X2();
                        int iX22 = iW2 / gridLayoutManager.X2();
                        int i = iX2;
                        while (i <= iX22) {
                            if (gridLayoutManager.C(gridLayoutManager.X2() * i) != null) {
                                canvas.drawRect(i == iX2 ? viewC.getLeft() + (viewC.getWidth() / 2) : 0, r9.getTop() + g.this.e0.f2041d.c(), i == iX22 ? viewC2.getLeft() + (viewC2.getWidth() / 2) : recyclerView.getWidth(), r9.getBottom() - g.this.e0.f2041d.b(), g.this.e0.h);
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    class f extends b.g.l.a {
        f() {
        }

        @Override // b.g.l.a
        public void g(View view, b.g.l.a0.c cVar) {
            g gVar;
            int i;
            super.g(view, cVar);
            if (g.this.i0.getVisibility() == 0) {
                gVar = g.this;
                i = d.b.a.b.i.mtrl_picker_toggle_to_year_selection;
            } else {
                gVar = g.this;
                i = d.b.a.b.i.mtrl_picker_toggle_to_day_selection;
            }
            cVar.g0(gVar.I(i));
        }
    }

    /* renamed from: com.google.android.material.datepicker.g$g, reason: collision with other inner class name */
    class C0071g extends RecyclerView.t {
        final /* synthetic */ com.google.android.material.datepicker.k a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f2050b;

        C0071g(com.google.android.material.datepicker.k kVar, MaterialButton materialButton) {
            this.a = kVar;
            this.f2050b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.f2050b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager linearLayoutManagerC1 = g.this.C1();
            int iZ1 = i < 0 ? linearLayoutManagerC1.Z1() : linearLayoutManagerC1.c2();
            g.this.c0 = this.a.v(iZ1);
            this.f2050b.setText(this.a.w(iZ1));
        }
    }

    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.G1();
        }
    }

    class i implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.k f2053b;

        i(com.google.android.material.datepicker.k kVar) {
            this.f2053b = kVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iZ1 = g.this.C1().Z1() + 1;
            if (iZ1 < g.this.g0.getAdapter().c()) {
                g.this.E1(this.f2053b.v(iZ1));
            }
        }
    }

    class j implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.k f2055b;

        j(com.google.android.material.datepicker.k kVar) {
            this.f2055b = kVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iC2 = g.this.C1().c2() - 1;
            if (iC2 >= 0) {
                g.this.E1(this.f2055b.v(iC2));
            }
        }
    }

    enum k {
        DAY,
        YEAR
    }

    interface l {
        void a(long j);
    }

    static int B1(Context context) {
        return context.getResources().getDimensionPixelSize(d.b.a.b.d.mtrl_calendar_day_height);
    }

    private void D1(int i2) {
        this.g0.post(new a(i2));
    }

    private void v1(View view, com.google.android.material.datepicker.k kVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(d.b.a.b.f.month_navigation_fragment_toggle);
        materialButton.setTag(m0);
        r.c0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(d.b.a.b.f.month_navigation_previous);
        materialButton2.setTag(k0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(d.b.a.b.f.month_navigation_next);
        materialButton3.setTag(l0);
        this.h0 = view.findViewById(d.b.a.b.f.mtrl_calendar_year_selector_frame);
        this.i0 = view.findViewById(d.b.a.b.f.mtrl_calendar_day_selector_frame);
        F1(k.DAY);
        materialButton.setText(this.c0.l());
        this.g0.addOnScrollListener(new C0071g(kVar, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(kVar));
        materialButton2.setOnClickListener(new j(kVar));
    }

    private RecyclerView.n w1() {
        return new e();
    }

    public com.google.android.material.datepicker.d<S> A1() {
        return this.a0;
    }

    LinearLayoutManager C1() {
        return (LinearLayoutManager) this.g0.getLayoutManager();
    }

    void E1(com.google.android.material.datepicker.i iVar) {
        RecyclerView recyclerView;
        int i2;
        com.google.android.material.datepicker.k kVar = (com.google.android.material.datepicker.k) this.g0.getAdapter();
        int iX = kVar.x(iVar);
        int iX2 = iX - kVar.x(this.c0);
        boolean z = Math.abs(iX2) > 3;
        boolean z2 = iX2 > 0;
        this.c0 = iVar;
        if (!z || !z2) {
            if (z) {
                recyclerView = this.g0;
                i2 = iX + 3;
            }
            D1(iX);
        }
        recyclerView = this.g0;
        i2 = iX - 3;
        recyclerView.scrollToPosition(i2);
        D1(iX);
    }

    void F1(k kVar) {
        this.d0 = kVar;
        if (kVar == k.YEAR) {
            this.f0.getLayoutManager().x1(((p) this.f0.getAdapter()).w(this.c0.e));
            this.h0.setVisibility(0);
            this.i0.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.h0.setVisibility(8);
            this.i0.setVisibility(0);
            E1(this.c0);
        }
    }

    void G1() {
        k kVar;
        k kVar2 = this.d0;
        if (kVar2 == k.YEAR) {
            kVar = k.DAY;
        } else if (kVar2 != k.DAY) {
            return;
        } else {
            kVar = k.YEAR;
        }
        F1(kVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void Z(Bundle bundle) {
        super.Z(bundle);
        if (bundle == null) {
            bundle = n();
        }
        this.Z = bundle.getInt("THEME_RES_ID_KEY");
        this.a0 = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.b0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.c0 = (com.google.android.material.datepicker.i) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View d0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(p(), this.Z);
        this.e0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.i iVarE = this.b0.e();
        if (com.google.android.material.datepicker.h.u1(contextThemeWrapper)) {
            i2 = d.b.a.b.h.mtrl_calendar_vertical;
            i3 = 1;
        } else {
            i2 = d.b.a.b.h.mtrl_calendar_horizontal;
            i3 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) viewInflate.findViewById(d.b.a.b.f.mtrl_calendar_days_of_week);
        r.c0(gridView, new b(this));
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.f());
        gridView.setNumColumns(iVarE.f);
        gridView.setEnabled(false);
        this.g0 = (RecyclerView) viewInflate.findViewById(d.b.a.b.f.mtrl_calendar_months);
        this.g0.setLayoutManager(new c(p(), i3, false, i3));
        this.g0.setTag(j0);
        com.google.android.material.datepicker.k kVar = new com.google.android.material.datepicker.k(contextThemeWrapper, this.a0, this.b0, new d());
        this.g0.setAdapter(kVar);
        int integer = contextThemeWrapper.getResources().getInteger(d.b.a.b.g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(d.b.a.b.f.mtrl_calendar_year_selector_frame);
        this.f0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f0.setAdapter(new p(this));
            this.f0.addItemDecoration(w1());
        }
        if (viewInflate.findViewById(d.b.a.b.f.month_navigation_fragment_toggle) != null) {
            v1(viewInflate, kVar);
        }
        if (!com.google.android.material.datepicker.h.u1(contextThemeWrapper)) {
            new androidx.recyclerview.widget.i().b(this.g0);
        }
        this.g0.scrollToPosition(kVar.x(this.c0));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void v0(Bundle bundle) {
        super.v0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.Z);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.a0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.b0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.c0);
    }

    com.google.android.material.datepicker.a x1() {
        return this.b0;
    }

    com.google.android.material.datepicker.c y1() {
        return this.e0;
    }

    com.google.android.material.datepicker.i z1() {
        return this.c0;
    }
}
