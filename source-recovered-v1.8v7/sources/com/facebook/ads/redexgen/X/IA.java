package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* loaded from: assets/audience_network.dex */
public final class IA {
    public static byte[] A05;
    public boolean A01;
    public final int A02;
    public final String A03;
    public C1108bs A00 = C1108bs.A03;
    public final TreeSet<C1110bu> A04 = new TreeSet<>();

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
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

    public static void A02() {
        A05 = new byte[]{-99, -29, -34, -26, -23, -30, -31, -85, -90, -6, -11, -90, -15, 4, 13, 0, 12, 8, 13, 6, -65, 14, 5, -65};
    }

    public IA(int i, String str) {
        this.A02 = i;
        this.A03 = str;
    }

    public static IA A00(int id, DataInputStream dataInputStream) throws IOException {
        IA ia = new IA(dataInputStream.readInt(), dataInputStream.readUTF());
        char c2 = id < 2 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    dataInputStream = dataInputStream;
                    ia = ia;
                    long j = dataInputStream.readLong();
                    IF mutations = new IF();
                    IE.A05(mutations, j);
                    ia.A0F(mutations);
                    c2 = 3;
                    break;
                case 3:
                    return ia;
                case 4:
                    dataInputStream = dataInputStream;
                    ia = ia;
                    ia.A00 = C1108bs.A00(dataInputStream);
                    c2 = 3;
                    break;
            }
        }
    }

    public final int A03(int result) {
        IA ia = this;
        int iHashCode = 0;
        int iHashCode2 = (ia.A02 * 31) + ia.A03.hashCode();
        char c2 = result < 2 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    ia = ia;
                    long jA00 = IE.A00(ia.A00);
                    iHashCode = (iHashCode2 * 31) + ((int) ((jA00 >>> 32) ^ jA00));
                    c2 = 3;
                    break;
                case 3:
                    return iHashCode;
                case 4:
                    ia = ia;
                    iHashCode = (iHashCode2 * 31) + ia.A00.hashCode();
                    c2 = 3;
                    break;
            }
        }
    }

    public final long A04(long queryEndPosition, long currentEndPosition) {
        IA ia = this;
        C1110bu next = null;
        long j = 0;
        long jMax = 0;
        Iterator<C1110bu> it = null;
        long j2 = 0;
        C1110bu c1110buA06 = ia.A06(queryEndPosition);
        char c2 = c1110buA06.A01() ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    c1110buA06 = c1110buA06;
                    if (!c1110buA06.A02()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    j2 = Long.MAX_VALUE;
                    c2 = 4;
                    break;
                case 4:
                    return -Math.min(j2, currentEndPosition);
                case 5:
                    c1110buA06 = c1110buA06;
                    j2 = c1110buA06.A01;
                    c2 = 4;
                    break;
                case 6:
                    c1110buA06 = c1110buA06;
                    j = queryEndPosition + currentEndPosition;
                    jMax = c1110buA06.A02 + c1110buA06.A01;
                    if (jMax >= j) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    ia = ia;
                    c1110buA06 = c1110buA06;
                    it = ia.A04.tailSet(c1110buA06, false).iterator();
                    c2 = '\b';
                    break;
                case '\b':
                    it = it;
                    if (!it.hasNext()) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    it = it;
                    next = it.next();
                    if (next.A02 <= jMax) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    return Math.min(jMax - queryEndPosition, currentEndPosition);
                case 11:
                    next = next;
                    jMax = Math.max(jMax, next.A02 + next.A01);
                    if (jMax < j) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
            }
        }
    }

    public final ID A05() {
        return this.A00;
    }

    public final C1110bu A06(long j) {
        IA ia = this;
        C1110bu c1110buCeiling = null;
        String str = null;
        C1110bu c1110buA03 = null;
        C1110bu c1110buA01 = C1110bu.A01(ia.A03, j);
        C1110bu c1110buFloor = ia.A04.floor(c1110buA01);
        char c2 = c1110buFloor != null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    c1110buFloor = c1110buFloor;
                    if (c1110buFloor.A02 + c1110buFloor.A01 <= j) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return c1110buFloor;
                case 4:
                    ia = ia;
                    c1110buA01 = c1110buA01;
                    c1110buCeiling = ia.A04.ceiling(c1110buA01);
                    str = ia.A03;
                    if (c1110buCeiling != null) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    str = str;
                    c1110buA03 = C1110bu.A02(str, j);
                    c2 = 6;
                    break;
                case 6:
                    return c1110buA03;
                case 7:
                    c1110buCeiling = c1110buCeiling;
                    str = str;
                    c1110buA03 = C1110bu.A03(str, j, c1110buCeiling.A02 - j);
                    c2 = 6;
                    break;
            }
        }
    }

    public final C1110bu A07(C1110bu c1110bu) throws I1 {
        IJ.A04(this.A04.remove(c1110bu));
        C1110bu c1110buA08 = c1110bu.A08(this.A02);
        if (c1110bu.A03.renameTo(c1110buA08.A03)) {
            this.A04.add(c1110buA08);
            return c1110buA08;
        }
        throw new I1(A01(12, 12, 56) + c1110bu.A03 + A01(8, 4, 31) + c1110buA08.A03 + A01(0, 8, 22));
    }

    public final TreeSet<C1110bu> A08() {
        return this.A04;
    }

    public final void A09(C1110bu c1110bu) {
        this.A04.add(c1110bu);
    }

    public final void A0A(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A02);
        dataOutputStream.writeUTF(this.A03);
        this.A00.A09(dataOutputStream);
    }

    public final void A0B(boolean z) {
        this.A01 = z;
    }

    public final boolean A0C() {
        return this.A04.isEmpty();
    }

    public final boolean A0D() {
        return this.A01;
    }

    public final boolean A0E(I7 i7) {
        if (this.A04.remove(i7)) {
            i7.A03.delete();
            return true;
        }
        return false;
    }

    public final boolean A0F(IF r3) {
        C1108bs c1108bs = this.A00;
        this.A00 = this.A00.A08(r3);
        return !this.A00.equals(c1108bs);
    }

    public final boolean equals(@Nullable Object obj) {
        IA ia = this;
        IA ia2 = null;
        boolean z = true;
        char c2 = ia == obj ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return z;
                case 3:
                    obj = obj;
                    if (obj == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    ia = ia;
                    obj = obj;
                    if (ia.getClass() == obj.getClass()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return false;
                case 6:
                    ia = ia;
                    obj = obj;
                    ia2 = (IA) obj;
                    if (ia.A02 != ia2.A02) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    ia = ia;
                    ia2 = ia2;
                    if (!ia.A03.equals(ia2.A03)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    ia = ia;
                    ia2 = ia2;
                    if (!ia.A04.equals(ia2.A04)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    ia = ia;
                    ia2 = ia2;
                    if (!ia.A00.equals(ia2.A00)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    return z;
                case 11:
                    z = false;
                    c2 = '\n';
                    break;
            }
        }
    }

    public final int hashCode() {
        return (A03(Integer.MAX_VALUE) * 31) + this.A04.hashCode();
    }
}
