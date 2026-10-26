package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.g.l.r;
import com.google.android.material.datepicker.g;

/* loaded from: classes.dex */
class k extends RecyclerView.g<b> {

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.material.datepicker.a f2066c;

    /* renamed from: d, reason: collision with root package name */
    private final d<?> f2067d;
    private final g.l e;
    private final int f;

    class a implements AdapterView.OnItemClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f2068b;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f2068b = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f2068b.getAdapter().j(i)) {
                k.this.e.a(this.f2068b.getAdapter().getItem(i).longValue());
            }
        }
    }

    public static class b extends RecyclerView.d0 {
        final TextView t;
        final MaterialCalendarGridView u;

        b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(d.b.a.b.f.month_title);
            this.t = textView;
            r.d0(textView, true);
            this.u = (MaterialCalendarGridView) linearLayout.findViewById(d.b.a.b.f.month_grid);
            if (z) {
                return;
            }
            this.t.setVisibility(8);
        }
    }

    k(Context context, d<?> dVar, com.google.android.material.datepicker.a aVar, g.l lVar) {
        i iVarE = aVar.e();
        i iVarB = aVar.b();
        i iVarD = aVar.d();
        if (iVarE.compareTo(iVarD) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (iVarD.compareTo(iVarB) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f = (j.f * g.B1(context)) + (h.u1(context) ? g.B1(context) : 0);
        this.f2066c = aVar;
        this.f2067d = dVar;
        this.e = lVar;
        s(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.f2066c.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long d(int i) {
        return this.f2066c.e().p(i).m();
    }

    i v(int i) {
        return this.f2066c.e().p(i);
    }

    CharSequence w(int i) {
        return v(i).l();
    }

    int x(i iVar) {
        return this.f2066c.e().q(iVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void j(b bVar, int i) {
        i iVarP = this.f2066c.e().p(i);
        bVar.t.setText(iVarP.l());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.u.findViewById(d.b.a.b.f.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !iVarP.equals(materialCalendarGridView.getAdapter().f2063b)) {
            j jVar = new j(iVarP, this.f2067d, this.f2066c);
            materialCalendarGridView.setNumColumns(iVarP.f);
            materialCalendarGridView.setAdapter((ListAdapter) jVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public b l(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(d.b.a.b.h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!h.u1(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f));
        return new b(linearLayout, true);
    }
}
