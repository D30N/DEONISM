package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CN {
    public final int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public CN(int i, byte[] bArr, int i2, int i3) {
        this.A01 = i;
        this.A03 = bArr;
        this.A02 = i2;
        this.A00 = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        CN cn = this;
        CN cn2 = null;
        boolean z = true;
        char c2 = cn == obj ? (char) 2 : (char) 3;
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
                    cn = cn;
                    obj = obj;
                    if (cn.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    cn = cn;
                    obj = obj;
                    cn2 = (CN) obj;
                    if (cn.A01 != cn2.A01) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    cn = cn;
                    cn2 = cn2;
                    if (cn.A02 != cn2.A02) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    cn = cn;
                    cn2 = cn2;
                    if (cn.A00 != cn2.A00) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    cn = cn;
                    cn2 = cn2;
                    if (!Arrays.equals(cn.A03, cn2.A03)) {
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
        int iHashCode = ((this.A01 * 31) + Arrays.hashCode(this.A03)) * 31;
        int result = this.A02;
        return ((iHashCode + result) * 31) + this.A00;
    }
}
