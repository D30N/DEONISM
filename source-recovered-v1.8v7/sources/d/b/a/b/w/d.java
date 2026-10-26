package d.b.a.b.w;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import b.g.d.c.f;
import d.b.a.b.k;

/* loaded from: classes.dex */
public class d {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f2979b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2980c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2981d;
    public final String e;
    public final ColorStateList f;
    public final float g;
    public final float h;
    public final float i;
    private final int j;
    private boolean k = false;
    private Typeface l;

    class a extends f.a {
        final /* synthetic */ f a;

        a(f fVar) {
            this.a = fVar;
        }

        @Override // b.g.d.c.f.a
        public void c(int i) {
            d.this.k = true;
            this.a.a(i);
        }

        @Override // b.g.d.c.f.a
        public void d(Typeface typeface) {
            d dVar = d.this;
            dVar.l = Typeface.create(typeface, dVar.f2980c);
            d.this.k = true;
            this.a.b(d.this.l, false);
        }
    }

    class b extends f {
        final /* synthetic */ TextPaint a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f2983b;

        b(TextPaint textPaint, f fVar) {
            this.a = textPaint;
            this.f2983b = fVar;
        }

        @Override // d.b.a.b.w.f
        public void a(int i) {
            this.f2983b.a(i);
        }

        @Override // d.b.a.b.w.f
        public void b(Typeface typeface, boolean z) {
            d.this.k(this.a, typeface);
            this.f2983b.b(typeface, z);
        }
    }

    public d(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, k.TextAppearance);
        this.a = typedArrayObtainStyledAttributes.getDimension(k.TextAppearance_android_textSize, 0.0f);
        this.f2979b = c.a(context, typedArrayObtainStyledAttributes, k.TextAppearance_android_textColor);
        c.a(context, typedArrayObtainStyledAttributes, k.TextAppearance_android_textColorHint);
        c.a(context, typedArrayObtainStyledAttributes, k.TextAppearance_android_textColorLink);
        this.f2980c = typedArrayObtainStyledAttributes.getInt(k.TextAppearance_android_textStyle, 0);
        this.f2981d = typedArrayObtainStyledAttributes.getInt(k.TextAppearance_android_typeface, 1);
        int iE = c.e(typedArrayObtainStyledAttributes, k.TextAppearance_fontFamily, k.TextAppearance_android_fontFamily);
        this.j = typedArrayObtainStyledAttributes.getResourceId(iE, 0);
        this.e = typedArrayObtainStyledAttributes.getString(iE);
        typedArrayObtainStyledAttributes.getBoolean(k.TextAppearance_textAllCaps, false);
        this.f = c.a(context, typedArrayObtainStyledAttributes, k.TextAppearance_android_shadowColor);
        this.g = typedArrayObtainStyledAttributes.getFloat(k.TextAppearance_android_shadowDx, 0.0f);
        this.h = typedArrayObtainStyledAttributes.getFloat(k.TextAppearance_android_shadowDy, 0.0f);
        this.i = typedArrayObtainStyledAttributes.getFloat(k.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void d() {
        String str;
        if (this.l == null && (str = this.e) != null) {
            this.l = Typeface.create(str, this.f2980c);
        }
        if (this.l == null) {
            int i = this.f2981d;
            this.l = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.l = Typeface.create(this.l, this.f2980c);
        }
    }

    public Typeface e() {
        d();
        return this.l;
    }

    public Typeface f(Context context) {
        if (this.k) {
            return this.l;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceB = b.g.d.c.f.b(context, this.j);
                this.l = typefaceB;
                if (typefaceB != null) {
                    this.l = Typeface.create(typefaceB, this.f2980c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.e, e);
            }
        }
        d();
        this.k = true;
        return this.l;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        k(textPaint, e());
        h(context, new b(textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (e.a()) {
            f(context);
        } else {
            d();
        }
        if (this.j == 0) {
            this.k = true;
        }
        if (this.k) {
            fVar.b(this.l, true);
            return;
        }
        try {
            b.g.d.c.f.d(context, this.j, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.k = true;
            fVar.a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.e, e);
            this.k = true;
            fVar.a(-3);
        }
    }

    public void i(Context context, TextPaint textPaint, f fVar) {
        j(context, textPaint, fVar);
        ColorStateList colorStateList = this.f2979b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.i;
        float f2 = this.g;
        float f3 = this.h;
        ColorStateList colorStateList2 = this.f;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void j(Context context, TextPaint textPaint, f fVar) {
        if (e.a()) {
            k(textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void k(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ (-1)) & this.f2980c;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.a);
    }
}
