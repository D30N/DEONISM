package d.a.e.d;

import d.a.b.d.i;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes.dex */
public class a {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2502b;

    public a(int i, int i2) {
        this.a = i;
        this.f2502b = i2;
    }

    public static a b(int i) {
        i.b(i >= 0);
        return new a(i, Integer.MAX_VALUE);
    }

    public static a c(int i) {
        i.b(i > 0);
        return new a(0, i);
    }

    private static String d(int i) {
        return i == Integer.MAX_VALUE ? "" : Integer.toString(i);
    }

    public boolean a(@Nullable a aVar) {
        return aVar != null && this.a <= aVar.a && this.f2502b >= aVar.f2502b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.f2502b == aVar.f2502b;
    }

    public int hashCode() {
        return d.a.b.k.b.a(this.a, this.f2502b);
    }

    public String toString() {
        return String.format(null, "%s-%s", d(this.a), d(this.f2502b));
    }
}
