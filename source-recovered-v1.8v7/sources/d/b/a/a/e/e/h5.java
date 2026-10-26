package d.b.a.a.e.e;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class h5 extends f3<String> implements k5, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final h5 f2709d;

    /* renamed from: c, reason: collision with root package name */
    private final List<Object> f2710c;

    static {
        h5 h5Var = new h5();
        f2709d = h5Var;
        h5Var.b();
    }

    public h5() {
        this(10);
    }

    public h5(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private h5(ArrayList<Object> arrayList) {
        this.f2710c = arrayList;
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof l3 ? ((l3) obj).r() : u4.i((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        c();
        this.f2710c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        c();
        if (collection instanceof k5) {
            collection = ((k5) collection).d();
        }
        boolean zAddAll = this.f2710c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // d.b.a.a.e.e.f3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.f2710c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // d.b.a.a.e.e.k5
    public final List<?> d() {
        return Collections.unmodifiableList(this.f2710c);
    }

    @Override // d.b.a.a.e.e.k5
    public final k5 e() {
        return a() ? new m7(this) : this;
    }

    @Override // d.b.a.a.e.e.z4
    public final /* synthetic */ z4 f(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f2710c);
        return new h5((ArrayList<Object>) arrayList);
    }

    @Override // d.b.a.a.e.e.k5
    public final Object g(int i) {
        return this.f2710c.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.f2710c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof l3) {
            l3 l3Var = (l3) obj;
            String strR = l3Var.r();
            if (l3Var.u()) {
                this.f2710c.set(i, strR);
            }
            return strR;
        }
        byte[] bArr = (byte[]) obj;
        String strI = u4.i(bArr);
        if (u4.h(bArr)) {
            this.f2710c.set(i, strI);
        }
        return strI;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        c();
        Object objRemove = this.f2710c.remove(i);
        ((AbstractList) this).modCount++;
        return h(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        c();
        return h(this.f2710c.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2710c.size();
    }

    @Override // d.b.a.a.e.e.k5
    public final void t(l3 l3Var) {
        c();
        this.f2710c.add(l3Var);
        ((AbstractList) this).modCount++;
    }
}
