package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class m {
    static int a(RecyclerView.a0 a0Var, k kVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.J() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.h0(view) - oVar.h0(view2)) + 1;
        }
        return Math.min(kVar.n(), kVar.d(view2) - kVar.g(view));
    }

    static int b(RecyclerView.a0 a0Var, k kVar, View view, View view2, RecyclerView.o oVar, boolean z, boolean z2) {
        if (oVar.J() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (a0Var.b() - Math.max(oVar.h0(view), oVar.h0(view2))) - 1) : Math.max(0, Math.min(oVar.h0(view), oVar.h0(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(kVar.d(view2) - kVar.g(view)) / (Math.abs(oVar.h0(view) - oVar.h0(view2)) + 1))) + (kVar.m() - kVar.g(view)));
        }
        return iMax;
    }

    static int c(RecyclerView.a0 a0Var, k kVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.J() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return a0Var.b();
        }
        return (int) (((kVar.d(view2) - kVar.g(view)) / (Math.abs(oVar.h0(view) - oVar.h0(view2)) + 1)) * a0Var.b());
    }
}
