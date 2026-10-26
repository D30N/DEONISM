package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class v {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    private final Map<Pair<String, String>, d.b.a.a.h.h<a>> f2262b = new b.d.a();

    v(Executor executor) {
        this.a = executor;
    }

    final /* synthetic */ d.b.a.a.h.h a(Pair pair, d.b.a.a.h.h hVar) {
        synchronized (this) {
            this.f2262b.remove(pair);
        }
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final synchronized d.b.a.a.h.h<a> b(String str, String str2, x xVar) {
        final Pair pair = new Pair(str, str2);
        d.b.a.a.h.h<a> hVar = this.f2262b.get(pair);
        if (hVar != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(strValueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            return hVar;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(strValueOf2);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
        d.b.a.a.h.h hVarF = xVar.a().f(this.a, new d.b.a.a.h.a(this, pair) { // from class: com.google.firebase.iid.u
            private final v a;

            /* renamed from: b, reason: collision with root package name */
            private final Pair f2259b;

            {
                this.a = this;
                this.f2259b = pair;
            }

            @Override // d.b.a.a.h.a
            public final Object a(d.b.a.a.h.h hVar2) {
                this.a.a(this.f2259b, hVar2);
                return hVar2;
            }
        });
        this.f2262b.put(pair, hVarF);
        return hVarF;
    }
}
