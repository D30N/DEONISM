package com.facebook.drawee.f;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class p {

    public static abstract class a implements b {
        @Override // com.facebook.drawee.f.p.b
        public Matrix a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            b(matrix, rect, i, i2, f, f2, rect.width() / i, rect.height() / i2);
            return matrix;
        }

        public abstract void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);
    }

    public interface b {
        public static final b a = k.j;

        /* renamed from: b, reason: collision with root package name */
        public static final b f1206b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f1207c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f1208d;
        public static final b e;
        public static final b f;
        public static final b g;
        public static final b h;
        public static final b i;

        static {
            b bVar = j.j;
            b bVar2 = l.j;
            f1206b = i.j;
            f1207c = g.j;
            f1208d = h.j;
            e = c.j;
            f = e.j;
            g = d.j;
            h = m.j;
            i = f.j;
        }

        Matrix a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3);
    }

    private static class c extends a {
        public static final b j = new c();

        private c() {
        }

        @Override // com.facebook.drawee.f.p.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setTranslate((int) (rect.left + ((rect.width() - i) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i2) * 0.5f) + 0.5f));
        }

        public String toString() {
            return "center";
        }
    }

    private static class d extends a {
        public static final b j = new d();

        private d() {
        }

        @Override // com.facebook.drawee.f.p.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float fHeight;
            float fWidth;
            if (f4 > f3) {
                fWidth = rect.left + ((rect.width() - (i * f4)) * 0.5f);
                fHeight = rect.top;
                f3 = f4;
            } else {
                float f5 = rect.left;
                fHeight = ((rect.height() - (i2 * f3)) * 0.5f) + rect.top;
                fWidth = f5;
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
        }

        public String toString() {
            return "center_crop";
        }
    }

    private static class e extends a {
        public static final b j = new e();

        private e() {
        }

        @Override // com.facebook.drawee.f.p.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float fMin = Math.min(Math.min(f3, f4), 1.0f);
            float fWidth = rect.left + ((rect.width() - (i * fMin)) * 0.5f);
            float fHeight = rect.top + ((rect.height() - (i2 * fMin)) * 0.5f);
            matrix.setScale(fMin, fMin);
            matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
        }

        public String toString() {
            return "center_inside";
        }
    }

    private static class f extends a {
        public static final b j = new f();

        private f() {
        }

        @Override // com.facebook.drawee.f.p.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float fMin = Math.min(f3, f4);
            float f5 = rect.left;
            float fHeight = rect.top + (rect.height() - (i2 * fMin));
            matrix.setScale(fMin, fMin);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (fHeight + 0.5f));
        }

        public String toString() {
            return "fit_bottom_start";
        }
    }

    private static class g extends a {
        public static final b j = new g();

        private g() {
        }

        @Override // com.facebook.drawee.f.p.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float fMin = Math.min(f3, f4);
            float fWidth = rect.left + ((rect.width() - (i * fMin)) * 0.5f);
            float fHeight = rect.top + ((rect.height() - (i2 * fMin)) * 0.5f);
            matrix.setScale(fMin, fMin);
            matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
        }

        public String toString() {
            return "fit_center";
        }
    }

    private static class h extends a {
        public static final b j = new h();

        private h() {
        }

        @Override // com.facebook.drawee.f.p.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float fMin = Math.min(f3, f4);
            float fWidth = rect.left + (rect.width() - (i * fMin));
            float fHeight = rect.top + (rect.height() - (i2 * fMin));
            matrix.setScale(fMin, fMin);
            matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
        }

        public String toString() {
            return "fit_end";
        }
    }

    private static class i extends a {
        public static final b j = new i();

        private i() {
        }

        @Override // com.facebook.drawee.f.p.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float fMin = Math.min(f3, f4);
            float f5 = rect.left;
            float f6 = rect.top;
            matrix.setScale(fMin, fMin);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (f6 + 0.5f));
        }

        public String toString() {
            return "fit_start";
        }
    }

    private static class j extends a {
        public static final b j = new j();

        private j() {
        }

        @Override // com.facebook.drawee.f.p.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5 = rect.left;
            float fHeight = rect.top + ((rect.height() - (i2 * f3)) * 0.5f);
            matrix.setScale(f3, f3);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (fHeight + 0.5f));
        }

        public String toString() {
            return "fit_x";
        }
    }

    private static class k extends a {
        public static final b j = new k();

        private k() {
        }

        @Override // com.facebook.drawee.f.p.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5 = rect.left;
            float f6 = rect.top;
            matrix.setScale(f3, f4);
            matrix.postTranslate((int) (f5 + 0.5f), (int) (f6 + 0.5f));
        }

        public String toString() {
            return "fit_xy";
        }
    }

    private static class l extends a {
        public static final b j = new l();

        private l() {
        }

        @Override // com.facebook.drawee.f.p.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float fWidth = rect.left + ((rect.width() - (i * f4)) * 0.5f);
            float f5 = rect.top;
            matrix.setScale(f4, f4);
            matrix.postTranslate((int) (fWidth + 0.5f), (int) (f5 + 0.5f));
        }

        public String toString() {
            return "fit_y";
        }
    }

    private static class m extends a {
        public static final b j = new m();

        private m() {
        }

        @Override // com.facebook.drawee.f.p.a
        public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float fMax;
            float fMax2;
            if (f4 > f3) {
                float f5 = i * f4;
                fMax = rect.left + Math.max(Math.min((rect.width() * 0.5f) - (f * f5), 0.0f), rect.width() - f5);
                fMax2 = rect.top;
                f3 = f4;
            } else {
                fMax = rect.left;
                float f6 = i2 * f3;
                fMax2 = Math.max(Math.min((rect.height() * 0.5f) - (f2 * f6), 0.0f), rect.height() - f6) + rect.top;
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((int) (fMax + 0.5f), (int) (fMax2 + 0.5f));
        }

        public String toString() {
            return "focus_crop";
        }
    }

    public interface n {
        Object getState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static o a(@Nullable Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof o) {
            return (o) drawable;
        }
        if (drawable instanceof com.facebook.drawee.f.c) {
            return a(((com.facebook.drawee.f.c) drawable).g());
        }
        if (drawable instanceof com.facebook.drawee.f.a) {
            com.facebook.drawee.f.a aVar = (com.facebook.drawee.f.a) drawable;
            int iB = aVar.b();
            for (int i2 = 0; i2 < iB; i2++) {
                o oVarA = a(aVar.a(i2));
                if (oVarA != null) {
                    return oVarA;
                }
            }
        }
        return null;
    }
}
