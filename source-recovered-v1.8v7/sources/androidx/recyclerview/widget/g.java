package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class g {

    /* renamed from: b, reason: collision with root package name */
    int f656b;

    /* renamed from: c, reason: collision with root package name */
    int f657c;

    /* renamed from: d, reason: collision with root package name */
    int f658d;
    int e;
    boolean h;
    boolean i;
    boolean a = true;
    int f = 0;
    int g = 0;

    g() {
    }

    boolean a(RecyclerView.a0 a0Var) {
        int i = this.f657c;
        return i >= 0 && i < a0Var.b();
    }

    View b(RecyclerView.v vVar) {
        View viewO = vVar.o(this.f657c);
        this.f657c += this.f658d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f656b + ", mCurrentPosition=" + this.f657c + ", mItemDirection=" + this.f658d + ", mLayoutDirection=" + this.e + ", mStartLine=" + this.f + ", mEndLine=" + this.g + '}';
    }
}
