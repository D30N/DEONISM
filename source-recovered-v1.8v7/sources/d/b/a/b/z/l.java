package d.b.a.b.z;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes.dex */
public class l {
    private final m[] a = new m[4];

    /* renamed from: b, reason: collision with root package name */
    private final Matrix[] f3005b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix[] f3006c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    private final PointF f3007d = new PointF();
    private final m e = new m();
    private final float[] f = new float[2];
    private final float[] g = new float[2];

    public interface a {
        void a(m mVar, Matrix matrix, int i);

        void b(m mVar, Matrix matrix, int i);
    }

    static final class b {
        public final k a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f3008b;

        /* renamed from: c, reason: collision with root package name */
        public final RectF f3009c;

        /* renamed from: d, reason: collision with root package name */
        public final a f3010d;
        public final float e;

        b(k kVar, float f, RectF rectF, a aVar, Path path) {
            this.f3010d = aVar;
            this.a = kVar;
            this.e = f;
            this.f3009c = rectF;
            this.f3008b = path;
        }
    }

    public l() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new m();
            this.f3005b[i] = new Matrix();
            this.f3006c[i] = new Matrix();
        }
    }

    private float a(int i) {
        return (i + 1) * 90;
    }

    private void b(b bVar, int i) {
        this.f[0] = this.a[i].j();
        this.f[1] = this.a[i].k();
        this.f3005b[i].mapPoints(this.f);
        Path path = bVar.f3008b;
        float[] fArr = this.f;
        if (i == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.a[i].d(this.f3005b[i], bVar.f3008b);
        a aVar = bVar.f3010d;
        if (aVar != null) {
            aVar.b(this.a[i], this.f3005b[i], i);
        }
    }

    private void c(b bVar, int i) {
        int i2 = (i + 1) % 4;
        this.f[0] = this.a[i].h();
        this.f[1] = this.a[i].i();
        this.f3005b[i].mapPoints(this.f);
        this.g[0] = this.a[i2].j();
        this.g[1] = this.a[i2].k();
        this.f3005b[i2].mapPoints(this.g);
        float f = this.f[0];
        float[] fArr = this.g;
        float fMax = Math.max(((float) Math.hypot(f - fArr[0], r0[1] - fArr[1])) - 0.001f, 0.0f);
        float fI = i(bVar.f3009c, i);
        this.e.m(0.0f, 0.0f);
        j(i, bVar.a).b(fMax, fI, bVar.e, this.e);
        this.e.d(this.f3006c[i], bVar.f3008b);
        a aVar = bVar.f3010d;
        if (aVar != null) {
            aVar.a(this.e, this.f3006c[i], i);
        }
    }

    private void f(int i, RectF rectF, PointF pointF) {
        float f;
        float f2;
        if (i == 1) {
            f = rectF.right;
        } else {
            if (i != 2) {
                f = i != 3 ? rectF.right : rectF.left;
                f2 = rectF.top;
                pointF.set(f, f2);
            }
            f = rectF.left;
        }
        f2 = rectF.bottom;
        pointF.set(f, f2);
    }

    private c g(int i, k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.t() : kVar.r() : kVar.j() : kVar.l();
    }

    private d h(int i, k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.s() : kVar.q() : kVar.i() : kVar.k();
    }

    private float i(RectF rectF, int i) {
        float fCenterX;
        float f;
        float[] fArr = this.f;
        m[] mVarArr = this.a;
        fArr[0] = mVarArr[i].f3012c;
        fArr[1] = mVarArr[i].f3013d;
        this.f3005b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            fCenterX = rectF.centerX();
            f = this.f[0];
        } else {
            fCenterX = rectF.centerY();
            f = this.f[1];
        }
        return Math.abs(fCenterX - f);
    }

    private f j(int i, k kVar) {
        return i != 1 ? i != 2 ? i != 3 ? kVar.o() : kVar.p() : kVar.n() : kVar.h();
    }

    private void k(b bVar, int i) {
        h(i, bVar.a).b(this.a[i], 90.0f, bVar.e, bVar.f3009c, g(i, bVar.a));
        float fA = a(i);
        this.f3005b[i].reset();
        f(i, bVar.f3009c, this.f3007d);
        Matrix matrix = this.f3005b[i];
        PointF pointF = this.f3007d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f3005b[i].preRotate(fA);
    }

    private void l(int i) {
        this.f[0] = this.a[i].h();
        this.f[1] = this.a[i].i();
        this.f3005b[i].mapPoints(this.f);
        float fA = a(i);
        this.f3006c[i].reset();
        Matrix matrix = this.f3006c[i];
        float[] fArr = this.f;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f3006c[i].preRotate(fA);
    }

    public void d(k kVar, float f, RectF rectF, Path path) {
        e(kVar, f, rectF, null, path);
    }

    public void e(k kVar, float f, RectF rectF, a aVar, Path path) {
        path.rewind();
        b bVar = new b(kVar, f, rectF, aVar, path);
        for (int i = 0; i < 4; i++) {
            k(bVar, i);
            l(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            b(bVar, i2);
            c(bVar, i2);
        }
        path.close();
    }
}
