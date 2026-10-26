package d.a.e.j;

/* loaded from: classes.dex */
public enum f {
    NOT_SET("not_set"),
    NETWORK("network"),
    DISK("disk"),
    ENCODED_MEM_CACHE("encoded_mem_cache");


    /* renamed from: b, reason: collision with root package name */
    private final String f2567b;

    f(String str) {
        this.f2567b = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f2567b;
    }
}
