package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class k {
    protected final RecyclerView.o a;

    /* renamed from: b, reason: collision with root package name */
    private int f660b;

    /* renamed from: c, reason: collision with root package name */
    final Rect f661c;

    static class a extends k {
        a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.k
        public int d(View view) {
            return this.a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.a.S(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.a.R(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int g(View view) {
            return this.a.Q(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int h() {
            return this.a.o0();
        }

        @Override // androidx.recyclerview.widget.k
        public int i() {
            return this.a.o0() - this.a.f0();
        }

        @Override // androidx.recyclerview.widget.k
        public int j() {
            return this.a.f0();
        }

        @Override // androidx.recyclerview.widget.k
        public int k() {
            return this.a.p0();
        }

        @Override // androidx.recyclerview.widget.k
        public int l() {
            return this.a.X();
        }

        @Override // androidx.recyclerview.widget.k
        public int m() {
            return this.a.e0();
        }

        @Override // androidx.recyclerview.widget.k
        public int n() {
            return (this.a.o0() - this.a.e0()) - this.a.f0();
        }

        @Override // androidx.recyclerview.widget.k
        public int p(View view) {
            this.a.n0(view, true, this.f661c);
            return this.f661c.right;
        }

        @Override // androidx.recyclerview.widget.k
        public int q(View view) {
            this.a.n0(view, true, this.f661c);
            return this.f661c.left;
        }

        @Override // androidx.recyclerview.widget.k
        public void r(int i) {
            this.a.C0(i);
        }
    }

    static class b extends k {
        b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.k
        public int d(View view) {
            return this.a.O(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.a.R(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.a.S(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int g(View view) {
            return this.a.U(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.k
        public int h() {
            return this.a.W();
        }

        @Override // androidx.recyclerview.widget.k
        public int i() {
            return this.a.W() - this.a.d0();
        }

        @Override // androidx.recyclerview.widget.k
        public int j() {
            return this.a.d0();
        }

        @Override // androidx.recyclerview.widget.k
        public int k() {
            return this.a.X();
        }

        @Override // androidx.recyclerview.widget.k
        public int l() {
            return this.a.p0();
        }

        @Override // androidx.recyclerview.widget.k
        public int m() {
            return this.a.g0();
        }

        @Override // androidx.recyclerview.widget.k
        public int n() {
            return (this.a.W() - this.a.g0()) - this.a.d0();
        }

        @Override // androidx.recyclerview.widget.k
        public int p(View view) {
            this.a.n0(view, true, this.f661c);
            return this.f661c.bottom;
        }

        @Override // androidx.recyclerview.widget.k
        public int q(View view) {
            this.a.n0(view, true, this.f661c);
            return this.f661c.top;
        }

        @Override // androidx.recyclerview.widget.k
        public void r(int i) {
            this.a.D0(i);
        }
    }

    private k(RecyclerView.o oVar) {
        this.f660b = RecyclerView.UNDEFINED_DURATION;
        this.f661c = new Rect();
        this.a = oVar;
    }

    /* synthetic */ k(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static k a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static k b(RecyclerView.o oVar, int i) {
        if (i == 0) {
            return a(oVar);
        }
        if (i == 1) {
            return c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static k c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f660b) {
            return 0;
        }
        return n() - this.f660b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public void s() {
        this.f660b = n();
    }
}
