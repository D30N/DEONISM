package com.facebook.drawee.b.a;

import android.content.Context;
import com.facebook.drawee.view.SimpleDraweeView;
import d.a.e.e.i;
import d.a.e.e.k;
import d.a.e.e.l;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class c {
    private static final Class<?> a = c.class;

    /* renamed from: b, reason: collision with root package name */
    private static f f1133b = null;

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f1134c = false;

    private c() {
    }

    public static void a(Context context) {
        b(context, null, null);
    }

    public static void b(Context context, @Nullable i iVar, @Nullable b bVar) {
        c(context, iVar, bVar, true);
    }

    public static void c(Context context, @Nullable i iVar, @Nullable b bVar, boolean z) {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("Fresco#initialize");
        }
        if (f1134c) {
            d.a.b.e.a.u(a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            f1134c = true;
        }
        l.b(z);
        if (!com.facebook.soloader.o.a.b()) {
            if (d.a.e.m.b.d()) {
                d.a.e.m.b.a("Fresco.initialize->SoLoader.init");
            }
            try {
                try {
                    try {
                        try {
                            try {
                                Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context);
                            } catch (IllegalAccessException unused) {
                                com.facebook.soloader.o.a.a(new com.facebook.soloader.o.c());
                                if (d.a.e.m.b.d()) {
                                }
                            }
                        } catch (InvocationTargetException unused2) {
                            com.facebook.soloader.o.a.a(new com.facebook.soloader.o.c());
                            if (d.a.e.m.b.d()) {
                            }
                        }
                    } catch (ClassNotFoundException unused3) {
                        com.facebook.soloader.o.a.a(new com.facebook.soloader.o.c());
                        if (d.a.e.m.b.d()) {
                        }
                    }
                } catch (NoSuchMethodException unused4) {
                    com.facebook.soloader.o.a.a(new com.facebook.soloader.o.c());
                    if (d.a.e.m.b.d()) {
                    }
                }
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.b();
                }
            } catch (Throwable th) {
                if (d.a.e.m.b.d()) {
                    d.a.e.m.b.b();
                }
                throw th;
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (iVar == null) {
            k.t(applicationContext);
        } else {
            k.u(iVar);
        }
        d(applicationContext, bVar);
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
    }

    private static void d(Context context, @Nullable b bVar) {
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.a("Fresco.initializeDrawee");
        }
        f fVar = new f(context, bVar);
        f1133b = fVar;
        SimpleDraweeView.i(fVar);
        if (d.a.e.m.b.d()) {
            d.a.e.m.b.b();
        }
    }
}
