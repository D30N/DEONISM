package b.g.k;

/* loaded from: classes.dex */
public class d<F, S> {
    public final F a;

    /* renamed from: b, reason: collision with root package name */
    public final S f906b;

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.a, this.a) && c.a(dVar.f906b, this.f906b);
    }

    public int hashCode() {
        F f = this.a;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.f906b;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.a) + " " + String.valueOf(this.f906b) + "}";
    }
}
