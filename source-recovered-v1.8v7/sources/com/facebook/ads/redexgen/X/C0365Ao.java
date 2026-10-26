package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.Nullable;
import java.util.Arrays;

@TargetApi(21)
/* renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0365Ao {
    public static byte[] A02;
    public static final C0365Ao A03;
    public final int A00;
    public final int[] A01;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 13);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A02 = new byte[]{95, 95, 107, 122, 119, 113, 93, Byte.MAX_VALUE, 110, Byte.MAX_VALUE, 124, 119, 114, 119, 106, 119, 123, 109, 69, 115, Byte.MAX_VALUE, 102, 93, 118, Byte.MAX_VALUE, 112, 112, 123, 114, 93, 113, 107, 112, 106, 35, 6, 9, 3, 21, 8, 14, 3, 73, 10, 2, 3, 14, 6, 73, 2, 31, 19, 21, 6, 73, 38, 50, 35, 46, 40, 56, 55, 43, 50, 32, 56, 52, 51, 38, 51, 34, 107, 100, 110, 120, 101, 99, 110, 36, 103, 111, 110, 99, 107, 36, 111, 114, 126, 120, 107, 36, 71, 75, 82, 85, 73, 66, 75, 68, 68, 79, 70, 85, 73, 69, 95, 68, 94, 2, 14, 93, 91, 94, 94, 65, 92, 90, 75, 74, 107, 64, 77, 65, 74, 71, 64, 73, 93, 19, 35, 44, 38, 48, 45, 43, 38, 108, 47, 39, 38, 43, 35, 108, 39, 58, 54, 48, 35, 108, 7, 12, 1, 13, 6, 11, 12, 5, 17, 38, 41, 35, 53, 40, 46, 35, 105, 42, 34, 35, 46, 38, 105, 38, 36, 51, 46, 40, 41, 105, 15, 3, 10, 14, 24, 6, 18, 3, 14, 8, 24, 23, 11, 18, 0};
    }

    static {
        A03();
        A03 = new C0365Ao(new int[]{2}, 2);
    }

    public C0365Ao(int[] iArr, int i) {
        if (iArr != null) {
            this.A01 = Arrays.copyOf(iArr, iArr.length);
            Arrays.sort(this.A01);
        } else {
            this.A01 = new int[0];
        }
        this.A00 = i;
    }

    public static C0365Ao A00(Context context) {
        return A01(context.registerReceiver(null, new IntentFilter(A02(158, 36, 74))));
    }

    @SuppressLint({"InlinedApi"})
    public static C0365Ao A01(Intent intent) {
        int i = 0;
        char c2 = intent != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    intent = intent;
                    i = 0;
                    if (intent.getIntExtra(A02(35, 36, 106), 0) != 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return A03;
                case 4:
                    Intent intent2 = intent;
                    return new C0365Ao(intent2.getIntArrayExtra(A02(129, 29, 79)), intent2.getIntExtra(A02(71, 37, 7), i));
            }
        }
    }

    public final boolean A04(int i) {
        boolean z = false;
        char c2 = Arrays.binarySearch(this.A01, i) >= 0 ? (char) 2 : (char) 4;
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
        C0365Ao c0365Ao = this;
        C0365Ao c0365Ao2 = null;
        boolean z = true;
        char c2 = c0365Ao == obj ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return z;
                case 3:
                    obj = obj;
                    if (!(obj instanceof C0365Ao)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    return false;
                case 5:
                    c0365Ao = c0365Ao;
                    obj = obj;
                    c0365Ao2 = (C0365Ao) obj;
                    if (!Arrays.equals(c0365Ao.A01, c0365Ao2.A01)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0365Ao = c0365Ao;
                    c0365Ao2 = c0365Ao2;
                    if (c0365Ao.A00 != c0365Ao2.A00) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return z;
                case '\b':
                    z = false;
                    c2 = 7;
                    break;
            }
        }
    }

    public final int hashCode() {
        return this.A00 + (Arrays.hashCode(this.A01) * 31);
    }

    public final String toString() {
        return A02(1, 34, 19) + this.A00 + A02(108, 21, 35) + Arrays.toString(this.A01) + A02(0, 1, 15);
    }
}
