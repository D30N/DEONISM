package b.e.a.j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class h {
    public List<f> a;

    /* renamed from: b, reason: collision with root package name */
    int f820b;

    /* renamed from: c, reason: collision with root package name */
    int f821c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f822d;
    public final int[] e;
    List<f> f;
    List<f> g;
    HashSet<f> h;
    HashSet<f> i;
    List<f> j;
    List<f> k;

    h(List<f> list) {
        this.f820b = -1;
        this.f821c = -1;
        this.f822d = false;
        this.e = new int[]{-1, -1};
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new HashSet<>();
        this.i = new HashSet<>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.a = list;
    }

    h(List<f> list, boolean z) {
        this.f820b = -1;
        this.f821c = -1;
        this.f822d = false;
        this.e = new int[]{-1, -1};
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new HashSet<>();
        this.i = new HashSet<>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.a = list;
        this.f822d = z;
    }

    private void e(ArrayList<f> arrayList, f fVar) {
        if (fVar.d0) {
            return;
        }
        arrayList.add(fVar);
        fVar.d0 = true;
        if (fVar.L()) {
            return;
        }
        if (fVar instanceof j) {
            j jVar = (j) fVar;
            int i = jVar.l0;
            for (int i2 = 0; i2 < i; i2++) {
                e(arrayList, jVar.k0[i2]);
            }
        }
        int length = fVar.A.length;
        for (int i3 = 0; i3 < length; i3++) {
            e eVar = fVar.A[i3].f803d;
            if (eVar != null) {
                f fVar2 = eVar.f801b;
                if (eVar != null && fVar2 != fVar.u()) {
                    e(arrayList, fVar2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f(b.e.a.j.f r7) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.a.j.h.f(b.e.a.j.f):void");
    }

    void a(f fVar, int i) {
        HashSet<f> hashSet;
        if (i == 0) {
            hashSet = this.h;
        } else if (i != 1) {
            return;
        } else {
            hashSet = this.i;
        }
        hashSet.add(fVar);
    }

    public List<f> b(int i) {
        if (i == 0) {
            return this.f;
        }
        if (i == 1) {
            return this.g;
        }
        return null;
    }

    Set<f> c(int i) {
        if (i == 0) {
            return this.h;
        }
        if (i == 1) {
            return this.i;
        }
        return null;
    }

    List<f> d() {
        if (!this.j.isEmpty()) {
            return this.j;
        }
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            f fVar = this.a.get(i);
            if (!fVar.b0) {
                e((ArrayList) this.j, fVar);
            }
        }
        this.k.clear();
        this.k.addAll(this.a);
        this.k.removeAll(this.j);
        return this.j;
    }

    void g() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            f(this.k.get(i));
        }
    }
}
