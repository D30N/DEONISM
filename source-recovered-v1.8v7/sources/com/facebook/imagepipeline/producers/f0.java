package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes.dex */
public abstract class f0<K, T extends Closeable> implements l0<T> {

    @GuardedBy("this")
    final Map<K, f0<K, T>.b> a;

    /* renamed from: b, reason: collision with root package name */
    private final l0<T> f1322b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1323c;

    class b {
        private final K a;

        /* renamed from: b, reason: collision with root package name */
        private final CopyOnWriteArraySet<Pair<k<T>, m0>> f1324b = d.a.b.d.j.a();

        /* renamed from: c, reason: collision with root package name */
        @GuardedBy("Multiplexer.this")
        @Nullable
        private T f1325c;

        /* renamed from: d, reason: collision with root package name */
        @GuardedBy("Multiplexer.this")
        private float f1326d;

        @GuardedBy("Multiplexer.this")
        private int e;

        @GuardedBy("Multiplexer.this")
        @Nullable
        private d f;

        @GuardedBy("Multiplexer.this")
        @Nullable
        private f0<K, T>.b.C0056b g;

        class a extends e {
            final /* synthetic */ Pair a;

            a(Pair pair) {
                this.a = pair;
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.n0
            public void a() {
                d.n(b.this.r());
            }

            @Override // com.facebook.imagepipeline.producers.n0
            public void b() {
                boolean zRemove;
                List list;
                d dVar;
                List listT;
                List listR;
                synchronized (b.this) {
                    zRemove = b.this.f1324b.remove(this.a);
                    list = null;
                    if (!zRemove) {
                        dVar = null;
                        listT = null;
                    } else if (b.this.f1324b.isEmpty()) {
                        dVar = b.this.f;
                        listT = null;
                    } else {
                        List listS = b.this.s();
                        listT = b.this.t();
                        listR = b.this.r();
                        dVar = null;
                        list = listS;
                    }
                    listR = listT;
                }
                d.o(list);
                d.p(listT);
                d.n(listR);
                if (dVar != null) {
                    if (!f0.this.f1323c || dVar.d()) {
                        dVar.q();
                    } else {
                        d.p(dVar.u(d.a.e.d.d.LOW));
                    }
                }
                if (zRemove) {
                    ((k) this.a.first).b();
                }
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.n0
            public void c() {
                d.p(b.this.t());
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.n0
            public void d() {
                d.o(b.this.s());
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.f0$b$b, reason: collision with other inner class name */
        private class C0056b extends com.facebook.imagepipeline.producers.b<T> {
            private C0056b() {
            }

            @Override // com.facebook.imagepipeline.producers.b
            protected void g() {
                try {
                    if (d.a.e.m.b.d()) {
                        d.a.e.m.b.a("MultiplexProducer#onCancellation");
                    }
                    b.this.m(this);
                } finally {
                    if (d.a.e.m.b.d()) {
                        d.a.e.m.b.b();
                    }
                }
            }

            @Override // com.facebook.imagepipeline.producers.b
            protected void h(Throwable th) {
                try {
                    if (d.a.e.m.b.d()) {
                        d.a.e.m.b.a("MultiplexProducer#onFailure");
                    }
                    b.this.n(this, th);
                } finally {
                    if (d.a.e.m.b.d()) {
                        d.a.e.m.b.b();
                    }
                }
            }

            @Override // com.facebook.imagepipeline.producers.b
            protected void j(float f) {
                try {
                    if (d.a.e.m.b.d()) {
                        d.a.e.m.b.a("MultiplexProducer#onProgressUpdate");
                    }
                    b.this.p(this, f);
                } finally {
                    if (d.a.e.m.b.d()) {
                        d.a.e.m.b.b();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.producers.b
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public void i(T t, int i) {
                try {
                    if (d.a.e.m.b.d()) {
                        d.a.e.m.b.a("MultiplexProducer#onNewResult");
                    }
                    b.this.o(this, t, i);
                } finally {
                    if (d.a.e.m.b.d()) {
                        d.a.e.m.b.b();
                    }
                }
            }
        }

        public b(K k) {
            this.a = k;
        }

        private void g(Pair<k<T>, m0> pair, m0 m0Var) {
            m0Var.f(new a(pair));
        }

        private void i(Closeable closeable) throws IOException {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        private synchronized boolean j() {
            boolean z;
            Iterator<Pair<k<T>, m0>> it = this.f1324b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((m0) it.next().second).g()) {
                    z = true;
                    break;
                }
            }
            return z;
        }

        private synchronized boolean k() {
            boolean z;
            Iterator<Pair<k<T>, m0>> it = this.f1324b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                if (!((m0) it.next().second).d()) {
                    z = false;
                    break;
                }
            }
            return z;
        }

        private synchronized d.a.e.d.d l() {
            d.a.e.d.d dVarF;
            dVarF = d.a.e.d.d.LOW;
            Iterator<Pair<k<T>, m0>> it = this.f1324b.iterator();
            while (it.hasNext()) {
                dVarF = d.a.e.d.d.f(dVarF, ((m0) it.next().second).b());
            }
            return dVarF;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q() {
            synchronized (this) {
                boolean z = true;
                d.a.b.d.i.b(this.f == null);
                if (this.g != null) {
                    z = false;
                }
                d.a.b.d.i.b(z);
                if (this.f1324b.isEmpty()) {
                    f0.this.i(this.a, this);
                    return;
                }
                m0 m0Var = (m0) this.f1324b.iterator().next().second;
                this.f = new d(m0Var.c(), m0Var.getId(), m0Var.l(), m0Var.a(), m0Var.h(), k(), j(), l(), m0Var.i());
                f0<K, T>.b.C0056b c0056b = new C0056b();
                this.g = c0056b;
                f0.this.f1322b.a(c0056b, this.f);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public synchronized List<n0> r() {
            if (this.f == null) {
                return null;
            }
            return this.f.s(j());
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public synchronized List<n0> s() {
            if (this.f == null) {
                return null;
            }
            return this.f.t(k());
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Nullable
        public synchronized List<n0> t() {
            if (this.f == null) {
                return null;
            }
            return this.f.u(l());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean h(k<T> kVar, m0 m0Var) {
            Pair<k<T>, m0> pairCreate = Pair.create(kVar, m0Var);
            synchronized (this) {
                if (f0.this.g(this.a) != this) {
                    return false;
                }
                this.f1324b.add(pairCreate);
                List<n0> listS = s();
                List<n0> listT = t();
                List<n0> listR = r();
                Closeable closeableE = this.f1325c;
                float f = this.f1326d;
                int i = this.e;
                d.o(listS);
                d.p(listT);
                d.n(listR);
                synchronized (pairCreate) {
                    synchronized (this) {
                        if (closeableE != this.f1325c) {
                            closeableE = null;
                        } else if (closeableE != null) {
                            closeableE = f0.this.e(closeableE);
                        }
                    }
                    if (closeableE != null) {
                        if (f > 0.0f) {
                            kVar.c(f);
                        }
                        kVar.d(closeableE, i);
                        i(closeableE);
                    }
                }
                g(pairCreate, m0Var);
                return true;
            }
        }

        public void m(f0<K, T>.b.C0056b c0056b) {
            synchronized (this) {
                if (this.g != c0056b) {
                    return;
                }
                this.g = null;
                this.f = null;
                i(this.f1325c);
                this.f1325c = null;
                q();
            }
        }

        public void n(f0<K, T>.b.C0056b c0056b, Throwable th) {
            synchronized (this) {
                if (this.g != c0056b) {
                    return;
                }
                Iterator<Pair<k<T>, m0>> it = this.f1324b.iterator();
                this.f1324b.clear();
                f0.this.i(this.a, this);
                i(this.f1325c);
                this.f1325c = null;
                while (it.hasNext()) {
                    Pair<k<T>, m0> next = it.next();
                    synchronized (next) {
                        ((k) next.first).a(th);
                    }
                }
            }
        }

        public void o(f0<K, T>.b.C0056b c0056b, T t, int i) {
            synchronized (this) {
                if (this.g != c0056b) {
                    return;
                }
                i(this.f1325c);
                this.f1325c = null;
                Iterator<Pair<k<T>, m0>> it = this.f1324b.iterator();
                if (com.facebook.imagepipeline.producers.b.f(i)) {
                    this.f1325c = (T) f0.this.e(t);
                    this.e = i;
                } else {
                    this.f1324b.clear();
                    f0.this.i(this.a, this);
                }
                while (it.hasNext()) {
                    Pair<k<T>, m0> next = it.next();
                    synchronized (next) {
                        ((k) next.first).d(t, i);
                    }
                }
            }
        }

        public void p(f0<K, T>.b.C0056b c0056b, float f) {
            synchronized (this) {
                if (this.g != c0056b) {
                    return;
                }
                this.f1326d = f;
                Iterator<Pair<k<T>, m0>> it = this.f1324b.iterator();
                while (it.hasNext()) {
                    Pair<k<T>, m0> next = it.next();
                    synchronized (next) {
                        ((k) next.first).c(f);
                    }
                }
            }
        }
    }

    protected f0(l0<T> l0Var) {
        this.f1322b = l0Var;
        this.a = new HashMap();
        this.f1323c = false;
    }

    protected f0(l0<T> l0Var, boolean z) {
        this.f1322b = l0Var;
        this.a = new HashMap();
        this.f1323c = z;
    }

    private synchronized f0<K, T>.b f(K k) {
        f0<K, T>.b bVar;
        bVar = new b(k);
        this.a.put(k, bVar);
        return bVar;
    }

    @Override // com.facebook.imagepipeline.producers.l0
    public void a(k<T> kVar, m0 m0Var) {
        boolean z;
        f0<K, T>.b bVarG;
        try {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("MultiplexProducer#produceResults");
            }
            K kH = h(m0Var);
            do {
                z = false;
                synchronized (this) {
                    bVarG = g(kH);
                    if (bVarG == null) {
                        bVarG = f(kH);
                        z = true;
                    }
                }
            } while (!bVarG.h(kVar, m0Var));
            if (z) {
                bVarG.q();
            }
        } finally {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        }
    }

    protected abstract T e(T t);

    protected synchronized f0<K, T>.b g(K k) {
        return this.a.get(k);
    }

    protected abstract K h(m0 m0Var);

    protected synchronized void i(K k, f0<K, T>.b bVar) {
        if (this.a.get(k) == bVar) {
            this.a.remove(k);
        }
    }
}
