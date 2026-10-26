package com.google.firebase.installations.r;

import com.google.firebase.installations.r.b;

/* loaded from: classes.dex */
public abstract class e {

    public static abstract class a {
        public abstract e a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j);
    }

    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        b.C0080b c0080b = new b.C0080b();
        c0080b.d(0L);
        return c0080b;
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
