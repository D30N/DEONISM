package d.a.e.h;

import android.graphics.Bitmap;
import android.os.Build;
import d.a.e.j.h;
import d.a.e.j.j;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class b implements c {
    private final c a;

    /* renamed from: b, reason: collision with root package name */
    private final c f2552b;

    /* renamed from: c, reason: collision with root package name */
    private final com.facebook.imagepipeline.platform.d f2553c;

    /* renamed from: d, reason: collision with root package name */
    private final c f2554d;

    @Nullable
    private final Map<com.facebook.imageformat.c, c> e;

    class a implements c {
        a() {
        }

        @Override // d.a.e.h.c
        public d.a.e.j.c a(d.a.e.j.e eVar, int i, j jVar, d.a.e.d.b bVar) {
            com.facebook.imageformat.c cVarO = eVar.o();
            if (cVarO == com.facebook.imageformat.b.a) {
                return b.this.d(eVar, i, jVar, bVar);
            }
            if (cVarO == com.facebook.imageformat.b.f1243c) {
                return b.this.c(eVar, i, jVar, bVar);
            }
            if (cVarO == com.facebook.imageformat.b.j) {
                return b.this.b(eVar, i, jVar, bVar);
            }
            if (cVarO != com.facebook.imageformat.c.f1245b) {
                return b.this.e(eVar, bVar);
            }
            throw new d.a.e.h.a("unknown image format", eVar);
        }
    }

    public b(c cVar, c cVar2, com.facebook.imagepipeline.platform.d dVar) {
        this(cVar, cVar2, dVar, null);
    }

    public b(c cVar, c cVar2, com.facebook.imagepipeline.platform.d dVar, @Nullable Map<com.facebook.imageformat.c, c> map) {
        this.f2554d = new a();
        this.a = cVar;
        this.f2552b = cVar2;
        this.f2553c = dVar;
        this.e = map;
    }

    private void f(@Nullable d.a.e.o.a aVar, d.a.b.h.a<Bitmap> aVar2) {
        if (aVar == null) {
            return;
        }
        Bitmap bitmapR = aVar2.r();
        if (Build.VERSION.SDK_INT >= 12 && aVar.a()) {
            bitmapR.setHasAlpha(true);
        }
        aVar.b(bitmapR);
    }

    @Override // d.a.e.h.c
    public d.a.e.j.c a(d.a.e.j.e eVar, int i, j jVar, d.a.e.d.b bVar) {
        c cVar;
        c cVar2 = bVar.g;
        if (cVar2 != null) {
            return cVar2.a(eVar, i, jVar, bVar);
        }
        com.facebook.imageformat.c cVarO = eVar.o();
        if (cVarO == null || cVarO == com.facebook.imageformat.c.f1245b) {
            cVarO = com.facebook.imageformat.d.c(eVar.p());
            eVar.F(cVarO);
        }
        Map<com.facebook.imageformat.c, c> map = this.e;
        return (map == null || (cVar = map.get(cVarO)) == null) ? this.f2554d.a(eVar, i, jVar, bVar) : cVar.a(eVar, i, jVar, bVar);
    }

    public d.a.e.j.c b(d.a.e.j.e eVar, int i, j jVar, d.a.e.d.b bVar) {
        return this.f2552b.a(eVar, i, jVar, bVar);
    }

    public d.a.e.j.c c(d.a.e.j.e eVar, int i, j jVar, d.a.e.d.b bVar) {
        c cVar;
        if (eVar.t() == -1 || eVar.n() == -1) {
            throw new d.a.e.h.a("image width or height is incorrect", eVar);
        }
        return (bVar.e || (cVar = this.a) == null) ? e(eVar, bVar) : cVar.a(eVar, i, jVar, bVar);
    }

    public d.a.e.j.d d(d.a.e.j.e eVar, int i, j jVar, d.a.e.d.b bVar) {
        d.a.b.h.a<Bitmap> aVarC = this.f2553c.c(eVar, bVar.f, null, i, bVar.i);
        try {
            f(bVar.h, aVarC);
            return new d.a.e.j.d(aVarC, jVar, eVar.q(), eVar.l());
        } finally {
            aVarC.close();
        }
    }

    public d.a.e.j.d e(d.a.e.j.e eVar, d.a.e.d.b bVar) {
        d.a.b.h.a<Bitmap> aVarB = this.f2553c.b(eVar, bVar.f, null, bVar.i);
        try {
            f(bVar.h, aVarB);
            return new d.a.e.j.d(aVarB, h.f2568d, eVar.q(), eVar.l());
        } finally {
            aVarB.close();
        }
    }
}
