package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class EE {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<ED> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public EE(long j, boolean z, boolean z2, boolean z3, List<ED> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
        this.A04 = j;
        this.A0A = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j2;
        this.A07 = z4;
        this.A03 = j3;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public EE(Parcel parcel) {
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(ED.A00(parcel));
        }
        this.A06 = Collections.unmodifiableList(arrayList);
        this.A05 = parcel.readLong();
        this.A07 = parcel.readByte() == 1;
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public static EE A00(Parcel parcel) {
        return new EE(parcel);
    }

    public static EE A02(C0544Ii c0544Ii) {
        long jA0M = c0544Ii.A0M();
        boolean autoReturn = (c0544Ii.A0E() & 128) != 0;
        boolean programSpliceFlag = false;
        boolean z = false;
        long jA0M2 = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        int iA0I = 0;
        int headerByte = 0;
        int iA0E = 0;
        boolean z2 = false;
        long j = -9223372036854775807L;
        if (!autoReturn) {
            int iA0E2 = c0544Ii.A0E();
            programSpliceFlag = (iA0E2 & 128) != 0;
            z = (iA0E2 & 64) != 0;
            boolean z3 = (iA0E2 & 32) != 0;
            if (z) {
                jA0M2 = c0544Ii.A0M();
            }
            if (!z) {
                int iA0E3 = c0544Ii.A0E();
                arrayList = new ArrayList(iA0E3);
                for (int i = 0; i < iA0E3; i++) {
                    int iA0E4 = c0544Ii.A0E();
                    long utcSpliceTime = c0544Ii.A0M();
                    arrayList.add(new ED(iA0E4, utcSpliceTime, null));
                }
            }
            if (z3) {
                long componentUtcSpliceTime = c0544Ii.A0E();
                z2 = (128 & componentUtcSpliceTime) != 0;
                long breakDuration90khz = ((1 & componentUtcSpliceTime) << 32) | c0544Ii.A0M();
                j = (1000 * breakDuration90khz) / 90;
            }
            iA0I = c0544Ii.A0I();
            headerByte = c0544Ii.A0E();
            iA0E = c0544Ii.A0E();
        }
        return new EE(jA0M, autoReturn, programSpliceFlag, z, arrayList, jA0M2, z2, j, iA0I, headerByte, iA0E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(Parcel parcel) {
        EE ee = this;
        parcel.writeLong(ee.A04);
        parcel.writeByte(ee.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(ee.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(ee.A09 ? (byte) 1 : (byte) 0);
        int size = ee.A06.size();
        parcel.writeInt(size);
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
                    ee = ee;
                    parcel = parcel;
                    ee.A06.get(i).A02(parcel);
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    EE ee2 = ee;
                    Parcel parcel2 = parcel;
                    parcel2.writeLong(ee2.A05);
                    parcel2.writeByte(ee2.A07 ? (byte) 1 : (byte) 0);
                    parcel2.writeLong(ee2.A03);
                    parcel2.writeInt(ee2.A02);
                    parcel2.writeInt(ee2.A00);
                    parcel2.writeInt(ee2.A01);
                    return;
            }
        }
    }
}
