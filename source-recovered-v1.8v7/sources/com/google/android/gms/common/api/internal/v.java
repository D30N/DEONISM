package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import java.util.Set;

/* loaded from: classes.dex */
public final class v extends d.b.a.a.f.b.d implements com.google.android.gms.common.api.f, com.google.android.gms.common.api.g {
    private static a.AbstractC0061a<? extends d.b.a.a.f.f, d.b.a.a.f.a> h = d.b.a.a.f.c.f2917c;
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f1526b;

    /* renamed from: c, reason: collision with root package name */
    private final a.AbstractC0061a<? extends d.b.a.a.f.f, d.b.a.a.f.a> f1527c;

    /* renamed from: d, reason: collision with root package name */
    private Set<Scope> f1528d;
    private com.google.android.gms.common.internal.c e;
    private d.b.a.a.f.f f;
    private y g;

    public v(Context context, Handler handler, com.google.android.gms.common.internal.c cVar) {
        this(context, handler, cVar, h);
    }

    public v(Context context, Handler handler, com.google.android.gms.common.internal.c cVar, a.AbstractC0061a<? extends d.b.a.a.f.f, d.b.a.a.f.a> abstractC0061a) {
        this.a = context;
        this.f1526b = handler;
        com.google.android.gms.common.internal.q.l(cVar, "ClientSettings must not be null");
        this.e = cVar;
        this.f1528d = cVar.g();
        this.f1527c = abstractC0061a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(d.b.a.a.f.b.k kVar) {
        d.b.a.a.c.b bVarH = kVar.h();
        if (bVarH.m()) {
            com.google.android.gms.common.internal.s sVarI = kVar.i();
            bVarH = sVarI.i();
            if (bVarH.m()) {
                this.g.c(sVarI.h(), this.f1528d);
            } else {
                String strValueOf = String.valueOf(bVarH);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(strValueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                this.g.b(bVarH);
            }
        } else {
            this.g.b(bVarH);
        }
        this.f.k();
    }

    public final void X(y yVar) {
        d.b.a.a.f.f fVar = this.f;
        if (fVar != null) {
            fVar.k();
        }
        this.e.i(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0061a<? extends d.b.a.a.f.f, d.b.a.a.f.a> abstractC0061a = this.f1527c;
        Context context = this.a;
        Looper looper = this.f1526b.getLooper();
        com.google.android.gms.common.internal.c cVar = this.e;
        this.f = (d.b.a.a.f.f) abstractC0061a.a(context, looper, cVar, cVar.h(), this, this);
        this.g = yVar;
        Set<Scope> set = this.f1528d;
        if (set == null || set.isEmpty()) {
            this.f1526b.post(new w(this));
        } else {
            this.f.l();
        }
    }

    public final void Y() {
        d.b.a.a.f.f fVar = this.f;
        if (fVar != null) {
            fVar.k();
        }
    }

    @Override // com.google.android.gms.common.api.g
    public final void e(d.b.a.a.c.b bVar) {
        this.g.b(bVar);
    }

    @Override // com.google.android.gms.common.api.f
    public final void g(int i) {
        this.f.k();
    }

    @Override // com.google.android.gms.common.api.f
    public final void h(Bundle bundle) {
        this.f.b(this);
    }

    @Override // d.b.a.a.f.b.e
    public final void y(d.b.a.a.f.b.k kVar) {
        this.f1526b.post(new x(this, kVar));
    }
}
