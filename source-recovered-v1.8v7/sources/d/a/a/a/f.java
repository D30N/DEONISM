package d.a.a.a;

import java.util.List;

/* loaded from: classes.dex */
public class f implements d {
    final List<d> a;

    @Override // d.a.a.a.d
    public String a() {
        return this.a.get(0).a();
    }

    public List<d> b() {
        return this.a;
    }

    @Override // d.a.a.a.d
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return this.a.equals(((f) obj).a);
        }
        return false;
    }

    @Override // d.a.a.a.d
    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "MultiCacheKey:" + this.a.toString();
    }
}
