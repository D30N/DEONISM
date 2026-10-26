package com.google.android.gms.measurement.internal;

import d.b.a.a.e.e.l0;
import d.b.a.a.e.e.n0;

/* loaded from: classes.dex */
final /* synthetic */ class ja {
    static final /* synthetic */ int[] a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f1752b;

    static {
        int[] iArr = new int[l0.a.values().length];
        f1752b = iArr;
        try {
            iArr[l0.a.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f1752b[l0.a.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f1752b[l0.a.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f1752b[l0.a.BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[n0.b.values().length];
        a = iArr2;
        try {
            iArr2[n0.b.REGEXP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[n0.b.BEGINS_WITH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[n0.b.ENDS_WITH.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[n0.b.PARTIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[n0.b.EXACT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[n0.b.IN_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
