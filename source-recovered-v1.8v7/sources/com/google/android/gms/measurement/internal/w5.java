package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class w5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f1932b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f1933c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f1934d;
    private final /* synthetic */ long e;
    private final /* synthetic */ j5 f;

    w5(j5 j5Var, String str, String str2, String str3, long j) {
        this.f = j5Var;
        this.f1932b = str;
        this.f1933c = str2;
        this.f1934d = str3;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f1932b;
        if (str == null) {
            this.f.a.g0().O().S(this.f1933c, null);
        } else {
            this.f.a.g0().O().S(this.f1933c, new q7(this.f1934d, str, this.e));
        }
    }
}
