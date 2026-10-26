package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new e();

    /* renamed from: b, reason: collision with root package name */
    private final int f1581b;

    /* renamed from: c, reason: collision with root package name */
    private final long f1582c;

    /* renamed from: d, reason: collision with root package name */
    private int f1583d;
    private final String e;
    private final String f;
    private final String g;
    private final int h;
    private final List<String> i;
    private final String j;
    private final long k;
    private int l;
    private final String m;
    private final float n;
    private final long o;
    private final boolean p;
    private long q;

    WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.f1581b = i;
        this.f1582c = j;
        this.f1583d = i2;
        this.e = str;
        this.f = str3;
        this.g = str5;
        this.h = i3;
        this.q = -1L;
        this.i = list;
        this.j = str2;
        this.k = j2;
        this.l = i4;
        this.m = str4;
        this.n = f;
        this.o = j3;
        this.p = z;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, String str4, float f, long j3, String str5, boolean z) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, str5, z);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int h() {
        return this.f1583d;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long i() {
        return this.f1582c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long k() {
        return this.q;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String l() {
        String str = this.e;
        int i = this.h;
        List<String> list = this.i;
        String strJoin = list == null ? "" : TextUtils.join(",", list);
        int i2 = this.l;
        String str2 = this.f;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.m;
        if (str3 == null) {
            str3 = "";
        }
        float f = this.n;
        String str4 = this.g;
        String str5 = str4 != null ? str4 : "";
        boolean z = this.p;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(strJoin).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str5).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(strJoin);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = com.google.android.gms.common.internal.v.c.a(parcel);
        com.google.android.gms.common.internal.v.c.j(parcel, 1, this.f1581b);
        com.google.android.gms.common.internal.v.c.k(parcel, 2, i());
        com.google.android.gms.common.internal.v.c.n(parcel, 4, this.e, false);
        com.google.android.gms.common.internal.v.c.j(parcel, 5, this.h);
        com.google.android.gms.common.internal.v.c.o(parcel, 6, this.i, false);
        com.google.android.gms.common.internal.v.c.k(parcel, 8, this.k);
        com.google.android.gms.common.internal.v.c.n(parcel, 10, this.f, false);
        com.google.android.gms.common.internal.v.c.j(parcel, 11, h());
        com.google.android.gms.common.internal.v.c.n(parcel, 12, this.j, false);
        com.google.android.gms.common.internal.v.c.n(parcel, 13, this.m, false);
        com.google.android.gms.common.internal.v.c.j(parcel, 14, this.l);
        com.google.android.gms.common.internal.v.c.g(parcel, 15, this.n);
        com.google.android.gms.common.internal.v.c.k(parcel, 16, this.o);
        com.google.android.gms.common.internal.v.c.n(parcel, 17, this.g, false);
        com.google.android.gms.common.internal.v.c.c(parcel, 18, this.p);
        com.google.android.gms.common.internal.v.c.b(parcel, iA);
    }
}
