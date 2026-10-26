package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ApicFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.BinaryFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ChapterFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ChapterTocFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.GeobFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.PrivFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.TextInformationFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.UrlLinkFrame;
import d.b.a.b.k;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Zw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0991Zw implements InterfaceC0429Dq {
    public static byte[] A01;
    public static final int A02;
    public static final E2 A03;
    public final E2 A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static ChapterFrame A06(C0544Ii c0544Ii, int i, int i2, boolean z, int i3, E2 e2) throws UnsupportedEncodingException {
        int iA06 = c0544Ii.A06();
        int iA02 = A02(c0544Ii.A00, iA06);
        String str = new String(c0544Ii.A00, iA06, iA02 - iA06, A0I(410, 10, 68));
        c0544Ii.A0Y(iA02 + 1);
        int iA08 = c0544Ii.A08();
        int iA082 = c0544Ii.A08();
        long jA0M = c0544Ii.A0M();
        if (jA0M == 4294967295L) {
            jA0M = -1;
        }
        long jA0M2 = c0544Ii.A0M();
        if (jA0M2 == 4294967295L) {
            jA0M2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = iA06 + i;
        while (c0544Ii.A06() < i4) {
            Id3Frame id3FrameA0B = A0B(i2, c0544Ii, z, i3, e2);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, iA08, iA082, jA0M, jA0M2, id3FrameArr);
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 38);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0L() {
        A01 = new byte[]{-57, -33, -35, -28, -28, -35, -30, -37, -108, -23, -30, -25, -23, -28, -28, -29, -26, -24, -39, -40, -108, -41, -29, -31, -28, -26, -39, -25, -25, -39, -40, -108, -29, -26, -108, -39, -30, -41, -26, -19, -28, -24, -39, -40, -108, -38, -26, -43, -31, -39, 111, -101, -118, -106, -114, 73, -100, -110, -93, -114, 73, -114, -95, -116, -114, -114, -115, -100, 73, -101, -114, -106, -118, -110, -105, -110, -105, -112, 73, -99, -118, -112, 73, -115, -118, -99, -118, -95, -91, -103, -97, -99, 103, -94, -88, -99, -97, -89, -27, -89, -27, -89, -27, -89, -27, -103, -102, -102, -102, -100, -38, -100, -38, -100, -38, -13, 12, 3, 22, 14, 3, 1, 18, 3, 2, -66, 4, 7, 16, 17, 18, -66, 18, 6, 16, 3, 3, -66, 0, 23, 18, 3, 17, -66, 13, 4, -66, -25, -30, -47, -66, 18, -1, 5, -66, 6, 3, -1, 2, 3, 16, -40, -66, -14, 10, 8, 15, 15, 4, 3, -65, -24, -29, -46, -65, 19, 0, 6, -65, 22, 8, 19, 7, -65, 12, 0, 9, 14, 17, -11, 4, 17, 18, 8, 14, 13, -36, -47, -65, 0, 13, 3, -65, 20, 13, 3, 4, 5, 8, 13, 4, 3, -65, 2, 14, 12, 15, 17, 4, 18, 18, 8, 14, 13, -65, 18, 2, 7, 4, 12, 4, -109, -110, -124, 107, 111, 116, -45, -18, -67, -50, -17, -19, -7, -18, -17, -4, -101, -72, -53, -72, 119, -53, -58, -58, 119, -54, -65, -58, -55, -53, 119, -53, -58, 119, -71, -68, 119, -72, -59, 119, -96, -101, -118, 119, -53, -72, -66, -120, -93, -85, -82, -89, -90, 98, -74, -79, 98, -72, -93, -82, -85, -90, -93, -74, -89, 98, -117, -122, 117, 98, -74, -93, -87, 98, -71, -85, -74, -86, 98, -81, -93, -84, -79, -76, -104, -89, -76, -75, -85, -79, -80, Byte.MAX_VALUE, -66, -67, -81, -106, -102, -97, -85, -82, 4, 8, -4, 2, 0, -54, 5, 11, 2, -107, -112, Byte.MAX_VALUE, -46, -42, -42, -42, -84, -85, -99, -124, -113, 122, 110, -76, -64, -81, -69, -77, -95, -73, -56, -77, -117, 125, -107, -109, -102, -102, -113, -114, 74, 115, 110, 93, 74, -98, -117, -111, 74, -95, -109, -98, -110, 74, -97, -104, -99, -97, -102, -102, -103, -100, -98, -113, -114, 74, -105, -117, -108, -103, -100, Byte.MIN_VALUE, -113, -100, -99, -109, -103, -104, 103, -77, -67, -71, -105, -94, -94, -97, -93, -105, -101, -113, -88, -83, -81, -86, -86, -87, -84, -82, -97, -98, 90, -99, -94, -101, -84, -101, -99, -82, -97, -84, 90, -97, -88, -99, -87, -98, -93, -88, -95, -125, -98, -90, -87, -94, -95, 93, -79, -84, 93, -95, -94, -96, -84, -95, -94, 93, -93, -81, -98, -86, -94, 119, 93, -90, -95, 122, -106, -102, -114, -108, -110, 92};
    }

    static {
        A0L();
        A03 = new C0990Zv();
        A02 = C0560Iy.A08(A0I(340, 3, 38));
    }

    public C0991Zw() {
        this(null);
    }

    public C0991Zw(E2 e2) {
        this.A00 = e2;
    }

    public static int A00(int i) {
        int i2 = 0;
        char c2 = i != 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (i != 3) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    i2 = 1;
                    c2 = 4;
                    break;
                case 4:
                    return i2;
                case 5:
                    i2 = 2;
                    c2 = 4;
                    break;
            }
        }
    }

    public static int A01(C0544Ii c0544Ii, int i) {
        byte[] bArr = c0544Ii.A00;
        int iA06 = c0544Ii.A06();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (iA06 + 1 >= i) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArr = bArr;
                    if ((bArr[iA06] & 255) != 255) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    bArr = bArr;
                    if (bArr[iA06 + 1] != 0) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    bArr = bArr;
                    System.arraycopy(bArr, iA06 + 2, bArr, iA06 + 1, (i - iA06) - 2);
                    i--;
                    c2 = 6;
                    break;
                case 6:
                    iA06++;
                    c2 = 2;
                    break;
                case 7:
                    return i;
            }
        }
    }

    public static int A02(byte[] bArr, int i) {
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    bArr = bArr;
                    if (i >= bArr.length) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    bArr = bArr;
                    if (bArr[i] != 0) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return i;
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return bArr.length;
            }
        }
    }

    public static int A03(byte[] bArr, int i, int i2) {
        int iA02 = A02(bArr, i);
        char c2 = i2 != 0 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    if (i2 != 3) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return iA02;
                case 4:
                    bArr = bArr;
                    if (iA02 >= bArr.length - 1) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    if (iA02 % 2 != 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    bArr = bArr;
                    if (bArr[iA02 + 1] != 0) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return iA02;
                case '\b':
                    bArr = bArr;
                    iA02 = A02(bArr, iA02 + 1);
                    c2 = 4;
                    break;
                case '\t':
                    return bArr.length;
            }
        }
    }

    public static ApicFrame A04(C0544Ii c0544Ii, int i, int i2) throws UnsupportedEncodingException {
        String mimeType = null;
        int iA02 = 0;
        String strA0I = null;
        int iA0E = c0544Ii.A0E();
        String strA0H = A0H(iA0E);
        byte[] bArr = new byte[i - 1];
        c0544Ii.A0c(bArr, 0, i - 1);
        String strA0I2 = A0I(477, 6, 7);
        String strA0I3 = A0I(410, 10, 68);
        int mimeTypeEndIndex = i2 == 2 ? 2 : 5;
        while (true) {
            switch (mimeTypeEndIndex) {
                case 2:
                    bArr = bArr;
                    strA0I2 = strA0I2;
                    strA0I3 = strA0I3;
                    iA02 = 2;
                    strA0I = strA0I2 + C0560Iy.A0P(new String(bArr, 0, 3, strA0I3));
                    if (!A0I(331, 9, k.AppCompatTheme_windowActionModeOverlay).equals(strA0I)) {
                        mimeTypeEndIndex = 4;
                        break;
                    } else {
                        mimeTypeEndIndex = 3;
                        break;
                    }
                case 3:
                    strA0I = A0I(87, 10, 18);
                    mimeTypeEndIndex = 4;
                    break;
                case 4:
                    byte[] bArr2 = bArr;
                    String description = strA0I;
                    int mimeTypeEndIndex2 = iA02 + 1;
                    int i3 = bArr2[mimeTypeEndIndex2] & 255;
                    int i4 = iA02 + 2;
                    int descriptionStartIndex = A03(bArr2, i4, iA0E);
                    int mimeTypeEndIndex3 = descriptionStartIndex - i4;
                    String str = new String(bArr2, i4, mimeTypeEndIndex3, strA0H);
                    int iA00 = A00(iA0E) + descriptionStartIndex;
                    int pictureDataStartIndex = bArr2.length;
                    return new ApicFrame(description, str, i3, A0N(bArr2, iA00, pictureDataStartIndex));
                case 5:
                    bArr = bArr;
                    strA0I3 = strA0I3;
                    iA02 = A02(bArr, 0);
                    mimeType = C0560Iy.A0P(new String(bArr, 0, iA02, strA0I3));
                    if (mimeType.indexOf(47) != -1) {
                        mimeTypeEndIndex = 7;
                        break;
                    } else {
                        mimeTypeEndIndex = 6;
                        break;
                    }
                case 6:
                    strA0I2 = strA0I2;
                    mimeType = mimeType;
                    strA0I = strA0I2 + mimeType;
                    mimeTypeEndIndex = 4;
                    break;
                case 7:
                    mimeType = mimeType;
                    strA0I = mimeType;
                    mimeTypeEndIndex = 4;
                    break;
            }
        }
    }

    public static BinaryFrame A05(C0544Ii c0544Ii, int i, String str) {
        byte[] bArr = new byte[i];
        c0544Ii.A0c(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterTocFrame A07(C0544Ii c0544Ii, int framePosition, int elementIdEndIndex, boolean z, int limit, E2 e2) throws UnsupportedEncodingException {
        int iA06 = c0544Ii.A06();
        int iA02 = A02(c0544Ii.A00, iA06);
        String strA0I = A0I(410, 10, 68);
        String str = new String(c0544Ii.A00, iA06, iA02 - iA06, strA0I);
        c0544Ii.A0Y(iA02 + 1);
        int iA0E = c0544Ii.A0E();
        boolean z2 = (iA0E & 2) != 0;
        boolean z3 = (iA0E & 1) != 0;
        int ctocFlags = c0544Ii.A0E();
        String[] strArr = new String[ctocFlags];
        for (int i = 0; i < ctocFlags; i++) {
            int iA062 = c0544Ii.A06();
            int i2 = A02(c0544Ii.A00, iA062);
            int startIndex = i2 - iA062;
            String elementId = new String(c0544Ii.A00, iA062, startIndex, strA0I);
            strArr[i] = elementId;
            int startIndex2 = i2 + 1;
            c0544Ii.A0Y(startIndex2);
        }
        ArrayList arrayList = new ArrayList();
        int i3 = iA06 + framePosition;
        while (c0544Ii.A06() < i3) {
            Id3Frame id3FrameA0B = A0B(elementIdEndIndex, c0544Ii, z, limit, e2);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z2, z3, strArr, id3FrameArr);
    }

    public static CommentFrame A08(C0544Ii c0544Ii, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int iA0E = c0544Ii.A0E();
        String strA0H = A0H(iA0E);
        byte[] data = new byte[3];
        c0544Ii.A0c(data, 0, 3);
        String str = new String(data, 0, 3);
        byte[] bArr = new byte[i - 4];
        c0544Ii.A0c(bArr, 0, i - 4);
        int iA03 = A03(bArr, 0, iA0E);
        String str2 = new String(bArr, 0, iA03, strA0H);
        int iA00 = A00(iA0E) + iA03;
        int textEndIndex = A03(bArr, iA00, iA0E);
        String text = A0K(bArr, iA00, textEndIndex, strA0H);
        return new CommentFrame(str, str2, text);
    }

    public static GeobFrame A09(C0544Ii c0544Ii, int i) throws UnsupportedEncodingException {
        int iA0E = c0544Ii.A0E();
        String strA0H = A0H(iA0E);
        byte[] bArr = new byte[i - 1];
        c0544Ii.A0c(bArr, 0, i - 1);
        int iA02 = A02(bArr, 0);
        String str = new String(bArr, 0, iA02, A0I(410, 10, 68));
        int i2 = iA02 + 1;
        int filenameEndIndex = A03(bArr, i2, iA0E);
        String strA0K = A0K(bArr, i2, filenameEndIndex, strA0H);
        int iA00 = A00(iA0E) + filenameEndIndex;
        int filenameEndIndex2 = A03(bArr, iA00, iA0E);
        String description = A0K(bArr, iA00, filenameEndIndex2, strA0H);
        int objectDataStartIndex = A00(iA0E) + filenameEndIndex2;
        return new GeobFrame(str, strA0K, description, A0N(bArr, objectDataStartIndex, bArr.length));
    }

    public static E3 A0A(C0544Ii c0544Ii) {
        boolean hasExtendedHeader = false;
        int extendedHeaderSize = 0;
        boolean z = false;
        int i = 0;
        int flags = 0;
        int framesSize = 0;
        boolean z2 = false;
        boolean z3 = false;
        int iA0G = 0;
        int iA0E = 0;
        int iA04 = c0544Ii.A04();
        String strA0I = A0I(237, 10, 100);
        char c2 = iA04 < 10 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    Log.w(strA0I, A0I(247, 31, 49));
                    return (E3) null;
                case 3:
                    c0544Ii = c0544Ii;
                    iA0G = c0544Ii.A0G();
                    if (iA0G == A02) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    Log.w(strA0I, A0I(k.AppCompatTheme_windowActionBar, 48, k.AppCompatTheme_windowFixedWidthMajor) + iA0G);
                    return (E3) null;
                case 5:
                    c0544Ii = c0544Ii;
                    flags = c0544Ii.A0E();
                    z = true;
                    c0544Ii.A0Z(1);
                    iA0E = c0544Ii.A0E();
                    framesSize = c0544Ii.A0D();
                    i = 4;
                    if (flags != 2) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if ((iA0E & 64) == 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    z2 = true;
                    c2 = '\b';
                    break;
                case '\b':
                    if (!z2) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    Log.w(strA0I, A0I(163, 68, k.AppCompatTheme_windowFixedWidthMinor));
                    return (E3) null;
                case '\n':
                    z2 = false;
                    c2 = '\b';
                    break;
                case 11:
                    if (flags != 3) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    if ((iA0E & 64) == 0) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    z3 = true;
                    c2 = 14;
                    break;
                case 14:
                    if (!z3) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c0544Ii = c0544Ii;
                    int iA08 = c0544Ii.A08();
                    c0544Ii.A0Z(iA08);
                    framesSize -= iA08 + 4;
                    c2 = 16;
                    break;
                case 16:
                    if (flags >= i) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    if ((iA0E & 128) == 0) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    return new E3(flags, z, framesSize);
                case 19:
                    z = false;
                    c2 = 18;
                    break;
                case 20:
                    z3 = false;
                    c2 = 14;
                    break;
                case 21:
                    if (flags != i) {
                        c2 = ' ';
                        break;
                    } else {
                        c2 = 22;
                        break;
                    }
                case 22:
                    if ((iA0E & 64) == 0) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    extendedHeaderSize = 1;
                    c2 = 24;
                    break;
                case 24:
                    if (extendedHeaderSize == 0) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 25;
                        break;
                    }
                case 25:
                    c0544Ii = c0544Ii;
                    int iA0D = c0544Ii.A0D();
                    c0544Ii.A0Z(iA0D - 4);
                    framesSize -= iA0D;
                    c2 = 26;
                    break;
                case 26:
                    if ((iA0E & 16) == 0) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    hasExtendedHeader = true;
                    c2 = 28;
                    break;
                case 28:
                    if (!hasExtendedHeader) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 29;
                        break;
                    }
                case 29:
                    framesSize -= 10;
                    c2 = 16;
                    break;
                case 30:
                    hasExtendedHeader = false;
                    c2 = 28;
                    break;
                case 31:
                    extendedHeaderSize = 0;
                    c2 = 24;
                    break;
                case ' ':
                    Log.w(strA0I, A0I(364, 46, 4) + flags);
                    return (E3) null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e5 A[Catch: UnsupportedEncodingException -> 0x0223, all -> 0x0234, Merged into TryCatch #1 {all -> 0x0234, UnsupportedEncodingException -> 0x0223, blocks: (B:90:0x012a, B:155:0x01ef, B:158:0x0223, B:92:0x0132, B:99:0x0148, B:102:0x0152, B:110:0x016c, B:119:0x0183, B:131:0x019d, B:139:0x01b0, B:147:0x01c3, B:152:0x01d8, B:153:0x01e5), top: B:164:0x0120 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame A0B(int r22, com.facebook.ads.redexgen.X.C0544Ii r23, boolean r24, int r25, com.facebook.ads.redexgen.X.E2 r26) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0991Zw.A0B(int, com.facebook.ads.redexgen.X.Ii, boolean, int, com.facebook.ads.redexgen.X.E2):com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame");
    }

    public static PrivFrame A0C(C0544Ii c0544Ii, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        c0544Ii.A0c(bArr, 0, i);
        int iA02 = A02(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iA02, A0I(410, 10, 68)), A0N(bArr, iA02 + 1, bArr.length));
    }

    public static TextInformationFrame A0D(C0544Ii c0544Ii, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int iA0E = c0544Ii.A0E();
        String strA0H = A0H(iA0E);
        byte[] bArr = new byte[i - 1];
        c0544Ii.A0c(bArr, 0, i - 1);
        int descriptionEndIndex = A03(bArr, 0, iA0E);
        String str = new String(bArr, 0, descriptionEndIndex, strA0H);
        int iA00 = A00(iA0E) + descriptionEndIndex;
        String description = A0K(bArr, iA00, A03(bArr, iA00, iA0E), strA0H);
        return new TextInformationFrame(A0I(343, 4, 88), str, description);
    }

    public static TextInformationFrame A0E(C0544Ii c0544Ii, int encoding, String charset) throws UnsupportedEncodingException {
        if (encoding < 1) {
            return null;
        }
        int iA0E = c0544Ii.A0E();
        String strA0H = A0H(iA0E);
        byte[] bArr = new byte[encoding - 1];
        c0544Ii.A0c(bArr, 0, encoding - 1);
        int valueEndIndex = A03(bArr, 0, iA0E);
        String value = new String(bArr, 0, valueEndIndex, strA0H);
        return new TextInformationFrame(charset, null, value);
    }

    public static UrlLinkFrame A0F(C0544Ii c0544Ii, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int iA0E = c0544Ii.A0E();
        String strA0H = A0H(iA0E);
        byte[] bArr = new byte[i - 1];
        c0544Ii.A0c(bArr, 0, i - 1);
        int descriptionEndIndex = A03(bArr, 0, iA0E);
        String str = new String(bArr, 0, descriptionEndIndex, strA0H);
        int iA00 = A00(iA0E) + descriptionEndIndex;
        return new UrlLinkFrame(A0I(105, 4, 28), str, A0K(bArr, iA00, A02(bArr, iA00), A0I(410, 10, 68)));
    }

    public static UrlLinkFrame A0G(C0544Ii c0544Ii, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        c0544Ii.A0c(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, A02(bArr, 0), A0I(410, 10, 68)));
    }

    public static String A0H(int i) {
        String strA0I = A0I(410, 10, 68);
        char c2 = i != 0 ? (char) 2 : '\t';
        while (true) {
            switch (c2) {
                case 2:
                    if (i == 1) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (i == 2) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    if (i == 3) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return strA0I;
                case 6:
                    return A0I(347, 5, 49);
                case 7:
                    return A0I(323, 8, 67);
                case '\b':
                    return A0I(231, 6, 24);
                case '\t':
                    return strA0I;
            }
        }
    }

    public static String A0J(int i, int i2, int i3, int i4, int i5) {
        String str = null;
        Locale locale = Locale.US;
        char c2 = i == 2 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    locale = locale;
                    str = String.format(locale, A0I(109, 6, 81), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
                    c2 = 3;
                    break;
                case 3:
                    return str;
                case 4:
                    locale = locale;
                    str = String.format(locale, A0I(97, 8, 92), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
                    c2 = 3;
                    break;
            }
        }
    }

    public static String A0K(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        char c2 = i2 > i ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    bArr = bArr;
                    if (i2 <= bArr.length) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    return A0I(109, 0, 102);
                case 4:
                    return new String(bArr, i, i2 - i, str);
            }
        }
    }

    public static boolean A0M(C0544Ii c0544Ii, int i, int i2, boolean z) throws Throwable {
        char c2;
        C0544Ii c0544Ii2 = c0544Ii;
        Throwable th = null;
        int id = 0;
        int i3 = 0;
        boolean z2 = false;
        int iA0G = 0;
        long jA0G = 0;
        int i4 = 0;
        long j = 0;
        int i5 = 0;
        int iA0I = 0;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        C0544Ii c0544Ii3 = c0544Ii2;
        int iA06 = c0544Ii2.A06();
        while (true) {
            try {
                z3 = true;
                c2 = c0544Ii2.A04() >= i2 ? (char) 4 : '-';
            } catch (Throwable th2) {
                th = th2;
                c2 = '0';
            }
            while (true) {
                switch (c2) {
                    case 4:
                        i3 = 3;
                        c2 = i >= 3 ? (char) 5 : '\t';
                    case 5:
                        c0544Ii2 = c0544Ii2;
                        iA0G = c0544Ii2.A08();
                        jA0G = c0544Ii2.A0M();
                        iA0I = c0544Ii2.A0I();
                        c2 = '\f';
                    case '\t':
                        c0544Ii2 = c0544Ii2;
                        iA0G = c0544Ii2.A0G();
                        jA0G = c0544Ii2.A0G();
                        iA0I = 0;
                        c2 = '\f';
                    case '\f':
                        j = 0;
                        c2 = iA0G == 0 ? '\r' : (char) 16;
                    case '\r':
                        c2 = jA0G == j ? (char) 14 : (char) 16;
                    case 14:
                        c2 = iA0I == 0 ? (char) 15 : (char) 16;
                    case 15:
                        c0544Ii3.A0Y(iA06);
                        return z3;
                    case 16:
                        i5 = 4;
                        c2 = i == 4 ? (char) 17 : (char) 21;
                    case 17:
                        c2 = !z ? (char) 18 : (char) 21;
                    case 18:
                        c2 = (8421504 & jA0G) != j ? (char) 19 : (char) 20;
                    case 19:
                        c0544Ii3.A0Y(iA06);
                        return false;
                    case 20:
                        jA0G = (((jA0G >> 24) & 255) << 21) | (jA0G & 255) | (((jA0G >> 8) & 255) << 7) | (((jA0G >> 16) & 255) << 14);
                        c2 = 21;
                    case 21:
                        i7 = 0;
                        z2 = false;
                        c2 = i == i5 ? (char) 22 : '\"';
                    case 22:
                        c2 = (iA0I & 64) != 0 ? (char) 23 : '!';
                    case 23:
                        i6 = 1;
                        c2 = 24;
                    case 24:
                        i7 = i6;
                        c2 = (iA0I & 1) != 0 ? (char) 25 : ' ';
                    case 25:
                        z2 = z3;
                        c2 = 26;
                    case 26:
                        i4 = 0;
                        c2 = i7 != 0 ? (char) 27 : (char) 28;
                    case 27:
                        i4 = 0 + 1;
                        c2 = 28;
                    case 28:
                        c2 = z2 ? (char) 29 : (char) 30;
                    case 29:
                        i4 += 4;
                        c2 = 30;
                    case 30:
                        c2 = jA0G < ((long) i4) ? (char) 31 : ')';
                    case 31:
                        c0544Ii3.A0Y(iA06);
                        return false;
                    case ' ':
                        z3 = false;
                        c2 = 25;
                    case '!':
                        i6 = 0;
                        c2 = 24;
                    case '\"':
                        c2 = i == i3 ? '#' : (char) 26;
                    case '#':
                        c2 = (iA0I & 32) != 0 ? '$' : '(';
                    case '$':
                        id = 1;
                        c2 = '%';
                    case '%':
                        i7 = id;
                        c2 = (iA0I & 128) != 0 ? '&' : '\'';
                    case '&':
                        z2 = z3;
                        c2 = 26;
                    case '\'':
                        z3 = false;
                        c2 = '&';
                    case '(':
                        id = 0;
                        c2 = '%';
                    case ')':
                        try {
                            c0544Ii2 = c0544Ii2;
                            c2 = ((long) c0544Ii2.A04()) < jA0G ? ',' : '+';
                        } catch (Throwable th3) {
                            th = th3;
                            c2 = '0';
                        }
                    case ',':
                        c0544Ii3.A0Y(iA06);
                        return false;
                    case '-':
                        c0544Ii3.A0Y(iA06);
                        return z3;
                    case '0':
                        Throwable th4 = th;
                        c0544Ii3.A0Y(iA06);
                        throw th4;
                }
            }
            c0544Ii3 = c0544Ii3;
            c0544Ii3.A0Z((int) jA0G);
        }
    }

    public static byte[] A0N(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return new byte[0];
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    public final Metadata A0O(byte[] bArr, int i) throws Throwable {
        C0991Zw c0991Zw = this;
        Id3Frame frame = null;
        boolean z = false;
        int i2 = 0;
        int iA01 = 0;
        int iA06 = 0;
        int i3 = 0;
        ArrayList arrayList = new ArrayList();
        C0544Ii c0544Ii = new C0544Ii(bArr, i);
        E3 e3A0A = A0A(c0544Ii);
        int framesSize = e3A0A == null ? 2 : 3;
        while (true) {
            switch (framesSize) {
                case 2:
                    return (Metadata) null;
                case 3:
                    c0544Ii = c0544Ii;
                    e3A0A = e3A0A;
                    iA06 = c0544Ii.A06();
                    if (e3A0A.A01 != 2) {
                        framesSize = 14;
                        break;
                    } else {
                        framesSize = 4;
                        break;
                    }
                case 4:
                    i3 = 6;
                    framesSize = 5;
                    break;
                case 5:
                    e3A0A = e3A0A;
                    iA01 = e3A0A.A00;
                    if (!e3A0A.A02) {
                        framesSize = 7;
                        break;
                    } else {
                        framesSize = 6;
                        break;
                    }
                case 6:
                    c0544Ii = c0544Ii;
                    e3A0A = e3A0A;
                    iA01 = A01(c0544Ii, e3A0A.A00);
                    framesSize = 7;
                    break;
                case 7:
                    c0544Ii = c0544Ii;
                    e3A0A = e3A0A;
                    int framesSize2 = iA06 + iA01;
                    c0544Ii.A0X(framesSize2);
                    z = false;
                    boolean unsignedIntFrameSizeHack = A0M(c0544Ii, e3A0A.A01, i3, false);
                    if (!unsignedIntFrameSizeHack) {
                        framesSize = 8;
                        break;
                    } else {
                        framesSize = 11;
                        break;
                    }
                case 8:
                    e3A0A = e3A0A;
                    i2 = 4;
                    if (e3A0A.A01 != 4) {
                        framesSize = 16;
                        break;
                    } else {
                        framesSize = 9;
                        break;
                    }
                case 9:
                    c0544Ii = c0544Ii;
                    boolean unsignedIntFrameSizeHack2 = A0M(c0544Ii, i2, i3, true);
                    if (!unsignedIntFrameSizeHack2) {
                        framesSize = 16;
                        break;
                    } else {
                        framesSize = 10;
                        break;
                    }
                case 10:
                    z = true;
                    framesSize = 11;
                    break;
                case 11:
                    c0544Ii = c0544Ii;
                    int framesSize3 = c0544Ii.A04();
                    if (framesSize3 < i3) {
                        framesSize = 15;
                        break;
                    } else {
                        framesSize = 12;
                        break;
                    }
                case 12:
                    c0991Zw = c0991Zw;
                    c0544Ii = c0544Ii;
                    e3A0A = e3A0A;
                    frame = A0B(e3A0A.A01, c0544Ii, z, i3, c0991Zw.A00);
                    if (frame == null) {
                        framesSize = 11;
                        break;
                    } else {
                        framesSize = 13;
                        break;
                    }
                case 13:
                    arrayList = arrayList;
                    frame = frame;
                    arrayList.add(frame);
                    framesSize = 11;
                    break;
                case 14:
                    i3 = 10;
                    framesSize = 5;
                    break;
                case 15:
                    return new Metadata(arrayList);
                case 16:
                    Log.w(A0I(237, 10, 100), A0I(278, 45, 28) + e3A0A.A01);
                    return (Metadata) null;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0429Dq
    public final Metadata A4e(C0420Dd c0420Dd) {
        ByteBuffer byteBuffer = c0420Dd.A01;
        return A0O(byteBuffer.array(), byteBuffer.limit());
    }
}
