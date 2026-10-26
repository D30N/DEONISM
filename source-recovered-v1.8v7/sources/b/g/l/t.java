package b.g.l;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class t {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(b.g.b.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && r.B(viewGroup) == null) ? false : true;
    }
}
