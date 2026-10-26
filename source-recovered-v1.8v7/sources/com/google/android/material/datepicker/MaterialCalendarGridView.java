package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import b.g.l.r;
import java.util.Calendar;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: b, reason: collision with root package name */
    private final Calendar f2032b;

    class a extends b.g.l.a {
        a(MaterialCalendarGridView materialCalendarGridView) {
        }

        @Override // b.g.l.a
        public void g(View view, b.g.l.a0.c cVar) {
            super.g(view, cVar);
            cVar.X(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2032b = o.k();
        if (h.u1(getContext())) {
            setNextFocusLeftId(d.b.a.b.f.cancel_button);
            setNextFocusRightId(d.b.a.b.f.confirm_button);
        }
        r.c0(this, new a(this));
    }

    private void a(int i, Rect rect) {
        int iB;
        if (i == 33) {
            iB = getAdapter().h();
        } else {
            if (i != 130) {
                super.onFocusChanged(true, i, rect);
                return;
            }
            iB = getAdapter().b();
        }
        setSelection(iB);
    }

    private static int c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean d(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j getAdapter() {
        return (j) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int iA;
        int iC;
        int iA2;
        int iC2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        j adapter = getAdapter();
        d<?> dVar = adapter.f2064c;
        c cVar = adapter.f2065d;
        Long item = adapter.getItem(adapter.b());
        Long item2 = adapter.getItem(adapter.h());
        for (b.g.k.d<Long, Long> dVar2 : dVar.n()) {
            Long l = dVar2.a;
            if (l != null) {
                if (dVar2.f906b == null) {
                    continue;
                } else {
                    long jLongValue = l.longValue();
                    long jLongValue2 = dVar2.f906b.longValue();
                    if (d(item, item2, Long.valueOf(jLongValue), Long.valueOf(jLongValue2))) {
                        return;
                    }
                    if (jLongValue < item.longValue()) {
                        iA = adapter.b();
                        iC = adapter.f(iA) ? 0 : materialCalendarGridView.getChildAt(iA - 1).getRight();
                    } else {
                        materialCalendarGridView.f2032b.setTimeInMillis(jLongValue);
                        iA = adapter.a(materialCalendarGridView.f2032b.get(5));
                        iC = c(materialCalendarGridView.getChildAt(iA));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        iA2 = adapter.h();
                        iC2 = adapter.g(iA2) ? getWidth() : materialCalendarGridView.getChildAt(iA2).getRight();
                    } else {
                        materialCalendarGridView.f2032b.setTimeInMillis(jLongValue2);
                        iA2 = adapter.a(materialCalendarGridView.f2032b.get(5));
                        iC2 = c(materialCalendarGridView.getChildAt(iA2));
                    }
                    int itemId = (int) adapter.getItemId(iA);
                    int itemId2 = (int) adapter.getItemId(iA2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View childAt = materialCalendarGridView.getChildAt(numColumns);
                        canvas.drawRect(numColumns > iA ? 0 : iC, childAt.getTop() + cVar.a.c(), iA2 > numColumns2 ? getWidth() : iC2, childAt.getBottom() - cVar.a.b(), cVar.h);
                        itemId++;
                        materialCalendarGridView = this;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof j)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), j.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter().b()) {
            i = getAdapter().b();
        }
        super.setSelection(i);
    }
}
