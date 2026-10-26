package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.g;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
class p extends RecyclerView.g<b> {

    /* renamed from: c, reason: collision with root package name */
    private final g<?> f2070c;

    class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2071b;

        a(int i) {
            this.f2071b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p.this.f2070c.E1(i.g(this.f2071b, p.this.f2070c.z1().f2062d));
            p.this.f2070c.F1(g.k.DAY);
        }
    }

    public static class b extends RecyclerView.d0 {
        final TextView t;

        b(TextView textView) {
            super(textView);
            this.t = textView;
        }
    }

    p(g<?> gVar) {
        this.f2070c = gVar;
    }

    private View.OnClickListener v(int i) {
        return new a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.f2070c.x1().f();
    }

    int w(int i) {
        return i - this.f2070c.x1().e().e;
    }

    int x(int i) {
        return this.f2070c.x1().e().e + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void j(b bVar, int i) {
        int iX = x(i);
        String string = bVar.t.getContext().getString(d.b.a.b.i.mtrl_picker_navigate_to_year_description);
        bVar.t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iX)));
        bVar.t.setContentDescription(String.format(string, Integer.valueOf(iX)));
        c cVarY1 = this.f2070c.y1();
        Calendar calendarI = o.i();
        com.google.android.material.datepicker.b bVar2 = calendarI.get(1) == iX ? cVarY1.f : cVarY1.f2041d;
        Iterator<Long> it = this.f2070c.A1().u().iterator();
        while (it.hasNext()) {
            calendarI.setTimeInMillis(it.next().longValue());
            if (calendarI.get(1) == iX) {
                bVar2 = cVarY1.e;
            }
        }
        bVar2.d(bVar.t);
        bVar.t.setOnClickListener(v(iX));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public b l(ViewGroup viewGroup, int i) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(d.b.a.b.h.mtrl_calendar_year, viewGroup, false));
    }
}
