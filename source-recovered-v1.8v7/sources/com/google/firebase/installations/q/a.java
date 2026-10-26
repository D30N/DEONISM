package com.google.firebase.installations.q;

import com.google.firebase.installations.q.c;
import com.google.firebase.installations.q.d;

/* loaded from: classes.dex */
final class a extends d {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final c.a f2293b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2294c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2295d;
    private final long e;
    private final long f;
    private final String g;

    static final class b extends d.a {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f2296b;

        /* renamed from: c, reason: collision with root package name */
        private String f2297c;

        /* renamed from: d, reason: collision with root package name */
        private String f2298d;
        private Long e;
        private Long f;
        private String g;

        b() {
        }

        private b(d dVar) {
            this.a = dVar.d();
            this.f2296b = dVar.g();
            this.f2297c = dVar.b();
            this.f2298d = dVar.f();
            this.e = Long.valueOf(dVar.c());
            this.f = Long.valueOf(dVar.h());
            this.g = dVar.e();
        }

        @Override // com.google.firebase.installations.q.d.a
        public d a() {
            String str = "";
            if (this.f2296b == null) {
                str = " registrationStatus";
            }
            if (this.e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.f2296b, this.f2297c, this.f2298d, this.e.longValue(), this.f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a b(String str) {
            this.f2297c = str;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a c(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a d(String str) {
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a e(String str) {
            this.g = str;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a f(String str) {
            this.f2298d = str;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f2296b = aVar;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }
    }

    private a(String str, c.a aVar, String str2, String str3, long j, long j2, String str4) {
        this.a = str;
        this.f2293b = aVar;
        this.f2294c = str2;
        this.f2295d = str3;
        this.e = j;
        this.f = j2;
        this.g = str4;
    }

    @Override // com.google.firebase.installations.q.d
    public String b() {
        return this.f2294c;
    }

    @Override // com.google.firebase.installations.q.d
    public long c() {
        return this.e;
    }

    @Override // com.google.firebase.installations.q.d
    public String d() {
        return this.a;
    }

    @Override // com.google.firebase.installations.q.d
    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.a;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f2293b.equals(dVar.g()) && ((str = this.f2294c) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f2295d) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.e == dVar.c() && this.f == dVar.h()) {
                String str4 = this.g;
                String strE = dVar.e();
                if (str4 == null) {
                    if (strE == null) {
                        return true;
                    }
                } else if (str4.equals(strE)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.q.d
    public String f() {
        return this.f2295d;
    }

    @Override // com.google.firebase.installations.q.d
    public c.a g() {
        return this.f2293b;
    }

    @Override // com.google.firebase.installations.q.d
    public long h() {
        return this.f;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f2293b.hashCode()) * 1000003;
        String str2 = this.f2294c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2295d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.e;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.g;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.q.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.a + ", registrationStatus=" + this.f2293b + ", authToken=" + this.f2294c + ", refreshToken=" + this.f2295d + ", expiresInSecs=" + this.e + ", tokenCreationEpochInSecs=" + this.f + ", fisError=" + this.g + "}";
    }
}
