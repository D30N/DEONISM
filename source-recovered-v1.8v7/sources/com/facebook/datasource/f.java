package com.facebook.datasource;

import d.a.b.d.h;
import d.a.b.d.i;
import d.a.b.d.k;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public class f<T> implements k<c<T>> {
    private final List<k<c<T>>> a;

    @ThreadSafe
    private class b extends com.facebook.datasource.a<T> {
        private int g = 0;
        private c<T> h = null;
        private c<T> i = null;

        private class a implements e<T> {
            private a() {
            }

            @Override // com.facebook.datasource.e
            public void a(c<T> cVar) {
            }

            @Override // com.facebook.datasource.e
            public void b(c<T> cVar) {
                if (cVar.c()) {
                    b.this.C(cVar);
                } else if (cVar.d()) {
                    b.this.B(cVar);
                }
            }

            @Override // com.facebook.datasource.e
            public void c(c<T> cVar) {
                b.this.B(cVar);
            }

            @Override // com.facebook.datasource.e
            public void d(c<T> cVar) {
                b.this.p(Math.max(b.this.g(), cVar.g()));
            }
        }

        public b() {
            if (E()) {
                return;
            }
            n(new RuntimeException("No data source supplier or supplier returned null."));
        }

        private void A(c<T> cVar, boolean z) {
            c<T> cVar2;
            synchronized (this) {
                if (cVar == this.h && cVar != this.i) {
                    if (this.i == null || z) {
                        c<T> cVar3 = this.i;
                        this.i = cVar;
                        cVar2 = cVar3;
                    } else {
                        cVar2 = null;
                    }
                    x(cVar2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void B(c<T> cVar) {
            if (w(cVar)) {
                if (cVar != y()) {
                    x(cVar);
                }
                if (E()) {
                    return;
                }
                n(cVar.f());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C(c<T> cVar) {
            A(cVar, cVar.d());
            if (cVar == y()) {
                r(null, cVar.d());
            }
        }

        private synchronized boolean D(c<T> cVar) {
            boolean z;
            if (j()) {
                z = false;
            } else {
                this.h = cVar;
                z = true;
            }
            return z;
        }

        private boolean E() {
            k<c<T>> kVarZ = z();
            c<T> cVar = kVarZ != null ? kVarZ.get() : null;
            if (!D(cVar) || cVar == null) {
                x(cVar);
                return false;
            }
            cVar.e(new a(), d.a.b.b.a.a());
            return true;
        }

        private synchronized boolean w(c<T> cVar) {
            boolean z;
            if (j() || cVar != this.h) {
                z = false;
            } else {
                this.h = null;
                z = true;
            }
            return z;
        }

        private void x(c<T> cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        @Nullable
        private synchronized c<T> y() {
            return this.i;
        }

        @Nullable
        private synchronized k<c<T>> z() {
            if (j() || this.g >= f.this.a.size()) {
                return null;
            }
            List list = f.this.a;
            int i = this.g;
            this.g = i + 1;
            return (k) list.get(i);
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        @Nullable
        public synchronized T b() {
            c<T> cVarY;
            cVarY = y();
            return cVarY != null ? cVarY.b() : null;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public synchronized boolean c() {
            /*
                r1 = this;
                monitor-enter(r1)
                com.facebook.datasource.c r0 = r1.y()     // Catch: java.lang.Throwable -> L12
                if (r0 == 0) goto Lf
                boolean r0 = r0.c()     // Catch: java.lang.Throwable -> L12
                if (r0 == 0) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                monitor-exit(r1)
                return r0
            L12:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.f.b.c():boolean");
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        public boolean close() {
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                c<T> cVar = this.h;
                this.h = null;
                c<T> cVar2 = this.i;
                this.i = null;
                x(cVar2);
                x(cVar);
                return true;
            }
        }
    }

    private f(List<k<c<T>>> list) {
        i.c(!list.isEmpty(), "List of suppliers is empty!");
        this.a = list;
    }

    public static <T> f<T> b(List<k<c<T>>> list) {
        return new f<>(list);
    }

    @Override // d.a.b.d.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public c<T> get() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return d.a.b.d.h.a(this.a, ((f) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        h.b bVarD = d.a.b.d.h.d(this);
        bVarD.b("list", this.a);
        return bVarD.toString();
    }
}
