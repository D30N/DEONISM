package com.google.firebase.installations;

/* loaded from: classes.dex */
final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final g f2280b;

    private c(g gVar) {
        this.f2280b = gVar;
    }

    public static Runnable a(g gVar) {
        return new c(gVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2280b.i();
    }
}
