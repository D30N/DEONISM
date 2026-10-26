package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import d.b.a.b.k;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.Iy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0560Iy {
    public static byte[] A00;
    public static final int A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final Pattern A06;
    public static final Pattern A07;
    public static final Pattern A08;
    public static final int[] A09;

    public static String A0M(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 3);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0X() {
        A00 = new byte[]{107, 95, 83, -121, -113, -121, -113, -121, -113, -121, -113, 84, -121, 88, 83, -121, -113, -121, -113, 84, -121, 88, 83, -121, -113, -121, -113, 84, -122, Byte.MAX_VALUE, -97, -120, 83, -121, -113, -121, -113, 84, 101, 83, -121, -113, -121, -113, 84, 101, 83, -121, -113, -121, -113, 84, 83, -122, -121, 89, 87, -120, 83, -121, -113, 86, 84, 84, 106, 83, -122, -123, -91, -120, -89, 83, 83, -121, 86, -89, -121, 88, 84, 83, -121, -113, 106, -121, -113, 84, 101, 106, 83, -121, -113, -121, -113, 84, 84, 84, 106, -108, -100, -64, -35, -30, -23, -20, -81, -75, -30, -40, -26, -29, -35, -40, -108, -95, -58, -50, -71, -60, -63, -68, 120, -68, -71, -52, -67, -121, -52, -63, -59, -67, 120, -66, -57, -54, -59, -71, -52, -110, 120, -66, 104, 50, 55, 51, 73, 90, 50, 50, 101, 58, 55, 67, 103, 52, 51, 99, 51, 73, 50, 50, 101, 58, 55, 67, 103, 52, 51, 87, 51, 73, 50, 50, 101, 58, 55, 67, 103, 52, 51, 78, 51, 73, 50, 94, 50, 50, 101, 58, 55, 67, 103, 52, 51, 82, 51, 73, 50, 50, 101, 58, 55, 67, 103, 52, 51, 87, 51, 73, 50, 50, 101, 58, 55, 67, 56, 103, 52, 51, 93, 51, 73, 51, 73, 46, 99, -41, -38, -35, -42, 79, 126, -79, -88, -119, -91, -102, -78, -98, -85, -123, -94, -101, 104, 107, 103, 113, 103, 109, -94, -88, -81, -108, -117, -70, -71, -85, -110, -99, -110, -112, 103, -105, -102, -51, -77, -97, -72, -45, -97, -40, -94, -97, -85, -49, -19, -92, -17, -101};
    }

    static {
        A0X();
        A01 = (Build.VERSION.SDK_INT == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') ? 26 : Build.VERSION.SDK_INT;
        A02 = Build.DEVICE;
        A04 = Build.MANUFACTURER;
        A05 = Build.MODEL;
        StringBuilder sb = new StringBuilder();
        sb.append(A02);
        String strA0M = A0M(0, 2, 60);
        sb.append(strA0M);
        sb.append(A05);
        sb.append(strA0M);
        sb.append(A04);
        sb.append(strA0M);
        sb.append(A01);
        A03 = sb.toString();
        A07 = Pattern.compile(A0M(2, 95, 40));
        A08 = Pattern.compile(A0M(140, 84, 7));
        A06 = Pattern.compile(A0M(261, 17, 111));
        A09 = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    }

    public static float A00(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    public static int A01(int i) {
        int i2 = 0;
        char c2 = i != 0 ? (char) 2 : (char) 11;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 1) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i2 = 131072;
                    if (i == 3) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i != 4) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return i2;
                case 7:
                    throw new IllegalStateException();
                case '\b':
                    return i2;
                case '\t':
                    return 13107200;
                case '\n':
                    return 3538944;
                case 11:
                    return 16777216;
            }
        }
    }

    public static int A02(int i) {
        char c2 = i != 8 ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 16) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 24) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 32) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return 0;
                case 6:
                    return 1073741824;
                case 7:
                    return RecyclerView.UNDEFINED_DURATION;
                case '\b':
                    return 2;
                case '\t':
                    return 3;
            }
        }
    }

    public static int A03(int i) {
        char c2;
        switch (i) {
            case 1:
                c2 = 3;
                break;
            case 2:
                c2 = 4;
                break;
            case 3:
                c2 = 5;
                break;
            case 4:
                c2 = 6;
                break;
            case 5:
                c2 = 7;
                break;
            case 6:
                c2 = '\b';
                break;
            case 7:
                c2 = 7;
                break;
            case 8:
                c2 = 7;
                break;
            case 9:
                c2 = 7;
                break;
            case 10:
                c2 = 7;
                break;
            case 11:
                c2 = 2;
                break;
            case 12:
                c2 = 3;
                break;
            case 13:
                c2 = '\t';
                break;
            case 14:
                c2 = 3;
                break;
            default:
                c2 = 2;
                break;
        }
        while (true) {
            switch (c2) {
                case 2:
                    return 3;
                case 3:
                    return 3;
                case 4:
                    return 0;
                case 5:
                    return 8;
                case 6:
                    return 4;
                case 7:
                    return 5;
                case '\b':
                    return 2;
                case '\t':
                    return 1;
            }
        }
    }

    public static int A04(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static int A05(int i, int i2) {
        char c2 = i != Integer.MIN_VALUE ? (char) 2 : '\n';
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 1073741824) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 2) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 3) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i != 4) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return i2 * 4;
                case 7:
                    throw new IllegalArgumentException();
                case '\b':
                    return i2;
                case '\t':
                    return i2 * 2;
                case '\n':
                    return i2 * 3;
            }
        }
    }

    public static int A06(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static int A07(long j, long j2) {
        int i = 0;
        char c2 = j < j2 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i = -1;
                    c2 = 3;
                    break;
                case 3:
                    return i;
                case 4:
                    if (j != j2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i = 0;
                    c2 = 3;
                    break;
                case 6:
                    i = 1;
                    c2 = 3;
                    break;
            }
        }
    }

    public static int A08(String str) {
        int result = 0;
        int i = 0;
        boolean z = false;
        int length = str.length();
        char c2 = length <= 4 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    IJ.A03(z);
                    result = 0;
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i >= length) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    str = str;
                    result = (result << 8) | str.charAt(i);
                    i++;
                    c2 = 4;
                    break;
                case 6:
                    z = false;
                    c2 = 3;
                    break;
                case 7:
                    return result;
            }
        }
    }

    public static int A09(byte[] bArr, int i, int i2, int i3) {
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= i2) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArr = bArr;
                    i3 = (i3 << 8) ^ A09[((i3 >>> 24) ^ (bArr[i] & 255)) & 255];
                    i++;
                    c2 = 2;
                    break;
                case 4:
                    return i3;
            }
        }
    }

    public static int A0A(long[] jArr, long j, boolean z, boolean z2) {
        int iMin = 0;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        char c2 = iBinarySearch < 0 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    iBinarySearch ^= -1;
                    c2 = 3;
                    break;
                case 3:
                    if (!z2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    jArr = jArr;
                    iMin = Math.min(jArr.length - 1, iBinarySearch);
                    c2 = 5;
                    break;
                case 5:
                    return iMin;
                case 6:
                    iMin = iBinarySearch;
                    c2 = 5;
                    break;
                case 7:
                    jArr = jArr;
                    iBinarySearch++;
                    if (iBinarySearch >= jArr.length) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    jArr = jArr;
                    if (jArr[iBinarySearch] != j) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case '\t':
                    if (!z) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    iBinarySearch--;
                    c2 = 3;
                    break;
            }
        }
    }

    public static int A0B(long[] jArr, long j, boolean z, boolean z2) {
        int iMax = 0;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        char c2 = iBinarySearch < 0 ? (char) 2 : (char) 7;
        while (true) {
            switch (c2) {
                case 2:
                    iBinarySearch = -(iBinarySearch + 2);
                    c2 = 3;
                    break;
                case 3:
                    if (!z2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    iMax = Math.max(0, iBinarySearch);
                    c2 = 5;
                    break;
                case 5:
                    return iMax;
                case 6:
                    iMax = iBinarySearch;
                    c2 = 5;
                    break;
                case 7:
                    iBinarySearch--;
                    if (iBinarySearch < 0) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    jArr = jArr;
                    if (jArr[iBinarySearch] != j) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case '\t':
                    if (!z) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    iBinarySearch++;
                    c2 = 3;
                    break;
            }
        }
    }

    public static long A0C(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        return Math.round(j * f);
    }

    public static long A0D(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        return Math.round(j / f);
    }

    public static long A0E(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    public static long A0F(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static long A0G(long multiplicationFactor, long j, long j2) {
        char c2 = j2 >= j ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    if (j2 % j != 0) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    long divisionFactor = multiplicationFactor / (j2 / j);
                    return divisionFactor;
                case 4:
                    if (j2 >= j) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (j % j2 != 0) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return multiplicationFactor * (j / j2);
                case 7:
                    return (long) (multiplicationFactor * (j / j2));
            }
        }
    }

    public static long A0H(long result, long j, long j2) {
        long j3 = result + j;
        if (((result ^ j3) & (j ^ j3)) < 0) {
            return j2;
        }
        return j3;
    }

    public static long A0I(long result, long j, long j2) {
        long j3 = result - j;
        if (((result ^ j) & (result ^ j3)) < 0) {
            return j2;
        }
        return j3;
    }

    public static long A0J(long maxPositionUs, AX ax, long j, long j2) {
        AX ax2 = ax;
        boolean z = false;
        boolean z2 = false;
        long jA0H = 0;
        long jA0I = 0;
        char c2 = AX.A04.equals(ax2) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return maxPositionUs;
                case 3:
                    ax2 = ax2;
                    jA0I = A0I(maxPositionUs, ax2.A01, Long.MIN_VALUE);
                    jA0H = A0H(maxPositionUs, ax2.A00, Long.MAX_VALUE);
                    z2 = true;
                    if (jA0I > j) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (j > jA0H) {
                        c2 = '\r';
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
                    if (jA0I > j2) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (j2 > jA0H) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (!z) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    if (!z2) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    if (Math.abs(j - maxPositionUs) > Math.abs(j2 - maxPositionUs)) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return j;
                case '\f':
                    z2 = false;
                    c2 = '\b';
                    break;
                case '\r':
                    z = false;
                    c2 = 6;
                    break;
                case 14:
                    return j2;
                case 15:
                    if (!z) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    return j;
                case 17:
                    if (!z2) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    return j2;
                case 19:
                    return jA0I;
            }
        }
    }

    public static long A0K(String str) throws AF {
        int timezoneShift = 0;
        Calendar dateTime = null;
        int i = 0;
        int i2 = 0;
        long timeInMillis = 0;
        int i3 = 0;
        Matcher matcher = A07.matcher(str);
        char c2 = matcher.matches() ? (char) 2 : '\r';
        while (true) {
            switch (c2) {
                case 2:
                    matcher = matcher;
                    timezoneShift = 9;
                    if (matcher.group(9) != null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i2 = 0;
                    c2 = 4;
                    break;
                case 4:
                    matcher = matcher;
                    dateTime = new GregorianCalendar(TimeZone.getTimeZone(A0M(248, 3, 88)));
                    dateTime.clear();
                    i = 3;
                    dateTime.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                    i3 = 8;
                    if (!TextUtils.isEmpty(matcher.group(8))) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    matcher = matcher;
                    dateTime = (GregorianCalendar) dateTime;
                    BigDecimal bd = new BigDecimal(A0M(258, 2, 95) + matcher.group(i3)).movePointRight(i);
                    dateTime.set(14, bd.intValue());
                    c2 = 6;
                    break;
                case 6:
                    dateTime = (GregorianCalendar) dateTime;
                    timeInMillis = dateTime.getTimeInMillis();
                    if (i2 == 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    timeInMillis -= 60000 * i2;
                    c2 = '\b';
                    break;
                case '\b':
                    return timeInMillis;
                case '\t':
                    matcher = matcher;
                    if (!matcher.group(timezoneShift).equalsIgnoreCase(A0M(224, 1, 6))) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    i2 = 0;
                    c2 = 4;
                    break;
                case 11:
                    matcher = matcher;
                    i2 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                    if (!A0M(229, 1, 31).equals(matcher.group(11))) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    i2 *= -1;
                    c2 = 4;
                    break;
                case '\r':
                    throw new AF(A0M(113, 26, 85) + str);
            }
        }
    }

    public static long A0L(String str) throws NumberFormatException {
        long j = 0;
        long durationMillis = 0;
        double d2 = 0.0d;
        String strGroup = null;
        double d3 = 0.0d;
        String days = null;
        double d4 = 0.0d;
        double d5 = 0.0d;
        String strGroup2 = null;
        double d6 = 0.0d;
        double d7 = 0.0d;
        String strGroup3 = null;
        double d8 = 0.0d;
        double d9 = 0.0d;
        String strGroup4 = null;
        boolean zIsEmpty = false;
        double d10 = 0.0d;
        double d11 = 0.0d;
        String strGroup5 = null;
        Matcher matcher = A08.matcher(str);
        char c2 = matcher.matches() ? (char) 2 : (char) 23;
        while (true) {
            switch (c2) {
                case 2:
                    matcher = matcher;
                    zIsEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
                    strGroup2 = matcher.group(3);
                    d9 = 0.0d;
                    if (strGroup2 == null) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    strGroup2 = strGroup2;
                    d5 = Double.parseDouble(strGroup2) * 3.1556908E7d;
                    c2 = 4;
                    break;
                case 4:
                    matcher = matcher;
                    days = matcher.group(5);
                    if (days == null) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    days = days;
                    d3 = Double.parseDouble(days) * 2629739.0d;
                    c2 = 6;
                    break;
                case 6:
                    matcher = matcher;
                    d6 = d5 + d3;
                    strGroup = matcher.group(7);
                    if (strGroup == null) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    strGroup = strGroup;
                    d7 = Double.parseDouble(strGroup) * 86400.0d;
                    c2 = '\b';
                    break;
                case '\b':
                    matcher = matcher;
                    d4 = d6 + d7;
                    strGroup3 = matcher.group(10);
                    if (strGroup3 == null) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    strGroup3 = strGroup3;
                    d8 = 3600.0d * Double.parseDouble(strGroup3);
                    c2 = '\n';
                    break;
                case '\n':
                    matcher = matcher;
                    d10 = d4 + d8;
                    strGroup4 = matcher.group(12);
                    if (strGroup4 == null) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    strGroup4 = strGroup4;
                    d11 = Double.parseDouble(strGroup4) * 60.0d;
                    c2 = '\f';
                    break;
                case '\f':
                    matcher = matcher;
                    d2 = d10 + d11;
                    strGroup5 = matcher.group(14);
                    if (strGroup5 == null) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    strGroup5 = strGroup5;
                    d9 = Double.parseDouble(strGroup5);
                    c2 = 14;
                    break;
                case 14:
                    durationMillis = (long) (1000.0d * (d2 + d9));
                    if (!zIsEmpty) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    j = -durationMillis;
                    c2 = 16;
                    break;
                case 16:
                    return j;
                case 17:
                    j = durationMillis;
                    c2 = 16;
                    break;
                case 18:
                    d11 = d9;
                    c2 = '\f';
                    break;
                case 19:
                    d8 = d9;
                    c2 = '\n';
                    break;
                case 20:
                    d7 = d9;
                    c2 = '\b';
                    break;
                case 21:
                    d3 = d9;
                    c2 = 6;
                    break;
                case 22:
                    d5 = d9;
                    c2 = 4;
                    break;
                case 23:
                    return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
            }
        }
    }

    public static String A0N(Context context, String str) {
        String packageName;
        try {
            packageName = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            packageName = A0M(139, 1, k.AppCompatTheme_windowNoTitle);
        }
        return str + A0M(260, 1, 53) + packageName + A0M(97, 16, 113) + Build.VERSION.RELEASE + A0M(251, 2, 104) + A0M(230, 18, 54);
    }

    @Nullable
    public static String A0O(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return A0P(str);
        }
    }

    public static String A0P(String str) {
        String lowerCase = null;
        char c2 = str == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    lowerCase = null;
                    c2 = 3;
                    break;
                case 3:
                    return lowerCase;
                case 4:
                    str = str;
                    lowerCase = str.toLowerCase(Locale.US);
                    c2 = 3;
                    break;
            }
        }
    }

    public static String A0Q(String str) {
        String upperCase = null;
        char c2 = str == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    upperCase = null;
                    c2 = 3;
                    break;
                case 3:
                    return upperCase;
                case 4:
                    str = str;
                    upperCase = str.toUpperCase(Locale.US);
                    c2 = 3;
                    break;
            }
        }
    }

    public static String A0R(String str) {
        int percentCharacterCount = 0;
        int expectedLength = 0;
        Matcher matcher = null;
        StringBuilder sb = null;
        int length = str.length();
        int i = 0;
        int i2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 >= length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    str = str;
                    if (str.charAt(i2) != '%') {
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
                    if (i != 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return str;
                case '\b':
                    str = str;
                    percentCharacterCount = length - (i * 2);
                    sb = new StringBuilder(percentCharacterCount);
                    matcher = A06.matcher(str);
                    expectedLength = 0;
                    c2 = '\t';
                    break;
                case '\t':
                    if (i <= 0) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    matcher = matcher;
                    if (!matcher.find()) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    str = str;
                    sb = sb;
                    matcher = matcher;
                    char c3 = (char) Integer.parseInt(matcher.group(1), 16);
                    sb.append((CharSequence) str, expectedLength, matcher.start());
                    sb.append(c3);
                    expectedLength = matcher.end();
                    i--;
                    c2 = '\t';
                    break;
                case '\f':
                    if (expectedLength >= length) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    str = str;
                    sb = sb;
                    sb.append((CharSequence) str, expectedLength, length);
                    c2 = 14;
                    break;
                case 14:
                    sb = sb;
                    if (sb.length() == percentCharacterCount) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    return (String) null;
                case 16:
                    return sb.toString();
            }
        }
    }

    public static String A0S(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String A0T(byte[] bArr) {
        return new String(bArr, Charset.forName(A0M(253, 5, 98)));
    }

    public static String A0U(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, Charset.forName(A0M(253, 5, 98)));
    }

    public static String A0V(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    objArr = objArr;
                    int i3 = objArr.length;
                    if (i >= i3) {
                        i2 = 6;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    objArr = objArr;
                    sb = sb;
                    sb.append(objArr[i].getClass().getSimpleName());
                    int i4 = objArr.length;
                    if (i >= i4 - 1) {
                        i2 = 5;
                        break;
                    } else {
                        i2 = 4;
                        break;
                    }
                case 4:
                    sb = sb;
                    sb.append(A0M(0, 2, 60));
                    i2 = 5;
                    break;
                case 5:
                    i++;
                    i2 = 2;
                    break;
                case 6:
                    return sb.toString();
            }
        }
    }

    public static ExecutorService A0W(String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC0559Ix(str));
    }

    public static void A0Y(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static void A0Z(InterfaceC0516He interfaceC0516He) {
        if (interfaceC0516He != null) {
            try {
                interfaceC0516He.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void A0a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void A0b(Throwable th) throws Throwable {
        A0c(th);
    }

    public static <T extends Throwable> void A0c(Throwable th) throws Throwable {
        throw th;
    }

    public static void A0d(long[] jArr, long j, long j2) {
        long[] jArr2 = jArr;
        long j3 = 0;
        int i = 0;
        int i2 = 0;
        double d2 = 0.0d;
        int i3 = 0;
        long j4 = 0;
        char c2 = j2 >= j ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (j2 % j != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    j4 = j2 / j;
                    i3 = 0;
                    c2 = 4;
                    break;
                case 4:
                    jArr2 = jArr2;
                    if (i3 >= jArr2.length) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    jArr2 = jArr2;
                    jArr2[i3] = jArr2[i3] / j4;
                    i3++;
                    c2 = 4;
                    break;
                case 6:
                    if (j2 >= j) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (j % j2 != 0) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    j3 = j / j2;
                    i = 0;
                    c2 = '\t';
                    break;
                case '\t':
                    jArr2 = jArr2;
                    if (i >= jArr2.length) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    jArr2 = jArr2;
                    jArr2[i] = jArr2[i] * j3;
                    i++;
                    c2 = '\t';
                    break;
                case 11:
                    d2 = j / j2;
                    i2 = 0;
                    c2 = '\f';
                    break;
                case '\f':
                    jArr2 = jArr2;
                    if (i2 >= jArr2.length) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    jArr2 = jArr2;
                    jArr2[i2] = (long) (jArr2[i2] * d2);
                    i2++;
                    c2 = '\f';
                    break;
                case 14:
                    return;
            }
        }
    }

    public static boolean A0e(int i) {
        boolean z = false;
        char c2 = i != Integer.MIN_VALUE ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (i != 1073741824) {
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

    public static boolean A0f(int i) {
        boolean z = false;
        char c2 = i != 3 ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 2) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == Integer.MIN_VALUE) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 1073741824) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (i != 4) {
                        c2 = '\b';
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
                case '\b':
                    z = false;
                    c2 = 7;
                    break;
            }
        }
    }

    public static boolean A0g(int i) {
        boolean z = false;
        char c2 = i != 10 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (i != 13) {
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

    public static boolean A0h(Uri uri) {
        boolean z = false;
        String scheme = uri.getScheme();
        char c2 = !TextUtils.isEmpty(scheme) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    scheme = scheme;
                    if (!A0M(225, 4, 110).equals(scheme)) {
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

    public static boolean A0i(Parcel parcel) {
        boolean z = false;
        char c2 = parcel.readInt() != 0 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    return z;
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public static boolean A0j(@Nullable Object obj, @Nullable Object obj2) {
        boolean zEquals = false;
        char c2 = obj == null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    obj2 = obj2;
                    if (obj2 != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    zEquals = true;
                    c2 = 4;
                    break;
                case 4:
                    return zEquals;
                case 5:
                    zEquals = false;
                    c2 = 4;
                    break;
                case 6:
                    obj = obj;
                    obj2 = obj2;
                    zEquals = obj.equals(obj2);
                    c2 = 4;
                    break;
            }
        }
    }

    public static byte[] A0k(String str) {
        byte[] bArr = new byte[str.length() / 2];
        int i = 0;
        int i2 = 2;
        while (true) {
            switch (i2) {
                case 2:
                    bArr = bArr;
                    int i3 = bArr.length;
                    if (i >= i3) {
                        i2 = 4;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
                case 3:
                    str = str;
                    bArr = bArr;
                    int i4 = i * 2;
                    int stringOffset = Character.digit(str.charAt(i4), 16);
                    int i5 = stringOffset << 4;
                    int stringOffset2 = i4 + 1;
                    bArr[i] = (byte) (i5 + Character.digit(str.charAt(stringOffset2), 16));
                    i++;
                    i2 = 2;
                    break;
                case 4:
                    return bArr;
            }
        }
    }

    public static byte[] A0l(String str) {
        return str.getBytes(Charset.forName(A0M(253, 5, 98)));
    }

    public static int[] A0m(List<Integer> list) {
        int[] intArray = null;
        int i = 0;
        int size = 0;
        char c2 = list == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return (int[]) null;
                case 3:
                    list = list;
                    size = list.size();
                    intArray = new int[size];
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i >= size) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    list = list;
                    intArray = intArray;
                    intArray[i] = list.get(i).intValue();
                    i++;
                    c2 = 4;
                    break;
                case 6:
                    return intArray;
            }
        }
    }

    public static <T> T[] A0n(T[] tArr, int i) {
        boolean z = false;
        char c2 = i <= tArr.length ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    z = true;
                    c2 = 3;
                    break;
                case 3:
                    IJ.A03(z);
                    return (T[]) Arrays.copyOf(tArr, i);
                case 4:
                    z = false;
                    c2 = 3;
                    break;
            }
        }
    }

    public static String[] A0o(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] A0p(String str, String str2) {
        return str.split(str2, 2);
    }
}
