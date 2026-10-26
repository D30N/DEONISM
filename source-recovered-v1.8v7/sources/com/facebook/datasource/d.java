package com.facebook.datasource;

import d.a.b.d.k;

/* loaded from: classes.dex */
public class d {

    /* JADX INFO: Add missing generic type declarations: [T] */
    static class a<T> implements k<c<T>> {
        final /* synthetic */ Throwable a;

        a(Throwable th) {
            this.a = th;
        }

        @Override // d.a.b.d.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c<T> get() {
            return d.b(this.a);
        }
    }

    public static <T> k<c<T>> a(Throwable th) {
        return new a(th);
    }

    public static <T> c<T> b(Throwable th) {
        h hVarU = h.u();
        hVarU.n(th);
        return hVarU;
    }
}
