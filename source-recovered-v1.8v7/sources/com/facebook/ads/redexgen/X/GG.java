package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public final class GG {
    public final long A00;
    public final Format A01;
    public final GP A02;
    public final String A03;
    public final String A04;
    public final ArrayList<DrmInitData.SchemeData> A05;
    public final ArrayList<GH> A06;

    public GG(Format format, String str, GP gp, String str2, ArrayList<DrmInitData.SchemeData> drmSchemeDatas, ArrayList<GH> arrayList, long j) {
        this.A01 = format;
        this.A03 = str;
        this.A02 = gp;
        this.A04 = str2;
        this.A05 = drmSchemeDatas;
        this.A06 = arrayList;
        this.A00 = j;
    }
}
