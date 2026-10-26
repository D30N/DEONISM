package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class c {
    private final Account a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Scope> f1543b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<Scope> f1544c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<com.google.android.gms.common.api.a<?>, b> f1545d;
    private final String e;
    private final String f;
    private final d.b.a.a.f.a g;
    private Integer h;

    public static final class a {
        private Account a;

        /* renamed from: b, reason: collision with root package name */
        private b.d.b<Scope> f1546b;

        /* renamed from: c, reason: collision with root package name */
        private Map<com.google.android.gms.common.api.a<?>, b> f1547c;
        private View e;
        private String f;
        private String g;
        private boolean i;

        /* renamed from: d, reason: collision with root package name */
        private int f1548d = 0;
        private d.b.a.a.f.a h = d.b.a.a.f.a.i;

        public final a a(Collection<Scope> collection) {
            if (this.f1546b == null) {
                this.f1546b = new b.d.b<>();
            }
            this.f1546b.addAll(collection);
            return this;
        }

        public final c b() {
            return new c(this.a, this.f1546b, this.f1547c, this.f1548d, this.e, this.f, this.g, this.h, this.i);
        }

        public final a c(Account account) {
            this.a = account;
            return this;
        }

        public final a d(String str) {
            this.g = str;
            return this;
        }

        public final a e(String str) {
            this.f = str;
            return this;
        }
    }

    public static final class b {
        public final Set<Scope> a;
    }

    public c(Account account, Set<Scope> set, Map<com.google.android.gms.common.api.a<?>, b> map, int i, View view, String str, String str2, d.b.a.a.f.a aVar, boolean z) {
        this.a = account;
        this.f1543b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f1545d = map == null ? Collections.EMPTY_MAP : map;
        this.e = str;
        this.f = str2;
        this.g = aVar;
        HashSet hashSet = new HashSet(this.f1543b);
        Iterator<b> it = this.f1545d.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().a);
        }
        this.f1544c = Collections.unmodifiableSet(hashSet);
    }

    @Nullable
    public final Account a() {
        return this.a;
    }

    public final Account b() {
        Account account = this.a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public final Set<Scope> c() {
        return this.f1544c;
    }

    @Nullable
    public final Integer d() {
        return this.h;
    }

    @Nullable
    public final String e() {
        return this.f;
    }

    @Nullable
    public final String f() {
        return this.e;
    }

    public final Set<Scope> g() {
        return this.f1543b;
    }

    @Nullable
    public final d.b.a.a.f.a h() {
        return this.g;
    }

    public final void i(Integer num) {
        this.h = num;
    }
}
