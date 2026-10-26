package b.o.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import b.g.e.b;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class h extends b.o.a.a.g {
    static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private C0044h f1041c;

    /* renamed from: d, reason: collision with root package name */
    private PorterDuffColorFilter f1042d;
    private ColorFilter e;
    private boolean f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    private static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f1046b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.a = b.g.e.b.d(string2);
            }
            this.f1047c = b.g.d.c.g.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // b.o.a.a.h.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (b.g.d.c.g.j(xmlPullParser, "pathData")) {
                TypedArray typedArrayK = b.g.d.c.g.k(resources, theme, attributeSet, b.o.a.a.a.f1032d);
                f(typedArrayK, xmlPullParser);
                typedArrayK.recycle();
            }
        }
    }

    private static class c extends f {
        private int[] e;
        b.g.d.c.b f;
        float g;
        b.g.d.c.b h;
        float i;
        float j;
        float k;
        float l;
        float m;
        Paint.Cap n;
        Paint.Join o;
        float p;

        c() {
            this.g = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
        }

        c(c cVar) {
            super(cVar);
            this.g = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.i = cVar.i;
            this.h = cVar.h;
            this.f1047c = cVar.f1047c;
            this.j = cVar.j;
            this.k = cVar.k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }

        private Paint.Cap e(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.e = null;
            if (b.g.d.c.g.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f1046b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.a = b.g.e.b.d(string2);
                }
                this.h = b.g.d.c.g.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.j = b.g.d.c.g.f(typedArray, xmlPullParser, "fillAlpha", 12, this.j);
                this.n = e(b.g.d.c.g.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
                this.o = f(b.g.d.c.g.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
                this.p = b.g.d.c.g.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
                this.f = b.g.d.c.g.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.i = b.g.d.c.g.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.i);
                this.g = b.g.d.c.g.f(typedArray, xmlPullParser, "strokeWidth", 4, this.g);
                this.l = b.g.d.c.g.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.l);
                this.m = b.g.d.c.g.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.m);
                this.k = b.g.d.c.g.f(typedArray, xmlPullParser, "trimPathStart", 5, this.k);
                this.f1047c = b.g.d.c.g.g(typedArray, xmlPullParser, "fillType", 13, this.f1047c);
            }
        }

        @Override // b.o.a.a.h.e
        public boolean a() {
            return this.h.i() || this.f.i();
        }

        @Override // b.o.a.a.h.e
        public boolean b(int[] iArr) {
            return this.f.j(iArr) | this.h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayK = b.g.d.c.g.k(resources, theme, attributeSet, b.o.a.a.a.f1031c);
            h(typedArrayK, xmlPullParser, theme);
            typedArrayK.recycle();
        }

        float getFillAlpha() {
            return this.j;
        }

        int getFillColor() {
            return this.h.e();
        }

        float getStrokeAlpha() {
            return this.i;
        }

        int getStrokeColor() {
            return this.f.e();
        }

        float getStrokeWidth() {
            return this.g;
        }

        float getTrimPathEnd() {
            return this.l;
        }

        float getTrimPathOffset() {
            return this.m;
        }

        float getTrimPathStart() {
            return this.k;
        }

        void setFillAlpha(float f) {
            this.j = f;
        }

        void setFillColor(int i) {
            this.h.k(i);
        }

        void setStrokeAlpha(float f) {
            this.i = f;
        }

        void setStrokeColor(int i) {
            this.f.k(i);
        }

        void setStrokeWidth(float f) {
            this.g = f;
        }

        void setTrimPathEnd(float f) {
            this.l = f;
        }

        void setTrimPathOffset(float f) {
            this.m = f;
        }

        void setTrimPathStart(float f) {
            this.k = f;
        }
    }

    private static class d extends e {
        final Matrix a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<e> f1043b;

        /* renamed from: c, reason: collision with root package name */
        float f1044c;

        /* renamed from: d, reason: collision with root package name */
        private float f1045d;
        private float e;
        private float f;
        private float g;
        private float h;
        private float i;
        final Matrix j;
        int k;
        private int[] l;
        private String m;

        public d() {
            super();
            this.a = new Matrix();
            this.f1043b = new ArrayList<>();
            this.f1044c = 0.0f;
            this.f1045d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
        }

        public d(d dVar, b.d.a<String, Object> aVar) {
            f bVar;
            super();
            this.a = new Matrix();
            this.f1043b = new ArrayList<>();
            this.f1044c = 0.0f;
            this.f1045d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
            this.f1044c = dVar.f1044c;
            this.f1045d = dVar.f1045d;
            this.e = dVar.e;
            this.f = dVar.f;
            this.g = dVar.g;
            this.h = dVar.h;
            this.i = dVar.i;
            this.l = dVar.l;
            String str = dVar.m;
            this.m = str;
            this.k = dVar.k;
            if (str != null) {
                aVar.put(str, this);
            }
            this.j.set(dVar.j);
            ArrayList<e> arrayList = dVar.f1043b;
            for (int i = 0; i < arrayList.size(); i++) {
                e eVar = arrayList.get(i);
                if (eVar instanceof d) {
                    this.f1043b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f1043b.add(bVar);
                    String str2 = bVar.f1046b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.j.reset();
            this.j.postTranslate(-this.f1045d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.f1044c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.f1045d, this.i + this.e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.f1044c = b.g.d.c.g.f(typedArray, xmlPullParser, "rotation", 5, this.f1044c);
            this.f1045d = typedArray.getFloat(1, this.f1045d);
            this.e = typedArray.getFloat(2, this.e);
            this.f = b.g.d.c.g.f(typedArray, xmlPullParser, "scaleX", 3, this.f);
            this.g = b.g.d.c.g.f(typedArray, xmlPullParser, "scaleY", 4, this.g);
            this.h = b.g.d.c.g.f(typedArray, xmlPullParser, "translateX", 6, this.h);
            this.i = b.g.d.c.g.f(typedArray, xmlPullParser, "translateY", 7, this.i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            d();
        }

        @Override // b.o.a.a.h.e
        public boolean a() {
            for (int i = 0; i < this.f1043b.size(); i++) {
                if (this.f1043b.get(i).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // b.o.a.a.h.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i = 0; i < this.f1043b.size(); i++) {
                zB |= this.f1043b.get(i).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayK = b.g.d.c.g.k(resources, theme, attributeSet, b.o.a.a.a.f1030b);
            e(typedArrayK, xmlPullParser);
            typedArrayK.recycle();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.f1045d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.f1044c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f) {
            if (f != this.f1045d) {
                this.f1045d = f;
                d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.e) {
                this.e = f;
                d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f1044c) {
                this.f1044c = f;
                d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.g) {
                this.g = f;
                d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.h) {
                this.h = f;
                d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.i) {
                this.i = f;
                d();
            }
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    private static abstract class f extends e {
        protected b.C0024b[] a;

        /* renamed from: b, reason: collision with root package name */
        String f1046b;

        /* renamed from: c, reason: collision with root package name */
        int f1047c;

        /* renamed from: d, reason: collision with root package name */
        int f1048d;

        public f() {
            super();
            this.a = null;
            this.f1047c = 0;
        }

        public f(f fVar) {
            super();
            this.a = null;
            this.f1047c = 0;
            this.f1046b = fVar.f1046b;
            this.f1048d = fVar.f1048d;
            this.a = b.g.e.b.f(fVar.a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            b.C0024b[] c0024bArr = this.a;
            if (c0024bArr != null) {
                b.C0024b.e(c0024bArr, path);
            }
        }

        public b.C0024b[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.f1046b;
        }

        public void setPathData(b.C0024b[] c0024bArr) {
            if (b.g.e.b.b(this.a, c0024bArr)) {
                b.g.e.b.j(this.a, c0024bArr);
            } else {
                this.a = b.g.e.b.f(c0024bArr);
            }
        }
    }

    private static class g {
        private static final Matrix q = new Matrix();
        private final Path a;

        /* renamed from: b, reason: collision with root package name */
        private final Path f1049b;

        /* renamed from: c, reason: collision with root package name */
        private final Matrix f1050c;

        /* renamed from: d, reason: collision with root package name */
        Paint f1051d;
        Paint e;
        private PathMeasure f;
        private int g;
        final d h;
        float i;
        float j;
        float k;
        float l;
        int m;
        String n;
        Boolean o;
        final b.d.a<String, Object> p;

        public g() {
            this.f1050c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new b.d.a<>();
            this.h = new d();
            this.a = new Path();
            this.f1049b = new Path();
        }

        public g(g gVar) {
            this.f1050c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            b.d.a<String, Object> aVar = new b.d.a<>();
            this.p = aVar;
            this.h = new d(gVar.h, aVar);
            this.a = new Path(gVar.a);
            this.f1049b = new Path(gVar.f1049b);
            this.i = gVar.i;
            this.j = gVar.j;
            this.k = gVar.k;
            this.l = gVar.l;
            this.g = gVar.g;
            this.m = gVar.m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                this.p.put(str, this);
            }
            this.o = gVar.o;
        }

        private static float a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.a.set(matrix);
            dVar.a.preConcat(dVar.j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f1043b.size(); i3++) {
                e eVar = dVar.f1043b.get(i3);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.k;
            float f2 = i2 / this.l;
            float fMin = Math.min(f, f2);
            Matrix matrix = dVar.a;
            this.f1050c.set(matrix);
            this.f1050c.postScale(f, f2);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            fVar.d(this.a);
            Path path = this.a;
            this.f1049b.reset();
            if (fVar.c()) {
                this.f1049b.setFillType(fVar.f1047c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f1049b.addPath(path, this.f1050c);
                canvas.clipPath(this.f1049b);
                return;
            }
            c cVar = (c) fVar;
            if (cVar.k != 0.0f || cVar.l != 1.0f) {
                float f3 = cVar.k;
                float f4 = cVar.m;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (cVar.l + f4) % 1.0f;
                if (this.f == null) {
                    this.f = new PathMeasure();
                }
                this.f.setPath(this.a, false);
                float length = this.f.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f.getSegment(f7, length, path, true);
                    this.f.getSegment(0.0f, f8, path, true);
                } else {
                    this.f.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f1049b.addPath(path, this.f1050c);
            if (cVar.h.l()) {
                b.g.d.c.b bVar = cVar.h;
                if (this.e == null) {
                    Paint paint = new Paint(1);
                    this.e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.e;
                if (bVar.h()) {
                    Shader shaderF = bVar.f();
                    shaderF.setLocalMatrix(this.f1050c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(h.a(bVar.e(), cVar.j));
                }
                paint2.setColorFilter(colorFilter);
                this.f1049b.setFillType(cVar.f1047c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f1049b, paint2);
            }
            if (cVar.f.l()) {
                b.g.d.c.b bVar2 = cVar.f;
                if (this.f1051d == null) {
                    Paint paint3 = new Paint(1);
                    this.f1051d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f1051d;
                Paint.Join join = cVar.o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.p);
                if (bVar2.h()) {
                    Shader shaderF2 = bVar2.f();
                    shaderF2.setLocalMatrix(this.f1050c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(h.a(bVar2.e(), cVar.i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.g * fMin * fE);
                canvas.drawPath(this.f1049b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c(this.h, q, canvas, i, i2, colorFilter);
        }

        public boolean f() {
            if (this.o == null) {
                this.o = Boolean.valueOf(this.h.a());
            }
            return this.o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.m = i;
        }
    }

    /* renamed from: b.o.a.a.h$h, reason: collision with other inner class name */
    private static class C0044h extends Drawable.ConstantState {
        int a;

        /* renamed from: b, reason: collision with root package name */
        g f1052b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f1053c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f1054d;
        boolean e;
        Bitmap f;
        ColorStateList g;
        PorterDuff.Mode h;
        int i;
        boolean j;
        boolean k;
        Paint l;

        public C0044h() {
            this.f1053c = null;
            this.f1054d = h.k;
            this.f1052b = new g();
        }

        public C0044h(C0044h c0044h) {
            this.f1053c = null;
            this.f1054d = h.k;
            if (c0044h != null) {
                this.a = c0044h.a;
                g gVar = new g(c0044h.f1052b);
                this.f1052b = gVar;
                if (c0044h.f1052b.e != null) {
                    gVar.e = new Paint(c0044h.f1052b.e);
                }
                if (c0044h.f1052b.f1051d != null) {
                    this.f1052b.f1051d = new Paint(c0044h.f1052b.f1051d);
                }
                this.f1053c = c0044h.f1053c;
                this.f1054d = c0044h.f1054d;
                this.e = c0044h.e;
            }
        }

        public boolean a(int i, int i2) {
            return i == this.f.getWidth() && i2 == this.f.getHeight();
        }

        public boolean b() {
            return !this.k && this.g == this.f1053c && this.h == this.f1054d && this.j == this.e && this.i == this.f1052b.getRootAlpha();
        }

        public void c(int i, int i2) {
            if (this.f == null || !a(i, i2)) {
                this.f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.l == null) {
                Paint paint = new Paint();
                this.l = paint;
                paint.setFilterBitmap(true);
            }
            this.l.setAlpha(this.f1052b.getRootAlpha());
            this.l.setColorFilter(colorFilter);
            return this.l;
        }

        public boolean f() {
            return this.f1052b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f1052b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f1052b.g(iArr);
            this.k |= zG;
            return zG;
        }

        public void i() {
            this.g = this.f1053c;
            this.h = this.f1054d;
            this.i = this.f1052b.getRootAlpha();
            this.j = this.e;
            this.k = false;
        }

        public void j(int i, int i2) {
            this.f.eraseColor(0);
            this.f1052b.b(new Canvas(this.f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }
    }

    private static class i extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public i(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f1040b = (VectorDrawable) this.a.newDrawable();
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f1040b = (VectorDrawable) this.a.newDrawable(resources);
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f1040b = (VectorDrawable) this.a.newDrawable(resources, theme);
            return hVar;
        }
    }

    h() {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f1041c = new C0044h();
    }

    h(C0044h c0044h) {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f1041c = c0044h;
        this.f1042d = j(this.f1042d, c0044h.f1053c, c0044h.f1054d);
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (Color.alpha(i2) * f2)) << 24);
    }

    public static h b(Resources resources, int i2, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            h hVar = new h();
            hVar.f1040b = b.g.d.c.f.a(resources, i2, theme);
            new i(hVar.f1040b.getConstantState());
            return hVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return c(resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    public static h c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i2;
        int i3;
        b bVar;
        C0044h c0044h = this.f1041c;
        g gVar = c0044h.f1052b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f1043b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    b bVar2 = new b();
                    bVar2.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f1043b.add(bVar2);
                    String pathName = bVar2.getPathName();
                    bVar = bVar2;
                    if (pathName != null) {
                        gVar.p.put(bVar2.getPathName(), bVar2);
                        bVar = bVar2;
                    }
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f1043b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.p.put(dVar2.getGroupName(), dVar2);
                    }
                    i2 = c0044h.a;
                    i3 = dVar2.k;
                    c0044h.a = i3 | i2;
                }
                i2 = c0044h.a;
                i3 = bVar.f1048d;
                c0044h.a = i3 | i2;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    private static PorterDuff.Mode g(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C0044h c0044h = this.f1041c;
        g gVar = c0044h.f1052b;
        c0044h.f1054d = g(b.g.d.c.g.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListC = b.g.d.c.g.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListC != null) {
            c0044h.f1053c = colorStateListC;
        }
        c0044h.e = b.g.d.c.g.a(typedArray, xmlPullParser, "autoMirrored", 5, c0044h.e);
        gVar.k = b.g.d.c.g.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.k);
        float f2 = b.g.d.c.g.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.l);
        gVar.l = f2;
        if (gVar.k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.i = typedArray.getDimension(3, gVar.i);
        float dimension = typedArray.getDimension(2, gVar.j);
        gVar.j = dimension;
        if (gVar.i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(b.g.d.c.g.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.n = string;
            gVar.p.put(string, gVar);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f1040b;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    Object d(String str) {
        return this.f1041c.f1052b.p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() <= 0 || this.j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.e;
        if (colorFilter == null) {
            colorFilter = this.f1042d;
        }
        canvas.getMatrix(this.i);
        this.i.getValues(this.h);
        float fAbs = Math.abs(this.h[0]);
        float fAbs2 = Math.abs(this.h[4]);
        float fAbs3 = Math.abs(this.h[1]);
        float fAbs4 = Math.abs(this.h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.j.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.j.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.j;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.j.offsetTo(0, 0);
        this.f1041c.c(iMin, iMin2);
        if (!this.g) {
            this.f1041c.j(iMin, iMin2);
        } else if (!this.f1041c.b()) {
            this.f1041c.j(iMin, iMin2);
            this.f1041c.i();
        }
        this.f1041c.d(canvas, colorFilter, this.j);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f1040b;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f1041c.f1052b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f1040b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1041c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f1040b;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f1040b != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f1040b.getConstantState());
        }
        this.f1041c.a = getChangingConfigurations();
        return this.f1041c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f1040b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f1041c.f1052b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f1040b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f1041c.f1052b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    void h(boolean z) {
        this.g = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0044h c0044h = this.f1041c;
        c0044h.f1052b = new g();
        TypedArray typedArrayK = b.g.d.c.g.k(resources, theme, attributeSet, b.o.a.a.a.a);
        i(typedArrayK, xmlPullParser, theme);
        typedArrayK.recycle();
        c0044h.a = getChangingConfigurations();
        c0044h.k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f1042d = j(this.f1042d, c0044h.f1053c, c0044h.f1054d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f1040b;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.f1041c.e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0044h c0044h;
        ColorStateList colorStateList;
        Drawable drawable = this.f1040b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((c0044h = this.f1041c) != null && (c0044h.g() || ((colorStateList = this.f1041c.f1053c) != null && colorStateList.isStateful())));
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f && super.mutate() == this) {
            this.f1041c = new C0044h(this.f1041c);
            this.f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C0044h c0044h = this.f1041c;
        ColorStateList colorStateList = c0044h.f1053c;
        if (colorStateList != null && (mode = c0044h.f1054d) != null) {
            this.f1042d = j(this.f1042d, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!c0044h.g() || !c0044h.h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f1041c.f1052b.getRootAlpha() != i2) {
            this.f1041c.f1052b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z);
        } else {
            this.f1041c.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        C0044h c0044h = this.f1041c;
        if (c0044h.f1053c != colorStateList) {
            c0044h.f1053c = colorStateList;
            this.f1042d = j(this.f1042d, colorStateList, c0044h.f1054d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        C0044h c0044h = this.f1041c;
        if (c0044h.f1054d != mode) {
            c0044h.f1054d = mode;
            this.f1042d = j(this.f1042d, c0044h.f1053c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f1040b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f1040b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
