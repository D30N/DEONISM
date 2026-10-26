package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* loaded from: classes.dex */
public final class f0 extends Binder {
    private final h0 a;

    final void a(final j0 j0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "service received new intent via bind strategy");
        }
        this.a.a(j0Var.a).b(s0.a(), new d.b.a.a.h.c(j0Var) { // from class: com.google.firebase.iid.i0
            private final j0 a;

            {
                this.a = j0Var;
            }

            @Override // d.b.a.a.h.c
            public final void a(d.b.a.a.h.h hVar) {
                this.a.b();
            }
        });
    }
}
