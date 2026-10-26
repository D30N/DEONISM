package d.b.a.b.x;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import d.b.a.b.z.g;
import d.b.a.b.z.k;
import d.b.a.b.z.n;

/* loaded from: classes.dex */
public class a extends Drawable implements n, androidx.core.graphics.drawable.b {

    /* renamed from: b, reason: collision with root package name */
    private b f2985b;

    static final class b extends Drawable.ConstantState {
        g a;

        /* renamed from: b, reason: collision with root package name */
        boolean f2986b;

        public b(b bVar) {
            this.a = (g) bVar.a.getConstantState().newDrawable();
            this.f2986b = bVar.f2986b;
        }

        public b(g gVar) {
            this.a = gVar;
            this.f2986b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }
    }

    private a(b bVar) {
        this.f2985b = bVar;
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    public a a() {
        this.f2985b = new b(this.f2985b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f2985b;
        if (bVar.f2986b) {
            bVar.a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f2985b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f2985b.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable mutate() {
        a();
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2985b.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f2985b.a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zB = d.b.a.b.x.b.b(iArr);
        b bVar = this.f2985b;
        if (bVar.f2986b == zB) {
            return zOnStateChange;
        }
        bVar.f2986b = zB;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f2985b.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2985b.a.setColorFilter(colorFilter);
    }

    @Override // d.b.a.b.z.n
    public void setShapeAppearanceModel(k kVar) {
        this.f2985b.a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i) {
        this.f2985b.a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f2985b.a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2985b.a.setTintMode(mode);
    }
}
