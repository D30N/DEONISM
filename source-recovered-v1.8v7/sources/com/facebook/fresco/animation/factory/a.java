package com.facebook.fresco.animation.factory;

import android.graphics.Bitmap;
import android.graphics.Rect;
import d.a.a.a.d;
import d.a.b.d.k;
import d.a.e.a.a.e;
import d.a.e.a.c.b;
import d.a.e.b.f;
import d.a.e.c.h;
import d.a.e.j.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class a implements d.a.e.i.a {
    private final b a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f1236b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f1237c;

    /* renamed from: d, reason: collision with root package name */
    private final com.facebook.common.time.b f1238d;
    private final f e;
    private final h<d, c> f;
    private final k<Integer> g;
    private final k<Integer> h;

    public a(b bVar, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, com.facebook.common.time.b bVar2, f fVar, h<d, c> hVar, k<Integer> kVar, k<Integer> kVar2) {
        this.a = bVar;
        this.f1236b = scheduledExecutorService;
        this.f1237c = executorService;
        this.f1238d = bVar2;
        this.e = fVar;
        this.f = hVar;
        this.g = kVar;
        this.h = kVar2;
    }

    private d.a.e.a.a.a c(e eVar) {
        d.a.e.a.a.c cVarC = eVar.c();
        return this.a.a(eVar, new Rect(0, 0, cVarC.getWidth(), cVarC.getHeight()));
    }

    private d.a.e.a.c.c d(e eVar) {
        return new d.a.e.a.c.c(new d.a.d.a.b.d.a(eVar.hashCode()), this.f);
    }

    private d.a.d.a.a.a e(e eVar) {
        d.a.d.a.b.e.d dVar;
        d.a.d.a.b.e.b bVarG;
        d.a.e.a.a.a aVarC = c(eVar);
        d.a.d.a.b.b bVarF = f(eVar);
        d.a.d.a.b.f.b bVar = new d.a.d.a.b.f.b(bVarF, aVarC);
        int iIntValue = this.h.get().intValue();
        if (iIntValue > 0) {
            d.a.d.a.b.e.d dVar2 = new d.a.d.a.b.e.d(iIntValue);
            bVarG = g(bVar);
            dVar = dVar2;
        } else {
            dVar = null;
            bVarG = null;
        }
        return d.a.d.a.a.c.n(new d.a.d.a.b.a(this.e, bVarF, new d.a.d.a.b.f.a(aVarC), bVar, dVar, bVarG), this.f1238d, this.f1236b);
    }

    private d.a.d.a.b.b f(e eVar) {
        int iIntValue = this.g.get().intValue();
        return iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? new d.a.d.a.b.d.d() : new d.a.d.a.b.d.c() : new d.a.d.a.b.d.b(d(eVar), false) : new d.a.d.a.b.d.b(d(eVar), true);
    }

    private d.a.d.a.b.e.b g(d.a.d.a.b.c cVar) {
        return new d.a.d.a.b.e.c(this.e, cVar, Bitmap.Config.ARGB_8888, this.f1237c);
    }

    @Override // d.a.e.i.a
    public boolean a(c cVar) {
        return cVar instanceof d.a.e.j.a;
    }

    @Override // d.a.e.i.a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public d.a.d.a.c.a b(c cVar) {
        return new d.a.d.a.c.a(e(((d.a.e.j.a) cVar).i()));
    }
}
