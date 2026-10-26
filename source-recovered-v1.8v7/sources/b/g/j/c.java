package b.g.j;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public class c implements Spannable {

    /* renamed from: b, reason: collision with root package name */
    private final Spannable f890b;

    /* renamed from: c, reason: collision with root package name */
    private final a f891c;

    public static final class a {
        private final TextPaint a;

        /* renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f892b;

        /* renamed from: c, reason: collision with root package name */
        private final int f893c;

        /* renamed from: d, reason: collision with root package name */
        private final int f894d;
        final PrecomputedText.Params e = null;

        /* renamed from: b.g.j.c$a$a, reason: collision with other inner class name */
        public static class C0028a {
            private final TextPaint a;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f895b;

            /* renamed from: c, reason: collision with root package name */
            private int f896c;

            /* renamed from: d, reason: collision with root package name */
            private int f897d;

            public C0028a(TextPaint textPaint) {
                this.a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f896c = 1;
                    this.f897d = 1;
                } else {
                    this.f897d = 0;
                    this.f896c = 0;
                }
                this.f895b = Build.VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            public a a() {
                return new a(this.a, this.f895b, this.f896c, this.f897d);
            }

            public C0028a b(int i) {
                this.f896c = i;
                return this;
            }

            public C0028a c(int i) {
                this.f897d = i;
                return this;
            }

            public C0028a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f895b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.a = params.getTextPaint();
            this.f892b = params.getTextDirection();
            this.f893c = params.getBreakStrategy();
            this.f894d = params.getHyphenationFrequency();
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.a = textPaint;
            this.f892b = textDirectionHeuristic;
            this.f893c = i;
            this.f894d = i2;
        }

        public boolean a(a aVar) {
            PrecomputedText.Params params = this.e;
            if (params != null) {
                return params.equals(aVar.e);
            }
            if ((Build.VERSION.SDK_INT >= 23 && (this.f893c != aVar.b() || this.f894d != aVar.c())) || this.a.getTextSize() != aVar.e().getTextSize() || this.a.getTextScaleX() != aVar.e().getTextScaleX() || this.a.getTextSkewX() != aVar.e().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) || this.a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            return this.a.getTypeface() == null ? aVar.e().getTypeface() == null : this.a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f893c;
        }

        public int c() {
            return this.f894d;
        }

        public TextDirectionHeuristic d() {
            return this.f892b;
        }

        public TextPaint e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (a(aVar)) {
                return Build.VERSION.SDK_INT < 18 || this.f892b == aVar.d();
            }
            return false;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return b.g.k.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.f892b, Integer.valueOf(this.f893c), Integer.valueOf(this.f894d));
            }
            if (i >= 21) {
                return b.g.k.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.f892b, Integer.valueOf(this.f893c), Integer.valueOf(this.f894d));
            }
            if (i < 18 && i < 17) {
                return b.g.k.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTypeface(), this.f892b, Integer.valueOf(this.f893c), Integer.valueOf(this.f894d));
            }
            return b.g.k.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.f892b, Integer.valueOf(this.f893c), Integer.valueOf(this.f894d));
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00e3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 329
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b.g.j.c.a.toString():java.lang.String");
        }
    }

    public a a() {
        return this.f891c;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f890b.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f890b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f890b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f890b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.f890b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f890b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f890b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        this.f890b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        this.f890b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f890b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f890b.toString();
    }
}
