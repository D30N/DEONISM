package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.h7;
import d.b.a.a.e.e.g;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class b implements h7 {
    private final /* synthetic */ g a;

    b(g gVar) {
        this.a = gVar;
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final String a() {
        return this.a.K();
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final String b() {
        return this.a.M();
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final String c() {
        return this.a.G();
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final String d() {
        return this.a.B();
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final long e() {
        return this.a.H();
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final void f(Bundle bundle) {
        this.a.j(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final void g(String str) {
        this.a.w(str);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final int h(String str) {
        return this.a.F(str);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final List<Bundle> i(String str, String str2) {
        return this.a.u(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final void j(String str, String str2, Bundle bundle) {
        this.a.x(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final void k(String str) {
        this.a.C(str);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final Map<String, Object> l(String str, String str2, boolean z) {
        return this.a.g(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final void m(String str, String str2, Bundle bundle) {
        this.a.o(str, str2, bundle);
    }
}
