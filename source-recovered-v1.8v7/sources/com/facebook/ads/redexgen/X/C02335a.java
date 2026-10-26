package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.5a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02335a {
    public static byte[] A00;
    public static final AtomicReference<C5Y> A01;
    public static final AtomicReference<String> A02;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 52);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A00 = new byte[]{-47, -52, -50, -55, -57, -41, -34, -51, -38, -38, -47, -52, -51, -78, -80, -71, -80, -67, -76, -82, -37, -29, -34, -39, -23, -16, -33, -20, -20, -29, -34, -33};
    }

    static {
        A05();
        A01 = new AtomicReference<>();
        A02 = new AtomicReference<>(A04(0, 0, 111));
    }

    public static C5Y A00() {
        C5Y advertisingIdInfo = A01.get();
        if (advertisingIdInfo == null) {
            return C5Y.A00();
        }
        return advertisingIdInfo;
    }

    @SuppressLint({"CatchGeneralException"})
    @Nullable
    public static C5Y A01(C8C c8c, C5Y c5y) {
        char c2 = c5y != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    try {
                        c5y = c5y;
                        if (TextUtils.isEmpty(c5y.A03())) {
                            c2 = 5;
                        } else {
                            c2 = '\b';
                            continue;
                        }
                    } catch (Throwable th) {
                        c8c.A04().A83(A04(13, 7, 23), C03008a.A17, new C03018b(th));
                        c2 = '\b';
                    }
                case 5:
                    c8c = c8c;
                    return C02385g.A00(c8c);
                case '\b':
                    return c5y;
            }
            c8c.A04().A83(A04(13, 7, 23), C03008a.A17, new C03018b(th));
            c2 = '\b';
        }
    }

    @SuppressLint({"CatchGeneralException"})
    @Nullable
    public static C5Y A02(C8C c8c, C5Y c5y, C5Z c5z) {
        C02345b c02345bA00 = null;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c8c = c8c;
                    if (!JP.A06(c8c)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c5y = c5y;
                    if (c5y == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c5y = c5y;
                    if (!TextUtils.isEmpty(c5y.A03())) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    try {
                        c8c = c8c;
                        c02345bA00 = C02355c.A00(c8c.getContentResolver());
                        c2 = '\f';
                        break;
                    } catch (Throwable th) {
                        c8c.A04().A83(A04(13, 7, 23), C03008a.A19, new C03018b(th));
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    if (c02345bA00 == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    if (c02345bA00.A01 == null) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c5z = c5z;
                    A02.set(c02345bA00.A01);
                    c5z.A05(c02345bA00.A01);
                    c2 = 15;
                    break;
                case 15:
                    c5y = c5y;
                    if (c5y != null) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    if (c02345bA00 == null) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    if (!TextUtils.isEmpty(c02345bA00.A00)) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 18:
                    c5y = new C5Y(c02345bA00.A00, c02345bA00.A02, C5X.A04);
                    c2 = 19;
                    break;
                case 19:
                    return c5y;
            }
        }
    }

    public static String A03() {
        String attributionId = A02.get();
        if (attributionId == null) {
            return A04(0, 0, 111);
        }
        return attributionId;
    }

    public static void A06(C5Z c5z) {
        A01.set(c5z.A02());
        A02.set(c5z.A03());
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A07(C8C c8c) {
        long jA01;
        C5Y upToDateAdInfo;
        try {
            C5Z c5z = new C5Z(c8c);
            A06(c5z);
            if (A08()) {
                return;
            }
            C5Y c5y = A01.get();
            if (c5y != null && !TextUtils.isEmpty(c5y.A03())) {
                jA01 = c5y.A01();
            } else {
                jA01 = -1;
            }
            if (jA01 > 0 && System.currentTimeMillis() - jA01 < JP.A00(c8c)) {
                return;
            }
            if (JP.A07(c8c)) {
                upToDateAdInfo = A01(c8c, A02(c8c, null, c5z));
            } else {
                upToDateAdInfo = A02(c8c, A01(c8c, null), c5z);
            }
            if (upToDateAdInfo != null && !TextUtils.isEmpty(upToDateAdInfo.A03())) {
                A01.set(upToDateAdInfo);
                c5z.A04(upToDateAdInfo);
            }
        } catch (Throwable th) {
            c8c.A04().A83(A04(13, 7, 23), C03008a.A18, new C03018b(th));
        }
    }

    public static boolean A08() {
        boolean updated = false;
        if (LH.A04()) {
            String strA04 = A04(20, 12, 70);
            if (LH.A05(strA04)) {
                A02.set(LH.A01(strA04));
                updated = true;
            }
        }
        if (!LH.A04()) {
            return updated;
        }
        String strA042 = A04(0, 13, 52);
        if (LH.A05(strA042)) {
            String strA01 = LH.A01(strA042);
            AtomicReference<C5Y> atomicReference = A01;
            if (strA01 == null) {
                strA01 = A04(0, 0, 111);
            }
            atomicReference.set(new C5Y(strA01, false, C5X.A03));
            return true;
        }
        return updated;
    }
}
