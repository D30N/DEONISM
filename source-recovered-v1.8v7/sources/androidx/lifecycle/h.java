package androidx.lifecycle;

import androidx.lifecycle.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class h extends d {

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<g> f528c;
    private b.b.a.b.a<f, b> a = new b.b.a.b.a<>();

    /* renamed from: d, reason: collision with root package name */
    private int f529d = 0;
    private boolean e = false;
    private boolean f = false;
    private ArrayList<d.b> g = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private d.b f527b = d.b.INITIALIZED;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f530b;

        static {
            int[] iArr = new int[d.b.values().length];
            f530b = iArr;
            try {
                iArr[d.b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f530b[d.b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f530b[d.b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f530b[d.b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f530b[d.b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[d.a.values().length];
            a = iArr2;
            try {
                iArr2[d.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[d.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[d.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[d.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[d.a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[d.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[d.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static class b {
        d.b a;

        /* renamed from: b, reason: collision with root package name */
        e f531b;

        b(f fVar, d.b bVar) {
            this.f531b = j.f(fVar);
            this.a = bVar;
        }

        void a(g gVar, d.a aVar) {
            d.b bVarH = h.h(aVar);
            this.a = h.l(this.a, bVarH);
            this.f531b.d(gVar, aVar);
            this.a = bVarH;
        }
    }

    public h(g gVar) {
        this.f528c = new WeakReference<>(gVar);
    }

    private void d(g gVar) {
        Iterator<Map.Entry<f, b>> itC = this.a.c();
        while (itC.hasNext() && !this.f) {
            Map.Entry<f, b> next = itC.next();
            b value = next.getValue();
            while (value.a.compareTo(this.f527b) > 0 && !this.f && this.a.contains(next.getKey())) {
                d.a aVarF = f(value.a);
                o(h(aVarF));
                value.a(gVar, aVarF);
                n();
            }
        }
    }

    private d.b e(f fVar) {
        Map.Entry<f, b> entryO = this.a.o(fVar);
        d.b bVar = null;
        d.b bVar2 = entryO != null ? entryO.getValue().a : null;
        if (!this.g.isEmpty()) {
            bVar = this.g.get(r0.size() - 1);
        }
        return l(l(this.f527b, bVar2), bVar);
    }

    private static d.a f(d.b bVar) {
        int i = a.f530b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        }
        if (i == 2) {
            return d.a.ON_DESTROY;
        }
        if (i == 3) {
            return d.a.ON_STOP;
        }
        if (i == 4) {
            return d.a.ON_PAUSE;
        }
        if (i == 5) {
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Unexpected state value " + bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void g(g gVar) {
        b.b.a.b.b<f, b>.d dVarJ = this.a.j();
        while (dVarJ.hasNext() && !this.f) {
            Map.Entry next = dVarJ.next();
            b bVar = (b) next.getValue();
            while (bVar.a.compareTo(this.f527b) < 0 && !this.f && this.a.contains(next.getKey())) {
                o(bVar.a);
                bVar.a(gVar, r(bVar.a));
                n();
            }
        }
    }

    static d.b h(d.a aVar) {
        switch (a.a[aVar.ordinal()]) {
            case 1:
            case 2:
                return d.b.CREATED;
            case 3:
            case 4:
                return d.b.STARTED;
            case 5:
                return d.b.RESUMED;
            case 6:
                return d.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    private boolean j() {
        if (this.a.size() == 0) {
            return true;
        }
        d.b bVar = this.a.h().getValue().a;
        d.b bVar2 = this.a.k().getValue().a;
        return bVar == bVar2 && this.f527b == bVar2;
    }

    static d.b l(d.b bVar, d.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void m(d.b bVar) {
        if (this.f527b == bVar) {
            return;
        }
        this.f527b = bVar;
        if (this.e || this.f529d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        q();
        this.e = false;
    }

    private void n() {
        this.g.remove(r0.size() - 1);
    }

    private void o(d.b bVar) {
        this.g.add(bVar);
    }

    private void q() {
        g gVar = this.f528c.get();
        if (gVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean zJ = j();
            this.f = false;
            if (zJ) {
                return;
            }
            if (this.f527b.compareTo(this.a.h().getValue().a) < 0) {
                d(gVar);
            }
            Map.Entry<f, b> entryK = this.a.k();
            if (!this.f && entryK != null && this.f527b.compareTo(entryK.getValue().a) > 0) {
                g(gVar);
            }
        }
    }

    private static d.a r(d.b bVar) {
        int i = a.f530b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return d.a.ON_START;
            }
            if (i == 3) {
                return d.a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return d.a.ON_CREATE;
    }

    @Override // androidx.lifecycle.d
    public void a(f fVar) {
        g gVar;
        d.b bVar = this.f527b;
        d.b bVar2 = d.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = d.b.INITIALIZED;
        }
        b bVar3 = new b(fVar, bVar2);
        if (this.a.m(fVar, bVar3) == null && (gVar = this.f528c.get()) != null) {
            boolean z = this.f529d != 0 || this.e;
            d.b bVarE = e(fVar);
            this.f529d++;
            while (bVar3.a.compareTo(bVarE) < 0 && this.a.contains(fVar)) {
                o(bVar3.a);
                bVar3.a(gVar, r(bVar3.a));
                n();
                bVarE = e(fVar);
            }
            if (!z) {
                q();
            }
            this.f529d--;
        }
    }

    @Override // androidx.lifecycle.d
    public d.b b() {
        return this.f527b;
    }

    @Override // androidx.lifecycle.d
    public void c(f fVar) {
        this.a.n(fVar);
    }

    public void i(d.a aVar) {
        m(h(aVar));
    }

    @Deprecated
    public void k(d.b bVar) {
        p(bVar);
    }

    public void p(d.b bVar) {
        m(bVar);
    }
}
