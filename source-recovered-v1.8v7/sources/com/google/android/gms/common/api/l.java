package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public final class l extends UnsupportedOperationException {

    /* renamed from: b, reason: collision with root package name */
    private final d.b.a.a.c.d f1532b;

    public l(d.b.a.a.c.d dVar) {
        this.f1532b = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String strValueOf = String.valueOf(this.f1532b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 8);
        sb.append("Missing ");
        sb.append(strValueOf);
        return sb.toString();
    }
}
