package com.facebook.ads.redexgen.X;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.facebook.ads.redexgen.X.Iz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0561Iz {
    public static String A00(String str) {
        String strSubstring = null;
        int iIndexOf = str.indexOf(58);
        char c2 = iIndexOf == -1 ? (char) 2 : (char) 4;
        while (true) {
            switch (c2) {
                case 2:
                    str = str;
                    strSubstring = str;
                    c2 = 3;
                    break;
                case 3:
                    return strSubstring;
                case 4:
                    str = str;
                    strSubstring = str.substring(iIndexOf + 1);
                    c2 = 3;
                    break;
            }
        }
    }

    public static String A01(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= attributeCount) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    xmlPullParser = xmlPullParser;
                    str = str;
                    if (!xmlPullParser.getAttributeName(i).equals(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return xmlPullParser.getAttributeValue(i);
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return (String) null;
            }
        }
    }

    public static String A02(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    if (i >= attributeCount) {
                        c2 = 6;
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    xmlPullParser = xmlPullParser;
                    str = str;
                    if (!A00(xmlPullParser.getAttributeName(i)).equals(str)) {
                        c2 = 5;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    return xmlPullParser.getAttributeValue(i);
                case 5:
                    i++;
                    c2 = 2;
                    break;
                case 6:
                    return (String) null;
            }
        }
    }

    public static boolean A03(XmlPullParser xmlPullParser) throws XmlPullParserException {
        boolean z = false;
        char c2 = xmlPullParser.getEventType() == 2 ? (char) 2 : (char) 4;
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

    public static boolean A04(XmlPullParser xmlPullParser) throws XmlPullParserException {
        boolean z = false;
        char c2 = xmlPullParser.getEventType() == 3 ? (char) 2 : (char) 4;
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

    public static boolean A05(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        boolean z = false;
        char c2 = A04(xmlPullParser) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    xmlPullParser = xmlPullParser;
                    str = str;
                    if (!xmlPullParser.getName().equals(str)) {
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

    public static boolean A06(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        boolean z = false;
        char c2 = A03(xmlPullParser) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    xmlPullParser = xmlPullParser;
                    str = str;
                    if (!xmlPullParser.getName().equals(str)) {
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

    public static boolean A07(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        boolean z = false;
        char c2 = A03(xmlPullParser) ? (char) 2 : (char) 5;
        while (true) {
            switch (c2) {
                case 2:
                    xmlPullParser = xmlPullParser;
                    str = str;
                    if (!A00(xmlPullParser.getName()).equals(str)) {
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
}
