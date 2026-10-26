package com.facebook.drawee.b.a.i;

import android.graphics.Rect;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class g {
    private final com.facebook.drawee.b.a.d a;

    /* renamed from: b, reason: collision with root package name */
    private final com.facebook.common.time.b f1143b;

    /* renamed from: c, reason: collision with root package name */
    private final h f1144c = new h();

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private c f1145d;

    @Nullable
    private b e;

    @Nullable
    private com.facebook.drawee.b.a.i.i.c f;

    @Nullable
    private com.facebook.drawee.b.a.i.i.a g;

    @Nullable
    private d.a.e.k.c h;

    @Nullable
    private List<f> i;
    private boolean j;

    public g(com.facebook.common.time.b bVar, com.facebook.drawee.b.a.d dVar) {
        this.f1143b = bVar;
        this.a = dVar;
    }

    private void h() {
        if (this.g == null) {
            this.g = new com.facebook.drawee.b.a.i.i.a(this.f1143b, this.f1144c, this);
        }
        if (this.f == null) {
            this.f = new com.facebook.drawee.b.a.i.i.c(this.f1143b, this.f1144c);
        }
        if (this.e == null) {
            this.e = new com.facebook.drawee.b.a.i.i.b(this.f1144c, this);
        }
        c cVar = this.f1145d;
        if (cVar == null) {
            this.f1145d = new c(this.a.r(), this.e);
        } else {
            cVar.l(this.a.r());
        }
        if (this.h == null) {
            this.h = new d.a.e.k.c(this.f, this.f1145d);
        }
    }

    public void a(@Nullable f fVar) {
        if (fVar == null) {
            return;
        }
        if (this.i == null) {
            this.i = new LinkedList();
        }
        this.i.add(fVar);
    }

    public void b() {
        com.facebook.drawee.i.b bVarC = this.a.c();
        if (bVarC == null || bVarC.c() == null) {
            return;
        }
        Rect bounds = bVarC.c().getBounds();
        this.f1144c.u(bounds.width());
        this.f1144c.t(bounds.height());
    }

    public void c() {
        List<f> list = this.i;
        if (list != null) {
            list.clear();
        }
    }

    public void d(h hVar, int i) {
        List<f> list;
        if (!this.j || (list = this.i) == null || list.isEmpty()) {
            return;
        }
        e eVarA = hVar.A();
        Iterator<f> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().b(eVarA, i);
        }
    }

    public void e(h hVar, int i) {
        List<f> list;
        hVar.n(i);
        if (!this.j || (list = this.i) == null || list.isEmpty()) {
            return;
        }
        if (i == 3) {
            b();
        }
        e eVarA = hVar.A();
        Iterator<f> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().a(eVarA, i);
        }
    }

    public void f() {
        c();
        g(false);
        this.f1144c.b();
    }

    public void g(boolean z) {
        this.j = z;
        if (!z) {
            b bVar = this.e;
            if (bVar != null) {
                this.a.g0(bVar);
            }
            com.facebook.drawee.b.a.i.i.a aVar = this.g;
            if (aVar != null) {
                this.a.I(aVar);
            }
            d.a.e.k.c cVar = this.h;
            if (cVar != null) {
                this.a.h0(cVar);
                return;
            }
            return;
        }
        h();
        b bVar2 = this.e;
        if (bVar2 != null) {
            this.a.R(bVar2);
        }
        com.facebook.drawee.b.a.i.i.a aVar2 = this.g;
        if (aVar2 != null) {
            this.a.j(aVar2);
        }
        d.a.e.k.c cVar2 = this.h;
        if (cVar2 != null) {
            this.a.S(cVar2);
        }
    }

    public void i(com.facebook.drawee.d.b<com.facebook.drawee.b.a.e, d.a.e.l.a, d.a.b.h.a<d.a.e.j.c>, d.a.e.j.g> bVar) {
        this.f1144c.i(bVar.n(), bVar.o(), bVar.m());
    }
}
