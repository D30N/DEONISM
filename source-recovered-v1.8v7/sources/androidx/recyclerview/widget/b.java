package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class b {
    final InterfaceC0014b a;

    /* renamed from: b, reason: collision with root package name */
    final a f609b = new a();

    /* renamed from: c, reason: collision with root package name */
    final List<View> f610c = new ArrayList();

    static class a {
        long a = 0;

        /* renamed from: b, reason: collision with root package name */
        a f611b;

        a() {
        }

        private void c() {
            if (this.f611b == null) {
                this.f611b = new a();
            }
        }

        void a(int i) {
            if (i < 64) {
                this.a &= (1 << i) ^ (-1);
                return;
            }
            a aVar = this.f611b;
            if (aVar != null) {
                aVar.a(i - 64);
            }
        }

        int b(int i) {
            a aVar = this.f611b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.a) : Long.bitCount(this.a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.a & ((1 << i) - 1)) : aVar.b(i - 64) + Long.bitCount(this.a);
        }

        boolean d(int i) {
            if (i < 64) {
                return (this.a & (1 << i)) != 0;
            }
            c();
            return this.f611b.d(i - 64);
        }

        void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.f611b.e(i - 64, z);
                return;
            }
            boolean z2 = (this.a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.a;
            this.a = ((j2 & (j ^ (-1))) << 1) | (j2 & j);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.f611b != null) {
                c();
                this.f611b.e(0, z2);
            }
        }

        boolean f(int i) {
            if (i >= 64) {
                c();
                return this.f611b.f(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.a & j) != 0;
            long j2 = this.a & (j ^ (-1));
            this.a = j2;
            long j3 = j - 1;
            this.a = (j2 & j3) | Long.rotateRight((j3 ^ (-1)) & j2, 1);
            a aVar = this.f611b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f611b.f(0);
            }
            return z;
        }

        void g() {
            this.a = 0L;
            a aVar = this.f611b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i) {
            if (i < 64) {
                this.a |= 1 << i;
            } else {
                c();
                this.f611b.h(i - 64);
            }
        }

        public String toString() {
            if (this.f611b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.f611b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    interface InterfaceC0014b {
        View a(int i);

        void addView(View view, int i);

        void b(View view);

        void c(int i);

        void d();

        RecyclerView.d0 e(View view);

        void f(int i);

        void g(View view);

        void h(View view, int i, ViewGroup.LayoutParams layoutParams);

        int i(View view);

        int j();
    }

    b(InterfaceC0014b interfaceC0014b) {
        this.a = interfaceC0014b;
    }

    private int h(int i) {
        if (i < 0) {
            return -1;
        }
        int iJ = this.a.j();
        int i2 = i;
        while (i2 < iJ) {
            int iB = i - (i2 - this.f609b.b(i2));
            if (iB == 0) {
                while (this.f609b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iB;
        }
        return -1;
    }

    private void l(View view) {
        this.f610c.add(view);
        this.a.b(view);
    }

    private boolean t(View view) {
        if (!this.f610c.remove(view)) {
            return false;
        }
        this.a.g(view);
        return true;
    }

    void a(View view, int i, boolean z) {
        int iJ = i < 0 ? this.a.j() : h(i);
        this.f609b.e(iJ, z);
        if (z) {
            l(view);
        }
        this.a.addView(view, iJ);
    }

    void b(View view, boolean z) {
        a(view, -1, z);
    }

    void c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iJ = i < 0 ? this.a.j() : h(i);
        this.f609b.e(iJ, z);
        if (z) {
            l(view);
        }
        this.a.h(view, iJ, layoutParams);
    }

    void d(int i) {
        int iH = h(i);
        this.f609b.f(iH);
        this.a.f(iH);
    }

    View e(int i) {
        int size = this.f610c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f610c.get(i2);
            RecyclerView.d0 d0VarE = this.a.e(view);
            if (d0VarE.m() == i && !d0VarE.t() && !d0VarE.v()) {
                return view;
            }
        }
        return null;
    }

    View f(int i) {
        return this.a.a(h(i));
    }

    int g() {
        return this.a.j() - this.f610c.size();
    }

    View i(int i) {
        return this.a.a(i);
    }

    int j() {
        return this.a.j();
    }

    void k(View view) {
        int i = this.a.i(view);
        if (i >= 0) {
            this.f609b.h(i);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int i = this.a.i(view);
        if (i == -1 || this.f609b.d(i)) {
            return -1;
        }
        return i - this.f609b.b(i);
    }

    boolean n(View view) {
        return this.f610c.contains(view);
    }

    void o() {
        this.f609b.g();
        for (int size = this.f610c.size() - 1; size >= 0; size--) {
            this.a.g(this.f610c.get(size));
            this.f610c.remove(size);
        }
        this.a.d();
    }

    void p(View view) {
        int i = this.a.i(view);
        if (i < 0) {
            return;
        }
        if (this.f609b.f(i)) {
            t(view);
        }
        this.a.c(i);
    }

    void q(int i) {
        int iH = h(i);
        View viewA = this.a.a(iH);
        if (viewA == null) {
            return;
        }
        if (this.f609b.f(iH)) {
            t(viewA);
        }
        this.a.c(iH);
    }

    boolean r(View view) {
        int i = this.a.i(view);
        if (i == -1) {
            t(view);
            return true;
        }
        if (!this.f609b.d(i)) {
            return false;
        }
        this.f609b.f(i);
        t(view);
        this.a.c(i);
        return true;
    }

    void s(View view) {
        int i = this.a.i(view);
        if (i < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f609b.d(i)) {
            this.f609b.a(i);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f609b.toString() + ", hidden list:" + this.f610c.size();
    }
}
