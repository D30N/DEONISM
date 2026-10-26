package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class i4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final j4 f1725b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1726c;

    /* renamed from: d, reason: collision with root package name */
    private final Throwable f1727d;
    private final byte[] e;
    private final String f;
    private final Map<String, List<String>> g;

    private i4(String str, j4 j4Var, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        com.google.android.gms.common.internal.q.k(j4Var);
        this.f1725b = j4Var;
        this.f1726c = i;
        this.f1727d = th;
        this.e = bArr;
        this.f = str;
        this.g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1725b.a(this.f, this.f1726c, this.f1727d, this.e, this.g);
    }
}
