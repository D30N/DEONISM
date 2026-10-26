package com.google.firebase.components;

import java.util.Map;

/* loaded from: classes.dex */
final /* synthetic */ class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final Map.Entry f2192b;

    /* renamed from: c, reason: collision with root package name */
    private final d.b.b.f.a f2193c;

    private q(Map.Entry entry, d.b.b.f.a aVar) {
        this.f2192b = entry;
        this.f2193c = aVar;
    }

    public static Runnable a(Map.Entry entry, d.b.b.f.a aVar) {
        return new q(entry, aVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        ((d.b.b.f.b) this.f2192b.getKey()).a(this.f2193c);
    }
}
