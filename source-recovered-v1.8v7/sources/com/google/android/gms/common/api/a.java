package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.q;
import java.util.Set;

/* loaded from: classes.dex */
public final class a<O extends d> {
    private final AbstractC0061a<?, O> a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1484b;

    /* renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0061a<T extends f, O> extends e<T, O> {
        public abstract T a(Context context, Looper looper, com.google.android.gms.common.internal.c cVar, O o, com.google.android.gms.common.api.f fVar, com.google.android.gms.common.api.g gVar);
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0062a extends d {
            Account d();
        }

        public interface b extends d {
            GoogleSignInAccount a();
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        void a(b.e eVar);

        boolean c();

        d.b.a.a.c.d[] d();

        boolean e();

        String f();

        void h(com.google.android.gms.common.internal.k kVar, Set<Scope> set);

        void j(b.c cVar);

        void k();

        boolean m();

        boolean o();

        int q();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public interface h<T extends IInterface> extends b {
        String g();

        T i(IBinder iBinder);

        String n();

        void p(int i, T t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> a(String str, AbstractC0061a<C, O> abstractC0061a, g<C> gVar) {
        q.l(abstractC0061a, "Cannot construct an Api with a null ClientBuilder");
        q.l(gVar, "Cannot construct an Api with a null ClientKey");
        this.f1484b = str;
        this.a = abstractC0061a;
    }

    public final String a() {
        return this.f1484b;
    }

    public final AbstractC0061a<?, O> b() {
        q.o(this.a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.a;
    }
}
