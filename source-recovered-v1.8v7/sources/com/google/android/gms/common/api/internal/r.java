package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.internal.b;
import java.util.Collections;

/* loaded from: classes.dex */
final class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ d.b.a.a.c.b f1521b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ b.c f1522c;

    r(b.c cVar, d.b.a.a.c.b bVar) {
        this.f1522c = cVar;
        this.f1521b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f1521b.m()) {
            ((b.a) b.this.h.get(this.f1522c.f1502b)).e(this.f1521b);
            return;
        }
        b.c.e(this.f1522c, true);
        if (this.f1522c.a.m()) {
            this.f1522c.g();
            return;
        }
        try {
            this.f1522c.a.h(null, Collections.emptySet());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            ((b.a) b.this.h.get(this.f1522c.f1502b)).e(new d.b.a.a.c.b(10));
        }
    }
}
