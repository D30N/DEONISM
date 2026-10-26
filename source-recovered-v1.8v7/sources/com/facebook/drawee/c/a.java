package com.facebook.drawee.c;

import android.os.Looper;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class a {
    private static boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private static a f1154b;

    /* renamed from: com.facebook.drawee.c.a$a, reason: collision with other inner class name */
    public interface InterfaceC0049a {
        void a();
    }

    public static synchronized a b() {
        if (f1154b == null) {
            f1154b = a ? new b() : new c();
        }
        return f1154b;
    }

    static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public abstract void a(InterfaceC0049a interfaceC0049a);

    public abstract void d(InterfaceC0049a interfaceC0049a);
}
