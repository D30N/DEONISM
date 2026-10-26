package com.facebook.ads.redexgen.X;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class GN implements Comparable<GN> {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final int A02;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArrCopyOfRange = bArrCopyOfRange;
                    if (i4 >= bArrCopyOfRange.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArrCopyOfRange = bArrCopyOfRange;
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 59);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A03 = new byte[]{107};
    }

    public GN(int i, int i2, int i3) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NonNull GN gn) {
        GN gn2 = this;
        int i = gn2.A01 - gn.A01;
        char c2 = i == 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    gn2 = gn2;
                    gn = gn;
                    i = gn2.A00 - gn.A00;
                    if (i != 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    gn2 = gn2;
                    gn = gn;
                    i = gn2.A02 - gn.A02;
                    c2 = 4;
                    break;
                case 4:
                    return i;
            }
        }
    }

    public final boolean equals(@Nullable Object obj) {
        GN gn = this;
        GN gn2 = null;
        boolean z = true;
        char c2 = gn == obj ? (char) 2 : (char) 3;
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
                    gn = gn;
                    obj = obj;
                    if (gn.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    gn = gn;
                    obj = obj;
                    gn2 = (GN) obj;
                    if (gn.A01 != gn2.A01) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    gn = gn;
                    gn2 = gn2;
                    if (gn.A00 != gn2.A00) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    gn = gn;
                    gn2 = gn2;
                    if (gn.A02 != gn2.A02) {
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
        int i = ((this.A01 * 31) + this.A00) * 31;
        int result = this.A02;
        return i + result;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        String strA01 = A01(0, 1, 126);
        sb.append(strA01);
        sb.append(this.A00);
        sb.append(strA01);
        sb.append(this.A02);
        return sb.toString();
    }
}
