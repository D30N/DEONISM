package d.b.a.b.z;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class m {

    @Deprecated
    public float a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f3011b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f3012c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f3013d;

    @Deprecated
    public float e;

    @Deprecated
    public float f;
    private final List<f> g = new ArrayList();
    private final List<g> h = new ArrayList();

    class a extends g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f3014b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Matrix f3015c;

        a(m mVar, List list, Matrix matrix) {
            this.f3014b = list;
            this.f3015c = matrix;
        }

        @Override // d.b.a.b.z.m.g
        public void a(Matrix matrix, d.b.a.b.y.a aVar, int i, Canvas canvas) {
            Iterator it = this.f3014b.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f3015c, aVar, i, canvas);
            }
        }
    }

    static class b extends g {

        /* renamed from: b, reason: collision with root package name */
        private final d f3016b;

        public b(d dVar) {
            this.f3016b = dVar;
        }

        @Override // d.b.a.b.z.m.g
        public void a(Matrix matrix, d.b.a.b.y.a aVar, int i, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f3016b.k(), this.f3016b.o(), this.f3016b.l(), this.f3016b.j()), i, this.f3016b.m(), this.f3016b.n());
        }
    }

    static class c extends g {

        /* renamed from: b, reason: collision with root package name */
        private final e f3017b;

        /* renamed from: c, reason: collision with root package name */
        private final float f3018c;

        /* renamed from: d, reason: collision with root package name */
        private final float f3019d;

        public c(e eVar, float f, float f2) {
            this.f3017b = eVar;
            this.f3018c = f;
            this.f3019d = f2;
        }

        @Override // d.b.a.b.z.m.g
        public void a(Matrix matrix, d.b.a.b.y.a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f3017b.f3024c - this.f3019d, this.f3017b.f3023b - this.f3018c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f3018c, this.f3019d);
            matrix2.preRotate(c());
            aVar.b(canvas, matrix2, rectF, i);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f3017b.f3024c - this.f3019d) / (this.f3017b.f3023b - this.f3018c)));
        }
    }

    public static class d extends f {
        private static final RectF h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f3020b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f3021c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f3022d;

        @Deprecated
        public float e;

        @Deprecated
        public float f;

        @Deprecated
        public float g;

        public d(float f, float f2, float f3, float f4) {
            q(f);
            u(f2);
            r(f3);
            p(f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f3020b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f3022d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f3021c;
        }

        private void p(float f) {
            this.e = f;
        }

        private void q(float f) {
            this.f3020b = f;
        }

        private void r(float f) {
            this.f3022d = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f) {
            this.f = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f) {
            this.g = f;
        }

        private void u(float f) {
            this.f3021c = f;
        }

        @Override // d.b.a.b.z.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            h.set(k(), o(), l(), j());
            path.arcTo(h, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class e extends f {

        /* renamed from: b, reason: collision with root package name */
        private float f3023b;

        /* renamed from: c, reason: collision with root package name */
        private float f3024c;

        @Override // d.b.a.b.z.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f3023b, this.f3024c);
            path.transform(matrix);
        }
    }

    public static abstract class f {
        protected final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    static abstract class g {
        static final Matrix a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, d.b.a.b.y.a aVar, int i, Canvas canvas);

        public final void b(d.b.a.b.y.a aVar, int i, Canvas canvas) {
            a(a, aVar, i, canvas);
        }
    }

    public m() {
        m(0.0f, 0.0f);
    }

    private void b(float f2) {
        if (f() == f2) {
            return;
        }
        float f3 = ((f2 - f()) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        d dVar = new d(h(), i(), h(), i());
        dVar.s(f());
        dVar.t(f3);
        this.h.add(new b(dVar));
        o(f2);
    }

    private void c(g gVar, float f2, float f3) {
        b(f2);
        this.h.add(gVar);
        o(f3);
    }

    private float f() {
        return this.e;
    }

    private float g() {
        return this.f;
    }

    private void o(float f2) {
        this.e = f2;
    }

    private void p(float f2) {
        this.f = f2;
    }

    private void q(float f2) {
        this.f3012c = f2;
    }

    private void r(float f2) {
        this.f3013d = f2;
    }

    private void s(float f2) {
        this.a = f2;
    }

    private void t(float f2) {
        this.f3011b = f2;
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        d dVar = new d(f2, f3, f4, f5);
        dVar.s(f6);
        dVar.t(f7);
        this.g.add(dVar);
        b bVar = new b(dVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        c(bVar, f6, z ? (180.0f + f8) % 360.0f : f8);
        double d2 = f8;
        q(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        r(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.g.get(i).a(matrix, path);
        }
    }

    g e(Matrix matrix) {
        b(g());
        return new a(this, new ArrayList(this.h), matrix);
    }

    float h() {
        return this.f3012c;
    }

    float i() {
        return this.f3013d;
    }

    float j() {
        return this.a;
    }

    float k() {
        return this.f3011b;
    }

    public void l(float f2, float f3) {
        e eVar = new e();
        eVar.f3023b = f2;
        eVar.f3024c = f3;
        this.g.add(eVar);
        c cVar = new c(eVar, h(), i());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        q(f2);
        r(f3);
    }

    public void m(float f2, float f3) {
        n(f2, f3, 270.0f, 0.0f);
    }

    public void n(float f2, float f3, float f4, float f5) {
        s(f2);
        t(f3);
        q(f2);
        r(f3);
        o(f4);
        p((f4 + f5) % 360.0f);
        this.g.clear();
        this.h.clear();
    }
}
