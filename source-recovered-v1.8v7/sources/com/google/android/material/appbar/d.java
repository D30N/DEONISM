package com.google.android.material.appbar;

import android.view.View;
import b.g.l.r;

/* loaded from: classes.dex */
class d {
    private final View a;

    /* renamed from: b, reason: collision with root package name */
    private int f1993b;

    /* renamed from: c, reason: collision with root package name */
    private int f1994c;

    /* renamed from: d, reason: collision with root package name */
    private int f1995d;
    private int e;
    private boolean f = true;
    private boolean g = true;

    public d(View view) {
        this.a = view;
    }

    void a() {
        View view = this.a;
        r.P(view, this.f1995d - (view.getTop() - this.f1993b));
        View view2 = this.a;
        r.O(view2, this.e - (view2.getLeft() - this.f1994c));
    }

    public int b() {
        return this.f1995d;
    }

    void c() {
        this.f1993b = this.a.getTop();
        this.f1994c = this.a.getLeft();
    }

    public boolean d(int i) {
        if (!this.g || this.e == i) {
            return false;
        }
        this.e = i;
        a();
        return true;
    }

    public boolean e(int i) {
        if (!this.f || this.f1995d == i) {
            return false;
        }
        this.f1995d = i;
        a();
        return true;
    }
}
