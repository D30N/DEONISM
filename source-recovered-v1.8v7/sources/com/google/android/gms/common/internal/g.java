package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.b;
import java.util.Iterator;
import java.util.Set;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
/* loaded from: classes.dex */
public abstract class g<T extends IInterface> extends b<T> implements a.f {
    private final Set<Scope> w;
    private final Account x;

    /* JADX WARN: Illegal instructions before constructor call */
    protected g(Context context, Looper looper, int i, c cVar, com.google.android.gms.common.api.f fVar, com.google.android.gms.common.api.g gVar) {
        h hVarA = h.a(context);
        d.b.a.a.c.e eVarM = d.b.a.a.c.e.m();
        q.k(fVar);
        q.k(gVar);
        this(context, looper, hVarA, eVarM, i, cVar, fVar, gVar);
    }

    protected g(Context context, Looper looper, h hVar, d.b.a.a.c.e eVar, int i, c cVar, com.google.android.gms.common.api.f fVar, com.google.android.gms.common.api.g gVar) {
        super(context, looper, hVar, eVar, i, h0(fVar), i0(gVar), cVar.e());
        this.x = cVar.a();
        Set<Scope> setC = cVar.c();
        j0(setC);
        this.w = setC;
    }

    private static b.a h0(com.google.android.gms.common.api.f fVar) {
        if (fVar == null) {
            return null;
        }
        return new x(fVar);
    }

    private static b.InterfaceC0065b i0(com.google.android.gms.common.api.g gVar) {
        if (gVar == null) {
            return null;
        }
        return new y(gVar);
    }

    private final Set<Scope> j0(Set<Scope> set) {
        g0(set);
        Iterator<Scope> it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final Set<Scope> A() {
        return this.w;
    }

    protected Set<Scope> g0(Set<Scope> set) {
        return set;
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public int q() {
        return super.q();
    }

    @Override // com.google.android.gms.common.internal.b
    public final Account u() {
        return this.x;
    }
}
