package b.e.a.j;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class p extends f {
    protected ArrayList<f> k0 = new ArrayList<>();

    @Override // b.e.a.j.f
    public void F0() {
        super.F0();
        ArrayList<f> arrayList = this.k0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            f fVar = this.k0.get(i);
            fVar.n0(p(), q());
            if (!(fVar instanceof g)) {
                fVar.F0();
            }
        }
    }

    public void I0(f fVar) {
        this.k0.add(fVar);
        if (fVar.u() != null) {
            ((p) fVar.u()).L0(fVar);
        }
        fVar.p0(this);
    }

    public g J0() {
        f fVarU = u();
        g gVar = this instanceof g ? (g) this : null;
        while (fVarU != null) {
            f fVarU2 = fVarU.u();
            if (fVarU instanceof g) {
                gVar = (g) fVarU;
            }
            fVarU = fVarU2;
        }
        return gVar;
    }

    public void K0() {
        F0();
        ArrayList<f> arrayList = this.k0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            f fVar = this.k0.get(i);
            if (fVar instanceof p) {
                ((p) fVar).K0();
            }
        }
    }

    public void L0(f fVar) {
        this.k0.remove(fVar);
        fVar.p0(null);
    }

    public void M0() {
        this.k0.clear();
    }

    @Override // b.e.a.j.f
    public void Q() {
        this.k0.clear();
        super.Q();
    }

    @Override // b.e.a.j.f
    public void T(b.e.a.c cVar) {
        super.T(cVar);
        int size = this.k0.size();
        for (int i = 0; i < size; i++) {
            this.k0.get(i).T(cVar);
        }
    }

    @Override // b.e.a.j.f
    public void n0(int i, int i2) {
        super.n0(i, i2);
        int size = this.k0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.k0.get(i3).n0(z(), A());
        }
    }
}
