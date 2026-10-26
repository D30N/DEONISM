package d.a.e.a.b;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import d.a.b.d.i;
import d.a.b.g.g;
import d.a.e.a.c.d;
import d.a.e.b.f;
import d.a.e.j.h;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class e implements d {

    /* renamed from: c, reason: collision with root package name */
    static c f2452c = g("com.facebook.animated.gif.GifImage");

    /* renamed from: d, reason: collision with root package name */
    static c f2453d = g("com.facebook.animated.webp.WebPImage");
    private final d.a.e.a.c.b a;

    /* renamed from: b, reason: collision with root package name */
    private final f f2454b;

    class a implements d.b {
        a(e eVar) {
        }

        @Override // d.a.e.a.c.d.b
        @Nullable
        public d.a.b.h.a<Bitmap> a(int i) {
            return null;
        }

        @Override // d.a.e.a.c.d.b
        public void b(int i, Bitmap bitmap) {
        }
    }

    class b implements d.b {
        final /* synthetic */ List a;

        b(e eVar, List list) {
            this.a = list;
        }

        @Override // d.a.e.a.c.d.b
        public d.a.b.h.a<Bitmap> a(int i) {
            return d.a.b.h.a.k((d.a.b.h.a) this.a.get(i));
        }

        @Override // d.a.e.a.c.d.b
        public void b(int i, Bitmap bitmap) {
        }
    }

    public e(d.a.e.a.c.b bVar, f fVar) {
        this.a = bVar;
        this.f2454b = fVar;
    }

    @SuppressLint({"NewApi"})
    private d.a.b.h.a<Bitmap> c(int i, int i2, Bitmap.Config config) {
        d.a.b.h.a<Bitmap> aVarC = this.f2454b.c(i, i2, config);
        aVarC.r().eraseColor(0);
        if (Build.VERSION.SDK_INT >= 12) {
            aVarC.r().setHasAlpha(true);
        }
        return aVarC;
    }

    private d.a.b.h.a<Bitmap> d(d.a.e.a.a.c cVar, Bitmap.Config config, int i) {
        d.a.b.h.a<Bitmap> aVarC = c(cVar.getWidth(), cVar.getHeight(), config);
        new d.a.e.a.c.d(this.a.a(d.a.e.a.a.e.b(cVar), null), new a(this)).f(i, aVarC.r());
        return aVarC;
    }

    private List<d.a.b.h.a<Bitmap>> e(d.a.e.a.a.c cVar, Bitmap.Config config) {
        d.a.e.a.a.a aVarA = this.a.a(d.a.e.a.a.e.b(cVar), null);
        ArrayList arrayList = new ArrayList(aVarA.a());
        d.a.e.a.c.d dVar = new d.a.e.a.c.d(aVarA, new b(this, arrayList));
        for (int i = 0; i < aVarA.a(); i++) {
            d.a.b.h.a<Bitmap> aVarC = c(aVarA.getWidth(), aVarA.getHeight(), config);
            dVar.f(i, aVarC.r());
            arrayList.add(aVarC);
        }
        return arrayList;
    }

    private d.a.e.j.c f(d.a.e.d.b bVar, d.a.e.a.a.c cVar, Bitmap.Config config) throws Throwable {
        List<d.a.b.h.a<Bitmap>> listE;
        d.a.b.h.a<Bitmap> aVarD = null;
        try {
            int iA = bVar.f2504c ? cVar.a() - 1 : 0;
            if (bVar.e) {
                d.a.e.j.d dVar = new d.a.e.j.d(d(cVar, config, iA), h.f2568d, 0);
                d.a.b.h.a.o(null);
                d.a.b.h.a.q(null);
                return dVar;
            }
            if (bVar.f2505d) {
                listE = e(cVar, config);
                try {
                    aVarD = d.a.b.h.a.k(listE.get(iA));
                } catch (Throwable th) {
                    th = th;
                    d.a.b.h.a.o(aVarD);
                    d.a.b.h.a.q(listE);
                    throw th;
                }
            } else {
                listE = null;
            }
            if (bVar.f2503b && aVarD == null) {
                aVarD = d(cVar, config, iA);
            }
            d.a.e.a.a.f fVarD = d.a.e.a.a.e.d(cVar);
            fVarD.h(aVarD);
            fVarD.g(iA);
            fVarD.f(listE);
            d.a.e.j.a aVar = new d.a.e.j.a(fVarD.a());
            d.a.b.h.a.o(aVarD);
            d.a.b.h.a.q(listE);
            return aVar;
        } catch (Throwable th2) {
            th = th2;
            listE = null;
        }
    }

    @Nullable
    private static c g(String str) {
        try {
            return (c) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // d.a.e.a.b.d
    public d.a.e.j.c a(d.a.e.j.e eVar, d.a.e.d.b bVar, Bitmap.Config config) {
        if (f2452c == null) {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
        d.a.b.h.a<g> aVarI = eVar.i();
        i.g(aVarI);
        try {
            g gVarR = aVarI.r();
            return f(bVar, gVarR.d() != null ? f2452c.e(gVarR.d()) : f2452c.g(gVarR.e(), gVarR.size()), config);
        } finally {
            d.a.b.h.a.o(aVarI);
        }
    }

    @Override // d.a.e.a.b.d
    public d.a.e.j.c b(d.a.e.j.e eVar, d.a.e.d.b bVar, Bitmap.Config config) {
        if (f2453d == null) {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
        d.a.b.h.a<g> aVarI = eVar.i();
        i.g(aVarI);
        try {
            g gVarR = aVarI.r();
            return f(bVar, gVarR.d() != null ? f2453d.e(gVarR.d()) : f2453d.g(gVarR.e(), gVarR.size()), config);
        } finally {
            d.a.b.h.a.o(aVarI);
        }
    }
}
