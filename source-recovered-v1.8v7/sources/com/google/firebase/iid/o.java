package com.google.firebase.iid;

/* loaded from: classes.dex */
public final class o extends Exception {

    /* renamed from: b, reason: collision with root package name */
    private final int f2251b;

    public o(int i, String str) {
        super(str);
        this.f2251b = i;
    }

    public final int a() {
        return this.f2251b;
    }
}
