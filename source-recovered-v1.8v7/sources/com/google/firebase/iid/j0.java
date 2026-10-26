package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

/* loaded from: classes.dex */
final class j0 {
    final Intent a;

    /* renamed from: b, reason: collision with root package name */
    private final d.b.a.a.h.i<Void> f2239b = new d.b.a.a.h.i<>();

    j0(Intent intent) {
        this.a = intent;
    }

    final d.b.a.a.h.h<Void> a() {
        return this.f2239b.a();
    }

    final void b() {
        this.f2239b.e(null);
    }

    final /* synthetic */ void c() {
        String action = this.a.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("FirebaseInstanceId", sb.toString());
        b();
    }
}
