package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class i {
    private final Map<BasePendingResult<?>, Boolean> a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Map<d.b.a.a.h.i<?>, Boolean> f1516b = Collections.synchronizedMap(new WeakHashMap());

    private final void a(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.a) {
            map = new HashMap(this.a);
        }
        synchronized (this.f1516b) {
            map2 = new HashMap(this.f1516b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).h(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((d.b.a.a.h.i) entry2.getKey()).d(new com.google.android.gms.common.api.b(status));
            }
        }
    }

    final boolean b() {
        return (this.a.isEmpty() && this.f1516b.isEmpty()) ? false : true;
    }

    public final void c() {
        a(false, b.m);
    }

    public final void d() {
        a(true, z.a);
    }
}
