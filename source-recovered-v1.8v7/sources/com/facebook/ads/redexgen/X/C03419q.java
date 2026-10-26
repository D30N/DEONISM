package com.facebook.ads.redexgen.X;

import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.9q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03419q {
    public static final int A00;
    public static final UUID A01;
    public static final UUID A02;
    public static final UUID A03;
    public static final UUID A04;
    public static final UUID A05;

    static {
        A00 = C0560Iy.A01 < 23 ? 1020 : 6396;
        A04 = new UUID(0L, 0L);
        A02 = new UUID(1186680826959645954L, -5988876978535335093L);
        A01 = new UUID(-2129748144642739255L, 8654423357094679310L);
        A05 = new UUID(-1301668207276963122L, -6645017420763422227L);
        A03 = new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    public static long A00(long j) {
        long j2 = 0;
        char c2 = j != -9223372036854775807L ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (j != Long.MIN_VALUE) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    j2 = j;
                    c2 = 4;
                    break;
                case 4:
                    return j2;
                case 5:
                    j2 = 1000 * j;
                    c2 = 4;
                    break;
            }
        }
    }

    public static long A01(long j) {
        long j2 = 0;
        char c2 = j != -9223372036854775807L ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (j != Long.MIN_VALUE) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    j2 = j;
                    c2 = 4;
                    break;
                case 4:
                    return j2;
                case 5:
                    j2 = j / 1000;
                    c2 = 4;
                    break;
            }
        }
    }
}
