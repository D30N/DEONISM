package b.a.n;

import android.view.View;
import android.view.animation.Interpolator;
import b.g.l.v;
import b.g.l.w;
import b.g.l.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f719c;

    /* renamed from: d, reason: collision with root package name */
    w f720d;
    private boolean e;

    /* renamed from: b, reason: collision with root package name */
    private long f718b = -1;
    private final x f = new a();
    final ArrayList<v> a = new ArrayList<>();

    class a extends x {
        private boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f721b = 0;

        a() {
        }

        @Override // b.g.l.w
        public void a(View view) {
            int i = this.f721b + 1;
            this.f721b = i;
            if (i == h.this.a.size()) {
                w wVar = h.this.f720d;
                if (wVar != null) {
                    wVar.a(null);
                }
                d();
            }
        }

        @Override // b.g.l.x, b.g.l.w
        public void b(View view) {
            if (this.a) {
                return;
            }
            this.a = true;
            w wVar = h.this.f720d;
            if (wVar != null) {
                wVar.b(null);
            }
        }

        void d() {
            this.f721b = 0;
            this.a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.e) {
            Iterator<v> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.e = false;
        }
    }

    void b() {
        this.e = false;
    }

    public h c(v vVar) {
        if (!this.e) {
            this.a.add(vVar);
        }
        return this;
    }

    public h d(v vVar, v vVar2) {
        this.a.add(vVar);
        vVar2.h(vVar.c());
        this.a.add(vVar2);
        return this;
    }

    public h e(long j) {
        if (!this.e) {
            this.f718b = j;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.e) {
            this.f719c = interpolator;
        }
        return this;
    }

    public h g(w wVar) {
        if (!this.e) {
            this.f720d = wVar;
        }
        return this;
    }

    public void h() {
        if (this.e) {
            return;
        }
        Iterator<v> it = this.a.iterator();
        while (it.hasNext()) {
            v next = it.next();
            long j = this.f718b;
            if (j >= 0) {
                next.d(j);
            }
            Interpolator interpolator = this.f719c;
            if (interpolator != null) {
                next.e(interpolator);
            }
            if (this.f720d != null) {
                next.f(this.f);
            }
            next.j();
        }
        this.e = true;
    }
}
