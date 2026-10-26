package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.support.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.An, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0364An {
    public static final C0364An A04 = new C0363Am().A00();
    public AudioAttributes A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C0364An(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    @TargetApi(21)
    public final AudioAttributes A00() {
        if (this.A00 == null) {
            this.A00 = new AudioAttributes.Builder().setContentType(this.A01).setFlags(this.A02).setUsage(this.A03).build();
        }
        return this.A00;
    }

    public final boolean equals(@Nullable Object obj) {
        C0364An c0364An = this;
        C0364An c0364An2 = null;
        boolean z = true;
        char c2 = c0364An == obj ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return z;
                case 3:
                    obj = obj;
                    if (obj == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0364An = c0364An;
                    obj = obj;
                    if (c0364An.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    c0364An = c0364An;
                    obj = obj;
                    c0364An2 = (C0364An) obj;
                    if (c0364An.A01 != c0364An2.A01) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0364An = c0364An;
                    c0364An2 = c0364An2;
                    if (c0364An.A02 != c0364An2.A02) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0364An = c0364An;
                    c0364An2 = c0364An2;
                    if (c0364An.A03 != c0364An2.A03) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return z;
                case '\n':
                    z = false;
                    c2 = '\t';
                    break;
            }
        }
    }

    public final int hashCode() {
        int i = ((17 * 31) + this.A01) * 31;
        int result = this.A02;
        return ((i + result) * 31) + this.A03;
    }
}
