package com.google.firebase.installations;

/* loaded from: classes.dex */
final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final g f2281b;

    private d(g gVar) {
        this.f2281b = gVar;
    }

    public static Runnable a(g gVar) {
        return new d(gVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2281b.g();
    }
}
