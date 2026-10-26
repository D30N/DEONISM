package com.google.firebase.installations.r;

import com.google.firebase.installations.r.e;

/* loaded from: classes.dex */
final class b extends e {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final long f2311b;

    /* renamed from: c, reason: collision with root package name */
    private final e.b f2312c;

    /* renamed from: com.google.firebase.installations.r.b$b, reason: collision with other inner class name */
    static final class C0080b extends e.a {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private Long f2313b;

        /* renamed from: c, reason: collision with root package name */
        private e.b f2314c;

        C0080b() {
        }

        @Override // com.google.firebase.installations.r.e.a
        public e a() {
            String str = "";
            if (this.f2313b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.a, this.f2313b.longValue(), this.f2314c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.r.e.a
        public e.a b(e.b bVar) {
            this.f2314c = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.r.e.a
        public e.a c(String str) {
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.installations.r.e.a
        public e.a d(long j) {
            this.f2313b = Long.valueOf(j);
            return this;
        }
    }

    private b(String str, long j, e.b bVar) {
        this.a = str;
        this.f2311b = j;
        this.f2312c = bVar;
    }

    @Override // com.google.firebase.installations.r.e
    public e.b b() {
        return this.f2312c;
    }

    @Override // com.google.firebase.installations.r.e
    public String c() {
        return this.a;
    }

    @Override // com.google.firebase.installations.r.e
    public long d() {
        return this.f2311b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.a;
        if (str != null ? str.equals(eVar.c()) : eVar.c() == null) {
            if (this.f2311b == eVar.d()) {
                e.b bVar = this.f2312c;
                e.b bVarB = eVar.b();
                if (bVar == null) {
                    if (bVarB == null) {
                        return true;
                    }
                } else if (bVar.equals(bVarB)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f2311b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        e.b bVar = this.f2312c;
        return i ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.f2311b + ", responseCode=" + this.f2312c + "}";
    }
}
