package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class k6 {
    final Context a;

    /* renamed from: b, reason: collision with root package name */
    String f1759b;

    /* renamed from: c, reason: collision with root package name */
    String f1760c;

    /* renamed from: d, reason: collision with root package name */
    String f1761d;
    Boolean e;
    long f;
    d.b.a.a.e.e.e g;
    boolean h;
    Long i;

    public k6(Context context, d.b.a.a.e.e.e eVar, Long l) {
        this.h = true;
        com.google.android.gms.common.internal.q.k(context);
        Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.q.k(applicationContext);
        this.a = applicationContext;
        this.i = l;
        if (eVar != null) {
            this.g = eVar;
            this.f1759b = eVar.g;
            this.f1760c = eVar.f;
            this.f1761d = eVar.e;
            this.h = eVar.f2666d;
            this.f = eVar.f2665c;
            Bundle bundle = eVar.h;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
