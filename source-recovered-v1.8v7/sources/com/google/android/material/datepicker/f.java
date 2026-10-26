package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
class f extends BaseAdapter {
    private static final int e;

    /* renamed from: b, reason: collision with root package name */
    private final Calendar f2042b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2043c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2044d;

    static {
        e = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public f() {
        Calendar calendarK = o.k();
        this.f2042b = calendarK;
        this.f2043c = calendarK.getMaximum(7);
        this.f2044d = this.f2042b.getFirstDayOfWeek();
    }

    private int b(int i) {
        int i2 = i + this.f2044d;
        int i3 = this.f2043c;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i) {
        if (i >= this.f2043c) {
            return null;
        }
        return Integer.valueOf(b(i));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f2043c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(d.b.a.b.h.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f2042b.set(7, b(i));
        textView.setText(this.f2042b.getDisplayName(7, e, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(d.b.a.b.i.mtrl_picker_day_of_week_column_header), this.f2042b.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
