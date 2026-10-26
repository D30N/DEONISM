package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.Xml;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.metadata.emsg.EventMessage;
import com.facebook.ads.internal.exoplayer2.source.dash.manifest.Representation;
import d.b.a.b.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: com.facebook.ads.redexgen.X.av, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1049av extends DefaultHandler implements InterfaceC0533Hx<C1048au> {
    public static byte[] A02;
    public static final Pattern A03;
    public static final Pattern A04;
    public static final Pattern A05;
    public final String A00;
    public final XmlPullParserFactory A01;

    public static String A0h(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 42);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A0o() {
        A02 = new byte[]{-14, 21, 9, -11, 6, 23, 24, 10, 23, -105, -87, -85, -79, -87, -78, -72, -112, -83, -73, -72, -73, -58, -58, -62, -65, -71, -73, -54, -65, -59, -60, -123, -50, -125, -61, -58, -118, -125, -52, -54, -54, 7, -14, -3, 6, -10, -87, -43, -44, -38, -53, -44, -38, -74, -40, -43, -38, -53, -55, -38, -49, -43, -44, -22, -33, -29, -37, -23, -39, -41, -30, -37, -27, -7, -24, -19, -13, -77, -23, -27, -25, -73, -79, -18, -13, -25, -34, -13, -34, -26, -23, -34, -33, -26, -23, -26, -15, -10, -48, -15, -34, -17, -15, -47, -26, -22, -30, -16, 13, 10, 3, 14, 12, -44, -36, 10, -1, 3, -5, -23, -2, -1, -4, 10, -40, 11, -4, -4, -5, 8, -38, -5, 6, 10, -2, -26, -25, -29, -29, -16, 1, -2, -19, 0, -11, -5, -6, 2, -10, -2, 3, 1, 2, -17, 0, 2, -36, 3, -5, -16, -13, 0, -49, -66, -53, -60, -62, -18, 17, 5, 3, 22, 11, 17, 16, -44, -29, -25, -28, -34, -32, -23, -18, -32, -48, -19, -25, -86, -102, -97, -100, -92, -100, Byte.MIN_VALUE, -101, -116, -87, -96, -59, -55, -63, -106, -112, -104, -6, 12, 14, 20, 12, 21, 27, -23, 8, 26, 12, -32, -27, -32, -21, -32, -40, -29, -32, -15, -40, -21, -32, -26, -27, -96, -94, -108, -108, -110, -96, -95, -110, -111, 125, -97, -110, -96, -110, -101, -95, -114, -95, -106, -100, -101, 113, -110, -103, -114, -90, 11, 8, 4, -48, 9, -7, 10, -5, -48, -6, -9, 9, -2, -48, -7, -7, -48, -7, -5, -9, -61, -52, -58, -50, -48, -56, -58, -57, -53, -28, -42, -47, -31, -43, -29, -8, 5, -4, 2, -9, 11, 8, 4, -48, 3, 6, -5, -3, -48, -6, -9, 9, -2, -48, -56, -55, -58, -58, -55, -48, -55, -48, -9, 11, -6, -1, 5, -11, -7, -2, -9, 4, 4, -5, 2, -11, -7, 5, 4, -4, -1, -3, 11, 8, -9, 10, -1, 5, 4, -48, -56, -58, -57, -57, -64, -75, -62, -69, -91, -40, -82, -86, -74, -38, -7, -40, -82, -86, -78, -38, -40, -83, -86, -74, -38, -7, -77, -40, -83, -86, -80, -38, -90, -70, -85, -89, -6, -4, -17, -3, -17, -8, -2, -21, -2, -13, -7, -8, -34, -13, -9, -17, -82, -86, -82, -90, -107, -70, -79, -90, 16, 21, 12, 1, -117, -82, -85, -70, -66, -85, -66, -77, -71, -72, -99, -81, -66, 20, 12, 11, 16, 8, -9, 25, 12, 26, 12, 21, 27, 8, 27, 16, 22, 21, -21, 28, 25, 8, 27, 16, 22, 21, 8, -5, -10, -9, 1, -63, -1, 2, -58, -40, -39, -38, -43, -23, -32, -24, -45, -65, -67, -72, -3, 9, -2, -1, -3, 13, 28, 14, 9, 10, 27, 14, 19, 10, -33, 17, 14, 8, 10, 19, 24, 10, -79, -27, -44, -39, -33, -77, -40, -47, -34, -34, -43, -36, -77, -33, -34, -42, -39, -41, -27, -30, -47, -28, -39, -33, -34, -89, -45, -39, -48, -56, -46, -117, -40, -124, -57, -42, -55, -59, -40, -55, -124, -68, -47, -48, -76, -39, -48, -48, -76, -59, -42, -41, -55, -42, -86, -59, -57, -40, -45, -42, -35, -124, -51, -46, -41, -40, -59, -46, -57, -55, -19, -27, -28, -23, -31, -46, -31, -18, -25, -27, -16, -35, -29, -74, -32, -21, -24, -34, -11, -86, -33, -21, -23, -88, -82, -84, -83, -80, -74, -32, -35, -17, -28, -74, -64, -21, -24, -34, -11, -64, -27, -29, -27, -16, -35, -24, -52, -24, -15, -17, -63, -12, -16, -31, -22, -17, -27, -21, -22, -48, -11, -20, -31, -74, -82, -84, -83, -80, -40, -53, -58, -57, -47, -79, -60, -49, -47, -60, -46, -60, -51, -45, -64, -45, -56, -50, -51, -5, 19, 17, 24, 24, 17, 22, 15, -56, 21, 9, 20, 14, 23, 26, 21, 13, 12, -56, 11, 13, 22, 11, -30, 24, 27, 27, 16, -56, 12, 9, 28, 9, -94, -88, 111, -95, -106, -86, -89, -95, -76, -107, -107, 122, -83, -125, Byte.MAX_VALUE, -122, -81, 123, -113, Byte.MIN_VALUE, 124, 5, 10, 12, 17, 16, -17, 16, 14, 1, -3, 9, -68, 0, 11, 1, 15, -68, 10, 11, 16, -68, -1, 11, 10, 16, -3, 5, 10, -68, -3, -68, 18, -3, 8, 5, 0, -68, 9, 1, 0, 5, -3, -68, 12, 14, 1, 15, 1, 10, 16, -3, 16, 5, 11, 10, -68, 0, 1, 15, -1, 14, 5, 12, 16, 5, 11, 10, -29, -27, -31, -73, -80, -72, -59, -47, -64, -52, -60, -79, -64, -45, -60, -5, 29, 24, 24, 20, 13, 21, 13, 22, 28, 9, 20, -8, 26, 23, 24, 13, 26, 28, 33, -47, -19, -4, -4, -8, -11, -17, -19, 0, -11, -5, -6, -69, -7, -4, -64, -93, -96, -92, -94, -93, -81, -92, -74, -72, -66, -74, -65, -59, -91, -70, -66, -74, -67, -70, -65, -74, -51, -19, -18, -37, -20, -18, -115, -84, -66, -80, -96, -99, -105, -69, -70, -87, -70, -49, -45, -49, -44, -51, -34, 15, -2, 7, 13, -20, 13, 11, -2, -6, 6, -70, -52, -50, -44, -52, -43, -37, -69, -52, -44, -41, -45, -56, -37, -52, -89, -104, -85, -89, -15, 8, -64, 20, 22, 9, 23, 9, 18, 24, 5, 24, 13, 19, 18, -8, 13, 17, 9, -13, 10, 10, 23, 9, 24, -46, -25, -36, -49, -37, -41, -47, -107, -73, -73, -71, -57, -57, -67, -74, -67, -64, -67, -56, -51, -12, -31, -25, -70, -28, -17, -20, -30, -7, -82, -29, -17, -19, -84, -78, -80, -79, -76, -70, -28, -31, -13, -24, -70, -31, -11, -28, -23, -17, -33, -29, -24, -31, -18, -18, -27, -20, -33, -29, -17, -18, -26, -23, -25, -11, -14, -31, -12, -23, -17, -18, -70, -78, -80, -79, -79, -23, -26, -30, -82, -23, -23, -35, -40, 
        -82, -83, -43, -92, -88, -38, -92, -85, -83, -95, -83, -84, -88, -92, -95, -88, -90, -84, -86, -95, -43, -42, -83, -90, -95, -39, -86, -87, -42, -39, -92, -84, -84, -87, -38, -83, -87, -85, -82, -82, -93, -19, -4, -4, -8, -11, -17, -19, 0, -11, -5, -6, -69, -17, -15, -19, -71, -61, -68, -60, 24, 21, 17, -35, 16, 19, 8, 10, -35, 7, 4, 22, 11, -35, 21, 18, 15, 8, -35, -43, -45, -44, -44, -66, -29, -41, -42, -29, -39, -70, -21, -38, -29, -23, -56, -23, -25, -38, -42, -30, -125, -52, 0, 8, -49, -51, -52, -29, -34, -45, -52, 0, 8, -49, -51, -51, -29, 29, 26, 22, -30, 29, 29, 17, 12, -30, 13, 12, 13, 14, -32, 10, 9, -31, -43, -33, -31, 12, -34, -43, -36, 9, 11, 13, -43, 9, -37, 11, -32, -43, -38, -33, 12, 11, 12, -35, -39, 12, -38, -39, 13, 12, -72, -69, -81, -29, -32, -45, -26, -28, -27, -33, -42, -28, -28, -48, -35, -42, -25, -42, -35, -77, -72, -82, -81, -62, -100, -85, -72, -79, -81, -23, -26, -30, -82, -25, -41, -24, -39, -82, -40, -43, -25, -36, -82, -41, -41, -82, -41, -39, -43, -95, -85, -92, -84, -82, -90, -92, -91, -87, -28, -32, -27, -32, -28, -20, -28, -52, -25, -37, -40, -21, -36, -57, -36, -23, -32, -26, -37, -117, -102, -102, -106, -109, -115, -117, -98, -109, -103, -104, 89, -94, 87, -100, -117, -95, -115, -115, -66, -46, -63, -58, -52, -116, -62, -66, -64, -112, -70, -55, -55, -59, -62, -68, -70, -51, -62, -56, -57, -120, -51, -51, -58, -59, -124, -47, -58, -59, -39, -14, -27, -26, -16, -23, -92, -8, -13, -92, -24, -23, -8, -23, -10, -15, -19, -14, -23, -92, -9, -8, -27, -10, -8, -92, -13, -22, -92, -12, -23, -10, -19, -13, -24, -92, -37, -31, -34, -32, -88, -34, -32, -35, 121, -91, -92, -86, -101, -92, -86, 121, -91, -93, -90, -91, -92, -101, -92, -86, -61, -36, -49, -48, -38, -45, -114, -30, -35, -114, -34, -49, -32, -31, -45, -114, -79, -77, -81, -101, -92, -98, -90, -114, -47, -42, -49, -36, -36, -45, -38, -114, -36, -29, -37, -48, -45, -32, -114, -44, -32, -35, -37, -88, -114, -73, -5, -6, -8, -8, -86, -86, -86, -86, -86, -86, -86, -86, -89, -86, -86, -86, -86, -89, -86, -86, -86, -86, -89, -86, -86, -86, -86, -89, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -104, -108, -103, 109, -96, -111, -111, -112, -99, Byte.MAX_VALUE, -108, -104, -112, -41, 8, -9, 0, 6, -29, -34, -83, -82, -29, 4, -75, 5, -6, 7, -2, 4, -7, 8, -75, -5, 4, 10, 3, -7, -61, -23, -11, -12, -6, -21, -12, -6, -38, -1, -10, -21, -81, -76, -95, -85, -88, -78, -89, -109, -88, -84, -92, -94, -92, -96, 117, 111, 119, -12, 13, 0, 1, 11, 4, -65, 19, 14, -65, 3, 4, 19, 4, 17, 12, 8, 13, 4, -65, 3, 20, 17, 0, 19, 8, 14, 13, -65, 14, 5, -65, 18, 19, 0, 19, 8, 2, -65, 12, 0, 13, 8, 5, 4, 18, 19, -51, 22, 14, 13, 18, 10, 103, 99, 99, 99, 20, 17, 13, -39, 12, 15, 4, 6, -39, 3, 0, 18, 7, -39, 12, 15, -45, 15, 17, 14, 19, 4, 2, 19, 8, 14, 13, -39, -47, -49, -48, -48, -29, -34, -60, -40, -57, -52, -46, -74, -60, -48, -45, -49, -52, -47, -54, -75, -60, -41, -56, -82, 125, 125, 125, -66, -51, -51, -55, -58, -64, -66, -47, -58, -52, -53, -116, -64, -62, -66, -118, -109, -115, -107, -89, 121, 113, 114, -79, -59, -76, -71, -65, -67, -30, -35, -24, -35, -43, -32, -35, -18, -43, -24, -35, -29, -30, -32, -7, -20, -19, -9, -16, -85, -1, -6, -85, -5, -20, -3, -2, -16, -85, -50, -48, -52, -72, -62, -69, -61, -85, -2, -16, -3, 1, -12, -18, -16, -85, -19, -9, -6, -18, -10, -85, -7, 0, -8, -19, -16, -3, -85, -15, -3, -6, -8, -59, -85, -55, -59, -53, -56, -71, -69, -85, -88, -94, -36, -18, -16, -10, -18, -9, -3, -34, -37, -43, -27, -28, -15, -25, -6, -20, -25, -9, -21};
    }

    static {
        A0o();
        A05 = Pattern.compile(A0h(1101, 16, k.AppCompatTheme_windowMinWidthMajor));
        A03 = Pattern.compile(A0h(688, 12, 40));
        A04 = Pattern.compile(A0h(353, 28, 83));
    }

    public C1049av() {
        this(null);
    }

    public C1049av(String str) {
        this.A00 = str;
        try {
            this.A01 = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException(A0h(514, 45, 58), e);
        }
    }

    public static float A00(XmlPullParser xmlPullParser, float f) throws NumberFormatException {
        String denominatorString = null;
        int i = 0;
        Matcher matcher = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, A0h(773, 9, 53));
        char c2 = attributeValue != null ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    attributeValue = attributeValue;
                    matcher = A05.matcher(attributeValue);
                    if (!matcher.matches()) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    matcher = matcher;
                    i = Integer.parseInt(matcher.group(1));
                    denominatorString = matcher.group(2);
                    if (!TextUtils.isEmpty(denominatorString)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 4:
                    denominatorString = denominatorString;
                    f = i / Integer.parseInt(denominatorString);
                    c2 = 5;
                    break;
                case 5:
                    return f;
                case 6:
                    f = i;
                    c2 = 5;
                    break;
            }
        }
    }

    public static int A01(int i, int i2) {
        boolean z = false;
        char c2 = i == -1 ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return i2;
                case 3:
                    if (i2 != -1) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return i;
                case 5:
                    if (i != i2) {
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
                    IJ.A04(z);
                    return i;
                case '\b':
                    z = false;
                    c2 = 7;
                    break;
            }
        }
    }

    private final int A02(Format format) {
        String str = format.A0O;
        char c2 = TextUtils.isEmpty(str) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return -1;
                case 3:
                    str = str;
                    if (!C0537Ib.A0D(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return 2;
                case 5:
                    str = str;
                    if (!C0537Ib.A0B(str)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return 1;
                case 7:
                    str = str;
                    if (!A0q(str)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return 3;
                case '\t':
                    return -1;
            }
        }
    }

    public static int A03(List<GH> list) {
        GH descriptor = null;
        Matcher matcher = null;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    list = list;
                    if (i >= list.size()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    list = list;
                    descriptor = list.get(i);
                    if (!A0h(255, 29, 108).equals(descriptor.A01)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    descriptor = descriptor;
                    if (descriptor.A02 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    descriptor = descriptor;
                    matcher = A03.matcher(descriptor.A02);
                    if (!matcher.matches()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return Integer.parseInt(matcher.group(1));
                case 7:
                    descriptor = descriptor;
                    Log.w(A0h(0, 9, k.AppCompatTheme_windowMinWidthMinor), A0h(1348, 45, 68) + descriptor.A02);
                    c2 = '\b';
                    break;
                case '\b':
                    i++;
                    c2 = 2;
                    break;
                case '\t':
                    return -1;
            }
        }
    }

    public static int A04(List<GH> list) {
        GH descriptor = null;
        Matcher matcher = null;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    list = list;
                    if (i >= list.size()) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    list = list;
                    descriptor = list.get(i);
                    if (!A0h(1191, 29, 74).equals(descriptor.A01)) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    descriptor = descriptor;
                    if (descriptor.A02 == null) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    descriptor = descriptor;
                    matcher = A04.matcher(descriptor.A02);
                    if (!matcher.matches()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return Integer.parseInt(matcher.group(1));
                case 7:
                    descriptor = descriptor;
                    Log.w(A0h(0, 9, k.AppCompatTheme_windowMinWidthMinor), A0h(1655, 51, 97) + descriptor.A02);
                    c2 = '\b';
                    break;
                case '\b':
                    i++;
                    c2 = 2;
                    break;
                case '\t':
                    return -1;
            }
        }
    }

    public static int A05(XmlPullParser xmlPullParser) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        String strA0P = C0560Iy.A0P(xmlPullParser.getAttributeValue(null, A0h(41, 5, 103)));
        char c2 = strA0P == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return -1;
                case 3:
                    strA0P = strA0P;
                    i = 3;
                    i2 = 2;
                    i3 = 1;
                    switch (strA0P.hashCode()) {
                        case 1596796:
                            c2 = '\n';
                            break;
                        case 2937391:
                            c2 = '\f';
                            break;
                        case 3094035:
                            c2 = 14;
                            break;
                        case 3133436:
                            c2 = 16;
                            break;
                        default:
                            c2 = 4;
                            break;
                    }
                case 4:
                    i4 = -1;
                    c2 = 5;
                    break;
                case 5:
                    if (i4 == 0) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    if (i4 == i3) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    if (i4 == i2) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    if (i4 == i) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return -1;
                case '\n':
                    strA0P = strA0P;
                    if (!strA0P.equals(A0h(1554, 4, 9))) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    i4 = 0;
                    c2 = 5;
                    break;
                case '\f':
                    strA0P = strA0P;
                    if (!strA0P.equals(A0h(1609, 4, 35))) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    i4 = 1;
                    c2 = 5;
                    break;
                case 14:
                    strA0P = strA0P;
                    if (!strA0P.equals(A0h(1632, 4, 23))) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    i4 = 2;
                    c2 = 5;
                    break;
                case 16:
                    strA0P = strA0P;
                    if (!strA0P.equals(A0h(1452, 4, 83))) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    i4 = 3;
                    c2 = 5;
                    break;
                case 18:
                    return 8;
                case 19:
                    return 6;
                case 20:
                    return i2;
                case 21:
                    return i3;
            }
        }
    }

    private final int A06(XmlPullParser xmlPullParser) throws XmlPullParserException, NumberFormatException, IOException {
        int i = 0;
        String strA0m = A0m(xmlPullParser, A0h(187, 11, 13), null);
        int iA05 = -1;
        char c2 = A0h(295, 54, 108).equals(strA0m) ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    xmlPullParser = xmlPullParser;
                    iA05 = A09(xmlPullParser, A0h(41, 5, 103), iA05);
                    c2 = 3;
                    break;
                case 3:
                    i = iA05;
                    c2 = 4;
                    break;
                case 4:
                    xmlPullParser = xmlPullParser;
                    xmlPullParser.next();
                    if (!C0561Iz.A05(xmlPullParser, A0h(489, 25, 70))) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return i;
                case 6:
                    strA0m = strA0m;
                    if (!A0h(936, 56, 86).equals(strA0m)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    xmlPullParser = xmlPullParser;
                    iA05 = A05(xmlPullParser);
                    c2 = 3;
                    break;
            }
        }
    }

    private final int A07(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, A0h(1473, 11, 92));
        int i = -1;
        char c2 = TextUtils.isEmpty(attributeValue) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return i;
                case 3:
                    attributeValue = attributeValue;
                    if (!A0h(1636, 5, 38).equals(attributeValue)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    i = 1;
                    c2 = 2;
                    break;
                case 5:
                    attributeValue = attributeValue;
                    if (!A0h(627, 5, 56).equals(attributeValue)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    i = 2;
                    c2 = 2;
                    break;
                case 7:
                    attributeValue = attributeValue;
                    if (!A0h(887, 4, 9).equals(attributeValue)) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    i = 3;
                    c2 = 2;
                    break;
            }
        }
    }

    private final int A08(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 0;
        String strA0m = A0m(xmlPullParser, A0h(187, 11, 13), null);
        String strA0m2 = A0m(xmlPullParser, A0h(41, 5, 103), null);
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    xmlPullParser = xmlPullParser;
                    xmlPullParser.next();
                    if (!C0561Iz.A05(xmlPullParser, A0h(107, 4, k.AppCompatTheme_windowActionBarOverlay))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    strA0m = strA0m;
                    if (!A0h(1060, 23, k.AppCompatTheme_windowFixedWidthMinor).equals(strA0m)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    strA0m2 = strA0m2;
                    if (!A0h(147, 4, 107).equals(strA0m2)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i = 1;
                    c2 = 6;
                    break;
                case 6:
                    return i;
                case 7:
                    i = 0;
                    c2 = 6;
                    break;
            }
        }
    }

    public static int A09(XmlPullParser xmlPullParser, String str, int i) throws NumberFormatException {
        int i2 = 0;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        char c2 = attributeValue == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    i2 = i;
                    c2 = 3;
                    break;
                case 3:
                    return i2;
                case 4:
                    attributeValue = attributeValue;
                    i2 = Integer.parseInt(attributeValue);
                    c2 = 3;
                    break;
            }
        }
    }

    public static long A0A(XmlPullParser xmlPullParser, String str, long j) throws AF {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        return C0560Iy.A0K(attributeValue);
    }

    public static long A0B(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        return C0560Iy.A0L(attributeValue);
    }

    public static long A0C(XmlPullParser xmlPullParser, String str, long j) throws NumberFormatException {
        long j2 = 0;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        char c2 = attributeValue == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    j2 = j;
                    c2 = 3;
                    break;
                case 3:
                    return j2;
                case 4:
                    attributeValue = attributeValue;
                    j2 = Long.parseLong(attributeValue);
                    c2 = 3;
                    break;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:53:0x016b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.util.Pair<java.lang.String, com.facebook.ads.internal.exoplayer2.drm.DrmInitData.SchemeData> A0D(org.xmlpull.v1.XmlPullParser r17) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1049av.A0D(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    private final Pair<GJ, Long> A0E(XmlPullParser xmlPullParser, String str, long j) throws XmlPullParserException, IOException, NumberFormatException {
        String str2 = str;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C1049av c1049av = this;
        boolean z = false;
        String strA0l = null;
        GP gpA0a = null;
        C1049av c1049av2 = c1049av;
        XmlPullParser xmlPullParser3 = xmlPullParser2;
        String attributeValue = xmlPullParser3.getAttributeValue(null, A0h(1590, 2, 80));
        long jA0B = A0B(xmlPullParser3, A0h(840, 5, 80), j);
        long jA0B2 = A0B(xmlPullParser3, A0h(139, 8, 98), -9223372036854775807L);
        GP gp = null;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = false;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    xmlPullParser2 = xmlPullParser2;
                    xmlPullParser3 = xmlPullParser3;
                    xmlPullParser2.next();
                    if (!C0561Iz.A06(xmlPullParser3, A0h(845, 7, 33))) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    if (!z2) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case 4:
                    xmlPullParser3 = xmlPullParser3;
                    str2 = str2;
                    strA0l = A0l(xmlPullParser3, str2);
                    z = true;
                    gpA0a = gp;
                    c2 = 5;
                    break;
                case 5:
                    xmlPullParser3 = xmlPullParser3;
                    String baseUrl = A0h(289, 6, 105);
                    if (!C0561Iz.A05(xmlPullParser3, baseUrl)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return Pair.create(c1049av.A0R(attributeValue, jA0B, arrayList, arrayList2), Long.valueOf(jA0B2));
                case 7:
                    strA0l = strA0l;
                    str2 = strA0l;
                    gp = gpA0a;
                    z2 = z;
                    c2 = 2;
                    break;
                case '\b':
                    xmlPullParser3 = xmlPullParser3;
                    String baseUrl2 = A0h(409, 13, 32);
                    if (!C0561Iz.A06(xmlPullParser3, baseUrl2)) {
                        c2 = 11;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    c1049av2 = c1049av2;
                    xmlPullParser3 = xmlPullParser3;
                    arrayList = arrayList;
                    str2 = str2;
                    arrayList.add(c1049av2.A0J(xmlPullParser3, str2, gp));
                    c2 = '\n';
                    break;
                case '\n':
                    str2 = str2;
                    strA0l = str2;
                    z = z2;
                    gpA0a = gp;
                    c2 = 5;
                    break;
                case 11:
                    xmlPullParser3 = xmlPullParser3;
                    String baseUrl3 = A0h(861, 11, 111);
                    if (!C0561Iz.A06(xmlPullParser3, baseUrl3)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c1049av = c1049av;
                    xmlPullParser2 = xmlPullParser2;
                    arrayList2 = arrayList2;
                    arrayList2.add(c1049av.A0Q(xmlPullParser2));
                    c2 = '\n';
                    break;
                case '\r':
                    xmlPullParser3 = xmlPullParser3;
                    if (!C0561Iz.A06(xmlPullParser3, A0h(204, 11, 125))) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    c1049av2 = c1049av2;
                    xmlPullParser3 = xmlPullParser3;
                    str2 = str2;
                    gpA0a = c1049av2.A0d(xmlPullParser3, null);
                    strA0l = str2;
                    z = z2;
                    c2 = 5;
                    break;
                case 15:
                    xmlPullParser3 = xmlPullParser3;
                    String baseUrl4 = A0h(9, 11, 26);
                    if (!C0561Iz.A06(xmlPullParser3, baseUrl4)) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 16;
                        break;
                    }
                case 16:
                    c1049av2 = c1049av2;
                    xmlPullParser3 = xmlPullParser3;
                    str2 = str2;
                    gpA0a = c1049av2.A0Y(xmlPullParser3, null);
                    strA0l = str2;
                    z = z2;
                    c2 = 5;
                    break;
                case 17:
                    xmlPullParser3 = xmlPullParser3;
                    if (!C0561Iz.A06(xmlPullParser3, A0h(872, 15, 61))) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    c1049av2 = c1049av2;
                    xmlPullParser3 = xmlPullParser3;
                    str2 = str2;
                    gpA0a = c1049av2.A0a(xmlPullParser3, null);
                    strA0l = str2;
                    z = z2;
                    c2 = 5;
                    break;
            }
        }
    }

    private final Format A0F(String str, String str2, int i, int i2, float f, int i3, int i4, int accessibilityChannel, String str3, int accessibilityChannel2, List<GH> list, String sampleMimeType, List<GH> list2) {
        List<GH> list3 = list;
        List<GH> list4 = list2;
        String strA0k = null;
        int iA03 = 0;
        String strA0j = A0j(str2, sampleMimeType);
        char c2 = strA0j != null ? (char) 2 : (char) 16;
        while (true) {
            switch (c2) {
                case 2:
                    strA0j = strA0j;
                    if (!A0h(1258, 10, 51).equals(strA0j)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    list4 = list4;
                    strA0k = A0k(list4);
                    c2 = 4;
                    break;
                case 4:
                    strA0k = strA0k;
                    if (!C0537Ib.A0D(strA0k)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return Format.A0C(str, str2, strA0k, sampleMimeType, accessibilityChannel, i, i2, f, null, accessibilityChannel2);
                case 6:
                    strA0j = strA0j;
                    strA0k = strA0j;
                    c2 = 4;
                    break;
                case 7:
                    strA0k = strA0k;
                    if (!C0537Ib.A0B(strA0k)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return Format.A0D(str, str2, strA0k, sampleMimeType, accessibilityChannel, i3, i4, null, accessibilityChannel2, str3);
                case '\t':
                    strA0k = strA0k;
                    if (!A0q(strA0k)) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    strA0k = strA0k;
                    if (!A0h(1613, 19, 51).equals(strA0k)) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    list3 = list3;
                    iA03 = A03(list3);
                    c2 = '\f';
                    break;
                case '\f':
                    return Format.A0F(str, str2, strA0k, sampleMimeType, accessibilityChannel, accessibilityChannel2, str3, iA03);
                case '\r':
                    strA0k = strA0k;
                    if (!A0h(1041, 19, 98).equals(strA0k)) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    list3 = list3;
                    iA03 = A04(list3);
                    c2 = '\f';
                    break;
                case 15:
                    iA03 = -1;
                    c2 = '\f';
                    break;
                case 16:
                    strA0j = strA0j;
                    strA0k = strA0j;
                    c2 = 17;
                    break;
                case 17:
                    return Format.A0E(str, str2, strA0k, sampleMimeType, accessibilityChannel, accessibilityChannel2, str3);
            }
        }
    }

    private final EventMessage A0G(String str, String str2, long j, long j2, byte[] bArr, long j3) {
        return new EventMessage(str, str2, j2, j, bArr, j3);
    }

    private final EventMessage A0H(XmlPullParser xmlPullParser, String str, String str2, long j, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, NumberFormatException, IOException {
        long id = A0C(xmlPullParser, A0h(1590, 2, 80), 0L);
        long jA0C = A0C(xmlPullParser, A0h(139, 8, 98), -9223372036854775807L);
        long jA0C2 = A0C(xmlPullParser, A0h(381, 16, 96), 0L);
        return A0G(str, str2, id, C0560Iy.A0G(jA0C, 1000L, j), A0r(xmlPullParser, byteArrayOutputStream), C0560Iy.A0G(jA0C2, 1000000L, j));
    }

    private final GF A0I(int i, int i2, List<GM> list, List<GH> list2, List<GH> list3) {
        return new GF(i, i2, list, list2, list3);
    }

    private final GF A0J(XmlPullParser xmlPullParser, String str, GP gp) throws XmlPullParserException, NumberFormatException, IOException {
        GP gpA0Y = gp;
        String str2 = str;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C1049av c1049av = this;
        String strA0h = null;
        ArrayList<GH> arrayList = null;
        int contentType = 0;
        int i = 0;
        String codecs = null;
        List<Representation> list = null;
        XmlPullParser xmlPullParser3 = null;
        String strA0l = null;
        Pair<String, DrmInitData.SchemeData> pairA0D = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList<GH> arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        String strA0i = null;
        String str4 = null;
        int iA01 = 0;
        String strA0h2 = null;
        C1049av c1049av2 = c1049av;
        XmlPullParser xmlPullParser4 = xmlPullParser2;
        int iA09 = A09(xmlPullParser4, A0h(1590, 2, 80), -1);
        int iA07 = c1049av.A07(xmlPullParser2);
        String str5 = null;
        String attributeValue = xmlPullParser4.getAttributeValue(null, A0h(397, 8, 23));
        String attributeValue2 = xmlPullParser4.getAttributeValue(null, A0h(467, 6, 112));
        int iA092 = A09(xmlPullParser4, A0h(284, 5, 67), -1);
        int iA093 = A09(xmlPullParser4, A0h(818, 6, 17), -1);
        float fA00 = A00(xmlPullParser4, -1.0f);
        int iA06 = -1;
        int iA094 = A09(xmlPullParser4, A0h(1592, 17, 57), -1);
        String strA0h3 = A0h(349, 4, 42);
        String attributeValue3 = xmlPullParser4.getAttributeValue(null, strA0h3);
        String str6 = null;
        ArrayList arrayList7 = new ArrayList();
        ArrayList<GH> arrayList8 = new ArrayList<>();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        List<Representation> arrayList11 = new ArrayList<>();
        int iA08 = 0;
        boolean z = false;
        int selectionFlags = 2;
        while (true) {
            switch (selectionFlags) {
                case 2:
                    xmlPullParser2 = xmlPullParser2;
                    xmlPullParser4 = xmlPullParser4;
                    xmlPullParser2.next();
                    if (!C0561Iz.A06(xmlPullParser4, A0h(845, 7, 33))) {
                        selectionFlags = 10;
                        break;
                    } else {
                        selectionFlags = 3;
                        break;
                    }
                case 3:
                    if (!z) {
                        selectionFlags = 4;
                        break;
                    } else {
                        selectionFlags = 37;
                        break;
                    }
                case 4:
                    xmlPullParser4 = xmlPullParser4;
                    strA0h3 = strA0h3;
                    arrayList7 = arrayList7;
                    arrayList8 = arrayList8;
                    arrayList9 = arrayList9;
                    arrayList10 = arrayList10;
                    arrayList11 = (ArrayList) arrayList11;
                    str2 = str2;
                    attributeValue3 = attributeValue3;
                    strA0l = A0l(xmlPullParser4, str2);
                    z = true;
                    strA0i = attributeValue3;
                    list = arrayList11;
                    arrayList3 = arrayList10;
                    arrayList2 = arrayList9;
                    arrayList4 = arrayList8;
                    arrayList5 = arrayList7;
                    str3 = strA0h3;
                    str4 = str5;
                    xmlPullParser3 = xmlPullParser4;
                    iA01 = iA07;
                    selectionFlags = 5;
                    break;
                case 5:
                    xmlPullParser3 = xmlPullParser3;
                    if (!C0561Iz.A05(xmlPullParser3, A0h(409, 13, 32))) {
                        selectionFlags = 9;
                        break;
                    } else {
                        selectionFlags = 6;
                        break;
                    }
                case 6:
                    list = (ArrayList) list;
                    arrayList6 = new ArrayList(list.size());
                    i = 0;
                    selectionFlags = 7;
                    break;
                case 7:
                    List<Representation> representations = list;
                    list = (ArrayList) representations;
                    int i2 = list.size();
                    if (i >= i2) {
                        selectionFlags = 39;
                        break;
                    } else {
                        selectionFlags = 8;
                        break;
                    }
                case 8:
                    c1049av = c1049av;
                    c1049av2 = c1049av2;
                    list = (ArrayList) list;
                    arrayList4 = arrayList4;
                    arrayList5 = arrayList5;
                    arrayList6 = arrayList6;
                    arrayList6.add(c1049av.A0W((GG) list.get(i), c1049av2.A00, str6, arrayList5, arrayList4));
                    i++;
                    selectionFlags = 7;
                    break;
                case 9:
                    strA0l = strA0l;
                    strA0i = strA0i;
                    list = (ArrayList) list;
                    arrayList3 = arrayList3;
                    arrayList2 = arrayList2;
                    arrayList4 = arrayList4;
                    arrayList5 = arrayList5;
                    str3 = str3;
                    xmlPullParser3 = xmlPullParser3;
                    xmlPullParser4 = xmlPullParser3;
                    arrayList8 = arrayList4;
                    iA07 = iA01;
                    attributeValue3 = strA0i;
                    arrayList10 = arrayList3;
                    arrayList9 = arrayList2;
                    arrayList7 = arrayList5;
                    strA0h3 = str3;
                    str5 = str4;
                    arrayList11 = list;
                    str2 = strA0l;
                    selectionFlags = 2;
                    break;
                case 10:
                    xmlPullParser4 = xmlPullParser4;
                    if (!C0561Iz.A06(xmlPullParser4, A0h(46, 17, 60))) {
                        selectionFlags = 16;
                        break;
                    } else {
                        selectionFlags = 11;
                        break;
                    }
                case 11:
                    c1049av = c1049av;
                    xmlPullParser2 = xmlPullParser2;
                    pairA0D = c1049av.A0D(xmlPullParser2);
                    if (pairA0D.first == null) {
                        selectionFlags = 13;
                        break;
                    } else {
                        selectionFlags = 12;
                        break;
                    }
                case 12:
                    pairA0D = pairA0D;
                    str6 = (String) pairA0D.first;
                    selectionFlags = 13;
                    break;
                case 13:
                    pairA0D = pairA0D;
                    if (pairA0D.second == null) {
                        selectionFlags = 15;
                        break;
                    } else {
                        selectionFlags = 14;
                        break;
                    }
                case 14:
                    arrayList7 = arrayList7;
                    pairA0D = pairA0D;
                    arrayList7.add(pairA0D.second);
                    selectionFlags = 15;
                    break;
                case 15:
                    xmlPullParser4 = xmlPullParser4;
                    strA0h3 = strA0h3;
                    arrayList7 = arrayList7;
                    arrayList8 = arrayList8;
                    arrayList9 = arrayList9;
                    arrayList10 = arrayList10;
                    arrayList11 = (ArrayList) arrayList11;
                    str2 = str2;
                    attributeValue3 = attributeValue3;
                    strA0i = attributeValue3;
                    strA0l = str2;
                    list = arrayList11;
                    arrayList3 = arrayList10;
                    arrayList2 = arrayList9;
                    arrayList4 = arrayList8;
                    arrayList5 = arrayList7;
                    str3 = strA0h3;
                    str4 = str5;
                    xmlPullParser3 = xmlPullParser4;
                    iA01 = iA07;
                    selectionFlags = 5;
                    break;
                case 16:
                    xmlPullParser4 = xmlPullParser4;
                    if (!C0561Iz.A06(xmlPullParser4, A0h(1332, 16, 12))) {
                        selectionFlags = 18;
                        break;
                    } else {
                        selectionFlags = 17;
                        break;
                    }
                case 17:
                    c1049av = c1049av;
                    xmlPullParser2 = xmlPullParser2;
                    xmlPullParser4 = xmlPullParser4;
                    strA0h3 = strA0h3;
                    arrayList7 = arrayList7;
                    arrayList8 = arrayList8;
                    arrayList9 = arrayList9;
                    arrayList10 = arrayList10;
                    arrayList11 = (ArrayList) arrayList11;
                    str2 = str2;
                    attributeValue3 = attributeValue3;
                    strA0i = A0i(attributeValue3, xmlPullParser4.getAttributeValue(str5, strA0h3));
                    iA01 = A01(iA07, c1049av.A07(xmlPullParser2));
                    strA0l = str2;
                    list = arrayList11;
                    arrayList3 = arrayList10;
                    arrayList2 = arrayList9;
                    arrayList4 = arrayList8;
                    arrayList5 = arrayList7;
                    str3 = strA0h3;
                    str4 = str5;
                    xmlPullParser3 = xmlPullParser4;
                    selectionFlags = 5;
                    break;
                case 18:
                    xmlPullParser4 = xmlPullParser4;
                    if (!C0561Iz.A06(xmlPullParser4, A0h(107, 4, k.AppCompatTheme_windowActionBarOverlay))) {
                        selectionFlags = 20;
                        break;
                    } else {
                        selectionFlags = 19;
                        break;
                    }
                case 19:
                    c1049av = c1049av;
                    xmlPullParser2 = xmlPullParser2;
                    xmlPullParser4 = xmlPullParser4;
                    strA0h3 = strA0h3;
                    arrayList7 = arrayList7;
                    arrayList8 = arrayList8;
                    arrayList9 = arrayList9;
                    arrayList10 = arrayList10;
                    arrayList11 = (ArrayList) arrayList11;
                    str2 = str2;
                    attributeValue3 = attributeValue3;
                    iA08 |= c1049av.A08(xmlPullParser2);
                    strA0i = attributeValue3;
                    strA0l = str2;
                    list = arrayList11;
                    arrayList3 = arrayList10;
                    arrayList2 = arrayList9;
                    arrayList4 = arrayList8;
                    arrayList5 = arrayList7;
                    str3 = strA0h3;
                    str4 = str5;
                    xmlPullParser3 = xmlPullParser4;
                    iA01 = iA07;
                    selectionFlags = 5;
                    break;
                case 20:
                    xmlPullParser4 = xmlPullParser4;
                    if (!C0561Iz.A06(xmlPullParser4, A0h(489, 25, 70))) {
                        selectionFlags = 22;
                        break;
                    } else {
                        selectionFlags = 21;
                        break;
                    }
                case 21:
                    c1049av = c1049av;
                    xmlPullParser2 = xmlPullParser2;
                    xmlPullParser4 = xmlPullParser4;
                    strA0h3 = strA0h3;
                    arrayList7 = arrayList7;
                    arrayList8 = arrayList8;
                    arrayList9 = arrayList9;
                    arrayList10 = arrayList10;
                    arrayList11 = (ArrayList) arrayList11;
                    str2 = str2;
                    attributeValue3 = attributeValue3;
                    iA06 = c1049av.A06(xmlPullParser2);
                    strA0i = attributeValue3;
                    strA0l = str2;
                    list = arrayList11;
                    arrayList3 = arrayList10;
                    arrayList2 = arrayList9;
                    arrayList4 = arrayList8;
                    arrayList5 = arrayList7;
                    str3 = strA0h3;
                    str4 = str5;
                    xmlPullParser3 = xmlPullParser4;
                    iA01 = iA07;
                    selectionFlags = 5;
                    break;
                case 22:
                    xmlPullParser4 = xmlPullParser4;
                    codecs = A0h(923, 13, 42);
                    if (!C0561Iz.A06(xmlPullParser4, codecs)) {
                        selectionFlags = 24;
                        break;
                    } else {
                        selectionFlags = 23;
                        break;
                    }
                case 23:
                    xmlPullParser4 = xmlPullParser4;
                    strA0h3 = strA0h3;
                    arrayList7 = arrayList7;
                    arrayList8 = arrayList8;
                    arrayList9 = arrayList9;
                    arrayList10 = arrayList10;
                    arrayList11 = (ArrayList) arrayList11;
                    str2 = str2;
                    attributeValue3 = attributeValue3;
                    codecs = codecs;
                    arrayList9.add(A0O(xmlPullParser4, codecs));
                    contentType = iA07;
                    strA0i = attributeValue3;
                    strA0l = str2;
                    list = arrayList11;
                    arrayList3 = arrayList10;
                    arrayList2 = arrayList9;
                    arrayList4 = arrayList8;
                    arrayList5 = arrayList7;
                    str3 = strA0h3;
                    str4 = str5;
                    xmlPullParser3 = xmlPullParser4;
                    selectionFlags = 38;
                    break;
                case 24:
                    xmlPullParser4 = xmlPullParser4;
                    strA0h2 = A0h(782, 20, 126);
                    if (!C0561Iz.A06(xmlPullParser4, strA0h2)) {
                        selectionFlags = 26;
                        break;
                    } else {
                        selectionFlags = 25;
                        break;
                    }
                case 25:
                    xmlPullParser4 = xmlPullParser4;
                    strA0h3 = strA0h3;
                    arrayList7 = arrayList7;
                    arrayList8 = arrayList8;
                    arrayList9 = arrayList9;
                    arrayList10 = arrayList10;
                    arrayList11 = (ArrayList) arrayList11;
                    str2 = str2;
                    attributeValue3 = attributeValue3;
                    strA0h2 = strA0h2;
                    arrayList10.add(A0O(xmlPullParser4, strA0h2));
                    contentType = iA07;
                    strA0i = attributeValue3;
                    strA0l = str2;
                    list = arrayList11;
                    arrayList3 = arrayList10;
                    arrayList2 = arrayList9;
                    arrayList4 = arrayList8;
                    arrayList5 = arrayList7;
                    str3 = strA0h3;
                    str4 = str5;
                    xmlPullParser3 = xmlPullParser4;
                    selectionFlags = 38;
                    break;
                case 26:
                    xmlPullParser4 = xmlPullParser4;
                    if (!C0561Iz.A06(xmlPullParser4, A0h(632, 14, 53))) {
                        selectionFlags = 28;
                        break;
                    } else {
                        selectionFlags = 27;
                        break;
                    }
                case 27:
                    c1049av = c1049av;
                    xmlPullParser2 = xmlPullParser2;
                    c1049av2 = c1049av2;
                    attributeValue = attributeValue;
                    attributeValue2 = attributeValue2;
                    strA0h3 = strA0h3;
                    arrayList7 = arrayList7;
                    arrayList8 = arrayList8;
                    arrayList9 = arrayList9;
                    arrayList10 = arrayList10;
                    arrayList11 = (ArrayList) arrayList11;
                    str2 = str2;
                    gpA0Y = gpA0Y;
                    attributeValue3 = attributeValue3;
                    strA0i = attributeValue3;
                    strA0l = str2;
                    arrayList3 = arrayList10;
                    arrayList2 = arrayList9;
                    arrayList5 = arrayList7;
                    str3 = strA0h3;
                    str4 = str5;
                    GG ggA0N = c1049av.A0N(xmlPullParser2, str2, attributeValue, attributeValue2, iA092, iA093, fA00, iA06, iA094, strA0i, iA08, arrayList2, gpA0Y);
                    iA01 = A01(iA07, c1049av2.A02(ggA0N.A01));
                    list = arrayList11;
                    list.add(ggA0N);
                    xmlPullParser3 = xmlPullParser2;
                    arrayList4 = arrayList8;
                    selectionFlags = 5;
                    break;
                case 28:
                    xmlPullParser2 = xmlPullParser2;
                    strA0h3 = strA0h3;
                    arrayList7 = arrayList7;
                    arrayList8 = arrayList8;
                    arrayList9 = arrayList9;
                    arrayList10 = arrayList10;
                    arrayList11 = (ArrayList) arrayList11;
                    str2 = str2;
                    attributeValue3 = attributeValue3;
                    strA0i = attributeValue3;
                    strA0l = str2;
                    list = arrayList11;
                    arrayList3 = arrayList10;
                    arrayList2 = arrayList9;
                    arrayList = arrayList8;
                    arrayList5 = arrayList7;
                    str3 = strA0h3;
                    str4 = str5;
                    xmlPullParser3 = xmlPullParser2;
                    contentType = iA07;
                    if (!C0561Iz.A06(xmlPullParser3, A0h(204, 11, 125))) {
                        selectionFlags = 30;
                        break;
                    } else {
                        selectionFlags = 29;
                        break;
                    }
                case 29:
                    c1049av2 = c1049av2;
                    xmlPullParser3 = xmlPullParser3;
                    arrayList = arrayList;
                    gpA0Y = c1049av2.A0d(xmlPullParser3, (C1053az) gpA0Y);
                    iA01 = contentType;
                    arrayList4 = arrayList;
                    selectionFlags = 5;
                    break;
                case 30:
                    xmlPullParser3 = xmlPullParser3;
                    if (!C0561Iz.A06(xmlPullParser3, A0h(9, 11, 26))) {
                        selectionFlags = 32;
                        break;
                    } else {
                        selectionFlags = 31;
                        break;
                    }
                case 31:
                    c1049av2 = c1049av2;
                    xmlPullParser3 = xmlPullParser3;
                    arrayList = arrayList;
                    gpA0Y = c1049av2.A0Y(xmlPullParser3, (C0) gpA0Y);
                    iA01 = contentType;
                    arrayList4 = arrayList;
                    selectionFlags = 5;
                    break;
                case 32:
                    xmlPullParser3 = xmlPullParser3;
                    if (!C0561Iz.A06(xmlPullParser3, A0h(872, 15, 61))) {
                        selectionFlags = 34;
                        break;
                    } else {
                        selectionFlags = 33;
                        break;
                    }
                case 33:
                    c1049av2 = c1049av2;
                    xmlPullParser3 = xmlPullParser3;
                    arrayList = arrayList;
                    gpA0Y = c1049av2.A0a(xmlPullParser3, (C0400Bz) gpA0Y);
                    iA01 = contentType;
                    arrayList4 = arrayList;
                    selectionFlags = 5;
                    break;
                case 34:
                    xmlPullParser3 = xmlPullParser3;
                    strA0h = A0h(1083, 17, 75);
                    if (!C0561Iz.A06(xmlPullParser3, strA0h)) {
                        selectionFlags = 36;
                        break;
                    } else {
                        selectionFlags = 35;
                        break;
                    }
                case 35:
                    xmlPullParser3 = xmlPullParser3;
                    arrayList = arrayList;
                    strA0h = strA0h;
                    arrayList4 = arrayList;
                    arrayList4.add(A0O(xmlPullParser3, strA0h));
                    selectionFlags = 38;
                    break;
                case 36:
                    xmlPullParser2 = xmlPullParser2;
                    arrayList = arrayList;
                    arrayList4 = arrayList;
                    if (!C0561Iz.A03(xmlPullParser2)) {
                        selectionFlags = 38;
                        break;
                    } else {
                        selectionFlags = 38;
                        break;
                    }
                case 37:
                    xmlPullParser4 = xmlPullParser4;
                    strA0h3 = strA0h3;
                    arrayList7 = arrayList7;
                    arrayList8 = arrayList8;
                    arrayList9 = arrayList9;
                    arrayList10 = arrayList10;
                    arrayList11 = (ArrayList) arrayList11;
                    str2 = str2;
                    attributeValue3 = attributeValue3;
                    contentType = iA07;
                    strA0i = attributeValue3;
                    strA0l = str2;
                    list = arrayList11;
                    arrayList3 = arrayList10;
                    arrayList2 = arrayList9;
                    arrayList4 = arrayList8;
                    arrayList5 = arrayList7;
                    str3 = strA0h3;
                    str4 = str5;
                    xmlPullParser3 = xmlPullParser4;
                    selectionFlags = 38;
                    break;
                case 38:
                    iA01 = contentType;
                    selectionFlags = 5;
                    break;
                case 39:
                    return c1049av.A0I(iA09, iA01, arrayList6, arrayList2, arrayList3);
            }
        }
    }

    private final C1048au A0K(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, GR gr, Uri uri, List<GJ> list) {
        return new C1048au(j, j2, j3, z, j4, j5, j6, j7, gr, uri, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0533Hx
    /* renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public final C1048au ABc(Uri uri, InputStream inputStream) throws XmlPullParserException, IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.A01.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && A0h(1162, 3, 65).equals(xmlPullParserNewPullParser.getName())) {
                return A0M(xmlPullParserNewPullParser, uri.toString());
            }
            throw new AF(A0h(700, 67, k.AppCompatTheme_viewInflaterClass));
        } catch (XmlPullParserException e) {
            throw new AF(e);
        }
    }

    private final C1048au A0M(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException, NumberFormatException {
        String str2 = str;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C1049av c1049av = this;
        boolean z = false;
        GR utcTiming = null;
        long j = 0;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        long j2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        Uri uri2 = null;
        long j3 = 0;
        boolean z4 = false;
        long j4 = 0;
        boolean seenEarlyAccessPeriod = false;
        GR gr = null;
        Pair<GJ, Long> pairA0E = null;
        GJ gj = null;
        long j5 = 0;
        GR gr2 = null;
        long jLongValue = 0;
        boolean z5 = false;
        long j6 = 0;
        long j7 = 0;
        ArrayList arrayList = null;
        long jA0B = 0;
        long j8 = 0;
        long jA0B2 = 0;
        long jA0B3 = 0;
        GR grA0g = null;
        long jA0A = 0;
        String strA0l = null;
        boolean z6 = false;
        boolean z7 = false;
        XmlPullParser xmlPullParser3 = xmlPullParser2;
        long jA0A2 = A0A(xmlPullParser3, A0h(86, 21, 83), -9223372036854775807L);
        long jA0B4 = A0B(xmlPullParser3, A0h(422, 25, 125), -9223372036854775807L);
        long jA0B5 = A0B(xmlPullParser3, A0h(1434, 13, 1), -9223372036854775807L);
        String attributeValue = xmlPullParser3.getAttributeValue(null, A0h(405, 4, k.AppCompatTheme_viewInflaterClass));
        char c2 = attributeValue != null ? (char) 2 : '-';
        while (true) {
            switch (c2) {
                case 2:
                    attributeValue = attributeValue;
                    boolean seenEarlyAccessPeriod2 = A0h(916, 7, 68).equals(attributeValue);
                    if (!seenEarlyAccessPeriod2) {
                        c2 = '-';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    seenEarlyAccessPeriod = true;
                    c2 = 4;
                    break;
                case 4:
                    z3 = seenEarlyAccessPeriod;
                    if (!z3) {
                        c2 = ',';
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    xmlPullParser3 = xmlPullParser3;
                    jA0B2 = A0B(xmlPullParser3, A0h(1220, 19, 77), -9223372036854775807L);
                    c2 = 6;
                    break;
                case 6:
                    if (!z3) {
                        c2 = '+';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    xmlPullParser3 = xmlPullParser3;
                    jA0B3 = A0B(xmlPullParser3, A0h(k.AppCompatTheme_windowActionBar, 20, 108), -9223372036854775807L);
                    c2 = '\b';
                    break;
                case '\b':
                    if (!z3) {
                        c2 = '*';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    xmlPullParser3 = xmlPullParser3;
                    jA0B = A0B(xmlPullParser3, A0h(229, 26, 3), -9223372036854775807L);
                    c2 = '\n';
                    break;
                case '\n':
                    xmlPullParser3 = xmlPullParser3;
                    jA0A = A0A(xmlPullParser3, A0h(1484, 11, 21), -9223372036854775807L);
                    gr = null;
                    arrayList = new ArrayList();
                    if (!z3) {
                        c2 = ')';
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    j5 = -9223372036854775807L;
                    c2 = '\f';
                    break;
                case '\f':
                    str2 = str2;
                    uri = null;
                    z2 = false;
                    z4 = false;
                    j2 = j5;
                    str3 = str2;
                    c2 = '\r';
                    break;
                case '\r':
                    xmlPullParser2 = xmlPullParser2;
                    xmlPullParser3 = xmlPullParser3;
                    xmlPullParser2.next();
                    if (!C0561Iz.A06(xmlPullParser3, A0h(845, 7, 33))) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    if (!z4) {
                        c2 = 15;
                        break;
                    } else {
                        c2 = '\'';
                        break;
                    }
                case 15:
                    xmlPullParser3 = xmlPullParser3;
                    str3 = str3;
                    strA0l = A0l(xmlPullParser3, str3);
                    z6 = true;
                    j6 = j2;
                    grA0g = gr;
                    uri2 = uri;
                    z7 = z2;
                    c2 = 16;
                    break;
                case 16:
                    xmlPullParser3 = xmlPullParser3;
                    if (!C0561Iz.A05(xmlPullParser3, A0h(1162, 3, 65))) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    j7 = -9223372036854775807L;
                    if (jA0B4 != -9223372036854775807L) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    if (j6 == j7) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    j3 = j6;
                    c2 = 20;
                    break;
                case 20:
                    arrayList = arrayList;
                    if (!arrayList.isEmpty()) {
                        c2 = 21;
                        break;
                    } else {
                        c2 = '.';
                        break;
                    }
                case 21:
                    return c1049av.A0K(jA0A2, j3, jA0B5, z3, jA0B2, jA0B3, jA0B, jA0A, grA0g, uri2, arrayList);
                case 22:
                    if (!z3) {
                        c2 = '/';
                        break;
                    } else {
                        c2 = 23;
                        break;
                    }
                case 23:
                    j3 = jA0B4;
                    c2 = 20;
                    break;
                case 24:
                    strA0l = strA0l;
                    gr = grA0g;
                    uri = uri2;
                    str3 = strA0l;
                    z4 = z6;
                    z2 = z7;
                    j2 = j6;
                    c2 = '\r';
                    break;
                case 25:
                    xmlPullParser3 = xmlPullParser3;
                    if (!C0561Iz.A06(xmlPullParser3, A0h(852, 9, 60))) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 26;
                        break;
                    }
                case 26:
                    c1049av = c1049av;
                    xmlPullParser2 = xmlPullParser2;
                    str3 = str3;
                    grA0g = c1049av.A0g(xmlPullParser2);
                    j6 = j2;
                    strA0l = str3;
                    uri2 = uri;
                    z7 = z2;
                    z6 = z4;
                    c2 = 16;
                    break;
                case 27:
                    xmlPullParser3 = xmlPullParser3;
                    if (!C0561Iz.A06(xmlPullParser3, A0h(167, 8, k.AppCompatTheme_windowFixedWidthMajor))) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    xmlPullParser2 = xmlPullParser2;
                    str3 = str3;
                    uri2 = Uri.parse(xmlPullParser2.nextText());
                    j6 = j2;
                    grA0g = gr;
                    strA0l = str3;
                    z7 = z2;
                    z6 = z4;
                    c2 = 16;
                    break;
                case 29:
                    xmlPullParser3 = xmlPullParser3;
                    boolean seenEarlyAccessPeriod3 = C0561Iz.A06(xmlPullParser3, A0h(289, 6, 105));
                    if (!seenEarlyAccessPeriod3) {
                        c2 = '&';
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    if (!z2) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = '&';
                        break;
                    }
                case 31:
                    c1049av = c1049av;
                    xmlPullParser3 = xmlPullParser3;
                    str3 = str3;
                    gr2 = gr;
                    pairA0E = c1049av.A0E(xmlPullParser3, str3, j2);
                    j4 = j2;
                    gj = (GJ) pairA0E.first;
                    str4 = str3;
                    uri2 = uri;
                    if (gj.A00 != -9223372036854775807L) {
                        c2 = '\"';
                        break;
                    } else {
                        c2 = ' ';
                        break;
                    }
                case ' ':
                    if (!z3) {
                        c2 = '0';
                        break;
                    } else {
                        c2 = '!';
                        break;
                    }
                case '!':
                    str4 = str4;
                    z7 = true;
                    grA0g = gr2;
                    strA0l = str4;
                    z6 = z4;
                    j6 = j4;
                    c2 = 16;
                    break;
                case '\"':
                    pairA0E = pairA0E;
                    str4 = str4;
                    strA0l = str4;
                    jLongValue = ((Long) pairA0E.second).longValue();
                    z5 = z2;
                    if (jLongValue != -9223372036854775807L) {
                        c2 = '%';
                        break;
                    } else {
                        c2 = '#';
                        break;
                    }
                case '#':
                    j = -9223372036854775807L;
                    c2 = '$';
                    break;
                case '$':
                    arrayList = arrayList;
                    gj = gj;
                    arrayList.add(gj);
                    grA0g = gr2;
                    j6 = j;
                    z7 = z5;
                    z6 = z4;
                    c2 = 16;
                    break;
                case '%':
                    gj = gj;
                    j = gj.A00 + jLongValue;
                    c2 = '$';
                    break;
                case '&':
                    str3 = str3;
                    j8 = j2;
                    utcTiming = gr;
                    strA0l = str3;
                    uri2 = uri;
                    z = z2;
                    c2 = '(';
                    break;
                case '\'':
                    str3 = str3;
                    j8 = j2;
                    utcTiming = gr;
                    strA0l = str3;
                    uri2 = uri;
                    z = z2;
                    c2 = '(';
                    break;
                case '(':
                    grA0g = utcTiming;
                    j6 = j8;
                    z7 = z;
                    z6 = z4;
                    c2 = 16;
                    break;
                case ')':
                    j5 = 0;
                    c2 = '\f';
                    break;
                case '*':
                    jA0B = -9223372036854775807L;
                    c2 = '\n';
                    break;
                case '+':
                    jA0B3 = -9223372036854775807L;
                    c2 = '\b';
                    break;
                case ',':
                    jA0B2 = -9223372036854775807L;
                    c2 = 6;
                    break;
                case '-':
                    seenEarlyAccessPeriod = false;
                    c2 = 4;
                    break;
                case '.':
                    throw new AF(A0h(1456, 17, 107));
                case '/':
                    throw new AF(A0h(1501, 48, k.AppCompatTheme_windowActionModeOverlay));
                case '0':
                    StringBuilder sb = new StringBuilder();
                    String baseUrl = A0h(1288, 36, 90);
                    sb.append(baseUrl);
                    sb.append(arrayList.size());
                    String baseUrl2 = sb.toString();
                    throw new AF(baseUrl2);
            }
        }
    }

    private final GG A0N(XmlPullParser xmlPullParser, String str, String str2, String mimeType, int i, int i2, float f, int i3, int i4, String str3, int i5, List<GH> list, GP gp) throws XmlPullParserException, NumberFormatException, IOException {
        boolean seenFirstBaseUrl;
        GP gpA0a = gp;
        String strA0l = str;
        int iA06 = i3;
        String attributeValue = xmlPullParser.getAttributeValue(null, A0h(1590, 2, 80));
        int iA09 = A09(xmlPullParser, A0h(1725, 9, 89), -1);
        String strA0m = A0m(xmlPullParser, A0h(397, 8, 23), str2);
        String strA0m2 = A0m(xmlPullParser, A0h(467, 6, 112), mimeType);
        String codecs = A0h(284, 5, 67);
        int iA092 = A09(xmlPullParser, codecs, i);
        int iA093 = A09(xmlPullParser, A0h(818, 6, 17), i2);
        float fA00 = A00(xmlPullParser, f);
        int iA094 = A09(xmlPullParser, A0h(1592, 17, 57), i4);
        String drmSchemeType = null;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        boolean z = false;
        do {
            xmlPullParser.next();
            if (C0561Iz.A06(xmlPullParser, A0h(845, 7, 33))) {
                if (!z) {
                    strA0l = A0l(xmlPullParser, strA0l);
                    z = true;
                }
            } else if (C0561Iz.A06(xmlPullParser, A0h(489, 25, 70))) {
                iA06 = A06(xmlPullParser);
            } else if (C0561Iz.A06(xmlPullParser, A0h(204, 11, 125))) {
                gpA0a = A0d(xmlPullParser, (C1053az) gpA0a);
            } else if (C0561Iz.A06(xmlPullParser, A0h(9, 11, 26))) {
                gpA0a = A0Y(xmlPullParser, (C0) gpA0a);
            } else if (C0561Iz.A06(xmlPullParser, A0h(872, 15, 61))) {
                gpA0a = A0a(xmlPullParser, (C0400Bz) gpA0a);
            } else if (C0561Iz.A06(xmlPullParser, A0h(46, 17, 60))) {
                Pair<String, DrmInitData.SchemeData> pairA0D = A0D(xmlPullParser);
                if (pairA0D.first != null) {
                    drmSchemeType = (String) pairA0D.first;
                }
                if (pairA0D.second != null) {
                    arrayList.add(pairA0D.second);
                }
            } else {
                String strA0h = A0h(1083, 17, 75);
                if (C0561Iz.A06(xmlPullParser, strA0h)) {
                    arrayList2.add(A0O(xmlPullParser, strA0h));
                } else {
                    String strA0h2 = A0h(782, 20, 126);
                    if (C0561Iz.A06(xmlPullParser, strA0h2)) {
                        arrayList3.add(A0O(xmlPullParser, strA0h2));
                    }
                }
            }
            seenFirstBaseUrl = C0561Iz.A05(xmlPullParser, A0h(632, 14, 53));
        } while (!seenFirstBaseUrl);
        Format formatA0F = A0F(attributeValue, strA0m, iA092, iA093, fA00, iA06, iA094, iA09, str3, i5, list, strA0m2, arrayList3);
        if (gpA0a == null) {
            gpA0a = new C1053az();
        }
        return new GG(formatA0F, strA0l, gpA0a, drmSchemeType, arrayList, arrayList2, -1L);
    }

    public static GH A0O(XmlPullParser xmlPullParser, String id) throws XmlPullParserException, IOException {
        String strA0m = A0m(xmlPullParser, A0h(187, 11, 13), A0h(255, 0, 90));
        String strA0m2 = A0m(xmlPullParser, A0h(41, 5, 103), null);
        String strA0m3 = A0m(xmlPullParser, A0h(1590, 2, 80), null);
        do {
            xmlPullParser.next();
        } while (!C0561Iz.A05(xmlPullParser, id));
        return new GH(strA0m, strA0m2, strA0m3);
    }

    private final GI A0P(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new GI(str, str2, j, jArr, eventMessageArr);
    }

    private final GI A0Q(XmlPullParser xmlPullParser) throws XmlPullParserException, NumberFormatException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C1049av c1049av = this;
        EventMessage[] eventMessageArr = null;
        long[] jArr = null;
        int i = 0;
        XmlPullParser xmlPullParser3 = xmlPullParser2;
        String strA0h = A0h(255, 0, 90);
        String strA0m = A0m(xmlPullParser3, A0h(187, 11, 13), strA0h);
        String schemeIdUri = A0h(41, 5, 103);
        String strA0m2 = A0m(xmlPullParser3, schemeIdUri, strA0h);
        long jA0C = A0C(xmlPullParser3, A0h(63, 9, 76), 1L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    xmlPullParser2 = xmlPullParser2;
                    xmlPullParser3 = xmlPullParser3;
                    xmlPullParser2.next();
                    if (!C0561Iz.A06(xmlPullParser3, A0h(1447, 5, 104))) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    c1049av = c1049av;
                    xmlPullParser2 = xmlPullParser2;
                    strA0m = strA0m;
                    strA0m2 = strA0m2;
                    arrayList = arrayList;
                    byteArrayOutputStream = byteArrayOutputStream;
                    arrayList.add(c1049av.A0H(xmlPullParser2, strA0m, strA0m2, jA0C, byteArrayOutputStream));
                    c2 = 4;
                    break;
                case 4:
                    xmlPullParser3 = xmlPullParser3;
                    if (!C0561Iz.A05(xmlPullParser3, A0h(861, 11, 111))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    arrayList = arrayList;
                    jArr = new long[arrayList.size()];
                    eventMessageArr = new EventMessage[arrayList.size()];
                    i = 0;
                    c2 = 6;
                    break;
                case 6:
                    arrayList = arrayList;
                    if (i >= arrayList.size()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    arrayList = arrayList;
                    jArr = jArr;
                    eventMessageArr = eventMessageArr;
                    EventMessage eventMessage = (EventMessage) arrayList.get(i);
                    jArr[i] = eventMessage.A03;
                    eventMessageArr[i] = eventMessage;
                    i++;
                    c2 = 6;
                    break;
                case '\b':
                    return c1049av.A0P(strA0m, strA0m2, jA0C, jArr, eventMessageArr);
            }
        }
    }

    private final GJ A0R(String str, long j, List<GF> list, List<GI> list2) {
        return new GJ(str, j, list, list2);
    }

    private final GK A0S(String str, long j, long j2) {
        return new GK(str, j, j2);
    }

    private final GK A0T(XmlPullParser xmlPullParser) {
        return A0V(xmlPullParser, A0h(1706, 9, 44), A0h(162, 5, 51));
    }

    private final GK A0U(XmlPullParser xmlPullParser) {
        return A0V(xmlPullParser, A0h(1549, 5, 127), A0h(559, 10, 86));
    }

    private final GK A0V(XmlPullParser xmlPullParser, String str, String str2) throws NumberFormatException {
        long j = 0;
        String[] strArrSplit = null;
        long j2 = 0;
        long j3 = 0;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        char c2 = attributeValue2 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    attributeValue2 = attributeValue2;
                    strArrSplit = attributeValue2.split(A0h(1100, 1, 44));
                    j = Long.parseLong(strArrSplit[0]);
                    if (strArrSplit.length != 2) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    strArrSplit = strArrSplit;
                    j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
                    j3 = j;
                    c2 = 4;
                    break;
                case 4:
                    return A0S(attributeValue, j3, j2);
                case 5:
                    j3 = j;
                    j2 = -1;
                    c2 = 4;
                    break;
                case 6:
                    j3 = 0;
                    j2 = -1;
                    c2 = 4;
                    break;
            }
        }
    }

    private final GM A0W(GG gg, String drmSchemeType, String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<GH> arrayList2) {
        String str2 = null;
        ArrayList<DrmInitData.SchemeData> arrayList3 = null;
        Format formatA0N = gg.A01;
        char c2 = gg.A04 != null ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    gg = gg;
                    str2 = gg.A04;
                    c2 = 3;
                    break;
                case 3:
                    arrayList = arrayList;
                    gg = gg;
                    arrayList3 = gg.A05;
                    arrayList3.addAll(arrayList);
                    if (!arrayList3.isEmpty()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 4:
                    str2 = str2;
                    arrayList3 = arrayList3;
                    A0p(arrayList3);
                    formatA0N = formatA0N.A0N(new DrmInitData(str2, arrayList3));
                    c2 = 5;
                    break;
                case 5:
                    GG gg2 = gg;
                    ArrayList<GH> arrayList4 = gg2.A06;
                    arrayList4.addAll(arrayList2);
                    return GM.A00(drmSchemeType, gg2.A00, formatA0N, gg2.A03, gg2.A02, arrayList4);
                case 6:
                    str = str;
                    str2 = str;
                    c2 = 3;
                    break;
            }
        }
    }

    private final C0 A0X(GK gk, long j, long j2, long j3, long j4, List<GO> list, List<GK> list2) {
        return new C0(gk, j, j2, j3, j4, list, list2);
    }

    private final C0 A0Y(XmlPullParser xmlPullParser, C0 c0) throws XmlPullParserException, NumberFormatException, IOException {
        C0 c02 = c0;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C1049av c1049av = this;
        List<GK> list = null;
        List<GO> list2 = null;
        long jA0C = 0;
        long jA0C2 = 0;
        long jA0C3 = 0;
        ArrayList arrayList = null;
        long j = 0;
        long presentationTimeOffset = 0;
        List<GO> listA0n = null;
        long j2 = 0;
        List<GO> list3 = null;
        GK gkA0T = null;
        List<GO> list4 = null;
        List<GK> list5 = null;
        GK gk = null;
        long jA0C4 = 0;
        XmlPullParser xmlPullParser3 = xmlPullParser2;
        long j3 = 1;
        char c2 = c02 != null ? (char) 2 : '\"';
        while (true) {
            switch (c2) {
                case 2:
                    c02 = c02;
                    presentationTimeOffset = ((GP) c02).A01;
                    c2 = 3;
                    break;
                case 3:
                    xmlPullParser3 = xmlPullParser3;
                    c02 = c02;
                    jA0C4 = A0C(xmlPullParser3, A0h(63, 9, 76), presentationTimeOffset);
                    if (c02 == null) {
                        c2 = '!';
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c02 = c02;
                    j2 = ((GP) c02).A00;
                    c2 = 5;
                    break;
                case 5:
                    xmlPullParser3 = xmlPullParser3;
                    c02 = c02;
                    jA0C3 = A0C(xmlPullParser3, A0h(894, 22, k.AppCompatTheme_windowMinWidthMajor), j2);
                    if (c02 == null) {
                        c2 = ' ';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c02 = c02;
                    j = ((AbstractC1052ay) c02).A00;
                    c2 = 7;
                    break;
                case 7:
                    xmlPullParser3 = xmlPullParser3;
                    c02 = c02;
                    jA0C2 = A0C(xmlPullParser3, A0h(139, 8, 98), j);
                    if (c02 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c02 = c02;
                    j3 = ((AbstractC1052ay) c02).A01;
                    c2 = '\t';
                    break;
                case '\t':
                    xmlPullParser3 = xmlPullParser3;
                    jA0C = A0C(xmlPullParser3, A0h(151, 11, 100), j3);
                    gkA0T = null;
                    listA0n = null;
                    arrayList = null;
                    c2 = '\n';
                    break;
                case '\n':
                    xmlPullParser2 = xmlPullParser2;
                    xmlPullParser3 = xmlPullParser3;
                    xmlPullParser2.next();
                    if (!C0561Iz.A06(xmlPullParser3, A0h(1641, 14, 74))) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    c1049av = c1049av;
                    xmlPullParser2 = xmlPullParser2;
                    gkA0T = c1049av.A0T(xmlPullParser2);
                    c2 = '\f';
                    break;
                case '\f':
                    xmlPullParser3 = xmlPullParser3;
                    if (!C0561Iz.A05(xmlPullParser3, A0h(9, 11, 26))) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    c02 = c02;
                    if (c02 == null) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    if (gkA0T == null) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    gk = gkA0T;
                    c2 = 16;
                    break;
                case 16:
                    gkA0T = gk;
                    if (listA0n == null) {
                        c2 = 23;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    list4 = listA0n;
                    c2 = 18;
                    break;
                case 18:
                    list3 = list4;
                    if (arrayList == null) {
                        c2 = 22;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    list5 = arrayList;
                    c2 = 20;
                    break;
                case 20:
                    list2 = list3;
                    list = list5;
                    c2 = 21;
                    break;
                case 21:
                    return c1049av.A0X(gkA0T, jA0C4, jA0C3, jA0C, jA0C2, list2, list);
                case 22:
                    c02 = c02;
                    list5 = c02.A00;
                    c2 = 20;
                    break;
                case 23:
                    c02 = c02;
                    list4 = ((AbstractC1052ay) c02).A02;
                    c2 = 18;
                    break;
                case 24:
                    c02 = c02;
                    gk = ((GP) c02).A02;
                    c2 = 16;
                    break;
                case 25:
                    list2 = listA0n;
                    list = arrayList;
                    c2 = 21;
                    break;
                case 26:
                    xmlPullParser3 = xmlPullParser3;
                    if (!C0561Iz.A06(xmlPullParser3, A0h(824, 15, 39))) {
                        c2 = 28;
                        break;
                    } else {
                        c2 = 27;
                        break;
                    }
                case 27:
                    c1049av = c1049av;
                    xmlPullParser2 = xmlPullParser2;
                    listA0n = c1049av.A0n(xmlPullParser2);
                    c2 = '\f';
                    break;
                case 28:
                    xmlPullParser3 = xmlPullParser3;
                    if (!C0561Iz.A06(xmlPullParser3, A0h(1715, 10, 95))) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = 29;
                        break;
                    }
                case 29:
                    if (arrayList != null) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 30;
                        break;
                    }
                case 30:
                    arrayList = new ArrayList();
                    c2 = 31;
                    break;
                case 31:
                    c1049av = c1049av;
                    xmlPullParser2 = xmlPullParser2;
                    arrayList.add(c1049av.A0U(xmlPullParser2));
                    c2 = '\f';
                    break;
                case ' ':
                    j = -9223372036854775807L;
                    c2 = 7;
                    break;
                case '!':
                    j2 = 0;
                    c2 = 5;
                    break;
                case '\"':
                    presentationTimeOffset = j3;
                    c2 = 3;
                    break;
            }
        }
    }

    private final C0400Bz A0Z(GK gk, long j, long j2, long j3, long j4, List<GO> list, GQ gq, GQ gq2) {
        return new C0400Bz(gk, j, j2, j3, j4, list, gq, gq2);
    }

    private final C0400Bz A0a(XmlPullParser xmlPullParser, C0400Bz c0400Bz) throws XmlPullParserException, NumberFormatException, IOException {
        C0400Bz c0400Bz2 = c0400Bz;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C1049av c1049av = this;
        GK gk = null;
        GQ gqA0e = null;
        GQ gqA0e2 = null;
        long jA0C = 0;
        List<GO> list = null;
        long jA0C2 = 0;
        long jA0C3 = 0;
        long j = 0;
        long j2 = 0;
        GK gkA0T = null;
        long startNumber = 0;
        GQ gq = null;
        GQ gq2 = null;
        long jA0C4 = 0;
        List<GO> listA0n = null;
        GK gk2 = null;
        GK gk3 = null;
        List<GO> list2 = null;
        C1049av c1049av2 = c1049av;
        XmlPullParser xmlPullParser3 = xmlPullParser2;
        long j3 = 1;
        char c2 = c0400Bz2 != null ? (char) 2 : ' ';
        while (true) {
            switch (c2) {
                case 2:
                    c0400Bz2 = c0400Bz2;
                    startNumber = ((GP) c0400Bz2).A01;
                    c2 = 3;
                    break;
                case 3:
                    xmlPullParser3 = xmlPullParser3;
                    c0400Bz2 = c0400Bz2;
                    jA0C4 = A0C(xmlPullParser3, A0h(63, 9, 76), startNumber);
                    if (c0400Bz2 == null) {
                        c2 = 31;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c0400Bz2 = c0400Bz2;
                    j2 = ((GP) c0400Bz2).A00;
                    c2 = 5;
                    break;
                case 5:
                    xmlPullParser3 = xmlPullParser3;
                    c0400Bz2 = c0400Bz2;
                    jA0C3 = A0C(xmlPullParser3, A0h(894, 22, k.AppCompatTheme_windowMinWidthMajor), j2);
                    if (c0400Bz2 == null) {
                        c2 = 30;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c0400Bz2 = c0400Bz2;
                    j = ((AbstractC1052ay) c0400Bz2).A00;
                    c2 = 7;
                    break;
                case 7:
                    xmlPullParser3 = xmlPullParser3;
                    c0400Bz2 = c0400Bz2;
                    jA0C2 = A0C(xmlPullParser3, A0h(139, 8, 98), j);
                    if (c0400Bz2 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c0400Bz2 = c0400Bz2;
                    j3 = ((AbstractC1052ay) c0400Bz2).A01;
                    c2 = '\t';
                    break;
                case '\t':
                    xmlPullParser3 = xmlPullParser3;
                    c0400Bz2 = c0400Bz2;
                    jA0C = A0C(xmlPullParser3, A0h(151, 11, 100), j3);
                    gq2 = null;
                    if (c0400Bz2 == null) {
                        c2 = 29;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    c0400Bz2 = c0400Bz2;
                    gq = c0400Bz2.A01;
                    c2 = 11;
                    break;
                case 11:
                    c1049av2 = c1049av2;
                    xmlPullParser3 = xmlPullParser3;
                    c0400Bz2 = c0400Bz2;
                    gqA0e2 = c1049av2.A0e(xmlPullParser3, A0h(1549, 5, 127), gq);
                    if (c0400Bz2 == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c0400Bz2 = c0400Bz2;
                    gq2 = c0400Bz2.A00;
                    c2 = '\r';
                    break;
                case '\r':
                    c1049av2 = c1049av2;
                    xmlPullParser3 = xmlPullParser3;
                    gqA0e = c1049av2.A0e(xmlPullParser3, A0h(215, 14, 77), gq2);
                    gkA0T = null;
                    listA0n = null;
                    c2 = 14;
                    break;
                case 14:
                    xmlPullParser2 = xmlPullParser2;
                    xmlPullParser3 = xmlPullParser3;
                    xmlPullParser2.next();
                    if (!C0561Iz.A06(xmlPullParser3, A0h(1641, 14, 74))) {
                        c2 = 27;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c1049av = c1049av;
                    xmlPullParser2 = xmlPullParser2;
                    gkA0T = c1049av.A0T(xmlPullParser2);
                    c2 = 16;
                    break;
                case 16:
                    xmlPullParser3 = xmlPullParser3;
                    if (!C0561Iz.A05(xmlPullParser3, A0h(872, 15, 61))) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    c0400Bz2 = c0400Bz2;
                    if (c0400Bz2 == null) {
                        c2 = 26;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    if (gkA0T == null) {
                        c2 = 25;
                        break;
                    } else {
                        c2 = 19;
                        break;
                    }
                case 19:
                    gk2 = gkA0T;
                    c2 = 20;
                    break;
                case 20:
                    gk3 = gk2;
                    if (listA0n == null) {
                        c2 = 24;
                        break;
                    } else {
                        c2 = 21;
                        break;
                    }
                case 21:
                    list2 = listA0n;
                    c2 = 22;
                    break;
                case 22:
                    gk = gk3;
                    list = list2;
                    c2 = 23;
                    break;
                case 23:
                    return c1049av.A0Z(gk, jA0C4, jA0C3, jA0C, jA0C2, list, gqA0e, gqA0e2);
                case 24:
                    c0400Bz2 = c0400Bz2;
                    list2 = ((AbstractC1052ay) c0400Bz2).A02;
                    c2 = 22;
                    break;
                case 25:
                    c0400Bz2 = c0400Bz2;
                    gk2 = ((GP) c0400Bz2).A02;
                    c2 = 20;
                    break;
                case 26:
                    gk = gkA0T;
                    list = listA0n;
                    c2 = 23;
                    break;
                case 27:
                    xmlPullParser3 = xmlPullParser3;
                    if (!C0561Iz.A06(xmlPullParser3, A0h(824, 15, 39))) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 28;
                        break;
                    }
                case 28:
                    c1049av = c1049av;
                    xmlPullParser2 = xmlPullParser2;
                    listA0n = c1049av.A0n(xmlPullParser2);
                    c2 = 16;
                    break;
                case 29:
                    gq2 = null;
                    gq = null;
                    c2 = 11;
                    break;
                case 30:
                    j = -9223372036854775807L;
                    c2 = 7;
                    break;
                case 31:
                    j2 = 0;
                    c2 = 5;
                    break;
                case ' ':
                    startNumber = j3;
                    c2 = 3;
                    break;
            }
        }
    }

    private final GO A0b(long j, long j2) {
        return new GO(j, j2);
    }

    private final C1053az A0c(GK gk, long j, long j2, long j3, long j4) {
        return new C1053az(gk, j, j2, j3, j4);
    }

    private final C1053az A0d(XmlPullParser xmlPullParser, C1053az c1053az) throws XmlPullParserException, IOException, NumberFormatException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C1053az c1053az2 = c1053az;
        C1049av c1049av = this;
        long j = 0;
        long j2 = 0;
        long jA0C = 0;
        long jA0C2 = 0;
        long j3 = 0;
        GK gk = null;
        GK gkA0T = null;
        long indexLength = 0;
        long presentationTimeOffset = 0;
        String attributeValue = null;
        long j4 = 0;
        XmlPullParser xmlPullParser3 = xmlPullParser2;
        char c2 = c1053az2 != null ? (char) 2 : (char) 21;
        while (true) {
            switch (c2) {
                case 2:
                    c1053az2 = c1053az2;
                    j4 = ((GP) c1053az2).A01;
                    c2 = 3;
                    break;
                case 3:
                    xmlPullParser3 = xmlPullParser3;
                    c1053az2 = c1053az2;
                    jA0C2 = A0C(xmlPullParser3, A0h(63, 9, 76), j4);
                    presentationTimeOffset = 0;
                    if (c1053az2 == null) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    c1053az2 = c1053az2;
                    indexLength = ((GP) c1053az2).A00;
                    c2 = 5;
                    break;
                case 5:
                    xmlPullParser3 = xmlPullParser3;
                    c1053az2 = c1053az2;
                    jA0C = A0C(xmlPullParser3, A0h(894, 22, k.AppCompatTheme_windowMinWidthMajor), indexLength);
                    if (c1053az2 == null) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    c1053az2 = c1053az2;
                    j = c1053az2.A01;
                    c2 = 7;
                    break;
                case 7:
                    c1053az2 = c1053az2;
                    if (c1053az2 == null) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    c1053az2 = c1053az2;
                    presentationTimeOffset = c1053az2.A00;
                    c2 = '\t';
                    break;
                case '\t':
                    xmlPullParser3 = xmlPullParser3;
                    gk = null;
                    attributeValue = xmlPullParser3.getAttributeValue(null, A0h(1181, 10, 32));
                    if (attributeValue == null) {
                        c2 = 18;
                        break;
                    } else {
                        c2 = '\n';
                        break;
                    }
                case '\n':
                    attributeValue = attributeValue;
                    String[] strArrSplit = attributeValue.split(A0h(1100, 1, 44));
                    j2 = Long.parseLong(strArrSplit[0]);
                    j3 = (Long.parseLong(strArrSplit[1]) - j2) + 1;
                    c2 = 11;
                    break;
                case 11:
                    c1053az2 = c1053az2;
                    if (c1053az2 == null) {
                        c2 = '\r';
                        break;
                    } else {
                        c2 = '\f';
                        break;
                    }
                case '\f':
                    c1053az2 = c1053az2;
                    gk = c1053az2.A02;
                    c2 = '\r';
                    break;
                case '\r':
                    gkA0T = gk;
                    c2 = 14;
                    break;
                case 14:
                    xmlPullParser2 = xmlPullParser2;
                    xmlPullParser3 = xmlPullParser3;
                    xmlPullParser2.next();
                    if (!C0561Iz.A06(xmlPullParser3, A0h(1641, 14, 74))) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    c1049av = c1049av;
                    xmlPullParser2 = xmlPullParser2;
                    gkA0T = c1049av.A0T(xmlPullParser2);
                    c2 = 16;
                    break;
                case 16:
                    xmlPullParser3 = xmlPullParser3;
                    if (!C0561Iz.A05(xmlPullParser3, A0h(204, 11, 125))) {
                        c2 = 14;
                        break;
                    } else {
                        c2 = 17;
                        break;
                    }
                case 17:
                    return c1049av.A0c(gkA0T, jA0C2, jA0C, j2, j3);
                case 18:
                    j3 = presentationTimeOffset;
                    j2 = j;
                    c2 = 11;
                    break;
                case 19:
                    j = presentationTimeOffset;
                    c2 = 7;
                    break;
                case 20:
                    indexLength = presentationTimeOffset;
                    c2 = 5;
                    break;
                case 21:
                    j4 = 1;
                    c2 = 3;
                    break;
            }
        }
    }

    private final GQ A0e(XmlPullParser xmlPullParser, String str, GQ gq) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return GQ.A01(attributeValue);
        }
        return gq;
    }

    private final GR A0f(String str, String str2) {
        return new GR(str, str2);
    }

    private final GR A0g(XmlPullParser xmlPullParser) {
        return A0f(xmlPullParser.getAttributeValue(null, A0h(187, 11, 13)), xmlPullParser.getAttributeValue(null, A0h(41, 5, 103)));
    }

    public static String A0i(String str, String str2) {
        char c2 = str == null ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return str2;
                case 3:
                    str2 = str2;
                    if (str2 != null) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return str;
                case 5:
                    String str3 = str;
                    IJ.A04(str3.equals(str2));
                    return str3;
            }
        }
    }

    public static String A0j(String str, String str2) {
        char c2 = C0537Ib.A0B(str) ? (char) 2 : (char) 3;
        while (true) {
            switch (c2) {
                case 2:
                    return C0537Ib.A05(str2);
                case 3:
                    str = str;
                    if (!C0537Ib.A0D(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return C0537Ib.A07(str2);
                case 5:
                    str = str;
                    if (!A0q(str)) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    return str;
                case 7:
                    str = str;
                    if (!A0h(803, 15, 98).equals(str)) {
                        c2 = '\f';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    str2 = str2;
                    if (!A0h(135, 4, 73).equals(str2)) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    return A0h(1268, 20, 47);
                case '\n':
                    str2 = str2;
                    if (!A0h(1394, 4, 90).equals(str2)) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = 11;
                        break;
                    }
                case 11:
                    return A0h(20, 21, 44);
                case '\f':
                    str = str;
                    if (!A0h(1239, 19, 0).equals(str)) {
                        c2 = 20;
                        break;
                    } else {
                        c2 = '\r';
                        break;
                    }
                case '\r':
                    str2 = str2;
                    if (str2 == null) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 14;
                        break;
                    }
                case 14:
                    str2 = str2;
                    if (!str2.contains(A0h(767, 6, 86))) {
                        c2 = 16;
                        break;
                    } else {
                        c2 = 15;
                        break;
                    }
                case 15:
                    return A0h(1041, 19, 98);
                case 16:
                    str2 = str2;
                    if (!str2.contains(A0h(198, 6, 54))) {
                        c2 = 17;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 17:
                    str2 = str2;
                    if (!str2.contains(A0h(1495, 6, 21))) {
                        c2 = 19;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 18:
                    return A0h(1613, 19, 51);
                case 19:
                    return (String) null;
                case 20:
                    return (String) null;
            }
        }
    }

    public static String A0k(List<GH> list) {
        GH descriptor = null;
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    list = list;
                    if (i >= list.size()) {
                        c2 = 7;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    list = list;
                    descriptor = list.get(i);
                    if (!A0h(569, 58, 82).equals(descriptor.A01)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    descriptor = descriptor;
                    if (!A0h(111, 4, 127).equals(descriptor.A02)) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    return A0h(72, 14, 90);
                case 6:
                    i++;
                    c2 = 2;
                    break;
                case 7:
                    return A0h(1258, 10, 51);
            }
        }
    }

    public static String A0l(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        xmlPullParser.next();
        return C0558Iw.A02(str, xmlPullParser.getText());
    }

    public static String A0m(XmlPullParser xmlPullParser, String str, String str2) {
        String str3 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        char c2 = attributeValue == null ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    str2 = str2;
                    str3 = str2;
                    c2 = 3;
                    break;
                case 3:
                    return str3;
                case 4:
                    attributeValue = attributeValue;
                    str3 = attributeValue;
                    c2 = 3;
                    break;
            }
        }
    }

    private final List<GO> A0n(XmlPullParser xmlPullParser) throws XmlPullParserException, NumberFormatException, IOException {
        C1049av c1049av = this;
        long jA0C = 0;
        int i = 0;
        int iA09 = 0;
        ArrayList arrayList = new ArrayList();
        long jA0C2 = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    xmlPullParser = xmlPullParser;
                    xmlPullParser.next();
                    if (!C0561Iz.A06(xmlPullParser, A0h(687, 1, 55))) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    xmlPullParser = xmlPullParser;
                    jA0C2 = A0C(xmlPullParser, A0h(1393, 1, 25), jA0C2);
                    jA0C = A0C(xmlPullParser, A0h(802, 1, 67), -9223372036854775807L);
                    iA09 = A09(xmlPullParser, A0h(839, 1, 49), 0) + 1;
                    i = 0;
                    c2 = 4;
                    break;
                case 4:
                    if (i >= iA09) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    c1049av = c1049av;
                    arrayList = arrayList;
                    arrayList.add(c1049av.A0b(jA0C2, jA0C));
                    jA0C2 += jA0C;
                    i++;
                    c2 = 4;
                    break;
                case 6:
                    xmlPullParser = xmlPullParser;
                    if (!C0561Iz.A05(xmlPullParser, A0h(824, 15, 39))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    return arrayList;
            }
        }
    }

    public static void A0p(ArrayList<DrmInitData.SchemeData> arrayList) {
        DrmInitData.SchemeData schemeData = null;
        int i = 0;
        int size = arrayList.size() - 1;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (size < 0) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    arrayList = arrayList;
                    schemeData = arrayList.get(size);
                    if (!schemeData.A01()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case 4:
                    i = 0;
                    c2 = 5;
                    break;
                case 5:
                    arrayList = arrayList;
                    if (i >= arrayList.size()) {
                        c2 = '\b';
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 6:
                    arrayList = arrayList;
                    schemeData = schemeData;
                    if (!arrayList.get(i).A02(schemeData)) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    arrayList = arrayList;
                    arrayList.remove(size);
                    c2 = '\b';
                    break;
                case '\b':
                    size--;
                    c2 = 2;
                    break;
                case '\t':
                    i++;
                    c2 = 5;
                    break;
                case '\n':
                    return;
            }
        }
    }

    public static boolean A0q(String str) {
        boolean z = false;
        char c2 = !C0537Ib.A0C(str) ? (char) 2 : (char) 6;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    if (!A0h(1268, 20, 47).equals(str)) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 3:
                    str = str;
                    if (!A0h(20, 21, 44).equals(str)) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 4:
                    str = str;
                    if (!A0h(1041, 19, 98).equals(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 6;
                        break;
                    }
                case 5:
                    str = str;
                    if (!A0h(1613, 19, 51).equals(str)) {
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

    private final byte[] A0r(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IllegalStateException, IOException, IllegalArgumentException {
        int i = 0;
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, null);
        xmlPullParser.nextToken();
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    xmlPullParser = xmlPullParser;
                    if (!C0561Iz.A05(xmlPullParser, A0h(1447, 5, 104))) {
                        c2 = 3;
                        break;
                    } else {
                        c2 = 18;
                        break;
                    }
                case 3:
                    xmlPullParser = xmlPullParser;
                    switch (xmlPullParser.getEventType()) {
                        case 0:
                            c2 = 5;
                            break;
                        case 1:
                            c2 = 6;
                            break;
                        case 2:
                            c2 = 7;
                            break;
                        case 3:
                            c2 = '\n';
                            break;
                        case 4:
                            c2 = 11;
                            break;
                        case 5:
                            c2 = '\f';
                            break;
                        case 6:
                            c2 = '\r';
                            break;
                        case 7:
                            c2 = 14;
                            break;
                        case 8:
                            c2 = 15;
                            break;
                        case 9:
                            c2 = 16;
                            break;
                        case 10:
                            c2 = 17;
                            break;
                        default:
                            c2 = 4;
                            break;
                    }
                case 4:
                    xmlPullParser = xmlPullParser;
                    xmlPullParser.nextToken();
                    c2 = 2;
                    break;
                case 5:
                    xmlSerializerNewSerializer = xmlSerializerNewSerializer;
                    xmlSerializerNewSerializer.startDocument(null, false);
                    c2 = 4;
                    break;
                case 6:
                    xmlSerializerNewSerializer = xmlSerializerNewSerializer;
                    xmlSerializerNewSerializer.endDocument();
                    c2 = 4;
                    break;
                case 7:
                    xmlPullParser = xmlPullParser;
                    xmlSerializerNewSerializer = xmlSerializerNewSerializer;
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    i = 0;
                    c2 = '\b';
                    break;
                case '\b':
                    xmlPullParser = xmlPullParser;
                    if (i >= xmlPullParser.getAttributeCount()) {
                        c2 = 4;
                        break;
                    } else {
                        c2 = '\t';
                        break;
                    }
                case '\t':
                    xmlPullParser = xmlPullParser;
                    xmlSerializerNewSerializer = xmlSerializerNewSerializer;
                    xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    i++;
                    c2 = '\b';
                    break;
                case '\n':
                    xmlPullParser = xmlPullParser;
                    xmlSerializerNewSerializer = xmlSerializerNewSerializer;
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    c2 = 4;
                    break;
                case 11:
                    xmlPullParser = xmlPullParser;
                    xmlSerializerNewSerializer = xmlSerializerNewSerializer;
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    c2 = 4;
                    break;
                case '\f':
                    xmlPullParser = xmlPullParser;
                    xmlSerializerNewSerializer = xmlSerializerNewSerializer;
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    c2 = 4;
                    break;
                case '\r':
                    xmlPullParser = xmlPullParser;
                    xmlSerializerNewSerializer = xmlSerializerNewSerializer;
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    c2 = 4;
                    break;
                case 14:
                    xmlPullParser = xmlPullParser;
                    xmlSerializerNewSerializer = xmlSerializerNewSerializer;
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    c2 = 4;
                    break;
                case 15:
                    xmlPullParser = xmlPullParser;
                    xmlSerializerNewSerializer = xmlSerializerNewSerializer;
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    c2 = 4;
                    break;
                case 16:
                    xmlPullParser = xmlPullParser;
                    xmlSerializerNewSerializer = xmlSerializerNewSerializer;
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    c2 = 4;
                    break;
                case 17:
                    xmlPullParser = xmlPullParser;
                    xmlSerializerNewSerializer = xmlSerializerNewSerializer;
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    c2 = 4;
                    break;
                case 18:
                    xmlSerializerNewSerializer.flush();
                    return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
