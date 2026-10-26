package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

/* loaded from: classes.dex */
public class k {
    private static final SparseIntArray a = new SparseIntArray(0);

    public static f0 a() {
        return new f0(0, b(), a);
    }

    private static int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return iMin > 16777216 ? (iMin / 4) * 3 : iMin / 2;
    }
}
