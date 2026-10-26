package com.google.android.gms.common.util;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class s {
    public static int a(int i) {
        if (i == -1) {
            return -1;
        }
        return i / AdError.NETWORK_ERROR_CODE;
    }
}
