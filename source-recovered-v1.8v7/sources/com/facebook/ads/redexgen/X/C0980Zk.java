package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Zk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0980Zk implements CC {
    public static byte[] A0C;
    public static final CF A0D;
    public static final long A0E;
    public static final long A0F;
    public static final long A0G;
    public int A00;
    public int A01;
    public CE A02;
    public DX A03;
    public boolean A04;
    public final int A05;
    public final SparseArray<DX> A06;
    public final SparseBooleanArray A07;
    public final SparseIntArray A08;
    public final DV A09;
    public final C0544Ii A0A;
    public final List<C0556Iu> A0B;

    public static String A0D(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 18);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0G() {
        A0C = new byte[]{-126, -124, 110, 116, -89, -59, -46, -46, -45, -40, -124, -54, -51, -46, -56, -124, -41, -35, -46, -57, -124, -58, -35, -40, -55, -110, -124, -79, -45, -41, -40, -124, -48, -51, -49, -55, -48, -35, -124, -46, -45, -40, -124, -59, -124, -72, -42, -59, -46, -41, -44, -45, -42, -40, -124, -73, -40, -42, -55, -59, -47, -110, Byte.MIN_VALUE, 124, 126, 110, -115, -118, -101, -120};
    }

    static {
        A0G();
        A0D = new C0977Zh();
        A0E = C0560Iy.A08(A0D(0, 4, 47));
        A0F = C0560Iy.A08(A0D(62, 4, 41));
        A0G = C0560Iy.A08(A0D(66, 4, 51));
    }

    public C0980Zk() {
        this(0);
    }

    public C0980Zk(int i) {
        this(1, i);
    }

    public C0980Zk(int i, int i2) {
        this(i, new C0556Iu(0L), new ZT(i2));
    }

    public C0980Zk(int i, C0556Iu c0556Iu, DV dv) {
        this.A09 = (DV) IJ.A01(dv);
        this.A05 = i;
        if (i == 1 || i == 2) {
            this.A0B = Collections.singletonList(c0556Iu);
        } else {
            this.A0B = new ArrayList();
            this.A0B.add(c0556Iu);
        }
        this.A0A = new C0544Ii(new byte[9400], 0);
        this.A07 = new SparseBooleanArray();
        this.A06 = new SparseArray<>();
        this.A08 = new SparseIntArray();
        A0F();
    }

    public static /* synthetic */ int A01(C0980Zk c0980Zk) {
        int i = c0980Zk.A01;
        c0980Zk.A01 = i + 1;
        return i;
    }

    private void A0F() {
        C0980Zk c0980Zk = this;
        c0980Zk.A07.clear();
        c0980Zk.A06.clear();
        SparseArray<DX> sparseArrayA4J = c0980Zk.A09.A4J();
        int size = sparseArrayA4J.size();
        int i = 0;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    if (i >= size) {
                        i2 = 4;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    c0980Zk = c0980Zk;
                    sparseArrayA4J = sparseArrayA4J;
                    c0980Zk.A06.put(sparseArrayA4J.keyAt(i), sparseArrayA4J.valueAt(i));
                    i++;
                    i2 = 2;
                    break;
                case 4:
                    C0980Zk c0980Zk2 = c0980Zk;
                    c0980Zk2.A06.put(0, new C0975Zf(new C0978Zi(c0980Zk2)));
                    c0980Zk2.A03 = null;
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void A7T(CE ce) {
        this.A02 = ce;
        ce.ACq(new C0958Yo(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final int AC3(CD cd, CJ cj) throws InterruptedException, IOException {
        CD cd2 = cd;
        boolean z = false;
        int previousCounter = 0;
        int i = 0;
        int i2 = 0;
        DX dx = null;
        int iA07 = 0;
        boolean z2 = false;
        int iA04 = 0;
        int iA06 = 0;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        int iA072 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int iA08 = 0;
        C0980Zk c0980Zk = this;
        byte[] bArr = c0980Zk.A0A.A00;
        int i8 = 0;
        int continuityCounter = 9400 - c0980Zk.A0A.A06() < 188 ? 2 : 5;
        while (true) {
            switch (continuityCounter) {
                case 2:
                    c0980Zk = c0980Zk;
                    iA04 = c0980Zk.A0A.A04();
                    if (iA04 <= 0) {
                        continuityCounter = 4;
                        break;
                    } else {
                        continuityCounter = 3;
                        break;
                    }
                case 3:
                    c0980Zk = c0980Zk;
                    bArr = bArr;
                    i8 = 0;
                    int pid = c0980Zk.A0A.A06();
                    System.arraycopy(bArr, pid, bArr, 0, iA04);
                    continuityCounter = 4;
                    break;
                case 4:
                    c0980Zk = c0980Zk;
                    bArr = bArr;
                    c0980Zk.A0A.A0b(bArr, iA04);
                    continuityCounter = 5;
                    break;
                case 5:
                    c0980Zk = c0980Zk;
                    if (c0980Zk.A0A.A04() >= 188) {
                        continuityCounter = 9;
                        break;
                    } else {
                        continuityCounter = 6;
                        break;
                    }
                case 6:
                    cd2 = cd2;
                    c0980Zk = c0980Zk;
                    bArr = bArr;
                    iA072 = c0980Zk.A0A.A07();
                    i3 = cd2.read(bArr, iA072, 9400 - iA072);
                    i4 = -1;
                    if (i3 != -1) {
                        continuityCounter = 8;
                        break;
                    } else {
                        continuityCounter = 7;
                        break;
                    }
                case 7:
                    return i4;
                case 8:
                    c0980Zk = c0980Zk;
                    c0980Zk.A0A.A0X(iA072 + i3);
                    continuityCounter = 5;
                    break;
                case 9:
                    c0980Zk = c0980Zk;
                    iA07 = c0980Zk.A0A.A07();
                    iA06 = c0980Zk.A0A.A06();
                    i6 = iA06;
                    continuityCounter = 10;
                    break;
                case 10:
                    if (iA06 >= iA07) {
                        continuityCounter = 13;
                        break;
                    } else {
                        continuityCounter = 11;
                        break;
                    }
                case 11:
                    bArr = bArr;
                    if (bArr[iA06] == 71) {
                        continuityCounter = 13;
                        break;
                    } else {
                        continuityCounter = 12;
                        break;
                    }
                case 12:
                    iA06++;
                    continuityCounter = 10;
                    break;
                case 13:
                    c0980Zk = c0980Zk;
                    c0980Zk.A0A.A0Y(iA06);
                    i7 = iA06 + 188;
                    i2 = 2;
                    if (i7 <= iA07) {
                        continuityCounter = 18;
                        break;
                    } else {
                        continuityCounter = 14;
                        break;
                    }
                case 14:
                    c0980Zk = c0980Zk;
                    int pid2 = iA06 - i6;
                    c0980Zk.A00 += pid2;
                    int pid3 = c0980Zk.A05;
                    if (pid3 != i2) {
                        continuityCounter = 16;
                        break;
                    } else {
                        continuityCounter = 15;
                        break;
                    }
                case 15:
                    c0980Zk = c0980Zk;
                    if (c0980Zk.A00 > 376) {
                        continuityCounter = 17;
                        break;
                    } else {
                        continuityCounter = 16;
                        break;
                    }
                case 16:
                    return i8;
                case 17:
                    throw new AF(A0D(4, 58, 82));
                case 18:
                    c0980Zk = c0980Zk;
                    c0980Zk.A00 = i8;
                    iA08 = c0980Zk.A0A.A08();
                    int pid4 = 8388608 & iA08;
                    if (pid4 == 0) {
                        continuityCounter = 20;
                        break;
                    } else {
                        continuityCounter = 19;
                        break;
                    }
                case 19:
                    c0980Zk.A0A.A0Y(i7);
                    return i8;
                case 20:
                    int pid5 = 4194304 & iA08;
                    z2 = true;
                    if (pid5 == 0) {
                        continuityCounter = 32;
                        break;
                    } else {
                        continuityCounter = 21;
                        break;
                    }
                case 21:
                    z = true;
                    continuityCounter = 22;
                    break;
                case 22:
                    i = (2096896 & iA08) >> 8;
                    int pid6 = iA08 & 32;
                    if (pid6 == 0) {
                        continuityCounter = 31;
                        break;
                    } else {
                        continuityCounter = 23;
                        break;
                    }
                case 23:
                    z3 = true;
                    continuityCounter = 24;
                    break;
                case 24:
                    int continuityCounter2 = iA08 & 16;
                    if (continuityCounter2 == 0) {
                        continuityCounter = 30;
                        break;
                    } else {
                        continuityCounter = 25;
                        break;
                    }
                case 25:
                    if (!z2) {
                        continuityCounter = 29;
                        break;
                    } else {
                        continuityCounter = 26;
                        break;
                    }
                case 26:
                    c0980Zk = c0980Zk;
                    dx = c0980Zk.A06.get(i);
                    continuityCounter = 27;
                    break;
                case 27:
                    if (dx != null) {
                        continuityCounter = 33;
                        break;
                    } else {
                        continuityCounter = 28;
                        break;
                    }
                case 28:
                    c0980Zk.A0A.A0Y(i7);
                    return i8;
                case 29:
                    dx = null;
                    continuityCounter = 27;
                    break;
                case 30:
                    z2 = false;
                    continuityCounter = 25;
                    break;
                case 31:
                    z3 = false;
                    continuityCounter = 24;
                    break;
                case 32:
                    z = false;
                    continuityCounter = 22;
                    break;
                case 33:
                    c0980Zk = c0980Zk;
                    if (c0980Zk.A05 == i2) {
                        continuityCounter = 38;
                        break;
                    } else {
                        continuityCounter = 34;
                        break;
                    }
                case 34:
                    c0980Zk = c0980Zk;
                    i5 = iA08 & 15;
                    int continuityCounter3 = i5 - 1;
                    previousCounter = c0980Zk.A08.get(i, continuityCounter3);
                    c0980Zk.A08.put(i, i5);
                    if (previousCounter != i5) {
                        continuityCounter = 36;
                        break;
                    } else {
                        continuityCounter = 35;
                        break;
                    }
                case 35:
                    c0980Zk.A0A.A0Y(i7);
                    return 0;
                case 36:
                    if (i5 == ((previousCounter + 1) & 15)) {
                        continuityCounter = 38;
                        break;
                    } else {
                        continuityCounter = 37;
                        break;
                    }
                case 37:
                    dx.ACo();
                    continuityCounter = 38;
                    break;
                case 38:
                    if (!z3) {
                        continuityCounter = 40;
                        break;
                    } else {
                        continuityCounter = 39;
                        break;
                    }
                case 39:
                    c0980Zk = c0980Zk;
                    c0980Zk.A0A.A0Z(c0980Zk.A0A.A0E());
                    continuityCounter = 40;
                    break;
                case 40:
                    C0980Zk c0980Zk2 = c0980Zk;
                    c0980Zk2.A0A.A0X(i7);
                    dx.A48(c0980Zk2.A0A, z);
                    c0980Zk2.A0A.A0X(iA07);
                    c0980Zk2.A0A.A0Y(i7);
                    return 0;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final void ACp(long j, long j2) {
        C0980Zk c0980Zk = this;
        int size = c0980Zk.A0B.size();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= size) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0980Zk = c0980Zk;
                    c0980Zk.A0B.get(i).A08();
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    C0980Zk c0980Zk2 = c0980Zk;
                    c0980Zk2.A0A.A0V();
                    c0980Zk2.A08.clear();
                    c0980Zk2.A0F();
                    c0980Zk2.A00 = 0;
                    return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final boolean ADM(CD cd) throws InterruptedException, IOException {
        int i = 0;
        byte[] bArr = this.A0A.A00;
        cd.ABf(bArr, 0, 940);
        int i2 = 0;
        int i3 = 2;
        while (true) {
            switch (i3) {
                case 2:
                    if (i2 >= 188) {
                        i3 = 9;
                        break;
                    } else {
                        i3 = 3;
                        break;
                    }
                case 3:
                    i = 0;
                    i3 = 4;
                    break;
                case 4:
                    if (i != 5) {
                        i3 = 6;
                        break;
                    } else {
                        i3 = 5;
                        break;
                    }
                case 5:
                    cd.ADL(i2);
                    return true;
                case 6:
                    bArr = bArr;
                    if (bArr[(i * 188) + i2] == 71) {
                        i3 = 8;
                        break;
                    } else {
                        i3 = 7;
                        break;
                    }
                case 7:
                    i2++;
                    i3 = 2;
                    break;
                case 8:
                    i++;
                    i3 = 4;
                    break;
                case 9:
                    return false;
            }
        }
    }
}
