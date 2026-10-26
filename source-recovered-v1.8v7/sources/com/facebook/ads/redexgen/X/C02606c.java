package com.facebook.ads.redexgen.X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.6c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02606c<T> {
    public final int A00;
    public final int A01;
    public final T A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6c != com.facebook.ads.internal.botdetection.signals.model.BundledSignalMetadata<T> */
    public C02606c(T bundledSignalMetadataKey, int i, int i2) {
        this.A02 = bundledSignalMetadataKey;
        this.A00 = i;
        this.A01 = i2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6c != com.facebook.ads.internal.botdetection.signals.model.BundledSignalMetadata<T> */
    private boolean A00() {
        C02606c<T> c02606c = this;
        boolean z = false;
        int i = 0;
        int i2 = c02606c.A00;
        char c2 = i2 > 0 ? (char) 2 : '\b';
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= 9999) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c02606c = c02606c;
                    i = c02606c.A01;
                    if (i <= 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i >= 10000) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i2 >= i) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    z = true;
                    c2 = 7;
                    break;
                case 7:
                    return z;
                case '\b':
                    z = false;
                    c2 = 7;
                    break;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6c != com.facebook.ads.internal.botdetection.signals.model.BundledSignalMetadata<T> */
    public final T A01() {
        return this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6c != com.facebook.ads.internal.botdetection.signals.model.BundledSignalMetadata<T> */
    public final boolean A02() {
        C02606c<T> c02606c = this;
        boolean z = false;
        char c2 = c02606c.A00() ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c02606c = c02606c;
                    if (Build.VERSION.SDK_INT < c02606c.A00) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c02606c = c02606c;
                    if (Build.VERSION.SDK_INT >= c02606c.A01) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }
}
