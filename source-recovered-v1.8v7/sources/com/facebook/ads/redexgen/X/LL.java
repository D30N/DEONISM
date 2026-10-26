package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.annotation.VisibleForTesting;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: assets/audience_network.dex */
public final class LL {
    public static int A00;
    public static byte[] A01;
    public static volatile LK A02;

    public static String A06(int i, int i2, int i3) {
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
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 117);
                    i4++;
                    c2 = 2;
                    break;
                case 4:
                    return new String(bArrCopyOfRange);
            }
        }
    }

    public static void A07() {
        A01 = new byte[]{23, 68, 58, 72, 69, 63, 58, 35, 55, 68, 63, 60, 59, 73, 74, 4, 78, 67, 66, 30, 26, 31, 4, 21, 28, 7, 22, 35, 36, 26, 32, 31, 13, 11, -3, 11, -59, 11, -4, 3};
    }

    static {
        A07();
        A00 = -1;
        A02 = LK.A04;
    }

    public static int A01(Context context) {
        if (A02 == LK.A04) {
            A08(context);
        }
        return A00;
    }

    @SuppressLint({"CatchGeneralException"})
    public static int A02(Context context) {
        try {
            return A05(context.getAssets().openXmlResourceParser(A06(0, 19, 97)));
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int A03(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).minSdkVersion;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @VisibleForTesting(otherwise = 2)
    public static int A05(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 0;
        char c2 = 2;
        while (true) {
            switch (c2) {
                case 2:
                    xmlPullParser = xmlPullParser;
                    if (xmlPullParser.next() == 1) {
                        c2 = '\n';
                        break;
                    } else {
                        c2 = 3;
                        break;
                    }
                case 3:
                    xmlPullParser = xmlPullParser;
                    if (xmlPullParser.getEventType() != 2) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 4;
                        break;
                    }
                case 4:
                    xmlPullParser = xmlPullParser;
                    if (!xmlPullParser.getName().equals(A06(32, 8, 35))) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 5;
                        break;
                    }
                case 5:
                    i = 0;
                    c2 = 6;
                    break;
                case 6:
                    xmlPullParser = xmlPullParser;
                    if (i >= xmlPullParser.getAttributeCount()) {
                        c2 = 2;
                        break;
                    } else {
                        c2 = 7;
                        break;
                    }
                case 7:
                    xmlPullParser = xmlPullParser;
                    if (!xmlPullParser.getAttributeName(i).equals(A06(19, 13, 60))) {
                        c2 = '\t';
                        break;
                    } else {
                        c2 = '\b';
                        break;
                    }
                case '\b':
                    return Integer.parseInt(xmlPullParser.getAttributeValue(i));
                case '\t':
                    i++;
                    c2 = 6;
                    break;
                case '\n':
                    return 0;
            }
        }
    }

    public static void A08(Context context) {
        if (A0A()) {
            return;
        }
        A09(context);
    }

    public static void A09(Context context) {
        if (A02 != LK.A04) {
            return;
        }
        A02 = LK.A03;
        Executors.newSingleThreadExecutor().execute(new C1155cg(context));
    }

    public static boolean A0A() {
        boolean z = false;
        char c2 = A02 == LK.A02 ? (char) 2 : (char) 4;
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
}
