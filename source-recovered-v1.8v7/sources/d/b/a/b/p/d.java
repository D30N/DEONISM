package d.b.a.b.p;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* loaded from: classes.dex */
public interface d {

    public static class b implements TypeEvaluator<e> {

        /* renamed from: b, reason: collision with root package name */
        public static final TypeEvaluator<e> f2971b = new b();
        private final e a = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f, e eVar, e eVar2) {
            this.a.a(d.b.a.b.u.a.c(eVar.a, eVar2.a, f), d.b.a.b.u.a.c(eVar.f2972b, eVar2.f2972b, f), d.b.a.b.u.a.c(eVar.f2973c, eVar2.f2973c, f));
            return this.a;
        }
    }

    public static class c extends Property<d, e> {
        public static final Property<d, e> a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: d.b.a.b.p.d$d, reason: collision with other inner class name */
    public static class C0101d extends Property<d, Integer> {
        public static final Property<d, Integer> a = new C0101d("circularRevealScrimColor");

        private C0101d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {
        public float a;

        /* renamed from: b, reason: collision with root package name */
        public float f2972b;

        /* renamed from: c, reason: collision with root package name */
        public float f2973c;

        private e() {
        }

        public e(float f, float f2, float f3) {
            this.a = f;
            this.f2972b = f2;
            this.f2973c = f3;
        }

        public void a(float f, float f2, float f3) {
            this.a = f;
            this.f2972b = f2;
            this.f2973c = f3;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
