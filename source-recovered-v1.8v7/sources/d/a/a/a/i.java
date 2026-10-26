package d.a.a.a;

/* loaded from: classes.dex */
public class i implements d {
    final String a;

    public i(String str) {
        d.a.b.d.i.g(str);
        this.a = str;
    }

    @Override // d.a.a.a.d
    public String a() {
        return this.a;
    }

    @Override // d.a.a.a.d
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.a.equals(((i) obj).a);
        }
        return false;
    }

    @Override // d.a.a.a.d
    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }
}
