package d.a.e.b;

import android.os.Build;
import com.facebook.imagepipeline.memory.e0;

/* loaded from: classes.dex */
public class g {
    public static f a(e0 e0Var, com.facebook.imagepipeline.platform.d dVar, d.a.e.e.a aVar) {
        int i = Build.VERSION.SDK_INT;
        return i >= 21 ? new a(e0Var.b(), aVar) : i >= 11 ? new e(new b(e0Var.h()), dVar, aVar) : new c();
    }
}
