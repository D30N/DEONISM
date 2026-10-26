package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
final class j1 implements c0 {
    private final ExecutorService a;

    j1(ExecutorService executorService) {
        this.a = executorService;
    }

    @Override // com.google.firebase.iid.c0
    public final d.b.a.a.h.h<Integer> a(final Intent intent) {
        return d.b.a.a.h.k.c(this.a, new Callable(intent) { // from class: com.google.firebase.iid.i1
            private final Intent a;

            {
                this.a = intent;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Intent intent2 = this.a;
                String stringExtra = intent2.getStringExtra("CMD");
                if (stringExtra != null) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String strValueOf = String.valueOf(intent2.getExtras());
                        StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(strValueOf).length());
                        sb.append("Received command: ");
                        sb.append(stringExtra);
                        sb.append(" - ");
                        sb.append(strValueOf);
                        Log.d("FirebaseInstanceId", sb.toString());
                    }
                    if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                        FirebaseInstanceId.b().w();
                    } else if ("SYNC".equals(stringExtra)) {
                        FirebaseInstanceId.b().y();
                    }
                }
                return -1;
            }
        });
    }
}
