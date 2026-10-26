package b.n;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public class l {
    private ViewGroup a;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f1003b;

    public static l b(ViewGroup viewGroup) {
        return (l) viewGroup.getTag(j.transition_current_scene);
    }

    static void c(ViewGroup viewGroup, l lVar) {
        viewGroup.setTag(j.transition_current_scene, lVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.a) != this || (runnable = this.f1003b) == null) {
            return;
        }
        runnable.run();
    }
}
