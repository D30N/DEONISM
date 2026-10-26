package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class s3<V> {
    private static final Object h = new Object();
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final q3<V> f1887b;

    /* renamed from: c, reason: collision with root package name */
    private final V f1888c;

    /* renamed from: d, reason: collision with root package name */
    private final V f1889d;
    private final Object e;
    private volatile V f;
    private volatile V g;

    private s3(String str, V v, V v2, q3<V> q3Var) {
        this.e = new Object();
        this.f = null;
        this.g = null;
        this.a = str;
        this.f1888c = v;
        this.f1889d = v2;
        this.f1887b = q3Var;
    }

    public final V a(V v) {
        synchronized (this.e) {
        }
        if (v != null) {
            return v;
        }
        if (p3.a == null) {
            return this.f1888c;
        }
        synchronized (h) {
            if (pa.a()) {
                return this.g == null ? this.f1888c : this.g;
            }
            try {
                for (s3 s3Var : r.a) {
                    if (pa.a()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    V vA = null;
                    try {
                        if (s3Var.f1887b != null) {
                            vA = s3Var.f1887b.a();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (h) {
                        s3Var.g = vA;
                    }
                }
            } catch (SecurityException unused2) {
            }
            q3<V> q3Var = this.f1887b;
            if (q3Var == null) {
                return this.f1888c;
            }
            try {
                return q3Var.a();
            } catch (IllegalStateException unused3) {
                return this.f1888c;
            } catch (SecurityException unused4) {
                return this.f1888c;
            }
        }
    }

    public final String b() {
        return this.a;
    }
}
