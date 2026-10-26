package c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class f<TResult> {
    private static final Executor i;
    private static volatile d j;
    private static f<?> k;
    private static f<Boolean> l;
    private static f<Boolean> m;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1060b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1061c;

    /* renamed from: d, reason: collision with root package name */
    private TResult f1062d;
    private Exception e;
    private boolean f;
    private h g;
    private final Object a = new Object();
    private List<c.d<TResult, Void>> h = new ArrayList();

    class a implements c.d<TResult, Void> {
        final /* synthetic */ g a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.d f1063b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f1064c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c.c f1065d;

        a(f fVar, g gVar, c.d dVar, Executor executor, c.c cVar) {
            this.a = gVar;
            this.f1063b = dVar;
            this.f1064c = executor;
            this.f1065d = cVar;
        }

        @Override // c.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(f<TResult> fVar) {
            f.d(this.a, this.f1063b, fVar, this.f1064c, this.f1065d);
            return null;
        }
    }

    static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.c f1066b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f1067c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c.d f1068d;
        final /* synthetic */ f e;

        b(c.c cVar, g gVar, c.d dVar, f fVar) {
            this.f1066b = cVar;
            this.f1067c = gVar;
            this.f1068d = dVar;
            this.e = fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            c.c cVar = this.f1066b;
            if (cVar != null) {
                cVar.a();
                throw null;
            }
            try {
                this.f1067c.d(this.f1068d.a(this.e));
            } catch (CancellationException unused) {
                this.f1067c.b();
            } catch (Exception e) {
                this.f1067c.c(e);
            }
        }
    }

    static class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.c f1069b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f1070c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Callable f1071d;

        c(c.c cVar, g gVar, Callable callable) {
            this.f1069b = cVar;
            this.f1070c = gVar;
            this.f1071d = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            c.c cVar = this.f1069b;
            if (cVar != null) {
                cVar.a();
                throw null;
            }
            try {
                this.f1070c.d(this.f1071d.call());
            } catch (CancellationException unused) {
                this.f1070c.b();
            } catch (Exception e) {
                this.f1070c.c(e);
            }
        }
    }

    public interface d {
        void a(f<?> fVar, i iVar);
    }

    static {
        c.b.a();
        i = c.b.b();
        c.a.c();
        k = new f<>((Object) null);
        l = new f<>(Boolean.TRUE);
        m = new f<>(Boolean.FALSE);
        new f(true);
    }

    f() {
    }

    private f(TResult tresult) {
        r(tresult);
    }

    private f(boolean z) {
        if (z) {
            p();
        } else {
            r(null);
        }
    }

    public static <TResult> f<TResult> b(Callable<TResult> callable, Executor executor) {
        return c(callable, executor, null);
    }

    public static <TResult> f<TResult> c(Callable<TResult> callable, Executor executor, c.c cVar) {
        g gVar = new g();
        try {
            executor.execute(new c(cVar, gVar, callable));
        } catch (Exception e) {
            gVar.c(new e(e));
        }
        return gVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void d(g<TContinuationResult> gVar, c.d<TResult, TContinuationResult> dVar, f<TResult> fVar, Executor executor, c.c cVar) {
        try {
            executor.execute(new b(cVar, gVar, dVar, fVar));
        } catch (Exception e) {
            gVar.c(new e(e));
        }
    }

    public static <TResult> f<TResult> g(Exception exc) {
        g gVar = new g();
        gVar.c(exc);
        return gVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <TResult> f<TResult> h(TResult tresult) {
        if (tresult == 0) {
            return (f<TResult>) k;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (f<TResult>) l : (f<TResult>) m;
        }
        g gVar = new g();
        gVar.d(tresult);
        return gVar.a();
    }

    public static d k() {
        return j;
    }

    private void o() {
        synchronized (this.a) {
            Iterator<c.d<TResult, Void>> it = this.h.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.h = null;
        }
    }

    public <TContinuationResult> f<TContinuationResult> e(c.d<TResult, TContinuationResult> dVar) {
        return f(dVar, i, null);
    }

    public <TContinuationResult> f<TContinuationResult> f(c.d<TResult, TContinuationResult> dVar, Executor executor, c.c cVar) {
        boolean zM;
        g gVar = new g();
        synchronized (this.a) {
            zM = m();
            if (!zM) {
                this.h.add(new a(this, gVar, dVar, executor, cVar));
            }
        }
        if (zM) {
            d(gVar, dVar, this, executor, cVar);
        }
        return gVar.a();
    }

    public Exception i() {
        Exception exc;
        synchronized (this.a) {
            if (this.e != null) {
                this.f = true;
                if (this.g != null) {
                    this.g.a();
                    this.g = null;
                }
            }
            exc = this.e;
        }
        return exc;
    }

    public TResult j() {
        TResult tresult;
        synchronized (this.a) {
            tresult = this.f1062d;
        }
        return tresult;
    }

    public boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.f1061c;
        }
        return z;
    }

    public boolean m() {
        boolean z;
        synchronized (this.a) {
            z = this.f1060b;
        }
        return z;
    }

    public boolean n() {
        boolean z;
        synchronized (this.a) {
            z = i() != null;
        }
        return z;
    }

    boolean p() {
        synchronized (this.a) {
            if (this.f1060b) {
                return false;
            }
            this.f1060b = true;
            this.f1061c = true;
            this.a.notifyAll();
            o();
            return true;
        }
    }

    boolean q(Exception exc) {
        synchronized (this.a) {
            if (this.f1060b) {
                return false;
            }
            this.f1060b = true;
            this.e = exc;
            this.f = false;
            this.a.notifyAll();
            o();
            if (!this.f && k() != null) {
                this.g = new h(this);
            }
            return true;
        }
    }

    boolean r(TResult tresult) {
        synchronized (this.a) {
            if (this.f1060b) {
                return false;
            }
            this.f1060b = true;
            this.f1062d = tresult;
            this.a.notifyAll();
            o();
            return true;
        }
    }
}
