package com.google.android.gms.common.util;

/* loaded from: classes.dex */
public final class b {
    public static <T> boolean a(T[] tArr, T t) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (com.google.android.gms.common.internal.p.a(tArr[i], t)) {
                break;
            }
            i++;
        }
        return i >= 0;
    }
}
