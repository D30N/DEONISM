package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
final class f extends Drawable.ConstantState {
    int a;

    /* renamed from: b, reason: collision with root package name */
    Drawable.ConstantState f411b;

    /* renamed from: c, reason: collision with root package name */
    ColorStateList f412c;

    /* renamed from: d, reason: collision with root package name */
    PorterDuff.Mode f413d;

    f(f fVar) {
        this.f412c = null;
        this.f413d = d.h;
        if (fVar != null) {
            this.a = fVar.a;
            this.f411b = fVar.f411b;
            this.f412c = fVar.f412c;
            this.f413d = fVar.f413d;
        }
    }

    boolean a() {
        return this.f411b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.a;
        Drawable.ConstantState constantState = this.f411b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new e(this, resources) : new d(this, resources);
    }
}
