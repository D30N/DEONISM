package com.google.firebase.installations.r;

import com.google.firebase.installations.r.d;

/* loaded from: classes.dex */
final class a extends d {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2305b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2306c;

    /* renamed from: d, reason: collision with root package name */
    private final e f2307d;
    private final d.b e;

    static final class b extends d.a {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private String f2308b;

        /* renamed from: c, reason: collision with root package name */
        private String f2309c;

        /* renamed from: d, reason: collision with root package name */
        private e f2310d;
        private d.b e;

        b() {
        }

        @Override // com.google.firebase.installations.r.d.a
        public d a() {
            return new a(this.a, this.f2308b, this.f2309c, this.f2310d, this.e);
        }

        @Override // com.google.firebase.installations.r.d.a
        public d.a b(e eVar) {
            this.f2310d = eVar;
            return this;
        }

        @Override // com.google.firebase.installations.r.d.a
        public d.a c(String str) {
            this.f2308b = str;
            return this;
        }

        @Override // com.google.firebase.installations.r.d.a
        public d.a d(String str) {
            this.f2309c = str;
            return this;
        }

        @Override // com.google.firebase.installations.r.d.a
        public d.a e(d.b bVar) {
            this.e = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.r.d.a
        public d.a f(String str) {
            this.a = str;
            return this;
        }
    }

    private a(String str, String str2, String str3, e eVar, d.b bVar) {
        this.a = str;
        this.f2305b = str2;
        this.f2306c = str3;
        this.f2307d = eVar;
        this.e = bVar;
    }

    @Override // com.google.firebase.installations.r.d
    public e b() {
        return this.f2307d;
    }

    @Override // com.google.firebase.installations.r.d
    public String c() {
        return this.f2305b;
    }

    @Override // com.google.firebase.installations.r.d
    public String d() {
        return this.f2306c;
    }

    @Override // com.google.firebase.installations.r.d
    public d.b e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f2305b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f2306c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    e eVar = this.f2307d;
                    if (eVar != null ? eVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.e;
                        d.b bVarE = dVar.e();
                        if (bVar == null) {
                            if (bVarE == null) {
                                return true;
                            }
                        } else if (bVar.equals(bVarE)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.r.d
    public String f() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f2305b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2306c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        e eVar = this.f2307d;
        int iHashCode4 = (iHashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        d.b bVar = this.e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.f2305b + ", refreshToken=" + this.f2306c + ", authToken=" + this.f2307d + ", responseCode=" + this.e + "}";
    }
}
