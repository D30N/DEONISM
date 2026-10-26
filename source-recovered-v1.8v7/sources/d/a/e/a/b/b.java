package d.a.e.a.b;

import d.a.e.b.f;
import d.a.e.c.h;

/* loaded from: classes.dex */
public class b {
    private static boolean a;

    /* renamed from: b, reason: collision with root package name */
    private static a f2451b;

    public static a a(f fVar, d.a.e.e.f fVar2, h<d.a.a.a.d, d.a.e.j.c> hVar, boolean z) {
        if (!a) {
            try {
                f2451b = (a) Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(f.class, d.a.e.e.f.class, h.class, Boolean.TYPE).newInstance(fVar, fVar2, hVar, Boolean.valueOf(z));
            } catch (Throwable unused) {
            }
            if (f2451b != null) {
                a = true;
            }
        }
        return f2451b;
    }
}
