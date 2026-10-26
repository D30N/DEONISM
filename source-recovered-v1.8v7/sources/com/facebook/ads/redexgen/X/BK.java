package com.facebook.ads.redexgen.X;

import android.graphics.Point;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public final class BK extends AbstractC1073bJ {
    public static byte[] A02;
    public static final int[] A03;

    @Nullable
    public final HP A00;
    public final AtomicReference<DefaultTrackSelector$Parameters> A01;

    public static String A0C(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 104);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0E() {
        A02 = new byte[]{50, 43, 33};
    }

    static {
        A0E();
        A03 = new int[0];
    }

    public BK() {
        this((HP) null);
    }

    public BK(@Nullable HP hp) {
        this.A00 = hp;
        this.A01 = new AtomicReference<>(DefaultTrackSelector$Parameters.A0I);
    }

    public static int A00(int i, int i2) {
        int i3 = -1;
        char c2 = i == -1 ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 != i3) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i3 = 0;
                    c2 = 4;
                    break;
                case 4:
                    return i3;
                case 5:
                    if (i2 != i3) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    i3 = 1;
                    c2 = 4;
                    break;
                case 7:
                    i3 = i - i2;
                    c2 = 4;
                    break;
            }
        }
    }

    public static int A01(int i, int i2) {
        int i3 = 0;
        char c2 = i > i2 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i3 = 1;
                    c2 = 3;
                    break;
                case 3:
                    return i3;
                case 4:
                    if (i2 <= i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i3 = -1;
                    c2 = 3;
                    break;
                case 6:
                    i3 = 0;
                    c2 = 3;
                    break;
            }
        }
    }

    public static int A03(TrackGroup trackGroup, int[] iArr, int i, @Nullable String str, int i2, int i3, int i4, List<Integer> list) {
        String str2 = str;
        List<Integer> list2 = list;
        int i5 = 0;
        int i6 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    list2 = list2;
                    if (i6 >= list2.size()) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    trackGroup = trackGroup;
                    iArr = iArr;
                    str2 = str2;
                    list2 = list2;
                    int iIntValue = list2.get(i6).intValue();
                    if (!A0L(trackGroup.A01(iIntValue), str2, iArr[iIntValue], i, i2, i3, i4)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i5++;
                    c2 = 5;
                    break;
                case 5:
                    i6++;
                    c2 = 2;
                    break;
                case 6:
                    return i5;
            }
        }
    }

    public static int A04(TrackGroup trackGroup, int[] iArr, HG hg) {
        int i = 0;
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    trackGroup = trackGroup;
                    if (i2 >= trackGroup.A01) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    trackGroup = trackGroup;
                    iArr = iArr;
                    hg = hg;
                    if (!A0J(trackGroup.A01(i2), iArr[i2], hg)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i++;
                    c2 = 5;
                    break;
                case 5:
                    i2++;
                    c2 = 2;
                    break;
                case 6:
                    return i;
            }
        }
    }

    public static Point A05(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = false;
        boolean z3 = false;
        char c2 = z ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    z3 = true;
                    if (i3 <= i4) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z2 = true;
                    c2 = 4;
                    break;
                case 4:
                    if (i <= i2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (z2 == z3) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    int i5 = i;
                    i = i2;
                    i2 = i5;
                    c2 = 7;
                    break;
                case 7:
                    if (i3 * i2 < i4 * i) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return new Point(i, C0560Iy.A04(i * i4, i3));
                case '\t':
                    z3 = false;
                    c2 = 5;
                    break;
                case '\n':
                    z2 = false;
                    c2 = 4;
                    break;
                case 11:
                    return new Point(C0560Iy.A04(i2 * i3, i4), i2);
            }
        }
    }

    @Nullable
    private final HQ A06(int i, TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C03479w {
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        int[][] iArr2 = iArr;
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters;
        BD bd = null;
        boolean z = false;
        int[] iArr3 = null;
        TrackGroup trackGroupA01 = null;
        int i2 = 0;
        int i3 = 0;
        TrackGroup trackGroup = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int trackScore = 2;
        while (true) {
            switch (trackScore) {
                case 2:
                    trackGroupArray2 = trackGroupArray2;
                    int trackIndex = trackGroupArray2.A01;
                    if (i6 >= trackIndex) {
                        trackScore = 17;
                        break;
                    } else {
                        trackScore = 3;
                        break;
                    }
                case 3:
                    iArr2 = iArr2;
                    trackGroupArray2 = trackGroupArray2;
                    trackGroupA01 = trackGroupArray2.A01(i6);
                    iArr3 = iArr2[i6];
                    i3 = 0;
                    trackScore = 4;
                    break;
                case 4:
                    trackGroupA01 = trackGroupA01;
                    int trackIndex2 = trackGroupA01.A01;
                    if (i3 >= trackIndex2) {
                        trackScore = 16;
                        break;
                    } else {
                        trackScore = 5;
                        break;
                    }
                case 5:
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    iArr3 = iArr3;
                    if (!A0H(iArr3[i3], defaultTrackSelector$Parameters2.A0B)) {
                        trackScore = 14;
                        break;
                    } else {
                        trackScore = 6;
                        break;
                    }
                case 6:
                    trackGroupA01 = trackGroupA01;
                    Format format = trackGroupA01.A01(i3);
                    i2 = 1;
                    if ((format.A0D & 1) == 0) {
                        trackScore = 15;
                        break;
                    } else {
                        trackScore = 7;
                        break;
                    }
                case 7:
                    z = true;
                    trackScore = 8;
                    break;
                case 8:
                    if (!z) {
                        trackScore = 10;
                        break;
                    } else {
                        trackScore = 9;
                        break;
                    }
                case 9:
                    i2 = 2;
                    trackScore = 10;
                    break;
                case 10:
                    iArr3 = iArr3;
                    int trackScore2 = iArr3[i3];
                    if (!A0H(trackScore2, false)) {
                        trackScore = 12;
                        break;
                    } else {
                        trackScore = 11;
                        break;
                    }
                case 11:
                    i2 += AdError.NETWORK_ERROR_CODE;
                    trackScore = 12;
                    break;
                case 12:
                    if (i2 <= i5) {
                        trackScore = 14;
                        break;
                    } else {
                        trackScore = 13;
                        break;
                    }
                case 13:
                    trackGroupA01 = trackGroupA01;
                    trackGroup = trackGroupA01;
                    i4 = i3;
                    i5 = i2;
                    trackScore = 14;
                    break;
                case 14:
                    i3++;
                    trackScore = 4;
                    break;
                case 15:
                    z = false;
                    trackScore = 8;
                    break;
                case 16:
                    i6++;
                    trackScore = 2;
                    break;
                case 17:
                    if (trackGroup != null) {
                        trackScore = 20;
                        break;
                    } else {
                        trackScore = 18;
                        break;
                    }
                case 18:
                    bd = null;
                    trackScore = 19;
                    break;
                case 19:
                    return bd;
                case 20:
                    bd = new BD(trackGroup, i4);
                    trackScore = 19;
                    break;
            }
        }
    }

    @Nullable
    public static HQ A07(TrackGroupArray trackGroupArray, int[][] iArr, int i, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, HP hp) throws C03479w {
        int[][] iArr2 = iArr;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters;
        TrackGroup trackGroupA01 = null;
        boolean z = false;
        int i2 = 0;
        int[] iArrA0O = null;
        int i3 = 0;
        TrackGroupArray trackGroupArray3 = trackGroupArray2;
        char c2 = defaultTrackSelector$Parameters2.A0A ? (char) 2 : '\f';
        while (true) {
            switch (c2) {
                case 2:
                    i3 = 24;
                    c2 = 3;
                    break;
                case 3:
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (!defaultTrackSelector$Parameters2.A09) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if ((i & i3) == 0) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    z = true;
                    c2 = 6;
                    break;
                case 6:
                    i2 = 0;
                    c2 = 7;
                    break;
                case 7:
                    trackGroupArray3 = trackGroupArray3;
                    if (i2 >= trackGroupArray3.A01) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    trackGroupArray2 = trackGroupArray2;
                    iArr2 = iArr2;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    trackGroupA01 = trackGroupArray2.A01(i2);
                    iArrA0O = A0O(trackGroupA01, iArr2[i2], z, i3, defaultTrackSelector$Parameters2.A03, defaultTrackSelector$Parameters2.A02, defaultTrackSelector$Parameters2.A01, defaultTrackSelector$Parameters2.A06, defaultTrackSelector$Parameters2.A05, defaultTrackSelector$Parameters2.A0F);
                    if (iArrA0O.length <= 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return ((HP) IJ.A01(hp)).A4T(trackGroupA01, iArrA0O);
                case '\n':
                    i2++;
                    c2 = 7;
                    break;
                case 11:
                    z = false;
                    c2 = 6;
                    break;
                case '\f':
                    i3 = 16;
                    c2 = 3;
                    break;
                case '\r':
                    return (HQ) null;
            }
        }
    }

    @Nullable
    private final HQ A08(TrackGroupArray trackGroupArray, int[][] iArr, int i, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, @Nullable HP hp) throws C03479w {
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        int[][] iArr2 = iArr;
        HP hp2 = hp;
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters;
        TrackGroup trackGroupA01 = null;
        int[] iArr3 = null;
        HH hh = null;
        int[] iArrA0N = null;
        TrackGroup trackGroupA012 = null;
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        HH hh2 = null;
        int i5 = 0;
        int trackIndex = 2;
        while (true) {
            switch (trackIndex) {
                case 2:
                    trackGroupArray2 = trackGroupArray2;
                    if (i5 >= trackGroupArray2.A01) {
                        trackIndex = 11;
                        break;
                    } else {
                        trackIndex = 3;
                        break;
                    }
                case 3:
                    trackGroupArray2 = trackGroupArray2;
                    iArr2 = iArr2;
                    trackGroupA012 = trackGroupArray2.A01(i5);
                    iArr3 = iArr2[i5];
                    i2 = 0;
                    trackIndex = 4;
                    break;
                case 4:
                    trackGroupA012 = trackGroupA012;
                    int trackIndex2 = trackGroupA012.A01;
                    if (i2 >= trackIndex2) {
                        trackIndex = 10;
                        break;
                    } else {
                        trackIndex = 5;
                        break;
                    }
                case 5:
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    iArr3 = iArr3;
                    if (!A0H(iArr3[i2], defaultTrackSelector$Parameters2.A0B)) {
                        trackIndex = 9;
                        break;
                    } else {
                        trackIndex = 6;
                        break;
                    }
                case 6:
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    trackGroupA012 = trackGroupA012;
                    iArr3 = iArr3;
                    hh = new HH(trackGroupA012.A01(i2), defaultTrackSelector$Parameters2, iArr3[i2]);
                    if (hh2 == null) {
                        trackIndex = 8;
                        break;
                    } else {
                        trackIndex = 7;
                        break;
                    }
                case 7:
                    hh = hh;
                    if (hh.A00(hh2) <= 0) {
                        trackIndex = 9;
                        break;
                    } else {
                        trackIndex = 8;
                        break;
                    }
                case 8:
                    hh = hh;
                    i4 = i5;
                    i3 = i2;
                    hh2 = hh;
                    trackIndex = 9;
                    break;
                case 9:
                    i2++;
                    trackIndex = 4;
                    break;
                case 10:
                    i5++;
                    trackIndex = 2;
                    break;
                case 11:
                    if (i4 != -1) {
                        trackIndex = 13;
                        break;
                    } else {
                        trackIndex = 12;
                        break;
                    }
                case 12:
                    return (HQ) null;
                case 13:
                    trackGroupArray2 = trackGroupArray2;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    trackGroupA01 = trackGroupArray2.A01(i4);
                    if (!defaultTrackSelector$Parameters2.A0D) {
                        trackIndex = 14;
                        break;
                    } else {
                        trackIndex = 17;
                        break;
                    }
                case 14:
                    hp2 = hp2;
                    if (hp2 == null) {
                        trackIndex = 17;
                        break;
                    } else {
                        trackIndex = 15;
                        break;
                    }
                case 15:
                    iArr2 = iArr2;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    trackGroupA01 = trackGroupA01;
                    iArrA0N = A0N(trackGroupA01, iArr2[i4], defaultTrackSelector$Parameters2.A09);
                    if (iArrA0N.length <= 0) {
                        trackIndex = 17;
                        break;
                    } else {
                        trackIndex = 16;
                        break;
                    }
                case 16:
                    return hp2.A4T(trackGroupA01, iArrA0N);
                case 17:
                    return new BD(trackGroupA01, i3);
            }
        }
    }

    @Nullable
    private final HQ A09(TrackGroupArray trackGroupArray, int[][] iArr, int i, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, @Nullable HP hp) throws C03479w {
        HQ hqA0A = null;
        char c2 = !defaultTrackSelector$Parameters.A0D ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    hp = hp;
                    if (hp == null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    trackGroupArray = trackGroupArray;
                    iArr = iArr;
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    hp = hp;
                    hqA0A = A07(trackGroupArray, iArr, i, defaultTrackSelector$Parameters, hp);
                    c2 = 4;
                    break;
                case 4:
                    if (hqA0A != null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    trackGroupArray = trackGroupArray;
                    iArr = iArr;
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    hqA0A = A0A(trackGroupArray, iArr, defaultTrackSelector$Parameters);
                    c2 = 6;
                    break;
                case 6:
                    return hqA0A;
            }
        }
    }

    @Nullable
    public static HQ A0A(TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) {
        int[][] iArr2 = iArr;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters;
        int selectedTrackIndex = 0;
        int selectedTrackScore = 0;
        boolean zA0H = false;
        int iA0I = 0;
        int trackIndex = 0;
        TrackGroup trackGroupA01 = null;
        int trackScore = 0;
        int i = 0;
        int i2 = 0;
        BD bd = null;
        int[] iArr3 = null;
        List<Integer> listA0D = null;
        Format formatA01 = null;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        TrackGroupArray trackGroupArray3 = trackGroupArray2;
        TrackGroup trackGroup = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = -1;
        int iA0I2 = -1;
        int i8 = 0;
        int selectedPixelCount = 2;
        while (true) {
            switch (selectedPixelCount) {
                case 2:
                    trackGroupArray3 = trackGroupArray3;
                    if (i8 >= trackGroupArray3.A01) {
                        selectedPixelCount = 45;
                        break;
                    } else {
                        selectedPixelCount = 3;
                        break;
                    }
                case 3:
                    iArr2 = iArr2;
                    trackGroupArray3 = trackGroupArray3;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    trackGroupA01 = trackGroupArray3.A01(i8);
                    int i9 = defaultTrackSelector$Parameters2.A06;
                    int i10 = defaultTrackSelector$Parameters2.A05;
                    boolean isWithinCapabilities = defaultTrackSelector$Parameters2.A0F;
                    listA0D = A0D(trackGroupA01, i9, i10, isWithinCapabilities);
                    iArr3 = iArr2[i8];
                    trackScore = 0;
                    selectedPixelCount = 4;
                    break;
                case 4:
                    trackGroupA01 = trackGroupA01;
                    int formatPixelCount = trackGroupA01.A01;
                    if (trackScore >= formatPixelCount) {
                        selectedPixelCount = 44;
                        break;
                    } else {
                        selectedPixelCount = 5;
                        break;
                    }
                case 5:
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    iArr3 = iArr3;
                    int i11 = iArr3[trackScore];
                    boolean isWithinCapabilities2 = defaultTrackSelector$Parameters2.A0B;
                    if (!A0H(i11, isWithinCapabilities2)) {
                        selectedPixelCount = 16;
                        break;
                    } else {
                        selectedPixelCount = 6;
                        break;
                    }
                case 6:
                    trackGroupA01 = trackGroupA01;
                    listA0D = listA0D;
                    formatA01 = trackGroupA01.A01(trackScore);
                    if (!listA0D.contains(Integer.valueOf(trackScore))) {
                        selectedPixelCount = 43;
                        break;
                    } else {
                        selectedPixelCount = 7;
                        break;
                    }
                case 7:
                    formatA01 = formatA01;
                    i2 = -1;
                    if (formatA01.A0F == -1) {
                        selectedPixelCount = 9;
                        break;
                    } else {
                        selectedPixelCount = 8;
                        break;
                    }
                case 8:
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    formatA01 = formatA01;
                    if (formatA01.A0F > defaultTrackSelector$Parameters2.A03) {
                        selectedPixelCount = 43;
                        break;
                    } else {
                        selectedPixelCount = 9;
                        break;
                    }
                case 9:
                    formatA01 = formatA01;
                    int selectedPixelCount2 = formatA01.A08;
                    if (selectedPixelCount2 == i2) {
                        selectedPixelCount = 11;
                        break;
                    } else {
                        selectedPixelCount = 10;
                        break;
                    }
                case 10:
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    formatA01 = formatA01;
                    if (formatA01.A08 > defaultTrackSelector$Parameters2.A02) {
                        selectedPixelCount = 43;
                        break;
                    } else {
                        selectedPixelCount = 11;
                        break;
                    }
                case 11:
                    formatA01 = formatA01;
                    if (formatA01.A04 == i2) {
                        selectedPixelCount = 13;
                        break;
                    } else {
                        selectedPixelCount = 12;
                        break;
                    }
                case 12:
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    formatA01 = formatA01;
                    int i12 = formatA01.A04;
                    int selectedPixelCount3 = defaultTrackSelector$Parameters2.A01;
                    if (i12 > selectedPixelCount3) {
                        selectedPixelCount = 43;
                        break;
                    } else {
                        selectedPixelCount = 13;
                        break;
                    }
                case 13:
                    z = true;
                    selectedPixelCount = 14;
                    break;
                case 14:
                    if (!z) {
                        selectedPixelCount = 15;
                        break;
                    } else {
                        selectedPixelCount = 17;
                        break;
                    }
                case 15:
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (!defaultTrackSelector$Parameters2.A0C) {
                        selectedPixelCount = 16;
                        break;
                    } else {
                        selectedPixelCount = 17;
                        break;
                    }
                case 16:
                    trackScore++;
                    selectedPixelCount = 4;
                    break;
                case 17:
                    if (!z) {
                        selectedPixelCount = 42;
                        break;
                    } else {
                        selectedPixelCount = 18;
                        break;
                    }
                case 18:
                    i = 2;
                    selectedPixelCount = 19;
                    break;
                case 19:
                    iArr3 = iArr3;
                    i3 = i;
                    zA0H = A0H(iArr3[trackScore], false);
                    if (!zA0H) {
                        selectedPixelCount = 21;
                        break;
                    } else {
                        selectedPixelCount = 20;
                        break;
                    }
                case 20:
                    i3 += AdError.NETWORK_ERROR_CODE;
                    selectedPixelCount = 21;
                    break;
                case 21:
                    if (i3 <= i6) {
                        selectedPixelCount = 41;
                        break;
                    } else {
                        selectedPixelCount = 22;
                        break;
                    }
                case 22:
                    trackIndex = 1;
                    selectedPixelCount = 23;
                    break;
                case 23:
                    if (i3 != i6) {
                        selectedPixelCount = 28;
                        break;
                    } else {
                        selectedPixelCount = 24;
                        break;
                    }
                case 24:
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (!defaultTrackSelector$Parameters2.A0D) {
                        selectedPixelCount = 31;
                        break;
                    } else {
                        selectedPixelCount = 25;
                        break;
                    }
                case 25:
                    formatA01 = formatA01;
                    int selectedPixelCount4 = formatA01.A04;
                    if (A00(selectedPixelCount4, i7) >= 0) {
                        selectedPixelCount = 30;
                        break;
                    } else {
                        selectedPixelCount = 26;
                        break;
                    }
                case 26:
                    i4 = 1;
                    selectedPixelCount = 27;
                    break;
                case 27:
                    trackIndex = i4;
                    selectedPixelCount = 28;
                    break;
                case 28:
                    if (trackIndex == 0) {
                        selectedPixelCount = 16;
                        break;
                    } else {
                        selectedPixelCount = 29;
                        break;
                    }
                case 29:
                    trackGroupA01 = trackGroupA01;
                    formatA01 = formatA01;
                    trackGroup = trackGroupA01;
                    i5 = trackScore;
                    i6 = i3;
                    i7 = formatA01.A04;
                    iA0I2 = formatA01.A0I();
                    selectedPixelCount = 16;
                    break;
                case 30:
                    i4 = 0;
                    selectedPixelCount = 27;
                    break;
                case 31:
                    formatA01 = formatA01;
                    iA0I = formatA01.A0I();
                    if (iA0I == iA0I2) {
                        selectedPixelCount = 40;
                        break;
                    } else {
                        selectedPixelCount = 32;
                        break;
                    }
                case 32:
                    selectedTrackScore = A00(iA0I, iA0I2);
                    selectedPixelCount = 33;
                    break;
                case 33:
                    if (!zA0H) {
                        selectedPixelCount = 38;
                        break;
                    } else {
                        selectedPixelCount = 34;
                        break;
                    }
                case 34:
                    if (!z) {
                        selectedPixelCount = 38;
                        break;
                    } else {
                        selectedPixelCount = 35;
                        break;
                    }
                case 35:
                    if (selectedTrackScore <= 0) {
                        selectedPixelCount = 39;
                        break;
                    } else {
                        selectedPixelCount = 36;
                        break;
                    }
                case 36:
                    selectedTrackIndex = 1;
                    selectedPixelCount = 37;
                    break;
                case 37:
                    trackIndex = selectedTrackIndex;
                    selectedPixelCount = 28;
                    break;
                case 38:
                    if (selectedTrackScore >= 0) {
                        selectedPixelCount = 39;
                        break;
                    } else {
                        selectedPixelCount = 36;
                        break;
                    }
                case 39:
                    selectedTrackIndex = 0;
                    selectedPixelCount = 37;
                    break;
                case 40:
                    formatA01 = formatA01;
                    int formatPixelCount2 = formatA01.A04;
                    selectedTrackScore = A00(formatPixelCount2, i7);
                    selectedPixelCount = 33;
                    break;
                case 41:
                    trackIndex = 0;
                    selectedPixelCount = 23;
                    break;
                case 42:
                    i = 1;
                    selectedPixelCount = 19;
                    break;
                case 43:
                    z = false;
                    selectedPixelCount = 14;
                    break;
                case 44:
                    trackGroupArray2 = trackGroupArray2;
                    i8++;
                    trackGroupArray3 = trackGroupArray2;
                    selectedPixelCount = 2;
                    break;
                case 45:
                    if (trackGroup != null) {
                        selectedPixelCount = 48;
                        break;
                    } else {
                        selectedPixelCount = 46;
                        break;
                    }
                case 46:
                    bd = null;
                    selectedPixelCount = 47;
                    break;
                case 47:
                    return bd;
                case 48:
                    bd = new BD(trackGroup, i5);
                    selectedPixelCount = 47;
                    break;
            }
        }
    }

    @Nullable
    private final HQ A0B(TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C03479w {
        int[][] iArr2 = iArr;
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        BD bd = null;
        int i = 0;
        int i2 = 0;
        TrackGroup trackGroupA01 = null;
        boolean z = false;
        int[] iArr3 = null;
        boolean zA0K = false;
        Format formatA01 = null;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        TrackGroupArray trackGroupArray3 = trackGroupArray2;
        TrackGroup trackGroup = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 2;
        while (true) {
            switch (i8) {
                case 2:
                    trackGroupArray3 = trackGroupArray3;
                    if (i7 >= trackGroupArray3.A01) {
                        i8 = 32;
                        break;
                    } else {
                        i8 = 3;
                        break;
                    }
                case 3:
                    iArr2 = iArr2;
                    trackGroupArray3 = trackGroupArray3;
                    trackGroupA01 = trackGroupArray3.A01(i7);
                    iArr3 = iArr2[i7];
                    i2 = 0;
                    i8 = 4;
                    break;
                case 4:
                    trackGroupA01 = trackGroupA01;
                    if (i2 >= trackGroupA01.A01) {
                        i8 = 31;
                        break;
                    } else {
                        i8 = 5;
                        break;
                    }
                case 5:
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    iArr3 = iArr3;
                    if (!A0H(iArr3[i2], defaultTrackSelector$Parameters2.A0B)) {
                        i8 = 19;
                        break;
                    } else {
                        i8 = 6;
                        break;
                    }
                case 6:
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    trackGroupA01 = trackGroupA01;
                    formatA01 = trackGroupA01.A01(i2);
                    i = formatA01.A0D & (defaultTrackSelector$Parameters2.A00 ^ (-1));
                    z2 = true;
                    if ((i & 1) == 0) {
                        i8 = 30;
                        break;
                    } else {
                        i8 = 7;
                        break;
                    }
                case 7:
                    z = true;
                    i8 = 8;
                    break;
                case 8:
                    if ((i & 2) == 0) {
                        i8 = 29;
                        break;
                    } else {
                        i8 = 9;
                        break;
                    }
                case 9:
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    formatA01 = formatA01;
                    zA0K = A0K(formatA01, defaultTrackSelector$Parameters2.A08);
                    if (!zA0K) {
                        i8 = 10;
                        break;
                    } else {
                        i8 = 12;
                        break;
                    }
                case 10:
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    if (!defaultTrackSelector$Parameters2.A0E) {
                        i8 = 23;
                        break;
                    } else {
                        i8 = 11;
                        break;
                    }
                case 11:
                    formatA01 = formatA01;
                    if (!A0I(formatA01)) {
                        i8 = 23;
                        break;
                    } else {
                        i8 = 12;
                        break;
                    }
                case 12:
                    if (!z) {
                        i8 = 20;
                        break;
                    } else {
                        i8 = 13;
                        break;
                    }
                case 13:
                    i3 = 8;
                    i8 = 14;
                    break;
                case 14:
                    i4 = i3 + (zA0K ? 1 : 0);
                    i8 = 15;
                    break;
                case 15:
                    iArr3 = iArr3;
                    if (!A0H(iArr3[i2], false)) {
                        i8 = 17;
                        break;
                    } else {
                        i8 = 16;
                        break;
                    }
                case 16:
                    i4 += AdError.NETWORK_ERROR_CODE;
                    i8 = 17;
                    break;
                case 17:
                    if (i4 <= i6) {
                        i8 = 19;
                        break;
                    } else {
                        i8 = 18;
                        break;
                    }
                case 18:
                    trackGroupA01 = trackGroupA01;
                    trackGroup = trackGroupA01;
                    i5 = i2;
                    i6 = i4;
                    i8 = 19;
                    break;
                case 19:
                    i2++;
                    i8 = 4;
                    break;
                case 20:
                    if (!z2) {
                        i8 = 21;
                        break;
                    } else {
                        i8 = 22;
                        break;
                    }
                case 21:
                    i3 = 6;
                    i8 = 14;
                    break;
                case 22:
                    i3 = 4;
                    i8 = 14;
                    break;
                case 23:
                    if (!z) {
                        i8 = 25;
                        break;
                    } else {
                        i8 = 24;
                        break;
                    }
                case 24:
                    i4 = 3;
                    i8 = 15;
                    break;
                case 25:
                    if (!z2) {
                        i8 = 19;
                        break;
                    } else {
                        i8 = 26;
                        break;
                    }
                case 26:
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    formatA01 = formatA01;
                    if (!A0K(formatA01, defaultTrackSelector$Parameters2.A07)) {
                        i8 = 28;
                        break;
                    } else {
                        i8 = 27;
                        break;
                    }
                case 27:
                    i4 = 2;
                    i8 = 15;
                    break;
                case 28:
                    i4 = 1;
                    i8 = 15;
                    break;
                case 29:
                    z2 = false;
                    i8 = 9;
                    break;
                case 30:
                    z = false;
                    i8 = 8;
                    break;
                case 31:
                    trackGroupArray2 = trackGroupArray2;
                    i7++;
                    trackGroupArray3 = trackGroupArray2;
                    i8 = 2;
                    break;
                case 32:
                    if (trackGroup != null) {
                        i8 = 35;
                        break;
                    } else {
                        i8 = 33;
                        break;
                    }
                case 33:
                    bd = null;
                    i8 = 34;
                    break;
                case 34:
                    return bd;
                case 35:
                    bd = new BD(trackGroup, i5);
                    i8 = 34;
                    break;
            }
        }
    }

    public static List<Integer> A0D(TrackGroup trackGroup, int i, int maxVideoPixelsToRetain, boolean z) {
        int pixelCount = 0;
        int i2 = 0;
        int videoPixels = 0;
        Format formatA01 = null;
        int i3 = 0;
        int size = 0;
        int i4 = 0;
        Point pointA05 = null;
        int i5 = 0;
        ArrayList arrayList = new ArrayList(trackGroup.A01);
        int i6 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    trackGroup = trackGroup;
                    if (i6 >= trackGroup.A01) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    arrayList = arrayList;
                    arrayList.add(Integer.valueOf(i6));
                    i6++;
                    c2 = 2;
                    break;
                case 4:
                    i5 = Integer.MAX_VALUE;
                    if (i == Integer.MAX_VALUE) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (maxVideoPixelsToRetain != i5) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return arrayList;
                case 7:
                    i2 = Integer.MAX_VALUE;
                    i3 = 0;
                    c2 = '\b';
                    break;
                case '\b':
                    trackGroup = trackGroup;
                    if (i3 >= trackGroup.A01) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    trackGroup = trackGroup;
                    formatA01 = trackGroup.A01(i3);
                    if (formatA01.A0F <= 0) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    formatA01 = formatA01;
                    if (formatA01.A08 <= 0) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    formatA01 = formatA01;
                    pointA05 = A05(z, i, maxVideoPixelsToRetain, formatA01.A0F, formatA01.A08);
                    i4 = formatA01.A0F * formatA01.A08;
                    videoPixels = 1065017672;
                    if (formatA01.A0F < ((int) (pointA05.x * 0.98f))) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    formatA01 = formatA01;
                    pointA05 = pointA05;
                    if (formatA01.A08 < ((int) (pointA05.y * videoPixels))) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    if (i4 >= i2) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    i2 = i4;
                    c2 = 15;
                    break;
                case 15:
                    i3++;
                    c2 = '\b';
                    break;
                case 16:
                    if (i2 == i5) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    arrayList = arrayList;
                    size = arrayList.size() - 1;
                    c2 = 18;
                    break;
                case 18:
                    if (size < 0) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    trackGroup = trackGroup;
                    arrayList = arrayList;
                    pixelCount = trackGroup.A01(((Integer) arrayList.get(size)).intValue()).A0I();
                    if (pixelCount == -1) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 20;
                        break;
                    }
                case 20:
                    if (pixelCount <= i2) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    arrayList = arrayList;
                    arrayList.remove(size);
                    c2 = 22;
                    break;
                case 22:
                    size--;
                    c2 = 18;
                    break;
                case 23:
                    return arrayList;
            }
        }
    }

    public static void A0F(TrackGroup trackGroup, int[] iArr, int trackIndex, @Nullable String str, int i, int i2, int i3, List<Integer> list) {
        String str2 = str;
        List<Integer> list2 = list;
        int size = list2.size() - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (size < 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    trackGroup = trackGroup;
                    iArr = iArr;
                    str2 = str2;
                    list2 = list2;
                    int iIntValue = list2.get(size).intValue();
                    if (!A0L(trackGroup.A01(iIntValue), str2, iArr[iIntValue], trackIndex, i, i2, i3)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    list2 = list2;
                    list2.remove(size);
                    c2 = 5;
                    break;
                case 5:
                    size--;
                    c2 = 2;
                    break;
                case 6:
                    return;
            }
        }
    }

    public static void A0G(HO ho, int[][][] iArr, AV[] avArr, HQ[] hqArr, int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int iA01 = 0;
        HQ hq = null;
        char c2 = i == 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return;
                case 3:
                    i5 = -1;
                    i3 = -1;
                    i2 = 1;
                    i6 = 0;
                    c2 = 4;
                    break;
                case 4:
                    ho = ho;
                    i7 = 1;
                    i4 = -1;
                    if (i6 >= ho.A00()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    ho = ho;
                    hqArr = hqArr;
                    iA01 = ho.A01(i6);
                    hq = hqArr[i6];
                    if (iA01 == i7) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (iA01 != 2) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    hq = hq;
                    if (hq == null) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    ho = ho;
                    iArr = iArr;
                    hq = hq;
                    if (!A0M(iArr[i6], ho.A02(i6), hq)) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (iA01 != i7) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (i5 == i4) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    i2 = 0;
                    c2 = '\f';
                    break;
                case '\f':
                    if (i5 == i4) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    if (i3 == i4) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    if ((i2 & i7) == 0) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    avArr = avArr;
                    AV av = new AV(i);
                    avArr[i5] = av;
                    avArr[i3] = av;
                    c2 = 16;
                    break;
                case 16:
                    return;
                case 17:
                    i7 = 0;
                    c2 = 14;
                    break;
                case 18:
                    if (i3 == i4) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    i2 = 0;
                    c2 = '\f';
                    break;
                case 20:
                    i3 = i6;
                    c2 = 22;
                    break;
                case 21:
                    i5 = i6;
                    c2 = 22;
                    break;
                case 22:
                    i6++;
                    c2 = 4;
                    break;
            }
        }
    }

    public static boolean A0H(int i, boolean z) {
        boolean z2 = false;
        int i2 = i & 7;
        char c2 = i2 != 4 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (!z) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i2 != 3) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z2 = true;
                    c2 = 5;
                    break;
                case 5:
                    return z2;
                case 6:
                    z2 = false;
                    c2 = 5;
                    break;
            }
        }
    }

    public static boolean A0I(Format format) {
        boolean z = false;
        char c2 = !TextUtils.isEmpty(format.A0N) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    format = format;
                    if (!A0K(format, A0C(0, 3, 85))) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public static boolean A0J(Format format, int i, HG hg) {
        boolean z = false;
        char c2 = A0H(i, false) ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    format = format;
                    hg = hg;
                    if (format.A05 != hg.A00) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    format = format;
                    hg = hg;
                    if (format.A0C != hg.A01) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    hg = hg;
                    if (hg.A02 == null) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    format = format;
                    hg = hg;
                    if (!TextUtils.equals(hg.A02, format.A0O)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    z = true;
                    c2 = 7;
                    break;
                case 7:
                    return z;
            }
        }
    }

    public static boolean A0K(Format format, @Nullable String str) {
        boolean z = false;
        char c2 = str != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    format = format;
                    str = str;
                    if (!TextUtils.equals(str, C0560Iy.A0O(format.A0N))) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    z = true;
                    c2 = 4;
                    break;
                case 4:
                    return z;
                case 5:
                    z = false;
                    c2 = 4;
                    break;
            }
        }
    }

    public static boolean A0L(Format format, @Nullable String str, int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        boolean z = false;
        char c2 = A0H(i, false) ? (char) 2 : '\f';
        while (true) {
            switch (c2) {
                case 2:
                    if ((i & i2) == 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str = str;
                    if (str == null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    format = format;
                    str = str;
                    if (!C0560Iy.A0j(format.A0O, str)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    format = format;
                    i6 = -1;
                    if (format.A0F == -1) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    format = format;
                    if (format.A0F > i3) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    format = format;
                    if (format.A08 == i6) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    format = format;
                    if (format.A08 > i4) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    format = format;
                    if (format.A04 == i6) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    format = format;
                    if (format.A04 > i5) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    z = true;
                    c2 = '\f';
                    break;
                case '\f':
                    return z;
            }
        }
    }

    public static boolean A0M(int[][] iArr, TrackGroupArray trackGroupArray, HQ hq) {
        int iA00 = 0;
        int i = 0;
        char c2 = hq == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return false;
                case 3:
                    trackGroupArray = trackGroupArray;
                    hq = hq;
                    iA00 = trackGroupArray.A00(hq.A7B());
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    hq = hq;
                    if (i >= hq.length()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    iArr = iArr;
                    hq = hq;
                    if ((iArr[iA00][hq.A6P(i)] & 32) == 32) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return false;
                case 7:
                    i++;
                    c2 = 4;
                    break;
                case '\b':
                    return true;
            }
        }
    }

    public static int[] A0N(TrackGroup trackGroup, int[] iArr, boolean z) {
        int iA04;
        int i = 0;
        HG hg = null;
        HashSet hashSet = new HashSet();
        for (int configurationCount = 0; configurationCount < trackGroup.A01; configurationCount++) {
            Format formatA01 = trackGroup.A01(configurationCount);
            HG hg2 = new HG(formatA01.A05, formatA01.A0C, z ? null : formatA01.A0O);
            if (hashSet.add(hg2) && (iA04 = A04(trackGroup, iArr, hg2)) > i) {
                hg = hg2;
                i = iA04;
            }
        }
        if (i > 1) {
            int[] iArr2 = new int[i];
            int index = 0;
            for (int i2 = 0; i2 < trackGroup.A01; i2++) {
                if (A0J(trackGroup.A01(i2), iArr[i2], (HG) IJ.A01(hg))) {
                    iArr2[index] = i2;
                    index++;
                }
            }
            return iArr2;
        }
        return A03;
    }

    public static int[] A0O(TrackGroup trackGroup, int[] iArr, boolean z, int i, int i2, int i3, int trackIndex, int i4, int i5, boolean z2) {
        int[] iArr2 = iArr;
        TrackGroup trackGroup2 = trackGroup;
        int[] iArrA0m = null;
        String str = null;
        String str2 = null;
        int i6 = 0;
        int trackIndex2 = 0;
        int iA03 = 0;
        String str3 = null;
        List<Integer> listA0D = null;
        HashSet hashSet = null;
        int i7 = 0;
        TrackGroup trackGroup3 = trackGroup2;
        int selectedMimeTypeTrackCount = trackGroup3.A01 < 2 ? 2 : 3;
        while (true) {
            switch (selectedMimeTypeTrackCount) {
                case 2:
                    return A03;
                case 3:
                    trackGroup3 = trackGroup3;
                    listA0D = A0D(trackGroup3, i4, i5, z2);
                    int selectedMimeTypeTrackCount2 = listA0D.size();
                    if (selectedMimeTypeTrackCount2 >= 2) {
                        selectedMimeTypeTrackCount = 5;
                        break;
                    } else {
                        selectedMimeTypeTrackCount = 4;
                        break;
                    }
                case 4:
                    return A03;
                case 5:
                    if (!z) {
                        selectedMimeTypeTrackCount = 6;
                        break;
                    } else {
                        selectedMimeTypeTrackCount = 14;
                        break;
                    }
                case 6:
                    str = null;
                    hashSet = new HashSet();
                    i6 = 0;
                    trackIndex2 = 0;
                    selectedMimeTypeTrackCount = 7;
                    break;
                case 7:
                    listA0D = listA0D;
                    int selectedMimeTypeTrackCount3 = listA0D.size();
                    if (trackIndex2 >= selectedMimeTypeTrackCount3) {
                        selectedMimeTypeTrackCount = 15;
                        break;
                    } else {
                        selectedMimeTypeTrackCount = 8;
                        break;
                    }
                case 8:
                    trackGroup3 = trackGroup3;
                    listA0D = listA0D;
                    hashSet = hashSet;
                    int selectedMimeTypeTrackCount4 = listA0D.get(trackIndex2).intValue();
                    str2 = trackGroup3.A01(selectedMimeTypeTrackCount4).A0O;
                    if (!hashSet.add(str2)) {
                        selectedMimeTypeTrackCount = 12;
                        break;
                    } else {
                        selectedMimeTypeTrackCount = 9;
                        break;
                    }
                case 9:
                    trackGroup2 = trackGroup2;
                    iArr2 = iArr2;
                    listA0D = listA0D;
                    str2 = str2;
                    str3 = str2;
                    i7 = i6;
                    iA03 = A03(trackGroup2, iArr2, i, str2, i2, i3, trackIndex, listA0D);
                    if (iA03 <= i7) {
                        selectedMimeTypeTrackCount = 13;
                        break;
                    } else {
                        selectedMimeTypeTrackCount = 10;
                        break;
                    }
                case 10:
                    str3 = str3;
                    str = str3;
                    i6 = iA03;
                    selectedMimeTypeTrackCount = 11;
                    break;
                case 11:
                    trackIndex2++;
                    selectedMimeTypeTrackCount = 7;
                    break;
                case 12:
                    i7 = i6;
                    selectedMimeTypeTrackCount = 13;
                    break;
                case 13:
                    i6 = i7;
                    selectedMimeTypeTrackCount = 11;
                    break;
                case 14:
                    str = null;
                    selectedMimeTypeTrackCount = 15;
                    break;
                case 15:
                    trackGroup2 = trackGroup2;
                    iArr2 = iArr2;
                    listA0D = listA0D;
                    A0F(trackGroup2, iArr2, i, str, i2, i3, trackIndex, listA0D);
                    if (listA0D.size() >= 2) {
                        selectedMimeTypeTrackCount = 18;
                        break;
                    } else {
                        selectedMimeTypeTrackCount = 16;
                        break;
                    }
                case 16:
                    iArrA0m = A03;
                    selectedMimeTypeTrackCount = 17;
                    break;
                case 17:
                    return iArrA0m;
                case 18:
                    listA0D = listA0D;
                    iArrA0m = C0560Iy.A0m(listA0D);
                    selectedMimeTypeTrackCount = 17;
                    break;
            }
        }
    }

    private final HQ[] A0P(HO ho, int[][][] iArr, int[] iArr2, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C03479w {
        int[] iArr3 = iArr2;
        HO ho2 = ho;
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters;
        int[][][] iArr4 = iArr;
        BK bk = this;
        boolean z = false;
        TrackGroupArray trackGroupArrayA02 = null;
        boolean z2 = false;
        int rendererCount = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        HP hp = null;
        int i4 = 0;
        int iA01 = 0;
        int i5 = 0;
        boolean z3 = false;
        int[][] iArr5 = null;
        boolean z4 = false;
        BK bk2 = bk;
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters3 = defaultTrackSelector$Parameters2;
        int iA00 = ho2.A00();
        HQ[] hqArr = new HQ[iA00];
        boolean z5 = false;
        boolean z6 = false;
        int i6 = 0;
        int i7 = 2;
        while (true) {
            switch (i7) {
                case 2:
                    i3 = 2;
                    if (i6 >= iA00) {
                        i7 = 14;
                        break;
                    } else {
                        i7 = 3;
                        break;
                    }
                case 3:
                    ho2 = ho2;
                    if (i3 != ho2.A01(i6)) {
                        i7 = 10;
                        break;
                    } else {
                        i7 = 4;
                        break;
                    }
                case 4:
                    if (!z6) {
                        i7 = 5;
                        break;
                    } else {
                        i7 = 13;
                        break;
                    }
                case 5:
                    bk = bk;
                    iArr4 = iArr4;
                    iArr3 = iArr3;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    bk2 = bk2;
                    ho2 = ho2;
                    hqArr = hqArr;
                    z4 = true;
                    hqArr[i6] = bk.A09(ho2.A02(i6), iArr4[i6], iArr3[i6], defaultTrackSelector$Parameters2, bk2.A00);
                    if (hqArr[i6] == null) {
                        i7 = 12;
                        break;
                    } else {
                        i7 = 6;
                        break;
                    }
                case 6:
                    z3 = true;
                    i7 = 7;
                    break;
                case 7:
                    z6 = z3;
                    i7 = 8;
                    break;
                case 8:
                    ho2 = ho2;
                    if (ho2.A02(i6).A01 <= 0) {
                        i7 = 11;
                        break;
                    } else {
                        i7 = 9;
                        break;
                    }
                case 9:
                    z5 |= z4;
                    i7 = 10;
                    break;
                case 10:
                    i6++;
                    i7 = 2;
                    break;
                case 11:
                    z4 = false;
                    i7 = 9;
                    break;
                case 12:
                    z3 = false;
                    i7 = 7;
                    break;
                case 13:
                    z4 = true;
                    i7 = 8;
                    break;
                case 14:
                    i4 = 1;
                    z2 = false;
                    i = 0;
                    i5 = 0;
                    i7 = 15;
                    break;
                case 15:
                    if (i5 >= iA00) {
                        i7 = 34;
                        break;
                    } else {
                        i7 = 16;
                        break;
                    }
                case 16:
                    ho2 = ho2;
                    iA01 = ho2.A01(i5);
                    if (iA01 == i4) {
                        i7 = 26;
                        break;
                    } else {
                        i7 = 17;
                        break;
                    }
                case 17:
                    if (iA01 == i3) {
                        i7 = 20;
                        break;
                    } else {
                        i7 = 18;
                        break;
                    }
                case 18:
                    if (iA01 == 3) {
                        i7 = 21;
                        break;
                    } else {
                        i7 = 19;
                        break;
                    }
                case 19:
                    iArr4 = iArr4;
                    bk2 = bk2;
                    ho2 = ho2;
                    defaultTrackSelector$Parameters3 = defaultTrackSelector$Parameters3;
                    hqArr = hqArr;
                    hqArr[i5] = bk2.A06(iA01, ho2.A02(i5), iArr4[i5], defaultTrackSelector$Parameters3);
                    i7 = 20;
                    break;
                case 20:
                    i5++;
                    i7 = 15;
                    break;
                case 21:
                    if (i != 0) {
                        i7 = 20;
                        break;
                    } else {
                        i7 = 22;
                        break;
                    }
                case 22:
                    iArr4 = iArr4;
                    bk2 = bk2;
                    ho2 = ho2;
                    defaultTrackSelector$Parameters3 = defaultTrackSelector$Parameters3;
                    hqArr = hqArr;
                    hqArr[i5] = bk2.A0B(ho2.A02(i5), iArr4[i5], defaultTrackSelector$Parameters3);
                    if (hqArr[i5] == null) {
                        i7 = 25;
                        break;
                    } else {
                        i7 = 23;
                        break;
                    }
                case 23:
                    rendererCount = 1;
                    i7 = 24;
                    break;
                case 24:
                    i = rendererCount;
                    i7 = 20;
                    break;
                case 25:
                    rendererCount = 0;
                    i7 = 24;
                    break;
                case 26:
                    if (!z2) {
                        i7 = 27;
                        break;
                    } else {
                        i7 = 20;
                        break;
                    }
                case 27:
                    iArr4 = iArr4;
                    iArr3 = iArr3;
                    ho2 = ho2;
                    trackGroupArrayA02 = ho2.A02(i5);
                    iArr5 = iArr4[i5];
                    i2 = iArr3[i5];
                    if (!z5) {
                        i7 = 33;
                        break;
                    } else {
                        i7 = 28;
                        break;
                    }
                case 28:
                    hp = null;
                    i7 = 29;
                    break;
                case 29:
                    bk = bk;
                    defaultTrackSelector$Parameters2 = defaultTrackSelector$Parameters2;
                    hqArr = hqArr;
                    trackGroupArrayA02 = trackGroupArrayA02;
                    iArr5 = iArr5;
                    hqArr[i5] = bk.A08(trackGroupArrayA02, iArr5, i2, defaultTrackSelector$Parameters2, hp);
                    if (hqArr[i5] == null) {
                        i7 = 32;
                        break;
                    } else {
                        i7 = 30;
                        break;
                    }
                case 30:
                    z = true;
                    i7 = 31;
                    break;
                case 31:
                    z2 = z;
                    i7 = 20;
                    break;
                case 32:
                    z = false;
                    i7 = 31;
                    break;
                case 33:
                    bk2 = bk2;
                    hp = bk2.A00;
                    i7 = 29;
                    break;
                case 34:
                    return hqArr;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1073bJ
    public final Pair<AV[], HQ[]> A0V(HO ho, int[][][] iArr, int[] iArr2) throws C03479w {
        HO ho2 = ho;
        BK bk = this;
        AV av = null;
        AV[] avArr = null;
        boolean z = false;
        DefaultTrackSelector$SelectionOverride defaultTrackSelector$SelectionOverrideA05 = null;
        int i = 0;
        int i2 = 0;
        TrackGroupArray trackGroupArrayA02 = null;
        AV av2 = null;
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = bk.A01.get();
        int iA00 = ho2.A00();
        HQ[] hqArrA0P = bk.A0P(ho2, iArr, iArr2, defaultTrackSelector$Parameters);
        int i3 = 0;
        int i4 = 2;
        while (true) {
            switch (i4) {
                case 2:
                    av2 = null;
                    i = 1;
                    if (i3 >= iA00) {
                        i4 = 12;
                        break;
                    } else {
                        i4 = 3;
                        break;
                    }
                case 3:
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    if (!defaultTrackSelector$Parameters.A06(i3)) {
                        i4 = 6;
                        break;
                    } else {
                        i4 = 4;
                        break;
                    }
                case 4:
                    hqArrA0P = hqArrA0P;
                    av2 = null;
                    hqArrA0P[i3] = null;
                    i4 = 5;
                    break;
                case 5:
                    i3++;
                    i4 = 2;
                    break;
                case 6:
                    ho2 = ho2;
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    trackGroupArrayA02 = ho2.A02(i3);
                    if (!defaultTrackSelector$Parameters.A07(i3, trackGroupArrayA02)) {
                        i4 = 5;
                        break;
                    } else {
                        i4 = 7;
                        break;
                    }
                case 7:
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    trackGroupArrayA02 = trackGroupArrayA02;
                    defaultTrackSelector$SelectionOverrideA05 = defaultTrackSelector$Parameters.A05(i3, trackGroupArrayA02);
                    if (defaultTrackSelector$SelectionOverrideA05 != null) {
                        i4 = 9;
                        break;
                    } else {
                        i4 = 8;
                        break;
                    }
                case 8:
                    hqArrA0P = hqArrA0P;
                    av2 = null;
                    hqArrA0P[i3] = null;
                    i4 = 5;
                    break;
                case 9:
                    defaultTrackSelector$SelectionOverrideA05 = defaultTrackSelector$SelectionOverrideA05;
                    int i5 = defaultTrackSelector$SelectionOverrideA05.A01;
                    if (i5 != i) {
                        i4 = 11;
                        break;
                    } else {
                        i4 = 10;
                        break;
                    }
                case 10:
                    hqArrA0P = hqArrA0P;
                    trackGroupArrayA02 = trackGroupArrayA02;
                    defaultTrackSelector$SelectionOverrideA05 = defaultTrackSelector$SelectionOverrideA05;
                    hqArrA0P[i3] = new BD(trackGroupArrayA02.A01(defaultTrackSelector$SelectionOverrideA05.A00), defaultTrackSelector$SelectionOverrideA05.A02[0]);
                    i4 = 5;
                    break;
                case 11:
                    bk = bk;
                    hqArrA0P = hqArrA0P;
                    trackGroupArrayA02 = trackGroupArrayA02;
                    defaultTrackSelector$SelectionOverrideA05 = defaultTrackSelector$SelectionOverrideA05;
                    hqArrA0P[i3] = ((HP) IJ.A01(bk.A00)).A4T(trackGroupArrayA02.A01(defaultTrackSelector$SelectionOverrideA05.A00), defaultTrackSelector$SelectionOverrideA05.A02);
                    i4 = 5;
                    break;
                case 12:
                    avArr = new AV[iA00];
                    i2 = 0;
                    i4 = 13;
                    break;
                case 13:
                    if (i2 >= iA00) {
                        i4 = 23;
                        break;
                    } else {
                        i4 = 14;
                        break;
                    }
                case 14:
                    defaultTrackSelector$Parameters = defaultTrackSelector$Parameters;
                    if (!defaultTrackSelector$Parameters.A06(i2)) {
                        i4 = 15;
                        break;
                    } else {
                        i4 = 22;
                        break;
                    }
                case 15:
                    ho2 = ho2;
                    if (ho2.A01(i2) == 5) {
                        i4 = 17;
                        break;
                    } else {
                        i4 = 16;
                        break;
                    }
                case 16:
                    hqArrA0P = hqArrA0P;
                    if (hqArrA0P[i2] == null) {
                        i4 = 22;
                        break;
                    } else {
                        i4 = 17;
                        break;
                    }
                case 17:
                    z = true;
                    i4 = 18;
                    break;
                case 18:
                    if (!z) {
                        i4 = 21;
                        break;
                    } else {
                        i4 = 19;
                        break;
                    }
                case 19:
                    av = AV.A01;
                    i4 = 20;
                    break;
                case 20:
                    avArr = avArr;
                    avArr[i2] = av;
                    i2++;
                    i4 = 13;
                    break;
                case 21:
                    av = av2;
                    i4 = 20;
                    break;
                case 22:
                    z = false;
                    i4 = 18;
                    break;
                case 23:
                    HQ[] hqArr = hqArrA0P;
                    AV[] avArr2 = avArr;
                    A0G(ho2, iArr, avArr2, hqArr, defaultTrackSelector$Parameters.A04);
                    return Pair.create(avArr2, hqArr);
            }
        }
    }
}
