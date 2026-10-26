package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.c;
import java.util.Collections;

/* loaded from: classes.dex */
public class e<O extends a.d> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final a<O> f1486b;

    /* renamed from: c, reason: collision with root package name */
    private final O f1487c;

    /* renamed from: d, reason: collision with root package name */
    private final d0<O> f1488d;
    private final int e;

    protected c.a a() {
        Account accountD;
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        c.a aVar = new c.a();
        O o = this.f1487c;
        if (!(o instanceof a.d.b) || (googleSignInAccountA2 = ((a.d.b) o).a()) == null) {
            O o2 = this.f1487c;
            accountD = o2 instanceof a.d.InterfaceC0062a ? ((a.d.InterfaceC0062a) o2).d() : null;
        } else {
            accountD = googleSignInAccountA2.h();
        }
        aVar.c(accountD);
        O o3 = this.f1487c;
        aVar.a((!(o3 instanceof a.d.b) || (googleSignInAccountA = ((a.d.b) o3).a()) == null) ? Collections.emptySet() : googleSignInAccountA.w());
        aVar.d(this.a.getClass().getName());
        aVar.e(this.a.getPackageName());
        return aVar;
    }

    public final int b() {
        return this.e;
    }

    public a.f c(Looper looper, b.a<O> aVar) {
        return this.f1486b.b().a(this.a, looper, a().b(), this.f1487c, aVar, aVar);
    }

    public v d(Context context, Handler handler) {
        return new v(context, handler, a().b());
    }

    public final d0<O> e() {
        return this.f1488d;
    }
}
