package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* loaded from: classes.dex */
final class n implements Iterator<String> {

    /* renamed from: b, reason: collision with root package name */
    private Iterator<String> f1800b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ o f1801c;

    n(o oVar) {
        this.f1801c = oVar;
        this.f1800b = this.f1801c.f1816b.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1800b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f1800b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
