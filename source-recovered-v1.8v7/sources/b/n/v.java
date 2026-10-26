package b.n;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* loaded from: classes.dex */
class v implements w {
    private final ViewGroupOverlay a;

    v(ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    @Override // b.n.w
    public void a(View view) {
        this.a.add(view);
    }

    @Override // b.n.b0
    public void b(Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // b.n.w
    public void c(View view) {
        this.a.remove(view);
    }

    @Override // b.n.b0
    public void d(Drawable drawable) {
        this.a.remove(drawable);
    }
}
