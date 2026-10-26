package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03479w extends Exception {
    public final int A00;
    public final int A01;

    public C03479w(int i, String str, Throwable th, int i2) {
        super(str, th);
        this.A01 = i;
        this.A00 = i2;
    }

    public static C03479w A00(IOException iOException) {
        return new C03479w(0, null, iOException, -1);
    }

    public static C03479w A01(Exception exc, int i) {
        return new C03479w(1, null, exc, i);
    }

    public static C03479w A02(RuntimeException runtimeException) {
        return new C03479w(2, null, runtimeException, -1);
    }
}
