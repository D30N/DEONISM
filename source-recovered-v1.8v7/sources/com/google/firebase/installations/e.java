package com.google.firebase.installations;

/* loaded from: classes.dex */
final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final g f2282b;

    private e(g gVar) {
        this.f2282b = gVar;
    }

    public static Runnable a(g gVar) {
        return new e(gVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2282b.h();
    }
}
