package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.Format;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class ZT implements DV {
    public static byte[] A02;
    public final int A00;
    public final List<Format> A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ k.AppCompatTheme_windowFixedHeightMinor);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A02 = new byte[]{76, 93, 93, 65, 68, 78, 76, 89, 68, 66, 67, 2, 78, 72, 76, 0, 26, 29, 21, 61, 44, 44, 48, 53, 63, 61, 40, 53, 51, 50, 115, 63, 57, 61, 113, 106, 108, 100};
    }

    public ZT() {
        this(0);
    }

    public ZT(int i) {
        this(i, Collections.emptyList());
    }

    public ZT(int i, List<Format> list) {
        this.A00 = i;
        if (!A03(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.A00(null, A01(19, 19, 43), 0, null));
        }
        this.A01 = list;
    }

    private DR A00(DU du) {
        DU du2 = du;
        int i = 0;
        int iA06 = 0;
        String strA01 = null;
        String strA0S = null;
        List arrayList = null;
        int iA0E = 0;
        C0544Ii c0544Ii = null;
        int iA0E2 = 0;
        int i2 = 0;
        boolean z = false;
        ZT zt = this;
        char c2 = zt.A03(32) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    List<Format> closedCaptionFormats = zt.A01;
                    return new DR(closedCaptionFormats);
                case 3:
                    du2 = du2;
                    zt = zt;
                    c0544Ii = new C0544Ii(du2.A03);
                    arrayList = zt.A01;
                    c2 = 4;
                    break;
                case 4:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A04() <= 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0544Ii = c0544Ii;
                    int iA0E3 = c0544Ii.A0E();
                    iA06 = c0544Ii.A06() + c0544Ii.A0E();
                    if (iA0E3 != 134) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0544Ii = c0544Ii;
                    arrayList = new ArrayList();
                    iA0E2 = c0544Ii.A0E() & 31;
                    i2 = 0;
                    c2 = 7;
                    break;
                case 7:
                    if (i2 >= iA0E2) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0544Ii = c0544Ii;
                    strA0S = c0544Ii.A0S(3);
                    iA0E = c0544Ii.A0E();
                    if ((iA0E & 128) == 0) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    z = true;
                    c2 = '\n';
                    break;
                case '\n':
                    if (!z) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    strA01 = A01(0, 19, 90);
                    i = iA0E & 63;
                    c2 = '\f';
                    break;
                case '\f':
                    c0544Ii = c0544Ii;
                    arrayList = (ArrayList) arrayList;
                    strA0S = strA0S;
                    strA01 = strA01;
                    arrayList.add(Format.A08(null, strA01, null, -1, 0, strA0S, i, null));
                    c0544Ii.A0Z(2);
                    i2++;
                    c2 = 7;
                    break;
                case '\r':
                    strA01 = A01(19, 19, 43);
                    i = 1;
                    c2 = '\f';
                    break;
                case 14:
                    z = false;
                    c2 = '\n';
                    break;
                case 15:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Y(iA06);
                    c2 = 4;
                    break;
                case 16:
                    return new DR(arrayList);
            }
        }
    }

    private boolean A03(int i) {
        boolean z = false;
        char c2 = (this.A00 & i) != 0 ? (char) 2 : (char) 4;
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

    @Override // com.facebook.ads.redexgen.X.DV
    public final SparseArray<DX> A4J() {
        return new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.X.DV
    public final DX A4O(int i, DU du) {
        ZT zt = this;
        int i2 = 0;
        DX c0972Zc = null;
        char c2 = i != 2 ? (char) 2 : '\"';
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 3) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i2 = 4;
                    if (i == 4) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0972Zc = null;
                    if (i == 15) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == 17) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i == 21) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i == 27) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (i == 36) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (i == 89) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (i == 138) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    if (i == 129) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    if (i == 130) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    if (i == 134) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    if (i == 135) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    return (DX) null;
                case 16:
                    zt = zt;
                    if (!zt.A03(16)) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    return c0972Zc;
                case 18:
                    c0972Zc = new C0975Zf(new C0976Zg());
                    c2 = 17;
                    break;
                case 19:
                    return new C0972Zc(new ZP(du.A01));
                case 20:
                    return new C0972Zc(new ZU(du.A01));
                case 21:
                    return new C0972Zc(new ZV(du.A02));
                case 22:
                    return new C0972Zc(new ZY(zt.A00(du)));
                case 23:
                    zt = zt;
                    if (!zt.A03(i2)) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 24;
                        break;
                    }
                case 24:
                    return c0972Zc;
                case 25:
                    zt = zt;
                    du = du;
                    c0972Zc = new C0972Zc(new ZX(zt.A00(du), zt.A03(1), zt.A03(8)));
                    c2 = 24;
                    break;
                case 26:
                    return new C0972Zc(new ZZ());
                case 27:
                    zt = zt;
                    if (!zt.A03(2)) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    return c0972Zc;
                case 29:
                    du = du;
                    c0972Zc = new C0972Zc(new C0970Za(du.A01));
                    c2 = 28;
                    break;
                case 30:
                    zt = zt;
                    if (!zt.A03(2)) {
                        c2 = ' ';
                        break;
                    } else {
                        c2 = 31;
                        break;
                    }
                case 31:
                    return c0972Zc;
                case ' ':
                    du = du;
                    c0972Zc = new C0972Zc(new ZS(false, du.A01));
                    c2 = 31;
                    break;
                case '!':
                    return new C0972Zc(new C0971Zb(du.A01));
                case '\"':
                    return new C0972Zc(new ZW());
            }
        }
    }
}
