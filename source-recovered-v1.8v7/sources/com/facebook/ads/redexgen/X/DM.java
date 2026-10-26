package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DM {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final CO A0E;
    public final boolean A0G;
    public final boolean A0H;
    public final SparseArray<C0539Id> A0D = new SparseArray<>();
    public final SparseArray<C0538Ic> A0C = new SparseArray<>();
    public DL A06 = new DL();
    public DL A07 = new DL();
    public byte[] A0B = new byte[128];
    public final C0545Ij A0F = new C0545Ij(this.A0B, 0, 0);

    public DM(CO co, boolean z, boolean z2) {
        this.A0E = co;
        this.A0G = z;
        this.A0H = z2;
        A01();
    }

    private void A00(int i) {
        boolean z = this.A0A;
        this.A0E.ACl(this.A05, z ? 1 : 0, (int) (this.A02 - this.A04), i, null);
    }

    public final void A01() {
        this.A08 = false;
        this.A09 = false;
        this.A07.A02();
    }

    public final void A02(long j, int i) {
        DM dm = this;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        char c2 = dm.A01 != 9 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    dm = dm;
                    if (!dm.A0H) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    dm = dm;
                    if (!dm.A07.A00(dm.A06)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    dm = dm;
                    if (!dm.A09) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    dm = dm;
                    dm.A00(i + ((int) (j - dm.A02)));
                    c2 = 6;
                    break;
                case 6:
                    dm = dm;
                    z2 = false;
                    dm.A04 = dm.A02;
                    dm.A05 = dm.A03;
                    dm.A0A = false;
                    dm.A09 = true;
                    c2 = 7;
                    break;
                case 7:
                    dm = dm;
                    z = dm.A0A;
                    i2 = dm.A01;
                    if (i2 == 5) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    dm = dm;
                    if (!dm.A0G) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (i2 != 1) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    dm = dm;
                    if (!dm.A07.A05()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    z2 = true;
                    c2 = '\f';
                    break;
                case '\f':
                    dm.A0A = z | z2;
                    return;
            }
        }
    }

    public final void A03(long j, int i, long j2) {
        DM dm = this;
        int i2 = 0;
        dm.A01 = i;
        dm.A03 = j2;
        dm.A02 = j;
        char c2 = dm.A0G ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    dm = dm;
                    if (dm.A01 == 1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    dm = dm;
                    if (!dm.A0H) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    dm = dm;
                    i2 = dm.A01;
                    if (i2 == 5) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i2 == 1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i2 != 2) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    dm = dm;
                    DL dl = dm.A06;
                    dm.A06 = dm.A07;
                    dm.A07 = dl;
                    dm.A07.A02();
                    dm.A00 = 0;
                    dm.A08 = true;
                    c2 = '\b';
                    break;
                case '\b':
                    return;
            }
        }
    }

    public final void A04(C0538Ic c0538Ic) {
        this.A0C.append(c0538Ic.A00, c0538Ic);
    }

    public final void A05(C0539Id c0539Id) {
        this.A0D.append(c0539Id.A05, c0539Id);
    }

    public final void A06(byte[] bArr, int readLength, int i) {
        byte[] bArr2 = bArr;
        int sliceType = 0;
        int iA05 = 0;
        int iA04 = 0;
        int iA03 = 0;
        int picOrderCntLsb = 0;
        boolean zA0A = false;
        C0538Ic ppsData = null;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int iA042 = 0;
        C0539Id c0539Id = null;
        int frameNum = 0;
        boolean bottomFieldFlagPresent = false;
        int i3 = 0;
        boolean zA0A2 = false;
        int iA032 = 0;
        int i4 = 0;
        byte[] bArr3 = null;
        int iA043 = 0;
        int iA033 = 0;
        int iA052 = 0;
        int i5 = 0;
        DM dm = this;
        int idrPicId = !dm.A08 ? 2 : 3;
        while (true) {
            switch (idrPicId) {
                case 2:
                    return;
                case 3:
                    dm = dm;
                    i2 = i - readLength;
                    bArr3 = dm.A0B;
                    int length = bArr3.length;
                    frameNum = dm.A00;
                    i4 = 2;
                    if (length >= frameNum + i2) {
                        idrPicId = 5;
                        break;
                    } else {
                        idrPicId = 4;
                        break;
                    }
                case 4:
                    dm = dm;
                    bArr3 = bArr3;
                    dm.A0B = Arrays.copyOf(bArr3, (frameNum + i2) * 2);
                    idrPicId = 5;
                    break;
                case 5:
                    bArr2 = bArr2;
                    dm = dm;
                    System.arraycopy(bArr2, readLength, dm.A0B, dm.A00, i2);
                    dm.A00 += i2;
                    z2 = false;
                    dm.A0F.A08(dm.A0B, 0, dm.A00);
                    if (!dm.A0F.A0B(8)) {
                        idrPicId = 6;
                        break;
                    } else {
                        idrPicId = 7;
                        break;
                    }
                case 6:
                    return;
                case 7:
                    dm = dm;
                    dm.A0F.A06();
                    picOrderCntLsb = dm.A0F.A05(i4);
                    i5 = 5;
                    dm.A0F.A07(5);
                    if (!dm.A0F.A09()) {
                        idrPicId = 8;
                        break;
                    } else {
                        idrPicId = 9;
                        break;
                    }
                case 8:
                    return;
                case 9:
                    dm = dm;
                    dm.A0F.A04();
                    if (!dm.A0F.A09()) {
                        idrPicId = 10;
                        break;
                    } else {
                        idrPicId = 11;
                        break;
                    }
                case 10:
                    return;
                case 11:
                    dm = dm;
                    iA042 = dm.A0F.A04();
                    if (!dm.A0H) {
                        idrPicId = 12;
                        break;
                    } else {
                        idrPicId = 13;
                        break;
                    }
                case 12:
                    DM dm2 = dm;
                    dm2.A08 = z2;
                    dm2.A07.A03(iA042);
                    return;
                case 13:
                    dm = dm;
                    if (!dm.A0F.A09()) {
                        idrPicId = 14;
                        break;
                    } else {
                        idrPicId = 15;
                        break;
                    }
                case 14:
                    return;
                case 15:
                    dm = dm;
                    iA043 = dm.A0F.A04();
                    if (dm.A0C.indexOfKey(iA043) >= 0) {
                        idrPicId = 17;
                        break;
                    } else {
                        idrPicId = 16;
                        break;
                    }
                case 16:
                    dm.A08 = z2;
                    return;
                case 17:
                    dm = dm;
                    ppsData = dm.A0C.get(iA043);
                    SparseArray<C0539Id> sparseArray = dm.A0D;
                    int picOrderCntLsb2 = ppsData.A01;
                    c0539Id = sparseArray.get(picOrderCntLsb2);
                    if (!c0539Id.A09) {
                        idrPicId = 21;
                        break;
                    } else {
                        idrPicId = 18;
                        break;
                    }
                case 18:
                    dm = dm;
                    if (!dm.A0F.A0B(i4)) {
                        idrPicId = 19;
                        break;
                    } else {
                        idrPicId = 20;
                        break;
                    }
                case 19:
                    return;
                case 20:
                    dm = dm;
                    dm.A0F.A07(i4);
                    idrPicId = 21;
                    break;
                case 21:
                    dm = dm;
                    c0539Id = c0539Id;
                    boolean bottomFieldFlag = dm.A0F.A0B(c0539Id.A01);
                    if (!bottomFieldFlag) {
                        idrPicId = 22;
                        break;
                    } else {
                        idrPicId = 23;
                        break;
                    }
                case 22:
                    return;
                case 23:
                    dm = dm;
                    c0539Id = c0539Id;
                    zA0A = false;
                    iA052 = dm.A0F.A05(c0539Id.A01);
                    boolean bottomFieldFlag2 = c0539Id.A08;
                    i3 = 1;
                    if (!bottomFieldFlag2) {
                        idrPicId = 24;
                        break;
                    } else {
                        idrPicId = 30;
                        break;
                    }
                case 24:
                    dm = dm;
                    boolean bottomFieldFlag3 = dm.A0F.A0B(i3);
                    if (!bottomFieldFlag3) {
                        idrPicId = 25;
                        break;
                    } else {
                        idrPicId = 26;
                        break;
                    }
                case 25:
                    return;
                case 26:
                    dm = dm;
                    zA0A = dm.A0F.A0A();
                    if (!zA0A) {
                        idrPicId = 31;
                        break;
                    } else {
                        idrPicId = 27;
                        break;
                    }
                case 27:
                    dm = dm;
                    if (!dm.A0F.A0B(i3)) {
                        idrPicId = 28;
                        break;
                    } else {
                        idrPicId = 29;
                        break;
                    }
                case 28:
                    return;
                case 29:
                    dm = dm;
                    zA0A2 = dm.A0F.A0A();
                    bottomFieldFlagPresent = true;
                    idrPicId = 32;
                    break;
                case 30:
                    zA0A2 = false;
                    bottomFieldFlagPresent = false;
                    idrPicId = 32;
                    break;
                case 31:
                    zA0A2 = false;
                    bottomFieldFlagPresent = false;
                    idrPicId = 32;
                    break;
                case 32:
                    dm = dm;
                    if (dm.A01 != i5) {
                        idrPicId = 37;
                        break;
                    } else {
                        idrPicId = 33;
                        break;
                    }
                case 33:
                    z = true;
                    idrPicId = 34;
                    break;
                case 34:
                    if (!z) {
                        idrPicId = 39;
                        break;
                    } else {
                        idrPicId = 35;
                        break;
                    }
                case 35:
                    dm = dm;
                    if (!dm.A0F.A09()) {
                        idrPicId = 36;
                        break;
                    } else {
                        idrPicId = 38;
                        break;
                    }
                case 36:
                    return;
                case 37:
                    z = false;
                    idrPicId = 34;
                    break;
                case 38:
                    dm = dm;
                    iA04 = dm.A0F.A04();
                    idrPicId = 40;
                    break;
                case 39:
                    iA04 = 0;
                    idrPicId = 40;
                    break;
                case 40:
                    c0539Id = c0539Id;
                    int deltaPicOrderCnt0 = c0539Id.A04;
                    if (deltaPicOrderCnt0 != 0) {
                        idrPicId = 48;
                        break;
                    } else {
                        idrPicId = 41;
                        break;
                    }
                case 41:
                    dm = dm;
                    c0539Id = c0539Id;
                    boolean bottomFieldFlag4 = dm.A0F.A0B(c0539Id.A03);
                    if (!bottomFieldFlag4) {
                        idrPicId = 42;
                        break;
                    } else {
                        idrPicId = 43;
                        break;
                    }
                case 42:
                    return;
                case 43:
                    dm = dm;
                    ppsData = ppsData;
                    c0539Id = c0539Id;
                    C0545Ij c0545Ij = dm.A0F;
                    int picOrderCntLsb3 = c0539Id.A03;
                    iA05 = c0545Ij.A05(picOrderCntLsb3);
                    if (!ppsData.A02) {
                        idrPicId = 59;
                        break;
                    } else {
                        idrPicId = 44;
                        break;
                    }
                case 44:
                    if (!zA0A) {
                        idrPicId = 45;
                        break;
                    } else {
                        idrPicId = 59;
                        break;
                    }
                case 45:
                    dm = dm;
                    if (!dm.A0F.A09()) {
                        idrPicId = 46;
                        break;
                    } else {
                        idrPicId = 47;
                        break;
                    }
                case 46:
                    return;
                case 47:
                    dm = dm;
                    iA033 = 0;
                    sliceType = 0;
                    iA03 = dm.A0F.A03();
                    idrPicId = 60;
                    break;
                case 48:
                    c0539Id = c0539Id;
                    int picOrderCntLsb4 = c0539Id.A04;
                    if (picOrderCntLsb4 != i3) {
                        idrPicId = 58;
                        break;
                    } else {
                        idrPicId = 49;
                        break;
                    }
                case 49:
                    c0539Id = c0539Id;
                    if (!c0539Id.A07) {
                        idrPicId = 50;
                        break;
                    } else {
                        idrPicId = 58;
                        break;
                    }
                case 50:
                    dm = dm;
                    if (!dm.A0F.A09()) {
                        idrPicId = 51;
                        break;
                    } else {
                        idrPicId = 52;
                        break;
                    }
                case 51:
                    return;
                case 52:
                    dm = dm;
                    ppsData = ppsData;
                    iA032 = dm.A0F.A03();
                    if (!ppsData.A02) {
                        idrPicId = 57;
                        break;
                    } else {
                        idrPicId = 53;
                        break;
                    }
                case 53:
                    if (!zA0A) {
                        idrPicId = 54;
                        break;
                    } else {
                        idrPicId = 57;
                        break;
                    }
                case 54:
                    dm = dm;
                    if (!dm.A0F.A09()) {
                        idrPicId = 55;
                        break;
                    } else {
                        idrPicId = 56;
                        break;
                    }
                case 55:
                    return;
                case 56:
                    dm = dm;
                    iA03 = 0;
                    iA05 = 0;
                    iA033 = dm.A0F.A03();
                    sliceType = iA032;
                    idrPicId = 60;
                    break;
                case 57:
                    iA033 = 0;
                    iA05 = 0;
                    iA03 = 0;
                    sliceType = iA032;
                    idrPicId = 60;
                    break;
                case 58:
                    iA033 = 0;
                    sliceType = 0;
                    iA05 = 0;
                    iA03 = 0;
                    idrPicId = 60;
                    break;
                case 59:
                    iA033 = 0;
                    iA03 = 0;
                    sliceType = 0;
                    idrPicId = 60;
                    break;
                case 60:
                    DM dm3 = dm;
                    dm3.A07.A04(c0539Id, picOrderCntLsb, iA042, iA052, iA043, zA0A, bottomFieldFlagPresent, zA0A2, z, iA04, iA05, iA03, sliceType, iA033);
                    dm3.A08 = false;
                    return;
            }
        }
    }

    public final boolean A07() {
        return this.A0H;
    }
}
