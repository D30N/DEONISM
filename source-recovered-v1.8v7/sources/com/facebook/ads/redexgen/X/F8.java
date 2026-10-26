package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class F8 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;

    public F8(int i) {
        this(i, -1L);
    }

    public F8(int i, int i2, int i3, long j) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = j;
    }

    public F8(int i, long j) {
        this(i, -1, -1, j);
    }

    public final F8 A00(int i) {
        return this.A02 == i ? this : new F8(i, this.A00, this.A01, this.A03);
    }

    public final boolean A01() {
        boolean z = false;
        char c2 = this.A00 != -1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public final boolean equals(@Nullable Object obj) {
        F8 f8 = this;
        F8 f82 = null;
        boolean z = true;
        char c2 = f8 == obj ? (char) 2 : (char) 3;
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
                    f8 = f8;
                    obj = obj;
                    if (f8.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    f8 = f8;
                    obj = obj;
                    f82 = (F8) obj;
                    if (f8.A02 != f82.A02) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    f8 = f8;
                    f82 = f82;
                    if (f8.A00 != f82.A00) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    f8 = f8;
                    f82 = f82;
                    if (f8.A01 != f82.A01) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    f8 = f8;
                    f82 = f82;
                    if (f8.A03 != f82.A03) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    return z;
                case 11:
                    z = false;
                    c2 = '\n';
                    break;
            }
        }
    }

    public final int hashCode() {
        int i = ((17 * 31) + this.A02) * 31;
        int result = this.A00;
        int i2 = (((i + result) * 31) + this.A01) * 31;
        int result2 = (int) this.A03;
        return i2 + result2;
    }
}
