package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.j> extends com.google.android.gms.common.api.h<R> {
    private com.google.android.gms.common.api.k<? super R> e;
    private R g;
    private Status h;
    private volatile boolean i;
    private boolean j;
    private boolean k;

    @KeepName
    private b mResultGuardian;
    private final Object a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final CountDownLatch f1490c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<h.a> f1491d = new ArrayList<>();
    private final AtomicReference<a0> f = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final a<R> f1489b = new a<>(Looper.getMainLooper());

    public static class a<R extends com.google.android.gms.common.api.j> extends d.b.a.a.e.b.d {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(com.google.android.gms.common.api.k<? super R> kVar, R r) {
            sendMessage(obtainMessage(1, new Pair(kVar, r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    ((BasePendingResult) message.obj).h(Status.g);
                    return;
                }
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) pair.first;
            com.google.android.gms.common.api.j jVar = (com.google.android.gms.common.api.j) pair.second;
            try {
                kVar.a(jVar);
            } catch (RuntimeException e) {
                BasePendingResult.g(jVar);
                throw e;
            }
        }
    }

    private final class b {
        private b() {
        }

        /* synthetic */ b(BasePendingResult basePendingResult, g0 g0Var) {
            this();
        }

        protected final void finalize() throws Throwable {
            BasePendingResult.g(BasePendingResult.this.g);
            super.finalize();
        }
    }

    static {
        new g0();
    }

    @Deprecated
    BasePendingResult() {
        new WeakReference(null);
    }

    private final R b() {
        R r;
        synchronized (this.a) {
            com.google.android.gms.common.internal.q.o(!this.i, "Result has already been consumed.");
            com.google.android.gms.common.internal.q.o(c(), "Result is not ready.");
            r = this.g;
            this.g = null;
            this.e = null;
            this.i = true;
        }
        a0 andSet = this.f.getAndSet(null);
        if (andSet != null) {
            andSet.a(this);
        }
        return r;
    }

    private final void f(R r) {
        this.g = r;
        this.f1490c.countDown();
        this.h = this.g.c();
        g0 g0Var = null;
        if (this.j) {
            this.e = null;
        } else if (this.e != null) {
            this.f1489b.removeMessages(2);
            this.f1489b.a(this.e, b());
        } else if (this.g instanceof com.google.android.gms.common.api.i) {
            this.mResultGuardian = new b(this, g0Var);
        }
        ArrayList<h.a> arrayList = this.f1491d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            h.a aVar = arrayList.get(i);
            i++;
            aVar.a(this.h);
        }
        this.f1491d.clear();
    }

    public static void g(com.google.android.gms.common.api.j jVar) {
        if (jVar instanceof com.google.android.gms.common.api.i) {
            try {
                ((com.google.android.gms.common.api.i) jVar).a();
            } catch (RuntimeException e) {
                String strValueOf = String.valueOf(jVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(strValueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    protected abstract R a(Status status);

    public final boolean c() {
        return this.f1490c.getCount() == 0;
    }

    public final void d(R r) {
        synchronized (this.a) {
            if (this.k || this.j) {
                g(r);
                return;
            }
            c();
            boolean z = true;
            com.google.android.gms.common.internal.q.o(!c(), "Results have already been set");
            if (this.i) {
                z = false;
            }
            com.google.android.gms.common.internal.q.o(z, "Result has already been consumed");
            f(r);
        }
    }

    public final void h(Status status) {
        synchronized (this.a) {
            if (!c()) {
                d(a(status));
                this.k = true;
            }
        }
    }
}
