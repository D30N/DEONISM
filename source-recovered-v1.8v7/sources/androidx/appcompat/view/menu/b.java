package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b implements m {

    /* renamed from: b, reason: collision with root package name */
    protected Context f90b;

    /* renamed from: c, reason: collision with root package name */
    protected Context f91c;

    /* renamed from: d, reason: collision with root package name */
    protected g f92d;
    protected LayoutInflater e;
    private m.a f;
    private int g;
    private int h;
    protected n i;

    public b(Context context, int i, int i2) {
        this.f90b = context;
        this.e = LayoutInflater.from(context);
        this.g = i;
        this.h = i2;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z) {
        m.a aVar = this.f;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    protected void b(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.i).addView(view, i);
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(Context context, g gVar) {
        this.f91c = context;
        LayoutInflater.from(context);
        this.f92d = gVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void g(m.a aVar) {
        this.f = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean h(r rVar) {
        m.a aVar = this.f;
        if (aVar != null) {
            return aVar.b(rVar);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.m
    public void i(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f92d;
        int i = 0;
        if (gVar != null) {
            gVar.r();
            ArrayList<i> arrayListE = this.f92d.E();
            int size = arrayListE.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i iVar = arrayListE.get(i3);
                if (q(i2, iVar)) {
                    View childAt = viewGroup.getChildAt(i2);
                    i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                    View viewN = n(iVar, childAt, viewGroup);
                    if (iVar != itemData) {
                        viewN.setPressed(false);
                        viewN.jumpDrawablesToCurrentState();
                    }
                    if (viewN != childAt) {
                        b(viewN, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!l(viewGroup, i)) {
                i++;
            }
        }
    }

    public abstract void j(i iVar, n.a aVar);

    public n.a k(ViewGroup viewGroup) {
        return (n.a) this.e.inflate(this.h, viewGroup, false);
    }

    protected boolean l(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public m.a m() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(i iVar, View view, ViewGroup viewGroup) {
        n.a aVarK = view instanceof n.a ? (n.a) view : k(viewGroup);
        j(iVar, aVarK);
        return (View) aVarK;
    }

    public n o(ViewGroup viewGroup) {
        if (this.i == null) {
            n nVar = (n) this.e.inflate(this.g, viewGroup, false);
            this.i = nVar;
            nVar.b(this.f92d);
            i(true);
        }
        return this.i;
    }

    public void p(int i) {
    }

    public abstract boolean q(int i, i iVar);
}
