package com.facebook.ads.redexgen.X;

import android.support.annotation.Nullable;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;

/* renamed from: com.facebook.ads.redexgen.X.bJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1073bJ extends HT {

    @Nullable
    public HO A00;

    public abstract Pair<AV[], HQ[]> A0V(HO ho, int[][][] iArr, int[] iArr2) throws C03479w;

    public static int A0Q(AU[] auArr, TrackGroup trackGroup) throws C03479w {
        int i = 0;
        int formatSupportLevel = 0;
        AU au = null;
        int length = auArr.length;
        int i2 = 0;
        int i3 = 0;
        int trackIndex = 2;
        while (true) {
            switch (trackIndex) {
                case 2:
                    auArr = auArr;
                    int rendererIndex = auArr.length;
                    if (i3 >= rendererIndex) {
                        trackIndex = 10;
                        break;
                    } else {
                        trackIndex = 3;
                        break;
                    }
                case 3:
                    auArr = auArr;
                    au = auArr[i3];
                    formatSupportLevel = 0;
                    trackIndex = 4;
                    break;
                case 4:
                    trackGroup = trackGroup;
                    int trackIndex2 = trackGroup.A01;
                    if (formatSupportLevel >= trackIndex2) {
                        trackIndex = 9;
                        break;
                    } else {
                        trackIndex = 5;
                        break;
                    }
                case 5:
                    trackGroup = trackGroup;
                    au = au;
                    int trackIndex3 = au.ADX(trackGroup.A01(formatSupportLevel));
                    i = trackIndex3 & 7;
                    if (i <= i2) {
                        trackIndex = 8;
                        break;
                    } else {
                        trackIndex = 6;
                        break;
                    }
                case 6:
                    length = i3;
                    i2 = i;
                    if (i2 != 4) {
                        trackIndex = 8;
                        break;
                    } else {
                        trackIndex = 7;
                        break;
                    }
                case 7:
                    return length;
                case 8:
                    formatSupportLevel++;
                    trackIndex = 4;
                    break;
                case 9:
                    i3++;
                    trackIndex = 2;
                    break;
                case 10:
                    return length;
            }
        }
    }

    public static int[] A0R(AU au, TrackGroup trackGroup) throws C03479w {
        int[] iArr = new int[trackGroup.A01];
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    trackGroup = trackGroup;
                    if (i >= trackGroup.A01) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    au = au;
                    trackGroup = trackGroup;
                    iArr = iArr;
                    iArr[i] = au.ADX(trackGroup.A01(i));
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return iArr;
            }
        }
    }

    public static int[] A0S(AU[] auArr) throws C03479w {
        int[] iArr = new int[auArr.length];
        int i = 0;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    iArr = iArr;
                    int i3 = iArr.length;
                    if (i >= i3) {
                        i2 = 4;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    auArr = auArr;
                    iArr = iArr;
                    int i4 = auArr[i].ADZ();
                    iArr[i] = i4;
                    i++;
                    i2 = 2;
                    break;
                case 4:
                    return iArr;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:16:0x005c */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0011 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0029 */
    @Override // com.facebook.ads.redexgen.X.HT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.X.HU A0T(com.facebook.ads.redexgen.X.AU[] r12, com.facebook.ads.internal.exoplayer2.source.TrackGroupArray r13) throws com.facebook.ads.redexgen.X.C03479w {
        /*
            r11 = this;
            int r0 = r12.length
            int r0 = r0 + 1
            int[] r4 = new int[r0]
            int r0 = r12.length
            int r0 = r0 + 1
            com.facebook.ads.internal.exoplayer2.source.TrackGroup[][] r2 = new com.facebook.ads.internal.exoplayer2.source.TrackGroup[r0][]
            int r0 = r12.length
            int r0 = r0 + 1
            int[][][] r9 = new int[r0][][]
            r1 = 0
        L10:
            int r0 = r2.length
            if (r1 >= r0) goto L22
            int r0 = r13.A01
            com.facebook.ads.internal.exoplayer2.source.TrackGroup[] r0 = new com.facebook.ads.internal.exoplayer2.source.TrackGroup[r0]
            r2[r1] = r0
            int r0 = r13.A01
            int[][] r0 = new int[r0][]
            r9[r1] = r0
            int r1 = r1 + 1
            goto L10
        L22:
            int[] r8 = A0S(r12)
            r7 = 0
        L27:
            int r0 = r13.A01
            if (r7 >= r0) goto L54
            com.facebook.ads.internal.exoplayer2.source.TrackGroup r6 = r13.A01(r7)
            int r5 = A0Q(r12, r6)
            int r0 = r12.length
            if (r5 != r0) goto L4d
            int r0 = r6.A01
            int[] r3 = new int[r0]
        L3a:
            r1 = r4[r5]
            r0 = r2[r5]
            r0[r1] = r6
            r0 = r9[r5]
            r0[r1] = r3
            r0 = r4[r5]
            int r0 = r0 + 1
            r4[r5] = r0
            int r7 = r7 + 1
            goto L27
        L4d:
            r0 = r12[r5]
            int[] r3 = A0R(r0, r6)
            goto L3a
        L54:
            int r0 = r12.length
            com.facebook.ads.internal.exoplayer2.source.TrackGroupArray[] r7 = new com.facebook.ads.internal.exoplayer2.source.TrackGroupArray[r0]
            int r0 = r12.length
            int[] r6 = new int[r0]
            r5 = 0
        L5b:
            int r0 = r12.length
            if (r5 >= r0) goto L84
            r3 = r4[r5]
            com.facebook.ads.internal.exoplayer2.source.TrackGroupArray r1 = new com.facebook.ads.internal.exoplayer2.source.TrackGroupArray
            r0 = r2[r5]
            java.lang.Object[] r0 = com.facebook.ads.redexgen.X.C0560Iy.A0n(r0, r3)
            com.facebook.ads.internal.exoplayer2.source.TrackGroup[] r0 = (com.facebook.ads.internal.exoplayer2.source.TrackGroup[]) r0
            r1.<init>(r0)
            r7[r5] = r1
            r0 = r9[r5]
            java.lang.Object[] r0 = com.facebook.ads.redexgen.X.C0560Iy.A0n(r0, r3)
            int[][] r0 = (int[][]) r0
            r9[r5] = r0
            r0 = r12[r5]
            int r0 = r0.A7D()
            r6[r5] = r0
            int r5 = r5 + 1
            goto L5b
        L84:
            int r0 = r12.length
            r1 = r4[r0]
            com.facebook.ads.internal.exoplayer2.source.TrackGroupArray r10 = new com.facebook.ads.internal.exoplayer2.source.TrackGroupArray
            int r0 = r12.length
            r0 = r2[r0]
            java.lang.Object[] r0 = com.facebook.ads.redexgen.X.C0560Iy.A0n(r0, r1)
            com.facebook.ads.internal.exoplayer2.source.TrackGroup[] r0 = (com.facebook.ads.internal.exoplayer2.source.TrackGroup[]) r0
            r10.<init>(r0)
            com.facebook.ads.redexgen.X.HO r5 = new com.facebook.ads.redexgen.X.HO
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = r11
            android.util.Pair r0 = r0.A0V(r5, r9, r8)
            com.facebook.ads.redexgen.X.HU r2 = new com.facebook.ads.redexgen.X.HU
            java.lang.Object r1 = r0.first
            com.facebook.ads.redexgen.X.AV[] r1 = (com.facebook.ads.redexgen.X.AV[]) r1
            java.lang.Object r0 = r0.second
            com.facebook.ads.redexgen.X.HQ[] r0 = (com.facebook.ads.redexgen.X.HQ[]) r0
            r2.<init>(r1, r0, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC1073bJ.A0T(com.facebook.ads.redexgen.X.AU[], com.facebook.ads.internal.exoplayer2.source.TrackGroupArray):com.facebook.ads.redexgen.X.HU");
    }

    @Override // com.facebook.ads.redexgen.X.HT
    public final void A0U(Object obj) {
        this.A00 = (HO) obj;
    }
}
