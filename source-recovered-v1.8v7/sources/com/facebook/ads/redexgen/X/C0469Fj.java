package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Fj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0469Fj {
    public static final C0469Fj A05 = new C0469Fj(new long[0]);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long[] A03;
    public final C0467Fh[] A04;

    public C0469Fj(long... jArr) {
        int length = jArr.length;
        this.A00 = length;
        this.A03 = Arrays.copyOf(jArr, length);
        this.A04 = new C0467Fh[length];
        for (int i = 0; i < length; i++) {
            this.A04[i] = new C0467Fh();
        }
        this.A01 = 0L;
        this.A02 = -9223372036854775807L;
    }

    public final int A00(long j) {
        C0469Fj c0469Fj = this;
        int i = 0;
        long[] jArr = null;
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0469Fj = c0469Fj;
                    jArr = c0469Fj.A03;
                    if (i2 >= jArr.length) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    jArr = jArr;
                    if (jArr[i2] == Long.MIN_VALUE) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    jArr = jArr;
                    if (j >= jArr[i2]) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0469Fj = c0469Fj;
                    if (!c0469Fj.A04[i2].A02()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 6:
                    i2++;
                    c2 = 2;
                    break;
                case 7:
                    c0469Fj = c0469Fj;
                    if (i2 >= c0469Fj.A03.length) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    i = i2;
                    c2 = '\t';
                    break;
                case '\t':
                    return i;
                case '\n':
                    i = -1;
                    c2 = '\t';
                    break;
            }
        }
    }

    public final int A01(long j) {
        C0469Fj c0469Fj = this;
        int i = 0;
        long[] jArr = null;
        int length = c0469Fj.A03.length - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (length < 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0469Fj = c0469Fj;
                    jArr = c0469Fj.A03;
                    if (jArr[length] == Long.MIN_VALUE) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    jArr = jArr;
                    if (jArr[length] <= j) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    length--;
                    c2 = 2;
                    break;
                case 6:
                    if (length < 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0469Fj = c0469Fj;
                    if (!c0469Fj.A04[length].A02()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    i = length;
                    c2 = '\t';
                    break;
                case '\t':
                    return i;
                case '\n':
                    i = -1;
                    c2 = '\t';
                    break;
            }
        }
    }
}
