package com.facebook.imagepipeline.nativecode;

import android.os.Build;

/* loaded from: classes.dex */
public class d {
    private static boolean a;

    public static synchronized void a() {
        if (!a) {
            if (Build.VERSION.SDK_INT <= 16) {
                try {
                    com.facebook.soloader.o.a.c("fb_jpegturbo");
                } catch (UnsatisfiedLinkError unused) {
                }
            }
            com.facebook.soloader.o.a.c("native-imagetranscoder");
            a = true;
        }
    }
}
