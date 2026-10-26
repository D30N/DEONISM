package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class i extends o {

    /* renamed from: d, reason: collision with root package name */
    private k f659d;
    private k e;

    private float m(RecyclerView.o oVar, k kVar) {
        int iJ = oVar.J();
        if (iJ == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = RecyclerView.UNDEFINED_DURATION;
        for (int i3 = 0; i3 < iJ; i3++) {
            View viewI = oVar.I(i3);
            int iH0 = oVar.h0(viewI);
            if (iH0 != -1) {
                if (iH0 < i) {
                    view = viewI;
                    i = iH0;
                }
                if (iH0 > i2) {
                    view2 = viewI;
                    i2 = iH0;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int iMax = Math.max(kVar.d(view), kVar.d(view2)) - Math.min(kVar.g(view), kVar.g(view2));
        if (iMax == 0) {
            return 1.0f;
        }
        return (iMax * 1.0f) / ((i2 - i) + 1);
    }

    private int n(RecyclerView.o oVar, View view, k kVar) {
        return (kVar.g(view) + (kVar.e(view) / 2)) - (kVar.m() + (kVar.n() / 2));
    }

    private int o(RecyclerView.o oVar, k kVar, int i, int i2) {
        int[] iArrD = d(i, i2);
        float fM = m(oVar, kVar);
        if (fM <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArrD[0]) > Math.abs(iArrD[1]) ? iArrD[0] : iArrD[1]) / fM);
    }

    private View p(RecyclerView.o oVar, k kVar) {
        int iJ = oVar.J();
        View view = null;
        if (iJ == 0) {
            return null;
        }
        int iM = kVar.m() + (kVar.n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iJ; i2++) {
            View viewI = oVar.I(i2);
            int iAbs = Math.abs((kVar.g(viewI) + (kVar.e(viewI) / 2)) - iM);
            if (iAbs < i) {
                view = viewI;
                i = iAbs;
            }
        }
        return view;
    }

    private k q(RecyclerView.o oVar) {
        k kVar = this.e;
        if (kVar == null || kVar.a != oVar) {
            this.e = k.a(oVar);
        }
        return this.e;
    }

    private k r(RecyclerView.o oVar) {
        k kVar = this.f659d;
        if (kVar == null || kVar.a != oVar) {
            this.f659d = k.c(oVar);
        }
        return this.f659d;
    }

    @Override // androidx.recyclerview.widget.o
    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.k()) {
            iArr[0] = n(oVar, view, q(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.l()) {
            iArr[1] = n(oVar, view, r(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.o
    public View h(RecyclerView.o oVar) {
        k kVarQ;
        if (oVar.l()) {
            kVarQ = r(oVar);
        } else {
            if (!oVar.k()) {
                return null;
            }
            kVarQ = q(oVar);
        }
        return p(oVar, kVarQ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.o
    public int i(RecyclerView.o oVar, int i, int i2) {
        int iY;
        View viewH;
        int iH0;
        int i3;
        PointF pointFA;
        int iO;
        int iO2;
        if (!(oVar instanceof RecyclerView.z.b) || (iY = oVar.Y()) == 0 || (viewH = h(oVar)) == null || (iH0 = oVar.h0(viewH)) == -1 || (pointFA = ((RecyclerView.z.b) oVar).a(iY - 1)) == null) {
            return -1;
        }
        if (oVar.k()) {
            iO = o(oVar, q(oVar), i, 0);
            if (pointFA.x < 0.0f) {
                iO = -iO;
            }
        } else {
            iO = 0;
        }
        if (oVar.l()) {
            iO2 = o(oVar, r(oVar), 0, i2);
            if (pointFA.y < 0.0f) {
                iO2 = -iO2;
            }
        } else {
            iO2 = 0;
        }
        if (oVar.l()) {
            iO = iO2;
        }
        if (iO == 0) {
            return -1;
        }
        int i4 = iH0 + iO;
        int i5 = i4 >= 0 ? i4 : 0;
        return i5 >= iY ? i3 : i5;
    }
}
