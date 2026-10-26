package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.ThreadSafe;

/* loaded from: classes.dex */
public class d {
    public static final int a = b();

    /* renamed from: b, reason: collision with root package name */
    private static int f1262b = 384;

    /* renamed from: c, reason: collision with root package name */
    private static volatile c f1263c;

    @ThreadSafe
    public static c a() {
        if (f1263c == null) {
            synchronized (d.class) {
                if (f1263c == null) {
                    f1263c = new c(f1262b, a);
                }
            }
        }
        return f1263c;
    }

    private static int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return ((long) iMin) > 16777216 ? (iMin / 4) * 3 : iMin / 2;
    }
}
