package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
final class b5<V> extends FutureTask<V> implements Comparable<b5<V>> {

    /* renamed from: b, reason: collision with root package name */
    private final long f1633b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f1634c;

    /* renamed from: d, reason: collision with root package name */
    private final String f1635d;
    private final /* synthetic */ a5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b5(a5 a5Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.e = a5Var;
        com.google.android.gms.common.internal.q.k(str);
        long andIncrement = a5.l.getAndIncrement();
        this.f1633b = andIncrement;
        this.f1635d = str;
        this.f1634c = false;
        if (andIncrement == Long.MAX_VALUE) {
            a5Var.m().G().a("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b5(a5 a5Var, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.e = a5Var;
        com.google.android.gms.common.internal.q.k(str);
        long andIncrement = a5.l.getAndIncrement();
        this.f1633b = andIncrement;
        this.f1635d = str;
        this.f1634c = z;
        if (andIncrement == Long.MAX_VALUE) {
            a5Var.m().G().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        b5 b5Var = (b5) obj;
        boolean z = this.f1634c;
        if (z != b5Var.f1634c) {
            return z ? -1 : 1;
        }
        long j = this.f1633b;
        long j2 = b5Var.f1633b;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.e.m().H().b("Two tasks share the same index. index", Long.valueOf(this.f1633b));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.e.m().G().b(this.f1635d, th);
        super.setException(th);
    }
}
