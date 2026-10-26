package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Yu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0964Yu extends CQ {
    public static byte[] A01;
    public long A00;

    static {
        A0A();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 126);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0A() {
        A01 = new byte[]{84, 69, 66, 81, 68, 89, 95, 94, 91, 90, 121, 81, 64, 85, 112, 85, 64, 85};
    }

    public C0964Yu() {
        super(null);
        this.A00 = -9223372036854775807L;
    }

    public static int A00(C0544Ii c0544Ii) {
        return c0544Ii.A0E();
    }

    public static Boolean A01(C0544Ii c0544Ii) {
        return Boolean.valueOf(c0544Ii.A0E() == 1);
    }

    public static Double A02(C0544Ii c0544Ii) {
        return Double.valueOf(Double.longBitsToDouble(c0544Ii.A0L()));
    }

    public static Object A03(C0544Ii c0544Ii, int i) {
        char c2 = i != 0 ? (char) 2 : (char) 15;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 1) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 2) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 3) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i == 8) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i == 10) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i == 11) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return (Object) null;
                case '\t':
                    return A07(c0544Ii);
                case '\n':
                    return A06(c0544Ii);
                case 11:
                    return A08(c0544Ii);
                case '\f':
                    return A09(c0544Ii);
                case '\r':
                    return A05(c0544Ii);
                case 14:
                    return A01(c0544Ii);
                case 15:
                    return A02(c0544Ii);
            }
        }
    }

    public static String A05(C0544Ii c0544Ii) {
        int position = c0544Ii.A0I();
        int iA06 = c0544Ii.A06();
        c0544Ii.A0Z(position);
        return new String(c0544Ii.A00, iA06, position);
    }

    public static ArrayList<Object> A06(C0544Ii c0544Ii) {
        int iA0H = c0544Ii.A0H();
        ArrayList<Object> arrayList = new ArrayList<>(iA0H);
        int i = 0;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    if (i >= iA0H) {
                        i2 = 4;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    c0544Ii = c0544Ii;
                    arrayList = arrayList;
                    int i3 = A00(c0544Ii);
                    arrayList.add(A03(c0544Ii, i3));
                    i++;
                    i2 = 2;
                    break;
                case 4:
                    return arrayList;
            }
        }
    }

    public static Date A07(C0544Ii c0544Ii) {
        Date date = new Date((long) A02(c0544Ii).doubleValue());
        c0544Ii.A0Z(2);
        return date;
    }

    public static HashMap<String, Object> A08(C0544Ii c0544Ii) {
        int iA0H = c0544Ii.A0H();
        HashMap<String, Object> map = new HashMap<>(iA0H);
        int i = 0;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    if (i >= iA0H) {
                        i2 = 4;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    c0544Ii = c0544Ii;
                    map = map;
                    String strA05 = A05(c0544Ii);
                    int type = A00(c0544Ii);
                    map.put(strA05, A03(c0544Ii, type));
                    i++;
                    i2 = 2;
                    break;
                case 4:
                    return map;
            }
        }
    }

    public static HashMap<String, Object> A09(C0544Ii c0544Ii) {
        int iA00 = 0;
        String strA05 = null;
        HashMap<String, Object> map = new HashMap<>();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    strA05 = A05(c0544Ii);
                    iA00 = A00(c0544Ii);
                    if (iA00 != 9) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return map;
                case 4:
                    c0544Ii = c0544Ii;
                    map = map;
                    strA05 = strA05;
                    map.put(strA05, A03(c0544Ii, iA00));
                    c2 = 2;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CQ
    public final void A0B(C0544Ii c0544Ii, long j) throws AF {
        C0964Yu c0964Yu = this;
        String strA04 = null;
        double dDoubleValue = 0.0d;
        HashMap<String, Object> mapA08 = null;
        char c2 = A00(c0544Ii) == 2 ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    if (!A04(8, 10, 74).equals(A05(c0544Ii))) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 3:
                    return;
                case 4:
                    c0544Ii = c0544Ii;
                    if (A00(c0544Ii) == 8) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return;
                case 6:
                    c0544Ii = c0544Ii;
                    mapA08 = A08(c0544Ii);
                    strA04 = A04(0, 8, 78);
                    if (!mapA08.containsKey(strA04)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    mapA08 = mapA08;
                    strA04 = strA04;
                    dDoubleValue = ((Double) mapA08.get(strA04)).doubleValue();
                    if (dDoubleValue <= 0.0d) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0964Yu = c0964Yu;
                    c0964Yu.A00 = (long) (1000000.0d * dDoubleValue);
                    c2 = '\t';
                    break;
                case '\t':
                    return;
                case '\n':
                    throw new AF();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CQ
    public final boolean A0C(C0544Ii c0544Ii) {
        return true;
    }

    public final long A0D() {
        return this.A00;
    }
}
