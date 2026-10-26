package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import com.google.firebase.installations.i;
import com.google.firebase.installations.r.d;
import com.google.firebase.installations.r.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* loaded from: classes.dex */
public class g implements h {
    private static final Object k = new Object();
    private static final ThreadFactory l = new a();
    private final d.b.b.c a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.installations.r.c f2285b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.installations.q.c f2286c;

    /* renamed from: d, reason: collision with root package name */
    private final p f2287d;
    private final com.google.firebase.installations.q.b e;
    private final n f;
    private final Object g;
    private final ExecutorService h;
    private final ExecutorService i;
    private final List<o> j;

    class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.a.getAndIncrement())));
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f2288b;

        static {
            int[] iArr = new int[e.b.values().length];
            f2288b = iArr;
            try {
                iArr[e.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2288b[e.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2288b[e.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    g(d.b.b.c cVar, d.b.b.j.h hVar, d.b.b.g.c cVar2) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), l), cVar, new com.google.firebase.installations.r.c(cVar.g(), hVar, cVar2), new com.google.firebase.installations.q.c(cVar), new p(), new com.google.firebase.installations.q.b(cVar), new n());
    }

    g(ExecutorService executorService, d.b.b.c cVar, com.google.firebase.installations.r.c cVar2, com.google.firebase.installations.q.c cVar3, p pVar, com.google.firebase.installations.q.b bVar, n nVar) {
        this.g = new Object();
        this.j = new ArrayList();
        this.a = cVar;
        this.f2285b = cVar2;
        this.f2286c = cVar3;
        this.f2287d = pVar;
        this.e = bVar;
        this.f = nVar;
        this.h = executorService;
        this.i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), l);
    }

    private d.b.a.a.h.h<m> e() {
        d.b.a.a.h.i iVar = new d.b.a.a.h.i();
        k kVar = new k(this.f2287d, iVar);
        synchronized (this.g) {
            this.j.add(kVar);
        }
        return iVar.a();
    }

    private d.b.a.a.h.h<String> f() {
        d.b.a.a.h.i iVar = new d.b.a.a.h.i();
        l lVar = new l(iVar);
        synchronized (this.g) {
            this.j.add(lVar);
        }
        return iVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        k(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        k(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        k(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(boolean z) throws JSONException, IOException {
        com.google.firebase.installations.q.d dVarT;
        Exception iOException;
        com.google.firebase.installations.q.d dVarO = o();
        try {
            if (dVarO.i() || dVarO.l()) {
                dVarT = t(dVarO);
            } else {
                if (!z && !this.f2287d.b(dVarO)) {
                    return;
                }
                dVarT = l(dVarO);
            }
            this.f2286c.a(dVarT);
            if (dVarT.i()) {
                iOException = new i(i.a.BAD_CONFIG);
            } else {
                if (!dVarT.j()) {
                    v(dVarT);
                    return;
                }
                iOException = new IOException("cleared fid due to auth error");
            }
            u(dVarT, iOException);
        } catch (IOException e) {
            u(dVarO, e);
        }
    }

    private final void k(boolean z) {
        com.google.firebase.installations.q.d dVarO = o();
        if (z) {
            dVarO = dVarO.p();
        }
        v(dVarO);
        this.i.execute(f.a(this, z));
    }

    private com.google.firebase.installations.q.d l(com.google.firebase.installations.q.d dVar) throws IOException {
        com.google.firebase.installations.r.e eVarD = this.f2285b.d(m(), dVar.d(), p(), dVar.f());
        int i = b.f2288b[eVarD.b().ordinal()];
        if (i == 1) {
            return dVar.o(eVarD.c(), eVarD.d(), this.f2287d.a());
        }
        if (i == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i == 3) {
            return dVar.r();
        }
        throw new IOException();
    }

    private com.google.firebase.installations.q.d o() {
        com.google.firebase.installations.q.d dVarC;
        synchronized (k) {
            com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.a.g(), "generatefid.lock");
            try {
                dVarC = this.f2286c.c();
                if (dVarC.j()) {
                    String strS = s(dVarC);
                    com.google.firebase.installations.q.c cVar = this.f2286c;
                    dVarC = dVarC.t(strS);
                    cVar.a(dVarC);
                }
            } finally {
                if (bVarA != null) {
                    bVarA.b();
                }
            }
        }
        return dVarC;
    }

    private void r() {
        q.g(n());
        q.g(p());
        q.g(m());
    }

    private String s(com.google.firebase.installations.q.d dVar) {
        if ((!this.a.i().equals("CHIME_ANDROID_SDK") && !this.a.q()) || !dVar.m()) {
            return this.f.a();
        }
        String strF = this.e.f();
        return TextUtils.isEmpty(strF) ? this.f.a() : strF;
    }

    private com.google.firebase.installations.q.d t(com.google.firebase.installations.q.d dVar) throws IOException {
        com.google.firebase.installations.r.d dVarC = this.f2285b.c(m(), dVar.d(), p(), n(), dVar.d().length() == 11 ? this.e.i() : null);
        int i = b.a[dVarC.e().ordinal()];
        if (i == 1) {
            return dVar.s(dVarC.c(), dVarC.d(), this.f2287d.a(), dVarC.b().c(), dVarC.b().d());
        }
        if (i == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new IOException();
    }

    private void u(com.google.firebase.installations.q.d dVar, Exception exc) {
        synchronized (this.g) {
            Iterator<o> it = this.j.iterator();
            while (it.hasNext()) {
                if (it.next().a(dVar, exc)) {
                    it.remove();
                }
            }
        }
    }

    private void v(com.google.firebase.installations.q.d dVar) {
        synchronized (this.g) {
            Iterator<o> it = this.j.iterator();
            while (it.hasNext()) {
                if (it.next().b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    @Override // com.google.firebase.installations.h
    public d.b.a.a.h.h<m> a(boolean z) {
        ExecutorService executorService;
        Runnable runnableA;
        r();
        d.b.a.a.h.h<m> hVarE = e();
        if (z) {
            executorService = this.h;
            runnableA = d.a(this);
        } else {
            executorService = this.h;
            runnableA = e.a(this);
        }
        executorService.execute(runnableA);
        return hVarE;
    }

    @Override // com.google.firebase.installations.h
    public d.b.a.a.h.h<String> getId() {
        r();
        d.b.a.a.h.h<String> hVarF = f();
        this.h.execute(c.a(this));
        return hVarF;
    }

    String m() {
        return this.a.j().b();
    }

    String n() {
        return this.a.j().c();
    }

    String p() {
        return TextUtils.isEmpty(this.a.j().e()) ? this.a.j().d() : this.a.j().e();
    }
}
