package d.b.a.a.e.e;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class c7<K, V> implements Comparable<c7>, Map.Entry<K, V> {

    /* renamed from: b, reason: collision with root package name */
    /* JADX INFO: Incorrect field signature: TK; */
    private final Comparable f2647b;

    /* renamed from: c, reason: collision with root package name */
    private V f2648c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ t6 f2649d;

    /* JADX WARN: Multi-variable type inference failed */
    c7(t6 t6Var, K k, V v) {
        this.f2649d = t6Var;
        this.f2647b = k;
        this.f2648c = v;
    }

    c7(t6 t6Var, Map.Entry<K, V> entry) {
        this(t6Var, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean f(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(c7 c7Var) {
        return ((Comparable) getKey()).compareTo((Comparable) c7Var.getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return f(this.f2647b, entry.getKey()) && f(this.f2648c, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f2647b;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f2648c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f2647b;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.f2648c;
        return iHashCode ^ (v != null ? v.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.f2649d.p();
        V v2 = this.f2648c;
        this.f2648c = v;
        return v2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f2647b);
        String strValueOf2 = String.valueOf(this.f2648c);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(strValueOf2).length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}
