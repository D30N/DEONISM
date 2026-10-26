package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0979Zj implements DQ {
    public final int A00;
    public final /* synthetic */ C0980Zk A04;
    public final C0543Ih A03 = new C0543Ih(new byte[5]);
    public final SparseArray<DX> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    public C0979Zj(C0980Zk c0980Zk, int i) {
        this.A04 = c0980Zk;
        this.A00 = i;
    }

    private DU A00(C0544Ii c0544Ii, int i) {
        C0544Ii c0544Ii2 = c0544Ii;
        int i2 = 0;
        long jA0M = 0;
        int iA0E = 0;
        int iA06 = 0;
        C0544Ii c0544Ii3 = c0544Ii2;
        int iA062 = c0544Ii2.A06();
        int i3 = iA062 + i;
        int i4 = -1;
        String strTrim = null;
        ArrayList arrayList = null;
        int positionOfNextDescriptor = 2;
        while (true) {
            switch (positionOfNextDescriptor) {
                case 2:
                    c0544Ii2 = c0544Ii2;
                    if (c0544Ii2.A06() >= i3) {
                        positionOfNextDescriptor = 23;
                        break;
                    } else {
                        positionOfNextDescriptor = 3;
                        break;
                    }
                case 3:
                    c0544Ii2 = c0544Ii2;
                    iA0E = c0544Ii2.A0E();
                    int descriptorTag = c0544Ii2.A0E();
                    iA06 = c0544Ii2.A06() + descriptorTag;
                    if (iA0E != 5) {
                        positionOfNextDescriptor = 11;
                        break;
                    } else {
                        positionOfNextDescriptor = 4;
                        break;
                    }
                case 4:
                    c0544Ii2 = c0544Ii2;
                    jA0M = c0544Ii2.A0M();
                    if (jA0M != C0980Zk.A0E) {
                        positionOfNextDescriptor = 7;
                        break;
                    } else {
                        positionOfNextDescriptor = 5;
                        break;
                    }
                case 5:
                    i4 = 129;
                    positionOfNextDescriptor = 6;
                    break;
                case 6:
                    c0544Ii2 = c0544Ii2;
                    c0544Ii3 = c0544Ii3;
                    c0544Ii3.A0Z(iA06 - c0544Ii2.A06());
                    positionOfNextDescriptor = 2;
                    break;
                case 7:
                    if (jA0M != C0980Zk.A0F) {
                        positionOfNextDescriptor = 9;
                        break;
                    } else {
                        positionOfNextDescriptor = 8;
                        break;
                    }
                case 8:
                    i4 = 135;
                    positionOfNextDescriptor = 6;
                    break;
                case 9:
                    if (jA0M != C0980Zk.A0G) {
                        positionOfNextDescriptor = 6;
                        break;
                    } else {
                        positionOfNextDescriptor = 10;
                        break;
                    }
                case 10:
                    i4 = 36;
                    positionOfNextDescriptor = 6;
                    break;
                case 11:
                    if (iA0E != 106) {
                        positionOfNextDescriptor = 13;
                        break;
                    } else {
                        positionOfNextDescriptor = 12;
                        break;
                    }
                case 12:
                    i4 = 129;
                    positionOfNextDescriptor = 6;
                    break;
                case 13:
                    if (iA0E != 122) {
                        positionOfNextDescriptor = 15;
                        break;
                    } else {
                        positionOfNextDescriptor = 14;
                        break;
                    }
                case 14:
                    i4 = 135;
                    positionOfNextDescriptor = 6;
                    break;
                case 15:
                    if (iA0E != 123) {
                        positionOfNextDescriptor = 17;
                        break;
                    } else {
                        positionOfNextDescriptor = 16;
                        break;
                    }
                case 16:
                    i4 = 138;
                    positionOfNextDescriptor = 6;
                    break;
                case 17:
                    i2 = 3;
                    if (iA0E != 10) {
                        positionOfNextDescriptor = 19;
                        break;
                    } else {
                        positionOfNextDescriptor = 18;
                        break;
                    }
                case 18:
                    c0544Ii3 = c0544Ii3;
                    strTrim = c0544Ii3.A0S(i2).trim();
                    positionOfNextDescriptor = 6;
                    break;
                case 19:
                    if (iA0E != 89) {
                        positionOfNextDescriptor = 6;
                        break;
                    } else {
                        positionOfNextDescriptor = 20;
                        break;
                    }
                case 20:
                    i4 = 89;
                    arrayList = new ArrayList();
                    positionOfNextDescriptor = 21;
                    break;
                case 21:
                    c0544Ii2 = c0544Ii2;
                    if (c0544Ii2.A06() >= iA06) {
                        positionOfNextDescriptor = 6;
                        break;
                    } else {
                        positionOfNextDescriptor = 22;
                        break;
                    }
                case 22:
                    c0544Ii2 = c0544Ii2;
                    c0544Ii3 = c0544Ii3;
                    arrayList = arrayList;
                    String strTrim2 = c0544Ii3.A0S(i2).trim();
                    int iA0E2 = c0544Ii2.A0E();
                    byte[] bArr = new byte[4];
                    c0544Ii3.A0c(bArr, 0, 4);
                    arrayList.add(new DT(strTrim2, iA0E2, bArr));
                    positionOfNextDescriptor = 21;
                    break;
                case 23:
                    C0544Ii c0544Ii4 = c0544Ii3;
                    c0544Ii4.A0Y(i3);
                    return new DU(i4, strTrim, arrayList, Arrays.copyOfRange(c0544Ii4.A00, iA062, i3));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A47(C0544Ii c0544Ii) {
        C0544Ii c0544Ii2 = c0544Ii;
        C0980Zk c0980Zk = null;
        int i = 0;
        int i2 = 0;
        int size = 0;
        DX dxA4O = null;
        int programInfoLength = 0;
        int trackId = 0;
        int iA04 = 0;
        int iKeyAt = 0;
        int esInfoLength = 0;
        int iA0I = 0;
        int i3 = 0;
        int i4 = 0;
        DU duA00 = null;
        int i5 = 0;
        C0556Iu c0556Iu = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int iA042 = 0;
        DX dxValueAt = null;
        int i9 = 0;
        int iA043 = 0;
        C0979Zj c0979Zj = this;
        C0544Ii c0544Ii3 = c0544Ii2;
        int elementaryPid = c0544Ii2.A0E() != 2 ? 2 : 3;
        while (true) {
            switch (elementaryPid) {
                case 2:
                    return;
                case 3:
                    c0979Zj = c0979Zj;
                    i3 = 0;
                    i8 = 1;
                    if (c0979Zj.A04.A05 == 1) {
                        elementaryPid = 6;
                        break;
                    } else {
                        elementaryPid = 4;
                        break;
                    }
                case 4:
                    c0979Zj = c0979Zj;
                    int elementaryPid2 = c0979Zj.A04.A05;
                    if (elementaryPid2 == 2) {
                        elementaryPid = 6;
                        break;
                    } else {
                        elementaryPid = 5;
                        break;
                    }
                case 5:
                    c0979Zj = c0979Zj;
                    int elementaryPid3 = i8;
                    if (c0979Zj.A04.A01 != elementaryPid3) {
                        elementaryPid = 26;
                        break;
                    } else {
                        elementaryPid = 6;
                        break;
                    }
                case 6:
                    c0979Zj = c0979Zj;
                    i3 = 0;
                    c0556Iu = (C0556Iu) c0979Zj.A04.A0B.get(0);
                    elementaryPid = 7;
                    break;
                case 7:
                    c0544Ii2 = c0544Ii2;
                    c0979Zj = c0979Zj;
                    c0544Ii3 = c0544Ii3;
                    c0544Ii3.A0Z(2);
                    iA0I = c0544Ii2.A0I();
                    i4 = 5;
                    c0544Ii3.A0Z(5);
                    c0544Ii3.A0a(c0979Zj.A03, 2);
                    i5 = 4;
                    c0979Zj.A03.A08(4);
                    i9 = 12;
                    int elementaryPid4 = c0979Zj.A03.A04(12);
                    c0544Ii3.A0Z(elementaryPid4);
                    int elementaryPid5 = c0979Zj.A04.A05;
                    i6 = 8192;
                    i7 = 21;
                    if (elementaryPid5 != 2) {
                        elementaryPid = 10;
                        break;
                    } else {
                        elementaryPid = 8;
                        break;
                    }
                case 8:
                    c0979Zj = c0979Zj;
                    if (c0979Zj.A04.A03 != null) {
                        elementaryPid = 10;
                        break;
                    } else {
                        elementaryPid = 9;
                        break;
                    }
                case 9:
                    c0979Zj = c0979Zj;
                    c0556Iu = c0556Iu;
                    DU du = new DU(i7, null, null, new byte[i3]);
                    C0980Zk c0980Zk2 = c0979Zj.A04;
                    c0980Zk2.A03 = c0980Zk2.A09.A4O(i7, du);
                    c0979Zj.A04.A03.A7V(c0556Iu, c0979Zj.A04.A02, new DW(iA0I, i7, i6));
                    elementaryPid = 10;
                    break;
                case 10:
                    c0544Ii2 = c0544Ii2;
                    c0979Zj = c0979Zj;
                    c0979Zj.A01.clear();
                    c0979Zj.A02.clear();
                    iA042 = c0544Ii2.A04();
                    elementaryPid = 11;
                    break;
                case 11:
                    if (iA042 <= 0) {
                        elementaryPid = 27;
                        break;
                    } else {
                        elementaryPid = 12;
                        break;
                    }
                case 12:
                    c0979Zj = c0979Zj;
                    c0544Ii3 = c0544Ii3;
                    c0544Ii3.A0a(c0979Zj.A03, i4);
                    iA04 = c0979Zj.A03.A04(8);
                    c0979Zj.A03.A08(3);
                    esInfoLength = c0979Zj.A03.A04(13);
                    c0979Zj.A03.A08(i5);
                    iA043 = c0979Zj.A03.A04(i9);
                    duA00 = c0979Zj.A00(c0544Ii3, iA043);
                    if (iA04 != 6) {
                        elementaryPid = 14;
                        break;
                    } else {
                        elementaryPid = 13;
                        break;
                    }
                case 13:
                    duA00 = duA00;
                    iA04 = duA00.A00;
                    elementaryPid = 14;
                    break;
                case 14:
                    c0979Zj = c0979Zj;
                    iA042 -= iA043 + 5;
                    if (c0979Zj.A04.A05 != 2) {
                        elementaryPid = 25;
                        break;
                    } else {
                        elementaryPid = 15;
                        break;
                    }
                case 15:
                    programInfoLength = iA04;
                    elementaryPid = 16;
                    break;
                case 16:
                    c0979Zj = c0979Zj;
                    if (!c0979Zj.A04.A07.get(programInfoLength)) {
                        elementaryPid = 18;
                        break;
                    } else {
                        elementaryPid = 17;
                        break;
                    }
                case 17:
                    i4 = 5;
                    i5 = 4;
                    i9 = 12;
                    i7 = 21;
                    elementaryPid = 11;
                    break;
                case 18:
                    c0979Zj = c0979Zj;
                    if (c0979Zj.A04.A05 != 2) {
                        elementaryPid = 24;
                        break;
                    } else {
                        elementaryPid = 19;
                        break;
                    }
                case 19:
                    if (iA04 != i7) {
                        elementaryPid = 24;
                        break;
                    } else {
                        elementaryPid = 20;
                        break;
                    }
                case 20:
                    c0979Zj = c0979Zj;
                    dxA4O = c0979Zj.A04.A03;
                    elementaryPid = 21;
                    break;
                case 21:
                    c0979Zj = c0979Zj;
                    int elementaryPid6 = c0979Zj.A04.A05;
                    if (elementaryPid6 != 2) {
                        elementaryPid = 23;
                        break;
                    } else {
                        elementaryPid = 22;
                        break;
                    }
                case 22:
                    c0979Zj = c0979Zj;
                    int elementaryPid7 = esInfoLength;
                    if (elementaryPid7 >= c0979Zj.A02.get(programInfoLength, i6)) {
                        elementaryPid = 17;
                        break;
                    } else {
                        elementaryPid = 23;
                        break;
                    }
                case 23:
                    c0979Zj = c0979Zj;
                    dxA4O = dxA4O;
                    c0979Zj.A02.put(programInfoLength, esInfoLength);
                    c0979Zj.A01.put(programInfoLength, dxA4O);
                    elementaryPid = 17;
                    break;
                case 24:
                    c0979Zj = c0979Zj;
                    duA00 = duA00;
                    dxA4O = c0979Zj.A04.A09.A4O(iA04, duA00);
                    elementaryPid = 21;
                    break;
                case 25:
                    programInfoLength = esInfoLength;
                    elementaryPid = 16;
                    break;
                case 26:
                    c0979Zj = c0979Zj;
                    i3 = 0;
                    c0556Iu = new C0556Iu(((C0556Iu) c0979Zj.A04.A0B.get(0)).A03());
                    c0979Zj.A04.A0B.add(c0556Iu);
                    elementaryPid = 7;
                    break;
                case 27:
                    c0979Zj = c0979Zj;
                    size = c0979Zj.A02.size();
                    i2 = 0;
                    elementaryPid = 28;
                    break;
                case 28:
                    if (i2 >= size) {
                        elementaryPid = 34;
                        break;
                    } else {
                        elementaryPid = 29;
                        break;
                    }
                case 29:
                    c0979Zj = c0979Zj;
                    iKeyAt = c0979Zj.A02.keyAt(i2);
                    c0979Zj.A04.A07.put(iKeyAt, true);
                    dxValueAt = c0979Zj.A01.valueAt(i2);
                    if (dxValueAt == null) {
                        elementaryPid = 33;
                        break;
                    } else {
                        elementaryPid = 30;
                        break;
                    }
                case 30:
                    c0979Zj = c0979Zj;
                    dxValueAt = dxValueAt;
                    if (dxValueAt == c0979Zj.A04.A03) {
                        elementaryPid = 32;
                        break;
                    } else {
                        elementaryPid = 31;
                        break;
                    }
                case 31:
                    c0979Zj = c0979Zj;
                    c0556Iu = c0556Iu;
                    dxValueAt = dxValueAt;
                    dxValueAt.A7V(c0556Iu, c0979Zj.A04.A02, new DW(iA0I, iKeyAt, i6));
                    elementaryPid = 32;
                    break;
                case 32:
                    c0979Zj = c0979Zj;
                    dxValueAt = dxValueAt;
                    c0979Zj.A04.A06.put(c0979Zj.A02.valueAt(i2), dxValueAt);
                    elementaryPid = 33;
                    break;
                case 33:
                    i2++;
                    elementaryPid = 28;
                    break;
                case 34:
                    c0979Zj = c0979Zj;
                    if (c0979Zj.A04.A05 != 2) {
                        elementaryPid = 38;
                        break;
                    } else {
                        elementaryPid = 35;
                        break;
                    }
                case 35:
                    c0979Zj = c0979Zj;
                    if (!c0979Zj.A04.A04) {
                        elementaryPid = 36;
                        break;
                    } else {
                        elementaryPid = 37;
                        break;
                    }
                case 36:
                    c0979Zj = c0979Zj;
                    c0979Zj.A04.A02.A4w();
                    c0979Zj.A04.A01 = 0;
                    c0979Zj.A04.A04 = true;
                    elementaryPid = 37;
                    break;
                case 37:
                    return;
                case 38:
                    c0979Zj = c0979Zj;
                    i = 0;
                    SparseArray sparseArray = c0979Zj.A04.A06;
                    int elementaryPid8 = c0979Zj.A00;
                    sparseArray.remove(elementaryPid8);
                    c0980Zk = c0979Zj.A04;
                    trackId = 1;
                    if (c0980Zk.A05 != 1) {
                        elementaryPid = 41;
                        break;
                    } else {
                        elementaryPid = 39;
                        break;
                    }
                case 39:
                    c0979Zj = c0979Zj;
                    c0980Zk = c0980Zk;
                    i = i;
                    c0980Zk.A01 = i;
                    int elementaryPid9 = c0979Zj.A04.A01;
                    if (elementaryPid9 != 0) {
                        elementaryPid = 37;
                        break;
                    } else {
                        elementaryPid = 40;
                        break;
                    }
                case 40:
                    c0979Zj = c0979Zj;
                    c0979Zj.A04.A02.A4w();
                    c0979Zj.A04.A04 = true;
                    elementaryPid = 37;
                    break;
                case 41:
                    c0979Zj = c0979Zj;
                    i = c0979Zj.A04.A01 - trackId;
                    elementaryPid = 39;
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A7V(C0556Iu c0556Iu, CE ce, DW dw) {
    }
}
