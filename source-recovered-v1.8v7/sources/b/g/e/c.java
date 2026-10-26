package b.g.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import b.g.d.c.c;
import b.g.d.c.f;
import b.g.i.b;

/* loaded from: classes.dex */
public class c {
    private static final h a;

    /* renamed from: b, reason: collision with root package name */
    private static final b.d.e<String, Typeface> f848b;

    static {
        int i = Build.VERSION.SDK_INT;
        a = i >= 28 ? new g() : i >= 26 ? new f() : (i < 24 || !e.m()) ? Build.VERSION.SDK_INT >= 21 ? new d() : new h() : new e();
        f848b = new b.d.e<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        Typeface typefaceG;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (typefaceG = g(context, typeface, i)) == null) ? Typeface.create(typeface, i) : typefaceG;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) {
        return a.c(context, cancellationSignal, fVarArr, i);
    }

    public static Typeface c(Context context, c.a aVar, Resources resources, int i, int i2, f.a aVar2, Handler handler, boolean z) throws NoSuchFieldException {
        Typeface typefaceB;
        if (aVar instanceof c.d) {
            c.d dVar = (c.d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.a() == 0) {
                z2 = true;
            }
            typefaceB = b.g.i.b.g(context, dVar.b(), aVar2, handler, z2, z ? dVar.c() : -1, i2);
        } else {
            typefaceB = a.b(context, (c.b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typefaceB != null) {
                    aVar2.b(typefaceB, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (typefaceB != null) {
            f848b.d(e(resources, i, i2), typefaceB);
        }
        return typefaceB;
    }

    public static Typeface d(Context context, Resources resources, int i, String str, int i2) {
        Typeface typefaceE = a.e(context, resources, i, str, i2);
        if (typefaceE != null) {
            f848b.d(e(resources, i, i2), typefaceE);
        }
        return typefaceE;
    }

    private static String e(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    public static Typeface f(Resources resources, int i, int i2) {
        return f848b.c(e(resources, i, i2));
    }

    private static Typeface g(Context context, Typeface typeface, int i) throws NoSuchFieldException {
        c.b bVarI = a.i(typeface);
        if (bVarI == null) {
            return null;
        }
        return a.b(context, bVarI, context.getResources(), i);
    }
}
