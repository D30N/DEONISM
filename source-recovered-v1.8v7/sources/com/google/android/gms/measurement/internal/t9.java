package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class t9 implements j4 {
    private final /* synthetic */ String a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ r9 f1913b;

    t9(r9 r9Var, String str) {
        this.f1913b = r9Var;
        this.a = str;
    }

    @Override // com.google.android.gms.measurement.internal.j4
    public final void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.f1913b.g(i, th, bArr, this.a);
    }
}
