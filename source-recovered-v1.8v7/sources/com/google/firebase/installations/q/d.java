package com.google.firebase.installations.q;

import com.google.firebase.installations.q.a;
import com.google.firebase.installations.q.c;

/* loaded from: classes.dex */
public abstract class d {

    public static abstract class a {
        public abstract d a();

        public abstract a b(String str);

        public abstract a c(long j);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(c.a aVar);

        public abstract a h(long j);
    }

    static {
        a().a();
    }

    public static a a() {
        a.b bVar = new a.b();
        bVar.h(0L);
        bVar.g(c.a.ATTEMPT_MIGRATION);
        bVar.c(0L);
        return bVar;
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract c.a g();

    public abstract long h();

    public boolean i() {
        return g() == c.a.REGISTER_ERROR;
    }

    public boolean j() {
        return g() == c.a.NOT_GENERATED || g() == c.a.ATTEMPT_MIGRATION;
    }

    public boolean k() {
        return g() == c.a.REGISTERED;
    }

    public boolean l() {
        return g() == c.a.UNREGISTERED;
    }

    public boolean m() {
        return g() == c.a.ATTEMPT_MIGRATION;
    }

    public abstract a n();

    public d o(String str, long j, long j2) {
        a aVarN = n();
        aVarN.b(str);
        aVarN.c(j);
        aVarN.h(j2);
        return aVarN.a();
    }

    public d p() {
        a aVarN = n();
        aVarN.b(null);
        return aVarN.a();
    }

    public d q(String str) {
        a aVarN = n();
        aVarN.e(str);
        aVarN.g(c.a.REGISTER_ERROR);
        return aVarN.a();
    }

    public d r() {
        a aVarN = n();
        aVarN.g(c.a.NOT_GENERATED);
        return aVarN.a();
    }

    public d s(String str, String str2, long j, String str3, long j2) {
        a aVarN = n();
        aVarN.d(str);
        aVarN.g(c.a.REGISTERED);
        aVarN.b(str3);
        aVarN.f(str2);
        aVarN.c(j2);
        aVarN.h(j);
        return aVarN.a();
    }

    public d t(String str) {
        a aVarN = n();
        aVarN.d(str);
        aVarN.g(c.a.UNREGISTERED);
        return aVarN.a();
    }
}
