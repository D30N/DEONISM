package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
class p {
    final b a;

    /* renamed from: b, reason: collision with root package name */
    a f667b = new a();

    static class a {
        int a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f668b;

        /* renamed from: c, reason: collision with root package name */
        int f669c;

        /* renamed from: d, reason: collision with root package name */
        int f670d;
        int e;

        a() {
        }

        void a(int i) {
            this.a = i | this.a;
        }

        boolean b() {
            int i = this.a;
            if ((i & 7) != 0 && (i & (c(this.f670d, this.f668b) << 0)) == 0) {
                return false;
            }
            int i2 = this.a;
            if ((i2 & 112) != 0 && (i2 & (c(this.f670d, this.f669c) << 4)) == 0) {
                return false;
            }
            int i3 = this.a;
            if ((i3 & 1792) != 0 && (i3 & (c(this.e, this.f668b) << 8)) == 0) {
                return false;
            }
            int i4 = this.a;
            return (i4 & 28672) == 0 || (i4 & (c(this.e, this.f669c) << 12)) != 0;
        }

        int c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        void d() {
            this.a = 0;
        }

        void e(int i, int i2, int i3, int i4) {
            this.f668b = i;
            this.f669c = i2;
            this.f670d = i3;
            this.e = i4;
        }
    }

    interface b {
        View a(int i);

        int b();

        int c();

        int d(View view);

        int e(View view);
    }

    p(b bVar) {
        this.a = bVar;
    }

    View a(int i, int i2, int i3, int i4) {
        int iC = this.a.c();
        int iB = this.a.b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewA = this.a.a(i);
            this.f667b.e(iC, iB, this.a.e(viewA), this.a.d(viewA));
            if (i3 != 0) {
                this.f667b.d();
                this.f667b.a(i3);
                if (this.f667b.b()) {
                    return viewA;
                }
            }
            if (i4 != 0) {
                this.f667b.d();
                this.f667b.a(i4);
                if (this.f667b.b()) {
                    view = viewA;
                }
            }
            i += i5;
        }
        return view;
    }

    boolean b(View view, int i) {
        this.f667b.e(this.a.c(), this.a.b(), this.a.e(view), this.a.d(view));
        if (i == 0) {
            return false;
        }
        this.f667b.d();
        this.f667b.a(i);
        return this.f667b.b();
    }
}
