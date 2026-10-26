package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class FP extends S9 {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 83);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{-12, -9, -77, -4, 6, -77, 1, 2, 7, -77, 5, -8, -12, -9, 12, -77, 2, 5, -77, -12, -1, 5, -8, -12, -9, 12, -77, -9, -4, 6, 3, -1, -12, 12, -8, -9, -65, -64, -57, -68, -44};
    }

    public FP(XI xi, C01421l c01421l) {
        super(xi, c01421l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j) {
        HashMap map = new HashMap();
        map.put(A00(36, 5, 8), String.valueOf(System.currentTimeMillis() - j));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> list, Map<String, String> map) {
        FP fp = this;
        Iterator<String> it = null;
        char c2 = list != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    list = list;
                    if (!list.isEmpty()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    list = list;
                    it = list.iterator();
                    c2 = 5;
                    break;
                case 5:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    fp = fp;
                    map = map;
                    it = it;
                    new QQ(fp.A0C, map).execute(it.next());
                    c2 = 5;
                    break;
                case 7:
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.S9
    public final void A0L() {
        C0770Rf c0770Rf = (C0770Rf) this.A02;
        if (c0770Rf.A0f()) {
            this.A07.A0A(c0770Rf);
            return;
        }
        throw new IllegalStateException(A00(0, 36, 64));
    }

    @Override // com.facebook.ads.redexgen.X.S9
    public final void A0O(InterfaceC01180n interfaceC01180n, C03188s c03188s, C03168q c03168q, Map<String, Object> map) {
        C0770Rf c0770Rf = (C0770Rf) interfaceC01180n;
        long jCurrentTimeMillis = System.currentTimeMillis();
        SD sd = new SD(this, map, c0770Rf, jCurrentTimeMillis, c03168q);
        A0E().postDelayed(sd, c03188s.A05().A05());
        c0770Rf.A0X(this.A0C, new SE(this, sd, jCurrentTimeMillis, c03168q), this.A09, map, C1141cR.A0I());
    }
}
