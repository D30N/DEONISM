package com.google.firebase.installations;

import com.google.firebase.installations.m;

/* loaded from: classes.dex */
final class a extends m {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final long f2275b;

    /* renamed from: c, reason: collision with root package name */
    private final long f2276c;

    static final class b extends m.a {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private Long f2277b;

        /* renamed from: c, reason: collision with root package name */
        private Long f2278c;

        b() {
        }

        @Override // com.google.firebase.installations.m.a
        public m a() {
            String str = "";
            if (this.a == null) {
                str = " token";
            }
            if (this.f2277b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f2278c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.f2277b.longValue(), this.f2278c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.m.a
        public m.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.installations.m.a
        public m.a c(long j) {
            this.f2278c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.m.a
        public m.a d(long j) {
            this.f2277b = Long.valueOf(j);
            return this;
        }
    }

    private a(String str, long j, long j2) {
        this.a = str;
        this.f2275b = j;
        this.f2276c = j2;
    }

    @Override // com.google.firebase.installations.m
    public String b() {
        return this.a;
    }

    @Override // com.google.firebase.installations.m
    public long c() {
        return this.f2276c;
    }

    @Override // com.google.firebase.installations.m
    public long d() {
        return this.f2275b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a.equals(mVar.b()) && this.f2275b == mVar.d() && this.f2276c == mVar.c();
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.f2275b;
        long j2 = this.f2276c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.f2275b + ", tokenCreationTimestamp=" + this.f2276c + "}";
    }
}
