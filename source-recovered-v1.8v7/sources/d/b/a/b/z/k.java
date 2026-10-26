package d.b.a.b.z;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes.dex */
public class k {
    d a;

    /* renamed from: b, reason: collision with root package name */
    d f2999b;

    /* renamed from: c, reason: collision with root package name */
    d f3000c;

    /* renamed from: d, reason: collision with root package name */
    d f3001d;
    d.b.a.b.z.c e;
    d.b.a.b.z.c f;
    d.b.a.b.z.c g;
    d.b.a.b.z.c h;
    f i;
    f j;
    f k;
    f l;

    public static final class b {
        private d a;

        /* renamed from: b, reason: collision with root package name */
        private d f3002b;

        /* renamed from: c, reason: collision with root package name */
        private d f3003c;

        /* renamed from: d, reason: collision with root package name */
        private d f3004d;
        private d.b.a.b.z.c e;
        private d.b.a.b.z.c f;
        private d.b.a.b.z.c g;
        private d.b.a.b.z.c h;
        private f i;
        private f j;
        private f k;
        private f l;

        public b() {
            this.a = h.b();
            this.f3002b = h.b();
            this.f3003c = h.b();
            this.f3004d = h.b();
            this.e = new d.b.a.b.z.a(0.0f);
            this.f = new d.b.a.b.z.a(0.0f);
            this.g = new d.b.a.b.z.a(0.0f);
            this.h = new d.b.a.b.z.a(0.0f);
            this.i = h.c();
            this.j = h.c();
            this.k = h.c();
            this.l = h.c();
        }

        public b(k kVar) {
            this.a = h.b();
            this.f3002b = h.b();
            this.f3003c = h.b();
            this.f3004d = h.b();
            this.e = new d.b.a.b.z.a(0.0f);
            this.f = new d.b.a.b.z.a(0.0f);
            this.g = new d.b.a.b.z.a(0.0f);
            this.h = new d.b.a.b.z.a(0.0f);
            this.i = h.c();
            this.j = h.c();
            this.k = h.c();
            this.l = h.c();
            this.a = kVar.a;
            this.f3002b = kVar.f2999b;
            this.f3003c = kVar.f3000c;
            this.f3004d = kVar.f3001d;
            this.e = kVar.e;
            this.f = kVar.f;
            this.g = kVar.g;
            this.h = kVar.h;
            this.i = kVar.i;
            this.j = kVar.j;
            this.k = kVar.k;
            this.l = kVar.l;
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).a;
            }
            return -1.0f;
        }

        public b A(d.b.a.b.z.c cVar) {
            this.e = cVar;
            return this;
        }

        public b B(int i, d.b.a.b.z.c cVar) {
            C(h.a(i));
            E(cVar);
            return this;
        }

        public b C(d dVar) {
            this.f3002b = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                D(fN);
            }
            return this;
        }

        public b D(float f) {
            this.f = new d.b.a.b.z.a(f);
            return this;
        }

        public b E(d.b.a.b.z.c cVar) {
            this.f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f) {
            z(f);
            D(f);
            v(f);
            r(f);
            return this;
        }

        public b p(int i, d.b.a.b.z.c cVar) {
            q(h.a(i));
            s(cVar);
            return this;
        }

        public b q(d dVar) {
            this.f3004d = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                r(fN);
            }
            return this;
        }

        public b r(float f) {
            this.h = new d.b.a.b.z.a(f);
            return this;
        }

        public b s(d.b.a.b.z.c cVar) {
            this.h = cVar;
            return this;
        }

        public b t(int i, d.b.a.b.z.c cVar) {
            u(h.a(i));
            w(cVar);
            return this;
        }

        public b u(d dVar) {
            this.f3003c = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                v(fN);
            }
            return this;
        }

        public b v(float f) {
            this.g = new d.b.a.b.z.a(f);
            return this;
        }

        public b w(d.b.a.b.z.c cVar) {
            this.g = cVar;
            return this;
        }

        public b x(int i, d.b.a.b.z.c cVar) {
            y(h.a(i));
            A(cVar);
            return this;
        }

        public b y(d dVar) {
            this.a = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                z(fN);
            }
            return this;
        }

        public b z(float f) {
            this.e = new d.b.a.b.z.a(f);
            return this;
        }
    }

    public interface c {
        d.b.a.b.z.c a(d.b.a.b.z.c cVar);
    }

    public k() {
        this.a = h.b();
        this.f2999b = h.b();
        this.f3000c = h.b();
        this.f3001d = h.b();
        this.e = new d.b.a.b.z.a(0.0f);
        this.f = new d.b.a.b.z.a(0.0f);
        this.g = new d.b.a.b.z.a(0.0f);
        this.h = new d.b.a.b.z.a(0.0f);
        this.i = h.c();
        this.j = h.c();
        this.k = h.c();
        this.l = h.c();
    }

    private k(b bVar) {
        this.a = bVar.a;
        this.f2999b = bVar.f3002b;
        this.f3000c = bVar.f3003c;
        this.f3001d = bVar.f3004d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i, int i2) {
        return c(context, i, i2, 0);
    }

    private static b c(Context context, int i, int i2, int i3) {
        return d(context, i, i2, new d.b.a.b.z.a(i3));
    }

    private static b d(Context context, int i, int i2, d.b.a.b.z.c cVar) throws Resources.NotFoundException {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, d.b.a.b.k.ShapeAppearance);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(d.b.a.b.k.ShapeAppearance_cornerFamily, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(d.b.a.b.k.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(d.b.a.b.k.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(d.b.a.b.k.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(d.b.a.b.k.ShapeAppearance_cornerFamilyBottomLeft, i3);
            d.b.a.b.z.c cVarM = m(typedArrayObtainStyledAttributes, d.b.a.b.k.ShapeAppearance_cornerSize, cVar);
            d.b.a.b.z.c cVarM2 = m(typedArrayObtainStyledAttributes, d.b.a.b.k.ShapeAppearance_cornerSizeTopLeft, cVarM);
            d.b.a.b.z.c cVarM3 = m(typedArrayObtainStyledAttributes, d.b.a.b.k.ShapeAppearance_cornerSizeTopRight, cVarM);
            d.b.a.b.z.c cVarM4 = m(typedArrayObtainStyledAttributes, d.b.a.b.k.ShapeAppearance_cornerSizeBottomRight, cVarM);
            d.b.a.b.z.c cVarM5 = m(typedArrayObtainStyledAttributes, d.b.a.b.k.ShapeAppearance_cornerSizeBottomLeft, cVarM);
            b bVar = new b();
            bVar.x(i4, cVarM2);
            bVar.B(i5, cVarM3);
            bVar.t(i6, cVarM4);
            bVar.p(i7, cVarM5);
            return bVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i, int i2) {
        return f(context, attributeSet, i, i2, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return g(context, attributeSet, i, i2, new d.b.a.b.z.a(i3));
    }

    public static b g(Context context, AttributeSet attributeSet, int i, int i2, d.b.a.b.z.c cVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.b.a.b.k.MaterialShape, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(d.b.a.b.k.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(d.b.a.b.k.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static d.b.a.b.z.c m(TypedArray typedArray, int i, d.b.a.b.z.c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return cVar;
        }
        int i2 = typedValuePeekValue.type;
        return i2 == 5 ? new d.b.a.b.z.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new i(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.k;
    }

    public d i() {
        return this.f3001d;
    }

    public d.b.a.b.z.c j() {
        return this.h;
    }

    public d k() {
        return this.f3000c;
    }

    public d.b.a.b.z.c l() {
        return this.g;
    }

    public f n() {
        return this.l;
    }

    public f o() {
        return this.j;
    }

    public f p() {
        return this.i;
    }

    public d q() {
        return this.a;
    }

    public d.b.a.b.z.c r() {
        return this.e;
    }

    public d s() {
        return this.f2999b;
    }

    public d.b.a.b.z.c t() {
        return this.f;
    }

    public boolean u(RectF rectF) {
        boolean z = this.l.getClass().equals(f.class) && this.j.getClass().equals(f.class) && this.i.getClass().equals(f.class) && this.k.getClass().equals(f.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f2999b instanceof j) && (this.a instanceof j) && (this.f3000c instanceof j) && (this.f3001d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f) {
        b bVarV = v();
        bVarV.o(f);
        return bVarV.m();
    }

    public k x(c cVar) {
        b bVarV = v();
        bVarV.A(cVar.a(r()));
        bVarV.E(cVar.a(t()));
        bVarV.s(cVar.a(j()));
        bVarV.w(cVar.a(l()));
        return bVarV.m();
    }
}
