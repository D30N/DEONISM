package b.n;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* loaded from: classes.dex */
class a0 implements b0 {
    private final ViewOverlay a;

    a0(View view) {
        this.a = view.getOverlay();
    }

    @Override // b.n.b0
    public void b(Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // b.n.b0
    public void d(Drawable drawable) {
        this.a.remove(drawable);
    }
}
