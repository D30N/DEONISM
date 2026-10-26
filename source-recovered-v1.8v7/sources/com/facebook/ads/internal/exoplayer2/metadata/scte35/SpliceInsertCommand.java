package com.facebook.ads.internal.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0544Ii;
import com.facebook.ads.redexgen.X.C0556Iu;
import com.facebook.ads.redexgen.X.E9;
import com.facebook.ads.redexgen.X.EA;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new E9();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List<EA> A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<EA> list, boolean z5, long j4, int i, int i2, int i3) {
        this.A06 = j;
        this.A0B = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A0C = z4;
        this.A05 = j2;
        this.A04 = j3;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z5;
        this.A03 = j4;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0B = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        this.A0A = parcel.readByte() == 1;
        this.A0C = parcel.readByte() == 1;
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(EA.A00(parcel));
        }
        this.A07 = Collections.unmodifiableList(arrayList);
        this.A08 = parcel.readByte() == 1;
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, E9 e9) {
        this(parcel);
    }

    public static SpliceInsertCommand A00(C0544Ii c0544Ii, long j, C0556Iu c0556Iu) {
        long jA0M = c0544Ii.A0M();
        boolean z = (c0544Ii.A0E() & 128) != 0;
        boolean z2 = false;
        boolean autoReturn = false;
        boolean spliceImmediateFlag = false;
        long programSplicePts = -9223372036854775807L;
        List listEmptyList = Collections.emptyList();
        int iA0I = 0;
        int iA0E = 0;
        int iA0E2 = 0;
        boolean z3 = false;
        long jA0M2 = -9223372036854775807L;
        if (!z) {
            int iA0E3 = c0544Ii.A0E();
            z2 = (iA0E3 & 128) != 0;
            autoReturn = (iA0E3 & 64) != 0;
            boolean programSpliceFlag = (iA0E3 & 32) != 0;
            spliceImmediateFlag = (iA0E3 & 16) != 0;
            if (autoReturn && !spliceImmediateFlag) {
                programSplicePts = TimeSignalCommand.A00(c0544Ii, j);
            }
            if (!autoReturn) {
                int iA0E4 = c0544Ii.A0E();
                listEmptyList = new ArrayList(iA0E4);
                for (int i = 0; i < iA0E4; i++) {
                    int iA0E5 = c0544Ii.A0E();
                    long jA00 = -9223372036854775807L;
                    if (!spliceImmediateFlag) {
                        jA00 = TimeSignalCommand.A00(c0544Ii, j);
                    }
                    long spliceEventId = jA00;
                    listEmptyList.add(new EA(iA0E5, spliceEventId, c0556Iu.A07(jA00), null));
                }
            }
            if (programSpliceFlag) {
                long jA0E = c0544Ii.A0E();
                z3 = (jA0E & 128) != 0;
                jA0M2 = (1000 * (((jA0E & 1) << 32) | c0544Ii.A0M())) / 90;
            }
            iA0I = c0544Ii.A0I();
            iA0E = c0544Ii.A0E();
            iA0E2 = c0544Ii.A0E();
        }
        return new SpliceInsertCommand(jA0M, z, z2, autoReturn, spliceImmediateFlag, programSplicePts, c0556Iu.A07(programSplicePts), listEmptyList, z3, jA0M2, iA0I, iA0E, iA0E2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SpliceInsertCommand spliceInsertCommand = this;
        parcel.writeLong(spliceInsertCommand.A06);
        parcel.writeByte(spliceInsertCommand.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(spliceInsertCommand.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(spliceInsertCommand.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(spliceInsertCommand.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(spliceInsertCommand.A05);
        parcel.writeLong(spliceInsertCommand.A04);
        int size = spliceInsertCommand.A07.size();
        parcel.writeInt(size);
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= size) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    spliceInsertCommand = spliceInsertCommand;
                    parcel = parcel;
                    spliceInsertCommand.A07.get(i2).A01(parcel);
                    i2++;
                    c2 = 2;
                    break;
                case 4:
                    SpliceInsertCommand spliceInsertCommand2 = spliceInsertCommand;
                    Parcel parcel2 = parcel;
                    parcel2.writeByte(spliceInsertCommand2.A08 ? (byte) 1 : (byte) 0);
                    parcel2.writeLong(spliceInsertCommand2.A03);
                    parcel2.writeInt(spliceInsertCommand2.A02);
                    parcel2.writeInt(spliceInsertCommand2.A00);
                    parcel2.writeInt(spliceInsertCommand2.A01);
                    return;
            }
        }
    }
}
