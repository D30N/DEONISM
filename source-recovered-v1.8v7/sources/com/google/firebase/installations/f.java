package com.google.firebase.installations;

import java.io.IOException;
import org.json.JSONException;

/* loaded from: classes.dex */
final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final g f2283b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2284c;

    private f(g gVar, boolean z) {
        this.f2283b = gVar;
        this.f2284c = z;
    }

    public static Runnable a(g gVar, boolean z) {
        return new f(gVar, z);
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException, IOException {
        this.f2283b.j(this.f2284c);
    }
}
