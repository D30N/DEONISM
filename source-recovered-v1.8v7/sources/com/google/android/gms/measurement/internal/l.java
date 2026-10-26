package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class l {
    final String a;

    /* renamed from: b, reason: collision with root package name */
    final String f1766b;

    /* renamed from: c, reason: collision with root package name */
    final long f1767c;

    /* renamed from: d, reason: collision with root package name */
    final long f1768d;
    final long e;
    final long f;
    final long g;
    final Long h;
    final Long i;
    final Long j;
    final Boolean k;

    l(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        com.google.android.gms.common.internal.q.g(str);
        com.google.android.gms.common.internal.q.g(str2);
        com.google.android.gms.common.internal.q.a(j >= 0);
        com.google.android.gms.common.internal.q.a(j2 >= 0);
        com.google.android.gms.common.internal.q.a(j3 >= 0);
        com.google.android.gms.common.internal.q.a(j5 >= 0);
        this.a = str;
        this.f1766b = str2;
        this.f1767c = j;
        this.f1768d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    l(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Long l3, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j3, 0L, null, null, null, null);
    }

    final l a(long j) {
        return new l(this.a, this.f1766b, this.f1767c, this.f1768d, this.e, j, this.g, this.h, this.i, this.j, this.k);
    }

    final l b(long j, long j2) {
        return new l(this.a, this.f1766b, this.f1767c, this.f1768d, this.e, this.f, j, Long.valueOf(j2), this.i, this.j, this.k);
    }

    final l c(Long l, Long l2, Boolean bool) {
        return new l(this.a, this.f1766b, this.f1767c, this.f1768d, this.e, this.f, this.g, this.h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
