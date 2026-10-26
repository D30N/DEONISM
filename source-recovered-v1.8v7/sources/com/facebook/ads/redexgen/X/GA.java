package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.support.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class GA {
    public static byte[] A00;

    static {
        A05();
    }

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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 70);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A05() {
        A00 = new byte[]{3, 23, 6, 11, 17, -47, 25, 7, 4, 15, -7, -20, -25, -24, -14, -78, -6, -24, -27, -16};
    }

    @Nullable
    public static C0953Yj A00(InterfaceC0516He interfaceC0516He, int i, GM gm) throws InterruptedException, IOException {
        C0953Yj c0953Yj = null;
        C1032ae c1032aeA02 = A02(interfaceC0516He, i, gm, true);
        char c2 = c1032aeA02 == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c0953Yj = null;
                    c2 = 3;
                    break;
                case 3:
                    return c0953Yj;
                case 4:
                    c1032aeA02 = c1032aeA02;
                    c0953Yj = (C0953Yj) c1032aeA02.A00();
                    c2 = 3;
                    break;
            }
        }
    }

    public static C1032ae A01(int i, Format format) {
        CC extractor = null;
        boolean z = false;
        String str = format.A0L;
        char c2 = str != null ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!str.startsWith(A04(10, 10, 61))) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    str = str;
                    if (!str.startsWith(A04(0, 10, 92))) {
                        c2 = '\t';
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
                    if (!z) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    extractor = new Z0();
                    c2 = 7;
                    break;
                case 7:
                    return new C1032ae(extractor, i, format);
                case '\b':
                    extractor = new ZA();
                    c2 = 7;
                    break;
                case '\t':
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    @Nullable
    public static C1032ae A02(InterfaceC0516He interfaceC0516He, int i, GM gm, boolean z) throws InterruptedException, IOException {
        GK gkA04 = null;
        C1032ae c1032aeA01 = null;
        GK gkA06 = null;
        GK gkA05 = gm.A05();
        char c2 = gkA05 == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (C1032ae) null;
                case 3:
                    gm = gm;
                    c1032aeA01 = A01(i, gm.A02);
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    gm = gm;
                    gkA06 = gm.A06();
                    if (gkA06 != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return (C1032ae) null;
                case 6:
                    gkA05 = gkA05;
                    gkA04 = gkA05;
                    c2 = '\t';
                    break;
                case 7:
                    gm = gm;
                    gkA05 = gkA05;
                    gkA06 = gkA06;
                    gkA04 = gkA05.A04(gkA06, gm.A03);
                    if (gkA04 != null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    interfaceC0516He = interfaceC0516He;
                    gm = gm;
                    gkA05 = gkA05;
                    c1032aeA01 = c1032aeA01;
                    gkA06 = gkA06;
                    A06(interfaceC0516He, gm, c1032aeA01, gkA05);
                    gkA04 = gkA06;
                    c2 = '\t';
                    break;
                case '\t':
                    C1032ae c1032ae = c1032aeA01;
                    A06(interfaceC0516He, gm, c1032ae, gkA04);
                    return c1032ae;
            }
        }
    }

    public static C1048au A03(InterfaceC0516He interfaceC0516He, Uri uri) throws IOException {
        return (C1048au) C1095bf.A00(interfaceC0516He, new C1049av(), uri);
    }

    public static void A06(InterfaceC0516He interfaceC0516He, GM gm, C1032ae c1032ae, GK gk) throws InterruptedException, IOException {
        new C1(interfaceC0516He, new C0520Hi(gk.A03(gm.A03), gk.A02, gk.A01, gm.A07()), gm.A02, 0, null, c1032ae).A7r();
    }
}
