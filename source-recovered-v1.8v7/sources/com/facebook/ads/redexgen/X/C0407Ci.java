package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import d.b.a.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ci, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0407Ci {
    public static byte[] A00;
    public static final int A01;
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 33 out of bounds for length 24
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C0416Cy A0C(Z4 z4, Z5 z5, long j, DrmInitData drmInitData, boolean z, boolean z2) throws AF {
        long j2 = j;
        Z4 z4A06 = z4.A06(AbstractC0402Cd.A0d);
        int iA02 = A02(z4A06.A07(AbstractC0402Cd.A0V).A00);
        if (iA02 == -1) {
            return null;
        }
        C0406Ch c0406ChA0B = A0B(z4.A07(AbstractC0402Cd.A1J).A00);
        if (j2 == -9223372036854775807L) {
            j2 = c0406ChA0B.A02;
        }
        long jA04 = A04(z5.A00);
        long jA0G = j2 == -9223372036854775807L ? -9223372036854775807L : C0560Iy.A0G(j2, 1000000L, jA04);
        Z4 z4A062 = z4A06.A06(AbstractC0402Cd.A0h).A06(AbstractC0402Cd.A16);
        Pair<Long, String> pairA06 = A06(z4A06.A07(AbstractC0402Cd.A0c).A00);
        C0405Cg c0405CgA0A = A0A(z4A062.A07(AbstractC0402Cd.A1A).A00, c0406ChA0B.A00, c0406ChA0B.A01, (String) pairA06.second, drmInitData, z2);
        long[] jArr = null;
        long[] jArr2 = null;
        if (!z) {
            Pair<long[], long[]> pairA05 = A05(z4.A06(AbstractC0402Cd.A0N));
            jArr = (long[]) pairA05.first;
            jArr2 = (long[]) pairA05.second;
        }
        if (c0405CgA0A.A02 == null) {
            return null;
        }
        return new C0416Cy(c0406ChA0B.A00, iA02, ((Long) pairA06.first).longValue(), jA04, jA0G, c0405CgA0A.A02, c0405CgA0A.A01, c0405CgA0A.A03, c0405CgA0A.A00, jArr, jArr2);
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 77);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0J() {
        A00 = new byte[]{-16, -1, -1, -5, -8, -14, -16, 3, -8, -2, -3, -66, 7, -68, -4, -1, -61, -68, 5, 3, 3, 31, 46, 46, 42, 39, 33, 31, 50, 39, 45, 44, -19, 54, -21, 43, 46, -14, -21, 33, 35, 31, -21, -12, -18, -10, 12, 32, 15, 20, 26, -38, 33, 25, 15, -39, 15, 31, 30, -39, 19, 15, -24, 27, 22, 20, -9, 8, 25, 26, 12, 25, 26, -15, -13, -4, 1, -72, -52, -69, -64, -58, -122, -72, -70, -118, 26, 35, 26, 39, 26, 18, 33, 14, -14, -26, 56, 43, 51, 39, 47, 52, 47, 52, 45, 25, 39, 51, 54, 50, 43, 57, 15, 52, 9, 46, 59, 52, 49, -26, 1, -3, 3, -4, -58, -21, -32, -20, -21, -16, -26, -16, -15, -30, -21, -15, -99, -16, -15, -33, -23, -99, -33, -20, -11, -99, -29, -20, -17, -99, -15, -17, -34, -32, -24, -99, -64, -65, -64, -48, -8, -21, -26, -25, -15, -79, -6, -81, -8, -16, -26, -80, -15, -16, -76, -80, -8, -14, -69, -20, -32, 50, 37, 45, 33, 41, 46, 41, 46, 39, 20, 41, 45, 37, 51, 52, 33, 45, 48, 4, 37, 44, 52, 33, 3, 40, 33, 46, 39, 37, 51, -32, -10, -8, -27, -9, 59, 44, 63, 59, -56, -69, -74, -73, -63, -127, -77, -56, -75, -61, -31, -48, -46, -38, -113, -41, -48, -30, -113, -35, -34, -113, -30, -48, -36, -33, -37, -44, -113, -29, -48, -47, -37, -44, -113, -30, -40, -23, -44, -113, -40, -35, -43, -34, -31, -36, -48, -29, -40, -34, -35, -23, -18, -17, -14, -22, -57, -6, -11, -13, -39, -17, 0, -21, -90, -7, -18, -11, -5, -14, -22, -90, -24, -21, -90, -10, -11, -7, -17, -6, -17, -4, -21, -66, -51, -51, -55, -58, -64, -66, -47, -58, -52, -53, -116, -47, -47, -54, -55, -120, -43, -54, -55, -47, -60, -65, -64, -54, -118, -114, -62, -53, -53, 2, -11, -16, -15, 16, 36, 19, 24, 30, -34, 20, 16, 18, -30, -60, -45, -45, -49, -52, -58, -60, -41, -52, -46, -47, -110, -37, -112, -44, -40, -52, -58, -50, -41, -52, -48, -56, -112, -41, -37, -106, -54, 18, 38, 21, 26, 32, -32, 18, 29, 18, 20, 42, 29, 24, 25, 35, -29, 44, -31, 42, 34, 24, -30, 35, 34, -26, -30, 42, 36, -20, -16, 4, -13, -8, -2, -66, -4, -1, -12, -10, -51, -36, -36, -40, -43, -49, -51, -32, -43, -37, -38, -101, -28, -103, -49, -51, -39, -47, -34, -51, -103, -39, -37, -32, -43, -37, -38, -12, 13, 18, 20, 15, 15, 14, 17, 19, 4, 3, -65, 12, 4, 3, 8, 0, -65, 17, 0, 19, 4, -51, -35, -48, -53, -52, -42, -106, -49, -52, -35, -54, -7, -5, 4, -7, -38, -18, -35, -30, -24, -88, -26, -23, -83, -38, -90, -27, -38, -19, -26, -106, -76, -69, -68, -65, -74, -69, -76, 109, -78, -79, -74, -63, 109, -71, -74, -64, -63, -121, 109, -78, -79, -74, -63, 109, -79, -68, -78, -64, 109, -69, -68, -63, 109, -64, -63, -82, -65, -63, 109, -60, -74, -63, -75, 109, -82, 109, -64, -58, -69, -80, 109, -64, -82, -70, -67, -71, -78, 123, 13, 33, 16, 21, 27, -37, 13, 25, 30, -39, 35, 14, -57, -69, 13, 0, 8, -4, 4, 9, 4, 9, 2, -18, -4, 8, 11, 7, 0, 14, -36, 15, -17, 4, 8, 0, 14, 15, -4, 8, 11, -33, 0, 7, 15, -4, -69, -16, 4, -13, -8, -2, -66, 5, -3, -13, -67, -13, 3, 2, 52, 36, 41, 42, -31, 34, 53, 48, 46, -31, 42, 52, -31, 46, 34, 47, 37, 34, 53, 48, 51, 58, 27, 10, 28, 20, 30, 29, 30, -20, -2, 18, 1, 6, 12, -52, 15, -2, 20, -22, -2, -19, -14, -8, -72, -1, -9, -19, -73, -19, -3, -4, -73, -15, -19, -60, -7, -5, -8, -17, -14, -11, -18, -58, -11, -21, -5, -66, -46, -63, -58, -52, -116, -112, -60, -51, -51, -28, -54, 28, 15, 23, 11, 19, 24, 19, 24, 17, -3, 35, 24, 13, 18, 28, 25, 24, 19, 36, 11, 30, 19, 25, 24, -3, 11, 23, 26, 22, 15, 29, -54, -75, -63, -68, -80, 111, -80, -61, -66, -68, 111, -72, -62, 111, -68, -80, -67, -77, -80, -61, -66, -63, -56, -62, -77, -68, -79, 110, -81, -62, -67, -69, 110, -73, -63, 110, -69, -81, -68, -78, -81, -62, -67, -64, -57};
    }

    static {
        A0J();
        A07 = C0560Iy.A08(A0I(333, 4, 63));
        A04 = C0560Iy.A08(A0I(k.AppCompatTheme_windowFixedWidthMajor, 4, 65));
        A06 = C0560Iy.A08(A0I(216, 4, k.AppCompatTheme_windowMinWidthMajor));
        A03 = C0560Iy.A08(A0I(634, 4, 91));
        A05 = C0560Iy.A08(A0I(212, 4, 54));
        A01 = C0560Iy.A08(A0I(86, 4, 106));
        A02 = C0560Iy.A08(A0I(90, 4, 96));
    }

    public static float A00(C0544Ii c0544Ii, int i) {
        c0544Ii.A0Y(i + 8);
        return c0544Ii.A0H() / c0544Ii.A0H();
    }

    public static int A01(C0544Ii c0544Ii) {
        int iA0E = c0544Ii.A0E();
        int i = iA0E & 127;
        int size = 2;
        while (true) {
            switch (size) {
                case 2:
                    if ((iA0E & 128) != 128) {
                        size = 4;
                        break;
                    } else {
                        size = 3;
                        break;
                    }
                case 3:
                    c0544Ii = c0544Ii;
                    iA0E = c0544Ii.A0E();
                    int size2 = iA0E & 127;
                    i = (i << 7) | size2;
                    size = 2;
                    break;
                case 4:
                    return i;
            }
        }
    }

    public static int A02(C0544Ii c0544Ii) {
        c0544Ii.A0Y(16);
        int trackType = c0544Ii.A08();
        char c2 = trackType == A04 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return 1;
                case 3:
                    if (trackType != A07) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return 2;
                case 5:
                    if (trackType == A06) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (trackType == A03) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (trackType == A05) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (trackType != A01) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return 3;
                case '\n':
                    if (trackType != A02) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return 4;
                case '\f':
                    return -1;
            }
        }
    }

    public static int A03(C0544Ii c0544Ii, int childAtomSize, int i) {
        int iA08 = 0;
        boolean z = false;
        int iA06 = c0544Ii.A06();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (iA06 - childAtomSize >= i) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Y(iA06);
                    iA08 = c0544Ii.A08();
                    if (iA08 <= 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    c0544Ii = c0544Ii;
                    IJ.A05(z, A0I(271, 32, 57));
                    if (c0544Ii.A08() != AbstractC0402Cd.A0S) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return iA06;
                case 7:
                    iA06 += iA08;
                    c2 = 2;
                    break;
                case '\b':
                    z = false;
                    c2 = 5;
                    break;
                case '\t':
                    return -1;
            }
        }
    }

    public static long A04(C0544Ii c0544Ii) {
        int fullAtom = 8;
        c0544Ii.A0Y(8);
        int version = AbstractC0402Cd.A01(c0544Ii.A08());
        if (version != 0) {
            fullAtom = 16;
        }
        c0544Ii.A0Z(fullAtom);
        return c0544Ii.A0M();
    }

    public static Pair<long[], long[]> A05(Z4 z4) {
        long[] jArr = null;
        long jA0N = 0;
        short s = 0;
        long[] jArr2 = null;
        Z5 z5A07 = null;
        int iA0H = 0;
        long jA08 = 0;
        int i = 0;
        C0544Ii c0544Ii = null;
        int iA01 = 0;
        char c2 = z4 != null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    z4 = z4;
                    z5A07 = z4.A07(AbstractC0402Cd.A0O);
                    if (z5A07 != null) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return Pair.create(null, null);
                case 4:
                    z5A07 = z5A07;
                    c0544Ii = z5A07.A00;
                    c0544Ii.A0Y(8);
                    iA01 = AbstractC0402Cd.A01(c0544Ii.A08());
                    iA0H = c0544Ii.A0H();
                    jArr2 = new long[iA0H];
                    jArr = new long[iA0H];
                    i = 0;
                    c2 = 5;
                    break;
                case 5:
                    if (i >= iA0H) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    s = 1;
                    if (iA01 != 1) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    c0544Ii = c0544Ii;
                    jA0N = c0544Ii.A0N();
                    c2 = '\b';
                    break;
                case '\b':
                    jArr2 = jArr2;
                    jArr2[i] = jA0N;
                    if (iA01 != s) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0544Ii = c0544Ii;
                    jA08 = c0544Ii.A0L();
                    c2 = '\n';
                    break;
                case '\n':
                    c0544Ii = c0544Ii;
                    jArr = jArr;
                    jArr[i] = jA08;
                    if (c0544Ii.A0U() != s) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Z(2);
                    i++;
                    c2 = 5;
                    break;
                case '\f':
                    c0544Ii = c0544Ii;
                    jA08 = c0544Ii.A08();
                    c2 = '\n';
                    break;
                case '\r':
                    c0544Ii = c0544Ii;
                    jA0N = c0544Ii.A0M();
                    c2 = '\b';
                    break;
                case 14:
                    throw new IllegalArgumentException(A0I(441, 23, 82));
                case 15:
                    return Pair.create(jArr2, jArr);
            }
        }
    }

    public static Pair<Long, String> A06(C0544Ii c0544Ii) {
        long jA0M = 0;
        int i = 0;
        int version = 8;
        c0544Ii.A0Y(8);
        int iA01 = AbstractC0402Cd.A01(c0544Ii.A08());
        char c2 = iA01 == 0 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    i = 8;
                    c2 = 3;
                    break;
                case 3:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Z(i);
                    jA0M = c0544Ii.A0M();
                    if (iA01 != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    version = 4;
                    c2 = 5;
                    break;
                case 5:
                    C0544Ii c0544Ii2 = c0544Ii;
                    c0544Ii2.A0Z(version);
                    int iA0I = c0544Ii2.A0I();
                    return Pair.create(Long.valueOf(jA0M), A0I(94, 0, 58) + ((char) (((iA0I >> 10) & 31) + 96)) + ((char) (((iA0I >> 5) & 31) + 96)) + ((char) ((iA0I & 31) + 96)));
                case 6:
                    i = 16;
                    c2 = 3;
                    break;
            }
        }
    }

    public static Pair<String, byte[]> A07(C0544Ii c0544Ii, int i) {
        String strA03 = null;
        c0544Ii.A0Y(i + 8 + 4);
        c0544Ii.A0Z(1);
        A01(c0544Ii);
        c0544Ii.A0Z(2);
        int iA0E = c0544Ii.A0E();
        int flags = iA0E & 128;
        int flags2 = flags != 0 ? 2 : 3;
        while (true) {
            switch (flags2) {
                case 2:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Z(2);
                    flags2 = 3;
                    break;
                case 3:
                    if ((iA0E & 64) == 0) {
                        flags2 = 5;
                        break;
                    } else {
                        flags2 = 4;
                        break;
                    }
                case 4:
                    c0544Ii = c0544Ii;
                    int flags3 = c0544Ii.A0I();
                    c0544Ii.A0Z(flags3);
                    flags2 = 5;
                    break;
                case 5:
                    int flags4 = iA0E & 32;
                    if (flags4 == 0) {
                        flags2 = 7;
                        break;
                    } else {
                        flags2 = 6;
                        break;
                    }
                case 6:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Z(2);
                    flags2 = 7;
                    break;
                case 7:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Z(1);
                    A01(c0544Ii);
                    int flags5 = c0544Ii.A0E();
                    strA03 = C0537Ib.A03(flags5);
                    String mimeType = A0I(404, 10, 66);
                    if (!mimeType.equals(strA03)) {
                        flags2 = 8;
                        break;
                    } else {
                        flags2 = 10;
                        break;
                    }
                case 8:
                    strA03 = strA03;
                    String mimeType2 = A0I(599, 13, 66);
                    if (!mimeType2.equals(strA03)) {
                        flags2 = 9;
                        break;
                    } else {
                        flags2 = 10;
                        break;
                    }
                case 9:
                    strA03 = strA03;
                    String mimeType3 = A0I(46, 16, 94);
                    if (!mimeType3.equals(strA03)) {
                        flags2 = 11;
                        break;
                    } else {
                        flags2 = 10;
                        break;
                    }
                case 10:
                    return Pair.create(strA03, null);
                case 11:
                    C0544Ii c0544Ii2 = c0544Ii;
                    c0544Ii2.A0Z(12);
                    c0544Ii2.A0Z(1);
                    int iA01 = A01(c0544Ii2);
                    byte[] bArr = new byte[iA01];
                    c0544Ii2.A0c(bArr, 0, iA01);
                    return Pair.create(strA03, bArr);
            }
        }
    }

    public static Pair<Integer, C0417Cz> A08(C0544Ii c0544Ii, int schemeInformationBoxPosition, int schemeInformationBoxSize) {
        C0417Cz c0417CzA0D = null;
        boolean z = false;
        boolean z2 = false;
        int iA08 = 0;
        boolean z3 = false;
        int iA082 = 0;
        int i = schemeInformationBoxPosition + 8;
        int i2 = -1;
        int i3 = 0;
        String strA0S = null;
        Integer numValueOf = null;
        int childAtomType = 2;
        while (true) {
            switch (childAtomType) {
                case 2:
                    if (i - schemeInformationBoxPosition >= schemeInformationBoxSize) {
                        childAtomType = 10;
                        break;
                    } else {
                        childAtomType = 3;
                        break;
                    }
                case 3:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Y(i);
                    iA08 = c0544Ii.A08();
                    iA082 = c0544Ii.A08();
                    int childAtomType2 = AbstractC0402Cd.A0T;
                    if (iA082 != childAtomType2) {
                        childAtomType = 6;
                        break;
                    } else {
                        childAtomType = 4;
                        break;
                    }
                case 4:
                    c0544Ii = c0544Ii;
                    int childAtomType3 = c0544Ii.A08();
                    numValueOf = Integer.valueOf(childAtomType3);
                    childAtomType = 5;
                    break;
                case 5:
                    i += iA08;
                    childAtomType = 2;
                    break;
                case 6:
                    int childAtomType4 = AbstractC0402Cd.A0z;
                    if (iA082 != childAtomType4) {
                        childAtomType = 8;
                        break;
                    } else {
                        childAtomType = 7;
                        break;
                    }
                case 7:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Z(4);
                    strA0S = c0544Ii.A0S(4);
                    childAtomType = 5;
                    break;
                case 8:
                    if (iA082 != AbstractC0402Cd.A0y) {
                        childAtomType = 5;
                        break;
                    } else {
                        childAtomType = 9;
                        break;
                    }
                case 9:
                    i2 = i;
                    i3 = iA08;
                    childAtomType = 5;
                    break;
                case 10:
                    if (!A0I(474, 4, 73).equals(strA0S)) {
                        childAtomType = 11;
                        break;
                    } else {
                        childAtomType = 14;
                        break;
                    }
                case 11:
                    if (!A0I(638, 4, 110).equals(strA0S)) {
                        childAtomType = 12;
                        break;
                    } else {
                        childAtomType = 14;
                        break;
                    }
                case 12:
                    if (!A0I(73, 4, 65).equals(strA0S)) {
                        childAtomType = 13;
                        break;
                    } else {
                        childAtomType = 14;
                        break;
                    }
                case 13:
                    if (!A0I(156, 4, 16).equals(strA0S)) {
                        childAtomType = 23;
                        break;
                    } else {
                        childAtomType = 14;
                        break;
                    }
                case 14:
                    z = true;
                    if (numValueOf == null) {
                        childAtomType = 22;
                        break;
                    } else {
                        childAtomType = 15;
                        break;
                    }
                case 15:
                    z3 = true;
                    childAtomType = 16;
                    break;
                case 16:
                    IJ.A05(z3, A0I(723, 22, 2));
                    if (i2 == -1) {
                        childAtomType = 21;
                        break;
                    } else {
                        childAtomType = 17;
                        break;
                    }
                case 17:
                    z2 = true;
                    childAtomType = 18;
                    break;
                case 18:
                    c0544Ii = c0544Ii;
                    IJ.A05(z2, A0I(612, 22, k.AppCompatTheme_windowActionBarOverlay));
                    c0417CzA0D = A0D(c0544Ii, i2, i3, strA0S);
                    if (c0417CzA0D == null) {
                        childAtomType = 20;
                        break;
                    } else {
                        childAtomType = 19;
                        break;
                    }
                case 19:
                    IJ.A05(z, A0I(745, 22, 1));
                    return Pair.create(numValueOf, c0417CzA0D);
                case 20:
                    z = false;
                    childAtomType = 19;
                    break;
                case 21:
                    z2 = false;
                    childAtomType = 18;
                    break;
                case 22:
                    z3 = false;
                    childAtomType = 16;
                    break;
                case 23:
                    return (Pair) null;
            }
        }
    }

    public static Pair<Integer, C0417Cz> A09(C0544Ii c0544Ii, int childAtomSize, int childAtomType) {
        Pair<Integer, C0417Cz> pairA08 = null;
        boolean z = false;
        int iA08 = 0;
        int iA06 = c0544Ii.A06();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (iA06 - childAtomSize >= childAtomType) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Y(iA06);
                    iA08 = c0544Ii.A08();
                    if (iA08 <= 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    z = true;
                    c2 = 5;
                    break;
                case 5:
                    c0544Ii = c0544Ii;
                    IJ.A05(z, A0I(271, 32, 57));
                    if (c0544Ii.A08() != AbstractC0402Cd.A13) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0544Ii = c0544Ii;
                    pairA08 = A08(c0544Ii, iA06, iA08);
                    if (pairA08 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return pairA08;
                case '\b':
                    iA06 += iA08;
                    c2 = 2;
                    break;
                case '\t':
                    z = false;
                    c2 = 5;
                    break;
                case '\n':
                    return (Pair) null;
            }
        }
    }

    public static C0405Cg A0A(C0544Ii c0544Ii, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws AF {
        DrmInitData drmInitData2 = drmInitData;
        C0544Ii c0544Ii2 = c0544Ii;
        String str2 = str;
        int iA08 = 0;
        int childAtomType = 0;
        int iA06 = 0;
        boolean z2 = false;
        int childAtomType2 = 0;
        C0544Ii c0544Ii3 = c0544Ii2;
        c0544Ii3.A0Y(12);
        int iA082 = c0544Ii2.A08();
        C0405Cg c0405Cg = new C0405Cg(iA082);
        int i3 = 0;
        int childStartPosition = 2;
        while (true) {
            switch (childStartPosition) {
                case 2:
                    if (i3 >= iA082) {
                        childStartPosition = 42;
                        break;
                    } else {
                        childStartPosition = 3;
                        break;
                    }
                case 3:
                    c0544Ii2 = c0544Ii2;
                    iA06 = c0544Ii2.A06();
                    iA08 = c0544Ii2.A08();
                    if (iA08 <= 0) {
                        childStartPosition = 41;
                        break;
                    } else {
                        childStartPosition = 4;
                        break;
                    }
                case 4:
                    z2 = true;
                    childStartPosition = 5;
                    break;
                case 5:
                    c0544Ii2 = c0544Ii2;
                    IJ.A05(z2, A0I(271, 32, 57));
                    childAtomType2 = c0544Ii2.A08();
                    int childStartPosition2 = AbstractC0402Cd.A06;
                    if (childAtomType2 == childStartPosition2) {
                        childStartPosition = 40;
                        break;
                    } else {
                        childStartPosition = 6;
                        break;
                    }
                case 6:
                    int i4 = AbstractC0402Cd.A07;
                    if (childAtomType2 == i4) {
                        childStartPosition = 40;
                        break;
                    } else {
                        childStartPosition = 7;
                        break;
                    }
                case 7:
                    int i5 = AbstractC0402Cd.A0R;
                    if (childAtomType2 == i5) {
                        childStartPosition = 40;
                        break;
                    } else {
                        childStartPosition = 8;
                        break;
                    }
                case 8:
                    int i6 = AbstractC0402Cd.A0l;
                    if (childAtomType2 == i6) {
                        childStartPosition = 40;
                        break;
                    } else {
                        childStartPosition = 9;
                        break;
                    }
                case 9:
                    int i7 = AbstractC0402Cd.A0X;
                    if (childAtomType2 == i7) {
                        childStartPosition = 40;
                        break;
                    } else {
                        childStartPosition = 10;
                        break;
                    }
                case 10:
                    int i8 = AbstractC0402Cd.A0W;
                    if (childAtomType2 == i8) {
                        childStartPosition = 40;
                        break;
                    } else {
                        childStartPosition = 11;
                        break;
                    }
                case 11:
                    int i9 = AbstractC0402Cd.A0s;
                    if (childAtomType2 == i9) {
                        childStartPosition = 40;
                        break;
                    } else {
                        childStartPosition = 12;
                        break;
                    }
                case 12:
                    int i10 = AbstractC0402Cd.A1S;
                    if (childAtomType2 == i10) {
                        childStartPosition = 40;
                        break;
                    } else {
                        childStartPosition = 13;
                        break;
                    }
                case 13:
                    int i11 = AbstractC0402Cd.A1T;
                    if (childAtomType2 != i11) {
                        childStartPosition = 17;
                        break;
                    } else {
                        childStartPosition = 14;
                        break;
                    }
                case 14:
                    childAtomType = childAtomType2;
                    childStartPosition = 15;
                    break;
                case 15:
                    c0544Ii2 = c0544Ii2;
                    drmInitData2 = drmInitData2;
                    c0405Cg = c0405Cg;
                    A0K(c0544Ii2, childAtomType, iA06, iA08, i, i2, drmInitData2, c0405Cg, i3);
                    childStartPosition = 16;
                    break;
                case 16:
                    c0544Ii3 = c0544Ii3;
                    int i12 = iA06 + iA08;
                    c0544Ii3.A0Y(i12);
                    i3++;
                    childStartPosition = 2;
                    break;
                case 17:
                    int childStartPosition3 = AbstractC0402Cd.A0k;
                    if (childAtomType2 == childStartPosition3) {
                        childStartPosition = 31;
                        break;
                    } else {
                        childStartPosition = 18;
                        break;
                    }
                case 18:
                    int i13 = AbstractC0402Cd.A0Q;
                    if (childAtomType2 == i13) {
                        childStartPosition = 31;
                        break;
                    } else {
                        childStartPosition = 19;
                        break;
                    }
                case 19:
                    int childStartPosition4 = AbstractC0402Cd.A04;
                    if (childAtomType2 == childStartPosition4) {
                        childStartPosition = 31;
                        break;
                    } else {
                        childStartPosition = 20;
                        break;
                    }
                case 20:
                    int childStartPosition5 = AbstractC0402Cd.A0M;
                    if (childAtomType2 == childStartPosition5) {
                        childStartPosition = 31;
                        break;
                    } else {
                        childStartPosition = 21;
                        break;
                    }
                case 21:
                    int childStartPosition6 = AbstractC0402Cd.A0I;
                    if (childAtomType2 == childStartPosition6) {
                        childStartPosition = 31;
                        break;
                    } else {
                        childStartPosition = 22;
                        break;
                    }
                case 22:
                    int childStartPosition7 = AbstractC0402Cd.A0J;
                    if (childAtomType2 == childStartPosition7) {
                        childStartPosition = 31;
                        break;
                    } else {
                        childStartPosition = 23;
                        break;
                    }
                case 23:
                    int childStartPosition8 = AbstractC0402Cd.A0K;
                    if (childAtomType2 == childStartPosition8) {
                        childStartPosition = 31;
                        break;
                    } else {
                        childStartPosition = 24;
                        break;
                    }
                case 24:
                    int childStartPosition9 = AbstractC0402Cd.A0L;
                    if (childAtomType2 == childStartPosition9) {
                        childStartPosition = 31;
                        break;
                    } else {
                        childStartPosition = 25;
                        break;
                    }
                case 25:
                    int childStartPosition10 = AbstractC0402Cd.A0v;
                    if (childAtomType2 == childStartPosition10) {
                        childStartPosition = 31;
                        break;
                    } else {
                        childStartPosition = 26;
                        break;
                    }
                case 26:
                    if (childAtomType2 == AbstractC0402Cd.A0w) {
                        childStartPosition = 31;
                        break;
                    } else {
                        childStartPosition = 27;
                        break;
                    }
                case 27:
                    int childStartPosition11 = AbstractC0402Cd.A0a;
                    if (childAtomType2 == childStartPosition11) {
                        childStartPosition = 31;
                        break;
                    } else {
                        childStartPosition = 28;
                        break;
                    }
                case 28:
                    int childStartPosition12 = AbstractC0402Cd.A14;
                    if (childAtomType2 == childStartPosition12) {
                        childStartPosition = 31;
                        break;
                    } else {
                        childStartPosition = 29;
                        break;
                    }
                case 29:
                    if (childAtomType2 == AbstractC0402Cd.A03) {
                        childStartPosition = 31;
                        break;
                    } else {
                        childStartPosition = 30;
                        break;
                    }
                case 30:
                    int i14 = AbstractC0402Cd.A05;
                    if (childAtomType2 != i14) {
                        childStartPosition = 32;
                        break;
                    } else {
                        childStartPosition = 31;
                        break;
                    }
                case 31:
                    c0544Ii2 = c0544Ii2;
                    str2 = str2;
                    drmInitData2 = drmInitData2;
                    c0405Cg = c0405Cg;
                    A0M(c0544Ii2, childAtomType2, iA06, iA08, i, str2, z, drmInitData2, c0405Cg, i3);
                    childStartPosition = 16;
                    break;
                case 32:
                    if (childAtomType2 == AbstractC0402Cd.A02) {
                        childStartPosition = 37;
                        break;
                    } else {
                        childStartPosition = 33;
                        break;
                    }
                case 33:
                    if (childAtomType2 == AbstractC0402Cd.A1O) {
                        childStartPosition = 37;
                        break;
                    } else {
                        childStartPosition = 34;
                        break;
                    }
                case 34:
                    int childStartPosition13 = AbstractC0402Cd.A1W;
                    if (childAtomType2 == childStartPosition13) {
                        childStartPosition = 37;
                        break;
                    } else {
                        childStartPosition = 35;
                        break;
                    }
                case 35:
                    if (childAtomType2 == AbstractC0402Cd.A18) {
                        childStartPosition = 37;
                        break;
                    } else {
                        childStartPosition = 36;
                        break;
                    }
                case 36:
                    if (childAtomType2 != AbstractC0402Cd.A09) {
                        childStartPosition = 38;
                        break;
                    } else {
                        childStartPosition = 37;
                        break;
                    }
                case 37:
                    str2 = str2;
                    c0405Cg = c0405Cg;
                    c0544Ii2 = c0544Ii2;
                    childAtomType2 = childAtomType2;
                    iA06 = iA06;
                    iA08 = iA08;
                    A0L(c0544Ii2, childAtomType2, iA06, iA08, i, str2, c0405Cg);
                    childStartPosition = 16;
                    break;
                case 38:
                    if (childAtomType2 != AbstractC0402Cd.A0A) {
                        childStartPosition = 16;
                        break;
                    } else {
                        childStartPosition = 39;
                        break;
                    }
                case 39:
                    c0405Cg = c0405Cg;
                    c0405Cg.A02 = Format.A0B(Integer.toString(i), A0I(414, 27, 31), null, -1, null);
                    childStartPosition = 16;
                    break;
                case 40:
                    childAtomType = childAtomType2;
                    childStartPosition = 15;
                    break;
                case 41:
                    z2 = false;
                    childStartPosition = 5;
                    break;
                case 42:
                    return c0405Cg;
            }
        }
    }

    public static C0406Ch A0B(C0544Ii c0544Ii) {
        C0544Ii c0544Ii2 = c0544Ii;
        int fullAtom = 0;
        int version = 0;
        int trackId = 0;
        int a10 = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int a11 = 0;
        int i3 = 0;
        int rotationDegrees = 0;
        int iA08 = 0;
        int i4 = 0;
        long jA0M = 0;
        int i5 = 8;
        c0544Ii2.A0Y(8);
        int iA01 = AbstractC0402Cd.A01(c0544Ii2.A08());
        int durationPosition = iA01 == 0 ? 2 : 34;
        while (true) {
            switch (durationPosition) {
                case 2:
                    a10 = 8;
                    durationPosition = 3;
                    break;
                case 3:
                    c0544Ii2 = c0544Ii2;
                    c0544Ii2.A0Z(a10);
                    iA08 = c0544Ii2.A08();
                    i3 = 4;
                    c0544Ii2.A0Z(4);
                    z = true;
                    version = c0544Ii2.A06();
                    if (iA01 != 0) {
                        durationPosition = 5;
                        break;
                    } else {
                        durationPosition = 4;
                        break;
                    }
                case 4:
                    i5 = 4;
                    durationPosition = 5;
                    break;
                case 5:
                    i = 0;
                    durationPosition = 6;
                    break;
                case 6:
                    if (i >= i5) {
                        durationPosition = 9;
                        break;
                    } else {
                        durationPosition = 7;
                        break;
                    }
                case 7:
                    c0544Ii2 = c0544Ii2;
                    int a01 = version + i;
                    if (c0544Ii2.A00[a01] == -1) {
                        durationPosition = 33;
                        break;
                    } else {
                        durationPosition = 8;
                        break;
                    }
                case 8:
                    z = false;
                    durationPosition = 9;
                    break;
                case 9:
                    if (!z) {
                        durationPosition = 28;
                        break;
                    } else {
                        durationPosition = 10;
                        break;
                    }
                case 10:
                    c0544Ii2 = c0544Ii2;
                    c0544Ii2.A0Z(i5);
                    jA0M = -9223372036854775807L;
                    durationPosition = 11;
                    break;
                case 11:
                    c0544Ii2 = c0544Ii2;
                    c0544Ii2.A0Z(16);
                    fullAtom = c0544Ii2.A08();
                    trackId = c0544Ii2.A08();
                    c0544Ii2.A0Z(i3);
                    rotationDegrees = c0544Ii2.A08();
                    i2 = c0544Ii2.A08();
                    a11 = 65536;
                    if (fullAtom != 0) {
                        durationPosition = 17;
                        break;
                    } else {
                        durationPosition = 12;
                        break;
                    }
                case 12:
                    if (trackId != a11) {
                        durationPosition = 17;
                        break;
                    } else {
                        durationPosition = 13;
                        break;
                    }
                case 13:
                    if (rotationDegrees != (-a11)) {
                        durationPosition = 17;
                        break;
                    } else {
                        durationPosition = 14;
                        break;
                    }
                case 14:
                    if (i2 != 0) {
                        durationPosition = 17;
                        break;
                    } else {
                        durationPosition = 15;
                        break;
                    }
                case 15:
                    i4 = 90;
                    durationPosition = 16;
                    break;
                case 16:
                    return new C0406Ch(iA08, jA0M, i4);
                case 17:
                    if (fullAtom != 0) {
                        durationPosition = 22;
                        break;
                    } else {
                        durationPosition = 18;
                        break;
                    }
                case 18:
                    int a012 = -a11;
                    if (trackId != a012) {
                        durationPosition = 22;
                        break;
                    } else {
                        durationPosition = 19;
                        break;
                    }
                case 19:
                    if (rotationDegrees != a11) {
                        durationPosition = 22;
                        break;
                    } else {
                        durationPosition = 20;
                        break;
                    }
                case 20:
                    if (i2 != 0) {
                        durationPosition = 22;
                        break;
                    } else {
                        durationPosition = 21;
                        break;
                    }
                case 21:
                    i4 = 270;
                    durationPosition = 16;
                    break;
                case 22:
                    int a013 = -a11;
                    if (fullAtom != a013) {
                        durationPosition = 27;
                        break;
                    } else {
                        durationPosition = 23;
                        break;
                    }
                case 23:
                    if (trackId != 0) {
                        durationPosition = 27;
                        break;
                    } else {
                        durationPosition = 24;
                        break;
                    }
                case 24:
                    if (rotationDegrees != 0) {
                        durationPosition = 27;
                        break;
                    } else {
                        durationPosition = 25;
                        break;
                    }
                case 25:
                    if (i2 != (-a11)) {
                        durationPosition = 27;
                        break;
                    } else {
                        durationPosition = 26;
                        break;
                    }
                case 26:
                    i4 = 180;
                    durationPosition = 16;
                    break;
                case 27:
                    i4 = 0;
                    durationPosition = 16;
                    break;
                case 28:
                    if (iA01 != 0) {
                        durationPosition = 32;
                        break;
                    } else {
                        durationPosition = 29;
                        break;
                    }
                case 29:
                    c0544Ii2 = c0544Ii2;
                    jA0M = c0544Ii2.A0M();
                    durationPosition = 30;
                    break;
                case 30:
                    if (jA0M != 0) {
                        durationPosition = 11;
                        break;
                    } else {
                        durationPosition = 31;
                        break;
                    }
                case 31:
                    jA0M = -9223372036854775807L;
                    durationPosition = 11;
                    break;
                case 32:
                    c0544Ii2 = c0544Ii2;
                    jA0M = c0544Ii2.A0N();
                    durationPosition = 30;
                    break;
                case 33:
                    i++;
                    durationPosition = 6;
                    break;
                case 34:
                    a10 = 16;
                    durationPosition = 3;
                    break;
            }
        }
    }

    public static C0417Cz A0D(C0544Ii c0544Ii, int childPosition, int i, String str) {
        int fullAtom = childPosition + 8;
        while (fullAtom - childPosition < i) {
            c0544Ii.A0Y(fullAtom);
            int constantIvSize = c0544Ii.A08();
            if (c0544Ii.A08() == AbstractC0402Cd.A1G) {
                int version = AbstractC0402Cd.A01(c0544Ii.A08());
                boolean z = true;
                c0544Ii.A0Z(1);
                int i2 = 0;
                int i3 = 0;
                if (version == 0) {
                    c0544Ii.A0Z(1);
                } else {
                    int defaultSkipByteBlock = c0544Ii.A0E();
                    int patternByte = defaultSkipByteBlock & 240;
                    i2 = patternByte >> 4;
                    i3 = defaultSkipByteBlock & 15;
                }
                int version2 = c0544Ii.A0E();
                if (version2 != 1) {
                    z = false;
                }
                int iA0E = c0544Ii.A0E();
                byte[] bArr = new byte[16];
                int defaultPerSampleIvSize = bArr.length;
                c0544Ii.A0c(bArr, 0, defaultPerSampleIvSize);
                byte[] bArr2 = null;
                if (z && iA0E == 0) {
                    int iA0E2 = c0544Ii.A0E();
                    bArr2 = new byte[iA0E2];
                    c0544Ii.A0c(bArr2, 0, iA0E2);
                }
                return new C0417Cz(z, str, iA0E, bArr, i2, i3, bArr2);
            }
            fullAtom += constantIvSize;
        }
        return null;
    }

    /* JADX WARN: Incorrect condition in loop: B:121:0x032e */
    /* JADX WARN: Incorrect condition in loop: B:130:0x0371 */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.D1 A0E(com.facebook.ads.redexgen.X.C0416Cy r42, com.facebook.ads.redexgen.X.Z4 r43, com.facebook.ads.redexgen.X.CG r44) throws com.facebook.ads.redexgen.X.AF {
        /*
            Method dump skipped, instructions count: 1188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0407Ci.A0E(com.facebook.ads.redexgen.X.Cy, com.facebook.ads.redexgen.X.Z4, com.facebook.ads.redexgen.X.CG):com.facebook.ads.redexgen.X.D1");
    }

    public static Metadata A0F(Z5 z5, boolean z) {
        int iA06 = 0;
        int i = 0;
        C0544Ii c0544Ii = null;
        int iA08 = 0;
        char c2 = z ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (Metadata) null;
                case 3:
                    z5 = z5;
                    c0544Ii = z5.A00;
                    i = 8;
                    c0544Ii.A0Y(8);
                    c2 = 4;
                    break;
                case 4:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A04() < i) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0544Ii = c0544Ii;
                    iA06 = c0544Ii.A06();
                    iA08 = c0544Ii.A08();
                    if (c0544Ii.A08() != AbstractC0402Cd.A0g) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    C0544Ii c0544Ii2 = c0544Ii;
                    c0544Ii2.A0Y(iA06);
                    return A0H(c0544Ii2, iA06 + iA08);
                case 7:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Z(iA08 - 8);
                    c2 = 4;
                    break;
                case '\b':
                    return (Metadata) null;
            }
        }
    }

    public static Metadata A0G(C0544Ii c0544Ii, int i) {
        Metadata.Entry entryA01 = null;
        Metadata metadata = null;
        c0544Ii.A0Z(8);
        ArrayList arrayList = new ArrayList();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A06() >= i) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0544Ii = c0544Ii;
                    entryA01 = C0413Cq.A01(c0544Ii);
                    if (entryA01 == null) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    arrayList = arrayList;
                    entryA01 = entryA01;
                    arrayList.add(entryA01);
                    c2 = 2;
                    break;
                case 5:
                    arrayList = arrayList;
                    if (!arrayList.isEmpty()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    metadata = null;
                    c2 = 7;
                    break;
                case 7:
                    return metadata;
                case '\b':
                    arrayList = arrayList;
                    metadata = new Metadata(arrayList);
                    c2 = 7;
                    break;
            }
        }
    }

    public static Metadata A0H(C0544Ii c0544Ii, int i) {
        int atomType = 0;
        int iA06 = 0;
        c0544Ii.A0Z(12);
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii = c0544Ii;
                    if (c0544Ii.A06() >= i) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0544Ii = c0544Ii;
                    iA06 = c0544Ii.A06();
                    atomType = c0544Ii.A08();
                    if (c0544Ii.A08() != AbstractC0402Cd.A0Z) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    C0544Ii c0544Ii2 = c0544Ii;
                    c0544Ii2.A0Y(iA06);
                    return A0G(c0544Ii2, iA06 + atomType);
                case 5:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Z(atomType - 8);
                    c2 = 2;
                    break;
                case 6:
                    return (Metadata) null;
            }
        }
    }

    public static void A0K(C0544Ii c0544Ii, int i, int i2, int i3, int i4, int width, DrmInitData drmInitData, C0405Cg c0405Cg, int i5) throws AF {
        DrmInitData drmInitData2 = drmInitData;
        C0544Ii c0544Ii2 = c0544Ii;
        C0405Cg c0405Cg2 = c0405Cg;
        int iIntValue = i;
        int i6 = 0;
        List<byte[]> listSingletonList = null;
        float fA00 = 0.0f;
        int atomType = 0;
        byte[] bArrA0O = null;
        String strA0I = null;
        int i7 = 0;
        List<byte[]> list = null;
        boolean z = false;
        int stereoMode = 0;
        J0 j0A00 = null;
        Pair<Integer, C0417Cz> pairA09 = null;
        boolean z2 = false;
        DrmInitData drmInitDataA04 = null;
        int iA08 = 0;
        int i8 = 0;
        int i9 = 0;
        int iA0E = 0;
        String strA0I2 = null;
        int iA082 = 0;
        boolean z3 = false;
        C0544Ii c0544Ii3 = c0544Ii2;
        c0544Ii3.A0Y(i2 + 8 + 8);
        c0544Ii3.A0Z(16);
        int iA0I = c0544Ii2.A0I();
        int iA0I2 = c0544Ii2.A0I();
        c0544Ii3.A0Z(50);
        int iA06 = c0544Ii2.A06();
        int childPosition = iIntValue == AbstractC0402Cd.A0R ? 2 : 57;
        while (true) {
            switch (childPosition) {
                case 2:
                    c0544Ii3 = c0544Ii3;
                    pairA09 = A09(c0544Ii3, i2, i3);
                    if (pairA09 == null) {
                        childPosition = 6;
                        break;
                    } else {
                        childPosition = 3;
                        break;
                    }
                case 3:
                    drmInitData2 = drmInitData2;
                    pairA09 = pairA09;
                    iIntValue = ((Integer) pairA09.first).intValue();
                    if (drmInitData2 != null) {
                        childPosition = 56;
                        break;
                    } else {
                        childPosition = 4;
                        break;
                    }
                case 4:
                    drmInitDataA04 = null;
                    childPosition = 5;
                    break;
                case 5:
                    c0405Cg2 = c0405Cg2;
                    pairA09 = pairA09;
                    drmInitData2 = drmInitDataA04;
                    c0405Cg2.A03[i5] = (C0417Cz) pairA09.second;
                    childPosition = 6;
                    break;
                case 6:
                    c0544Ii3 = c0544Ii3;
                    c0544Ii3.A0Y(iA06);
                    i7 = iIntValue;
                    childPosition = 7;
                    break;
                case 7:
                    z3 = false;
                    listSingletonList = null;
                    strA0I2 = null;
                    bArrA0O = null;
                    i6 = -1;
                    fA00 = 1.0f;
                    i9 = iA06;
                    childPosition = 8;
                    break;
                case 8:
                    int childPosition2 = i9 - i2;
                    if (childPosition2 >= i3) {
                        childPosition = 11;
                        break;
                    } else {
                        childPosition = 9;
                        break;
                    }
                case 9:
                    c0544Ii2 = c0544Ii2;
                    c0544Ii3 = c0544Ii3;
                    c0544Ii3.A0Y(i9);
                    stereoMode = c0544Ii2.A06();
                    iA08 = c0544Ii2.A08();
                    if (iA08 != 0) {
                        childPosition = 13;
                        break;
                    } else {
                        childPosition = 10;
                        break;
                    }
                case 10:
                    c0544Ii2 = c0544Ii2;
                    if (c0544Ii2.A06() - i2 != i3) {
                        childPosition = 13;
                        break;
                    } else {
                        childPosition = 11;
                        break;
                    }
                case 11:
                    if (strA0I2 != null) {
                        childPosition = 58;
                        break;
                    } else {
                        childPosition = 12;
                        break;
                    }
                case 12:
                    return;
                case 13:
                    z2 = false;
                    i8 = 1;
                    if (iA08 <= 0) {
                        childPosition = 55;
                        break;
                    } else {
                        childPosition = 14;
                        break;
                    }
                case 14:
                    z = true;
                    childPosition = 15;
                    break;
                case 15:
                    c0544Ii2 = c0544Ii2;
                    IJ.A05(z, A0I(271, 32, 57));
                    iA082 = c0544Ii2.A08();
                    if (iA082 != AbstractC0402Cd.A08) {
                        childPosition = 22;
                        break;
                    } else {
                        childPosition = 16;
                        break;
                    }
                case 16:
                    if (strA0I2 != null) {
                        childPosition = 18;
                        break;
                    } else {
                        childPosition = 17;
                        break;
                    }
                case 17:
                    z2 = true;
                    childPosition = 18;
                    break;
                case 18:
                    c0544Ii2 = c0544Ii2;
                    c0544Ii3 = c0544Ii3;
                    c0405Cg2 = c0405Cg2;
                    IJ.A04(z2);
                    strA0I2 = A0I(220, 9, 5);
                    c0544Ii3.A0Y(stereoMode + 8);
                    j0A00 = J0.A00(c0544Ii2);
                    list = j0A00.A04;
                    c0405Cg2.A00 = j0A00.A02;
                    if (!z3) {
                        childPosition = 19;
                        break;
                    } else {
                        childPosition = 20;
                        break;
                    }
                case 19:
                    j0A00 = j0A00;
                    fA00 = j0A00.A00;
                    childPosition = 20;
                    break;
                case 20:
                    list = list;
                    listSingletonList = list;
                    childPosition = 21;
                    break;
                case 21:
                    i9 += iA08;
                    childPosition = 8;
                    break;
                case 22:
                    if (iA082 != AbstractC0402Cd.A0Y) {
                        childPosition = 26;
                        break;
                    } else {
                        childPosition = 23;
                        break;
                    }
                case 23:
                    if (strA0I2 != null) {
                        childPosition = 25;
                        break;
                    } else {
                        childPosition = 24;
                        break;
                    }
                case 24:
                    z2 = true;
                    childPosition = 25;
                    break;
                case 25:
                    c0544Ii2 = c0544Ii2;
                    c0544Ii3 = c0544Ii3;
                    c0405Cg2 = c0405Cg2;
                    IJ.A04(z2);
                    strA0I2 = A0I(464, 10, 26);
                    c0544Ii3.A0Y(stereoMode + 8);
                    J6 j6A00 = J6.A00(c0544Ii2);
                    listSingletonList = j6A00.A01;
                    c0405Cg2.A00 = j6A00.A00;
                    childPosition = 21;
                    break;
                case 26:
                    if (iA082 != AbstractC0402Cd.A1U) {
                        childPosition = 33;
                        break;
                    } else {
                        childPosition = 27;
                        break;
                    }
                case 27:
                    if (strA0I2 != null) {
                        childPosition = 29;
                        break;
                    } else {
                        childPosition = 28;
                        break;
                    }
                case 28:
                    z2 = true;
                    childPosition = 29;
                    break;
                case 29:
                    IJ.A04(z2);
                    if (i7 != AbstractC0402Cd.A1S) {
                        childPosition = 32;
                        break;
                    } else {
                        childPosition = 30;
                        break;
                    }
                case 30:
                    strA0I = A0I(385, 19, 103);
                    childPosition = 31;
                    break;
                case 31:
                    strA0I = strA0I;
                    strA0I2 = strA0I;
                    childPosition = 21;
                    break;
                case 32:
                    strA0I = A0I(160, 19, 53);
                    childPosition = 31;
                    break;
                case 33:
                    int childPosition3 = AbstractC0402Cd.A0D;
                    if (iA082 != childPosition3) {
                        childPosition = 37;
                        break;
                    } else {
                        childPosition = 34;
                        break;
                    }
                case 34:
                    if (strA0I2 != null) {
                        childPosition = 36;
                        break;
                    } else {
                        childPosition = 35;
                        break;
                    }
                case 35:
                    z2 = true;
                    childPosition = 36;
                    break;
                case 36:
                    IJ.A04(z2);
                    strA0I2 = A0I(323, 10, 14);
                    childPosition = 21;
                    break;
                case 37:
                    int childPosition4 = AbstractC0402Cd.A0S;
                    if (iA082 != childPosition4) {
                        childPosition = 41;
                        break;
                    } else {
                        childPosition = 38;
                        break;
                    }
                case 38:
                    if (strA0I2 != null) {
                        childPosition = 40;
                        break;
                    } else {
                        childPosition = 39;
                        break;
                    }
                case 39:
                    z2 = true;
                    childPosition = 40;
                    break;
                case 40:
                    c0544Ii3 = c0544Ii3;
                    IJ.A04(z2);
                    Pair<String, byte[]> pairA07 = A07(c0544Ii3, stereoMode);
                    strA0I2 = (String) pairA07.first;
                    listSingletonList = Collections.singletonList(pairA07.second);
                    childPosition = 21;
                    break;
                case 41:
                    if (iA082 != AbstractC0402Cd.A0p) {
                        childPosition = 43;
                        break;
                    } else {
                        childPosition = 42;
                        break;
                    }
                case 42:
                    c0544Ii3 = c0544Ii3;
                    fA00 = A00(c0544Ii3, stereoMode);
                    z3 = true;
                    childPosition = 21;
                    break;
                case 43:
                    if (iA082 != AbstractC0402Cd.A1F) {
                        childPosition = 45;
                        break;
                    } else {
                        childPosition = 44;
                        break;
                    }
                case 44:
                    c0544Ii3 = c0544Ii3;
                    bArrA0O = A0O(c0544Ii3, stereoMode, iA08);
                    childPosition = 21;
                    break;
                case 45:
                    int childPosition5 = AbstractC0402Cd.A15;
                    if (iA082 != childPosition5) {
                        childPosition = 21;
                        break;
                    } else {
                        childPosition = 46;
                        break;
                    }
                case 46:
                    c0544Ii2 = c0544Ii2;
                    c0544Ii3 = c0544Ii3;
                    int iA0E2 = c0544Ii2.A0E();
                    atomType = 3;
                    c0544Ii3.A0Z(3);
                    if (iA0E2 != 0) {
                        childPosition = 21;
                        break;
                    } else {
                        childPosition = 47;
                        break;
                    }
                case 47:
                    c0544Ii2 = c0544Ii2;
                    iA0E = c0544Ii2.A0E();
                    if (iA0E == 0) {
                        childPosition = 54;
                        break;
                    } else {
                        childPosition = 48;
                        break;
                    }
                case 48:
                    int childPosition6 = i8;
                    if (iA0E == childPosition6) {
                        childPosition = 53;
                        break;
                    } else {
                        childPosition = 49;
                        break;
                    }
                case 49:
                    if (iA0E == 2) {
                        childPosition = 52;
                        break;
                    } else {
                        childPosition = 50;
                        break;
                    }
                case 50:
                    if (iA0E == atomType) {
                        childPosition = 51;
                        break;
                    } else {
                        childPosition = 21;
                        break;
                    }
                case 51:
                    i6 = 3;
                    childPosition = 21;
                    break;
                case 52:
                    i6 = 2;
                    childPosition = 21;
                    break;
                case 53:
                    i6 = 1;
                    childPosition = 21;
                    break;
                case 54:
                    i6 = 0;
                    childPosition = 21;
                    break;
                case 55:
                    z = false;
                    childPosition = 15;
                    break;
                case 56:
                    drmInitData2 = drmInitData2;
                    pairA09 = pairA09;
                    drmInitDataA04 = drmInitData2.A04(((C0417Cz) pairA09.second).A02);
                    childPosition = 5;
                    break;
                case 57:
                    i7 = iIntValue;
                    childPosition = 7;
                    break;
                case 58:
                    c0405Cg2.A02 = Format.A04(Integer.toString(i4), strA0I2, null, -1, -1, iA0I, iA0I2, -1.0f, listSingletonList, width, fA00, bArrA0O, i6, null, drmInitData2);
                    return;
            }
        }
    }

    public static void A0L(C0544Ii c0544Ii, int i, int i2, int i3, int i4, String str, C0405Cg c0405Cg) throws AF {
        C0405Cg c0405Cg2 = c0405Cg;
        String strA0I = null;
        c0544Ii.A0Y(i2 + 8 + 8);
        List listSingletonList = null;
        long j = Long.MAX_VALUE;
        char c2 = i == AbstractC0402Cd.A02 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    strA0I = A0I(303, 20, 16);
                    c2 = 3;
                    break;
                case 3:
                    c0405Cg2.A02 = Format.A09(Integer.toString(i4), strA0I, null, -1, 0, str, -1, null, j, listSingletonList);
                    return;
                case 4:
                    if (i != AbstractC0402Cd.A1O) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0544Ii = c0544Ii;
                    strA0I = A0I(347, 28, 22);
                    int i5 = (i3 - 8) - 8;
                    byte[] bArr = new byte[i5];
                    c0544Ii.A0c(bArr, 0, i5);
                    listSingletonList = Collections.singletonList(bArr);
                    c2 = 3;
                    break;
                case 6:
                    if (i != AbstractC0402Cd.A1W) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    strA0I = A0I(0, 21, 66);
                    c2 = 3;
                    break;
                case '\b':
                    if (i != AbstractC0402Cd.A18) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    strA0I = A0I(303, 20, 16);
                    j = 0;
                    c2 = 3;
                    break;
                case '\n':
                    if (i != AbstractC0402Cd.A09) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c0405Cg2 = c0405Cg2;
                    strA0I = A0I(21, 25, 113);
                    c0405Cg2.A01 = 1;
                    c2 = 3;
                    break;
                case '\f':
                    throw new IllegalStateException();
            }
        }
    }

    public static void A0M(C0544Ii c0544Ii, int i, int i2, int esdsAtomPosition, int channelCount, String str, boolean z, DrmInitData drmInitData, C0405Cg c0405Cg, int i3) throws AF {
        String str2 = str;
        C0405Cg c0405Cg2 = c0405Cg;
        DrmInitData drmInitData2 = drmInitData;
        C0544Ii c0544Ii2 = c0544Ii;
        int pcmEncoding = 0;
        int i4 = 0;
        String string = null;
        List listSingletonList = null;
        int i5 = 0;
        int i6 = 0;
        int iIntValue = 0;
        int atomType = 0;
        String mimeType = null;
        int childPosition = 0;
        DrmInitData drmInitDataA04 = null;
        String str3 = null;
        Pair<Integer, C0417Cz> pairA09 = null;
        int iA03 = 0;
        List list = null;
        int i7 = 0;
        byte[] bArr = null;
        String str4 = null;
        int i8 = 0;
        String str5 = null;
        String str6 = null;
        int iA0I = 0;
        DrmInitData drmInitData3 = null;
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        int esdsAtomPosition2 = 0;
        int i11 = 0;
        int iA08 = 0;
        int esdsAtomPosition3 = 0;
        DrmInitData drmInitData4 = null;
        int iIntValue2 = 0;
        int i12 = 0;
        int iA0F = 0;
        int iA0H = 0;
        String strA0I = null;
        DrmInitData drmInitData5 = null;
        int i13 = 0;
        int i14 = 0;
        int esdsAtomPosition4 = 0;
        int iA082 = 0;
        C0544Ii c0544Ii3 = c0544Ii2;
        String str7 = str2;
        c0544Ii3.A0Y(i2 + 8 + 8);
        char c2 = z ? (char) 2 : 'D';
        while (true) {
            switch (c2) {
                case 2:
                    c0544Ii2 = c0544Ii2;
                    c0544Ii3 = c0544Ii3;
                    esdsAtomPosition2 = c0544Ii2.A0I();
                    c0544Ii3.A0Z(6);
                    c2 = 3;
                    break;
                case 3:
                    i5 = 2;
                    i9 = 16;
                    i11 = 1;
                    if (esdsAtomPosition2 == 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (esdsAtomPosition2 != i11) {
                        c2 = 'B';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c0544Ii2 = c0544Ii2;
                    c0544Ii3 = c0544Ii3;
                    iA0I = c0544Ii2.A0I();
                    c0544Ii3.A0Z(6);
                    iA0F = c0544Ii2.A0F();
                    if (esdsAtomPosition2 != i11) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0544Ii3 = c0544Ii3;
                    c0544Ii3.A0Z(i9);
                    c2 = 7;
                    break;
                case 7:
                    iA0H = iA0I;
                    c2 = '\b';
                    break;
                case '\b':
                    c0544Ii2 = c0544Ii2;
                    esdsAtomPosition3 = c0544Ii2.A06();
                    list = null;
                    iIntValue2 = i;
                    if (iIntValue2 != AbstractC0402Cd.A0Q) {
                        c2 = 'A';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c0544Ii3 = c0544Ii3;
                    pairA09 = A09(c0544Ii3, i2, esdsAtomPosition);
                    if (pairA09 == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    drmInitData2 = drmInitData2;
                    pairA09 = pairA09;
                    iIntValue2 = ((Integer) pairA09.first).intValue();
                    if (drmInitData2 != null) {
                        c2 = '@';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    list = null;
                    drmInitDataA04 = null;
                    c2 = '\f';
                    break;
                case '\f':
                    c0405Cg2 = c0405Cg2;
                    pairA09 = pairA09;
                    drmInitData2 = drmInitDataA04;
                    c0405Cg2.A03[i3] = (C0417Cz) pairA09.second;
                    c2 = '\r';
                    break;
                case '\r':
                    c0544Ii3 = c0544Ii3;
                    c0544Ii3.A0Y(esdsAtomPosition3);
                    drmInitData5 = drmInitData2;
                    i12 = iIntValue2;
                    c2 = 14;
                    break;
                case 14:
                    strA0I = null;
                    if (i12 != AbstractC0402Cd.A04) {
                        c2 = ',';
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    strA0I = A0I(77, 9, 10);
                    c2 = 16;
                    break;
                case 16:
                    bArr = null;
                    atomType = iA0H;
                    i8 = esdsAtomPosition3;
                    iIntValue = iA0F;
                    str3 = strA0I;
                    c2 = 17;
                    break;
                case 17:
                    i14 = -1;
                    if (i8 - i2 >= esdsAtomPosition) {
                        c2 = 'E';
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c0544Ii2 = c0544Ii2;
                    c0544Ii3 = c0544Ii3;
                    c0544Ii3.A0Y(i8);
                    iA082 = c0544Ii2.A08();
                    if (iA082 <= 0) {
                        c2 = '+';
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    z2 = true;
                    c2 = 20;
                    break;
                case 20:
                    c0544Ii2 = c0544Ii2;
                    IJ.A05(z2, A0I(271, 32, 57));
                    iA08 = c0544Ii2.A08();
                    if (iA08 == AbstractC0402Cd.A0S) {
                        c2 = '*';
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    if (!z) {
                        c2 = ' ';
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    if (iA08 != AbstractC0402Cd.A1V) {
                        c2 = ' ';
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    mimeType = str3;
                    drmInitData4 = drmInitData5;
                    i13 = iA08;
                    i7 = i8;
                    c2 = 24;
                    break;
                case 24:
                    if (i13 != AbstractC0402Cd.A0S) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    iA03 = i7;
                    c2 = 26;
                    break;
                case 26:
                    esdsAtomPosition4 = iA03;
                    if (esdsAtomPosition4 == i14) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    c0544Ii3 = c0544Ii3;
                    Pair<String, byte[]> pairA07 = A07(c0544Ii3, esdsAtomPosition4);
                    str3 = (String) pairA07.first;
                    bArr = (byte[]) pairA07.second;
                    if (!A0I(478, 15, 44).equals(str3)) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    bArr = bArr;
                    Pair<Integer, Integer> pairA03 = IN.A03(bArr);
                    iIntValue = ((Integer) pairA03.first).intValue();
                    atomType = ((Integer) pairA03.second).intValue();
                    c2 = 29;
                    break;
                case 29:
                    i8 = i7 + iA082;
                    drmInitData5 = drmInitData4;
                    c2 = 17;
                    break;
                case 30:
                    str3 = mimeType;
                    c2 = 29;
                    break;
                case 31:
                    c0544Ii3 = c0544Ii3;
                    iA03 = A03(c0544Ii3, i7, iA082);
                    c2 = 26;
                    break;
                case ' ':
                    if (iA08 != AbstractC0402Cd.A0E) {
                        c2 = '#';
                        break;
                    } else {
                        c2 = '!';
                        break;
                    }
                case '!':
                    c0544Ii3 = c0544Ii3;
                    str7 = str7;
                    c0405Cg2 = c0405Cg2;
                    c0544Ii3.A0Y(i8 + 8);
                    c0405Cg2.A02 = C0361Ak.A07(c0544Ii3, Integer.toString(channelCount), str7, drmInitData5);
                    str5 = str3;
                    drmInitData4 = drmInitData5;
                    i7 = i8;
                    c2 = '\"';
                    break;
                case '\"':
                    str3 = str5;
                    c2 = 29;
                    break;
                case '#':
                    if (iA08 != AbstractC0402Cd.A0H) {
                        c2 = '%';
                        break;
                    } else {
                        c2 = '$';
                        break;
                    }
                case '$':
                    c0544Ii3 = c0544Ii3;
                    str7 = str7;
                    c0405Cg2 = c0405Cg2;
                    c0544Ii3.A0Y(i8 + 8);
                    c0405Cg2.A02 = C0361Ak.A08(c0544Ii3, Integer.toString(channelCount), str7, drmInitData5);
                    str5 = str3;
                    drmInitData4 = drmInitData5;
                    i7 = i8;
                    c2 = '\"';
                    break;
                case '%':
                    if (iA08 != AbstractC0402Cd.A0G) {
                        c2 = '\'';
                        break;
                    } else {
                        c2 = '&';
                        break;
                    }
                case '&':
                    str2 = str2;
                    c0405Cg2 = c0405Cg2;
                    str5 = str3;
                    drmInitData4 = drmInitData5;
                    c0405Cg2.A02 = Format.A07(Integer.toString(channelCount), str3, null, -1, -1, atomType, iIntValue, null, drmInitData4, 0, str2);
                    i7 = i8;
                    c2 = '\"';
                    break;
                case '\'':
                    i6 = iA082;
                    str5 = str3;
                    childPosition = i8;
                    drmInitData4 = drmInitData5;
                    if (iA08 != AbstractC0402Cd.A05) {
                        c2 = ')';
                        break;
                    } else {
                        c2 = '(';
                        break;
                    }
                case '(':
                    c0544Ii3 = c0544Ii3;
                    iA082 = i6;
                    bArr = new byte[iA082];
                    i7 = childPosition;
                    c0544Ii3.A0Y(i7);
                    c0544Ii3.A0c(bArr, 0, iA082);
                    str3 = str5;
                    c2 = 29;
                    break;
                case ')':
                    iA082 = i6;
                    i7 = childPosition;
                    c2 = '\"';
                    break;
                case '*':
                    mimeType = str3;
                    drmInitData4 = drmInitData5;
                    i13 = iA08;
                    i7 = i8;
                    c2 = 24;
                    break;
                case '+':
                    z2 = false;
                    c2 = 20;
                    break;
                case ',':
                    if (i12 != AbstractC0402Cd.A0M) {
                        c2 = '.';
                        break;
                    } else {
                        c2 = '-';
                        break;
                    }
                case '-':
                    strA0I = A0I(337, 10, 98);
                    c2 = 16;
                    break;
                case '.':
                    if (i12 != AbstractC0402Cd.A0I) {
                        c2 = '0';
                        break;
                    } else {
                        c2 = '/';
                        break;
                    }
                case '/':
                    strA0I = A0I(599, 13, 66);
                    c2 = 16;
                    break;
                case '0':
                    if (i12 == AbstractC0402Cd.A0K) {
                        c2 = '2';
                        break;
                    } else {
                        c2 = '1';
                        break;
                    }
                case '1':
                    if (i12 != AbstractC0402Cd.A0L) {
                        c2 = '3';
                        break;
                    } else {
                        c2 = '2';
                        break;
                    }
                case '2':
                    strA0I = A0I(46, 16, 94);
                    c2 = 16;
                    break;
                case '3':
                    if (i12 != AbstractC0402Cd.A0J) {
                        c2 = '5';
                        break;
                    } else {
                        c2 = '4';
                        break;
                    }
                case '4':
                    strA0I = A0I(651, 28, 60);
                    c2 = 16;
                    break;
                case '5':
                    if (i12 != AbstractC0402Cd.A0v) {
                        c2 = '7';
                        break;
                    } else {
                        c2 = '6';
                        break;
                    }
                case '6':
                    strA0I = A0I(679, 10, 16);
                    c2 = 16;
                    break;
                case '7':
                    if (i12 != AbstractC0402Cd.A0w) {
                        c2 = '9';
                        break;
                    } else {
                        c2 = '8';
                        break;
                    }
                case '8':
                    strA0I = A0I(552, 12, 95);
                    c2 = 16;
                    break;
                case '9':
                    if (i12 == AbstractC0402Cd.A0a) {
                        c2 = ';';
                        break;
                    } else {
                        c2 = ':';
                        break;
                    }
                case ':':
                    if (i12 != AbstractC0402Cd.A14) {
                        c2 = '<';
                        break;
                    } else {
                        c2 = ';';
                        break;
                    }
                case ';':
                    strA0I = A0I(642, 9, 80);
                    c2 = 16;
                    break;
                case '<':
                    if (i12 != AbstractC0402Cd.A03) {
                        c2 = '>';
                        break;
                    } else {
                        c2 = '=';
                        break;
                    }
                case '=':
                    strA0I = A0I(404, 10, 66);
                    c2 = 16;
                    break;
                case '>':
                    if (i12 != AbstractC0402Cd.A05) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '?';
                        break;
                    }
                case '?':
                    strA0I = A0I(375, 10, 100);
                    c2 = 16;
                    break;
                case '@':
                    drmInitData2 = drmInitData2;
                    pairA09 = pairA09;
                    drmInitDataA04 = drmInitData2.A04(((C0417Cz) pairA09.second).A02);
                    c2 = '\f';
                    break;
                case 'A':
                    drmInitData2 = drmInitData2;
                    drmInitData5 = drmInitData2;
                    i12 = iIntValue2;
                    c2 = 14;
                    break;
                case 'B':
                    if (esdsAtomPosition2 != i5) {
                        c2 = 'O';
                        break;
                    } else {
                        c2 = 'C';
                        break;
                    }
                case 'C':
                    c0544Ii2 = c0544Ii2;
                    c0544Ii3 = c0544Ii3;
                    c0544Ii3.A0Z(i9);
                    iA0F = (int) Math.round(c0544Ii2.A03());
                    iA0H = c0544Ii2.A0H();
                    c0544Ii3.A0Z(20);
                    c2 = '\b';
                    break;
                case 'D':
                    c0544Ii3 = c0544Ii3;
                    esdsAtomPosition2 = 0;
                    c0544Ii3.A0Z(8);
                    c2 = 3;
                    break;
                case 'E':
                    c0405Cg2 = c0405Cg2;
                    str6 = str3;
                    drmInitData3 = drmInitData5;
                    if (c0405Cg2.A02 != null) {
                        c2 = 'L';
                        break;
                    } else {
                        c2 = 'F';
                        break;
                    }
                case 'F':
                    str4 = str6;
                    if (str4 == null) {
                        c2 = 'L';
                        break;
                    } else {
                        c2 = 'G';
                        break;
                    }
                case 'G':
                    String mimeType2 = str4;
                    if (!A0I(642, 9, 80).equals(mimeType2)) {
                        c2 = 'N';
                        break;
                    } else {
                        c2 = 'H';
                        break;
                    }
                case 'H':
                    i4 = 2;
                    c2 = 'I';
                    break;
                case 'I':
                    string = Integer.toString(channelCount);
                    pcmEncoding = -1;
                    i10 = -1;
                    if (bArr != null) {
                        c2 = 'M';
                        break;
                    } else {
                        c2 = 'J';
                        break;
                    }
                case 'J':
                    listSingletonList = list;
                    c2 = 'K';
                    break;
                case 'K':
                    str2 = str2;
                    c0405Cg2 = c0405Cg2;
                    string = string;
                    c0405Cg2.A02 = Format.A06(string, str4, null, pcmEncoding, i10, atomType, iIntValue, i4, listSingletonList, drmInitData3, 0, str2);
                    c2 = 'L';
                    break;
                case 'L':
                    return;
                case 'M':
                    listSingletonList = Collections.singletonList(bArr);
                    c2 = 'K';
                    break;
                case 'N':
                    i4 = -1;
                    c2 = 'I';
                    break;
                case 'O':
                    return;
            }
        }
    }

    public static boolean A0N(long[] jArr, long j, long j2, long j3) {
        boolean z = true;
        int length = jArr.length - 1;
        int latestDelayIndex = C0560Iy.A06(3, 0, length);
        int iA06 = C0560Iy.A06(jArr.length - 3, 0, length);
        char c2 = jArr[0] <= j2 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    jArr = jArr;
                    if (j2 >= jArr[latestDelayIndex]) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    jArr = jArr;
                    if (jArr[iA06] >= j3) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (j3 > j) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return z;
                case 6:
                    z = false;
                    c2 = 5;
                    break;
            }
        }
    }

    public static byte[] A0O(C0544Ii c0544Ii, int i, int i2) {
        int iA08 = 0;
        int i3 = i + 8;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i3 - i >= i2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c0544Ii = c0544Ii;
                    c0544Ii.A0Y(i3);
                    iA08 = c0544Ii.A08();
                    if (c0544Ii.A08() != AbstractC0402Cd.A0q) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return Arrays.copyOfRange(c0544Ii.A00, i3, i3 + iA08);
                case 5:
                    i3 += iA08;
                    c2 = 2;
                    break;
                case 6:
                    return (byte[]) null;
            }
        }
    }
}
