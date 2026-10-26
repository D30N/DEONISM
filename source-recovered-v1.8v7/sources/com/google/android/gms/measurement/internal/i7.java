package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* loaded from: classes.dex */
final class i7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ boolean f1731b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Uri f1732c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f1733d;
    private final /* synthetic */ String e;
    private final /* synthetic */ e7 f;

    i7(e7 e7Var, boolean z, Uri uri, String str, String str2) {
        this.f = e7Var;
        this.f1731b = z;
        this.f1732c = uri;
        this.f1733d = str;
        this.e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.b(this.f1731b, this.f1732c, this.f1733d, this.e);
    }
}
