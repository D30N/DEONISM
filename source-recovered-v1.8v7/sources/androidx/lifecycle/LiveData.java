package androidx.lifecycle;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    static final Object i = new Object();
    final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private b.b.a.b.b<m<? super T>, LiveData<T>.a> f513b = new b.b.a.b.b<>();

    /* renamed from: c, reason: collision with root package name */
    int f514c = 0;

    /* renamed from: d, reason: collision with root package name */
    private volatile Object f515d = i;
    volatile Object e = i;
    private int f = -1;
    private boolean g;
    private boolean h;

    class LifecycleBoundObserver extends LiveData<T>.a implements Object {
        final g e;

        LifecycleBoundObserver(g gVar, m<? super T> mVar) {
            super(mVar);
            this.e = gVar;
        }

        public void d(g gVar, d.a aVar) {
            if (this.e.a().b() == d.b.DESTROYED) {
                LiveData.this.g(this.a);
            } else {
                h(k());
            }
        }

        @Override // androidx.lifecycle.LiveData.a
        void i() {
            this.e.a().c(this);
        }

        @Override // androidx.lifecycle.LiveData.a
        boolean j(g gVar) {
            return this.e == gVar;
        }

        @Override // androidx.lifecycle.LiveData.a
        boolean k() {
            return this.e.a().b().f(d.b.STARTED);
        }
    }

    private abstract class a {
        final m<? super T> a;

        /* renamed from: b, reason: collision with root package name */
        boolean f516b;

        /* renamed from: c, reason: collision with root package name */
        int f517c = -1;

        a(m<? super T> mVar) {
            this.a = mVar;
        }

        void h(boolean z) {
            if (z == this.f516b) {
                return;
            }
            this.f516b = z;
            boolean z2 = LiveData.this.f514c == 0;
            LiveData.this.f514c += this.f516b ? 1 : -1;
            if (z2 && this.f516b) {
                LiveData.this.e();
            }
            LiveData liveData = LiveData.this;
            if (liveData.f514c == 0 && !this.f516b) {
                liveData.f();
            }
            if (this.f516b) {
                LiveData.this.c(this);
            }
        }

        void i() {
        }

        boolean j(g gVar) {
            return false;
        }

        abstract boolean k();
    }

    private static void a(String str) {
        if (b.b.a.a.a.b().a()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void b(LiveData<T>.a aVar) {
        if (aVar.f516b) {
            if (!aVar.k()) {
                aVar.h(false);
                return;
            }
            int i2 = aVar.f517c;
            int i3 = this.f;
            if (i2 >= i3) {
                return;
            }
            aVar.f517c = i3;
            aVar.a.a((Object) this.f515d);
        }
    }

    void c(LiveData<T>.a aVar) {
        if (this.g) {
            this.h = true;
            return;
        }
        this.g = true;
        do {
            this.h = false;
            if (aVar != null) {
                b(aVar);
                aVar = null;
            } else {
                b.b.a.b.b<m<? super T>, LiveData<T>.a>.d dVarJ = this.f513b.j();
                while (dVarJ.hasNext()) {
                    b((a) dVarJ.next().getValue());
                    if (this.h) {
                        break;
                    }
                }
            }
        } while (this.h);
        this.g = false;
    }

    public void d(g gVar, m<? super T> mVar) {
        a("observe");
        if (gVar.a().b() == d.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(gVar, mVar);
        LiveData<T>.a aVarM = this.f513b.m(mVar, lifecycleBoundObserver);
        if (aVarM != null && !aVarM.j(gVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (aVarM != null) {
            return;
        }
        gVar.a().a(lifecycleBoundObserver);
    }

    protected void e() {
    }

    protected void f() {
    }

    public void g(m<? super T> mVar) {
        a("removeObserver");
        LiveData<T>.a aVarN = this.f513b.n(mVar);
        if (aVarN == null) {
            return;
        }
        aVarN.i();
        aVarN.h(false);
    }

    protected void h(T t) {
        a("setValue");
        this.f++;
        this.f515d = t;
        c(null);
    }
}
