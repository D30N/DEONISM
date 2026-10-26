package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class KI {
    public Object[] A00;

    public KI() {
        this.A00 = new Object[0];
    }

    public KI(long j) {
        this.A00 = new Object[]{new KH(this, j)};
    }

    public KI(String str) {
        this.A00 = new Object[]{new String(str)};
    }

    private final KI A00(KI ki) {
        KI ret = this;
        Object[] objArr = null;
        int i = 0;
        Object[] objArr2 = null;
        KI ki2 = new KI();
        ki2.A00 = new Object[ret.A00.length + ki.A00.length];
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    ret = ret;
                    objArr2 = ret.A00;
                    if (i2 >= objArr2.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ki2 = ki2;
                    objArr2 = objArr2;
                    ki2.A00[i2] = objArr2[i2];
                    i2++;
                    c2 = 2;
                    break;
                case 4:
                    i = 0;
                    c2 = 5;
                    break;
                case 5:
                    ki = ki;
                    objArr = ki.A00;
                    if (i >= objArr.length) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    ret = ret;
                    ki2 = ki2;
                    objArr = objArr;
                    ki2.A00[ret.A00.length + i] = objArr[i];
                    i++;
                    c2 = 5;
                    break;
                case 7:
                    return ki2;
            }
        }
    }

    private final KI A01(Object obj) {
        KI ret = this;
        Object[] objArr = null;
        KI ki = new KI();
        ki.A00 = new Object[ret.A00.length + 1];
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    ret = ret;
                    objArr = ret.A00;
                    if (i >= objArr.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    ki = ki;
                    objArr = objArr;
                    ki.A00[i] = objArr[i];
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    KI ki2 = ki;
                    ki2.A00[objArr.length] = obj;
                    return ki2;
            }
        }
    }

    public static String A02(long j) {
        return new KI(j).toString();
    }

    public static String A03(String str) {
        return new KI(str).toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Object[] objArr = this.A00;
        int length = objArr.length;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    sb = sb;
                    objArr = objArr;
                    Object o = objArr[i];
                    sb.append(o.toString());
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return sb.toString();
            }
        }
    }
}
