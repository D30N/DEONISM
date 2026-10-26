package com.facebook.datasource;

import d.a.b.d.h;
import d.a.b.d.i;
import d.a.b.d.k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public class g<T> implements k<c<T>> {
    private final List<k<c<T>>> a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1130b;

    @ThreadSafe
    private class a extends com.facebook.datasource.a<T> {

        @GuardedBy("IncreasingQualityDataSource.this")
        @Nullable
        private ArrayList<c<T>> g;

        @GuardedBy("IncreasingQualityDataSource.this")
        private int h;
        private int i;
        private AtomicInteger j;

        @Nullable
        private Throwable k;

        /* renamed from: com.facebook.datasource.g$a$a, reason: collision with other inner class name */
        private class C0048a implements e<T> {
            private int a;

            public C0048a(int i) {
                this.a = i;
            }

            @Override // com.facebook.datasource.e
            public void a(c<T> cVar) {
            }

            @Override // com.facebook.datasource.e
            public void b(c<T> cVar) {
                if (cVar.c()) {
                    a.this.E(this.a, cVar);
                } else if (cVar.d()) {
                    a.this.D(this.a, cVar);
                }
            }

            @Override // com.facebook.datasource.e
            public void c(c<T> cVar) {
                a.this.D(this.a, cVar);
            }

            @Override // com.facebook.datasource.e
            public void d(c<T> cVar) {
                if (this.a == 0) {
                    a.this.p(cVar.g());
                }
            }
        }

        public a() {
            if (g.this.f1130b) {
                return;
            }
            x();
        }

        @Nullable
        private synchronized c<T> A() {
            return z(this.h);
        }

        private void B() {
            Throwable th;
            if (this.j.incrementAndGet() != this.i || (th = this.k) == null) {
                return;
            }
            n(th);
        }

        private void C(int i, c<T> cVar, boolean z) {
            synchronized (this) {
                int i2 = this.h;
                if (cVar == z(i) && i != this.h) {
                    if (A() == null || (z && i < this.h)) {
                        this.h = i;
                    } else {
                        i = i2;
                    }
                    for (int i3 = this.h; i3 > i; i3--) {
                        w(y(i3));
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D(int i, c<T> cVar) {
            w(F(i, cVar));
            if (i == 0) {
                this.k = cVar.f();
            }
            B();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E(int i, c<T> cVar) {
            C(i, cVar, cVar.d());
            if (cVar == A()) {
                r(null, i == 0 && cVar.d());
            }
            B();
        }

        @Nullable
        private synchronized c<T> F(int i, c<T> cVar) {
            if (cVar == A()) {
                return null;
            }
            if (cVar != z(i)) {
                return cVar;
            }
            return y(i);
        }

        private void w(c<T> cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        private void x() {
            if (this.j != null) {
                return;
            }
            synchronized (this) {
                if (this.j == null) {
                    this.j = new AtomicInteger(0);
                    int size = g.this.a.size();
                    this.i = size;
                    this.h = size;
                    this.g = new ArrayList<>(size);
                    for (int i = 0; i < size; i++) {
                        c<T> cVar = (c) ((k) g.this.a.get(i)).get();
                        this.g.add(cVar);
                        cVar.e(new C0048a(i), d.a.b.b.a.a());
                        if (cVar.c()) {
                            break;
                        }
                    }
                }
            }
        }

        @Nullable
        private synchronized c<T> y(int i) {
            c<T> cVar;
            cVar = null;
            if (this.g != null && i < this.g.size()) {
                cVar = this.g.set(i, null);
            }
            return cVar;
        }

        @Nullable
        private synchronized c<T> z(int i) {
            return (this.g == null || i >= this.g.size()) ? null : this.g.get(i);
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        @Nullable
        public synchronized T b() {
            c<T> cVarA;
            if (g.this.f1130b) {
                x();
            }
            cVarA = A();
            return cVarA != null ? cVarA.b() : null;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public synchronized boolean c() {
            /*
                r1 = this;
                monitor-enter(r1)
                com.facebook.datasource.g r0 = com.facebook.datasource.g.this     // Catch: java.lang.Throwable -> L1d
                boolean r0 = com.facebook.datasource.g.a(r0)     // Catch: java.lang.Throwable -> L1d
                if (r0 == 0) goto Lc
                r1.x()     // Catch: java.lang.Throwable -> L1d
            Lc:
                com.facebook.datasource.c r0 = r1.A()     // Catch: java.lang.Throwable -> L1d
                if (r0 == 0) goto L1a
                boolean r0 = r0.c()     // Catch: java.lang.Throwable -> L1d
                if (r0 == 0) goto L1a
                r0 = 1
                goto L1b
            L1a:
                r0 = 0
            L1b:
                monitor-exit(r1)
                return r0
            L1d:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.g.a.c():boolean");
        }

        @Override // com.facebook.datasource.a, com.facebook.datasource.c
        public boolean close() {
            if (g.this.f1130b) {
                x();
            }
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                ArrayList<c<T>> arrayList = this.g;
                this.g = null;
                if (arrayList == null) {
                    return true;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    w(arrayList.get(i));
                }
                return true;
            }
        }
    }

    private g(List<k<c<T>>> list, boolean z) {
        i.c(!list.isEmpty(), "List of suppliers is empty!");
        this.a = list;
        this.f1130b = z;
    }

    public static <T> g<T> c(List<k<c<T>>> list, boolean z) {
        return new g<>(list, z);
    }

    @Override // d.a.b.d.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c<T> get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return d.a.b.d.h.a(this.a, ((g) obj).a);
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
