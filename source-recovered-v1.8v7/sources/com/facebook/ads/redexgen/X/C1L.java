package com.facebook.ads.redexgen.X;

import d.b.a.b.k;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.1L, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1L {
    public static byte[] A06;
    public int A00;
    public int A01;
    public long A03;
    public String A04;
    public int A02 = 0;
    public LinkedList<Integer> A05 = new LinkedList<>();

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 107);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A02() {
        A06 = new byte[]{-85, -13, 31, 18, 30, 34, 18, 27, 16, 38, -51, -16, 14, 29, 29, 22, 27, 20, -51, -15, 14, 33, 14, -25, -51, 27, 28, 27, 18, -51, -10, 27, 33, 18, 20, 18, 31, -51, 28, 16, 16, 34, 31, 31, 18, 27, 16, 18, -24, -35, -22, -31, -25, -36, 83, -9, 6, 15, 4, 19, 26, 17, 21, 6, 5, 0, 10, 5, 12, 3, 9, 8, -13, 4, -7, 6, -3, 3, -8, 65, 23, 21, 36, 20, 68, 59, 65, 64, 43, 59, 47, 47, 65, 62, 62, 49, 58, 47, 49, 43, 63, 49, 47, 63, 69, 57, 57, 75, 72, 72, 59, 68, 57, 59, 73, -2, 31};
    }

    public C1L(String str) {
        this.A04 = str;
    }

    private void A01() {
        C1L c1l = this;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c1l = c1l;
                    if (!c1l.A05.isEmpty()) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 3:
                    c1l = c1l;
                    if (c1l.A05.peekFirst() == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1l = c1l;
                    if (jCurrentTimeMillis - c1l.A05.peekFirst().intValue() < c1l.A00) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1l = c1l;
                    c1l.A05.removeFirst();
                    c2 = 2;
                    break;
                case 6:
                    return;
            }
        }
    }

    public final void A03(int i) {
        this.A02 = i;
    }

    public final void A04(int i, int i2, long j) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j;
    }

    public final void A05(JSONArray jSONArray) throws JSONException {
        C1L c1l = this;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    jSONArray = jSONArray;
                    if (i >= jSONArray.length()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    jSONArray = jSONArray;
                    if (!(jSONArray.get(i) instanceof Integer)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1l = c1l;
                    jSONArray = jSONArray;
                    c1l.A05.addLast((Integer) jSONArray.get(i));
                    i++;
                    c2 = 2;
                    break;
                case 5:
                    throw new JSONException(A00(1, 47, 66));
                case 6:
                    return;
            }
        }
    }

    public final void A06(boolean z) {
        if (z) {
            this.A05.addLast(Integer.valueOf((int) (System.currentTimeMillis() / 1000)));
        }
        A01();
    }

    public final boolean A07() {
        boolean z = false;
        char c2 = ((long) this.A05.size()) >= this.A03 ? (char) 2 : (char) 4;
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

    public final boolean A08() {
        boolean z = false;
        char c2 = (System.currentTimeMillis() / 1000) - ((long) this.A02) <= ((long) this.A01) ? (char) 2 : (char) 4;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A00(79, 1, 91));
        sb.append(A00(56, 12, 54));
        String strA00 = A00(83, 1, 111);
        sb.append(strA00);
        sb.append(this.A04);
        String strA002 = A00(0, 1, 20);
        sb.append(strA002);
        sb.append(A00(48, 6, 13));
        sb.append(strA00);
        sb.append(this.A00);
        sb.append(strA002);
        sb.append(A00(68, 11, 41));
        sb.append(strA00);
        sb.append(this.A01);
        sb.append(strA002);
        sb.append(A00(80, 3, 73));
        sb.append(strA00);
        sb.append(this.A03);
        sb.append(strA002);
        sb.append(A00(84, 20, 97));
        sb.append(strA00);
        sb.append(this.A02);
        sb.append(strA002);
        sb.append(A00(104, 11, 107));
        sb.append(A00(k.AppCompatTheme_windowActionBar, 2, 89));
        Iterator<Integer> it = this.A05.iterator();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    it = it;
                    if (!it.hasNext()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    sb = sb;
                    it = it;
                    sb.append(it.next());
                    if (!it.hasNext()) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    sb = sb;
                    strA002 = strA002;
                    sb.append(strA002);
                    c2 = 2;
                    break;
                case 5:
                    StringBuilder sb2 = sb;
                    sb2.append(A00(55, 1, 47));
                    sb2.append(A00(54, 1, 107));
                    return sb2.toString();
            }
        }
    }
}
