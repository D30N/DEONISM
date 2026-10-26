package androidx.coordinatorlayout.widget;

import b.d.g;
import b.g.k.e;
import b.g.k.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class a<T> {
    private final e<ArrayList<T>> a = new f(10);

    /* renamed from: b, reason: collision with root package name */
    private final g<T, ArrayList<T>> f365b = new g<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<T> f366c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<T> f367d = new HashSet<>();

    private void e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f365b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                e(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    private ArrayList<T> f() {
        ArrayList<T> arrayListB = this.a.b();
        return arrayListB == null ? new ArrayList<>() : arrayListB;
    }

    private void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.a.a(arrayList);
    }

    public void a(T t, T t2) {
        if (!this.f365b.containsKey(t) || !this.f365b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListF = this.f365b.get(t);
        if (arrayListF == null) {
            arrayListF = f();
            this.f365b.put(t, arrayListF);
        }
        arrayListF.add(t2);
    }

    public void b(T t) {
        if (this.f365b.containsKey(t)) {
            return;
        }
        this.f365b.put(t, null);
    }

    public void c() {
        int size = this.f365b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListM = this.f365b.m(i);
            if (arrayListM != null) {
                k(arrayListM);
            }
        }
        this.f365b.clear();
    }

    public boolean d(T t) {
        return this.f365b.containsKey(t);
    }

    public List g(T t) {
        return this.f365b.get(t);
    }

    public List<T> h(T t) {
        int size = this.f365b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListM = this.f365b.m(i);
            if (arrayListM != null && arrayListM.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f365b.i(i));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.f366c.clear();
        this.f367d.clear();
        int size = this.f365b.size();
        for (int i = 0; i < size; i++) {
            e(this.f365b.i(i), this.f366c, this.f367d);
        }
        return this.f366c;
    }

    public boolean j(T t) {
        int size = this.f365b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListM = this.f365b.m(i);
            if (arrayListM != null && arrayListM.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
