package com.facebook.drawee.g;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import com.facebook.drawee.f.g;
import com.facebook.drawee.f.i;
import com.facebook.drawee.f.j;
import com.facebook.drawee.f.k;
import com.facebook.drawee.f.l;
import com.facebook.drawee.f.n;
import com.facebook.drawee.f.o;
import com.facebook.drawee.f.p;
import com.facebook.drawee.g.e;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class f {
    private static final Drawable a = new ColorDrawable(0);

    private static Drawable a(Drawable drawable, e eVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            j jVar = new j(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            b(jVar, eVar);
            return jVar;
        }
        if (drawable instanceof NinePatchDrawable) {
            n nVar = new n((NinePatchDrawable) drawable);
            b(nVar, eVar);
            return nVar;
        }
        if (!(drawable instanceof ColorDrawable) || Build.VERSION.SDK_INT < 11) {
            d.a.b.e.a.y("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        k kVarB = k.b((ColorDrawable) drawable);
        b(kVarB, eVar);
        return kVarB;
    }

    static void b(i iVar, e eVar) {
        iVar.j(eVar.h());
        iVar.k(eVar.c());
        iVar.a(eVar.a(), eVar.b());
        iVar.l(eVar.f());
        iVar.i(eVar.j());
        iVar.f(eVar.g());
    }

    static com.facebook.drawee.f.c c(com.facebook.drawee.f.c cVar) {
        while (true) {
            Object objG = cVar.g();
            if (objG == cVar || !(objG instanceof com.facebook.drawee.f.c)) {
                break;
            }
            cVar = (com.facebook.drawee.f.c) objG;
        }
        return cVar;
    }

    static Drawable d(@Nullable Drawable drawable, @Nullable e eVar, Resources resources) {
        try {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && eVar != null && eVar.i() == e.a.BITMAP_ONLY) {
                if (drawable instanceof g) {
                    com.facebook.drawee.f.c cVarC = c((g) drawable);
                    cVarC.b(a(cVarC.b(a), eVar, resources));
                    return drawable;
                }
                Drawable drawableA = a(drawable, eVar, resources);
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.b();
                }
                return drawableA;
            }
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
            return drawable;
        } finally {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        }
    }

    static Drawable e(@Nullable Drawable drawable, @Nullable e eVar) {
        try {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && eVar != null && eVar.i() == e.a.OVERLAY_COLOR) {
                l lVar = new l(drawable);
                b(lVar, eVar);
                lVar.q(eVar.e());
                return lVar;
            }
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
            return drawable;
        } finally {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        }
    }

    @Nullable
    static Drawable f(@Nullable Drawable drawable, @Nullable p.b bVar) {
        return g(drawable, bVar, null);
    }

    @Nullable
    static Drawable g(@Nullable Drawable drawable, @Nullable p.b bVar, @Nullable PointF pointF) {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || bVar == null) {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
            return drawable;
        }
        o oVar = new o(drawable, bVar);
        if (pointF != null) {
            oVar.s(pointF);
        }
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
        return oVar;
    }
}
