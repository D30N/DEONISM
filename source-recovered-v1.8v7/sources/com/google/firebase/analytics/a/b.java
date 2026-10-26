package com.google.firebase.analytics.a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.q;
import d.b.a.a.e.e.g;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class b implements a {

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f2175b;
    private final com.google.android.gms.measurement.a.a a;

    private b(com.google.android.gms.measurement.a.a aVar) {
        q.k(aVar);
        this.a = aVar;
        new ConcurrentHashMap();
    }

    public static a a(d.b.b.c cVar, Context context, d.b.b.f.d dVar) {
        q.k(cVar);
        q.k(context);
        q.k(dVar);
        q.k(context.getApplicationContext());
        if (f2175b == null) {
            synchronized (b.class) {
                if (f2175b == null) {
                    Bundle bundle = new Bundle(1);
                    if (cVar.q()) {
                        dVar.b(d.b.b.a.class, c.a, d.a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", cVar.p());
                    }
                    f2175b = new b(g.b(context, null, null, null, bundle).e());
                }
            }
        }
        return f2175b;
    }

    static final /* synthetic */ void b(d.b.b.f.a aVar) {
        boolean z = ((d.b.b.a) aVar.a()).a;
        synchronized (b.class) {
            ((b) f2175b).a.a(z);
        }
    }
}
