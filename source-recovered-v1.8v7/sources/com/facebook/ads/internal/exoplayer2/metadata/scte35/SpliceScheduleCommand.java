package com.facebook.ads.internal.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0544Ii;
import com.facebook.ads.redexgen.X.EC;
import com.facebook.ads.redexgen.X.EE;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new EC();
    public final List<EE> A00;

    public SpliceScheduleCommand(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(EE.A00(parcel));
        }
        this.A00 = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, EC ec) {
        this(parcel);
    }

    public SpliceScheduleCommand(List<EE> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public static SpliceScheduleCommand A00(C0544Ii c0544Ii) {
        int iA0E = c0544Ii.A0E();
        ArrayList arrayList = new ArrayList(iA0E);
        int i = 0;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    if (i >= iA0E) {
                        i2 = 4;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    c0544Ii = c0544Ii;
                    arrayList = arrayList;
                    arrayList.add(EE.A02(c0544Ii));
                    i++;
                    i2 = 2;
                    break;
                case 4:
                    return new SpliceScheduleCommand(arrayList);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SpliceScheduleCommand spliceScheduleCommand = this;
        int size = spliceScheduleCommand.A00.size();
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
                    spliceScheduleCommand = spliceScheduleCommand;
                    parcel = parcel;
                    spliceScheduleCommand.A00.get(i2).A04(parcel);
                    i2++;
                    c2 = 2;
                    break;
                case 4:
                    return;
            }
        }
    }
}
