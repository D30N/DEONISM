package com.facebook.ads.redexgen.X;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class A3 implements Comparable<A3> {
    public int A00;
    public long A01;

    @Nullable
    public Object A02;
    public final AS A03;

    public A3(AS as) {
        this.A03 = as;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull A3 a3) {
        A3 a32 = this;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 1;
        char c2 = a32.A02 == null ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    a3 = a3;
                    if (a3.A02 != null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z2 = true;
                    c2 = 5;
                    break;
                case 5:
                    if (z == z2) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    a32 = a32;
                    if (a32.A02 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    i2 = -1;
                    c2 = '\b';
                    break;
                case '\b':
                    return i2;
                case '\t':
                    z2 = false;
                    c2 = 5;
                    break;
                case '\n':
                    z = false;
                    c2 = 3;
                    break;
                case 11:
                    a32 = a32;
                    if (a32.A02 != null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    return 0;
                case '\r':
                    a32 = a32;
                    a3 = a3;
                    i = a32.A00 - a3.A00;
                    if (i == 0) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    return i;
                case 15:
                    return C0560Iy.A07(a32.A01, a3.A01);
            }
        }
    }

    public final void A01(int i, long j, Object obj) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}
