package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class RO extends AbstractC01100f {
    public static byte[] A02;
    public final C01170m A00;
    public final boolean A01;

    static {
        A0A();
    }

    public static String A09(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 103);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0A() {
        A02 = new byte[]{-54, -55, -53, -45, -57, -36, -47, -43, -51, 26, 67, 64, 58, 66, -9, 67, 70, 62, 62, 60, 59, 12, 5, 1, 22, 5, -1, 20, 9, 13, 5, 59, 65, 64, 47, 59, 57, 49};
    }

    public abstract void A0C();

    public RO(XI xi, JW jw, String str, @Nullable C01170m c01170m, boolean z) {
        super(xi, jw, str);
        this.A00 = c01170m;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01100f
    public final void A0B() {
        C01170m c01170m = this.A00;
        if (c01170m != null) {
            c01170m.A07(this.A02);
        }
        A0C();
    }

    public final void A0D(Map<String, String> map, @Nullable EnumC01090e enumC01090e) {
        RO ro = this;
        C01170m c01170m = null;
        boolean zA02 = false;
        char c2 = !TextUtils.isEmpty(ro.A02) ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    ro = ro;
                    if (!(ro instanceof C0475Fp)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ro = ro;
                    map = map;
                    ((AbstractC01100f) ro).A01.A8L(ro.A02, map);
                    c2 = 4;
                    break;
                case 4:
                    ro = ro;
                    enumC01090e = enumC01090e;
                    zA02 = EnumC01090e.A02(enumC01090e);
                    c01170m = ro.A00;
                    if (c01170m == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    enumC01090e = enumC01090e;
                    c01170m = c01170m;
                    c01170m.A06(enumC01090e);
                    if (!zA02) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    ro = ro;
                    ro.A00.A05();
                    c2 = 7;
                    break;
                case 7:
                    LJ.A02(((AbstractC01100f) ro).A00, A09(9, 12, 112));
                    return;
                case '\b':
                    ro = ro;
                    HashMap map2 = new HashMap();
                    map2.put(A09(21, 10, 57), Long.toString(-1L));
                    map2.put(A09(0, 9, 1), Long.toString(-1L));
                    map2.put(A09(31, 7, 101), EnumC01090e.A03.name());
                    ((AbstractC01100f) ro).A01.A8O(ro.A02, map2);
                    c2 = 7;
                    break;
                case '\t':
                    ro = ro;
                    map = map;
                    ((AbstractC01100f) ro).A01.A89(ro.A02, map);
                    c2 = 4;
                    break;
            }
        }
    }
}
