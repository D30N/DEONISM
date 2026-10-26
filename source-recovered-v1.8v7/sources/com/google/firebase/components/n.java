package com.google.firebase.components;

/* loaded from: classes.dex */
public final class n {
    private final Class<?> a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2190b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2191c;

    private n(Class<?> cls, int i, int i2) {
        u.c(cls, "Null dependency anInterface.");
        this.a = cls;
        this.f2190b = i;
        this.f2191c = i2;
    }

    public static n e(Class<?> cls) {
        return new n(cls, 1, 0);
    }

    public static n f(Class<?> cls) {
        return new n(cls, 2, 0);
    }

    public Class<?> a() {
        return this.a;
    }

    public boolean b() {
        return this.f2191c == 0;
    }

    public boolean c() {
        return this.f2190b == 1;
    }

    public boolean d() {
        return this.f2190b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a == nVar.a && this.f2190b == nVar.f2190b && this.f2191c == nVar.f2191c;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f2190b) * 1000003) ^ this.f2191c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.f2190b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", direct=");
        sb.append(this.f2191c == 0);
        sb.append("}");
        return sb.toString();
    }
}
