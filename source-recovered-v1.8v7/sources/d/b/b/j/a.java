package d.b.b.j;

import javax.annotation.Nonnull;

/* loaded from: classes.dex */
final class a extends f {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3040b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f3040b = str2;
    }

    @Override // d.b.b.j.f
    @Nonnull
    public String b() {
        return this.a;
    }

    @Override // d.b.b.j.f
    @Nonnull
    public String c() {
        return this.f3040b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.b()) && this.f3040b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f3040b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.f3040b + "}";
    }
}
