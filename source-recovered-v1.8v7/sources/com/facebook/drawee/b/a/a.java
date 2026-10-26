package com.facebook.drawee.b.a;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.f.h;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class a implements d.a.e.i.a {
    private final Resources a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final d.a.e.i.a f1132b;

    public a(Resources resources, @Nullable d.a.e.i.a aVar) {
        this.a = resources;
        this.f1132b = aVar;
    }

    private static boolean c(d.a.e.j.d dVar) {
        return (dVar.m() == 1 || dVar.m() == 0) ? false : true;
    }

    private static boolean d(d.a.e.j.d dVar) {
        return (dVar.n() == 0 || dVar.n() == -1) ? false : true;
    }

    @Override // d.a.e.i.a
    public boolean a(d.a.e.j.c cVar) {
        return true;
    }

    @Override // d.a.e.i.a
    @Nullable
    public Drawable b(d.a.e.j.c cVar) {
        try {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("DefaultDrawableFactory#createDrawable");
            }
            if (cVar instanceof d.a.e.j.d) {
                d.a.e.j.d dVar = (d.a.e.j.d) cVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.a, dVar.o());
                if (!d(dVar) && !c(dVar)) {
                    return bitmapDrawable;
                }
                h hVar = new h(bitmapDrawable, dVar.n(), dVar.m());
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.b();
                }
                return hVar;
            }
            if (this.f1132b == null || !this.f1132b.a(cVar)) {
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.b();
                }
                return null;
            }
            Drawable drawableB = this.f1132b.b(cVar);
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
            return drawableB;
        } finally {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.b();
            }
        }
    }
}
