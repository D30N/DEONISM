package com.facebook.ads.internal.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0544Ii;
import com.facebook.ads.redexgen.X.C0556Iu;
import com.facebook.ads.redexgen.X.EF;

/* loaded from: assets/audience_network.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new EF();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, EF ef) {
        this(j, j2);
    }

    public static long A00(C0544Ii c0544Ii, long j) {
        long jA0E = c0544Ii.A0E();
        if ((128 & jA0E) == 0) {
            return -9223372036854775807L;
        }
        long ptsTime = 1 & jA0E;
        return (((ptsTime << 32) | c0544Ii.A0M()) + j) & 8589934591L;
    }

    public static TimeSignalCommand A01(C0544Ii c0544Ii, long j, C0556Iu c0556Iu) {
        long jA00 = A00(c0544Ii, j);
        return new TimeSignalCommand(jA00, c0556Iu.A07(jA00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
