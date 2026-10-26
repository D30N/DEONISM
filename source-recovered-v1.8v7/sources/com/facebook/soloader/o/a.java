package com.facebook.soloader.o;

/* loaded from: classes.dex */
public class a {
    private static b a;

    private a() {
    }

    public static synchronized void a(b bVar) {
        if (a != null) {
            throw new IllegalStateException("Cannot re-initialize NativeLoader.");
        }
        a = bVar;
    }

    public static synchronized boolean b() {
        return a != null;
    }

    public static boolean c(String str) {
        synchronized (a.class) {
            if (a == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return a.a(str);
    }
}
