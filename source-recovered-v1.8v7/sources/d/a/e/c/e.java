package d.a.e.c;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class e {
    private static final Class<?> h = e.class;
    private final d.a.a.b.i a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a.b.g.h f2477b;

    /* renamed from: c, reason: collision with root package name */
    private final d.a.b.g.k f2478c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f2479d;
    private final Executor e;
    private final u f = u.b();
    private final n g;

    class a implements Callable<d.a.e.j.e> {
        final /* synthetic */ AtomicBoolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d.a.a.a.d f2480b;

        a(AtomicBoolean atomicBoolean, d.a.a.a.d dVar) {
            this.a = atomicBoolean;
            this.f2480b = dVar;
        }

        @Override // java.util.concurrent.Callable
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d.a.e.j.e call() {
            try {
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.a("BufferedDiskCache#getAsync");
                }
                if (this.a.get()) {
                    throw new CancellationException();
                }
                d.a.e.j.e eVarA = e.this.f.a(this.f2480b);
                if (eVarA != null) {
                    d.a.b.e.a.o(e.h, "Found image for %s in staging area", this.f2480b.a());
                    e.this.g.g(this.f2480b);
                } else {
                    d.a.b.e.a.o(e.h, "Did not find image for %s in staging area", this.f2480b.a());
                    e.this.g.n(this.f2480b);
                    try {
                        d.a.b.g.g gVarL = e.this.l(this.f2480b);
                        if (gVarL == null) {
                            return null;
                        }
                        d.a.b.h.a aVarV = d.a.b.h.a.v(gVarL);
                        try {
                            eVarA = new d.a.e.j.e((d.a.b.h.a<d.a.b.g.g>) aVarV);
                        } finally {
                            d.a.b.h.a.o(aVarV);
                        }
                    } catch (Exception unused) {
                        if (d.a.e.m.b.d()) {
                            d.a.e.m.b.b();
                        }
                        return null;
                    }
                }
                if (!Thread.interrupted()) {
                    if (d.a.e.m.b.d()) {
                        d.a.e.m.b.b();
                    }
                    return eVarA;
                }
                d.a.b.e.a.n(e.h, "Host thread was interrupted, decreasing reference count");
                if (eVarA != null) {
                    eVarA.close();
                }
                throw new InterruptedException();
            } finally {
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.b();
                }
            }
        }
    }

    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d.a.a.a.d f2482b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d.a.e.j.e f2483c;

        b(d.a.a.a.d dVar, d.a.e.j.e eVar) {
            this.f2482b = dVar;
            this.f2483c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.a("BufferedDiskCache#putAsync");
                }
                e.this.n(this.f2482b, this.f2483c);
            } finally {
                e.this.f.f(this.f2482b, this.f2483c);
                d.a.e.j.e.g(this.f2483c);
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.b();
                }
            }
        }
    }

    class c implements Callable<Void> {
        final /* synthetic */ d.a.a.a.d a;

        c(d.a.a.a.d dVar) {
            this.a = dVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            try {
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.a("BufferedDiskCache#remove");
                }
                e.this.f.e(this.a);
                e.this.a.b(this.a);
            } finally {
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.b();
                }
            }
        }
    }

    class d implements d.a.a.a.j {
        final /* synthetic */ d.a.e.j.e a;

        d(d.a.e.j.e eVar) {
            this.a = eVar;
        }

        @Override // d.a.a.a.j
        public void a(OutputStream outputStream) {
            e.this.f2478c.a(this.a.p(), outputStream);
        }
    }

    public e(d.a.a.b.i iVar, d.a.b.g.h hVar, d.a.b.g.k kVar, Executor executor, Executor executor2, n nVar) {
        this.a = iVar;
        this.f2477b = hVar;
        this.f2478c = kVar;
        this.f2479d = executor;
        this.e = executor2;
        this.g = nVar;
    }

    private c.f<d.a.e.j.e> h(d.a.a.a.d dVar, d.a.e.j.e eVar) {
        d.a.b.e.a.o(h, "Found image for %s in staging area", dVar.a());
        this.g.g(dVar);
        return c.f.h(eVar);
    }

    private c.f<d.a.e.j.e> j(d.a.a.a.d dVar, AtomicBoolean atomicBoolean) {
        try {
            return c.f.b(new a(atomicBoolean, dVar), this.f2479d);
        } catch (Exception e) {
            d.a.b.e.a.x(h, e, "Failed to schedule disk-cache read for %s", dVar.a());
            return c.f.g(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public d.a.b.g.g l(d.a.a.a.d dVar) throws IOException {
        try {
            d.a.b.e.a.o(h, "Disk cache read for %s", dVar.a());
            com.facebook.binaryresource.a aVarA = this.a.a(dVar);
            if (aVarA == null) {
                d.a.b.e.a.o(h, "Disk cache miss for %s", dVar.a());
                this.g.b(dVar);
                return null;
            }
            d.a.b.e.a.o(h, "Found entry in disk cache for %s", dVar.a());
            this.g.a(dVar);
            InputStream inputStreamA = aVarA.a();
            try {
                d.a.b.g.g gVarA = this.f2477b.a(inputStreamA, (int) aVarA.size());
                inputStreamA.close();
                d.a.b.e.a.o(h, "Successful read from disk cache for %s", dVar.a());
                return gVarA;
            } catch (Throwable th) {
                inputStreamA.close();
                throw th;
            }
        } catch (IOException e) {
            d.a.b.e.a.x(h, e, "Exception reading from cache for %s", dVar.a());
            this.g.m(dVar);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(d.a.a.a.d dVar, d.a.e.j.e eVar) {
        d.a.b.e.a.o(h, "About to write to disk-cache for key %s", dVar.a());
        try {
            this.a.c(dVar, new d(eVar));
            this.g.c(dVar);
            d.a.b.e.a.o(h, "Successful disk-cache write for key %s", dVar.a());
        } catch (IOException e) {
            d.a.b.e.a.x(h, e, "Failed to write to disk-cache for key %s", dVar.a());
        }
    }

    public c.f<d.a.e.j.e> i(d.a.a.a.d dVar, AtomicBoolean atomicBoolean) {
        try {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("BufferedDiskCache#get");
            }
            d.a.e.j.e eVarA = this.f.a(dVar);
            if (eVarA != null) {
                return h(dVar, eVarA);
            }
            c.f<d.a.e.j.e> fVarJ = j(dVar, atomicBoolean);
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
            return fVarJ;
        } finally {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        }
    }

    public void k(d.a.a.a.d dVar, d.a.e.j.e eVar) {
        try {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("BufferedDiskCache#put");
            }
            d.a.b.d.i.g(dVar);
            d.a.b.d.i.b(d.a.e.j.e.x(eVar));
            this.f.d(dVar, eVar);
            d.a.e.j.e eVarF = d.a.e.j.e.f(eVar);
            try {
                this.e.execute(new b(dVar, eVarF));
            } catch (Exception e) {
                d.a.b.e.a.x(h, e, "Failed to schedule disk-cache write for %s", dVar.a());
                this.f.f(dVar, eVar);
                d.a.e.j.e.g(eVarF);
            }
        } finally {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        }
    }

    public c.f<Void> m(d.a.a.a.d dVar) {
        d.a.b.d.i.g(dVar);
        this.f.e(dVar);
        try {
            return c.f.b(new c(dVar), this.e);
        } catch (Exception e) {
            d.a.b.e.a.x(h, e, "Failed to schedule disk-cache remove for %s", dVar.a());
            return c.f.g(e);
        }
    }
}
